package com.helloworld.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

//    {"message":"hello world"}
    @GetMapping("/hellousa")
    public HelloResponse hellousa(){
        HelloResponse hellocountry = new HelloResponse();
        hellocountry.HelloResponse("English","hello!world");
        return hellocountry;
    }
    @GetMapping("/hellojapan")
    public HelloResponse hellojapan(){
        HelloResponse hellocountry = new HelloResponse();
        hellocountry.HelloResponse("Japanese","こんにちは！世界");
        return hellocountry;
    }
    @GetMapping("/hellotaiwan")
    public HelloResponse hellotaiwan(){
        HelloResponse hellocountry = new HelloResponse();
        hellocountry.HelloResponse("Chinese","你好！世界");
        return hellocountry;
    }
}
