package storage

import model.Product
import reactivemongo.api.Cursor
import reactivemongo.api.collections.bson.BSONCollection
import reactivemongo.bson.{BSONDocument, BSONDocumentReader, BSONDocumentWriter, Macros}

import scala.concurrent.{ExecutionContext, ExecutionContextExecutor, Future}

object ProductRepository {

  implicit val executionContext: ExecutionContextExecutor = ExecutionContext.global

  private val productsCollection: Future[BSONCollection] = MongoDB.getCollection("products")

  def findProductById(id: Int): Future[Option[Product]] ={
    val query = BSONDocument("_id" -> id)
    productsCollection.flatMap(_.find[BSONDocument, Product](query).one)
  }

  def getAllProducts: Future[Seq[Product]] = {
    val query = BSONDocument()
    productsCollection
      .flatMap(_
        .find[BSONDocument, Product](query)
        .cursor[Product]()
        .collect[List](-1, Cursor.FailOnError[List[Product]]()))
  }

  def save(product: Product) = productsCollection.flatMap(_.insert.one(product))

  def deleteById(id: Int) = {
    val selector = BSONDocument("_id" -> id)
    productsCollection.flatMap(_.delete.one(q = selector))
  }

  implicit def productWriter: BSONDocumentWriter[Product] = Macros.writer[Product]

  implicit def personReader: BSONDocumentReader[Product] = Macros.reader[Product]
}
