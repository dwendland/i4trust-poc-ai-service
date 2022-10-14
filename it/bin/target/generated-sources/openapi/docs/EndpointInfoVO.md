

# EndpointInfoVO

Information about a registered endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Id of the registered endpoint. Be aware: this has no connections to ids used by NGSI-LD Api. |  [optional]
**domain** | **String** | Domain that the Endpoint will receive notifications at. |  [optional]
**port** | **Integer** | Port that the endpoint will receive notifications at. |  [optional]
**targetPort** | **Integer** | Port to contact at the actual endpoint. Can be used to overwrite the one in &#x60;port&#x60;, for example when http default port(80) should be overwritten with https(443). |  [optional]
**path** | **String** | Path that the Endpoint will receive notifications at. |  [optional]
**useHttps** | **Boolean** | Should the proxy forward the notifications via https. |  [optional]
**authType** | **AuthTypeVO** |  |  [optional]



