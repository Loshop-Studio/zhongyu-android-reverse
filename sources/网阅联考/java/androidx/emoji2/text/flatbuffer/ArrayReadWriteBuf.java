package androidx.emoji2.text.flatbuffer;

import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes.dex */
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
    public byte get(int i4) {
        return this.buffer[i4];
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public boolean getBoolean(int i4) {
        return this.buffer[i4] != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int i4) {
        return Double.longBitsToDouble(getLong(i4));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int i4) {
        return Float.intBitsToFloat(getInt(i4));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int i4) {
        byte[] bArr = this.buffer;
        return (bArr[i4] & UByte.MAX_VALUE) | (bArr[i4 + 3] << 24) | ((bArr[i4 + 2] & UByte.MAX_VALUE) << 16) | ((bArr[i4 + 1] & UByte.MAX_VALUE) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int i4) {
        byte[] bArr = this.buffer;
        long j4 = bArr[i4] & 255;
        int i5 = i4 + 1 + 1 + 1;
        long j5 = j4 | ((bArr[r1] & 255) << 8) | ((bArr[r9] & 255) << 16);
        long j6 = j5 | ((bArr[i5] & 255) << 24);
        long j7 = j6 | ((bArr[r9] & 255) << 32);
        int i6 = i5 + 1 + 1 + 1;
        return j7 | ((bArr[r3] & 255) << 40) | ((255 & bArr[i6]) << 48) | (bArr[i6 + 1] << 56);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int i4) {
        byte[] bArr = this.buffer;
        return (short) ((bArr[i4] & UByte.MAX_VALUE) | (bArr[i4 + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public String getString(int i4, int i5) {
        return Utf8Safe.decodeUtf8Array(this.buffer, i4, i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf, androidx.emoji2.text.flatbuffer.ReadBuf
    public int limit() {
        return this.writePos;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte[] bArr, int i4, int i5) {
        set(this.writePos, bArr, i4, i5);
        this.writePos += i5;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putBoolean(boolean z3) {
        setBoolean(this.writePos, z3);
        this.writePos++;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putDouble(double d4) {
        setDouble(this.writePos, d4);
        this.writePos += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putFloat(float f4) {
        setFloat(this.writePos, f4);
        this.writePos += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putInt(int i4) {
        setInt(this.writePos, i4);
        this.writePos += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putLong(long j4) {
        setLong(this.writePos, j4);
        this.writePos += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putShort(short s3) {
        setShort(this.writePos, s3);
        this.writePos += 2;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public boolean requestCapacity(int i4) {
        byte[] bArr = this.buffer;
        if (bArr.length > i4) {
            return true;
        }
        int length = bArr.length;
        this.buffer = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i4, byte b4) {
        requestCapacity(i4 + 1);
        this.buffer[i4] = b4;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setBoolean(int i4, boolean z3) {
        set(i4, z3 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setDouble(int i4, double d4) {
        requestCapacity(i4 + 8);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d4);
        int i5 = (int) jDoubleToRawLongBits;
        byte[] bArr = this.buffer;
        int i6 = i4 + 1;
        bArr[i4] = (byte) (i5 & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i5 >> 8) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((i5 >> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i5 >> 24) & 255);
        int i10 = (int) (jDoubleToRawLongBits >> 32);
        int i11 = i9 + 1;
        bArr[i9] = (byte) (i10 & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >> 8) & 255);
        bArr[i12] = (byte) ((i10 >> 16) & 255);
        bArr[i12 + 1] = (byte) ((i10 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setFloat(int i4, float f4) {
        requestCapacity(i4 + 4);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f4);
        byte[] bArr = this.buffer;
        int i5 = i4 + 1;
        bArr[i4] = (byte) (iFloatToRawIntBits & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((iFloatToRawIntBits >> 8) & 255);
        bArr[i6] = (byte) ((iFloatToRawIntBits >> 16) & 255);
        bArr[i6 + 1] = (byte) ((iFloatToRawIntBits >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setInt(int i4, int i5) {
        requestCapacity(i4 + 4);
        byte[] bArr = this.buffer;
        int i6 = i4 + 1;
        bArr[i4] = (byte) (i5 & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i5 >> 8) & 255);
        bArr[i7] = (byte) ((i5 >> 16) & 255);
        bArr[i7 + 1] = (byte) ((i5 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setLong(int i4, long j4) {
        requestCapacity(i4 + 8);
        int i5 = (int) j4;
        byte[] bArr = this.buffer;
        int i6 = i4 + 1;
        bArr[i4] = (byte) (i5 & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i5 >> 8) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((i5 >> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i5 >> 24) & 255);
        int i10 = (int) (j4 >> 32);
        int i11 = i9 + 1;
        bArr[i9] = (byte) (i10 & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >> 8) & 255);
        bArr[i12] = (byte) ((i10 >> 16) & 255);
        bArr[i12 + 1] = (byte) ((i10 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setShort(int i4, short s3) {
        requestCapacity(i4 + 2);
        byte[] bArr = this.buffer;
        bArr[i4] = (byte) (s3 & 255);
        bArr[i4 + 1] = (byte) ((s3 >> 8) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int writePosition() {
        return this.writePos;
    }

    public ArrayReadWriteBuf(int i4) {
        this(new byte[i4]);
    }

    public ArrayReadWriteBuf(byte[] bArr) {
        this.buffer = bArr;
        this.writePos = 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte b4) {
        set(this.writePos, b4);
        this.writePos++;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i4, byte[] bArr, int i5, int i6) {
        requestCapacity((i6 - i5) + i4);
        System.arraycopy(bArr, i5, this.buffer, i4, i6);
    }

    public ArrayReadWriteBuf(byte[] bArr, int i4) {
        this.buffer = bArr;
        this.writePos = i4;
    }
}
