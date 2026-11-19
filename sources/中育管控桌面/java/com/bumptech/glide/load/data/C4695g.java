package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* renamed from: com.bumptech.glide.load.data.g */
/* loaded from: classes3.dex */
public final class C4695g extends FilterInputStream {

    /* renamed from: c */
    public static final byte[] f2296c;

    /* renamed from: d */
    public static final int f2297d;

    /* renamed from: e */
    public static final int f2298e;

    /* renamed from: a */
    public final byte f2299a;

    /* renamed from: b */
    public int f2300b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f2296c = bArr;
        int length = bArr.length;
        f2297d = length;
        f2298e = length + 2;
    }

    public C4695g(InputStream inputStream, int i6) {
        super(inputStream);
        if (i6 >= -1 && i6 <= 8) {
            this.f2299a = (byte) i6;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i6);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i6;
        int i7 = this.f2300b;
        int i8 = (i7 < 2 || i7 > (i6 = f2298e)) ? super.read() : i7 == i6 ? this.f2299a : f2296c[i7 - 2] & UByte.MAX_VALUE;
        if (i8 != -1) {
            this.f2300b++;
        }
        return i8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j6) throws IOException {
        long jSkip = super.skip(j6);
        if (jSkip > 0) {
            this.f2300b = (int) (this.f2300b + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i6, int i7) throws IOException {
        int i8;
        int i9 = this.f2300b;
        int i10 = f2298e;
        if (i9 > i10) {
            i8 = super.read(bArr, i6, i7);
        } else if (i9 == i10) {
            bArr[i6] = this.f2299a;
            i8 = 1;
        } else if (i9 < 2) {
            i8 = super.read(bArr, i6, 2 - i9);
        } else {
            int iMin = Math.min(i10 - i9, i7);
            System.arraycopy(f2296c, this.f2300b - 2, bArr, i6, iMin);
            i8 = iMin;
        }
        if (i8 > 0) {
            this.f2300b += i8;
        }
        return i8;
    }
}
