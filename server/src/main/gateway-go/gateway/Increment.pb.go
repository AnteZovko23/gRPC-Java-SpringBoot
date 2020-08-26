// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.12.4
// source: Increment.proto

package gateway

import (
	context "context"
	proto "github.com/golang/protobuf/proto"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

type DynamicIncrementRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Number int32 `protobuf:"varint,1,opt,name=number,proto3" json:"number,omitempty"`
	Step   int32 `protobuf:"varint,2,opt,name=step,proto3" json:"step,omitempty"`
}

func (x *DynamicIncrementRequest) Reset() {
	*x = DynamicIncrementRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_Increment_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DynamicIncrementRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DynamicIncrementRequest) ProtoMessage() {}

func (x *DynamicIncrementRequest) ProtoReflect() protoreflect.Message {
	mi := &file_Increment_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DynamicIncrementRequest.ProtoReflect.Descriptor instead.
func (*DynamicIncrementRequest) Descriptor() ([]byte, []int) {
	return file_Increment_proto_rawDescGZIP(), []int{0}
}

func (x *DynamicIncrementRequest) GetNumber() int32 {
	if x != nil {
		return x.Number
	}
	return 0
}

func (x *DynamicIncrementRequest) GetStep() int32 {
	if x != nil {
		return x.Step
	}
	return 0
}

type IncrementReply struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	ReplyNumber int32 `protobuf:"varint,1,opt,name=replyNumber,proto3" json:"replyNumber,omitempty"`
}

func (x *IncrementReply) Reset() {
	*x = IncrementReply{}
	if protoimpl.UnsafeEnabled {
		mi := &file_Increment_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *IncrementReply) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*IncrementReply) ProtoMessage() {}

func (x *IncrementReply) ProtoReflect() protoreflect.Message {
	mi := &file_Increment_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use IncrementReply.ProtoReflect.Descriptor instead.
func (*IncrementReply) Descriptor() ([]byte, []int) {
	return file_Increment_proto_rawDescGZIP(), []int{1}
}

func (x *IncrementReply) GetReplyNumber() int32 {
	if x != nil {
		return x.ReplyNumber
	}
	return 0
}

var File_Increment_proto protoreflect.FileDescriptor

var file_Increment_proto_rawDesc = []byte{
	0x0a, 0x0f, 0x49, 0x6e, 0x63, 0x72, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x12, 0x0c, 0x63, 0x6f, 0x6d, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x6c, 0x69, 0x62, 0x1a,
	0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f,
	0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x45, 0x0a,
	0x17, 0x44, 0x79, 0x6e, 0x61, 0x6d, 0x69, 0x63, 0x49, 0x6e, 0x63, 0x72, 0x65, 0x6d, 0x65, 0x6e,
	0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x6e, 0x75, 0x6d, 0x62,
	0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x06, 0x6e, 0x75, 0x6d, 0x62, 0x65, 0x72,
	0x12, 0x12, 0x0a, 0x04, 0x73, 0x74, 0x65, 0x70, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x52, 0x04,
	0x73, 0x74, 0x65, 0x70, 0x22, 0x32, 0x0a, 0x0e, 0x49, 0x6e, 0x63, 0x72, 0x65, 0x6d, 0x65, 0x6e,
	0x74, 0x52, 0x65, 0x70, 0x6c, 0x79, 0x12, 0x20, 0x0a, 0x0b, 0x72, 0x65, 0x70, 0x6c, 0x79, 0x4e,
	0x75, 0x6d, 0x62, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0b, 0x72, 0x65, 0x70,
	0x6c, 0x79, 0x4e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x32, 0xa8, 0x01, 0x0a, 0x10, 0x44, 0x79, 0x6e,
	0x61, 0x6d, 0x69, 0x63, 0x49, 0x6e, 0x63, 0x72, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x12, 0x93, 0x01,
	0x0a, 0x09, 0x69, 0x6e, 0x63, 0x72, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x12, 0x25, 0x2e, 0x63, 0x6f,
	0x6d, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x6c, 0x69, 0x62, 0x2e, 0x44, 0x79, 0x6e, 0x61, 0x6d,
	0x69, 0x63, 0x49, 0x6e, 0x63, 0x72, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x1a, 0x1c, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x6c, 0x69,
	0x62, 0x2e, 0x49, 0x6e, 0x63, 0x72, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x52, 0x65, 0x70, 0x6c, 0x79,
	0x22, 0x41, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x3b, 0x12, 0x39, 0x2f, 0x72, 0x65, 0x73, 0x74, 0x47,
	0x61, 0x74, 0x65, 0x77, 0x61, 0x79, 0x2f, 0x44, 0x79, 0x6e, 0x61, 0x6d, 0x69, 0x63, 0x49, 0x6e,
	0x63, 0x72, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x2f, 0x6e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x2f, 0x7b,
	0x6e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x7d, 0x2f, 0x73, 0x74, 0x65, 0x70, 0x2f, 0x7b, 0x73, 0x74,
	0x65, 0x70, 0x7d, 0x42, 0x39, 0x0a, 0x1a, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x4c,
	0x69, 0x62, 0x2e, 0x67, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x64, 0x53, 0x74, 0x75, 0x62,
	0x73, 0x42, 0x10, 0x49, 0x6e, 0x63, 0x72, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x42, 0x75, 0x69, 0x6c,
	0x64, 0x65, 0x72, 0x5a, 0x09, 0x2e, 0x3b, 0x67, 0x61, 0x74, 0x65, 0x77, 0x61, 0x79, 0x62, 0x06,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_Increment_proto_rawDescOnce sync.Once
	file_Increment_proto_rawDescData = file_Increment_proto_rawDesc
)

func file_Increment_proto_rawDescGZIP() []byte {
	file_Increment_proto_rawDescOnce.Do(func() {
		file_Increment_proto_rawDescData = protoimpl.X.CompressGZIP(file_Increment_proto_rawDescData)
	})
	return file_Increment_proto_rawDescData
}

var file_Increment_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_Increment_proto_goTypes = []interface{}{
	(*DynamicIncrementRequest)(nil), // 0: com.protolib.DynamicIncrementRequest
	(*IncrementReply)(nil),          // 1: com.protolib.IncrementReply
}
var file_Increment_proto_depIdxs = []int32{
	0, // 0: com.protolib.DynamicIncrement.increment:input_type -> com.protolib.DynamicIncrementRequest
	1, // 1: com.protolib.DynamicIncrement.increment:output_type -> com.protolib.IncrementReply
	1, // [1:2] is the sub-list for method output_type
	0, // [0:1] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_Increment_proto_init() }
func file_Increment_proto_init() {
	if File_Increment_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_Increment_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DynamicIncrementRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_Increment_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*IncrementReply); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_Increment_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_Increment_proto_goTypes,
		DependencyIndexes: file_Increment_proto_depIdxs,
		MessageInfos:      file_Increment_proto_msgTypes,
	}.Build()
	File_Increment_proto = out.File
	file_Increment_proto_rawDesc = nil
	file_Increment_proto_goTypes = nil
	file_Increment_proto_depIdxs = nil
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConnInterface

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion6

// DynamicIncrementClient is the client API for DynamicIncrement service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type DynamicIncrementClient interface {
	Increment(ctx context.Context, in *DynamicIncrementRequest, opts ...grpc.CallOption) (*IncrementReply, error)
}

