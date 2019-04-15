package client

import catalog.product._
import io.grpc.ManagedChannelBuilder

import scala.concurrent.ExecutionContext
import scala.util.{Failure, Success}

object SimpleProductClient extends App {

  implicit val ec = ExecutionContext.global


  val channel = ManagedChannelBuilder.forAddress("192.168.99.100", 50000)
    //  val channel = ManagedChannelBuilder.forAddress("localhost", 50000)
    .usePlaintext(true)
    .build()

  val stub = ProductServiceGrpc.stub(channel)
  val pongFuture = stub.healthCheck(Ping())

  val TEST_PRODUCT_ID = 5
  val saveProduct = stub.saveProduct(SaveProductRequest(Option(Product(TEST_PRODUCT_ID, "TEST_PRODUCT_DESCRIPTION"))))
//  val deleteProduct = stub.deleteProduct(DeleteProductRequest(TEST_PRODUCT_ID))
  val getProduct = stub.getProduct(GetProductRequest(TEST_PRODUCT_ID))
  val getAll = stub.getAllProducts(new Empty)


  pongFuture onComplete {
    result =>
      println(result)
      saveProduct onComplete {
        case Success(r) => println("Saved Product.")
        case Failure(ex) =>
          println("Save ERROR: ")
          ex.printStackTrace()
      }
//      deleteProduct onComplete {
//        case Success(r) => println("Product deleted.")
//        case Failure(ex) =>
//          println("Delete ERROR: ")
//          ex.printStackTrace()
//      }
      getProduct onComplete {
        case Success(r) =>
          println("Get Product: ")
          println(r.product)
        case Failure(ex) =>
          println("Get product ERROR: ")
          ex.printStackTrace()
      }
      getAll onComplete {
        case Success(r) =>
          println("All Products: ")
          println(r.product)
        case Failure(ex) =>
          println("Get all ERROR: ")
          ex.printStackTrace()
      }
  }

  // StdIn to prevent thread from ending
  System.in.read()
}
