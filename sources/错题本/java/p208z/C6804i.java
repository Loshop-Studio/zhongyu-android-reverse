package p208z;

import android.support.v4.media.AbstractC0037f;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: z.i */
/* loaded from: classes2.dex */
public final class C6804i extends FilterInputStream {

    /* renamed from: c */
    public static final byte[] f11476c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: d */
    public static final int f11477d = 31;

    /* renamed from: a */
    public final byte f11478a;

    /* renamed from: b */
    public int f11479b;

    public C6804i(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "Cannot add invalid orientation: "));
        }
        this.f11478a = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i;
        int i8 = this.f11479b;
        int i9 = (i8 < 2 || i8 > (i = f11477d)) ? super.read() : i8 == i ? this.f11478a : f11476c[i8 - 2] & 255;
        if (i9 != -1) {
            this.f11479b++;
        }
        return i9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j7) throws IOException {
        long jSkip = super.skip(j7);
        if (jSkip > 0) {
            this.f11479b = (int) (this.f11479b + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i8) throws IOException {
        int i9;
        int i10 = this.f11479b;
        int i11 = f11477d;
        if (i10 > i11) {
            i9 = super.read(bArr, i, i8);
        } else if (i10 == i11) {
            bArr[i] = this.f11478a;
            i9 = 1;
        } else if (i10 < 2) {
            i9 = super.read(bArr, i, 2 - i10);
        } else {
            int iMin = Math.min(i11 - i10, i8);
            System.arraycopy(f11476c, this.f11479b - 2, bArr, i, iMin);
            i9 = iMin;
        }
        if (i9 > 0) {
            this.f11479b += i9;
        }
        return i9;
    }
}
