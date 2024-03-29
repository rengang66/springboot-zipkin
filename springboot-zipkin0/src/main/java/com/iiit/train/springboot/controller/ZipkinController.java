package com.iiit.train.springboot.controller;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipkinController {
    @Autowired
    private CloseableHttpClient httpClient;

    @GetMapping("/service0")
    public String service() throws Exception {
        Thread.sleep(100);
        HttpGet get = new HttpGet("http://127.0.0.1:8081/service1");
        CloseableHttpResponse response = httpClient.execute(get);
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }
}
