package service

import catalog.product._
import storage.ProductRepository

import scala.concurrent.duration._
import scala.concurrent.{Await, ExecutionContext, Future}

class ProductService extends ProductServiceGrpc.ProductService {

  private val productRepository = ProductRepository

  implicit private val executionContext: ExecutionContext = ExecutionContext.global

  override def healthCheck(request: Ping): Future[Pong] = Future.successful(Pong())

  override def getProduct(request: GetProductRequest): Future[GetProductReply] = {
    productRepository.findProductById(request.id)
      .map(oP => GetProductReply(oP.map(p => p: catalog.product.Product)))
  }

  override def getAllProducts(request: Empty): Future[AllProducts] = {
    productRepository.getAllProducts
      .map(ps => AllProducts(ps.map(p => p: catalog.product.Product)))
  }

  override def saveProduct(request: SaveProductRequest): Future[Empty] = {
    if (request.product.isEmpty) throw new IllegalArgumentException
    val product = request.product.get
    val writeResult = Await.result(productRepository.save(product), 10 seconds)
    if (writeResult.ok)
      Future.successful(new Empty)
    else
      throw new RuntimeException("Error on save operation.")
  }

  override def deleteProduct(request: DeleteProductRequest): Future[Empty] = {
    val writeResult = Await.result(productRepository.deleteById(request.id), 10 seconds)
    if (writeResult.ok)
      Future.successful(new Empty)
    else
      throw new RuntimeException("Error on delete operation.")
  }

  implicit def convertProductToProtoProduct(product: model.Product): catalog.product.Product =
    new catalog.product.Product(product.id, product.name)


  implicit def parseProtoProduct(protoProduct: catalog.product.Product): model.Product =
    model.Product(protoProduct.id, protoProduct.name, "")
}

