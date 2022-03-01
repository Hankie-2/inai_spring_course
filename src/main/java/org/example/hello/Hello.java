package org.example.hello;

import org.springframework.beans.factory.annotation.Value;

public class Hello {
 
    @Value("${hello}")
    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
