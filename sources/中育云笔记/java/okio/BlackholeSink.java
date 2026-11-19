package okio;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
final class BlackholeSink implements Sink {
    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @Override // okio.Sink
    public void write(Buffer source, long j10) throws EOFException {
        AbstractC9979u.m20294g(source, "source");
        source.skip(j10);
    }
}
