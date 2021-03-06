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
import com.swisscom.api.sdk.payments.model.PaymentRequestPayerId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;


/**
 * PaymentRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-01T15:57:25.433+02:00")
public class PaymentRequest   {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("idempotencyKey")
  private String idempotencyKey = null;

  @SerializedName("payerId")
  private PaymentRequestPayerId payerId = null;

  @SerializedName("taxRate")
  private BigDecimal taxRate = null;

  public PaymentRequest amount(BigDecimal amount) {
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

  public PaymentRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description or purpose of the payment to be shown on the bill. The description should be encoded in ISO-8859-1 charset, since those are guaranteed to be properly printed on the Swisscom bill.
   * @return description
  **/
  @ApiModelProperty(example = "CRM Software", required = true, value = "The description or purpose of the payment to be shown on the bill. The description should be encoded in ISO-8859-1 charset, since those are guaranteed to be properly printed on the Swisscom bill.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PaymentRequest idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * The key identifier provided by the API consumer used so that the same payment transaction cannot be made twice.For example, if a request to create a charge fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single charge is created.
   * @return idempotencyKey
  **/
  @ApiModelProperty(example = "REF-12345", required = true, value = "The key identifier provided by the API consumer used so that the same payment transaction cannot be made twice.For example, if a request to create a charge fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single charge is created.")
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  public PaymentRequest payerId(PaymentRequestPayerId payerId) {
    this.payerId = payerId;
    return this;
  }

   /**
   * Get payerId
   * @return payerId
  **/
  @ApiModelProperty(example = "null", value = "")
  public PaymentRequestPayerId getPayerId() {
    return payerId;
  }

  public void setPayerId(PaymentRequestPayerId payerId) {
    this.payerId = payerId;
  }

  public PaymentRequest taxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Tax rate (VAT) expressed in percent. Valid values 0.0, 2.5, 8.0. Default value is 0.0
   * @return taxRate
  **/
  @ApiModelProperty(example = "8.0", value = "Tax rate (VAT) expressed in percent. Valid values 0.0, 2.5, 8.0. Default value is 0.0")
  public BigDecimal getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequest paymentRequest = (PaymentRequest) o;
    return Objects.equals(this.amount, paymentRequest.amount) &&
        Objects.equals(this.description, paymentRequest.description) &&
        Objects.equals(this.idempotencyKey, paymentRequest.idempotencyKey) &&
        Objects.equals(this.payerId, paymentRequest.payerId) &&
        Objects.equals(this.taxRate, paymentRequest.taxRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, idempotencyKey, payerId, taxRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequest {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    payerId: ").append(toIndentedString(payerId)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
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

