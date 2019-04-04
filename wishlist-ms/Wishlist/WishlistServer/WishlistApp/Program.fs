module WishlistApp.Program

open Grpc.Core
open System

module Program = 
    open System.Threading
    open System.Threading.Tasks
    open GrpcWishlist
    open WishlistService.WishlistServiceImpl

    [<EntryPoint>]
    let main argv = 
        let port = 50051
        let server = new Server()
        server.Services.Add(WishlistService.BindService(new WishlistServiceImpl()))
        server.Ports.Add(new ServerPort("localhost", port, ServerCredentials.Insecure)) |> ignore
        Console.WriteLine("Booting server...")
        Console.WriteLine("Press ctrl + C to exit")
        Task.Factory.StartNew(fun () -> server.Start()) |> ignore
        let closing = new AutoResetEvent(false)
        let onExit = new ConsoleCancelEventHandler(fun _ args -> Console.WriteLine("Exit"); closing.Set() |> ignore)
        Console.CancelKeyPress.AddHandler onExit
        closing.WaitOne() |> ignore
        0