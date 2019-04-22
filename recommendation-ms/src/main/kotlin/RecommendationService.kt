import io.grpc.stub.StreamObserver
import recommendation.Recommendation
import recommendation.RecommendationServiceGrpc

class RecommendationService : RecommendationServiceGrpc.RecommendationServiceImplBase() {

    override fun healthCheck(request: Recommendation.Ping?, responseObserver: StreamObserver<Recommendation.Pong>?) {

    }

    override fun supplyRecommendation(
        request: Recommendation.SupplyRecommendationRequest?,
        responseObserver: StreamObserver<Recommendation.Empty>?
    ) {

    }
}