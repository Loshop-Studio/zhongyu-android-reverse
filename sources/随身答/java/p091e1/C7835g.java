package p091e1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: e1.g */
/* loaded from: classes3.dex */
public class C7835g extends FilterInputStream {

    /* renamed from: a */
    public int f13157a;

    public C7835g(InputStream inputStream) {
        super(inputStream);
        this.f13157a = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final long m12250a(long j9) {
        int i9 = this.f13157a;
        if (i9 == 0) {
            return -1L;
        }
        return (i9 == Integer.MIN_VALUE || j9 <= ((long) i9)) ? j9 : i9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i9 = this.f13157a;
        return i9 == Integer.MIN_VALUE ? super.available() : Math.min(i9, super.available());
    }

    /* renamed from: c */
    public final void m12251c(long j9) {
        int i9 = this.f13157a;
        if (i9 == Integer.MIN_VALUE || j9 == -1) {
            return;
        }
        this.f13157a = (int) (i9 - j9);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i9) {
        super.mark(i9);
        this.f13157a = i9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m12250a(1L) == -1) {
            return -1;
        }
        int i9 = super.read();
        m12251c(1L);
        return i9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f13157a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j9) throws IOException {
        long jM12250a = m12250a(j9);
        if (jM12250a == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM12250a);
        m12251c(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        int iM12250a = (int) m12250a(i10);
        if (iM12250a == -1) {
            return -1;
        }
        int i11 = super.read(bArr, i9, iM12250a);
        m12251c(i11);
        return i11;
    }
}
