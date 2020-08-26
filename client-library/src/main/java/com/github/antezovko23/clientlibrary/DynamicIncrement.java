package com.github.antezovko23.clientlibrary;

import com.grpcLib.generatedStubs.DynamicIncrementGrpc.DynamicIncrementBlockingStub;
import com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest;


public class DynamicIncrement {

    private DynamicIncrementBlockingStub dynamicIncrementBlockingStub;
    
    
    public DynamicIncrement(DynamicIncrementBlockingStub dynamicIncrementBlockingStub){

        this.dynamicIncrementBlockingStub = dynamicIncrementBlockingStub;

    }


    // Method client can use
    public int increment(int number, int step) {

        DynamicIncrementRequest request = DynamicIncrementRequest.newBuilder()
                                                               .setNumber(number)
                                                               .setStep(step)
                                                               .build();


        
        return dynamicIncrementBlockingStub.increment(request)
                                           .getReplyNumber();

    }

    
}