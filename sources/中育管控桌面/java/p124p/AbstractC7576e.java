package p124p;

import java.nio.ByteBuffer;
import kotlin.ranges.RangesKt;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* renamed from: p.e */
/* loaded from: classes3.dex */
public abstract class AbstractC7576e {
    /* renamed from: a */
    public static final Source m8973a(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    /* renamed from: p.e$a */
    public static final class a implements Source {

        /* renamed from: a */
        public final ByteBuffer f10025a;

        /* renamed from: b */
        public final int f10026b;

        public a(ByteBuffer byteBuffer) {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            this.f10025a = byteBufferSlice;
            this.f10026b = byteBufferSlice.capacity();
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j6) {
            if (this.f10025a.position() == this.f10026b) {
                return -1L;
            }
            this.f10025a.limit(RangesKt.coerceAtMost((int) (this.f10025a.position() + j6), this.f10026b));
            return buffer.write(this.f10025a);
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
