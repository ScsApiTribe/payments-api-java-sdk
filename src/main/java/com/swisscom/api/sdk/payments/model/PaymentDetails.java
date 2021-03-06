/**
 * Payments
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.swisscom.api.sdk.payments.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;


/**
 * PaymentDetails
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-01T15:57:25.433+02:00")
public class PaymentDetails   {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("idempotencyKey")
  private String idempotencyKey = null;

  @SerializedName("paymentStatus")
  private String paymentStatus = null;

  @SerializedName("paymentStatusDetails")
  private String paymentStatusDetails = null;

  public PaymentDetails amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The gross amount in Swiss Francs (CHF). Includes the VAT. Negative value represents refund.
   * @return amount
  **/
  @ApiModelProperty(example = "12.9", required = true, value = "The gross amount in Swiss Francs (CHF). Includes the VAT. Negative value represents refund.")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PaymentDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description or purpose of the payment as shown on the bill.
   * @return description
  **/
  @ApiModelProperty(example = "CRM Software", required = true, value = "The description or purpose of the payment as shown on the bill.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PaymentDetails id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The payment transaction identifier generated from the API used to track the transaction.
   * @return id
  **/
  @ApiModelProperty(example = "203bfb5e-1aea-4f95-bd1f-75e973eee7e6", required = true, value = "The payment transaction identifier generated from the API used to track the transaction.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentDetails idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * The key identifier provided by the API consumer used so that the same transaction cannot be made twice.For example, if a request to create a charge fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single charge is created.
   * @return idempotencyKey
  **/
  @ApiModelProperty(example = "REF-12345", value = "The key identifier provided by the API consumer used so that the same transaction cannot be made twice.For example, if a request to create a charge fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single charge is created.")
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  public PaymentDetails paymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * Specifies the status of the payment transaction. eg: billed,accepted,error
   * @return paymentStatus
  **/
  @ApiModelProperty(example = "error", value = "Specifies the status of the payment transaction. eg: billed,accepted,error")
  public String getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public PaymentDetails paymentStatusDetails(String paymentStatusDetails) {
    this.paymentStatusDetails = paymentStatusDetails;
    return this;
  }

   /**
   * Details in case the payment transaction is in error status.
   * @return paymentStatusDetails
  **/
  @ApiModelProperty(example = "Backend system failure.", value = "Details in case the payment transaction is in error status.")
  public String getPaymentStatusDetails() {
    return paymentStatusDetails;
  }

  public void setPaymentStatusDetails(String paymentStatusDetails) {
    this.paymentStatusDetails = paymentStatusDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDetails paymentDetails = (PaymentDetails) o;
    return Objects.equals(this.amount, paymentDetails.amount) &&
        Objects.equals(this.description, paymentDetails.description) &&
        Objects.equals(this.id, paymentDetails.id) &&
        Objects.equals(this.idempotencyKey, paymentDetails.idempotencyKey) &&
        Objects.equals(this.paymentStatus, paymentDetails.paymentStatus) &&
        Objects.equals(this.paymentStatusDetails, paymentDetails.paymentStatusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, id, idempotencyKey, paymentStatus, paymentStatusDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetails {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    paymentStatusDetails: ").append(toIndentedString(paymentStatusDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

