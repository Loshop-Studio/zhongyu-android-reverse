package p180v0;

import com.bumptech.glide.load.resource.bitmap.C3419a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* renamed from: v0.c */
/* loaded from: classes2.dex */
public final class C6656c extends InputStream {

    /* renamed from: c */
    public static final ArrayDeque f11228c;

    /* renamed from: a */
    public C3419a f11229a;

    /* renamed from: b */
    public IOException f11230b;

    static {
        char[] cArr = AbstractC6664k.f11243a;
        f11228c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f11229a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f11229a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f11229a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f11229a.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f11229a.read(bArr);
        } catch (IOException e) {
            this.f11230b = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f11229a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j7) {
        try {
            return this.f11229a.skip(j7);
        } catch (IOException e) {
            this.f11230b = e;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i8) {
        try {
            return this.f11229a.read(bArr, i, i8);
        } catch (IOException e) {
            this.f11230b = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f11229a.read();
        } catch (IOException e) {
            this.f11230b = e;
            return -1;
        }
    }
}
