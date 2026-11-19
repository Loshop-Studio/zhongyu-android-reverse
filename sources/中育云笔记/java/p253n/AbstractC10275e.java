package p253n;

import java.nio.ByteBuffer;
import okio.Buffer;
import okio.Source;
import okio.Timeout;
import p265nd.AbstractC10410o;

/* renamed from: n.e */
/* loaded from: classes3.dex */
public abstract class AbstractC10275e {
    /* renamed from: a */
    public static final Source m21400a(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    /* renamed from: n.e$a */
    public static final class a implements Source {

        /* renamed from: c */
        public final ByteBuffer f24461c;

        /* renamed from: d */
        public final int f24462d;

        public a(ByteBuffer byteBuffer) {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            this.f24461c = byteBufferSlice;
            this.f24462d = byteBufferSlice.capacity();
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j10) {
            if (this.f24461c.position() == this.f24462d) {
                return -1L;
            }
            this.f24461c.limit(AbstractC10410o.m21756i((int) (this.f24461c.position() + j10), this.f24462d));
            return buffer.write(this.f24461c);
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
