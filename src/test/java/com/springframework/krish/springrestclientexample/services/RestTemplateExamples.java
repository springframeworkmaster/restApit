package com.springframework.krish.springrestclientexample.services;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class RestTemplateExamples {

    public static final String API_ROOT = "https://api.predic8.de:443/shop/";

    @Test
    public void getCategories() throws Exception{

        String apiUrl = API_ROOT + "/categories/";

        RestTemplate restTemplate = new RestTemplate();

        JsonNode jsonNode = restTemplate.getForObject(apiUrl,JsonNode.class);

        System.out.println("Response");;
        System.out.println(jsonNode.toString());
    }
}
