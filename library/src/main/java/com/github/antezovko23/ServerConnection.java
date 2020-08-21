package com.github.antezovko23;

import com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest;
import com.grpcLib.generatedStubs.ConnectToServerGrpc.ConnectToServerBlockingStub;


import com.google.protobuf.ProtocolStringList;

import com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest;

import org.springframework.beans.factory.annotation.Autowired;


import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;


public class ServerConnection {

        @Autowired
        ManagedChannel channel;

        @Autowired
        ConnectToServerBlockingStub serverStub;

        

    public String connectToServer(String message, int number, int step) {

        try {

            DynamicIncrementRequest dynamicIncrementRequest = DynamicIncrementRequest.newBuilder()
                                                                                     .setNumber(number)
                                                                                     .setStep(step)
                                                                                     .build();

            ConnectRequest request = ConnectRequest.newBuilder()
                                                   .setTextMessage(message)
                                                   .setNumericalMessage(dynamicIncrementRequest)
                                                   .build();


            

            ProtocolStringList response = serverStub.connection(request).getConnectedMessageList();


            String responseStructure = "";


            for (int i = 0; i < response.size(); i++) {
                responseStructure += response.get(i) + "\n";
            }


            return responseStructure;


        } catch (StatusRuntimeException e) {
          

            return "Server Status: " + e.getStatus().getCode();



        }

    //     finally {

    //         try {
    //             channel.shutdownNow().awaitTermination(0, TimeUnit.SECONDS);
    //         } catch (InterruptedException e) {
               
    //             return "Channel Not Closed";
    //         }

    // }


    }


    

   
  
} 

