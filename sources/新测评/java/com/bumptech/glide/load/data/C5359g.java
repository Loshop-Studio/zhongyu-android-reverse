package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* renamed from: com.bumptech.glide.load.data.g */
/* loaded from: classes3.dex */
public final class C5359g extends FilterInputStream {

    /* renamed from: c */
    public static final byte[] f3505c;

    /* renamed from: d */
    public static final int f3506d;

    /* renamed from: e */
    public static final int f3507e;

    /* renamed from: a */
    public final byte f3508a;

    /* renamed from: b */
    public int f3509b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f3505c = bArr;
        int length = bArr.length;
        f3506d = length;
        f3507e = length + 2;
    }

    public C5359g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f3508a = (byte) i10;
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
        int i11 = this.f3509b;
        int i12 = (i11 < 2 || i11 > (i10 = f3507e)) ? super.read() : i11 == i10 ? this.f3508a : f3505c[i11 - 2] & UByte.MAX_VALUE;
        if (i12 != -1) {
            this.f3509b++;
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
            this.f3509b = (int) (this.f3509b + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f3509b;
        int i14 = f3507e;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f3508a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int iMin = Math.min(i14 - i13, i11);
            System.arraycopy(f3505c, this.f3509b - 2, bArr, i10, iMin);
            i12 = iMin;
        }
        if (i12 > 0) {
            this.f3509b += i12;
        }
        return i12;
    }
}
