package com.github.antezovko23.clientlibrary.configuration;

import com.github.antezovko23.clientlibrary.ServerConnection;



import com.grpcLib.generatedStubs.ConnectToServerGrpc;
import com.grpcLib.generatedStubs.ConnectToServerGrpc.ConnectToServerBlockingStub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Configuration
public class GrpcClientConfiguration {

   @Bean
   public ServerConnection serverConnection() {
      return new ServerConnection(managedChannel(), connectToServerBlockingStub());
   }

    

   @Bean
   public static ManagedChannel managedChannel(){
      
      return ManagedChannelBuilder.forAddress("localhost", 9090)
                                  .usePlaintext()
                                  .build();

   }

   @Bean
   public ConnectToServerBlockingStub connectToServerBlockingStub(){

      return ConnectToServerGrpc.newBlockingStub(managedChannel());

   }

  
   
 
   

}