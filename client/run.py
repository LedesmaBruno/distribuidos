import grpc
import product_pb2_grpc as product_grpc
import product_pb2 as product_models

import wishlist_pb2_grpc as wishlist_grpc
import wishlist_pb2 as wishlist_models
import time


class LoadBalancedGRPC:

    def __init__(self,ips,grpc_service):
        self.grpc_service = grpc_service
        self.ips = ips
        self.count = 0
        self.healthy_stubs = []
        for ip in ips:
            self.healthy_stubs.append({
                'stub': self.grpc_service.create_stub(ip),
                'errors': 0
            })

        self.unhealthy_stubs = []
        self.cursor = 0

    def call(self,params):
        return self.__call(params,0)

    def __call(self,params,retries):
        self.count += 1


        print('Cursor ' + str(self.cursor))
        print('Health hosts ' + str(len(self.healthy_stubs)))
        print('Unhealthy hosts ' + str(len(self.unhealthy_stubs)))

        if self.count % 3 is 0:
            # We should trigger a full async refresh
            self.refresh()

        if len(self.healthy_stubs) is 0 or retries > 2:
            # We should trigger a full async refresh
            return None

        response = self.grpc_service.real_call(params,self.healthy_stubs[self.cursor]['stub'])

        if response['status'] is 'error':
            self.healthy_stubs[self.cursor]['errors'] += 1
            if self.healthy_stubs[self.cursor]['errors'] > 2:
                print('Killing stub after 3 consecutive errors')
                self.unhealthy_stubs.append(self.healthy_stubs.pop(self.cursor))
            else:
                print('Try with the next one')
                self.cursor += 1
                self.cursor = self.cursor % len(self.healthy_stubs)
            return self.__call(params,retries + 1)

        self.healthy_stubs[self.cursor]['errors'] = 0
        self.cursor += 1
        self.cursor = self.cursor % len(self.healthy_stubs)

        return response

    def refresh(self):
        unhealthy_stub = self.unhealthy_stubs.pop()
        response = self.grpc_service.healthcheck(unhealthy_stub['stub'])
        if response['status'] is 'ok':
            self.healthy_stubs.append(unhealthy_stub)
        else:
            self.unhealthy_stubs.append(unhealthy_stub)

class GetProductService(LoadBalancedGRPC):
    def __init__(self, ips):
        super().__init__(ips,self)

    def create_stub(self,host):
        print('Creating stub for host: ' + host)
        channel = grpc.insecure_channel(host)
        return product_grpc.ProductServiceStub(channel)

    def real_call(self, params, stub):
        print('Calling real call')
        try:
            response = stub.GetProduct(product_models.GetProductRequest(id = params['id']), timeout= 1)
            return {
                'response': response,
                'status': 'ok'
            }
        except grpc.RpcError as e:
            print(e)
            return {
                'status':'error'
            }

    def healthcheck(self, stub):
        try:
            print('Calling healthcheck')
            response = stub.HealthCheck(product_models.Ping(), timeout= 1)
            return {
                'response': response,
                'status': 'ok'
            }
        except grpc.RpcError as e:
            print(e)
            return {
                'status':'error'
            }


class GetWishListService(LoadBalancedGRPC):
    def __init__(self, ips):
        super().__init__(ips,self)

    def create_stub(self,host):
        print('Creating stub for host: ' + host)
        channel = grpc.insecure_channel(host)
        return wishlist_grpc.WishlistServiceStub(channel)

    def real_call(self, params, stub):
        print('Calling real call')
        try:
            response = stub.GetWishlist(wishlist_models.WishlistRequest(id = params['id']), timeout= 1)
            return {
                'response': response,
                'status': 'ok'
            }
        except grpc.RpcError as e:
            print(e)
            return {
                'status':'error'
            }

    def healthcheck(self, stub):
        try:
            print('Calling healthcheck')
            response = stub.HealthCheck(product_models.Ping(), timeout= 1)
            return {
                'response': response,
                'status': 'ok'
            }
        except grpc.RpcError as e:
            print(e)
            return {
                'status':'error'
            }


class AddToWishListService(LoadBalancedGRPC):
    def __init__(self, ips):
        super().__init__(ips,self)

    def create_stub(self,host):
        print('Creating stub for host: ' + host)
        channel = grpc.insecure_channel(host)
        return wishlist_grpc.WishlistServiceStub(channel)

    def real_call(self, params, stub):
        print('Calling real call')
        try:
            response = stub.AddToWishList(wishlist_models.WishlistAddRequest(userId = params['userId'],productId = params['productId']), timeout= 1)
            return {
                'response': response,
                'status': 'ok'
            }
        except grpc.RpcError as e:
            print(e)
            return {
                'status':'error'
            }

    def healthcheck(self, stub):
        try:
            print('Calling healthcheck')
            response = stub.HealthCheck(product_models.Ping(), timeout= 1)
            return {
                'response': response,
                'status': 'ok'
            }
        except grpc.RpcError as e:
            print(e)
            return {
                'status':'error'
            }


import os

if __name__ == "__main__":
    product_service_ips = [os.environ.get('PRODUCT_ENDPOINT')]
    wishlist_service_ips = [os.environ.get('WISHLIST_ENDPOINT')]

    product_service_ips.extend(['192.168.0.1:9090','192.168.0.1:9091','192.168.0.1:9092'])
    wishlist_service_ips.extend(['192.168.0.1:9090','192.168.0.1:9091','192.168.0.1:9092'])

    get_product_service = GetProductService(product_service_ips)
    get_wishlist_service = GetWishListService(wishlist_service_ips)
    add_wishlist_service = AddToWishListService(wishlist_service_ips)


    for i in range(1,100):
        get_product_service.call({'id':1})
        time.sleep(1)