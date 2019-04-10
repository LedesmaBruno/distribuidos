package model

import org.mongodb.scala.bson.annotations.BsonProperty

case class Product(@BsonProperty("_id") id: Int, name: String, description: String)


