#!/bin/bash
grpc_tools_node_protoc --js_out=import_style=commonjs,binary:./protoc --grpc_out=./protoc --proto_path=../protobuf/users user.proto