package model

import reactivemongo.bson.Macros.Annotations.Key


case class Product(@Key("_id") id: Int, name: String, description: String)


