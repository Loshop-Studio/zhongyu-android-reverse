package p062g0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: g0.g */
/* loaded from: classes2.dex */
public class C3747g extends FilterInputStream {

    /* renamed from: a */
    public int f4392a;

    public C3747g(InputStream inputStream) {
        super(inputStream);
        this.f4392a = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final long m4762a(long j4) {
        int i4 = this.f4392a;
        if (i4 == 0) {
            return -1L;
        }
        return (i4 == Integer.MIN_VALUE || j4 <= ((long) i4)) ? j4 : i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i4 = this.f4392a;
        return i4 == Integer.MIN_VALUE ? super.available() : Math.min(i4, super.available());
    }

    /* renamed from: b */
    public final void m4763b(long j4) {
        int i4 = this.f4392a;
        if (i4 == Integer.MIN_VALUE || j4 == -1) {
            return;
        }
        this.f4392a = (int) (i4 - j4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        super.mark(i4);
        this.f4392a = i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m4762a(1L) == -1) {
            return -1;
        }
        int i4 = super.read();
        m4763b(1L);
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f4392a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        long jM4762a = m4762a(j4);
        if (jM4762a == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM4762a);
        m4763b(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int iM4762a = (int) m4762a(i5);
        if (iM4762a == -1) {
            return -1;
        }
        int i6 = super.read(bArr, i4, iM4762a);
        m4763b(i6);
        return i6;
    }
}
