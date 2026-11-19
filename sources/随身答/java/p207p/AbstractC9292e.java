package p207p;

import java.nio.ByteBuffer;
import kotlin.ranges.RangesKt;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* renamed from: p.e */
/* loaded from: classes3.dex */
public abstract class AbstractC9292e {
    /* renamed from: a */
    public static final Source m15132a(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    /* renamed from: p.e$a */
    public static final class a implements Source {

        /* renamed from: a */
        public final ByteBuffer f16090a;

        /* renamed from: b */
        public final int f16091b;

        public a(ByteBuffer byteBuffer) {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            this.f16090a = byteBufferSlice;
            this.f16091b = byteBufferSlice.capacity();
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j9) {
            if (this.f16090a.position() == this.f16091b) {
                return -1L;
            }
            this.f16090a.limit(RangesKt.coerceAtMost((int) (this.f16090a.position() + j9), this.f16091b));
            return buffer.write(this.f16090a);
        }

        @Override // okio.Source
        public Timeout timeout() {
            return Timeout.NONE;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
