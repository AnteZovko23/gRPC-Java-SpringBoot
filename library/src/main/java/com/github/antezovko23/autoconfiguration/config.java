package com.github.antezovko23.autoconfiguration;

import com.github.antezovko23.ConstantIncrement;
import com.github.antezovko23.DynamicIncrement;
import com.github.antezovko23.PresetIncrement;
import com.github.antezovko23.ServerConnection;

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
    public ServerConnection serverConnection(){
        return new ServerConnection();
    }

    @Bean
    public PresetIncrement presetIncrement(){
        return new PresetIncrement();
    }

    @Bean
    public DynamicIncrement DynamicIncrement(){
        return new DynamicIncrement();
    }

    @Bean 
    public ConstantIncrement constantIncrement(){
        return new ConstantIncrement();
    }




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
    public DynamicIncrementBlockingStub dynamicIncrementBlockingStub(){

        return DynamicIncrementGrpc.newBlockingStub(managedChannel());
    }

    @Bean
    @ConditionalOnBean(ManagedChannel.class)
    public PresetIncrementFutureStub presetIncrementFutureStub(){

        return PresetIncrementGrpc.newFutureStub(managedChannel());
    }

    

    
}