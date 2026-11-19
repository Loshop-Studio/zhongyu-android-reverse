package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes3.dex */
abstract class UnknownFieldSchema<T, B> {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    private final void mergeFrom(B b7, Reader reader, int i6) {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b7, reader, i6)) {
        }
    }

    public abstract void addFixed32(B b7, int i6, int i7);

    public abstract void addFixed64(B b7, int i6, long j6);

    public abstract void addGroup(B b7, int i6, T t6);

    public abstract void addLengthDelimited(B b7, int i6, ByteString byteString);

    public abstract void addVarint(B b7, int i6, long j6);

    public abstract B getBuilderFromMessage(Object obj);

    public abstract T getFromMessage(Object obj);

    public abstract int getSerializedSize(T t6);

    public abstract int getSerializedSizeAsMessageSet(T t6);

    public abstract void makeImmutable(Object obj);

    public abstract T merge(T t6, T t7);

    public final boolean mergeOneFieldFrom(B b7, Reader reader, int i6) throws InvalidProtocolBufferException {
        int tag = reader.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(b7, tagFieldNumber, reader.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(b7, tagFieldNumber, reader.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(b7, tagFieldNumber, reader.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                if (i6 != 0) {
                    return false;
                }
                throw InvalidProtocolBufferException.invalidEndTag();
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(b7, tagFieldNumber, reader.readFixed32());
            return true;
        }
        B bNewBuilder = newBuilder();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        int i7 = i6 + 1;
        if (i7 >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        mergeFrom(bNewBuilder, reader, i7);
        if (iMakeTag != reader.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(b7, tagFieldNumber, toImmutable(bNewBuilder));
        return true;
    }

    public abstract B newBuilder();

    public abstract void setBuilderToMessage(Object obj, B b7);

    public void setRecursionLimit(int i6) {
        recursionLimit = i6;
    }

    public abstract void setToMessage(Object obj, T t6);

    public abstract boolean shouldDiscardUnknownFields(Reader reader);

    public abstract T toImmutable(B b7);

    public abstract void writeAsMessageSetTo(T t6, Writer writer);

    public abstract void writeTo(T t6, Writer writer);
}
