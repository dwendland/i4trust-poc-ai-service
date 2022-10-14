# EndpointConfigurationApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEndpoint**](EndpointConfigurationApi.md#createEndpoint) | **POST** /endpoint | 
[**deleteEndpoint**](EndpointConfigurationApi.md#deleteEndpoint) | **DELETE** /endpoint/{id} | 
[**getEndpointInfo**](EndpointConfigurationApi.md#getEndpointInfo) | **GET** /endpoint/{id} | 
[**getEndpoints**](EndpointConfigurationApi.md#getEndpoints) | **GET** /endpoint | 
[**updateCredentialConfiguration**](EndpointConfigurationApi.md#updateCredentialConfiguration) | **PUT** /endpoint/{id}/{credential} | 


<a name="createEndpoint"></a>
# **createEndpoint**
> createEndpoint(endpointRegistrationVO)



Create a new endpoint configuration.

### Example
```java
// Import classes:
import org.fiware.eas.ApiClient;
import org.fiware.eas.ApiException;
import org.fiware.eas.Configuration;
import org.fiware.eas.models.*;
import org.fiware.eas.api.EndpointConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    EndpointConfigurationApi apiInstance = new EndpointConfigurationApi(defaultClient);
    EndpointRegistrationVO endpointRegistrationVO = new EndpointRegistrationVO(); // EndpointRegistrationVO | 
    try {
      apiInstance.createEndpoint(endpointRegistrationVO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointConfigurationApi#createEndpoint");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointRegistrationVO** | [**EndpointRegistrationVO**](EndpointRegistrationVO.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created. Will return the endpoint id in the location header. |  -  |
**400** | Received an invalid registration. |  -  |
**409** | Registration already exists. |  -  |

<a name="deleteEndpoint"></a>
# **deleteEndpoint**
> deleteEndpoint(id)



Delete the endpoint for the given id.

### Example
```java
// Import classes:
import org.fiware.eas.ApiClient;
import org.fiware.eas.ApiException;
import org.fiware.eas.Configuration;
import org.fiware.eas.models.*;
import org.fiware.eas.api.EndpointConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    EndpointConfigurationApi apiInstance = new EndpointConfigurationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Id of the registered endpoint.
    try {
      apiInstance.deleteEndpoint(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointConfigurationApi#deleteEndpoint");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Id of the registered endpoint. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The endpoint was successfully removed. |  -  |
**404** | No such endpoint exists. |  -  |

<a name="getEndpointInfo"></a>
# **getEndpointInfo**
> EndpointInfoVO getEndpointInfo(id)



Return the endpoint information for the given id.

### Example
```java
// Import classes:
import org.fiware.eas.ApiClient;
import org.fiware.eas.ApiException;
import org.fiware.eas.Configuration;
import org.fiware.eas.models.*;
import org.fiware.eas.api.EndpointConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    EndpointConfigurationApi apiInstance = new EndpointConfigurationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Id of the registered endpoint.
    try {
      EndpointInfoVO result = apiInstance.getEndpointInfo(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointConfigurationApi#getEndpointInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Id of the registered endpoint. |

### Return type

[**EndpointInfoVO**](EndpointInfoVO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The information about the endpoint. |  -  |
**404** | No such endpoint exists. |  -  |

<a name="getEndpoints"></a>
# **getEndpoints**
> List&lt;EndpointInfoVO&gt; getEndpoints()



Get all configured endpoints.

### Example
```java
// Import classes:
import org.fiware.eas.ApiClient;
import org.fiware.eas.ApiException;
import org.fiware.eas.Configuration;
import org.fiware.eas.models.*;
import org.fiware.eas.api.EndpointConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    EndpointConfigurationApi apiInstance = new EndpointConfigurationApi(defaultClient);
    try {
      List<EndpointInfoVO> result = apiInstance.getEndpoints();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointConfigurationApi#getEndpoints");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EndpointInfoVO&gt;**](EndpointInfoVO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of endpoints. |  -  |

<a name="updateCredentialConfiguration"></a>
# **updateCredentialConfiguration**
> updateCredentialConfiguration(id, credential, body)



Update credential related configuration for a given endpoint.

### Example
```java
// Import classes:
import org.fiware.eas.ApiClient;
import org.fiware.eas.ApiException;
import org.fiware.eas.Configuration;
import org.fiware.eas.models.*;
import org.fiware.eas.api.EndpointConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    EndpointConfigurationApi apiInstance = new EndpointConfigurationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Id of the registered endpoint.
    String credential = "credential_example"; // String | The credential(part) to be updated. In case of iShare this could be signingKey or certificateChain for example.
    String body = "body_example"; // String | 
    try {
      apiInstance.updateCredentialConfiguration(id, credential, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointConfigurationApi#updateCredentialConfiguration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Id of the registered endpoint. |
 **credential** | **String**| The credential(part) to be updated. In case of iShare this could be signingKey or certificateChain for example. |
 **body** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The credential was successfully updated. |  -  |
**404** | No such endpoint or credential exists. |  -  |

