
cd /home/antezovko23/Desktop/grpcImproved/library/src/main/java/com

rm -rf grpcLib

cd /home/antezovko23/Desktop/grpcImproved/library



    protoc \
\
        --proto_path=.protop/path/AdditionServiceV2 \
\
        --java_out=src/main/java \
\
        --plugin=protoc-gen-grpc-java=/home/antezovko23/Desktop/protoGen/protoc-gen-grpc-java.exe \
\
        --grpc-java_out=src/main/java \
\
        .protop/path/AdditionServiceV2/*.proto



cd /home/antezovko23/Desktop/grpcImproved/library