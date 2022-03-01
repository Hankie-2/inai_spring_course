package org.example.xmlMiner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");

        Miner miner = context.getBean("beanMiner",Miner.class);
        System.out.println(miner.getAlgorithm());
        context.close();
    }
}
