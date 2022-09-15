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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The shipping method used for the fulfillment order.
 */
@JsonAdapter(ShippingSpeedCategory.Adapter.class)
public enum ShippingSpeedCategory {
  
  STANDARD("Standard"),
  
  EXPEDITED("Expedited"),
  
  PRIORITY("Priority"),
  
  SCHEDULEDDELIVERY("ScheduledDelivery");

  private String value;

  ShippingSpeedCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ShippingSpeedCategory fromValue(String text) {
    for (ShippingSpeedCategory b : ShippingSpeedCategory.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ShippingSpeedCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final ShippingSpeedCategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ShippingSpeedCategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ShippingSpeedCategory.fromValue(String.valueOf(value));
    }
  }
}

