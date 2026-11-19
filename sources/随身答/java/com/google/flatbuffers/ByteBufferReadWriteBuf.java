package com.google.flatbuffers;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public class ByteBufferReadWriteBuf implements ReadWriteBuf {
    private final ByteBuffer buffer;

    public ByteBufferReadWriteBuf(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // com.google.flatbuffers.ReadBuf
    public byte[] data() {
        return this.buffer.array();
    }

    @Override // com.google.flatbuffers.ReadBuf
    public byte get(int i9) {
        return this.buffer.get(i9);
    }

    @Override // com.google.flatbuffers.ReadBuf
    public boolean getBoolean(int i9) {
        return get(i9) != 0;
    }

    @Override // com.google.flatbuffers.ReadBuf
    public double getDouble(int i9) {
        return this.buffer.getDouble(i9);
    }

    @Override // com.google.flatbuffers.ReadBuf
    public float getFloat(int i9) {
        return this.buffer.getFloat(i9);
    }

    @Override // com.google.flatbuffers.ReadBuf
    public int getInt(int i9) {
        return this.buffer.getInt(i9);
    }

    @Override // com.google.flatbuffers.ReadBuf
    public long getLong(int i9) {
        return this.buffer.getLong(i9);
    }

    @Override // com.google.flatbuffers.ReadBuf
    public short getShort(int i9) {
        return this.buffer.getShort(i9);
    }

    @Override // com.google.flatbuffers.ReadBuf
    public String getString(int i9, int i10) {
        return Utf8Safe.decodeUtf8Buffer(this.buffer, i9, i10);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf, com.google.flatbuffers.ReadBuf
    public int limit() {
        return this.buffer.limit();
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void put(byte[] bArr, int i9, int i10) {
        this.buffer.put(bArr, i9, i10);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void putBoolean(boolean z9) {
        this.buffer.put(z9 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void putDouble(double d10) {
        this.buffer.putDouble(d10);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void putFloat(float f10) {
        this.buffer.putFloat(f10);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void putInt(int i9) {
        this.buffer.putInt(i9);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void putLong(long j9) {
        this.buffer.putLong(j9);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void putShort(short s9) {
        this.buffer.putShort(s9);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public boolean requestCapacity(int i9) {
        return i9 <= this.buffer.limit();
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void set(int i9, byte b10) {
        requestCapacity(i9 + 1);
        this.buffer.put(i9, b10);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void setBoolean(int i9, boolean z9) {
        set(i9, z9 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void setDouble(int i9, double d10) {
        requestCapacity(i9 + 8);
        this.buffer.putDouble(i9, d10);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void setFloat(int i9, float f10) {
        requestCapacity(i9 + 4);
        this.buffer.putFloat(i9, f10);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void setInt(int i9, int i10) {
        requestCapacity(i9 + 4);
        this.buffer.putInt(i9, i10);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void setLong(int i9, long j9) {
        requestCapacity(i9 + 8);
        this.buffer.putLong(i9, j9);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void setShort(int i9, short s9) {
        requestCapacity(i9 + 2);
        this.buffer.putShort(i9, s9);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public int writePosition() {
        return this.buffer.position();
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void put(byte b10) {
        this.buffer.put(b10);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void set(int i9, byte[] bArr, int i10, int i11) {
        requestCapacity((i11 - i10) + i9);
        int iPosition = this.buffer.position();
        this.buffer.position(i9);
        this.buffer.put(bArr, i10, i11);
        this.buffer.position(iPosition);
    }
}
