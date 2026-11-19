package coil3.decode;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: coil3.decode.l */
/* loaded from: classes2.dex */
public final class C3271l extends InputStream {

    /* renamed from: a */
    public final /* synthetic */ int f1907a;

    /* renamed from: b */
    public int f1908b;

    /* renamed from: c */
    public final Object f1909c;

    public C3271l(InputStream inputStream) {
        this.f1907a = 0;
        this.f1909c = inputStream;
        this.f1908b = BasicMeasure.EXACTLY;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f1907a) {
            case 0:
                return this.f1908b;
            default:
                return ((ByteBuffer) this.f1909c).remaining();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f1907a) {
            case 0:
                ((InputStream) this.f1909c).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.f1907a) {
            case 1:
                synchronized (this) {
                    this.f1908b = ((ByteBuffer) this.f1909c).position();
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        switch (this.f1907a) {
            case 1:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        switch (this.f1907a) {
            case 0:
                int i = ((InputStream) this.f1909c).read(bArr);
                if (i == -1) {
                    this.f1908b = 0;
                }
                return i;
            default:
                return super.read(bArr);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f1907a) {
            case 1:
                synchronized (this) {
                    int i = this.f1908b;
                    if (i == -1) {
                        throw new IOException("Cannot reset to unset mark position");
                    }
                    ((ByteBuffer) this.f1909c).position(i);
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j7) {
        switch (this.f1907a) {
            case 0:
                return ((InputStream) this.f1909c).skip(j7);
            default:
                ByteBuffer byteBuffer = (ByteBuffer) this.f1909c;
                if (!byteBuffer.hasRemaining()) {
                    return -1L;
                }
                long jMin = Math.min(j7, byteBuffer.remaining());
                byteBuffer.position((int) (byteBuffer.position() + jMin));
                return jMin;
        }
    }

    public C3271l(ByteBuffer byteBuffer) {
        this.f1907a = 1;
        this.f1908b = -1;
        this.f1909c = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f1907a) {
            case 0:
                int i = ((InputStream) this.f1909c).read();
                if (i == -1) {
                    this.f1908b = 0;
                }
                return i;
            default:
                ByteBuffer byteBuffer = (ByteBuffer) this.f1909c;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & 255;
                }
                return -1;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i8) throws IOException {
        switch (this.f1907a) {
            case 0:
                int i9 = ((InputStream) this.f1909c).read(bArr, i, i8);
                if (i9 == -1) {
                    this.f1908b = 0;
                }
                return i9;
            default:
                ByteBuffer byteBuffer = (ByteBuffer) this.f1909c;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int iMin = Math.min(i8, byteBuffer.remaining());
                byteBuffer.get(bArr, i, iMin);
                return iMin;
        }
    }
}
