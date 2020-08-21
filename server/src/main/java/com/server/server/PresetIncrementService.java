package com.server.server;

import com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply;
import com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest;
import com.grpcLib.generatedStubs.PresetIncrementGrpc.PresetIncrementImplBase;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;



@GrpcService
public class PresetIncrementService extends PresetIncrementImplBase {

    @Override
    public void incrementByFive(PresetIncrementRequest request, StreamObserver<IncrementReply> responseObserver) {

        int incrementedNumber = request.getNumber() + 5;
                                


        IncrementReply reply = IncrementReply.newBuilder()
                                             .setReplyNumber(incrementedNumber)
                                             .build();

        responseObserver.onNext(reply);
        responseObserver.onCompleted();


    }


    @Override
    public void incrementBySeven(PresetIncrementRequest request, StreamObserver<IncrementReply> responseObserver) {


        int incrementedNumber = request.getNumber() + 7;


        IncrementReply reply = IncrementReply.newBuilder()
                                             .setReplyNumber(incrementedNumber)
                                             .build();

        responseObserver.onNext(reply);
        responseObserver.onCompleted();





    }

    @Override
    public void incrementByTen(PresetIncrementRequest request, StreamObserver<IncrementReply> responseObserver) {


        int incrementedNumber = request.getNumber() + 10;


        IncrementReply reply = IncrementReply.newBuilder()
                                             .setReplyNumber(incrementedNumber)
                                             .build();

        responseObserver.onNext(reply);
        responseObserver.onCompleted();




    }
    
}