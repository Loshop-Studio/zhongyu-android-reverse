package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;

@CheckReturnValue
/* loaded from: classes4.dex */
public interface Message extends MessageLite, MessageOrBuilder {

    public interface Builder extends MessageLite.Builder, MessageOrBuilder {
        @CanIgnoreReturnValue
        Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        Message build();

        Message buildPartial();

        @CanIgnoreReturnValue
        Builder clear();

        @CanIgnoreReturnValue
        Builder clearField(Descriptors.FieldDescriptor fieldDescriptor);

        @CanIgnoreReturnValue
        Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor);

        /* renamed from: clone */
        Builder mo24685clone();

        @Override // com.google.protobuf.MessageOrBuilder
        Descriptors.Descriptor getDescriptorForType();

        Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor);

        Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i9);

        @Override // com.google.protobuf.MessageLite.Builder
        boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

        @Override // com.google.protobuf.MessageLite.Builder
        boolean mergeDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(ByteString byteString) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(CodedInputStream codedInputStream) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(Message message);

        @CanIgnoreReturnValue
        Builder mergeFrom(InputStream inputStream) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] bArr, int i9, int i10) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] bArr, int i9, int i10, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet);

        Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor);

        @CanIgnoreReturnValue
        Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        @CanIgnoreReturnValue
        Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj);

        @CanIgnoreReturnValue
        Builder setUnknownFields(UnknownFieldSet unknownFieldSet);
    }

    boolean equals(Object obj);

    Parser<? extends Message> getParserForType();

    int hashCode();

    Builder newBuilderForType();

    Builder toBuilder();

    String toString();
}
