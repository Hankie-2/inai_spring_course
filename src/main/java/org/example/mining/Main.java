package org.example.mining;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");
        Miner miner = context.getBean("minerBean",Miner.class);
        System.out.println(miner.getAlgorithm());
        context.close();


    }
}
