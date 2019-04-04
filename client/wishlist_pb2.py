# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: wishlist.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='wishlist.proto',
  package='GrpcWishlist',
  syntax='proto3',
  serialized_options=None,
  serialized_pb=_b('\n\x0ewishlist.proto\x12\x0cGrpcWishlist\"\x1d\n\x0fWishlistRequest\x12\n\n\x02id\x18\x01 \x01(\x05\";\n\x10WishlistResponse\x12\'\n\x08products\x18\x01 \x03(\x0b\x32\x15.GrpcWishlist.Product\"#\n\x07Product\x12\n\n\x02id\x18\x01 \x01(\x05\x12\x0c\n\x04name\x18\x02 \x01(\t\"\x1b\n\x0cItemsRequest\x12\x0b\n\x03ids\x18\x01 \x03(\x05\"8\n\rItemsResponse\x12\'\n\x08products\x18\x01 \x03(\x0b\x32\x15.GrpcWishlist.Product\"7\n\x12WishlistAddRequest\x12\x0e\n\x06userId\x18\x01 \x01(\x05\x12\x11\n\tproductId\x18\x02 \x01(\x05\"\x1a\n\x08Response\x12\x0e\n\x06status\x18\x01 \x01(\x05\"\x06\n\x04Ping\"\x06\n\x04Pong2\xe3\x01\n\x0fWishlistService\x12\x33\n\x07GetPing\x12\x12.GrpcWishlist.Ping\x1a\x12.GrpcWishlist.Pong\"\x00\x12N\n\x0bGetWishlist\x12\x1d.GrpcWishlist.WishlistRequest\x1a\x1e.GrpcWishlist.WishlistResponse\"\x00\x12K\n\rAddToWishList\x12 .GrpcWishlist.WishlistAddRequest\x1a\x16.GrpcWishlist.Response\"\x00\x32S\n\x0cItemsService\x12\x43\n\x08GetItems\x12\x1a.GrpcWishlist.ItemsRequest\x1a\x1b.GrpcWishlist.ItemsResponseb\x06proto3')
)




_WISHLISTREQUEST = _descriptor.Descriptor(
  name='WishlistRequest',
  full_name='GrpcWishlist.WishlistRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='GrpcWishlist.WishlistRequest.id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=32,
  serialized_end=61,
)


_WISHLISTRESPONSE = _descriptor.Descriptor(
  name='WishlistResponse',
  full_name='GrpcWishlist.WishlistResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='products', full_name='GrpcWishlist.WishlistResponse.products', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=63,
  serialized_end=122,
)


_PRODUCT = _descriptor.Descriptor(
  name='Product',
  full_name='GrpcWishlist.Product',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='GrpcWishlist.Product.id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='name', full_name='GrpcWishlist.Product.name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=124,
  serialized_end=159,
)


_ITEMSREQUEST = _descriptor.Descriptor(
  name='ItemsRequest',
  full_name='GrpcWishlist.ItemsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='ids', full_name='GrpcWishlist.ItemsRequest.ids', index=0,
      number=1, type=5, cpp_type=1, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=161,
  serialized_end=188,
)


_ITEMSRESPONSE = _descriptor.Descriptor(
  name='ItemsResponse',
  full_name='GrpcWishlist.ItemsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='products', full_name='GrpcWishlist.ItemsResponse.products', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=190,
  serialized_end=246,
)


_WISHLISTADDREQUEST = _descriptor.Descriptor(
  name='WishlistAddRequest',
  full_name='GrpcWishlist.WishlistAddRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='userId', full_name='GrpcWishlist.WishlistAddRequest.userId', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='productId', full_name='GrpcWishlist.WishlistAddRequest.productId', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=248,
  serialized_end=303,
)


_RESPONSE = _descriptor.Descriptor(
  name='Response',
  full_name='GrpcWishlist.Response',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='status', full_name='GrpcWishlist.Response.status', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=305,
  serialized_end=331,
)


_PING = _descriptor.Descriptor(
  name='Ping',
  full_name='GrpcWishlist.Ping',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=333,
  serialized_end=339,
)


_PONG = _descriptor.Descriptor(
  name='Pong',
  full_name='GrpcWishlist.Pong',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=341,
  serialized_end=347,
)

_WISHLISTRESPONSE.fields_by_name['products'].message_type = _PRODUCT
_ITEMSRESPONSE.fields_by_name['products'].message_type = _PRODUCT
DESCRIPTOR.message_types_by_name['WishlistRequest'] = _WISHLISTREQUEST
DESCRIPTOR.message_types_by_name['WishlistResponse'] = _WISHLISTRESPONSE
DESCRIPTOR.message_types_by_name['Product'] = _PRODUCT
DESCRIPTOR.message_types_by_name['ItemsRequest'] = _ITEMSREQUEST
DESCRIPTOR.message_types_by_name['ItemsResponse'] = _ITEMSRESPONSE
DESCRIPTOR.message_types_by_name['WishlistAddRequest'] = _WISHLISTADDREQUEST
DESCRIPTOR.message_types_by_name['Response'] = _RESPONSE
DESCRIPTOR.message_types_by_name['Ping'] = _PING
DESCRIPTOR.message_types_by_name['Pong'] = _PONG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

