package okio;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes5.dex */
public final class JvmFileHandle extends FileHandle {
    private final RandomAccessFile randomAccessFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFileHandle(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        AbstractC9133u.m16133g(randomAccessFile, "randomAccessFile");
        this.randomAccessFile = randomAccessFile;
    }

    @Override // okio.FileHandle
    public synchronized void protectedClose() {
        this.randomAccessFile.close();
    }

    @Override // okio.FileHandle
    public synchronized void protectedFlush() {
        this.randomAccessFile.getFD().sync();
    }

    @Override // okio.FileHandle
    public synchronized int protectedRead(long j10, byte[] array, int i10, int i11) {
        AbstractC9133u.m16133g(array, "array");
        this.randomAccessFile.seek(j10);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = this.randomAccessFile.read(array, i10, i11 - i12);
            if (i13 != -1) {
                i12 += i13;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    @Override // okio.FileHandle
    public synchronized void protectedResize(long j10) throws Throwable {
        try {
            try {
                long size = size();
                long j11 = j10 - size;
                if (j11 > 0) {
                    int i10 = (int) j11;
                    protectedWrite(size, new byte[i10], 0, i10);
                } else {
                    this.randomAccessFile.setLength(j10);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // okio.FileHandle
    public synchronized long protectedSize() {
        return this.randomAccessFile.length();
    }

    @Override // okio.FileHandle
    public synchronized void protectedWrite(long j10, byte[] array, int i10, int i11) {
        AbstractC9133u.m16133g(array, "array");
        this.randomAccessFile.seek(j10);
        this.randomAccessFile.write(array, i10, i11);
    }
}
