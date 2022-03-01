package org.example.homework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Auditing auditing = context.getBean("auditing",Auditing.class);
        auditing.validate("Марсель");
        context.close();
    }
}
