package okio;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
final class OutputStreamSink implements Sink {
    private final OutputStream out;
    private final Timeout timeout;

    public OutputStreamSink(OutputStream out, Timeout timeout) {
        AbstractC9979u.m20294g(out, "out");
        AbstractC9979u.m20294g(timeout, "timeout");
        this.out = out;
        this.timeout = timeout;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.timeout;
    }

    public String toString() {
        return "sink(" + this.out + ')';
    }

    @Override // okio.Sink
    public void write(Buffer source, long j10) throws IOException {
        AbstractC9979u.m20294g(source, "source");
        SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j10);
        while (j10 > 0) {
            this.timeout.throwIfReached();
            Segment segment = source.head;
            AbstractC9979u.m20291d(segment);
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            this.out.write(segment.data, segment.pos, iMin);
            segment.pos += iMin;
            long j11 = iMin;
            j10 -= j11;
            source.setSize$okio(source.size() - j11);
            if (segment.pos == segment.limit) {
                source.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }
}
