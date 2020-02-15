package controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/helloWorld")
public class HelloWorldResource {

    @GET
    public String sayHelloWorld(){
        return  "Hello World";
    }
}
