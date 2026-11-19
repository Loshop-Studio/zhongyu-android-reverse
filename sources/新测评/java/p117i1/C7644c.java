package p117i1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: i1.c */
/* loaded from: classes3.dex */
public final class C7644c extends InputStream {

    /* renamed from: c */
    public static final Queue f12883c = AbstractC7652k.m12690f(0);

    /* renamed from: a */
    public InputStream f12884a;

    /* renamed from: b */
    public IOException f12885b;

    /* renamed from: f */
    public static C7644c m12659f(InputStream inputStream) {
        C7644c c7644c;
        Queue queue = f12883c;
        synchronized (queue) {
            c7644c = (C7644c) queue.poll();
        }
        if (c7644c == null) {
            c7644c = new C7644c();
        }
        c7644c.m12662h(inputStream);
        return c7644c;
    }

    /* renamed from: a */
    public IOException m12660a() {
        return this.f12885b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f12884a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12884a.close();
    }

    /* renamed from: g */
    public void m12661g() {
        this.f12885b = null;
        this.f12884a = null;
        Queue queue = f12883c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    /* renamed from: h */
    public void m12662h(InputStream inputStream) {
        this.f12884a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f12884a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f12884a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f12884a.read();
        } catch (IOException e10) {
            this.f12885b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f12884a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f12884a.skip(j10);
        } catch (IOException e10) {
            this.f12885b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f12884a.read(bArr);
        } catch (IOException e10) {
            this.f12885b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f12884a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f12885b = e10;
            throw e10;
        }
    }
}
