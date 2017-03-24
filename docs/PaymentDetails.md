
# PaymentDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | The gross amount in Swiss Francs (CHF). Includes the VAT. Negative value represents refund. | 
**description** | **String** | The description or purpose of the payment as shown on the bill. | 
**id** | **String** | The payment transaction identifier generated from the API used to track the transaction. | 
**idempotencyKey** | **String** | The key identifier provided by the API consumer used so that the same transaction cannot be made twice.For example, if a request to create a charge fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single charge is created. |  [optional]
**paymentStatus** | **String** | Specifies the status of the payment transaction. eg: billed,accepted,error |  [optional]
**paymentStatusDetails** | **String** | Details in case the payment transaction is in error status. |  [optional]



