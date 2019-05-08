import email.Email;
import email.EmailServiceGrpc;
import io.grpc.stub.StreamObserver;

public class EmailService extends EmailServiceGrpc.EmailServiceImplBase {

    @Override
    public void sendEmail(Email.SendEmailRequest request, StreamObserver<Email.SendEmailResponse> responseObserver) {
        String emailAddress = request.getEmailAddress();
        String msg = request.getMsg();
        System.out.println("Sending email to " + emailAddress + " with the message: " + msg);
        responseObserver.onCompleted();
    }
}
