package com.server.server;

import com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest;
import com.grpcLib.generatedStubs.DynamicIncrementGrpc;
import com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectReply;
import com.grpcLib.generatedStubs.ConnectToServerGrpc.ConnectToServerImplBase;
import com.grpcLib.generatedStubs.DynamicIncrementGrpc.DynamicIncrementBlockingStub;
import com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest;

import org.springframework.beans.factory.annotation.Autowired;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ConnectToServerService extends ConnectToServerImplBase {

    @Autowired
    ManagedChannel channel;

    @Autowired
    DynamicIncrementBlockingStub dynamicIncrementStub;
    

    @Override
    public void connection(ConnectRequest request, StreamObserver<ConnectReply> responseObserver) {

        // int clientNumber = request.getNumericalMessage().getNumber();
        // int clientStep = + request.getNumericalMessage().getStep();
        // int replyNumber = clientNumber + clientStep;
        

        /***** Request to Increment Service to Increment the Client Number *******/

        int clientNumber = getIncrementedNumber(request.getNumericalMessage());

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


    private int getIncrementedNumber(DynamicIncrementRequest dynamicIncrementRequest) {


        return dynamicIncrementStub.increment(dynamicIncrementRequest).getReplyNumber();


    }
    

}