package io.entry;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @RequestMapping("/")
    public String tr(){

        return "hello springboot!";
    }



}
