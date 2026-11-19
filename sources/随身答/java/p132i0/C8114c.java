package p132i0;

import java.io.IOException;
import java.io.OutputStream;
import p164l0.InterfaceC8865b;

/* renamed from: i0.c */
/* loaded from: classes3.dex */
public final class C8114c extends OutputStream {

    /* renamed from: a */
    public final OutputStream f13869a;

    /* renamed from: b */
    public byte[] f13870b;

    /* renamed from: c */
    public InterfaceC8865b f13871c;

    /* renamed from: d */
    public int f13872d;

    public C8114c(OutputStream outputStream, InterfaceC8865b interfaceC8865b) {
        this(outputStream, interfaceC8865b, 65536);
    }

    /* renamed from: a */
    public final void m12988a() throws IOException {
        int i9 = this.f13872d;
        if (i9 > 0) {
            this.f13869a.write(this.f13870b, 0, i9);
            this.f13872d = 0;
        }
    }

    /* renamed from: c */
    public final void m12989c() throws IOException {
        if (this.f13872d == this.f13870b.length) {
            m12988a();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f13869a.close();
            m12990g();
        } catch (Throwable th) {
            this.f13869a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m12988a();
        this.f13869a.flush();
    }

    /* renamed from: g */
    public final void m12990g() {
        byte[] bArr = this.f13870b;
        if (bArr != null) {
            this.f13871c.put(bArr);
            this.f13870b = null;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i9) throws IOException {
        byte[] bArr = this.f13870b;
        int i10 = this.f13872d;
        this.f13872d = i10 + 1;
        bArr[i10] = (byte) i9;
        m12989c();
    }

    public C8114c(OutputStream outputStream, InterfaceC8865b interfaceC8865b, int i9) {
        this.f13869a = outputStream;
        this.f13871c = interfaceC8865b;
        this.f13870b = (byte[]) interfaceC8865b.mo13725c(i9, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i9, int i10) throws IOException {
        int i11 = 0;
        do {
            int i12 = i10 - i11;
            int i13 = i9 + i11;
            int i14 = this.f13872d;
            if (i14 == 0 && i12 >= this.f13870b.length) {
                this.f13869a.write(bArr, i13, i12);
                return;
            }
            int iMin = Math.min(i12, this.f13870b.length - i14);
            System.arraycopy(bArr, i13, this.f13870b, this.f13872d, iMin);
            this.f13872d += iMin;
            i11 += iMin;
            m12989c();
        } while (i11 < i10);
    }
}
