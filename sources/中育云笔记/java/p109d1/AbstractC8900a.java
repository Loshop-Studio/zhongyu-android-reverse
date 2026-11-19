package p109d1;

import androidx.collection.SieveCacheKt;
import com.tendcloud.tenddata.C7863av;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC8900a {

    /* renamed from: a */
    public static final AtomicReference f20857a = new AtomicReference();

    /* renamed from: d1.a$b */
    public static final class b {

        /* renamed from: a */
        public final int f20860a;

        /* renamed from: b */
        public final int f20861b;

        /* renamed from: c */
        public final byte[] f20862c;

        public b(byte[] bArr, int i10, int i11) {
            this.f20862c = bArr;
            this.f20860a = i10;
            this.f20861b = i11;
        }
    }

    /* renamed from: a */
    public static ByteBuffer m17435a(File file) throws Throwable {
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
    public static ByteBuffer m17436b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) f20857a.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 < 0) {
                f20857a.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return m17438d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    /* renamed from: c */
    public static b m17437c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* renamed from: d */
    public static ByteBuffer m17438d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* renamed from: e */
    public static byte[] m17439e(ByteBuffer byteBuffer) {
        b bVarM17437c = m17437c(byteBuffer);
        if (bVarM17437c != null && bVarM17437c.f20860a == 0 && bVarM17437c.f20861b == bVarM17437c.f20862c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        m17438d(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: f */
    public static void m17440f(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        m17438d(byteBuffer);
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
    public static InputStream m17441g(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    /* renamed from: d1.a$a */
    public static class a extends InputStream {

        /* renamed from: c */
        public final ByteBuffer f20858c;

        /* renamed from: d */
        public int f20859d = -1;

        public a(ByteBuffer byteBuffer) {
            this.f20858c = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f20858c.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i10) {
            this.f20859d = this.f20858c.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f20858c.hasRemaining()) {
                return this.f20858c.get() & C7863av.f14384i;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i10 = this.f20859d;
            if (i10 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f20858c.position(i10);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (!this.f20858c.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j10, available());
            this.f20858c.position((int) (r0.position() + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            if (!this.f20858c.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i11, available());
            this.f20858c.get(bArr, i10, iMin);
            return iMin;
        }
    }
}
