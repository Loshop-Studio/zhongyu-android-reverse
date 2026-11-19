package p016b1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: b1.c */
/* loaded from: classes3.dex */
public final class C4401c extends InputStream {

    /* renamed from: c */
    public static final Queue f1250c = AbstractC4409k.m1445f(0);

    /* renamed from: a */
    public InputStream f1251a;

    /* renamed from: b */
    public IOException f1252b;

    /* renamed from: c */
    public static C4401c m1414c(InputStream inputStream) {
        C4401c c4401c;
        Queue queue = f1250c;
        synchronized (queue) {
            c4401c = (C4401c) queue.poll();
        }
        if (c4401c == null) {
            c4401c = new C4401c();
        }
        c4401c.m1417h(inputStream);
        return c4401c;
    }

    /* renamed from: a */
    public IOException m1415a() {
        return this.f1252b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f1251a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1251a.close();
    }

    /* renamed from: g */
    public void m1416g() {
        this.f1252b = null;
        this.f1251a = null;
        Queue queue = f1250c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    /* renamed from: h */
    public void m1417h(InputStream inputStream) {
        this.f1251a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i6) {
        this.f1251a.mark(i6);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f1251a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f1251a.read();
        } catch (IOException e6) {
            this.f1252b = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f1251a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j6) throws IOException {
        try {
            return this.f1251a.skip(j6);
        } catch (IOException e6) {
            this.f1252b = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f1251a.read(bArr);
        } catch (IOException e6) {
            this.f1252b = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i6, int i7) throws IOException {
        try {
            return this.f1251a.read(bArr, i6, i7);
        } catch (IOException e6) {
            this.f1252b = e6;
            throw e6;
        }
    }
}
