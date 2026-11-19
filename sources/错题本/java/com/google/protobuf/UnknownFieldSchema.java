package com.google.protobuf;

import java.io.IOException;

@CheckReturnValue
/* loaded from: classes3.dex */
abstract class UnknownFieldSchema<T, B> {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    private final void mergeFrom(B b6, Reader reader, int i) throws IOException {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b6, reader, i)) {
        }
    }

    public abstract void addFixed32(B b6, int i, int i8);

    public abstract void addFixed64(B b6, int i, long j7);

    public abstract void addGroup(B b6, int i, T t8);

    public abstract void addLengthDelimited(B b6, int i, ByteString byteString);

    public abstract void addVarint(B b6, int i, long j7);

    public abstract B getBuilderFromMessage(Object obj);

    public abstract T getFromMessage(Object obj);

    public abstract int getSerializedSize(T t8);

    public abstract int getSerializedSizeAsMessageSet(T t8);

    public abstract void makeImmutable(Object obj);

    public abstract T merge(T t8, T t9);

    public final boolean mergeOneFieldFrom(B b6, Reader reader, int i) throws IOException {
        int tag = reader.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(b6, tagFieldNumber, reader.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(b6, tagFieldNumber, reader.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(b6, tagFieldNumber, reader.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(b6, tagFieldNumber, reader.readFixed32());
            return true;
        }
        B bNewBuilder = newBuilder();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        int i8 = i + 1;
        if (i8 >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        mergeFrom(bNewBuilder, reader, i8);
        if (iMakeTag != reader.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(b6, tagFieldNumber, toImmutable(bNewBuilder));
        return true;
    }

    public abstract B newBuilder();

    public abstract void setBuilderToMessage(Object obj, B b6);

    public void setRecursionLimit(int i) {
        recursionLimit = i;
    }

    public abstract void setToMessage(Object obj, T t8);

    public abstract boolean shouldDiscardUnknownFields(Reader reader);

    public abstract T toImmutable(B b6);

    public abstract void writeAsMessageSetTo(T t8, Writer writer) throws IOException;

    public abstract void writeTo(T t8, Writer writer) throws IOException;
}
