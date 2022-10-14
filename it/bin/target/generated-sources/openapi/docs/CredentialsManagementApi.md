# CredentialsManagementApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCredentials**](CredentialsManagementApi.md#deleteCredentials) | **DELETE** /credentials/{clientId} | 
[**getCredentialsList**](CredentialsManagementApi.md#getCredentialsList) | **GET** /credentials | 
[**postCredentials**](CredentialsManagementApi.md#postCredentials) | **POST** /credentials/{clientId} | 
[**putCertificateChain**](CredentialsManagementApi.md#putCertificateChain) | **PUT** /credentials/{clientId}/certificateChain | 
[**putSigningKey**](CredentialsManagementApi.md#putSigningKey) | **PUT** /credentials/{clientId}/signingKey | 


<a name="deleteCredentials"></a>
# **deleteCredentials**
> deleteCredentials(clientId)



Delete the client-credentials for the given id.

### Example
```java
// Import classes:
import org.fiware.credentials.ApiClient;
import org.fiware.credentials.ApiException;
import org.fiware.credentials.Configuration;
import org.fiware.credentials.models.*;
import org.fiware.credentials.api.CredentialsManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CredentialsManagementApi apiInstance = new CredentialsManagementApi(defaultClient);
    String clientId = "clientId_example"; // String | Id of the client.
    try {
      apiInstance.deleteCredentials(clientId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsManagementApi#deleteCredentials");
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
 **clientId** | **String**| Id of the client. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The client was successfully removed. |  -  |
**404** | No such client exists. |  -  |

<a name="getCredentialsList"></a>
# **getCredentialsList**
> List&lt;String&gt; getCredentialsList()



Get all clientIds that have credentials configured.

### Example
```java
// Import classes:
import org.fiware.credentials.ApiClient;
import org.fiware.credentials.ApiException;
import org.fiware.credentials.Configuration;
import org.fiware.credentials.models.*;
import org.fiware.credentials.api.CredentialsManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CredentialsManagementApi apiInstance = new CredentialsManagementApi(defaultClient);
    try {
      List<String> result = apiInstance.getCredentialsList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsManagementApi#getCredentialsList");
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

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of clientIds. |  -  |

<a name="postCredentials"></a>
# **postCredentials**
> postCredentials(clientId, ishareCredentialsVO)



Create a new endpoint configuration.

### Example
```java
// Import classes:
import org.fiware.credentials.ApiClient;
import org.fiware.credentials.ApiException;
import org.fiware.credentials.Configuration;
import org.fiware.credentials.models.*;
import org.fiware.credentials.api.CredentialsManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CredentialsManagementApi apiInstance = new CredentialsManagementApi(defaultClient);
    String clientId = "clientId_example"; // String | Id of the client.
    IShareCredentialsVO ishareCredentialsVO = new IShareCredentialsVO(); // IShareCredentialsVO | 
    try {
      apiInstance.postCredentials(clientId, ishareCredentialsVO);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsManagementApi#postCredentials");
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
 **clientId** | **String**| Id of the client. |
 **ishareCredentialsVO** | [**IShareCredentialsVO**](IShareCredentialsVO.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created. |  -  |
**400** | Received an invalid credentials definition. |  -  |
**409** | Client already exists. |  -  |

<a name="putCertificateChain"></a>
# **putCertificateChain**
> putCertificateChain(clientId, body)



Update the certificate chain for a given client.

### Example
```java
// Import classes:
import org.fiware.credentials.ApiClient;
import org.fiware.credentials.ApiException;
import org.fiware.credentials.Configuration;
import org.fiware.credentials.models.*;
import org.fiware.credentials.api.CredentialsManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CredentialsManagementApi apiInstance = new CredentialsManagementApi(defaultClient);
    String clientId = "clientId_example"; // String | Id of the client.
    String body = "body_example"; // String | 
    try {
      apiInstance.putCertificateChain(clientId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsManagementApi#putCertificateChain");
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
 **clientId** | **String**| Id of the client. |
 **body** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The certificate chain was successfully updated. |  -  |
**404** | No such client exists. |  -  |

<a name="putSigningKey"></a>
# **putSigningKey**
> putSigningKey(clientId, body)



Update the certificate chain for a given client.

### Example
```java
// Import classes:
import org.fiware.credentials.ApiClient;
import org.fiware.credentials.ApiException;
import org.fiware.credentials.Configuration;
import org.fiware.credentials.models.*;
import org.fiware.credentials.api.CredentialsManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CredentialsManagementApi apiInstance = new CredentialsManagementApi(defaultClient);
    String clientId = "clientId_example"; // String | Id of the client.
    String body = "body_example"; // String | 
    try {
      apiInstance.putSigningKey(clientId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsManagementApi#putSigningKey");
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
 **clientId** | **String**| Id of the client. |
 **body** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The signing key was successfully updated. |  -  |
**404** | No such client exists. |  -  |

