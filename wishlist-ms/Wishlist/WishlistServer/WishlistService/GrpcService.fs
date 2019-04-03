module WishlistService.GrpcService
open System
open Grpc.Core
open GrpcWishlist


    let channel = new Channel(Environment.GetEnvironmentVariable("ITEMS_MS_ENDPOINT"), ChannelCredentials.Insecure)
    let getItemsFromIds (ids: list<int>) =
        let client = new ItemsService.ItemsServiceClient(channel)
        let request = new ItemsRequest()
        request.Ids.AddRange(ids)
        client.GetItems(request)
        
            