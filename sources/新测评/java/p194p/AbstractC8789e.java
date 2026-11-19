package p194p;

import java.nio.ByteBuffer;
import kotlin.ranges.RangesKt;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* renamed from: p.e */
/* loaded from: classes3.dex */
public abstract class AbstractC8789e {
    /* renamed from: a */
    public static final Source m14681a(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    /* renamed from: p.e$a */
    public static final class a implements Source {

        /* renamed from: a */
        public final ByteBuffer f14925a;

        /* renamed from: b */
        public final int f14926b;

        public a(ByteBuffer byteBuffer) {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            this.f14925a = byteBufferSlice;
            this.f14926b = byteBufferSlice.capacity();
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j10) {
            if (this.f14925a.position() == this.f14926b) {
                return -1L;
            }
            this.f14925a.limit(RangesKt.coerceAtMost((int) (this.f14925a.position() + j10), this.f14926b));
            return buffer.write(this.f14925a);
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return Timeout.NONE;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
