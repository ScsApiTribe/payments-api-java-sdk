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


package com.swisscom.api.sdk.payments.api;

import com.swisscom.api.sdk.payments.ApiException;
import com.swisscom.api.sdk.payments.model.PaymentRequest;
import com.swisscom.api.sdk.payments.model.Error;
import com.swisscom.api.sdk.payments.model.PaymentStatus;
import com.swisscom.api.sdk.payments.model.PaymentDetails;
import com.swisscom.api.sdk.payments.model.PaymentsCollection;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * #### Makes a payment transaction #### Allows to charge or refund an amount to the end user&#39;s bill. When creating a payment, specify the actual transactions details like idempotencyKey, amount and description. Please note that the description must be encoded in ISO-8859-1 charset. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentTest() throws ApiException {
        String sCSVersion = null;
        PaymentRequest paymentRequest = null;
        String sCSRequestID = null;
        // PaymentStatus response = api.createPayment(sCSVersion, paymentRequest, sCSRequestID);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * #### Returns the payment transaction details #### Allows to retrieve the details of a payment represented by the payment identifier provided as the parameter. The payment identifier is the identifier which is returned with the location header in the response for POST payment.  The payment details and the status of the payment transaction can be retrieved from the response. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentTest() throws ApiException {
        String paymentId = null;
        String sCSVersion = null;
        String sCSRequestID = null;
        // PaymentDetails response = api.getPayment(paymentId, sCSVersion, sCSRequestID);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * #### Search Payment Transactions #### Provides the capability to search for payment transactions based on a customer identifier. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchPaymentsTest() throws ApiException {
        String scn = null;
        String sCSVersion = null;
        String dateFrom = null;
        String dateTo = null;
        String sCSRequestID = null;
        // PaymentsCollection response = api.searchPayments(scn, sCSVersion, dateFrom, dateTo, sCSRequestID);

        // TODO: test validations
    }
    
}
