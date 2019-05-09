import com.google.protobuf.ByteString;
import com.ibm.etcd.client.EtcdClient;
import com.ibm.etcd.client.KeyUtils;
import com.ibm.etcd.client.lease.PersistentLease;
import com.ibm.etcd.client.utils.PersistentLeaseKey;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.net.Inet4Address;
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
        EtcdClient etcdClient = EtcdClient.forEndpoint("localhost",2379).withPlainText().build();

        ByteString key = KeyUtils.bs("/services/email/" + myIP + ":" + myPort);
        ByteString value = KeyUtils.bs(myIP + ":" + myPort);

        PersistentLease req = etcdClient.getLeaseClient().maintain().minTtl(2).start();
        PersistentLeaseKey plk = new PersistentLeaseKey(etcdClient,req,key,value,null);
        plk.start();
    }
}
