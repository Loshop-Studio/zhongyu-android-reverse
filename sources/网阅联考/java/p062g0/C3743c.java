package p062g0;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: g0.c */
/* loaded from: classes2.dex */
public class C3743c extends InputStream {

    /* renamed from: c */
    public static final Queue f4381c = AbstractC3750j.m4774e(0);

    /* renamed from: a */
    public InputStream f4382a;

    /* renamed from: b */
    public IOException f4383b;

    /* renamed from: b */
    public static C3743c m4745b(InputStream inputStream) {
        C3743c c3743c;
        Queue queue = f4381c;
        synchronized (queue) {
            c3743c = (C3743c) queue.poll();
        }
        if (c3743c == null) {
            c3743c = new C3743c();
        }
        c3743c.m4748d(inputStream);
        return c3743c;
    }

    /* renamed from: a */
    public IOException m4746a() {
        return this.f4383b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f4382a.available();
    }

    /* renamed from: c */
    public void m4747c() {
        this.f4383b = null;
        this.f4382a = null;
        Queue queue = f4381c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4382a.close();
    }

    /* renamed from: d */
    public void m4748d(InputStream inputStream) {
        this.f4382a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i4) {
        this.f4382a.mark(i4);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f4382a.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f4382a.read(bArr);
        } catch (IOException e4) {
            this.f4383b = e4;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f4382a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j4) {
        try {
            return this.f4382a.skip(j4);
        } catch (IOException e4) {
            this.f4383b = e4;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) {
        try {
            return this.f4382a.read(bArr, i4, i5);
        } catch (IOException e4) {
            this.f4383b = e4;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f4382a.read();
        } catch (IOException e4) {
            this.f4383b = e4;
            return -1;
        }
    }
}
