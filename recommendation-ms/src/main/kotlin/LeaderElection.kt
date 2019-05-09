import com.google.protobuf.ByteString
import com.ibm.etcd.client.EtcdClient
import com.ibm.etcd.client.utils.EtcdLeaderElection
import com.ibm.etcd.client.utils.RangeCache
import java.net.InetAddress

object LeaderElection {
    private const val leaderKey: String = "/master/recommendation/"
    private const val hostsKey: String = "/services/recommendation/"

    var election: EtcdLeaderElection? = null

    fun resolveLeader(client: EtcdClient,listener: EtcdLeaderElection.ElectionListener,myPort: Int){
        val me = InetAddress.getLocalHost().hostAddress
        val e = EtcdLeaderElection(client,ByteString.copyFromUtf8(leaderKey), "$me:$myPort")
        e.addListener(listener)
        e.start()
        election = e
    }

    fun register(client: EtcdClient): RangeCache {
        val kv = RangeCache(client, ByteString.copyFromUtf8(hostsKey))
        return kv
    }

}

