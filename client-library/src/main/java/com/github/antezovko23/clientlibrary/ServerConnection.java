package com.github.antezovko23.clientlibrary;

import com.google.protobuf.ProtocolStringList;
import com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest;
import com.grpcLib.generatedStubs.ConnectToServerGrpc.ConnectToServerBlockingStub;
import com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest;



import io.grpc.StatusRuntimeException;


public class ServerConnection {


    private ConnectToServerBlockingStub serverConnectionStub;

    
    public ServerConnection(ConnectToServerBlockingStub serverConnectionStub){

        this.serverConnectionStub = serverConnectionStub;

    }

    // Method a client can use
    public String connectToServer(String message, int number, int step){


        try {

            // Builds increment request with Number and Step
            DynamicIncrementRequest dynamicIncrementRequest = DynamicIncrementRequest.newBuilder()
                                                                                     .setNumber(number)
                                                                                     .setStep(step)
                                                                                     .build();
            // Builds connect request with text message
            ConnectRequest request = ConnectRequest.newBuilder()
                                                   .setTextMessage(message)
                                                   .setNumericalMessage(dynamicIncrementRequest)
                                                   .build();

            // Builds response
            ProtocolStringList response = serverConnectionStub.connection(request)
                                                              .getConnectedMessageList();



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