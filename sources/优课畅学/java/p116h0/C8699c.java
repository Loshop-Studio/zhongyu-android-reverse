package p116h0;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: h0.c */
/* loaded from: classes3.dex */
public final class C8699c extends InputStream {

    /* renamed from: c */
    public static final Queue f16307c = AbstractC8707k.m14188f(0);

    /* renamed from: a */
    public InputStream f16308a;

    /* renamed from: b */
    public IOException f16309b;

    /* renamed from: b */
    public static C8699c m14157b(InputStream inputStream) {
        C8699c c8699c;
        Queue queue = f16307c;
        synchronized (queue) {
            c8699c = (C8699c) queue.poll();
        }
        if (c8699c == null) {
            c8699c = new C8699c();
        }
        c8699c.m14160d(inputStream);
        return c8699c;
    }

    /* renamed from: a */
    public IOException m14158a() {
        return this.f16309b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f16308a.available();
    }

    /* renamed from: c */
    public void m14159c() {
        this.f16309b = null;
        this.f16308a = null;
        Queue queue = f16307c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16308a.close();
    }

    /* renamed from: d */
    public void m14160d(InputStream inputStream) {
        this.f16308a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f16308a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f16308a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f16308a.read();
        } catch (IOException e10) {
            this.f16309b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f16308a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f16308a.skip(j10);
        } catch (IOException e10) {
            this.f16309b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f16308a.read(bArr);
        } catch (IOException e10) {
            this.f16309b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f16308a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f16309b = e10;
            throw e10;
        }
    }
}
