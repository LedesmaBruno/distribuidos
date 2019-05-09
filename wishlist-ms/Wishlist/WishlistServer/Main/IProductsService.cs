using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using EtcdNet;
using Grpc.Core;
using GrpcWishlist;
using Newtonsoft.Json;
using ServiceStack;

namespace Main
{
    public interface IProductsService {
        Task<List<Product>> GetProductsForIDs(List<int> ids);
    }

    public class ProductsServiceImpl : IProductsService {
        private EtcdClient _etcdClient;
        private Random _random;
        private const string key = "/products";

        public ProductsServiceImpl(EtcdClient etcdClient) {
            _etcdClient = etcdClient;
            _random = new Random();
        }

        public async Task<List<Product>> GetProductsForIDs(List<int> ids) {
            var endpoint = await GetEndpoint();
            var channel = new Channel(endpoint, ChannelCredentials.Insecure);
            var service = new ItemsService.ItemsServiceClient(channel);
            var request = new ItemsRequest();
            ids.ForEach(request.Ids.Add);
            return service.GetItems(request).Products.ToList();
        }

        private async Task<string> GetEndpoint() {
            try {
                EtcdResponse resp = await _etcdClient.GetNodeAsync(key);
                var endpointsList = JsonConvert.DeserializeObject<List<string>>(resp.ToString());
                return endpointsList[_random.Next(0, endpointsList.Count)];
            }
            catch(EtcdCommonException.KeyNotFound) {
                Console.Write($"[ERROR] endpoints list not found for key {key}");
                return "";
            }
        }
    }
}