type dynamicIncrementClient struct {
	cc grpc.ClientConnInterface
}

func NewDynamicIncrementClient(cc grpc.ClientConnInterface) DynamicIncrementClient {
	return &dynamicIncrementClient{cc}
}

func (c *dynamicIncrementClient) Increment(ctx context.Context, in *DynamicIncrementRequest, opts ...grpc.CallOption) (*IncrementReply, error) {
	out := new(IncrementReply)
	err := c.cc.Invoke(ctx, "/com.protolib.DynamicIncrement/increment", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// DynamicIncrementServer is the server API for DynamicIncrement service.
type DynamicIncrementServer interface {
	Increment(context.Context, *DynamicIncrementRequest) (*IncrementReply, error)
}

// UnimplementedDynamicIncrementServer can be embedded to have forward compatible implementations.
type UnimplementedDynamicIncrementServer struct {
}

func (*UnimplementedDynamicIncrementServer) Increment(context.Context, *DynamicIncrementRequest) (*IncrementReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Increment not implemented")
}

func RegisterDynamicIncrementServer(s *grpc.Server, srv DynamicIncrementServer) {
	s.RegisterService(&_DynamicIncrement_serviceDesc, srv)
}

func _DynamicIncrement_Increment_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DynamicIncrementRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DynamicIncrementServer).Increment(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/com.protolib.DynamicIncrement/Increment",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DynamicIncrementServer).Increment(ctx, req.(*DynamicIncrementRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _DynamicIncrement_serviceDesc = grpc.ServiceDesc{
	ServiceName: "com.protolib.DynamicIncrement",
	HandlerType: (*DynamicIncrementServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "increment",
			Handler:    _DynamicIncrement_Increment_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "Increment.proto",
}