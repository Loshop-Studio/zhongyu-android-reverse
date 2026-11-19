package p016b1;

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
import kotlin.UByte;

/* renamed from: b1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4399a {

    /* renamed from: a */
    public static final AtomicReference f1242a = new AtomicReference();

    /* renamed from: b1.a$b */
    public static final class b {

        /* renamed from: a */
        public final int f1245a;

        /* renamed from: b */
        public final int f1246b;

        /* renamed from: c */
        public final byte[] f1247c;

        public b(byte[] bArr, int i6, int i7) {
            this.f1247c = bArr;
            this.f1245a = i6;
            this.f1246b = i7;
        }
    }

    /* renamed from: a */
    public static ByteBuffer m1405a(File file) throws Throwable {
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
    public static ByteBuffer m1406b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) f1242a.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int i6 = inputStream.read(bArr);
            if (i6 < 0) {
                f1242a.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return m1408d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(bArr, 0, i6);
        }
    }

    /* renamed from: c */
    public static b m1407c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* renamed from: d */
    public static ByteBuffer m1408d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* renamed from: e */
    public static byte[] m1409e(ByteBuffer byteBuffer) {
        b bVarM1407c = m1407c(byteBuffer);
        if (bVarM1407c != null && bVarM1407c.f1245a == 0 && bVarM1407c.f1246b == bVarM1407c.f1247c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        m1408d(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: f */
    public static void m1410f(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        m1408d(byteBuffer);
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
    public static InputStream m1411g(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    /* renamed from: b1.a$a */
    public static class a extends InputStream {

        /* renamed from: a */
        public final ByteBuffer f1243a;

        /* renamed from: b */
        public int f1244b = -1;

        public a(ByteBuffer byteBuffer) {
            this.f1243a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f1243a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i6) {
            this.f1244b = this.f1243a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f1243a.hasRemaining()) {
                return this.f1243a.get() & UByte.MAX_VALUE;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i6 = this.f1244b;
            if (i6 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f1243a.position(i6);
        }

        @Override // java.io.InputStream
        public long skip(long j6) {
            if (!this.f1243a.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j6, available());
            this.f1243a.position((int) (r0.position() + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i6, int i7) {
            if (!this.f1243a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i7, available());
            this.f1243a.get(bArr, i6, iMin);
            return iMin;
        }
    }
}
