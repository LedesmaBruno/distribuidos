import com.ibm.etcd.client.EtcdClient
import com.ibm.etcd.client.KeyUtils.bs
import io.grpc.ServerBuilder
import java.net.Inet4Address

fun main(args: Array<String>) {
    val myPort = 70000

    val server = ServerBuilder
        .forPort(myPort)
        .addService(RecommendationService())
        .build()

    server.start()

    val myIP = Inet4Address.getLocalHost().hostAddress
    println("Recommendation Server Host IP: " + myIP)
    println("Listening on " + myPort)

    register(myIP, myPort)

    println("Recommendation service is running...")
    server.awaitTermination()
}

fun register(myIP: String?, myPort: Int) {
//        TODO set real etcd endppoint.
    val etcdClient = EtcdClient.forEndpoint("ETCD-endpoint", 2372).build()
    val kvClient = etcdClient.kvClient
    kvClient.put(bs("email-server-container-address"), bs("$myIP:$myPort")).sync()
}
