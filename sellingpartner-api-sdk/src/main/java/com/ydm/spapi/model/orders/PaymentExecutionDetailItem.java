/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ydm.spapi.model.orders;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ydm.spapi.model.orders.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about a sub-payment method used to pay for a COD order.
 */
@ApiModel(description = "Information about a sub-payment method used to pay for a COD order.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-15T09:58:06.477+08:00")
public class PaymentExecutionDetailItem {
  @SerializedName("Payment")
  private Money payment = null;

  @SerializedName("PaymentMethod")
  private String paymentMethod = null;

  public PaymentExecutionDetailItem payment(Money payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @ApiModelProperty(required = true, value = "")
  public Money getPayment() {
    return payment;
  }

  public void setPayment(Money payment) {
    this.payment = payment;
  }

  public PaymentExecutionDetailItem paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * A sub-payment method for a COD order.  Possible values:  * COD - Cash On Delivery.  * GC - Gift Card.  * PointsAccount - Amazon Points.
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "A sub-payment method for a COD order.  Possible values:  * COD - Cash On Delivery.  * GC - Gift Card.  * PointsAccount - Amazon Points.")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentExecutionDetailItem paymentExecutionDetailItem = (PaymentExecutionDetailItem) o;
    return Objects.equals(this.payment, paymentExecutionDetailItem.payment) &&
        Objects.equals(this.paymentMethod, paymentExecutionDetailItem.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, paymentMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentExecutionDetailItem {\n");
    
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

