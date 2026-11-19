package p116h0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: h0.h */
/* loaded from: classes3.dex */
public class C8704h extends FilterInputStream {

    /* renamed from: a */
    public int f16321a;

    public C8704h(InputStream inputStream) {
        super(inputStream);
        this.f16321a = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final long m14175a(long j10) {
        int i10 = this.f16321a;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i10 = this.f16321a;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    /* renamed from: b */
    public final void m14176b(long j10) {
        int i10 = this.f16321a;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f16321a = (int) (i10 - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f16321a = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m14175a(1L) == -1) {
            return -1;
        }
        int i10 = super.read();
        m14176b(1L);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f16321a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jM14175a = m14175a(j10);
        if (jM14175a == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM14175a);
        m14176b(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int iM14175a = (int) m14175a(i11);
        if (iM14175a == -1) {
            return -1;
        }
        int i12 = super.read(bArr, i10, iM14175a);
        m14176b(i12);
        return i12;
    }
}
