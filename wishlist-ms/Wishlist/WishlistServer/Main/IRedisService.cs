using System.Collections.Generic;
using System.Threading.Tasks;
using ServiceStack;
using ServiceStack.Redis;

namespace Main
{
    public interface IRedisService {
        void SetWishlist(int ID, List<int> ids);
        Task<List<int>> GetWishlist(int ID);
    }
    
    public class RedisServiceImpl : IRedisService
    {
        private IRedisClient _client;

        public RedisServiceImpl(IRedisClient client) {
            _client = client;
        }

        public void SetWishlist(int ID, List<int> ids) => _client.SetValue(ID.ToString(), JSON.stringify(ids));

        public async Task<List<int>> GetWishlist(int ID) => _client.Get<List<int>>(ID.ToString());
    }
}