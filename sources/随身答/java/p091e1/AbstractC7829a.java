package p091e1;

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

/* renamed from: e1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7829a {

    /* renamed from: a */
    public static final AtomicReference f13138a = new AtomicReference();

    /* renamed from: e1.a$b */
    public static final class b {

        /* renamed from: a */
        public final int f13141a;

        /* renamed from: b */
        public final int f13142b;

        /* renamed from: c */
        public final byte[] f13143c;

        public b(byte[] bArr, int i9, int i10) {
            this.f13143c = bArr;
            this.f13141a = i9;
            this.f13142b = i10;
        }
    }

    /* renamed from: a */
    public static ByteBuffer m12225a(File file) throws Throwable {
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
    public static ByteBuffer m12226b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) f13138a.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int i9 = inputStream.read(bArr);
            if (i9 < 0) {
                f13138a.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
            byteArrayOutputStream.write(bArr, 0, i9);
        }
    }

    /* renamed from: c */
    public static b m12227c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* renamed from: d */
    public static byte[] m12228d(ByteBuffer byteBuffer) {
        b bVarM12227c = m12227c(byteBuffer);
        if (bVarM12227c != null && bVarM12227c.f13141a == 0 && bVarM12227c.f13142b == bVarM12227c.f13143c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        byteBufferAsReadOnlyBuffer.position(0);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: e */
    public static void m12229e(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
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

    /* renamed from: f */
    public static InputStream m12230f(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    /* renamed from: e1.a$a */
    public static class a extends InputStream {

        /* renamed from: a */
        public final ByteBuffer f13139a;

        /* renamed from: b */
        public int f13140b = -1;

        public a(ByteBuffer byteBuffer) {
            this.f13139a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f13139a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i9) {
            this.f13140b = this.f13139a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f13139a.hasRemaining()) {
                return this.f13139a.get() & UByte.MAX_VALUE;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i9 = this.f13140b;
            if (i9 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f13139a.position(i9);
        }

        @Override // java.io.InputStream
        public long skip(long j9) {
            if (!this.f13139a.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j9, available());
            this.f13139a.position((int) (r0.position() + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i9, int i10) {
            if (!this.f13139a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i10, available());
            this.f13139a.get(bArr, i9, iMin);
            return iMin;
        }
    }
}
