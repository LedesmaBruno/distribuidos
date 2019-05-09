package external

import io.grpc.ManagedChannelBuilder
import protos.UserOuterClass
import protos.UserServiceGrpc
import recommendation.Recommendation
import recommendation.RecommendationServiceGrpc


class RecommendationServiceClient(host:String, port:String) {

    private val channel = ManagedChannelBuilder.forAddress(host,port.toInt()).usePlaintext().build()
    private val service = RecommendationServiceGrpc.newFutureStub(channel)

    fun suggestRecommendation(userId: Int) {
        val recommendationFutureResponse = service.supplyRecommendation(
            Recommendation.SupplyRecommendationRequest
                .newBuilder()
                .setUserId(userId)
                .build()
        )
        recommendationFutureResponse.get()
    }
}