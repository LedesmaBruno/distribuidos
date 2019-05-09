import io.etcd.jetcd.ByteSequence
import io.etcd.jetcd.Client
import io.etcd.jetcd.KV
import io.grpc.ServerBuilder
import service.RecommendationService
import java.net.Inet4Address
import java.util.concurrent.CompletableFuture

fun main(args: Array<String>) {
    val myPort = 70000

    val server = ServerBuilder
        .forPort(myPort)
        .addService(RecommendationService())
        .build()

    server.start()

    val myIP = Inet4Address.getLocalHost().hostAddress
    println("Recommendation Server Host IP: $myIP")
    println("Listening on $myPort")

    register(myIP, myPort)

    println("Recommendation service is running...")
    server.awaitTermination()
}

fun register(myIP: String?, myPort: Int) {
//    TODO set real etcd endppoint.
    val etcdClient = Client.builder().endpoints("http://127.0.0.1:2379").build()
    val kvClient = etcdClient.kvClient

    val key = ByteSequence.from(("/services/recommendation/$myIP:$myPort").toByteArray())
    val value = ByteSequence.from(("$myIP:$myPort").toByteArray())

    kvClient.put(key, value).get()
}
