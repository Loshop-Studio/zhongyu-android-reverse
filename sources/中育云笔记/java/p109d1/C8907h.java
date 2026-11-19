package p109d1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: d1.h */
/* loaded from: classes3.dex */
public class C8907h extends FilterInputStream {

    /* renamed from: c */
    public int f20879c;

    public C8907h(InputStream inputStream) {
        super(inputStream);
        this.f20879c = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final long m17462a(long j10) {
        int i10 = this.f20879c;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i10 = this.f20879c;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    /* renamed from: c */
    public final void m17463c(long j10) {
        int i10 = this.f20879c;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f20879c = (int) (i10 - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f20879c = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m17462a(1L) == -1) {
            return -1;
        }
        int i10 = super.read();
        m17463c(1L);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f20879c = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jM17462a = m17462a(j10);
        if (jM17462a == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM17462a);
        m17463c(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int iM17462a = (int) m17462a(i11);
        if (iM17462a == -1) {
            return -1;
        }
        int i12 = super.read(bArr, i10, iM17462a);
        m17463c(i12);
        return i12;
    }
}
