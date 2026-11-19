package org.android.spdy;

import java.util.Arrays;

/* loaded from: classes.dex */
public class SpdyByteArray implements Comparable<SpdyByteArray> {
    private byte[] byteArray;
    int dataLength;
    int length;

    SpdyByteArray() {
        this.byteArray = null;
        this.length = 0;
        this.dataLength = 0;
    }

    public byte[] getByteArray() {
        return this.byteArray;
    }

    public int getDataLength() {
        return this.dataLength;
    }

    public void recycle() {
        Arrays.fill(this.byteArray, (byte) 0);
        this.dataLength = 0;
        SpdyBytePool.getInstance().recycle(this);
    }

    void setByteArrayDataLength(int i4) {
        this.dataLength = i4;
    }

    @Override // java.lang.Comparable
    public int compareTo(SpdyByteArray spdyByteArray) {
        int i4 = this.length;
        int i5 = spdyByteArray.length;
        if (i4 != i5) {
            return i4 - i5;
        }
        if (this.byteArray == null) {
            return -1;
        }
        if (spdyByteArray.byteArray == null) {
            return 1;
        }
        return hashCode() - spdyByteArray.hashCode();
    }

    SpdyByteArray(int i4) {
        this.byteArray = new byte[i4];
        this.length = i4;
        this.dataLength = 0;
    }
}
