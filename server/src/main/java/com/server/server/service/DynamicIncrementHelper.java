package com.server.server.service;

import com.grpcLib.generatedStubs.DynamicIncrementGrpc.DynamicIncrementBlockingStub;
import com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class DynamicIncrementHelper {


    private DynamicIncrementBlockingStub dynamicIncrementBlockingStub;


    @Autowired
    public DynamicIncrementHelper(DynamicIncrementBlockingStub dynamicIncrementBlockingStub){

        this.dynamicIncrementBlockingStub = dynamicIncrementBlockingStub;

    }

    public int getIncrementedNumber(DynamicIncrementRequest dynamicIncrementRequest) {


        return dynamicIncrementBlockingStub.increment(dynamicIncrementRequest)
                                           .getReplyNumber();


    }


    
}