package com.github.antezovko23.clientlibrary.configuration;

import com.github.antezovko23.clientlibrary.DynamicIncrement;
import com.github.antezovko23.clientlibrary.ServerConnection;



import com.grpcLib.generatedStubs.ConnectToServerGrpc;
import com.grpcLib.generatedStubs.DynamicIncrementGrpc;
import com.grpcLib.generatedStubs.ConnectToServerGrpc.ConnectToServerBlockingStub;
import com.grpcLib.generatedStubs.DynamicIncrementGrpc.DynamicIncrementBlockingStub;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Configuration
public class GrpcClientConfiguration {

   
   @Bean
   public static ManagedChannel managedChannel(){
      
      return ManagedChannelBuilder.forAddress("localhost", 9090)
                                  .usePlaintext()
                                  .build();

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
   @ConditionalOnBean(ConnectToServerBlockingStub.class)
   public ServerConnection serverConnection() {
      return new ServerConnection(connectToServerBlockingStub());
   }

   @Bean
   public DynamicIncrement dynamicIncrement() {
      return new DynamicIncrement(dynamicIncrementBlockingStub());
   }



  
   
 
   

}