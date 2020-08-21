package com.server.server;


import com.grpcLib.generatedStubs.DynamicIncrementGrpc.DynamicIncrementImplBase;
import com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest;
import com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply;


import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;








@GrpcService
public class DynamicIncrementService extends DynamicIncrementImplBase  {

   


    @Override
    public void increment(DynamicIncrementRequest request, StreamObserver<IncrementReply> responseObserver){
        
        int incrementedNumber = request.getNumber() + request.getStep();


        IncrementReply reply = IncrementReply.newBuilder()
                                    .setReplyNumber(incrementedNumber)
                                    .build();

        


        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
    
}