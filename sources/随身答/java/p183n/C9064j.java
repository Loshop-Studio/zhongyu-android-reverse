package p183n;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: n.j */
/* loaded from: classes3.dex */
public final class C9064j extends InputStream {

    /* renamed from: a */
    public final InputStream f15247a;

    /* renamed from: b */
    public int f15248b = 1073741824;

    public C9064j(InputStream inputStream) {
        this.f15247a = inputStream;
    }

    /* renamed from: a */
    public final int m14533a(int i9) {
        if (i9 == -1) {
            this.f15248b = 0;
        }
        return i9;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f15248b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15247a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return m14533a(this.f15247a.read());
    }

    @Override // java.io.InputStream
    public long skip(long j9) {
        return this.f15247a.skip(j9);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return m14533a(this.f15247a.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) {
        return m14533a(this.f15247a.read(bArr, i9, i10));
    }
}
