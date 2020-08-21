package com.github.antezovko23;

import org.springframework.beans.factory.annotation.Autowired;

import io.grpc.ManagedChannel;

public class ConstantIncrement {

    @Autowired
    ManagedChannel channel;

    @Autowired
    DynamicIncrement dynamicIncrement;

    public void incrementConstantly(int number, int step) throws InterruptedException {
        
        
        int increment = number;
        while(true){

            increment = dynamicIncrement.increment(increment, step);
            Thread.sleep(1000);
            System.out.println(increment);

           
        }

    }
    
}