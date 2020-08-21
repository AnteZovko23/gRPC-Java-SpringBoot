package com.github.antezovko23;

import java.util.concurrent.ExecutionException;

import com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply;
import com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest;
import com.grpcLib.generatedStubs.PresetIncrementGrpc.PresetIncrementFutureStub;
import org.springframework.beans.factory.annotation.Autowired;

import io.grpc.ManagedChannel;

public class PresetIncrement {

    @Autowired
    ManagedChannel channel;

    @Autowired
    PresetIncrementFutureStub presetIncrementStub;

    public int incrementByFive(int number) {

        PresetIncrementRequest request = PresetIncrementRequest.newBuilder()
                                                               .setNumber(number)
                                                               .build();

        try {

            IncrementReply s = presetIncrementStub.incrementByFive(request).get();
            return s.getReplyNumber();

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return 0;
        }

    }

    public int incrementByTen(int number) {

        PresetIncrementRequest request = PresetIncrementRequest.newBuilder()
                                                               .setNumber(number)
                
                
                                                               .build();

        try {

            IncrementReply s = presetIncrementStub.incrementByTen(request).get();
            return s.getReplyNumber();

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return 0;
        }

    }

    
    
}