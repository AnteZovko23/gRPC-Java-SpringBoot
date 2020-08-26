package com.server.server;

import com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest;
import com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectReply;
import com.grpcLib.generatedStubs.ConnectToServerGrpc.ConnectToServerImplBase;
import com.server.server.service.DynamicIncrementHelper;

import org.springframework.beans.factory.annotation.Autowired;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ConnectToServerService extends ConnectToServerImplBase {


    private DynamicIncrementHelper dynamicIncrementHelper;


    @Autowired
    public ConnectToServerService(DynamicIncrementHelper dynamicIncrementHelper){

        this.dynamicIncrementHelper = dynamicIncrementHelper;

    }
    

    @Override
    public void connection(ConnectRequest request, StreamObserver<ConnectReply> responseObserver) {


        /***** Request to Increment Service to Increment the Client Number *******/

        int clientNumber = dynamicIncrementHelper.getIncrementedNumber(request.getNumericalMessage());

        /************************************************************************* */

        String clientMessage = request.getTextMessage();


        ConnectReply reply = ConnectReply.newBuilder()
                .addConnectedMessage("Connected!")
                .addConnectedMessage("Your message: " + clientMessage)
                .addConnectedMessage("The result: " + clientNumber)
                .build();


        responseObserver.onNext(reply);
        responseObserver.onCompleted();

    }
    

}