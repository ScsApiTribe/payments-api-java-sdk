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

import com.swisscom.api.sdk.payments.ApiCallback;
import com.swisscom.api.sdk.payments.ApiClient;
import com.swisscom.api.sdk.payments.ApiException;
import com.swisscom.api.sdk.payments.ApiResponse;
import com.swisscom.api.sdk.payments.Configuration;
import com.swisscom.api.sdk.payments.Pair;
import com.swisscom.api.sdk.payments.ProgressRequestBody;
import com.swisscom.api.sdk.payments.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.swisscom.api.sdk.payments.model.PaymentRequest;
import com.swisscom.api.sdk.payments.model.Error;
import com.swisscom.api.sdk.payments.model.PaymentStatus;
import com.swisscom.api.sdk.payments.model.PaymentDetails;
import com.swisscom.api.sdk.payments.model.PaymentsCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createPayment */
    private com.squareup.okhttp.Call createPaymentCall(String sCSVersion, PaymentRequest paymentRequest, String sCSRequestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = paymentRequest;
        
        // verify the required parameter 'sCSVersion' is set
        if (sCSVersion == null) {
            throw new ApiException("Missing the required parameter 'sCSVersion' when calling createPayment(Async)");
        }
        
        // verify the required parameter 'paymentRequest' is set
        if (paymentRequest == null) {
            throw new ApiException("Missing the required parameter 'paymentRequest' when calling createPayment(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/payments".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (sCSRequestID != null)
        localVarHeaderParams.put("SCS-Request-ID", apiClient.parameterToString(sCSRequestID));
        if (sCSVersion != null)
        localVarHeaderParams.put("SCS-Version", apiClient.parameterToString(sCSVersion));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json; charset=ISO-8859-1"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_2_0_authorization_code", "oauth_2_0_client_credentials" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * #### Makes a payment transaction #### Allows to charge or refund an amount to the end user&#39;s bill. When creating a payment, specify the actual transactions details like idempotencyKey, amount and description. Please note that the description must be encoded in ISO-8859-1 charset. 
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param paymentRequest  (required)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @return PaymentStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentStatus createPayment(String sCSVersion, PaymentRequest paymentRequest, String sCSRequestID) throws ApiException {
        ApiResponse<PaymentStatus> resp = createPaymentWithHttpInfo(sCSVersion, paymentRequest, sCSRequestID);
        return resp.getData();
    }

    /**
     * 
     * #### Makes a payment transaction #### Allows to charge or refund an amount to the end user&#39;s bill. When creating a payment, specify the actual transactions details like idempotencyKey, amount and description. Please note that the description must be encoded in ISO-8859-1 charset. 
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param paymentRequest  (required)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @return ApiResponse&lt;PaymentStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentStatus> createPaymentWithHttpInfo(String sCSVersion, PaymentRequest paymentRequest, String sCSRequestID) throws ApiException {
        com.squareup.okhttp.Call call = createPaymentCall(sCSVersion, paymentRequest, sCSRequestID, null, null);
        Type localVarReturnType = new TypeToken<PaymentStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * #### Makes a payment transaction #### Allows to charge or refund an amount to the end user&#39;s bill. When creating a payment, specify the actual transactions details like idempotencyKey, amount and description. Please note that the description must be encoded in ISO-8859-1 charset. 
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param paymentRequest  (required)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createPaymentAsync(String sCSVersion, PaymentRequest paymentRequest, String sCSRequestID, final ApiCallback<PaymentStatus> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createPaymentCall(sCSVersion, paymentRequest, sCSRequestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getPayment */
    private com.squareup.okhttp.Call getPaymentCall(String paymentId, String sCSVersion, String sCSRequestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'paymentId' is set
        if (paymentId == null) {
            throw new ApiException("Missing the required parameter 'paymentId' when calling getPayment(Async)");
        }
        
        // verify the required parameter 'sCSVersion' is set
        if (sCSVersion == null) {
            throw new ApiException("Missing the required parameter 'sCSVersion' when calling getPayment(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/payments/{paymentId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "paymentId" + "\\}", apiClient.escapeString(paymentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (sCSRequestID != null)
        localVarHeaderParams.put("SCS-Request-ID", apiClient.parameterToString(sCSRequestID));
        if (sCSVersion != null)
        localVarHeaderParams.put("SCS-Version", apiClient.parameterToString(sCSVersion));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_2_0_authorization_code", "oauth_2_0_client_credentials" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * #### Returns the payment transaction details #### Allows to retrieve the details of a payment represented by the payment identifier provided as the parameter. The payment identifier is the identifier which is returned with the location header in the response for POST payment.  The payment details and the status of the payment transaction can be retrieved from the response. 
     * @param paymentId The unique identifier of a payment transaction. This is the same identifier which is returned with the location header of the response in the POST payment.  The value of the URI parameter must not contain spaces and should be URL encoded.  (required)
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @return PaymentDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentDetails getPayment(String paymentId, String sCSVersion, String sCSRequestID) throws ApiException {
        ApiResponse<PaymentDetails> resp = getPaymentWithHttpInfo(paymentId, sCSVersion, sCSRequestID);
        return resp.getData();
    }

    /**
     * 
     * #### Returns the payment transaction details #### Allows to retrieve the details of a payment represented by the payment identifier provided as the parameter. The payment identifier is the identifier which is returned with the location header in the response for POST payment.  The payment details and the status of the payment transaction can be retrieved from the response. 
     * @param paymentId The unique identifier of a payment transaction. This is the same identifier which is returned with the location header of the response in the POST payment.  The value of the URI parameter must not contain spaces and should be URL encoded.  (required)
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @return ApiResponse&lt;PaymentDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentDetails> getPaymentWithHttpInfo(String paymentId, String sCSVersion, String sCSRequestID) throws ApiException {
        com.squareup.okhttp.Call call = getPaymentCall(paymentId, sCSVersion, sCSRequestID, null, null);
        Type localVarReturnType = new TypeToken<PaymentDetails>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * #### Returns the payment transaction details #### Allows to retrieve the details of a payment represented by the payment identifier provided as the parameter. The payment identifier is the identifier which is returned with the location header in the response for POST payment.  The payment details and the status of the payment transaction can be retrieved from the response. 
     * @param paymentId The unique identifier of a payment transaction. This is the same identifier which is returned with the location header of the response in the POST payment.  The value of the URI parameter must not contain spaces and should be URL encoded.  (required)
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPaymentAsync(String paymentId, String sCSVersion, String sCSRequestID, final ApiCallback<PaymentDetails> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPaymentCall(paymentId, sCSVersion, sCSRequestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentDetails>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for searchPayments */
    private com.squareup.okhttp.Call searchPaymentsCall(String scn, String sCSVersion, String dateFrom, String dateTo, String sCSRequestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'scn' is set
        if (scn == null) {
            throw new ApiException("Missing the required parameter 'scn' when calling searchPayments(Async)");
        }
        
        // verify the required parameter 'sCSVersion' is set
        if (sCSVersion == null) {
            throw new ApiException("Missing the required parameter 'sCSVersion' when calling searchPayments(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/payments".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (scn != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "scn", scn));
        if (dateFrom != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "dateFrom", dateFrom));
        if (dateTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "dateTo", dateTo));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (sCSRequestID != null)
        localVarHeaderParams.put("SCS-Request-ID", apiClient.parameterToString(sCSRequestID));
        if (sCSVersion != null)
        localVarHeaderParams.put("SCS-Version", apiClient.parameterToString(sCSVersion));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_2_0_authorization_code", "oauth_2_0_client_credentials" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * #### Search Payment Transactions #### Provides the capability to search for payment transactions based on a customer identifier. 
     * @param scn The Swisscom customer number (SCN) that uniquely identifies a customer.  Performing the request with this query parameter returns the list of payment transactions made on the Swisscom bill of the customer represented by the identifier.  (required)
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param dateFrom Defines the date range of the returned transactions. The date has to be in format yyyy-mm-dd. (optional)
     * @param dateTo Defines the date range of the returned transactions. The date has to be in format yyyy-mm-dd. (optional)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @return PaymentsCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentsCollection searchPayments(String scn, String sCSVersion, String dateFrom, String dateTo, String sCSRequestID) throws ApiException {
        ApiResponse<PaymentsCollection> resp = searchPaymentsWithHttpInfo(scn, sCSVersion, dateFrom, dateTo, sCSRequestID);
        return resp.getData();
    }

    /**
     * 
     * #### Search Payment Transactions #### Provides the capability to search for payment transactions based on a customer identifier. 
     * @param scn The Swisscom customer number (SCN) that uniquely identifies a customer.  Performing the request with this query parameter returns the list of payment transactions made on the Swisscom bill of the customer represented by the identifier.  (required)
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param dateFrom Defines the date range of the returned transactions. The date has to be in format yyyy-mm-dd. (optional)
     * @param dateTo Defines the date range of the returned transactions. The date has to be in format yyyy-mm-dd. (optional)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @return ApiResponse&lt;PaymentsCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentsCollection> searchPaymentsWithHttpInfo(String scn, String sCSVersion, String dateFrom, String dateTo, String sCSRequestID) throws ApiException {
        com.squareup.okhttp.Call call = searchPaymentsCall(scn, sCSVersion, dateFrom, dateTo, sCSRequestID, null, null);
        Type localVarReturnType = new TypeToken<PaymentsCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * #### Search Payment Transactions #### Provides the capability to search for payment transactions based on a customer identifier. 
     * @param scn The Swisscom customer number (SCN) that uniquely identifies a customer.  Performing the request with this query parameter returns the list of payment transactions made on the Swisscom bill of the customer represented by the identifier.  (required)
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param dateFrom Defines the date range of the returned transactions. The date has to be in format yyyy-mm-dd. (optional)
     * @param dateTo Defines the date range of the returned transactions. The date has to be in format yyyy-mm-dd. (optional)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchPaymentsAsync(String scn, String sCSVersion, String dateFrom, String dateTo, String sCSRequestID, final ApiCallback<PaymentsCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchPaymentsCall(scn, sCSVersion, dateFrom, dateTo, sCSRequestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentsCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
