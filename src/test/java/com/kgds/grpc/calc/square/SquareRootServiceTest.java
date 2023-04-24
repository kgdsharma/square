package com.kgds.grpc.calc.square;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.kgds.grpc.square.models.Square;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class SquareRootServiceTest {
    /**
     * Method under test: {@link SquareRootService#getSquareRoot(Square.SquareRootRequest, StreamObserver)}
     */
    @Test
    void testGetSquareRoot() {
        SquareRootService squareRootService = new SquareRootService();
        Square.SquareRootRequest request = Square.SquareRootRequest.getDefaultInstance();
        StreamObserver<Square.SquareRootResponse> responseObserver = mock(StreamObserver.class);
        doNothing().when(responseObserver).onCompleted();
        doNothing().when(responseObserver).onNext(Mockito.<Square.SquareRootResponse>any());
        squareRootService.getSquareRoot(request, responseObserver);
        verify(responseObserver).onCompleted();
        verify(responseObserver).onNext(Mockito.<Square.SquareRootResponse>any());
    }

    /**
     * Method under test: {@link SquareRootService#getSquareRoot(Square.SquareRootRequest, StreamObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSquareRoot2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.kgds.grpc.square.models.Square$SquareRootRequest.getNumber()" because "request" is null
        //       at com.kgds.grpc.calc.square.SquareRootService.getSquareRoot(SquareRootService.java:12)
        //   See https://diff.blue/R013 to resolve this issue.
        Square.SquareRootRequest request;
        request = Square.SquareRootRequest.getDefaultInstance();
        SquareRootService squareRootService = new SquareRootService();
        StreamObserver<Square.SquareRootResponse> responseObserver = mock(StreamObserver.class);
        doNothing().when(responseObserver).onCompleted();
        doNothing().when(responseObserver).onNext(Mockito.<Square.SquareRootResponse>any());
        squareRootService.getSquareRoot(request, responseObserver);
    }
}

