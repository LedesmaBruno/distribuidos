package storage

import com.mongodb.client.model.Filters
import model.Product
import org.mongodb.scala.MongoCollection

import scala.concurrent.Future

object ProductRepository {

  private val productsCollection: MongoCollection[Product] = MongoDB.DB.getCollection("products")

  def getProductById(id: Int): Future[Option[Product]] =
    productsCollection find Filters.eq("_id", id) first() toFutureOption

  def getAllProducts: Future[Seq[Product]] = productsCollection find() toFuture

  def save(product: Product) = {
    productsCollection insertOne product toFutureOption()
    //    productsCollection insertOne product subscribe(
    //      (_: Completed) => println("New Product was saved successfully."),
    //      (e: Throwable) => throw new RuntimeException(e),
    //      () => Unit
    //    )
  }

  def deleteById(id: Int) = {
    productsCollection deleteOne Filters.eq("_id", id) toFutureOption()
    //    productsCollection deleteOne Filters.eq ("_id", id) subscribe (
    //      (result : DeleteResult) => println("Product with ID: " + id + " was deleted successfully."),
    //      (e: Throwable) => throw new RuntimeException(e),
    //      () => Unit
    //    )
  }
}
