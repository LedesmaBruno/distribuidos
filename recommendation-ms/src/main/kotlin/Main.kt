import com.ibm.etcd.client.EtcdClient
import com.ibm.etcd.client.KeyUtils.bs
import com.ibm.etcd.client.utils.EtcdLeaderElection
import com.ibm.etcd.client.utils.PersistentLeaseKey
import com.ibm.etcd.client.utils.RangeCache
import io.grpc.ServerBuilder
import service.RecommendationService
import java.net.Inet4Address
import java.util.*


fun main(args: Array<String>) {
    val myPort = Random().nextInt() % 100 + 1000
    val myIP = Inet4Address.getLocalHost().hostAddress
    println("Recommendation Server Host IP: $myIP")
    println("Listening on $myPort")

    val etcdClient = register(myIP, myPort)

    val server = ServerBuilder
        .forPort(myPort)
        .addService(RecommendationService(etcdClient))
        .build()

    server.start()

    LeaderElection.resolveLeader(
        etcdClient,
        EtcdLeaderElection.ElectionListener { isLeader ->
            println("Current leader "+ LeaderElection.election?.leaderId)
            if(isLeader){
                println("I am the master")
                val recommenderServices = LeaderElection.register(etcdClient)
                val userServices = RangeCache(etcdClient,bs("/services/users/"))
                CandidatesRetriever.elected(recommenderServices,userServices)
            } else {
                println("Just a simple peasant")
                CandidatesRetriever.demoted()
            }
        },
        myPort)

    println("Recommendation service is running...")
    server.awaitTermination()
}

fun register(myIP: String?, myPort: Int): EtcdClient {
    val etcdClient = EtcdClient.forEndpoint("127.0.0.1",2379).withPlainText().build()

    val key = bs("/services/recommendation/$myIP:$myPort")
    val value = bs("$myIP:$myPort")

    val pl = etcdClient.leaseClient.maintain().minTtl(2).start()
    val plk = PersistentLeaseKey(etcdClient, pl, key, value, null)
    plk.start()
    return etcdClient
}
