package p077i0;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* renamed from: i0.x */
/* loaded from: classes2.dex */
public final class C5668x extends MediaDataSource {

    /* renamed from: a */
    public final /* synthetic */ ByteBuffer f8831a;

    public C5668x(ByteBuffer byteBuffer) {
        this.f8831a = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f8831a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j7, byte[] bArr, int i, int i8) {
        ByteBuffer byteBuffer = this.f8831a;
        if (j7 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j7);
        int iMin = Math.min(i8, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
