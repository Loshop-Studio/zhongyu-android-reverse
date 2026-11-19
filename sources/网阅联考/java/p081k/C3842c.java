package p081k;

import java.io.IOException;
import java.io.OutputStream;
import p098n.InterfaceC4393b;

/* renamed from: k.c */
/* loaded from: classes2.dex */
public final class C3842c extends OutputStream {

    /* renamed from: a */
    public final OutputStream f4737a;

    /* renamed from: b */
    public byte[] f4738b;

    /* renamed from: c */
    public InterfaceC4393b f4739c;

    /* renamed from: d */
    public int f4740d;

    public C3842c(OutputStream outputStream, InterfaceC4393b interfaceC4393b) {
        this(outputStream, interfaceC4393b, 65536);
    }

    /* renamed from: a */
    public final void m5124a() throws IOException {
        int i4 = this.f4740d;
        if (i4 > 0) {
            this.f4737a.write(this.f4738b, 0, i4);
            this.f4740d = 0;
        }
    }

    /* renamed from: b */
    public final void m5125b() throws IOException {
        if (this.f4740d == this.f4738b.length) {
            m5124a();
        }
    }

    /* renamed from: c */
    public final void m5126c() {
        byte[] bArr = this.f4738b;
        if (bArr != null) {
            this.f4739c.put(bArr);
            this.f4738b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f4737a.close();
            m5126c();
        } catch (Throwable th) {
            this.f4737a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m5124a();
        this.f4737a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i4) throws IOException {
        byte[] bArr = this.f4738b;
        int i5 = this.f4740d;
        this.f4740d = i5 + 1;
        bArr[i5] = (byte) i4;
        m5125b();
    }

    public C3842c(OutputStream outputStream, InterfaceC4393b interfaceC4393b, int i4) {
        this.f4737a = outputStream;
        this.f4739c = interfaceC4393b;
        this.f4738b = (byte[]) interfaceC4393b.mo5386d(i4, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        int i6 = 0;
        do {
            int i7 = i5 - i6;
            int i8 = i4 + i6;
            int i9 = this.f4740d;
            if (i9 == 0 && i7 >= this.f4738b.length) {
                this.f4737a.write(bArr, i8, i7);
                return;
            }
            int iMin = Math.min(i7, this.f4738b.length - i9);
            System.arraycopy(bArr, i8, this.f4738b, this.f4740d, iMin);
            this.f4740d += iMin;
            i6 += iMin;
            m5125b();
        } while (i6 < i5);
    }
}
