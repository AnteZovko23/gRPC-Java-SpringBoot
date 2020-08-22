package com.github.antezovko23.clientlibrary;

import com.google.protobuf.ProtocolStringList;
import com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest;
import com.grpcLib.generatedStubs.ConnectToServerGrpc.ConnectToServerBlockingStub;
import com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest;

import org.springframework.beans.factory.annotation.Autowired;


import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;


public class ServerConnection {

    private static ManagedChannel channel;
    private ConnectToServerBlockingStub stub;

    
    @Autowired
    public ServerConnection(ManagedChannel channel, ConnectToServerBlockingStub stub){

        ServerConnection.channel = channel;
        this.stub = stub;

    }


    public String connectToServer(String message, int number, int step){


        try {

            DynamicIncrementRequest dynamicIncrementRequest = DynamicIncrementRequest.newBuilder()
                                                                                     .setNumber(number)
                                                                                     .setStep(step)
                                                                                     .build();

            ConnectRequest request = ConnectRequest.newBuilder()
                                                   .setTextMessage(message)
                                                   .setNumericalMessage(dynamicIncrementRequest)
                                                   .build();

            
            ProtocolStringList response = stub.connection(request).getConnectedMessageList();

            String responseStructure = "";


            for (int i = 0; i < response.size(); i++) {
                responseStructure += response.get(i) + "\n";
            }

            return responseStructure;
            
        } catch (StatusRuntimeException e){

            return "Server Status: " + e.getStatus().getCode();

        }


    }



    
}