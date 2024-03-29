# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: summarization.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='summarization.proto',
  package='',
  syntax='proto3',
  serialized_options=None,
  serialized_pb=_b('\n\x13summarization.proto\"\x18\n\x06Speech\x12\x0e\n\x06speech\x18\x01 \x01(\t\"\"\n\x10SummarizedSpeech\x12\x0e\n\x06speech\x18\x01 \x01(\t2C\n\x14SummarizationService\x12+\n\rSummarizeText\x12\x07.Speech\x1a\x11.SummarizedSpeechb\x06proto3')
)




_SPEECH = _descriptor.Descriptor(
  name='Speech',
  full_name='Speech',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='speech', full_name='Speech.speech', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_start=23,
  serialized_end=47,
)


_SUMMARIZEDSPEECH = _descriptor.Descriptor(
  name='SummarizedSpeech',
  full_name='SummarizedSpeech',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='speech', full_name='SummarizedSpeech.speech', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_start=49,
  serialized_end=83,
)

DESCRIPTOR.message_types_by_name['Speech'] = _SPEECH
DESCRIPTOR.message_types_by_name['SummarizedSpeech'] = _SUMMARIZEDSPEECH
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Speech = _reflection.GeneratedProtocolMessageType('Speech', (_message.Message,), dict(
  DESCRIPTOR = _SPEECH,
  __module__ = 'summarization_pb2'
  # @@protoc_insertion_point(class_scope:Speech)
  ))
_sym_db.RegisterMessage(Speech)

SummarizedSpeech = _reflection.GeneratedProtocolMessageType('SummarizedSpeech', (_message.Message,), dict(
  DESCRIPTOR = _SUMMARIZEDSPEECH,
  __module__ = 'summarization_pb2'
  # @@protoc_insertion_point(class_scope:SummarizedSpeech)
  ))
_sym_db.RegisterMessage(SummarizedSpeech)



_SUMMARIZATIONSERVICE = _descriptor.ServiceDescriptor(
  name='SummarizationService',
  full_name='SummarizationService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=85,
  serialized_end=152,
  methods=[
  _descriptor.MethodDescriptor(
    name='SummarizeText',
    full_name='SummarizationService.SummarizeText',
    index=0,
    containing_service=None,
    input_type=_SPEECH,
    output_type=_SUMMARIZEDSPEECH,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_SUMMARIZATIONSERVICE)

DESCRIPTOR.services_by_name['SummarizationService'] = _SUMMARIZATIONSERVICE

# @@protoc_insertion_point(module_scope)
