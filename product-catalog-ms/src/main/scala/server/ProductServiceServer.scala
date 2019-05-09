package server

import java.net.InetAddress

import catalog.product.ProductServiceGrpc
import com.ibm.etcd.client.{EtcdClient, KeyUtils}
import io.grpc.{Server, ServerBuilder}
import service.ProductService

import scala.concurrent.ExecutionContext

object ProductServiceServer extends App {

  //val port = new Random().nextInt() % 100 + 1000
  val port = 50000
  val server: Server = ServerBuilder.forPort(port)
    .addService(ProductServiceGrpc.bindService(new ProductService(), ExecutionContext.global))
    .build()

  val ip = InetAddress.getLocalHost.getHostAddress

  server.start()
  println(s"Product service is running on: $ip:$port...")
  register(ip, port)

  server.awaitTermination()

  def register(myIP: String, myPort: Int): Unit = {
    val etcd = scala.util.Properties.envOrElse("ETCD_ENDPOINTS", "10.10.10.7")

    println(s"Registering service on etcd on endpoint $etcd")
    val etcdClient = EtcdClient.forEndpoint("10.10.10.7", 2379).withPlainText.build

    val stringKey = "/services/product/" + myIP + ":" + myPort
    val stringValue = myIP + ":" + myPort

    val key = KeyUtils.bs("/services/product/" + myIP + ":" + myPort)
    val value = KeyUtils.bs(myIP + ":" + myPort)

    val req = etcdClient.getLeaseClient.maintain.minTtl(2).start
    //val plk = new PersistentLeaseKey(etcdClient, req, key, value, null)
    //plk.start()

    println("Writing server location on etcd...")
    val putRequest = etcdClient.getKvClient
      .put(KeyUtils.bs(stringKey), KeyUtils.bs(stringValue))
      .sync()
    println("Service registered successfully")

  }

}
