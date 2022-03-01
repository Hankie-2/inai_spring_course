package org.example.javaMiner;

import org.springframework.stereotype.Component;

//@Component("ethash")
public class Ethash implements Algorithm{
    @Override
    public String hash() {
        return "Это реализация алгоритма Ethash";
    }
}
