package external.loadbalancer

import com.ibm.etcd.client.EtcdClient
import com.ibm.etcd.client.KeyUtils.bs
import com.ibm.etcd.client.utils.RangeCache
import java.util.*
import java.util.stream.Collectors


class ServiceLB<T>(registryClient: EtcdClient, prefix: String, val serviceClass: Class<T>) {

    private val clientsRange = RangeCache(registryClient, bs(prefix))

    fun getRandomClient(): T {
        val servicesStubs = clientsRange.keySet()
            .stream()
            .map {
                val iPandPort = it.toStringUtf8().split(":")
                serviceClass.getConstructor(String::class.java, String::class.java)
                    .newInstance(iPandPort[0], iPandPort[1])
            }
            .collect(Collectors.toList())
        return servicesStubs.get(Random().nextInt(servicesStubs.size))
    }
}