package storage

import org.bson.codecs.configuration.CodecRegistries.{fromProviders, fromRegistries}
import org.mongodb.scala.MongoClient
import org.mongodb.scala.bson.codecs.DEFAULT_CODEC_REGISTRY
import org.mongodb.scala.bson.codecs.Macros._
import model._

object MongoDB {

//  private val mongoClient = MongoClient("mongodb://localhost:27017")
  private val mongoClient = MongoClient()
  private val codecRegistry = fromRegistries(fromProviders(classOf[Product]), DEFAULT_CODEC_REGISTRY)
  val DB = mongoClient.getDatabase("product_catalog").withCodecRegistry(codecRegistry)
}
