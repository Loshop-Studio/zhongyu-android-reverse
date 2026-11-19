package p110n;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: n.j */
/* loaded from: classes3.dex */
public final class C7426j extends InputStream {

    /* renamed from: a */
    public final InputStream f9484a;

    /* renamed from: b */
    public int f9485b = BasicMeasure.EXACTLY;

    public C7426j(InputStream inputStream) {
        this.f9484a = inputStream;
    }

    /* renamed from: a */
    public final int m8463a(int i6) {
        if (i6 == -1) {
            this.f9485b = 0;
        }
        return i6;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f9485b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9484a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return m8463a(this.f9484a.read());
    }

    @Override // java.io.InputStream
    public long skip(long j6) {
        return this.f9484a.skip(j6);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return m8463a(this.f9484a.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i6, int i7) {
        return m8463a(this.f9484a.read(bArr, i6, i7));
    }
}
