package server

import catalog.product.ProductServiceGrpc
import io.grpc.{Server, ServerBuilder}
import service.ProductService

import scala.concurrent.ExecutionContext

object ProductServiceServer extends App {

  val server: Server = ServerBuilder.forPort(50000)
    .addService(ProductServiceGrpc.bindService(new ProductService(), ExecutionContext.global))
    .build()

  server.start()
  println("Product service is running...")

  server.awaitTermination()

}
