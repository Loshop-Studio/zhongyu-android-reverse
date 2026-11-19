package p180v0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: v0.b */
/* loaded from: classes2.dex */
public final class C6655b extends FilterInputStream {

    /* renamed from: a */
    public final long f11226a;

    /* renamed from: b */
    public int f11227b;

    public C6655b(InputStream inputStream, long j7) {
        super(inputStream);
        this.f11226a = j7;
    }

    /* renamed from: a */
    public final void m6314a(int i) throws IOException {
        if (i >= 0) {
            this.f11227b += i;
            return;
        }
        long j7 = this.f11227b;
        long j8 = this.f11226a;
        if (j8 - j7 <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j8 + ", but read: " + this.f11227b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f11226a - this.f11227b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        m6314a(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i8) {
        int i9;
        i9 = super.read(bArr, i, i8);
        m6314a(i9);
        return i9;
    }
}
