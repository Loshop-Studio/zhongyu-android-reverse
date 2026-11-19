package p180v0;

import java.io.FilterInputStream;
import java.io.IOException;

/* renamed from: v0.h */
/* loaded from: classes2.dex */
public final class C6661h extends FilterInputStream {

    /* renamed from: a */
    public int f11238a;

    public C6661h(C6656c c6656c) {
        super(c6656c);
        this.f11238a = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final long m6319a(long j7) {
        int i = this.f11238a;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j7 <= ((long) i)) ? j7 : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.f11238a;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    /* renamed from: b */
    public final void m6320b(long j7) {
        int i = this.f11238a;
        if (i == Integer.MIN_VALUE || j7 == -1) {
            return;
        }
        this.f11238a = (int) (i - j7);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f11238a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (m6319a(1L) == -1) {
            return -1;
        }
        int i = super.read();
        m6320b(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f11238a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j7) throws IOException {
        long jM6319a = m6319a(j7);
        if (jM6319a == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM6319a);
        m6320b(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i8) throws IOException {
        int iM6319a = (int) m6319a(i8);
        if (iM6319a == -1) {
            return -1;
        }
        int i9 = super.read(bArr, i, iM6319a);
        m6320b(i9);
        return i9;
    }
}
