package p132i0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* renamed from: i0.g */
/* loaded from: classes3.dex */
public final class C8118g extends FilterInputStream {

    /* renamed from: c */
    public static final byte[] f13876c;

    /* renamed from: d */
    public static final int f13877d;

    /* renamed from: e */
    public static final int f13878e;

    /* renamed from: a */
    public final byte f13879a;

    /* renamed from: b */
    public int f13880b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f13876c = bArr;
        int length = bArr.length;
        f13877d = length;
        f13878e = length + 2;
    }

    public C8118g(InputStream inputStream, int i9) {
        super(inputStream);
        if (i9 >= -1 && i9 <= 8) {
            this.f13879a = (byte) i9;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i9);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i9;
        int i10 = this.f13880b;
        int i11 = (i10 < 2 || i10 > (i9 = f13878e)) ? super.read() : i10 == i9 ? this.f13879a : f13876c[i10 - 2] & UByte.MAX_VALUE;
        if (i11 != -1) {
            this.f13880b++;
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j9) throws IOException {
        long jSkip = super.skip(j9);
        if (jSkip > 0) {
            this.f13880b = (int) (this.f13880b + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        int i11;
        int i12 = this.f13880b;
        int i13 = f13878e;
        if (i12 > i13) {
            i11 = super.read(bArr, i9, i10);
        } else if (i12 == i13) {
            bArr[i9] = this.f13879a;
            i11 = 1;
        } else if (i12 < 2) {
            i11 = super.read(bArr, i9, 2 - i12);
        } else {
            int iMin = Math.min(i13 - i12, i10);
            System.arraycopy(f13876c, this.f13880b - 2, bArr, i9, iMin);
            i11 = iMin;
        }
        if (i11 > 0) {
            this.f13880b += i11;
        }
        return i11;
    }
}
