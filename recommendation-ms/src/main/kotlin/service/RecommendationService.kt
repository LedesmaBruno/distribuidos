package service

import external.EmailServiceClient
import external.UserServiceClient
import external.WishlistServiceClient
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
             * Generate recommendation with the product information received.
             */

            // TODO generate msg from product names in the wishlist
            val wishlistResponse = WishlistServiceClient.getWishlist(userId)

            //TODO get email from user
            val user = UserServiceClient.getUserById(userId)

            val address = "address"
            val msg = "promo"

            EmailServiceClient.sendEmail(address, msg)
        }

        responseObserver?.onCompleted()
    }
}