package com.github.antezovko23;

import com.grpcLib.generatedStubs.DynamicIncrementGrpc.DynamicIncrementBlockingStub;
import com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest;

import org.springframework.beans.factory.annotation.Autowired;

import io.grpc.ManagedChannel;

public class DynamicIncrement {

    @Autowired
    ManagedChannel channel;

    @Autowired
    DynamicIncrementBlockingStub dynamicIncrementStub;


    public int increment(int number, int step) {

        DynamicIncrementRequest request = DynamicIncrementRequest.newBuilder()
                                                               .setNumber(number)
                                                               .setStep(step)
                                                               .build();

        
        return dynamicIncrementStub.increment(request).getReplyNumber();

    }

    
}