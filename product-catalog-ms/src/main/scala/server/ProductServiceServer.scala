package server

import java.net.InetAddress

import catalog.product.ProductServiceGrpc
import com.ibm.etcd.client.utils.PersistentLeaseKey
import com.ibm.etcd.client.{EtcdClient, KeyUtils}
import io.grpc.{Server, ServerBuilder}
import service.ProductService

import scala.concurrent.ExecutionContext

object ProductServiceServer extends App {

  val port = 50000
  val server: Server = ServerBuilder.forPort(port)
    .addService(ProductServiceGrpc.bindService(new ProductService(), ExecutionContext.global))
    .build()

  val ip = InetAddress.getLocalHost.getHostAddress

  server.start()
  println(s"Product service is running on: $ip:$port...")

  server.awaitTermination()

  def register(myIP: String, myPort: String): Unit = {
    val etcdClient = EtcdClient.forEndpoint("localhost", 2379).withPlainText.build

    val key = KeyUtils.bs("/services/product/" + myIP + ":" + myPort)
    val value = KeyUtils.bs(myIP + ":" + myPort)

    val req = etcdClient.getLeaseClient.maintain.minTtl(2).start
    val plk = new PersistentLeaseKey(etcdClient, req, key, value, null)
    plk.start()
  }

}
