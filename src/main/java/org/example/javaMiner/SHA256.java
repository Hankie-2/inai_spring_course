package org.example.javaMiner;

import org.springframework.stereotype.Component;

//@Component("sha256")
public class SHA256 implements Algorithm{
    @Override
    public String hash() {
        return "Это реализация алгоритма SHA256";
    }
}
