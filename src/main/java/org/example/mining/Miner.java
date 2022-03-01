package org.example.mining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("minerBean")
public class Miner{
    private Algorithm algorithm;
    private String value;

    public Miner(@Qualifier("sha256") Algorithm algorithm){
        this.algorithm = algorithm;
    }

    public String getAlgorithm(){
        return algorithm.hash();
    }
}
