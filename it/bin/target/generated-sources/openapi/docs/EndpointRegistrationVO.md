

# EndpointRegistrationVO

Information about a Endpoint to be registered.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **String** | Domain that the endpoint will receive notifications at. | 
**port** | **Integer** | Port that the endpoint will receive notifications at. |  [optional]
**targetPort** | **Integer** | Port to contact at the actual endpoint. Can be used to overwrite the one in &#x60;port&#x60;, for example when http default port(80) should be overwritten with https(443). |  [optional]
**path** | **String** | Path that the endpoint will receive notifications at. |  [optional]
**useHttps** | **Boolean** | Should the proxy forward the notification via https. |  [optional]
**authType** | **AuthTypeVO** |  | 
**authCredentials** | [**AuthCredentialsVO**](AuthCredentialsVO.md) |  | 



