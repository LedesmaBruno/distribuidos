package service

import catalog.product.{GetProductReply, GetProductRequest, Product, ProductServiceGrpc}
import common.healthcheck.HealthCheckServiceGrpc
import io.grpc.netty.NettyServerBuilder
import io.grpc.{ManagedChannelBuilder, ServerBuilder}

import scala.concurrent.{ExecutionContext, Future}

class ProductService extends ProductServiceGrpc.ProductService {
  override def getProduct(request: GetProductRequest): Future[GetProductReply] = {

    // Todo: Retrieve from storage
    val product = Product(id = 1, name = "Pancho")
    val reply = GetProductReply(Option(product))
    Future.successful(reply)
  }
}

object ProductServiceServer extends App {

  val server = ServerBuilder.forPort(50000)
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

  future.onComplete { _ =>
    println("Received product...")
  }

  // StdIn to prevent thread from ending
  System.in.read()
}