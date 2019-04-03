package service

import catalog.product
import catalog.product.{GetProductReply, GetProductRequest, Ping, Pong, Product, ProductServiceGrpc}
import io.grpc.{ManagedChannelBuilder, Server, ServerBuilder}

import scala.concurrent.{ExecutionContext, Future}

class ProductService extends ProductServiceGrpc.ProductService {
  override def getProduct(request: GetProductRequest): Future[GetProductReply] = {

    // Todo: Retrieve from storage
    val product = Product(id = 1, name = "Pancho")
    val reply = GetProductReply(Option(product))
    Future.successful(reply)
  }

  override def healthCheck(request: product.Ping): Future[product.Pong] = {
    Future.successful(Pong())
  }
}

object ProductServiceServer extends App {

  val server: Server = ServerBuilder.forPort(50000)
    .addService(ProductServiceGrpc.bindService(new ProductService(), ExecutionContext.global))
    .build()


  server.start()
  println("Running...")

  server.awaitTermination()

}

object SimpleClient extends App {

  implicit val ec = ExecutionContext.global

  val channel = ManagedChannelBuilder.forAddress("localhost", 50000)
    .usePlaintext(true)
    .build()

  val stub = ProductServiceGrpc.stub(channel)

  val future: Future[GetProductReply] = stub.getProduct(GetProductRequest(1))
  val pongFuture = stub.healthCheck(Ping())

  pongFuture.onComplete(e => println(e))

  future.onComplete { _ =>
    println("Received product...")
  }

  // StdIn to prevent thread from ending
  System.in.read()
}
