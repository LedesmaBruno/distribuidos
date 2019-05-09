import com.google.protobuf.ByteString
import com.ibm.etcd.client.EtcdClient
import com.ibm.etcd.client.utils.EtcdLeaderElection
import com.ibm.etcd.client.utils.RangeCache
import java.net.InetAddress

object LeaderElection {
    private const val leaderKey: String = "recommendation/master/"
    private const val hostsKey: String = "recommendation/hosts/"

    fun resolveLeader(client: EtcdClient,listener: EtcdLeaderElection.ElectionListener){
        val me = InetAddress.getLocalHost().hostAddress
        val e = EtcdLeaderElection(client,ByteString.copyFromUtf8(leaderKey),me)
        e.addListener(listener)
    }

    fun register(client: EtcdClient): RangeCache {
        val kv = RangeCache(client, ByteString.copyFromUtf8(hostsKey))
        return kv
    }

}

