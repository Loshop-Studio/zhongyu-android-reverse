package androidx.emoji2.text.flatbuffer;

/* loaded from: classes2.dex */
interface ReadWriteBuf extends ReadBuf {
    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    int limit();

    void put(byte b6);

    void put(byte[] bArr, int i, int i8);

    void putBoolean(boolean z8);

    void putDouble(double d9);

    void putFloat(float f);

    void putInt(int i);

    void putLong(long j7);

    void putShort(short s8);

    boolean requestCapacity(int i);

    void set(int i, byte b6);

    void set(int i, byte[] bArr, int i8, int i9);

    void setBoolean(int i, boolean z8);

    void setDouble(int i, double d9);

    void setFloat(int i, float f);

    void setInt(int i, int i8);

    void setLong(int i, long j7);

    void setShort(int i, short s8);

    int writePosition();
}
