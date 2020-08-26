    protoc \
\
        --proto_path=.protop/path/AdditionServiceV2 \
\
        --plugin=protoc-gen-go=proto-plugin/protoc-gen-go \
\
        --plugin=protoc-gen-grpc-gateway=proto-plugin/protoc-gen-grpc-gateway \
\
        --plugin=protoc-gen-swagger=proto-plugin/protoc-gen-swagger \
\
        --go_out=plugins=grpc:src/main/gateway-go/gateway \
\
        --swagger_out=src/main/gateway-go/swagger \
\
        --grpc-gateway_out=logtostderr=true:src/main/gateway-go/gateway \
\
        .protop/path/AdditionServiceV2/*.proto
