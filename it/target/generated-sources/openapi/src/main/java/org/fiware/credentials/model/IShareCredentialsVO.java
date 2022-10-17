/*
 * iShare Credentials Management API
 * This spec provides the credentials management api for the iShare auth-provider.
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: stefan.wiedemann@fiware.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.fiware.credentials.model;

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

/**
 * Credentials to be used for the iShare client.
 */
@ApiModel(description = "Credentials to be used for the iShare client.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-14T22:07:48.002254+02:00[Europe/Berlin]")
public class IShareCredentialsVO {
  public static final String SERIALIZED_NAME_CERTIFICATE_CHAIN = "certificateChain";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_CHAIN)
  private String certificateChain;

  public static final String SERIALIZED_NAME_SIGNING_KEY = "signingKey";
  @SerializedName(SERIALIZED_NAME_SIGNING_KEY)
  private String signingKey;

  public IShareCredentialsVO() { 
  }

  public IShareCredentialsVO certificateChain(String certificateChain) {
    
    this.certificateChain = certificateChain;
    return this;
  }

   /**
   * Certificate chain to be used in the x5c-header. Needs to be in pkcs12-cer format.
   * @return certificateChain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Certificate chain to be used in the x5c-header. Needs to be in pkcs12-cer format.")

  public String getCertificateChain() {
    return certificateChain;
  }


  public void setCertificateChain(String certificateChain) {
    this.certificateChain = certificateChain;
  }


  public IShareCredentialsVO signingKey(String signingKey) {
    
    this.signingKey = signingKey;
    return this;
  }

   /**
   * Signing key to be used for the iShare JWT. Needs to be in pk8 format.
   * @return signingKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Signing key to be used for the iShare JWT. Needs to be in pk8 format.")

  public String getSigningKey() {
    return signingKey;
  }


  public void setSigningKey(String signingKey) {
    this.signingKey = signingKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IShareCredentialsVO ishareCredentials = (IShareCredentialsVO) o;
    return Objects.equals(this.certificateChain, ishareCredentials.certificateChain) &&
        Objects.equals(this.signingKey, ishareCredentials.signingKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateChain, signingKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IShareCredentialsVO {\n");
    sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
    sb.append("    signingKey: ").append(toIndentedString(signingKey)).append("\n");
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

