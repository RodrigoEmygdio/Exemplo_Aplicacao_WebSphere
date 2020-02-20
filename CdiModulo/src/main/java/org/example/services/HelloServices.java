package org.example.services;

import javax.inject.Named;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class HelloServices implements Serializable {
    public HelloServices() {
    }

    public String sayHello(){
        return "Hello World";
    }
}
