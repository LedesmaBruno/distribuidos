module WishlistService.RedisService
open ServiceStack.Redis
open System

let redis = new RedisManagerPool(Environment.GetEnvironmentVariable("REDIS_ENDPOINT"))

let getWishlist(id: string) =
    let database = redis.GetClient()
    database.Get<list<int>>(id)