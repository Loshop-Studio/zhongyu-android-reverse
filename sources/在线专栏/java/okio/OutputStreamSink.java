package okio;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class OutputStreamSink implements Sink {
    private final OutputStream out;
    private final Timeout timeout;

    public OutputStreamSink(@NotNull OutputStream out, @NotNull Timeout timeout) {
        C2769l.m9241e(out, "out");
        C2769l.m9241e(timeout, "timeout");
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
    @NotNull
    public Timeout timeout() {
        return this.timeout;
    }

    @NotNull
    public String toString() {
        return "sink(" + this.out + ')';
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long j4) throws IOException {
        C2769l.m9241e(source, "source");
        Util.checkOffsetAndCount(source.size(), 0L, j4);
        while (j4 > 0) {
            this.timeout.throwIfReached();
            Segment segment = source.head;
            C2769l.m9239c(segment);
            int iMin = (int) Math.min(j4, segment.limit - segment.pos);
            this.out.write(segment.data, segment.pos, iMin);
            segment.pos += iMin;
            long j5 = iMin;
            j4 -= j5;
            source.setSize$okio(source.size() - j5);
            if (segment.pos == segment.limit) {
                source.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }
}
