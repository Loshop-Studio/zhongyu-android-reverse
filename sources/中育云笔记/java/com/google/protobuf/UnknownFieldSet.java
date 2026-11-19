package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public final class UnknownFieldSet implements MessageLite {
    private final TreeMap<Integer, Field> fields;
    private static final UnknownFieldSet defaultInstance = new UnknownFieldSet(new TreeMap());
    private static final Parser PARSER = new Parser();

    public static final class Builder implements MessageLite.Builder {
        private TreeMap<Integer, Field.Builder> fieldBuilders = new TreeMap<>();

        private Builder() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Builder create() {
            return new Builder();
        }

        private Field.Builder getFieldBuilder(int i10) {
            if (i10 == 0) {
                return null;
            }
            Field.Builder builder = this.fieldBuilders.get(Integer.valueOf(i10));
            if (builder != null) {
                return builder;
            }
            Field.Builder builderNewBuilder = Field.newBuilder();
            this.fieldBuilders.put(Integer.valueOf(i10), builderNewBuilder);
            return builderNewBuilder;
        }

        public Builder addField(int i10, Field field) {
            if (i10 > 0) {
                this.fieldBuilders.put(Integer.valueOf(i10), Field.newBuilder(field));
                return this;
            }
            throw new IllegalArgumentException(i10 + " is not a valid field number.");
        }

        public Map<Integer, Field> asMap() {
            if (this.fieldBuilders.isEmpty()) {
                return Collections.EMPTY_MAP;
            }
            TreeMap treeMap = new TreeMap();
            for (Map.Entry<Integer, Field.Builder> entry : this.fieldBuilders.entrySet()) {
                treeMap.put(entry.getKey(), entry.getValue().build());
            }
            return Collections.unmodifiableMap(treeMap);
        }

        public Builder clearField(int i10) {
            if (i10 > 0) {
                if (this.fieldBuilders.containsKey(Integer.valueOf(i10))) {
                    this.fieldBuilders.remove(Integer.valueOf(i10));
                }
                return this;
            }
            throw new IllegalArgumentException(i10 + " is not a valid field number.");
        }

        public boolean hasField(int i10) {
            return this.fieldBuilders.containsKey(Integer.valueOf(i10));
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder
        public boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return false;
            }
            mergeFrom((InputStream) new AbstractMessageLite.Builder.LimitedInputStream(inputStream, CodedInputStream.readRawVarint32(i10, inputStream)));
            return true;
        }

        public Builder mergeField(int i10, Field field) {
            if (i10 <= 0) {
                throw new IllegalArgumentException(i10 + " is not a valid field number.");
            }
            if (hasField(i10)) {
                getFieldBuilder(i10).mergeFrom(field);
                return this;
            }
            addField(i10, field);
            return this;
        }

        public boolean mergeFieldFrom(int i10, CodedInputStream codedInputStream) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int tagFieldNumber = WireFormat.getTagFieldNumber(i10);
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                getFieldBuilder(tagFieldNumber).addVarint(codedInputStream.readInt64());
                return true;
            }
            if (tagWireType == 1) {
                getFieldBuilder(tagFieldNumber).addFixed64(codedInputStream.readFixed64());
                return true;
            }
            if (tagWireType == 2) {
                getFieldBuilder(tagFieldNumber).addLengthDelimited(codedInputStream.readBytes());
                return true;
            }
            if (tagWireType == 3) {
                Builder builderNewBuilder = UnknownFieldSet.newBuilder();
                codedInputStream.readGroup(tagFieldNumber, builderNewBuilder, ExtensionRegistry.getEmptyRegistry());
                getFieldBuilder(tagFieldNumber).addGroup(builderNewBuilder.build());
                return true;
            }
            if (tagWireType == 4) {
                codedInputStream.checkValidEndTag();
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            getFieldBuilder(tagFieldNumber).addFixed32(codedInputStream.readFixed32());
            return true;
        }

        public Builder mergeLengthDelimitedField(int i10, ByteString byteString) {
            if (i10 > 0) {
                getFieldBuilder(i10).addLengthDelimited(byteString);
                return this;
            }
            throw new IllegalArgumentException(i10 + " is not a valid field number.");
        }

        public Builder mergeVarintField(int i10, int i11) {
            if (i10 > 0) {
                getFieldBuilder(i10).addVarint(i11);
                return this;
            }
            throw new IllegalArgumentException(i10 + " is not a valid field number.");
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public UnknownFieldSet build() {
            if (this.fieldBuilders.isEmpty()) {
                return UnknownFieldSet.getDefaultInstance();
            }
            TreeMap treeMap = new TreeMap();
            for (Map.Entry<Integer, Field.Builder> entry : this.fieldBuilders.entrySet()) {
                treeMap.put(entry.getKey(), entry.getValue().build());
            }
            return new UnknownFieldSet(treeMap);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public UnknownFieldSet buildPartial() {
            return build();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            this.fieldBuilders = new TreeMap<>();
            return this;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UnknownFieldSet getDefaultInstanceForType() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Builder m33981clone() {
            Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            for (Map.Entry<Integer, Field.Builder> entry : this.fieldBuilders.entrySet()) {
                builderNewBuilder.fieldBuilders.put(entry.getKey(), entry.getValue().m33982clone());
            }
            return builderNewBuilder;
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return mergeDelimitedFrom(inputStream);
        }

        public Builder mergeFrom(UnknownFieldSet unknownFieldSet) {
            if (unknownFieldSet != UnknownFieldSet.getDefaultInstance()) {
                for (Map.Entry entry : unknownFieldSet.fields.entrySet()) {
                    mergeField(((Integer) entry.getKey()).intValue(), (Field) entry.getValue());
                }
            }
            return this;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream) {
            int tag;
            do {
                tag = codedInputStream.readTag();
                if (tag == 0) {
                    break;
                }
            } while (mergeFieldFrom(tag, codedInputStream));
            return this;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
                mergeFrom(codedInputStreamNewCodedInput);
                codedInputStreamNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e11);
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(bArr);
                mergeFrom(codedInputStreamNewInstance);
                codedInputStreamNewInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e11);
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(InputStream inputStream) {
            CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(inputStream);
            mergeFrom(codedInputStreamNewInstance);
            codedInputStreamNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return mergeFrom(codedInputStream);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return mergeFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(bArr, i10, i11);
                mergeFrom(codedInputStreamNewInstance);
                codedInputStreamNewInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e11);
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return mergeFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) {
            return mergeFrom(bArr, i10, i11);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return mergeFrom(inputStream);
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public Builder mergeFrom(MessageLite messageLite) {
            if (messageLite instanceof UnknownFieldSet) {
                return mergeFrom((UnknownFieldSet) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public static final class Field {
        private static final Field fieldDefaultInstance = newBuilder().build();
        private List<Integer> fixed32;
        private List<Long> fixed64;
        private List<UnknownFieldSet> group;
        private List<ByteString> lengthDelimited;
        private List<Long> varint;

        public static final class Builder {
            private Field result = new Field();

            private Builder() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public Builder addFixed32(int i10) {
                if (this.result.fixed32 == null) {
                    this.result.fixed32 = new ArrayList();
                }
                this.result.fixed32.add(Integer.valueOf(i10));
                return this;
            }

            public Builder addFixed64(long j10) {
                if (this.result.fixed64 == null) {
                    this.result.fixed64 = new ArrayList();
                }
                this.result.fixed64.add(Long.valueOf(j10));
                return this;
            }

            public Builder addGroup(UnknownFieldSet unknownFieldSet) {
                if (this.result.group == null) {
                    this.result.group = new ArrayList();
                }
                this.result.group.add(unknownFieldSet);
                return this;
            }

            public Builder addLengthDelimited(ByteString byteString) {
                if (this.result.lengthDelimited == null) {
                    this.result.lengthDelimited = new ArrayList();
                }
                this.result.lengthDelimited.add(byteString);
                return this;
            }

            public Builder addVarint(long j10) {
                if (this.result.varint == null) {
                    this.result.varint = new ArrayList();
                }
                this.result.varint.add(Long.valueOf(j10));
                return this;
            }

            public Field build() {
                Field field = new Field();
                if (this.result.varint == null) {
                    field.varint = Collections.EMPTY_LIST;
                } else {
                    field.varint = Collections.unmodifiableList(new ArrayList(this.result.varint));
                }
                if (this.result.fixed32 == null) {
                    field.fixed32 = Collections.EMPTY_LIST;
                } else {
                    field.fixed32 = Collections.unmodifiableList(new ArrayList(this.result.fixed32));
                }
                if (this.result.fixed64 == null) {
                    field.fixed64 = Collections.EMPTY_LIST;
                } else {
                    field.fixed64 = Collections.unmodifiableList(new ArrayList(this.result.fixed64));
                }
                if (this.result.lengthDelimited == null) {
                    field.lengthDelimited = Collections.EMPTY_LIST;
                } else {
                    field.lengthDelimited = Collections.unmodifiableList(new ArrayList(this.result.lengthDelimited));
                }
                if (this.result.group == null) {
                    field.group = Collections.EMPTY_LIST;
                    return field;
                }
                field.group = Collections.unmodifiableList(new ArrayList(this.result.group));
                return field;
            }

            public Builder clear() {
                this.result = new Field();
                return this;
            }

            public Builder mergeFrom(Field field) {
                if (!field.varint.isEmpty()) {
                    if (this.result.varint == null) {
                        this.result.varint = new ArrayList();
                    }
                    this.result.varint.addAll(field.varint);
                }
                if (!field.fixed32.isEmpty()) {
                    if (this.result.fixed32 == null) {
                        this.result.fixed32 = new ArrayList();
                    }
                    this.result.fixed32.addAll(field.fixed32);
                }
                if (!field.fixed64.isEmpty()) {
                    if (this.result.fixed64 == null) {
                        this.result.fixed64 = new ArrayList();
                    }
                    this.result.fixed64.addAll(field.fixed64);
                }
                if (!field.lengthDelimited.isEmpty()) {
                    if (this.result.lengthDelimited == null) {
                        this.result.lengthDelimited = new ArrayList();
                    }
                    this.result.lengthDelimited.addAll(field.lengthDelimited);
                }
                if (!field.group.isEmpty()) {
                    if (this.result.group == null) {
                        this.result.group = new ArrayList();
                    }
                    this.result.group.addAll(field.group);
                }
                return this;
            }

            /* renamed from: clone, reason: merged with bridge method [inline-methods] */
            public Builder m33982clone() {
                Field field = new Field();
                if (this.result.varint == null) {
                    field.varint = null;
                } else {
                    field.varint = new ArrayList(this.result.varint);
                }
                if (this.result.fixed32 == null) {
                    field.fixed32 = null;
                } else {
                    field.fixed32 = new ArrayList(this.result.fixed32);
                }
                if (this.result.fixed64 == null) {
                    field.fixed64 = null;
                } else {
                    field.fixed64 = new ArrayList(this.result.fixed64);
                }
                if (this.result.lengthDelimited == null) {
                    field.lengthDelimited = null;
                } else {
                    field.lengthDelimited = new ArrayList(this.result.lengthDelimited);
                }
                if (this.result.group == null) {
                    field.group = null;
                } else {
                    field.group = new ArrayList(this.result.group);
                }
                Builder builder = new Builder();
                builder.result = field;
                return builder;
            }
        }

        public static Field getDefaultInstance() {
            return fieldDefaultInstance;
        }

        private Object[] getIdentityArray() {
            return new Object[]{this.varint, this.fixed32, this.fixed64, this.lengthDelimited, this.group};
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Field) {
                return Arrays.equals(getIdentityArray(), ((Field) obj).getIdentityArray());
            }
            return false;
        }

        public List<Integer> getFixed32List() {
            return this.fixed32;
        }

        public List<Long> getFixed64List() {
            return this.fixed64;
        }

        public List<UnknownFieldSet> getGroupList() {
            return this.group;
        }

        public List<ByteString> getLengthDelimitedList() {
            return this.lengthDelimited;
        }

        public int getSerializedSize(int i10) {
            int iComputeGroupSize = 0;
            for (int i11 = 0; i11 < this.varint.size(); i11++) {
                iComputeGroupSize += CodedOutputStream.computeUInt64Size(i10, this.varint.get(i11).longValue());
            }
            for (int i12 = 0; i12 < this.fixed32.size(); i12++) {
                iComputeGroupSize += CodedOutputStream.computeFixed32Size(i10, this.fixed32.get(i12).intValue());
            }
            for (int i13 = 0; i13 < this.fixed64.size(); i13++) {
                iComputeGroupSize += CodedOutputStream.computeFixed64Size(i10, this.fixed64.get(i13).longValue());
            }
            for (int i14 = 0; i14 < this.lengthDelimited.size(); i14++) {
                iComputeGroupSize += CodedOutputStream.computeBytesSize(i10, this.lengthDelimited.get(i14));
            }
            for (int i15 = 0; i15 < this.group.size(); i15++) {
                iComputeGroupSize += CodedOutputStream.computeGroupSize(i10, this.group.get(i15));
            }
            return iComputeGroupSize;
        }

        public int getSerializedSizeAsMessageSetExtension(int i10) {
            int iComputeRawMessageSetExtensionSize = 0;
            for (int i11 = 0; i11 < this.lengthDelimited.size(); i11++) {
                iComputeRawMessageSetExtensionSize += CodedOutputStream.computeRawMessageSetExtensionSize(i10, this.lengthDelimited.get(i11));
            }
            return iComputeRawMessageSetExtensionSize;
        }

        public List<Long> getVarintList() {
            return this.varint;
        }

        public int hashCode() {
            return Arrays.hashCode(getIdentityArray());
        }

        public ByteString toByteString(int i10) {
            try {
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize(i10));
                writeTo(i10, codedBuilderNewCodedBuilder.getCodedOutput());
                return codedBuilderNewCodedBuilder.build();
            } catch (IOException e10) {
                throw new RuntimeException("Serializing to a ByteString should never fail with an IOException", e10);
            }
        }

        public void writeAsMessageSetExtensionTo(int i10, CodedOutputStream codedOutputStream) {
            for (int i11 = 0; i11 < this.lengthDelimited.size(); i11++) {
                codedOutputStream.writeRawMessageSetExtension(i10, this.lengthDelimited.get(i11));
            }
        }

        public void writeTo(int i10, CodedOutputStream codedOutputStream) {
            for (int i11 = 0; i11 < this.varint.size(); i11++) {
                codedOutputStream.writeUInt64(i10, this.varint.get(i11).longValue());
            }
            for (int i12 = 0; i12 < this.fixed32.size(); i12++) {
                codedOutputStream.writeFixed32(i10, this.fixed32.get(i12).intValue());
            }
            for (int i13 = 0; i13 < this.fixed64.size(); i13++) {
                codedOutputStream.writeFixed64(i10, this.fixed64.get(i13).longValue());
            }
            for (int i14 = 0; i14 < this.lengthDelimited.size(); i14++) {
                codedOutputStream.writeBytes(i10, this.lengthDelimited.get(i14));
            }
            for (int i15 = 0; i15 < this.group.size(); i15++) {
                codedOutputStream.writeGroup(i10, this.group.get(i15));
            }
        }

        private Field() {
        }

        public static Builder newBuilder(Field field) {
            return newBuilder().mergeFrom(field);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeAsMessageSetExtensionTo(int i10, Writer writer) {
            if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
                for (int size = this.lengthDelimited.size() - 1; size >= 0; size--) {
                    writer.writeMessageSetItem(i10, this.lengthDelimited.get(size));
                }
                return;
            }
            for (int i11 = 0; i11 < this.lengthDelimited.size(); i11++) {
                writer.writeMessageSetItem(i10, this.lengthDelimited.get(i11));
            }
        }

        public void writeTo(int i10, Writer writer) {
            writer.writeInt64List(i10, this.varint, false);
            writer.writeFixed32List(i10, this.fixed32, false);
            writer.writeFixed64List(i10, this.fixed64, false);
            writer.writeBytesList(i10, this.lengthDelimited);
            if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
                for (int i11 = 0; i11 < this.group.size(); i11++) {
                    writer.writeStartGroup(i10);
                    this.group.get(i11).writeTo(writer);
                    writer.writeEndGroup(i10);
                }
                return;
            }
            for (int size = this.group.size() - 1; size >= 0; size--) {
                writer.writeEndGroup(i10);
                this.group.get(size).writeTo(writer);
                writer.writeStartGroup(i10);
            }
        }
    }

    public static final class Parser extends AbstractParser<UnknownFieldSet> {
        @Override // com.google.protobuf.Parser
        public UnknownFieldSet parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            try {
                builderNewBuilder.mergeFrom(codedInputStream);
                return builderNewBuilder.buildPartial();
            } catch (InvalidProtocolBufferException e10) {
                throw e10.setUnfinishedMessage(builderNewBuilder.buildPartial());
            } catch (IOException e11) {
                throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(builderNewBuilder.buildPartial());
            }
        }
    }

    public static UnknownFieldSet getDefaultInstance() {
        return defaultInstance;
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static UnknownFieldSet parseFrom(CodedInputStream codedInputStream) {
        return newBuilder().mergeFrom(codedInputStream).build();
    }

    public Map<Integer, Field> asMap() {
        return this.fields.isEmpty() ? Collections.EMPTY_MAP : (Map) this.fields.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnknownFieldSet) && this.fields.equals(((UnknownFieldSet) obj).fields);
    }

    public Field getField(int i10) {
        Field field = this.fields.get(Integer.valueOf(i10));
        return field == null ? Field.getDefaultInstance() : field;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int serializedSize = 0;
        if (this.fields.isEmpty()) {
            return 0;
        }
        for (Map.Entry<Integer, Field> entry : this.fields.entrySet()) {
            serializedSize += entry.getValue().getSerializedSize(entry.getKey().intValue());
        }
        return serializedSize;
    }

    public int getSerializedSizeAsMessageSet() {
        int serializedSizeAsMessageSetExtension = 0;
        if (this.fields.isEmpty()) {
            return 0;
        }
        for (Map.Entry<Integer, Field> entry : this.fields.entrySet()) {
            serializedSizeAsMessageSetExtension += entry.getValue().getSerializedSizeAsMessageSetExtension(entry.getKey().intValue());
        }
        return serializedSizeAsMessageSetExtension;
    }

    public boolean hasField(int i10) {
        return this.fields.containsKey(Integer.valueOf(i10));
    }

    public int hashCode() {
        if (this.fields.isEmpty()) {
            return 0;
        }
        return this.fields.hashCode();
    }

    public boolean isEmpty() {
        return this.fields.isEmpty();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(bArr);
            writeTo(codedOutputStreamNewInstance);
            codedOutputStreamNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    @Override // com.google.protobuf.MessageLite
    public ByteString toByteString() {
        try {
            ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(codedBuilderNewCodedBuilder.getCodedOutput());
            return codedBuilderNewCodedBuilder.build();
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public String toString() {
        return TextFormat.printer().printToString(this);
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) {
        if (this.fields.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, Field> entry : this.fields.entrySet()) {
            entry.getValue().writeAsMessageSetExtensionTo(entry.getKey().intValue(), codedOutputStream);
        }
    }

    @Override // com.google.protobuf.MessageLite
    public void writeDelimitedTo(OutputStream outputStream) {
        CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputStream);
        codedOutputStreamNewInstance.writeUInt32NoTag(getSerializedSize());
        writeTo(codedOutputStreamNewInstance);
        codedOutputStreamNewInstance.flush();
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.fields.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, Field> entry : this.fields.entrySet()) {
            entry.getValue().writeTo(entry.getKey().intValue(), codedOutputStream);
        }
    }

    private UnknownFieldSet(TreeMap<Integer, Field> treeMap) {
        this.fields = treeMap;
    }

    public static Builder newBuilder(UnknownFieldSet unknownFieldSet) {
        return newBuilder().mergeFrom(unknownFieldSet);
    }

    public static UnknownFieldSet parseFrom(ByteString byteString) {
        return newBuilder().mergeFrom(byteString).build();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public UnknownFieldSet getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return newBuilder().mergeFrom(this);
    }

    public static UnknownFieldSet parseFrom(byte[] bArr) {
        return newBuilder().mergeFrom(bArr).build();
    }

    public static UnknownFieldSet parseFrom(InputStream inputStream) {
        return newBuilder().mergeFrom(inputStream).build();
    }

    public void writeAsMessageSetTo(Writer writer) {
        if (this.fields.isEmpty()) {
            return;
        }
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            for (Map.Entry<Integer, Field> entry : this.fields.descendingMap().entrySet()) {
                entry.getValue().writeAsMessageSetExtensionTo(entry.getKey().intValue(), writer);
            }
            return;
        }
        for (Map.Entry<Integer, Field> entry2 : this.fields.entrySet()) {
            entry2.getValue().writeAsMessageSetExtensionTo(entry2.getKey().intValue(), writer);
        }
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(OutputStream outputStream) {
        CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputStream);
        writeTo(codedOutputStreamNewInstance);
        codedOutputStreamNewInstance.flush();
    }

    public void writeTo(Writer writer) {
        if (this.fields.isEmpty()) {
            return;
        }
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            for (Map.Entry<Integer, Field> entry : this.fields.descendingMap().entrySet()) {
                entry.getValue().writeTo(entry.getKey().intValue(), writer);
            }
            return;
        }
        for (Map.Entry<Integer, Field> entry2 : this.fields.entrySet()) {
            entry2.getValue().writeTo(entry2.getKey().intValue(), writer);
        }
    }
}
