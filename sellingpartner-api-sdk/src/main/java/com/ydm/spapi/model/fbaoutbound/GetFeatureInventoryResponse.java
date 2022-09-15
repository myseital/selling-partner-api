/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ydm.spapi.model.fbaoutbound;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ydm.spapi.model.fbaoutbound.ErrorList;
import com.ydm.spapi.model.fbaoutbound.GetFeatureInventoryResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The breakdown of eligibility inventory by feature.
 */
@ApiModel(description = "The breakdown of eligibility inventory by feature.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-15T10:12:17.664+08:00")
public class GetFeatureInventoryResponse {
  @SerializedName("payload")
  private GetFeatureInventoryResult payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetFeatureInventoryResponse payload(GetFeatureInventoryResult payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(value = "")
  public GetFeatureInventoryResult getPayload() {
    return payload;
  }

  public void setPayload(GetFeatureInventoryResult payload) {
    this.payload = payload;
  }

  public GetFeatureInventoryResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the getFeatureInventory operation.
   * @return errors
  **/
  @ApiModelProperty(value = "One or more unexpected errors occurred during the getFeatureInventory operation.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFeatureInventoryResponse getFeatureInventoryResponse = (GetFeatureInventoryResponse) o;
    return Objects.equals(this.payload, getFeatureInventoryResponse.payload) &&
        Objects.equals(this.errors, getFeatureInventoryResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFeatureInventoryResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

