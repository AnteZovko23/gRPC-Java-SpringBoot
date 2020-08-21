package com.server.server.configuration;

import com.grpcLib.generatedStubs.ConnectToServerGrpc;
import com.grpcLib.generatedStubs.DynamicIncrementGrpc;
import com.grpcLib.generatedStubs.PresetIncrementGrpc;
import com.grpcLib.generatedStubs.ConnectToServerGrpc.ConnectToServerBlockingStub;
import com.grpcLib.generatedStubs.DynamicIncrementGrpc.DynamicIncrementBlockingStub;
import com.grpcLib.generatedStubs.PresetIncrementGrpc.PresetIncrementFutureStub;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


@Configuration
public class config {



    @Bean
    public static ManagedChannel managedChannel() {

        return ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
    }

    

    @Bean
    @ConditionalOnBean(ManagedChannel.class)
    public ConnectToServerBlockingStub connectToServerBlockingStub(){

        return ConnectToServerGrpc.newBlockingStub(managedChannel());
    }

    @Bean
    @ConditionalOnBean(ManagedChannel.class)
    public DynamicIncrementBlockingStub DynamicIncrementBlockingStub(){

        return DynamicIncrementGrpc.newBlockingStub(managedChannel());
    }

    @Bean
    @ConditionalOnBean(ManagedChannel.class)
    public PresetIncrementFutureStub PresetIncrementFutureStub(){

        return PresetIncrementGrpc.newFutureStub(managedChannel());
    }

    

    
}