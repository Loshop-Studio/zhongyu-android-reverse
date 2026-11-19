package p062g0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: g0.b */
/* loaded from: classes2.dex */
public final class C3742b extends FilterInputStream {

    /* renamed from: a */
    public final long f4379a;

    /* renamed from: b */
    public int f4380b;

    public C3742b(InputStream inputStream, long j4) {
        super(inputStream);
        this.f4379a = j4;
    }

    /* renamed from: b */
    public static InputStream m4743b(InputStream inputStream, long j4) {
        return new C3742b(inputStream, j4);
    }

    /* renamed from: a */
    public final int m4744a(int i4) throws IOException {
        if (i4 >= 0) {
            this.f4380b += i4;
        } else if (this.f4379a - this.f4380b > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f4379a + ", but read: " + this.f4380b);
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f4379a - this.f4380b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i4;
        i4 = super.read();
        m4744a(i4 >= 0 ? 1 : -1);
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i4, int i5) {
        return m4744a(super.read(bArr, i4, i5));
    }
}
