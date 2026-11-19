package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;
import p213k0.InterfaceC9770b;

/* renamed from: com.bumptech.glide.load.data.c */
/* loaded from: classes3.dex */
public final class C5823c extends OutputStream {

    /* renamed from: c */
    public final OutputStream f4701c;

    /* renamed from: d */
    public byte[] f4702d;

    /* renamed from: e */
    public InterfaceC9770b f4703e;

    /* renamed from: f */
    public int f4704f;

    public C5823c(OutputStream outputStream, InterfaceC9770b interfaceC9770b) {
        this(outputStream, interfaceC9770b, 65536);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f4701c.close();
            m4061g();
        } catch (Throwable th) {
            this.f4701c.close();
            throw th;
        }
    }

    /* renamed from: e */
    public final void m4059e() throws IOException {
        int i10 = this.f4704f;
        if (i10 > 0) {
            this.f4701c.write(this.f4702d, 0, i10);
            this.f4704f = 0;
        }
    }

    /* renamed from: f */
    public final void m4060f() throws IOException {
        if (this.f4704f == this.f4702d.length) {
            m4059e();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m4059e();
        this.f4701c.flush();
    }

    /* renamed from: g */
    public final void m4061g() {
        byte[] bArr = this.f4702d;
        if (bArr != null) {
            this.f4703e.put(bArr);
            this.f4702d = null;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f4702d;
        int i11 = this.f4704f;
        this.f4704f = i11 + 1;
        bArr[i11] = (byte) i10;
        m4060f();
    }

    public C5823c(OutputStream outputStream, InterfaceC9770b interfaceC9770b, int i10) {
        this.f4701c = outputStream;
        this.f4703e = interfaceC9770b;
        this.f4702d = (byte[]) interfaceC9770b.mo19703c(i10, byte[].class);
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
            int i15 = this.f4704f;
            if (i15 == 0 && i13 >= this.f4702d.length) {
                this.f4701c.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f4702d.length - i15);
            System.arraycopy(bArr, i14, this.f4702d, this.f4704f, iMin);
            this.f4704f += iMin;
            i12 += iMin;
            m4060f();
        } while (i12 < i11);
    }
}
