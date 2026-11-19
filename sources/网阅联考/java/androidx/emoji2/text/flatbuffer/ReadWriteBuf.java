package androidx.emoji2.text.flatbuffer;

/* loaded from: classes.dex */
interface ReadWriteBuf extends ReadBuf {
    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    int limit();

    void put(byte b4);

    void put(byte[] bArr, int i4, int i5);

    void putBoolean(boolean z3);

    void putDouble(double d4);

    void putFloat(float f4);

    void putInt(int i4);

    void putLong(long j4);

    void putShort(short s3);

    boolean requestCapacity(int i4);

    void set(int i4, byte b4);

    void set(int i4, byte[] bArr, int i5, int i6);

    void setBoolean(int i4, boolean z3);

    void setDouble(int i4, double d4);

    void setFloat(int i4, float f4);

    void setInt(int i4, int i5);

    void setLong(int i4, long j4);

    void setShort(int i4, short s3);

    int writePosition();
}
