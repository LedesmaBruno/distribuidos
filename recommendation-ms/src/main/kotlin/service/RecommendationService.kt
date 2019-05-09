package service

import external.loadbalancer.ServiceLB
import com.ibm.etcd.client.EtcdClient
import external.EmailServiceClient
import external.UserServiceClient
import external.WishlistServiceClient
import io.grpc.stub.StreamObserver
import recommendation.Recommendation
import recommendation.RecommendationServiceGrpc

class RecommendationService(etcdClient: EtcdClient) : RecommendationServiceGrpc.RecommendationServiceImplBase() {

    private val wishlistServiceLB =
        ServiceLB(etcdClient, "/services/wishlist/", WishlistServiceClient::class.java)
    private val userServiceLB =
        ServiceLB(etcdClient, "/services/users/", UserServiceClient::class.java)
    private val emailServiceLB =
        ServiceLB(etcdClient, "/services/email/", EmailServiceClient::class.java)

    override fun healthCheck(request: Recommendation.Ping?, responseObserver: StreamObserver<Recommendation.Pong>?) {

    }

    override fun supplyRecommendation(
        request: Recommendation.SupplyRecommendationRequest?,
        responseObserver: StreamObserver<Recommendation.Empty>?
    ) {
        val userId = request?.userId
        if (userId != null) {
            val userResponse = userServiceLB.getRandomClient().getUserById(userId)
            val userEmailAddress = userResponse?.user?.email

            val wishlistResponse = wishlistServiceLB.getRandomClient().getWishlist(userId)

            var msg = "BUY: "
            wishlistResponse?.productsList?.forEach { product ->
                msg += product.name
            }

            println("Message that will be sent: $msg")
            if (userEmailAddress != null) {
                emailServiceLB.getRandomClient().sendEmail(userEmailAddress, msg)
            }

        }

        responseObserver?.onCompleted()
    }
}