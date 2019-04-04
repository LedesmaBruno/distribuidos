module WishlistService.RedisService
open ServiceStack.Redis
open System

let redis = new RedisManagerPool(Environment.GetEnvironmentVariable("REDIS_ENDPOINT"))

let GetWishlist id = redis.GetClient().Get<list<int>>(id)
    
let add productId wishlist: list<int> =
    match wishlist with
    | [] ->  [productId]
    | l -> productId::wishlist
    
let storeInRedis userId wishlist = redis.GetClient().Set<list<int>>(userId, wishlist)
    
let AddToWishlist(userId: int, productId: int) =
    GetWishlist(userId.ToString()) |> add(productId) |> storeInRedis(userId.ToString())