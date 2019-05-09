using System.Linq;
using System.Threading.Tasks;
using Grpc.Core;
using GrpcWishlist;

namespace Main
{
    public class WishlistServiceImpl : GrpcWishlist.WishlistService.WishlistServiceBase
    {
        private IRedisService _redisService;
        private IProductsService _productsService;

        public WishlistServiceImpl(IRedisService redisService, IProductsService productsService) {
            _redisService = redisService;
            _productsService = productsService;
        }

        public override Task<Pong> GetPing(Ping request, ServerCallContext context) {
            return Task.FromResult(new Pong());
        }

        public override async Task<WishlistResponse> GetWishlist(WishlistRequest request, ServerCallContext context) {
            var response = new WishlistResponse();
            var wishlist = await _redisService.GetWishlist(request.Id);
            var products = await _productsService.GetProductsForIDs(wishlist);
            products.ForEach(response.Products.Add);
            return response;
        }

        public override async Task<Response> AddToWishList(WishlistAddRequest request, ServerCallContext context) {
            var ids = await _redisService.GetWishlist(request.UserId);
            ids.Add(request.ProductId);
            _redisService.SetWishlist(request.UserId, ids);
            return new Response(){Status = 200};
        }

        public override async Task<Response> RemoveFromWishlist(WishlistAddRequest request, ServerCallContext context) {
            var ids = await _redisService.GetWishlist(request.UserId);
            ids.Remove(request.ProductId);
            _redisService.SetWishlist(request.UserId, ids);
            return new Response(){Status = 200};
        }
    }
}