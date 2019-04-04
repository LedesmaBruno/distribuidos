python -m grpc_tools.protoc -I../protobuf/wishlist --python_out=. --grpc_python_out=. ../protobuf/wishlist/wishlist.proto
python -m grpc_tools.protoc -I../protobuf/users --python_out=. --grpc_python_out=. ../protobuf/users/user.proto
python -m grpc_tools.protoc -I../protobuf/product-catalog --python_out=. --grpc_python_out=. ../protobuf/product-catalog/product.proto