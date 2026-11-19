package p117i1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: i1.b */
/* loaded from: classes3.dex */
public final class C7643b extends FilterInputStream {

    /* renamed from: a */
    public final long f12881a;

    /* renamed from: b */
    public int f12882b;

    public C7643b(InputStream inputStream, long j10) {
        super(inputStream);
        this.f12881a = j10;
    }

    /* renamed from: f */
    public static InputStream m12657f(InputStream inputStream, long j10) {
        return new C7643b(inputStream, j10);
    }

    /* renamed from: a */
    public final int m12658a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f12882b += i10;
            return i10;
        }
        if (this.f12881a - this.f12882b <= 0) {
            return i10;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f12881a + ", but read: " + this.f12882b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f12881a - this.f12882b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i10;
        i10 = super.read();
        m12658a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        return m12658a(super.read(bArr, i10, i11));
    }
}
