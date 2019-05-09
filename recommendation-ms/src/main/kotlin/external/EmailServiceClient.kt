package external

import email.Email
import email.EmailServiceGrpc
import io.grpc.ManagedChannelBuilder

object EmailServiceClient {
    // TODO client side load balancing
    private val emailIP = "ip"
    private val emailPort = 60000
    private val channel = ManagedChannelBuilder.forAddress(emailIP, emailPort).usePlaintext().build()
    private val service = EmailServiceGrpc.newFutureStub(channel)

    fun sendEmail(emailAddress: String, msg: String) {
        println("Requesting to send email to $emailAddress")
        val emailRequest = Email.SendEmailRequest.newBuilder()
            .setEmailAddress(emailAddress)
            .setMsg(msg)
            .build()
        val response = service.sendEmail(emailRequest)
    }
}