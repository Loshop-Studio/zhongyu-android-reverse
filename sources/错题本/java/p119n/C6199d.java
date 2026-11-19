package p119n;

import java.nio.ByteBuffer;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* renamed from: n.d */
/* loaded from: classes2.dex */
public final class C6199d implements Source {

    /* renamed from: a */
    public final ByteBuffer f9913a;

    /* renamed from: b */
    public final int f9914b;

    public C6199d(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.f9913a = byteBufferSlice;
        this.f9914b = byteBufferSlice.capacity();
    }

    @Override // okio.Source
    public final long read(Buffer buffer, long j7) {
        ByteBuffer byteBuffer = this.f9913a;
        int iPosition = byteBuffer.position();
        int i = this.f9914b;
        if (iPosition == i) {
            return -1L;
        }
        int iPosition2 = (int) (byteBuffer.position() + j7);
        if (iPosition2 <= i) {
            i = iPosition2;
        }
        byteBuffer.limit(i);
        return buffer.write(byteBuffer);
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public final Timeout getThis$0() {
        return Timeout.NONE;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
