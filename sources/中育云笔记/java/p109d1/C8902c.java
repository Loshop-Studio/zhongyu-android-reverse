package p109d1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: d1.c */
/* loaded from: classes3.dex */
public final class C8902c extends InputStream {

    /* renamed from: e */
    public static final Queue f20865e = AbstractC8910k.m17475f(0);

    /* renamed from: c */
    public InputStream f20866c;

    /* renamed from: d */
    public IOException f20867d;

    /* renamed from: f */
    public static C8902c m17444f(InputStream inputStream) {
        C8902c c8902c;
        Queue queue = f20865e;
        synchronized (queue) {
            c8902c = (C8902c) queue.poll();
        }
        if (c8902c == null) {
            c8902c = new C8902c();
        }
        c8902c.m17447i(inputStream);
        return c8902c;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f20866c.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f20866c.close();
    }

    /* renamed from: e */
    public IOException m17445e() {
        return this.f20867d;
    }

    /* renamed from: g */
    public void m17446g() {
        this.f20867d = null;
        this.f20866c = null;
        Queue queue = f20865e;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    /* renamed from: i */
    public void m17447i(InputStream inputStream) {
        this.f20866c = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f20866c.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f20866c.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f20866c.read();
        } catch (IOException e10) {
            this.f20867d = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f20866c.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f20866c.skip(j10);
        } catch (IOException e10) {
            this.f20867d = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f20866c.read(bArr);
        } catch (IOException e10) {
            this.f20867d = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f20866c.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f20867d = e10;
            throw e10;
        }
    }
}
