package com.helloworld.helloworld;

import java.util.HashMap;
import java.util.Map;

public class HelloResponse {
    private Map<String,String> country;
    public void HelloResponse(String language,String greetings){
        Map<String,String> data = new HashMap<>();
        data.put(language,greetings);
        this.country= data;
    }
     public Map<String, String> getCountry() {
        return country;
    }
}
