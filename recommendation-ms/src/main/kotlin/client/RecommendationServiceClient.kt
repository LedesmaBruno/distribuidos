package client

import io.grpc.ManagedChannelBuilder
import recommendation.Recommendation
import recommendation.RecommendationServiceGrpc

object RecommendationServiceClient {

    fun main(args: Array<String>) {
        // TODO ip
        val emailIP = "this_ip"
        val emailPort = 70000
        val channel = ManagedChannelBuilder.forAddress(emailIP, emailPort).usePlaintext().build()
        val service = RecommendationServiceGrpc.newFutureStub(channel)


        val healthCheckFutureResponse = service.healthCheck(Recommendation.Ping.getDefaultInstance())
        println(healthCheckFutureResponse.get())

        val userId = 5

        val recommendationFutureResponse = service.supplyRecommendation(
            Recommendation.SupplyRecommendationRequest
                .newBuilder()
                .setUserId(userId)
                .build()
        )
        recommendationFutureResponse.get()
    }
}