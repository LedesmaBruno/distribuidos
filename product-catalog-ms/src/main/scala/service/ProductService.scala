package service

import catalog.product._
import storage.ProductRepository

import scala.concurrent.{ExecutionContext, Future}
import scala.language.implicitConversions

class ProductService extends ProductServiceGrpc.ProductService {

  private val productRepository = ProductRepository

  implicit private val executionContext: ExecutionContext = ExecutionContext.global

  override def healthCheck(request: Ping): Future[Pong] = Future.successful(Pong())

  override def getProduct(request: GetProductRequest): Future[GetProductReply] = {
    productRepository findProductById request.id map (oP => GetProductReply(oP map (p => p: catalog.product.Product)))
  }

  override def getAllProducts(request: Empty): Future[AllProducts] = {
    productRepository.getAllProducts map (ps => AllProducts(ps map (p => p: catalog.product.Product)))
  }

  override def saveProduct(request: SaveProductRequest): Future[Empty] = {
    if (request.product.isEmpty) throw new IllegalArgumentException
    val product = request.product.get
    productRepository save product map (_ => new Empty)
  }

  override def deleteProduct(request: DeleteProductRequest): Future[Empty] = {
    productRepository deleteById request.id map (_ => new Empty)
  }

  implicit def convertProductToProtoProduct(product: model.Product): catalog.product.Product =
    new catalog.product.Product(product.id, product.name)


  implicit def parseProtoProduct(protoProduct: catalog.product.Product): model.Product =
    model.Product(protoProduct.id, protoProduct.name, "")
}

