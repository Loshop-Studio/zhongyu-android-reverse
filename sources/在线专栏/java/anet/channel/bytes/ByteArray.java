package anet.channel.bytes;

import anet.channel.bytes.C0860a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class ByteArray implements Comparable<ByteArray> {
    final byte[] buffer;
    int bufferLength;
    int dataLength;

    private ByteArray(byte[] bArr, int i4) {
        bArr = bArr == null ? new byte[i4] : bArr;
        this.buffer = bArr;
        this.bufferLength = bArr.length;
        this.dataLength = i4;
    }

    public static ByteArray create(int i4) {
        return new ByteArray(null, i4);
    }

    public static ByteArray wrap(byte[] bArr, int i4) {
        if (bArr == null || i4 < 0 || i4 > bArr.length) {
            return null;
        }
        return new ByteArray(bArr, i4);
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public int getBufferLength() {
        return this.bufferLength;
    }

    public int getDataLength() {
        return this.dataLength;
    }

    public int readFrom(InputStream inputStream) throws IOException {
        int i4 = inputStream.read(this.buffer, 0, this.bufferLength);
        this.dataLength = i4 != -1 ? i4 : 0;
        return i4;
    }

    public void recycle() {
        if (this.bufferLength == 0) {
            return;
        }
        C0860a.a.f5072a.m4386a(this);
    }

    public void setDataLength(int i4) {
        this.dataLength = i4;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.buffer, 0, this.dataLength);
    }

    @Override // java.lang.Comparable
    public int compareTo(ByteArray byteArray) {
        int i4 = this.bufferLength;
        int i5 = byteArray.bufferLength;
        if (i4 != i5) {
            return i4 - i5;
        }
        if (this.buffer == null) {
            return -1;
        }
        if (byteArray.buffer == null) {
            return 1;
        }
        return hashCode() - byteArray.hashCode();
    }

    public static ByteArray wrap(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return wrap(bArr, bArr.length);
    }
}
