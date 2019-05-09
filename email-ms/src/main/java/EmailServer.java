import io.etcd.jetcd.ByteSequence;
import io.etcd.jetcd.Client;
import io.etcd.jetcd.KV;
import io.etcd.jetcd.kv.GetResponse;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.net.Inet4Address;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class EmailServer {

    public static void main(String[] args) {
        int myPort = 60000;

        final Server server = ServerBuilder
                .forPort(myPort)
                .addService(new EmailService())
                .build();


        try {
            server.start();

            final String myIP = Inet4Address.getLocalHost().getHostAddress();
            System.out.println("Email Server Host IP: " + myIP);
            System.out.println("Listening on " + myPort);

            register(myIP, myPort);

            System.out.println("Email service is running...");
            server.awaitTermination();
        } catch (IOException | InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void register(String myIP, int myPort) throws ExecutionException, InterruptedException {
//        TODO set real etcd endppoint.
        Client client = Client.builder().endpoints("http://127.0.0.1:2379").build();
        KV kvClient = client.getKVClient();

        ByteSequence key = ByteSequence.from(("/services/email/" + myIP + ":" + myPort).getBytes());
        ByteSequence value = ByteSequence.from((myIP + ":" + myPort).getBytes());

        kvClient.put(key, value).get();

//        CompletableFuture<GetResponse> getFuture = kvClient.get(key);
//
//        GetResponse response = getFuture.get();
//        response.getKvs().forEach(keyValue ->
//                System.out.println(new String(keyValue.getKey().getBytes(), StandardCharsets.UTF_8)));
//
//        kvClient.delete(key).get();
    }
}
