package p091e1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: e1.c */
/* loaded from: classes3.dex */
public class C7831c extends InputStream {

    /* renamed from: c */
    public static final Queue f13146c = AbstractC7838j.m12262e(0);

    /* renamed from: a */
    public InputStream f13147a;

    /* renamed from: b */
    public IOException f13148b;

    /* renamed from: c */
    public static C7831c m12233c(InputStream inputStream) {
        C7831c c7831c;
        Queue queue = f13146c;
        synchronized (queue) {
            c7831c = (C7831c) queue.poll();
        }
        if (c7831c == null) {
            c7831c = new C7831c();
        }
        c7831c.m12236h(inputStream);
        return c7831c;
    }

    /* renamed from: a */
    public IOException m12234a() {
        return this.f13148b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f13147a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13147a.close();
    }

    /* renamed from: g */
    public void m12235g() {
        this.f13148b = null;
        this.f13147a = null;
        Queue queue = f13146c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    /* renamed from: h */
    public void m12236h(InputStream inputStream) {
        this.f13147a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i9) {
        this.f13147a.mark(i9);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f13147a.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f13147a.read(bArr);
        } catch (IOException e10) {
            this.f13148b = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f13147a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j9) {
        try {
            return this.f13147a.skip(j9);
        } catch (IOException e10) {
            this.f13148b = e10;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) {
        try {
            return this.f13147a.read(bArr, i9, i10);
        } catch (IOException e10) {
            this.f13148b = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f13147a.read();
        } catch (IOException e10) {
            this.f13148b = e10;
            return -1;
        }
    }
}
