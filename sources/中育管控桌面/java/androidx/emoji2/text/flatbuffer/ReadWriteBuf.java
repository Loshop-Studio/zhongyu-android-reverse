package androidx.emoji2.text.flatbuffer;

/* loaded from: classes2.dex */
interface ReadWriteBuf extends ReadBuf {
    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    int limit();

    void put(byte b7);

    void put(byte[] bArr, int i6, int i7);

    void putBoolean(boolean z6);

    void putDouble(double d6);

    void putFloat(float f6);

    void putInt(int i6);

    void putLong(long j6);

    void putShort(short s6);

    boolean requestCapacity(int i6);

    void set(int i6, byte b7);

    void set(int i6, byte[] bArr, int i7, int i8);

    void setBoolean(int i6, boolean z6);

    void setDouble(int i6, double d6);

    void setFloat(int i6, float f6);

    void setInt(int i6, int i7);

    void setLong(int i6, long j6);

    void setShort(int i6, short s6);

    int writePosition();
}
