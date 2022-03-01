package org.example.javaMiner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Algorithm ethash = context.getBean("ethashBean",Algorithm.class);
        System.out.println(ethash.hash());

        Algorithm sha256 = context.getBean("sha256Bean",Algorithm.class);
        System.out.println(sha256.hash());
        context.close();
    }
}
