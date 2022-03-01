package org.example.javaMiner;

import org.example.javaMiner.Algorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component("beanMiner")
public class Miner {
    private org.example.javaMiner.Algorithm algorithm;

    public Miner(Algorithm algorithm){
        this.algorithm = algorithm;
    }

    public String getAlgorithm(){
        return algorithm.hash();
    }

}
