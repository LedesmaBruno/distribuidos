package storage

import reactivemongo.api.collections.bson.BSONCollection
import reactivemongo.api.{DefaultDB, MongoConnection, MongoDriver}

import scala.concurrent.{ExecutionContext, Future}

object MongoDB {

  implicit val exContext = ExecutionContext.global

  private val ip = System.getenv("MONGO_IP")
  private val mongoUri = "mongodb://" + ip + ":27017/product_catalog"
  private val driver = new MongoDriver()

  // Connect to the database: Must be done only once per application
  private val DB = for {
    parsedUri <- Future.fromTry(MongoConnection.parseURI(mongoUri))
    connection = driver.connection(parsedUri)
    databaseName <- Future(parsedUri.db.get)
    database <- connection.database(databaseName)
  } yield database

  def getDB: Future[DefaultDB] = DB

  def getCollection(collectionName: String): Future[BSONCollection] = getDB.map(_.collection(collectionName))

}