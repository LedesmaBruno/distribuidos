module WishlistApp.Program

open Grpc.Core
open System

module Program = 
    open GrpcWishlist
    open WishlistService.WishlistServiceImpl

    [<EntryPoint>]
    let main argv = 
        let port = 50051
        let server = new Server()
        server.Services.Add(WishlistService.BindService(new WishlistServiceImpl()))
        server.Ports.Add(new ServerPort("localhost", port, ServerCredentials.Insecure)) |> ignore
        server.Start()

        Console.WriteLine("Press any key to stop the server...")
        Console.ReadKey() |> ignore

        server.ShutdownAsync().Wait()
        0
