import com.ibm.etcd.api.KeyValue;
import com.ibm.etcd.api.RangeResponse;
import com.ibm.etcd.client.EtcdClient;
import com.ibm.etcd.client.kv.KvClient;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.net.Inet4Address;

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

            register(myIP, myPort);

            System.out.println("Email service is running...");
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void register(String myIP, int myPort) {
//        KvStoreClient client = EtcdClusterConfig.fromJsonFile(filePath).getClient();
//        TODO set real etcd endppoint.
        EtcdClient etcdClient = EtcdClient.forEndpoints("http://127.0.0.1:2379").build();
        KvClient kvClient = etcdClient.getKvClient();

//        RangeResponse result = kvClient.get(bs("foo")).sync();
//        dumpRangeResponse(result);

        kvClient.put(bs("/services/email/" + myIP + ":" + myPort), bs(myIP + ":" + myPort)).sync();
    }

    private static void dumpRangeResponse(RangeResponse rr) {
        for(int i=0;i<rr.getKvsCount();i++) {
            KeyValue kv=rr.getKvs(i);
            System.out.println(i+" : "+kv.getKey().toStringUtf8()+" : "+kv.getValue().toStringUtf8());
        }
    }
}
