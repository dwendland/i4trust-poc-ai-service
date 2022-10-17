/*
 * Endpoint Configuration API
 * This spec provides the configuration-api for the endpoint-auth-sidecar.
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: stefan.wiedemann@fiware.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.fiware.eas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.fiware.eas.model.AuthTypeVO;

/**
 * Information about a registered endpoint.
 */
@ApiModel(description = "Information about a registered endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-14T22:07:47.821858+02:00[Europe/Berlin]")
public class EndpointInfoVO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_TARGET_PORT = "targetPort";
  @SerializedName(SERIALIZED_NAME_TARGET_PORT)
  private Integer targetPort;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path = "/";

  public static final String SERIALIZED_NAME_USE_HTTPS = "useHttps";
  @SerializedName(SERIALIZED_NAME_USE_HTTPS)
  private Boolean useHttps = false;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "authType";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private AuthTypeVO authType;

  public EndpointInfoVO() { 
  }

  public EndpointInfoVO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the registered endpoint. Be aware: this has no connections to ids used by NGSI-LD Api.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bf1957ad-d69e-4b81-ba84-599091a03150", value = "Id of the registered endpoint. Be aware: this has no connections to ids used by NGSI-LD Api.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public EndpointInfoVO domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Domain that the Endpoint will receive notifications at.
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "myEndpoint.com", value = "Domain that the Endpoint will receive notifications at.")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public EndpointInfoVO port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Port that the endpoint will receive notifications at.
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Port that the endpoint will receive notifications at.")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public EndpointInfoVO targetPort(Integer targetPort) {
    
    this.targetPort = targetPort;
    return this;
  }

   /**
   * Port to contact at the actual endpoint. Can be used to overwrite the one in &#x60;port&#x60;, for example when http default port(80) should be overwritten with https(443).
   * @return targetPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Port to contact at the actual endpoint. Can be used to overwrite the one in `port`, for example when http default port(80) should be overwritten with https(443).")

  public Integer getTargetPort() {
    return targetPort;
  }


  public void setTargetPort(Integer targetPort) {
    this.targetPort = targetPort;
  }


  public EndpointInfoVO path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path that the Endpoint will receive notifications at.
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/notification/receive", value = "Path that the Endpoint will receive notifications at.")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public EndpointInfoVO useHttps(Boolean useHttps) {
    
    this.useHttps = useHttps;
    return this;
  }

   /**
   * Should the proxy forward the notifications via https.
   * @return useHttps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Should the proxy forward the notifications via https.")

  public Boolean getUseHttps() {
    return useHttps;
  }


  public void setUseHttps(Boolean useHttps) {
    this.useHttps = useHttps;
  }


  public EndpointInfoVO authType(AuthTypeVO authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthTypeVO getAuthType() {
    return authType;
  }


  public void setAuthType(AuthTypeVO authType) {
    this.authType = authType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointInfoVO endpointInfo = (EndpointInfoVO) o;
    return Objects.equals(this.id, endpointInfo.id) &&
        Objects.equals(this.domain, endpointInfo.domain) &&
        Objects.equals(this.port, endpointInfo.port) &&
        Objects.equals(this.targetPort, endpointInfo.targetPort) &&
        Objects.equals(this.path, endpointInfo.path) &&
        Objects.equals(this.useHttps, endpointInfo.useHttps) &&
        Objects.equals(this.authType, endpointInfo.authType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, domain, port, targetPort, path, useHttps, authType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointInfoVO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    useHttps: ").append(toIndentedString(useHttps)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

