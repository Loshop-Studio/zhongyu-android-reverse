package p109d1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: d1.b */
/* loaded from: classes3.dex */
public final class C8901b extends FilterInputStream {

    /* renamed from: c */
    public final long f20863c;

    /* renamed from: d */
    public int f20864d;

    public C8901b(InputStream inputStream, long j10) {
        super(inputStream);
        this.f20863c = j10;
    }

    /* renamed from: c */
    public static InputStream m17442c(InputStream inputStream, long j10) {
        return new C8901b(inputStream, j10);
    }

    /* renamed from: a */
    public final int m17443a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f20864d += i10;
            return i10;
        }
        if (this.f20863c - this.f20864d <= 0) {
            return i10;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f20863c + ", but read: " + this.f20864d);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f20863c - this.f20864d, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i10;
        i10 = super.read();
        m17443a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        return m17443a(super.read(bArr, i10, i11));
    }
}
