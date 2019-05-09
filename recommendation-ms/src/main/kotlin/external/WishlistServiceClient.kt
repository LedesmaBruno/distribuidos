package external

import GrpcWishlist.Wishlist
import GrpcWishlist.WishlistServiceGrpc
import io.grpc.ManagedChannelBuilder

class WishlistServiceClient(host: String, port: String) {

    private val channel = ManagedChannelBuilder.forAddress(host,port.toInt()).usePlaintext().build()
    private val service = WishlistServiceGrpc.newFutureStub(channel)

    fun getWishlist(userId: Int): Wishlist.WishlistResponse? {
        println("Requesting wishlist with user ID $userId")
        val wishlistRequest = Wishlist.WishlistRequest.newBuilder().setId(userId).build()
        val response = service.getWishlist(wishlistRequest)
        return response.get()
    }
}