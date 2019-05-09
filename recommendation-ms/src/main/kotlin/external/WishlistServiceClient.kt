package external

import GrpcWishlist.Wishlist
import GrpcWishlist.WishlistServiceGrpc
import io.grpc.ManagedChannelBuilder

object WishlistServiceClient {
    // TODO client side load balancing
    private val wishlistIP = "ip"
    private val wishlistPort = 50051
    private val channel = ManagedChannelBuilder.forAddress(wishlistIP, wishlistPort).usePlaintext().build()
    private val service = WishlistServiceGrpc.newFutureStub(channel)

    fun getWishlist(userId: Int): Wishlist.WishlistResponse? {
        println("Requesting wishlist with user ID $userId")
        val wishlistRequest = Wishlist.WishlistRequest.newBuilder().setId(userId).build()
        val response = service.getWishlist(wishlistRequest)
        return response.get()
    }
}