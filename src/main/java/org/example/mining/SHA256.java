package org.example.mining;

import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component("sha256")
public class SHA256 implements Algorithm{


    @Override
    public String hash() {
        return "Это реализация алгоритма SHA256";
    }
}
