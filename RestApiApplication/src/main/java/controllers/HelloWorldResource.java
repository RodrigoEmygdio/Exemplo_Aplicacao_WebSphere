package controllers;


import org.example.services.HelloServices;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/helloWorld")
public class HelloWorldResource {

    @Inject
    HelloServices helloServices;

    @GET
    public String sayHelloWorld(){
        return  helloServices.sayHello();
    }
}
