package external

import email.Email
import email.EmailServiceGrpc
import io.grpc.ManagedChannelBuilder

class EmailServiceClient(host: String, port: String) {

    private val channel = ManagedChannelBuilder.forAddress(host,port.toInt()).usePlaintext().build()
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