module WishlistService.RedisService
open ServiceStack.Redis
open System

let redis = new RedisManagerPool(Environment.GetEnvironmentVariable("REDIS_ENDPOINT"))

let GetWishlist id = redis.GetClient().Get<list<int>>(id)
    
let rec add productId wishlist: list<int> =
    match wishlist with
    | [] ->  [productId]
    | l -> productId::wishlist


let rec remove productId wishlist: list<int> =
    match wishlist with
    | [] -> []
    | x::rest -> if x = productId then 
                    (remove productId rest ) 
                 else 
                     x::(remove productId rest )

let rec remove_if l predicate =
    match l with
    | [] -> []
    | x::rest -> if predicate(x) then 
                    (remove_if rest predicate) 
                 else 
                     x::(remove_if rest predicate)

    
    

let storeInRedis userId wishlist = redis.GetClient().Set<list<int>>(userId, wishlist)
    
let AddToWishlist(userId: int, productId: int) =
    GetWishlist(userId.ToString()) |> add(productId) |> storeInRedis(userId.ToString())
    
let RemoveFromWishlist(userId: int, productId: int) =
    GetWishlist(userId.ToString()) |> remove(productId) |> storeInRedis(userId.ToString())