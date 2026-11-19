package okio;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u000bH\u0014J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0014J(\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0014J\b\u0010\u0015\u001a\u00020\tH\u0014J\b\u0010\u0016\u001a\u00020\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m13558d2 = {"Lokio/NioFileSystemFileHandle;", "Lokio/FileHandle;", "readWrite", "", "fileChannel", "Ljava/nio/channels/FileChannel;", "<init>", "(ZLjava/nio/channels/FileChannel;)V", "protectedResize", "", "size", "", "protectedSize", "protectedRead", "", "fileOffset", "array", "", "arrayOffset", "byteCount", "protectedWrite", "protectedFlush", "protectedClose", "okio"}, m13559k = 1, m13560mv = {2, 1, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class NioFileSystemFileHandle extends FileHandle {
    private final FileChannel fileChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NioFileSystemFileHandle(boolean z9, FileChannel fileChannel) {
        super(z9);
        Intrinsics.checkNotNullParameter(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    @Override // okio.FileHandle
    public synchronized void protectedClose() {
        this.fileChannel.close();
    }

    @Override // okio.FileHandle
    public synchronized void protectedFlush() {
        this.fileChannel.force(true);
    }

    @Override // okio.FileHandle
    public synchronized int protectedRead(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.fileChannel.position(fileOffset);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(array, arrayOffset, byteCount);
        int i10 = 0;
        while (true) {
            if (i10 >= byteCount) {
                break;
            }
            int i11 = this.fileChannel.read(byteBufferWrap);
            if (i11 != -1) {
                i10 += i11;
            } else if (i10 == 0) {
                return -1;
            }
        }
        return i10;
    }

    @Override // okio.FileHandle
    public synchronized void protectedResize(long size) throws Throwable {
        try {
            try {
                long size2 = size();
                long j10 = size - size2;
                if (j10 > 0) {
                    int i10 = (int) j10;
                    protectedWrite(size2, new byte[i10], 0, i10);
                } else {
                    this.fileChannel.truncate(size);
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
        return this.fileChannel.size();
    }

    @Override // okio.FileHandle
    public synchronized void protectedWrite(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.fileChannel.position(fileOffset);
        this.fileChannel.write(ByteBuffer.wrap(array, arrayOffset, byteCount));
    }
}
