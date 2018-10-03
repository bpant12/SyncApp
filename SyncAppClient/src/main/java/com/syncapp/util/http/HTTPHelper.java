/*
 *    Copyright 2018 Bhupesh Pant
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.syncapp.util.http;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/**
 * Created by bhupesh pant on 5/16/2018.
 */

public class HTTPHelper {

    private HttpClient httpClient;

    /**
     *
     * @param URI
     * @param httpMethod
     * @param requestHeaders
     * @param requestBody
     * @param queryParams
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws URISyntaxException
     */
    public void execute(String URI, String httpMethod, Map<String,String> requestHeaders, String requestBody, Map<String, String> queryParams) throws IOException, NoSuchAlgorithmException, KeyManagementException, URISyntaxException, Exception{
        httpClient = new HTTPBinding().httpClient();
        HttpEntity   requestEntity = new StringEntity(requestBody, ContentType.APPLICATION_JSON);
        HttpResponse response = null;
        switch (httpMethod) {
            case "POST":
                response = post(URI, requestEntity, requestHeaders);
                break;
            case "PUT":
                response = put(URI, requestEntity, requestHeaders);
                break;
            case "GET":
                response = get(URI, requestHeaders, queryParams);
                break;
        }

        int statusCode = response.getStatusLine().getStatusCode();
        String responseString = response.getEntity() == null ? null : EntityUtils.toString(response.getEntity(), HTTP.UTF_8);
    }


    public HttpResponse post(String URI, HttpEntity requestEntity, Map<String, String> headers) throws IOException,
            NoSuchAlgorithmException, KeyManagementException {
        HttpPost httpPost = new HttpPost(URI);
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            httpPost.setHeader(entry.getKey(), entry.getValue());
        }
        httpPost.setEntity(requestEntity);
        System.out.println("Request-->"+httpPost+",Request Headers-->"+headers);
        HttpResponse response = httpClient.execute(httpPost);
        System.out.println("Response-->"+response);
        return response;
    }

    public HttpResponse put(String URI, HttpEntity requestEntity, Map<String, String> headers) throws IOException,
            NoSuchAlgorithmException, KeyManagementException {
        HttpPut httpPut = new HttpPut(URI);
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                httpPut.setHeader(entry.getKey(), entry.getValue());
            }
        }
        httpPut.setEntity(requestEntity);
        System.out.println("Request-->"+requestEntity +",Request Headers-->"+headers);
        HttpResponse response = httpClient.execute(httpPut);
        return response;
    }

    public HttpResponse get(String uri, Map<String, String> headers, Map<String, String> queryParams) throws IOException, URISyntaxException,Exception {
        httpClient = new HTTPBinding().httpClient();
        URIBuilder builder = new URIBuilder(uri);
        if (queryParams != null) {
            for (Map.Entry<String, String> entry : queryParams.entrySet()) {
                builder.addParameter(entry.getKey(), entry.getValue());
            }
        }
        URI finalUri = builder.build();
        HttpGet httpGet = new HttpGet(finalUri);
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                httpGet.setHeader(entry.getKey(), entry.getValue());
            }
        }
        System.out.println("Request-->"+httpGet);
        HttpResponse response = httpClient.execute(httpGet);
        return response;
    }
}