WishlistRequest = _reflection.GeneratedProtocolMessageType('WishlistRequest', (_message.Message,), dict(
  DESCRIPTOR = _WISHLISTREQUEST,
  __module__ = 'wishlist_pb2'
  # @@protoc_insertion_point(class_scope:GrpcWishlist.WishlistRequest)
  ))
_sym_db.RegisterMessage(WishlistRequest)

WishlistResponse = _reflection.GeneratedProtocolMessageType('WishlistResponse', (_message.Message,), dict(
  DESCRIPTOR = _WISHLISTRESPONSE,
  __module__ = 'wishlist_pb2'
  # @@protoc_insertion_point(class_scope:GrpcWishlist.WishlistResponse)
  ))
_sym_db.RegisterMessage(WishlistResponse)

Product = _reflection.GeneratedProtocolMessageType('Product', (_message.Message,), dict(
  DESCRIPTOR = _PRODUCT,
  __module__ = 'wishlist_pb2'
  # @@protoc_insertion_point(class_scope:GrpcWishlist.Product)
  ))
_sym_db.RegisterMessage(Product)

ItemsRequest = _reflection.GeneratedProtocolMessageType('ItemsRequest', (_message.Message,), dict(
  DESCRIPTOR = _ITEMSREQUEST,
  __module__ = 'wishlist_pb2'
  # @@protoc_insertion_point(class_scope:GrpcWishlist.ItemsRequest)
  ))
_sym_db.RegisterMessage(ItemsRequest)

ItemsResponse = _reflection.GeneratedProtocolMessageType('ItemsResponse', (_message.Message,), dict(
  DESCRIPTOR = _ITEMSRESPONSE,
  __module__ = 'wishlist_pb2'
  # @@protoc_insertion_point(class_scope:GrpcWishlist.ItemsResponse)
  ))
_sym_db.RegisterMessage(ItemsResponse)

WishlistAddRequest = _reflection.GeneratedProtocolMessageType('WishlistAddRequest', (_message.Message,), dict(
  DESCRIPTOR = _WISHLISTADDREQUEST,
  __module__ = 'wishlist_pb2'
  # @@protoc_insertion_point(class_scope:GrpcWishlist.WishlistAddRequest)
  ))
_sym_db.RegisterMessage(WishlistAddRequest)

Response = _reflection.GeneratedProtocolMessageType('Response', (_message.Message,), dict(
  DESCRIPTOR = _RESPONSE,
  __module__ = 'wishlist_pb2'
  # @@protoc_insertion_point(class_scope:GrpcWishlist.Response)
  ))
_sym_db.RegisterMessage(Response)

Ping = _reflection.GeneratedProtocolMessageType('Ping', (_message.Message,), dict(
  DESCRIPTOR = _PING,
  __module__ = 'wishlist_pb2'
  # @@protoc_insertion_point(class_scope:GrpcWishlist.Ping)
  ))
_sym_db.RegisterMessage(Ping)

Pong = _reflection.GeneratedProtocolMessageType('Pong', (_message.Message,), dict(
  DESCRIPTOR = _PONG,
  __module__ = 'wishlist_pb2'
  # @@protoc_insertion_point(class_scope:GrpcWishlist.Pong)
  ))
_sym_db.RegisterMessage(Pong)



_WISHLISTSERVICE = _descriptor.ServiceDescriptor(
  name='WishlistService',
  full_name='GrpcWishlist.WishlistService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=350,
  serialized_end=577,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetPing',
    full_name='GrpcWishlist.WishlistService.GetPing',
    index=0,
    containing_service=None,
    input_type=_PING,
    output_type=_PONG,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetWishlist',
    full_name='GrpcWishlist.WishlistService.GetWishlist',
    index=1,
    containing_service=None,
    input_type=_WISHLISTREQUEST,
    output_type=_WISHLISTRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='AddToWishList',
    full_name='GrpcWishlist.WishlistService.AddToWishList',
    index=2,
    containing_service=None,
    input_type=_WISHLISTADDREQUEST,
    output_type=_RESPONSE,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_WISHLISTSERVICE)

DESCRIPTOR.services_by_name['WishlistService'] = _WISHLISTSERVICE


_ITEMSSERVICE = _descriptor.ServiceDescriptor(
  name='ItemsService',
  full_name='GrpcWishlist.ItemsService',
  file=DESCRIPTOR,
  index=1,
  serialized_options=None,
  serialized_start=579,
  serialized_end=662,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetItems',
    full_name='GrpcWishlist.ItemsService.GetItems',
    index=0,
    containing_service=None,
    input_type=_ITEMSREQUEST,
    output_type=_ITEMSRESPONSE,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_ITEMSSERVICE)

DESCRIPTOR.services_by_name['ItemsService'] = _ITEMSSERVICE

# @@protoc_insertion_point(module_scope)
