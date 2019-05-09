package external

import io.grpc.ManagedChannelBuilder
import protos.UserOuterClass
import protos.UserServiceGrpc

object UserServiceClient {
    // TODO client side load balancing
    private val emailIP = "ip"
    private val emailPort = 8081
    private val channel = ManagedChannelBuilder.forAddress(emailIP, emailPort).usePlaintext().build()
    private val service = UserServiceGrpc.newFutureStub(channel)


    fun getUserById(userId: Int): UserOuterClass.GetUserResponse? {
        println("Requesting to get User")
        val request = UserOuterClass.GetUserRequest.newBuilder()
            .setId(userId)
            .build()
        val response = service.getUser(request).get()
        return response
    }
}