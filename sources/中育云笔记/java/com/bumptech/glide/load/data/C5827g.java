package com.bumptech.glide.load.data;

import com.tendcloud.tenddata.C7863av;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.g */
/* loaded from: classes3.dex */
public final class C5827g extends FilterInputStream {

    /* renamed from: e */
    public static final byte[] f4708e;

    /* renamed from: f */
    public static final int f4709f;

    /* renamed from: g */
    public static final int f4710g;

    /* renamed from: c */
    public final byte f4711c;

    /* renamed from: d */
    public int f4712d;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f4708e = bArr;
        int length = bArr.length;
        f4709f = length;
        f4710g = length + 2;
    }

    public C5827g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f4711c = (byte) i10;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i10;
        int i11 = this.f4712d;
        int i12 = (i11 < 2 || i11 > (i10 = f4710g)) ? super.read() : i11 == i10 ? this.f4711c : f4708e[i11 - 2] & C7863av.f14384i;
        if (i12 != -1) {
            this.f4712d++;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        if (jSkip > 0) {
            this.f4712d = (int) (this.f4712d + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f4712d;
        int i14 = f4710g;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f4711c;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int iMin = Math.min(i14 - i13, i11);
            System.arraycopy(f4708e, this.f4712d - 2, bArr, i10, iMin);
            i12 = iMin;
        }
        if (i12 > 0) {
            this.f4712d += i12;
        }
        return i12;
    }
}
