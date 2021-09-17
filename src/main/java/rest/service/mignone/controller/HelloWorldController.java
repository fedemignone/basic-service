package rest.service.mignone.controller;

import org.springframework.web.bind.annotation.*;
import rest.service.mignone.helloworld.HelloWorldBean;

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

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorlPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

}
