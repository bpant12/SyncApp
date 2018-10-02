package com.syncapp.util.http;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContexts;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by bhupesh pant on 5/16/2018.
 */
@Configuration
public class HTTPBinding {

    public HttpClient httpClient() throws NoSuchAlgorithmException, KeyManagementException {

        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(10000)
                .setSocketTimeout(541000)
                .build();

        CloseableHttpClient httpClient = HttpClients.custom()
                .setConnectionReuseStrategy(new NoConnectionReuseStrategy())
                .setConnectionManager(connectionManager())
                .setDefaultRequestConfig(requestConfig)
                .setRetryHandler(noRequestRetryHandler())
                .build();

        return httpClient;
    }


    public PoolingHttpClientConnectionManager connectionManager() throws NoSuchAlgorithmException, KeyManagementException {
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(connectionSocketFactoryRegistry());
        connectionManager.setDefaultMaxPerRoute(12000);
        connectionManager.setMaxTotal(12000);
        connectionManager.setDefaultSocketConfig(socketConfig());
        return connectionManager;
    }

    public SocketConfig socketConfig() {
        return SocketConfig.custom()
                .setSoLinger(1)
                .setTcpNoDelay(true)
                .build();
    }

    public ConnectionSocketFactory connectionSocketFactory() {
        return PlainConnectionSocketFactory.getSocketFactory();
    }


    public Registry<ConnectionSocketFactory> connectionSocketFactoryRegistry() throws KeyManagementException, NoSuchAlgorithmException {
        return RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", connectionSocketFactory())
                .register("https", layeredConnectionSocketFactory())
                .build();
    }

    public SSLContext sslContext() throws KeyManagementException, NoSuchAlgorithmException {
        return SSLContexts.custom().useProtocol("TLS").build();
    }

    @Bean
    public LayeredConnectionSocketFactory layeredConnectionSocketFactory() throws NoSuchAlgorithmException, KeyManagementException {
        return new SSLConnectionSocketFactory(sslContext().getSocketFactory(), new String[]{"TLSv1", "TLSv1.1", "TLSv1.2"}, null,
                SSLConnectionSocketFactory.getDefaultHostnameVerifier());
    }

    public HttpRequestRetryHandler noRequestRetryHandler() {
        return new DefaultHttpRequestRetryHandler(0, false);
    }

}
