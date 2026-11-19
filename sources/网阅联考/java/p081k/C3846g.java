package p081k;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* renamed from: k.g */
/* loaded from: classes2.dex */
public final class C3846g extends FilterInputStream {

    /* renamed from: c */
    public static final byte[] f4744c;

    /* renamed from: d */
    public static final int f4745d;

    /* renamed from: e */
    public static final int f4746e;

    /* renamed from: a */
    public final byte f4747a;

    /* renamed from: b */
    public int f4748b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f4744c = bArr;
        int length = bArr.length;
        f4745d = length;
        f4746e = length + 2;
    }

    public C3846g(InputStream inputStream, int i4) {
        super(inputStream);
        if (i4 >= -1 && i4 <= 8) {
            this.f4747a = (byte) i4;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i4;
        int i5 = this.f4748b;
        int i6 = (i5 < 2 || i5 > (i4 = f4746e)) ? super.read() : i5 == i4 ? this.f4747a : f4744c[i5 - 2] & UByte.MAX_VALUE;
        if (i6 != -1) {
            this.f4748b++;
        }
        return i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        long jSkip = super.skip(j4);
        if (jSkip > 0) {
            this.f4748b = (int) (this.f4748b + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int i6;
        int i7 = this.f4748b;
        int i8 = f4746e;
        if (i7 > i8) {
            i6 = super.read(bArr, i4, i5);
        } else if (i7 == i8) {
            bArr[i4] = this.f4747a;
            i6 = 1;
        } else if (i7 < 2) {
            i6 = super.read(bArr, i4, 2 - i7);
        } else {
            int iMin = Math.min(i8 - i7, i5);
            System.arraycopy(f4744c, this.f4748b - 2, bArr, i4, iMin);
            i6 = iMin;
        }
        if (i6 > 0) {
            this.f4748b += i6;
        }
        return i6;
    }
}
