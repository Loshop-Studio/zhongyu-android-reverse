package p016b1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: b1.b */
/* loaded from: classes3.dex */
public final class C4400b extends FilterInputStream {

    /* renamed from: a */
    public final long f1248a;

    /* renamed from: b */
    public int f1249b;

    public C4400b(InputStream inputStream, long j6) {
        super(inputStream);
        this.f1248a = j6;
    }

    /* renamed from: c */
    public static InputStream m1412c(InputStream inputStream, long j6) {
        return new C4400b(inputStream, j6);
    }

    /* renamed from: a */
    public final int m1413a(int i6) throws IOException {
        if (i6 >= 0) {
            this.f1249b += i6;
            return i6;
        }
        if (this.f1248a - this.f1249b <= 0) {
            return i6;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f1248a + ", but read: " + this.f1249b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f1248a - this.f1249b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i6;
        i6 = super.read();
        m1413a(i6 >= 0 ? 1 : -1);
        return i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i6, int i7) {
        return m1413a(super.read(bArr, i6, i7));
    }
}
