package service

import common.healthcheck.{HealthCheckServiceGrpc, Ping, Pong}
import io.grpc.ServerBuilder

import scala.concurrent.{ExecutionContext, Future}

class HealthCheckService extends HealthCheckServiceGrpc.HealthCheckService {
  override def healthCheck(request: Ping): Future[Pong] = {

    Future.successful(Pong())
  }
}

object HealthCheckServer extends App {

  val port = 80
  val server = ServerBuilder.forPort(port)
    .addService(HealthCheckServiceGrpc.bindService(new HealthCheckService(), ExecutionContext.global))
    .build()


  server.start()
  println(s"Listening for healthchecks on port $port... ")

  server.awaitTermination()

}
