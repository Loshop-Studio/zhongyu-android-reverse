package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;
import p193o.InterfaceC9498b;

/* renamed from: com.bumptech.glide.load.data.c */
/* loaded from: classes3.dex */
public final class C5404c extends OutputStream {

    /* renamed from: a */
    public final OutputStream f2931a;

    /* renamed from: b */
    public byte[] f2932b;

    /* renamed from: c */
    public InterfaceC9498b f2933c;

    /* renamed from: d */
    public int f2934d;

    public C5404c(OutputStream outputStream, InterfaceC9498b interfaceC9498b) {
        this(outputStream, interfaceC9498b, 65536);
    }

    /* renamed from: a */
    public final void m2855a() throws IOException {
        int i10 = this.f2934d;
        if (i10 > 0) {
            this.f2931a.write(this.f2932b, 0, i10);
            this.f2934d = 0;
        }
    }

    /* renamed from: b */
    public final void m2856b() throws IOException {
        if (this.f2934d == this.f2932b.length) {
            m2855a();
        }
    }

    /* renamed from: c */
    public final void m2857c() {
        byte[] bArr = this.f2932b;
        if (bArr != null) {
            this.f2933c.put(bArr);
            this.f2932b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f2931a.close();
            m2857c();
        } catch (Throwable th) {
            this.f2931a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m2855a();
        this.f2931a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f2932b;
        int i11 = this.f2934d;
        this.f2934d = i11 + 1;
        bArr[i11] = (byte) i10;
        m2856b();
    }

    public C5404c(OutputStream outputStream, InterfaceC9498b interfaceC9498b, int i10) {
        this.f2931a = outputStream;
        this.f2933c = interfaceC9498b;
        this.f2932b = (byte[]) interfaceC9498b.mo17614b(i10, byte[].class);
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
            int i15 = this.f2934d;
            if (i15 == 0 && i13 >= this.f2932b.length) {
                this.f2931a.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f2932b.length - i15);
            System.arraycopy(bArr, i14, this.f2932b, this.f2934d, iMin);
            this.f2934d += iMin;
            i12 += iMin;
            m2856b();
        } while (i12 < i11);
    }
}
