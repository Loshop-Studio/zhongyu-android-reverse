package p117i1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: i1.h */
/* loaded from: classes3.dex */
public class C7649h extends FilterInputStream {

    /* renamed from: a */
    public int f12897a;

    public C7649h(InputStream inputStream) {
        super(inputStream);
        this.f12897a = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final long m12677a(long j10) {
        int i10 = this.f12897a;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i10 = this.f12897a;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    /* renamed from: f */
    public final void m12678f(long j10) {
        int i10 = this.f12897a;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f12897a = (int) (i10 - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f12897a = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m12677a(1L) == -1) {
            return -1;
        }
        int i10 = super.read();
        m12678f(1L);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f12897a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jM12677a = m12677a(j10);
        if (jM12677a == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM12677a);
        m12678f(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int iM12677a = (int) m12677a(i11);
        if (iM12677a == -1) {
            return -1;
        }
        int i12 = super.read(bArr, i10, iM12677a);
        m12678f(i12);
        return i12;
    }
}
