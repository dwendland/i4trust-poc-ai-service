# AuthConfigurationApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEndpointByDomainAndPath**](AuthConfigurationApi.md#getEndpointByDomainAndPath) | **GET** /auth | 


<a name="getEndpointByDomainAndPath"></a>
# **getEndpointByDomainAndPath**
> AuthInfoVO getEndpointByDomainAndPath(domain, path)



-| \&quot;Get the auth information for the given domain/path combination.\&quot;

### Example
```java
// Import classes:
import org.fiware.eas.ApiClient;
import org.fiware.eas.ApiException;
import org.fiware.eas.Configuration;
import org.fiware.eas.models.*;
import org.fiware.eas.api.AuthConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    AuthConfigurationApi apiInstance = new AuthConfigurationApi(defaultClient);
    String domain = "myEndpoint.com"; // String | Domain to get the information for.
    String path = "/my/endpoint/path"; // String | Path to get the infromation for.
    try {
      AuthInfoVO result = apiInstance.getEndpointByDomainAndPath(domain, path);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthConfigurationApi#getEndpointByDomainAndPath");
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
 **domain** | **String**| Domain to get the information for. |
 **path** | **String**| Path to get the infromation for. |

### Return type

[**AuthInfoVO**](AuthInfoVO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information about the configured endpoint. |  -  |

