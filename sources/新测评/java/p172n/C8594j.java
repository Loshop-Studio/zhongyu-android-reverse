package p172n;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: n.j */
/* loaded from: classes3.dex */
public final class C8594j extends InputStream {

    /* renamed from: a */
    public final InputStream f14231a;

    /* renamed from: b */
    public int f14232b = 1073741824;

    public C8594j(InputStream inputStream) {
        this.f14231a = inputStream;
    }

    /* renamed from: a */
    public final int m14142a(int i10) {
        if (i10 == -1) {
            this.f14232b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f14232b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14231a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return m14142a(this.f14231a.read());
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.f14231a.skip(j10);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return m14142a(this.f14231a.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return m14142a(this.f14231a.read(bArr, i10, i11));
    }
}
