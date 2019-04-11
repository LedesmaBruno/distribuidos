package client

import catalog.product._
import io.grpc.ManagedChannelBuilder

import scala.concurrent.ExecutionContext
import scala.util.Success

object SimpleProductClient extends App {

  implicit val ec = ExecutionContext.global


  val channel = ManagedChannelBuilder.forAddress("192.168.99.100", 50000)
    .usePlaintext(true)
    .build()

  val stub = ProductServiceGrpc.stub(channel)
  val pongFuture = stub.healthCheck(Ping())

  val TEST_PRODUCT_ID = 5
//  val saveProduct = stub.saveProduct(SaveProductRequest(Option(Product(TEST_PRODUCT_ID, "TEST_PRODUCT_01"))))
  val deleteProduct = stub.deleteProduct(DeleteProductRequest(TEST_PRODUCT_ID))
//  val getProduct = stub.getProduct(GetProductRequest(TEST_PRODUCT_ID))
  val getAll = stub.getAllProducts(new Empty)



  pongFuture onComplete {
    result =>
      println(result)
//      saveProduct onComplete (r => println("Saved Product."))
      deleteProduct onComplete (r => println("DELETE."))
//      getProduct onComplete (r => println(r.get))
      getAll onComplete (all => println(all.get))
  }

  // StdIn to prevent thread from ending
  System.in.read()
}
