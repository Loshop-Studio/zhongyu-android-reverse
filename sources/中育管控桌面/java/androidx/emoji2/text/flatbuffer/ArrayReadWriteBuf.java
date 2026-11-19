package androidx.emoji2.text.flatbuffer;

import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes2.dex */
public class ArrayReadWriteBuf implements ReadWriteBuf {
    private byte[] buffer;
    private int writePos;

    public ArrayReadWriteBuf() {
        this(10);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte[] data() {
        return this.buffer;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int i6) {
        return this.buffer[i6];
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public boolean getBoolean(int i6) {
        return this.buffer[i6] != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int i6) {
        return Double.longBitsToDouble(getLong(i6));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int i6) {
        return Float.intBitsToFloat(getInt(i6));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int i6) {
        byte[] bArr = this.buffer;
        return (bArr[i6] & UByte.MAX_VALUE) | (bArr[i6 + 3] << 24) | ((bArr[i6 + 2] & UByte.MAX_VALUE) << 16) | ((bArr[i6 + 1] & UByte.MAX_VALUE) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int i6) {
        byte[] bArr = this.buffer;
        int i7 = i6 + 6;
        return (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i7] & 255) << 48) | (bArr[i6 + 7] << 56);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int i6) {
        byte[] bArr = this.buffer;
        return (short) ((bArr[i6] & UByte.MAX_VALUE) | (bArr[i6 + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public String getString(int i6, int i7) {
        return Utf8Safe.decodeUtf8Array(this.buffer, i6, i7);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf, androidx.emoji2.text.flatbuffer.ReadBuf
    public int limit() {
        return this.writePos;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte[] bArr, int i6, int i7) {
        set(this.writePos, bArr, i6, i7);
        this.writePos += i7;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putBoolean(boolean z6) {
        setBoolean(this.writePos, z6);
        this.writePos++;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putDouble(double d6) {
        setDouble(this.writePos, d6);
        this.writePos += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putFloat(float f6) {
        setFloat(this.writePos, f6);
        this.writePos += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putInt(int i6) {
        setInt(this.writePos, i6);
        this.writePos += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putLong(long j6) {
        setLong(this.writePos, j6);
        this.writePos += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putShort(short s6) {
        setShort(this.writePos, s6);
        this.writePos += 2;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public boolean requestCapacity(int i6) {
        byte[] bArr = this.buffer;
        if (bArr.length > i6) {
            return true;
        }
        int length = bArr.length;
        this.buffer = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i6, byte b7) {
        requestCapacity(i6 + 1);
        this.buffer[i6] = b7;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setBoolean(int i6, boolean z6) {
        set(i6, z6 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setDouble(int i6, double d6) {
        requestCapacity(i6 + 8);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d6);
        int i7 = (int) jDoubleToRawLongBits;
        byte[] bArr = this.buffer;
        bArr[i6] = (byte) (i7 & 255);
        bArr[i6 + 1] = (byte) ((i7 >> 8) & 255);
        bArr[i6 + 2] = (byte) ((i7 >> 16) & 255);
        bArr[i6 + 3] = (byte) ((i7 >> 24) & 255);
        int i8 = (int) (jDoubleToRawLongBits >> 32);
        bArr[i6 + 4] = (byte) (i8 & 255);
        bArr[i6 + 5] = (byte) ((i8 >> 8) & 255);
        bArr[i6 + 6] = (byte) ((i8 >> 16) & 255);
        bArr[i6 + 7] = (byte) ((i8 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setFloat(int i6, float f6) {
        requestCapacity(i6 + 4);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f6);
        byte[] bArr = this.buffer;
        bArr[i6] = (byte) (iFloatToRawIntBits & 255);
        bArr[i6 + 1] = (byte) ((iFloatToRawIntBits >> 8) & 255);
        bArr[i6 + 2] = (byte) ((iFloatToRawIntBits >> 16) & 255);
        bArr[i6 + 3] = (byte) ((iFloatToRawIntBits >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setInt(int i6, int i7) {
        requestCapacity(i6 + 4);
        byte[] bArr = this.buffer;
        bArr[i6] = (byte) (i7 & 255);
        bArr[i6 + 1] = (byte) ((i7 >> 8) & 255);
        bArr[i6 + 2] = (byte) ((i7 >> 16) & 255);
        bArr[i6 + 3] = (byte) ((i7 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setLong(int i6, long j6) {
        requestCapacity(i6 + 8);
        int i7 = (int) j6;
        byte[] bArr = this.buffer;
        bArr[i6] = (byte) (i7 & 255);
        bArr[i6 + 1] = (byte) ((i7 >> 8) & 255);
        bArr[i6 + 2] = (byte) ((i7 >> 16) & 255);
        bArr[i6 + 3] = (byte) ((i7 >> 24) & 255);
        int i8 = (int) (j6 >> 32);
        bArr[i6 + 4] = (byte) (i8 & 255);
        bArr[i6 + 5] = (byte) ((i8 >> 8) & 255);
        bArr[i6 + 6] = (byte) ((i8 >> 16) & 255);
        bArr[i6 + 7] = (byte) ((i8 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setShort(int i6, short s6) {
        requestCapacity(i6 + 2);
        byte[] bArr = this.buffer;
        bArr[i6] = (byte) (s6 & 255);
        bArr[i6 + 1] = (byte) ((s6 >> 8) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int writePosition() {
        return this.writePos;
    }

    public ArrayReadWriteBuf(int i6) {
        this(new byte[i6]);
    }

    public ArrayReadWriteBuf(byte[] bArr) {
        this.buffer = bArr;
        this.writePos = 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte b7) {
        set(this.writePos, b7);
        this.writePos++;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i6, byte[] bArr, int i7, int i8) {
        requestCapacity((i8 - i7) + i6);
        System.arraycopy(bArr, i7, this.buffer, i6, i8);
    }

    public ArrayReadWriteBuf(byte[] bArr, int i6) {
        this.buffer = bArr;
        this.writePos = i6;
    }
}
