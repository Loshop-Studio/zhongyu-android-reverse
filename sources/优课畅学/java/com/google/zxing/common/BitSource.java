package com.google.zxing.common;

/* loaded from: classes4.dex */
public final class BitSource {
    private int bitOffset;
    private int byteOffset;
    private final byte[] bytes;

    public BitSource(byte[] bArr) {
        this.bytes = bArr;
    }

    public int available() {
        return ((this.bytes.length - this.byteOffset) * 8) - this.bitOffset;
    }

    public int getBitOffset() {
        return this.bitOffset;
    }

    public int getByteOffset() {
        return this.byteOffset;
    }

    public int readBits(int i10) {
        if (i10 <= 0 || i10 > 32 || i10 > available()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.bitOffset;
        int i12 = 0;
        if (i11 > 0) {
            int i13 = 8 - i11;
            int i14 = i10 < i13 ? i10 : i13;
            int i15 = i13 - i14;
            byte[] bArr = this.bytes;
            int i16 = this.byteOffset;
            int i17 = (((255 >> (8 - i14)) << i15) & bArr[i16]) >> i15;
            i10 -= i14;
            int i18 = i11 + i14;
            this.bitOffset = i18;
            if (i18 == 8) {
                this.bitOffset = 0;
                this.byteOffset = i16 + 1;
            }
            i12 = i17;
        }
        if (i10 > 0) {
            while (i10 >= 8) {
                int i19 = i12 << 8;
                byte[] bArr2 = this.bytes;
                int i20 = this.byteOffset;
                i12 = (bArr2[i20] & 255) | i19;
                this.byteOffset = i20 + 1;
                i10 -= 8;
            }
            if (i10 > 0) {
                int i21 = 8 - i10;
                int i22 = ((((255 >> i21) << i21) & this.bytes[this.byteOffset]) >> i21) | (i12 << i10);
                this.bitOffset += i10;
                return i22;
            }
        }
        return i12;
    }
}
