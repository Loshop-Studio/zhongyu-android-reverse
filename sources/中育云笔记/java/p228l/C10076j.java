package p228l;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: l.j */
/* loaded from: classes3.dex */
public final class C10076j extends InputStream {

    /* renamed from: c */
    public final InputStream f24089c;

    /* renamed from: d */
    public int f24090d = 1073741824;

    public C10076j(InputStream inputStream) {
        this.f24089c = inputStream;
    }

    /* renamed from: a */
    public final int m21075a(int i10) {
        if (i10 == -1) {
            this.f24090d = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f24090d;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f24089c.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return m21075a(this.f24089c.read());
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.f24089c.skip(j10);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return m21075a(this.f24089c.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return m21075a(this.f24089c.read(bArr, i10, i11));
    }
}
