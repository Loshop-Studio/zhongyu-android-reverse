package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;
import p074i0.InterfaceC6497b;

/* renamed from: com.bumptech.glide.load.data.c */
/* loaded from: classes3.dex */
public final class C4691c extends OutputStream {

    /* renamed from: a */
    public final OutputStream f2289a;

    /* renamed from: b */
    public byte[] f2290b;

    /* renamed from: c */
    public InterfaceC6497b f2291c;

    /* renamed from: d */
    public int f2292d;

    public C4691c(OutputStream outputStream, InterfaceC6497b interfaceC6497b) {
        this(outputStream, interfaceC6497b, 65536);
    }

    /* renamed from: a */
    public final void m2590a() throws IOException {
        int i6 = this.f2292d;
        if (i6 > 0) {
            this.f2289a.write(this.f2290b, 0, i6);
            this.f2292d = 0;
        }
    }

    /* renamed from: c */
    public final void m2591c() throws IOException {
        if (this.f2292d == this.f2290b.length) {
            m2590a();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f2289a.close();
            m2592g();
        } catch (Throwable th) {
            this.f2289a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m2590a();
        this.f2289a.flush();
    }

    /* renamed from: g */
    public final void m2592g() {
        byte[] bArr = this.f2290b;
        if (bArr != null) {
            this.f2291c.put(bArr);
            this.f2290b = null;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i6) throws IOException {
        byte[] bArr = this.f2290b;
        int i7 = this.f2292d;
        this.f2292d = i7 + 1;
        bArr[i7] = (byte) i6;
        m2591c();
    }

    public C4691c(OutputStream outputStream, InterfaceC6497b interfaceC6497b, int i6) {
        this.f2289a = outputStream;
        this.f2291c = interfaceC6497b;
        this.f2290b = (byte[]) interfaceC6497b.mo7190c(i6, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i6, int i7) throws IOException {
        int i8 = 0;
        do {
            int i9 = i7 - i8;
            int i10 = i6 + i8;
            int i11 = this.f2292d;
            if (i11 == 0 && i9 >= this.f2290b.length) {
                this.f2289a.write(bArr, i10, i9);
                return;
            }
            int iMin = Math.min(i9, this.f2290b.length - i11);
            System.arraycopy(bArr, i10, this.f2290b, this.f2292d, iMin);
            this.f2292d += iMin;
            i8 += iMin;
            m2591c();
        } while (i8 < i7);
    }
}
