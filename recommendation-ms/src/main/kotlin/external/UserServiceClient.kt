package external

import io.grpc.ManagedChannelBuilder
import protos.UserOuterClass
import protos.UserServiceGrpc

class UserServiceClient(host:String, port:String) {

    private val channel = ManagedChannelBuilder.forAddress(host,port.toInt()).usePlaintext().build()
    private val service = UserServiceGrpc.newFutureStub(channel)

    fun getUsersWithLastAccess(): UserOuterClass.LastAccessResponse? {
        println("Requesting to get User")
        val request = UserOuterClass.LastAccessRequest.newBuilder().setAfter(0).setBefore(0).build()
        val response = service.getUsersByLastAccess(request).get()
        return response
    }

    fun getUserById(userId:Int): UserOuterClass.GetUserResponse? {
        println("Requesting to get User")
        val request = UserOuterClass.GetUserRequest.newBuilder().setId(userId).build()
        val response = service.getUser(request).get()
        return response
    }
}