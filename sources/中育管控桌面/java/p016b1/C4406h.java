package p016b1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: b1.h */
/* loaded from: classes3.dex */
public class C4406h extends FilterInputStream {

    /* renamed from: a */
    public int f1264a;

    public C4406h(InputStream inputStream) {
        super(inputStream);
        this.f1264a = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final long m1432a(long j6) {
        int i6 = this.f1264a;
        if (i6 == 0) {
            return -1L;
        }
        return (i6 == Integer.MIN_VALUE || j6 <= ((long) i6)) ? j6 : i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i6 = this.f1264a;
        return i6 == Integer.MIN_VALUE ? super.available() : Math.min(i6, super.available());
    }

    /* renamed from: c */
    public final void m1433c(long j6) {
        int i6 = this.f1264a;
        if (i6 == Integer.MIN_VALUE || j6 == -1) {
            return;
        }
        this.f1264a = (int) (i6 - j6);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i6) {
        super.mark(i6);
        this.f1264a = i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m1432a(1L) == -1) {
            return -1;
        }
        int i6 = super.read();
        m1433c(1L);
        return i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f1264a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j6) throws IOException {
        long jM1432a = m1432a(j6);
        if (jM1432a == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM1432a);
        m1433c(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i6, int i7) throws IOException {
        int iM1432a = (int) m1432a(i7);
        if (iM1432a == -1) {
            return -1;
        }
        int i8 = super.read(bArr, i6, iM1432a);
        m1433c(i8);
        return i8;
    }
}
