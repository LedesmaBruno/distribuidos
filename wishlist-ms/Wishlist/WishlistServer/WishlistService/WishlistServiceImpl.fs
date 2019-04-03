namespace WishlistService

open Grpc.Core
open System.Threading.Tasks
open GrpcWishlist

module WishlistServiceImpl =
    type WishlistServiceImpl() =
        inherit WishlistService.WishlistServiceBase()
        
        override this.GetWishlist(request: WishlistRequest, context : ServerCallContext) : Task<WishlistResponse> =
            let wishlistIds = RedisService.getWishlist(request.Id.ToString())
            let items = GrpcService.getItemsFromIds(wishlistIds)
            let response =  new WishlistResponse()
            response.Items.AddRange(items.Items)
            response|> Task.FromResult