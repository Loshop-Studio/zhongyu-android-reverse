package p091e1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: e1.b */
/* loaded from: classes3.dex */
public final class C7830b extends FilterInputStream {

    /* renamed from: a */
    public final long f13144a;

    /* renamed from: b */
    public int f13145b;

    public C7830b(InputStream inputStream, long j9) {
        super(inputStream);
        this.f13144a = j9;
    }

    /* renamed from: c */
    public static InputStream m12231c(InputStream inputStream, long j9) {
        return new C7830b(inputStream, j9);
    }

    /* renamed from: a */
    public final int m12232a(int i9) throws IOException {
        if (i9 >= 0) {
            this.f13145b += i9;
            return i9;
        }
        if (this.f13144a - this.f13145b <= 0) {
            return i9;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f13144a + ", but read: " + this.f13145b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f13144a - this.f13145b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i9;
        i9 = super.read();
        m12232a(i9 >= 0 ? 1 : -1);
        return i9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i9, int i10) {
        return m12232a(super.read(bArr, i9, i10));
    }
}
