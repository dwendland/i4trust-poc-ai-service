# Proof-of-Concept: AI Service
Implementation of a Proof-of-Concept of an AI service provisioned on a marketplace using i4Trust technologies

## Introduction
The aim of this PoC is to allow an AI service provider to offer a service on a public marketplace, where a service consuming party can acquire access to this offer, inject input data into it and receive predictions resulting from the inference with a trained AI model.

The AI service is providing real-time prediction and by means of having a Context Broker deployed in the offered service, the data provisioning will be in real-time from the data source(s) to the AI model and respectively publishing the results of the predictions to the consumer application via a Context Broker on the consumer side. 

## Architecture
This PoC implements the following architecture: 

![architecture](/doc/Architecture%20diagrams-Usage%20of%20AI%20service.jpg)

The architecture below illustrates the environments corresponding to each participant and the components that are used to enable the real-time inference.

**Use case:** Prediction of animal activity (e.g grazing, walking, stand-up,..) based on its x, y, z coordinates and the observed ambient temperature.

# Docker setup 

TODO


# Subscriptions setup

The main goal of te subscription is to allow the automated data exchange between the participants on particular attributes. That will enable the real-time AI inference. 

In this use case, there are three subscriptions to be setup: 

* **Subscription 1:**  Smart Shepherd Inc. subscribes to the Context Broker of Happy Cattle Co. to receive in an automated way animal coordinates update in its Context Broker by means of a Notification Proxy 

```shell
   curl -v --location POST 'localhost:1029/ngsi-ld/v1/subscriptions/' \
      --header 'Content-Type: application/json' \
      --data-raw ' {
         "description":"Notify me of new animal coordinates",
         "type":"Subscription",
         "name":"animalCoordinatesSubscription",
         "entities":[
            {
               "type":"Animal"
            }
         ],
         "watchedAttributes":["location"],
         "notification":{
            "attributes":["location"],
            "endpoint":{
               "uri":"http://ai.notification-proxy.docker:8080/notification",
               "accept":"application/json"
            }
         }
      }'
  ```
* **Subscription 2:** Smart Shepherd Inc. AI service subscribes to the Context Broker in its own environment, to receive at the notification endpoint the coordinates once it is updated due to subscription 1. That will trigger the calculation of the prediction which also relies on getting temerature data. 

```shell
   curl -v --location POST 'localhost:1028/ngsi-ld/v1/subscriptions/' \
      --header 'Content-Type: application/json' \
      --data-raw ' {
         "description":"Notify AI service of new animal coordinates",
         "type":"Subscription",
         "name":"animalCoordinatesSubscription",
         "entities":[
            {
               "type":"Animal"
            }
         ],
         "watchedAttributes":["location"],
         "notification":{
            "attributes":["location"],
            "endpoint":{
               "uri":"http://apis.docker:5000/notification",
               "accept":"application/json"
            }
         }
      }'
  ```

* **Subscription 3:** Happy Cattle Co. subscribes to receive predictions updates (after inference) from the Context Broker of Smart Shepherd Inc. by means of a Notification Proxy 

```shell
   curl -v --location POST 'localhost:1028/ngsi-ld/v1/subscriptions/' \
      --header 'Content-Type: application/json' \
      --data-raw ' {
         "description":"Notify me of new animal activity prediction",
         "type":"Subscription",
         "name":"predictionSubscription",
         "entities":[
            {
               "type":"Animal"
            }
         ],
         "watchedAttributes":["animalActivity"],
         "notification":{
            "attributes":["animalActivity"],
            "endpoint":{
               "uri":"http://farm.notification-proxy.docker:8081/notification",
               "accept":"application/json"
            }
         }
      }'
  ```

# Example of usage 

* Create a TemperatureSensor entity at the Context Broker of Real Time Weather: 

```shell
   curl -v --location POST 'localhost:1026/ngsi-ld/v1/entities' \
      --header 'Content-Type: application/json' \
      --data-raw '{
         "id":"urn:ngsi-ld:TemperatureSensor:001",
         "type":"TemperatureSensor",
         "dateObserved":{
            "type":"Property",
            "value":"2016-11-30T07:00:00.00Z"
         },
         "temperature":{
            "type":"Property",
            "value":17
         }
      }'
```

* Create an Animal entity at the Contect Broker of Happy Cattle:
```shell
   curl -v --location POST 'localhost:1029/ngsi-ld/v1/entities' \
      --header 'Content-Type: application/json' \
      --data-raw '{
         "id":"urn:ngsi-ld:Animal:0001",
         "type":"Animal",
         "species":{
            "type":"Property",
            "value":"cow"
         },
         "location":{
            "type":"GeoProperty",
            "value":{
               "type":"Point",
               "coordinates":[
                  3.165,
                  2.6133,
                  -1.4292
               ]
            }
         }
      }'
```

* Query Smart Shepherd Broker: 
```shell
   curl --location --request GET 'localhost:1028/ngsi-ld/v1/entities/urn:ngsi-ld:Animal:0001'
``` 

Here you should have as a result an entity of type Animal created in the Context Broker of Smart Shepherd, due to subscription 1.



* Update a property in the Context Broker of Happy Cattle: 
```shell
   curl -v --location POST 'localhost:1029/ngsi-ld/v1/entities/urn:ngsi-ld:Animal:0001/attrs' \
      --header 'Content-Type: application/json' \
      --data-raw '{
         "location":{
            "type":"GeoProperty",
            "value":{
               "type":"Point",
               "coordinates":[
                  7.165,
                  3.6133,
                  -1.1292
               ]
            }
         }
      }'
```

After creating the entities or updating them, everytime this process triggers the prediction calculation, first the results are updates in the Context Broker of Smart Shepherd (see entity: AnimalActivity) and then due to subscription 3, this new entity AnimalActiviy is updated in the Context Broker of Happy Cattle.  

* Query the Broker of Smart Shepherd:
 ```shell
   curl --location --request GET 'localhost:1028/ngsi-ld/v1/entities/urn:ngsi-ld:Animal:0001'
 ``` 

 Result: 

 ```
 {"@context":"https://uri.etsi.org/ngsi-ld/v1/ngsi-ld-core-context.jsonld","id":"urn:ngsi-ld:Animal:0001","type":"Animal","location":{"value":{"type":"Point","coordinates":[4.165,3.6133,-1.1292]},"type":"GeoProperty"},"animalActivity":{"value":"Sternal lying","type":"Property"}} 
 ```

* Query the Broker of Happy Cattle:
 ```shell
   curl --location --request GET 'localhost:1029/ngsi-ld/v1/entities/urn:ngsi-ld:Animal:0001'
 ``` 

 Result: 

 ```
 {"@context":"https://uri.etsi.org/ngsi-ld/v1/ngsi-ld-core-context.jsonld","id":"urn:ngsi-ld:Animal:0001","type":"Animal","location":{"value":{"type":"Point","coordinates":[4.165,3.6133,-1.1292]},"type":"GeoProperty"},"animalActivity":{"value":"Sternal lying","type":"Property"}} 
 ```


