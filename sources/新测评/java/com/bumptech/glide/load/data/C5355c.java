package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;
import p195p0.InterfaceC8802b;

/* renamed from: com.bumptech.glide.load.data.c */
/* loaded from: classes3.dex */
public final class C5355c extends OutputStream {

    /* renamed from: a */
    public final OutputStream f3498a;

    /* renamed from: b */
    public byte[] f3499b;

    /* renamed from: c */
    public InterfaceC8802b f3500c;

    /* renamed from: d */
    public int f3501d;

    public C5355c(OutputStream outputStream, InterfaceC8802b interfaceC8802b) {
        this(outputStream, interfaceC8802b, 65536);
    }

    /* renamed from: a */
    public final void m3409a() throws IOException {
        int i10 = this.f3501d;
        if (i10 > 0) {
            this.f3498a.write(this.f3499b, 0, i10);
            this.f3501d = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f3498a.close();
            m3411g();
        } catch (Throwable th) {
            this.f3498a.close();
            throw th;
        }
    }

    /* renamed from: f */
    public final void m3410f() throws IOException {
        if (this.f3501d == this.f3499b.length) {
            m3409a();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m3409a();
        this.f3498a.flush();
    }

    /* renamed from: g */
    public final void m3411g() {
        byte[] bArr = this.f3499b;
        if (bArr != null) {
            this.f3500c.put(bArr);
            this.f3499b = null;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f3499b;
        int i11 = this.f3501d;
        this.f3501d = i11 + 1;
        bArr[i11] = (byte) i10;
        m3410f();
    }

    public C5355c(OutputStream outputStream, InterfaceC8802b interfaceC8802b, int i10) {
        this.f3498a = outputStream;
        this.f3500c = interfaceC8802b;
        this.f3499b = (byte[]) interfaceC8802b.mo14705c(i10, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f3501d;
            if (i15 == 0 && i13 >= this.f3499b.length) {
                this.f3498a.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f3499b.length - i15);
            System.arraycopy(bArr, i14, this.f3499b, this.f3501d, iMin);
            this.f3501d += iMin;
            i12 += iMin;
            m3410f();
        } while (i12 < i11);
    }
}
