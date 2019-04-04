namespace WishlistService

open Grpc.Core
open System.Threading.Tasks
open GrpcWishlist

module WishlistServiceImpl =
    type WishlistServiceImpl() =
        inherit WishlistService.WishlistServiceBase()
        
       
        override this.GetPing(request: Ping, context: ServerCallContext) : Task<Pong> =
            new Pong()|> Task.FromResult
        
        override this.AddToWishList( request: WishlistAddRequest, context: ServerCallContext) : Task<Response> =
            RedisService.AddToWishlist(request.UserId, request.ProductId) |> ignore
            new Response(Status = 200)|> Task.FromResult
        
        override this.GetWishlist(request: WishlistRequest, context : ServerCallContext) : Task<WishlistResponse> =
            let wishlistIds = RedisService.GetWishlist(request.Id.ToString())
            let items = GrpcService.getItemsFromIds(wishlistIds)
            let response =  new WishlistResponse()
            response.Products.AddRange(items.Products)
            response|> Task.FromResult