package p116h0;

import androidx.collection.SieveCacheKt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: h0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC8697a {

    /* renamed from: a */
    public static final AtomicReference f16299a = new AtomicReference();

    /* renamed from: h0.a$b */
    public static final class b {

        /* renamed from: a */
        public final int f16302a;

        /* renamed from: b */
        public final int f16303b;

        /* renamed from: c */
        public final byte[] f16304c;

        public b(byte[] bArr, int i10, int i11) {
            this.f16304c = bArr;
            this.f16302a = i10;
            this.f16303b = i11;
        }
    }

    /* renamed from: a */
    public static ByteBuffer m14148a(File file) throws Throwable {
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > SieveCacheKt.NodeLinkMask) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    return mappedByteBufferLoad;
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th;
                    }
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
        }
    }

    /* renamed from: b */
    public static ByteBuffer m14149b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) f16299a.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 < 0) {
                f16299a.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return m14151d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    /* renamed from: c */
    public static b m14150c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* renamed from: d */
    public static ByteBuffer m14151d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* renamed from: e */
    public static byte[] m14152e(ByteBuffer byteBuffer) {
        b bVarM14150c = m14150c(byteBuffer);
        if (bVarM14150c != null && bVarM14150c.f16302a == 0 && bVarM14150c.f16303b == bVarM14150c.f16304c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        m14151d(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: f */
    public static void m14153f(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        m14151d(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* renamed from: g */
    public static InputStream m14154g(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    /* renamed from: h0.a$a */
    public static class a extends InputStream {

        /* renamed from: a */
        public final ByteBuffer f16300a;

        /* renamed from: b */
        public int f16301b = -1;

        public a(ByteBuffer byteBuffer) {
            this.f16300a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f16300a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i10) {
            this.f16301b = this.f16300a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f16300a.hasRemaining()) {
                return this.f16300a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i10 = this.f16301b;
            if (i10 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f16300a.position(i10);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (!this.f16300a.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j10, available());
            this.f16300a.position((int) (r0.position() + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            if (!this.f16300a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i11, available());
            this.f16300a.get(bArr, i10, iMin);
            return iMin;
        }
    }
}
