using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Sockets;
using System.Threading;
using System.Threading.Tasks;
using EtcdNet;
using Grpc.Core;
using GrpcWishlist;
using Newtonsoft.Json;
using ServiceStack;
using ServiceStack.Redis;
using ServiceStack.Text;

namespace Main
{
    public class WishlistApp
    {
        private const int port = 50051;
        static void Main(string[] args) {
            var redisClient = new RedisManagerPool(Environment.GetEnvironmentVariable("REDIS_ENDPOINT")).GetClient();
            var redisService = new RedisServiceImpl(redisClient);
            var etcdEndpoints = JsonConvert.DeserializeObject<string[]>(Environment.GetEnvironmentVariable("ETCD_ENDPOINTS"));
            EtcdClient etcdClient = new EtcdClient(new EtcdClientOpitions(){Urls = etcdEndpoints});
            var productService = new ProductsServiceImpl(etcdClient);
            Server server = new Server();
            server.Services.Add(GrpcWishlist.WishlistService.BindService(new WishlistServiceImpl(redisService, productService)));
            server.Ports.Add(new ServerPort("localhost", port, ServerCredentials.Insecure));

            var ip = Dns.GetHostAddresses(Dns.GetHostName()).ToList().First(i => i.AddressFamily == AddressFamily.InterNetwork);

            Console.WriteLine("Booting server...");
            Console.WriteLine("Press ctrl + C to exit");
            var timer = new Timer(
                (state => HealthCheck(etcdClient, ip.ToString())),
                   null,
                TimeSpan.Zero,
                  TimeSpan.FromSeconds(5));
            Task.Factory.StartNew(() => server.Start());
            var closing = new AutoResetEvent(false);
            var onExit = new ConsoleCancelEventHandler((a, b) => {
                Console.WriteLine("Exit");
                closing.Set();
            });
            Console.CancelKeyPress += onExit;
            closing.WaitOne();
        }

        private static void HealthCheck(EtcdClient etcdClient, string ip) {
            if (JsonConvert.DeserializeObject<List<string>>(etcdClient.GetNodeValueAsync("/products").Result).Count > 0) {
                etcdClient.SetNodeAsync("/wishlist", ip, 5000);
            }
        }
    }
}