package rest.service.mignone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //GET
    // URI - /hello-world
    // Method - Hello World

    /* Otra forma de hacer el get es con esta anotacion
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }  */

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

}
