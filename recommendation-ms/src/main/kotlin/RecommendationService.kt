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
        val userId = request?.userId
        if (userId != null) {
            /**
             * Request to wishlist, the products.
             * Then, make a request to product catalog with the names.
             * Generate recommendation with the product information received.
             * Send Email to the user.
              */
        }

        responseObserver?.onCompleted()
    }
}