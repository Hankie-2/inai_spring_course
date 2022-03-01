package org.example.xmlMiner;

import org.example.xmlMiner.Algorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Miner {
    private org.example.xmlMiner.Algorithm algorithm;

    public Miner(Algorithm algorithm){
        this.algorithm = algorithm;
    }

    public String getAlgorithm(){
        return algorithm.hash();
    }
}
