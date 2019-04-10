package service

import java.util.concurrent.TimeUnit

import catalog.product
import catalog.product._
import storage.ProductRepository

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, ExecutionContext, Future}

class ProductService extends ProductServiceGrpc.ProductService {

  private val productRepository = ProductRepository

  implicit private val executionContext: ExecutionContext = ExecutionContext.global

  private val timeOut = Duration(10, TimeUnit.SECONDS)

  override def getProduct(request: GetProductRequest): Future[GetProductReply] = {
    val optionalProduct = Await.result(productRepository getProductById request.id, timeOut)
    Future successful GetProductReply(optionalProduct map (p => p))
  }

  override def healthCheck(request: product.Ping): Future[product.Pong] = Future.successful(Pong())

  override def getAllProducts(request: Empty): Future[AllProducts] = {
    val products = Await.result(productRepository getAllProducts, timeOut)
    Future.successful(AllProducts(products map (p => p: catalog.product.Product)))
  }

  //TODO preguntar como determinar el caso de que falle.
  override def saveProduct(request: SaveProductRequest): Future[Empty] = {
    if (request.product.isEmpty) throw new IllegalArgumentException
    val product = request.product.get
    val optionalResult = Await.result(productRepository save product, timeOut)
    if (optionalResult.isEmpty)
      throw new RuntimeException
    else
      Future.successful(new Empty)
  }

  //TODO preguntar como determinar el caso de que falle.
  override def deleteProduct(request: DeleteProductRequest): Future[Empty] = {
    val optionalResult = Await.result(productRepository deleteById request.id, timeOut)
    if (optionalResult.isEmpty)
      throw new RuntimeException
    else
      Future.successful(new Empty)
  }

  implicit def convertProductToProtoProduct(product: model.Product): catalog.product.Product =
    new catalog.product.Product(product.id, product.name)


  implicit def parseProtoProduct(protoProduct: catalog.product.Product): model.Product =
    model.Product(protoProduct.id, protoProduct.name, "")
}

