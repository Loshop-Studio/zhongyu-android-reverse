package p062g0;

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

/* renamed from: g0.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3741a {

    /* renamed from: a */
    public static final AtomicReference f4373a = new AtomicReference();

    /* renamed from: g0.a$b */
    public static final class b {

        /* renamed from: a */
        public final int f4376a;

        /* renamed from: b */
        public final int f4377b;

        /* renamed from: c */
        public final byte[] f4378c;

        public b(byte[] bArr, int i4, int i5) {
            this.f4378c = bArr;
            this.f4376a = i4;
            this.f4377b = i5;
        }
    }

    /* renamed from: a */
    public static ByteBuffer m4737a(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
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

    /* renamed from: b */
    public static ByteBuffer m4738b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) f4373a.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int i4 = inputStream.read(bArr);
            if (i4 < 0) {
                f4373a.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
            byteArrayOutputStream.write(bArr, 0, i4);
        }
    }

    /* renamed from: c */
    public static b m4739c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* renamed from: d */
    public static byte[] m4740d(ByteBuffer byteBuffer) {
        b bVarM4739c = m4739c(byteBuffer);
        if (bVarM4739c != null && bVarM4739c.f4376a == 0 && bVarM4739c.f4377b == bVarM4739c.f4378c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        byteBufferAsReadOnlyBuffer.position(0);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: e */
    public static void m4741e(ByteBuffer byteBuffer, File file) throws Throwable {
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
    public static InputStream m4742f(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    /* renamed from: g0.a$a */
    public static class a extends InputStream {

        /* renamed from: a */
        public final ByteBuffer f4374a;

        /* renamed from: b */
        public int f4375b = -1;

        public a(ByteBuffer byteBuffer) {
            this.f4374a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f4374a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i4) {
            this.f4375b = this.f4374a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f4374a.hasRemaining()) {
                return this.f4374a.get() & UByte.MAX_VALUE;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i4 = this.f4375b;
            if (i4 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f4374a.position(i4);
        }

        @Override // java.io.InputStream
        public long skip(long j4) {
            if (!this.f4374a.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j4, available());
            this.f4374a.position((int) (r0.position() + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) {
            if (!this.f4374a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i5, available());
            this.f4374a.get(bArr, i4, iMin);
            return iMin;
        }
    }
}
