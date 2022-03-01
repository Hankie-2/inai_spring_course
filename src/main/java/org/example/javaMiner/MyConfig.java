package org.example.javaMiner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("org.example.javaMiner")
public class MyConfig {

    @Bean
    public Algorithm ethashBean(){
        return new Ethash();
    }

    @Bean
    public Algorithm sha256Bean(){
        return new SHA256();
    }

}
