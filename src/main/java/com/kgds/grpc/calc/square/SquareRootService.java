package com.kgds.grpc.calc.square;

import com.kgds.grpc.service.squareroot.SquareRootServiceGrpc;
import com.kgds.grpc.square.models.Square;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class SquareRootService extends SquareRootServiceGrpc.SquareRootServiceImplBase{
    @Override
    public void getSquareRoot(Square.SquareRootRequest request, StreamObserver<Square.SquareRootResponse> responseObserver) {
        int number = request.getNumber();
        double numberRoot = Math.sqrt(number);
        Square.SquareRootResponse response = Square.SquareRootResponse.newBuilder()
                .setNumber(number)
                .setSquareroot(numberRoot)
                .build();
        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }
}
