import com.ibm.etcd.client.EtcdClient;
import com.ibm.etcd.client.kv.KvClient;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.net.Inet4Address;
import java.sql.SQLOutput;

import static com.ibm.etcd.client.KeyUtils.bs;

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

//            TODO uncomment
//            register(myIP, myPort);

            System.out.println("Email service is running...");
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void register(String myIP, int myPort) {
//        KvStoreClient client = EtcdClusterConfig.fromJsonFile(filePath).getClient();
//        TODO set real etcd endppoint.
        EtcdClient etcdClient = EtcdClient.forEndpoint("ETCD-endpoint", 2372).build();
        KvClient kvClient = etcdClient.getKvClient();
        kvClient.put(bs("email-server-container-address"), bs(myIP + ":" + myPort)).sync();
    }
}
