package org.example.hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");
        Hello hello = context.getBean("sayHello",Hello.class);

        System.out.println(hello.getHello());

        context.registerShutdownHook();



    }
}
