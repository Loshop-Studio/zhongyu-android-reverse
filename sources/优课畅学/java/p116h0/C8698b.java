package p116h0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: h0.b */
/* loaded from: classes3.dex */
public final class C8698b extends FilterInputStream {

    /* renamed from: a */
    public final long f16305a;

    /* renamed from: b */
    public int f16306b;

    public C8698b(InputStream inputStream, long j10) {
        super(inputStream);
        this.f16305a = j10;
    }

    /* renamed from: b */
    public static InputStream m14155b(InputStream inputStream, long j10) {
        return new C8698b(inputStream, j10);
    }

    /* renamed from: a */
    public final int m14156a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f16306b += i10;
            return i10;
        }
        if (this.f16305a - this.f16306b <= 0) {
            return i10;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f16305a + ", but read: " + this.f16306b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f16305a - this.f16306b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i10;
        i10 = super.read();
        m14156a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        return m14156a(super.read(bArr, i10, i11));
    }
}
