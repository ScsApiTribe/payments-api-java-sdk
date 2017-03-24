
# PaymentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | The gross amount in Swiss Francs (CHF). Includes the VAT. Negative value represents refund. | 
**description** | **String** | The description or purpose of the payment to be shown on the bill. The description should be encoded in ISO-8859-1 charset, since those are guaranteed to be properly printed on the Swisscom bill. | 
**idempotencyKey** | **String** | The key identifier provided by the API consumer used so that the same payment transaction cannot be made twice.For example, if a request to create a charge fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single charge is created. | 
**payerId** | [**PaymentRequestPayerId**](PaymentRequestPayerId.md) |  |  [optional]
**taxRate** | [**BigDecimal**](BigDecimal.md) | Tax rate (VAT) expressed in percent. Valid values 0.0, 2.5, 8.0. Default value is 0.0 |  [optional]



