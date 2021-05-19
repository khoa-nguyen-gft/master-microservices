package master.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import master.microservices.bean.HelloWordBean;

@RestController
public class HelloworldController {

    
    @GetMapping(path = "/hello-bean")
    public HelloWordBean name() {
        return new HelloWordBean("first controller");
    }
}
