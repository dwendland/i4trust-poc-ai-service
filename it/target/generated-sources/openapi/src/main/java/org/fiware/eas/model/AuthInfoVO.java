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
import java.util.HashMap;
import java.util.Map;
import org.fiware.eas.model.AuthTypeVO;

/**
 * -| \&quot;Authentication information to be used by the providers. Its a generic object that needs to be defined for each auth-type.\&quot;
 */
@ApiModel(description = "-| \"Authentication information to be used by the providers. Its a generic object that needs to be defined for each auth-type.\"")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-14T13:33:12.983718+02:00[Europe/Berlin]")
public class AuthInfoVO extends HashMap<String, Object> {
  public static final String SERIALIZED_NAME_AUTH_TYPE = "authType";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private AuthTypeVO authType;

  public AuthInfoVO() { 
  }

  public AuthInfoVO authType(AuthTypeVO authType) {
    
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
    AuthInfoVO authInfo = (AuthInfoVO) o;
    return Objects.equals(this.authType, authInfo.authType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthInfoVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
