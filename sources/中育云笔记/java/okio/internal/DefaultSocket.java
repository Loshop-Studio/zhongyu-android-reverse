package okio.internal;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Buffer;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Socket;
import okio.Source;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public final class DefaultSocket implements Socket {
    private AtomicInteger closeBits;
    private final Sink sink;
    private final java.net.Socket socket;
    private final Source source;

    public final class SocketSink implements Sink {
        private final SocketAsyncTimeout timeout;

        public SocketSink() {
            this.timeout = new SocketAsyncTimeout(DefaultSocket.this.getSocket());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            SocketAsyncTimeout socketAsyncTimeout = this.timeout;
            DefaultSocket defaultSocket = DefaultSocket.this;
            socketAsyncTimeout.enter();
            try {
                int bitsOrZero = _AtomicKt.setBitsOrZero(defaultSocket.closeBits, 1);
                if (bitsOrZero != 0) {
                    if (bitsOrZero != 3) {
                        if (!defaultSocket.getSocket().isClosed() && !defaultSocket.getSocket().isOutputShutdown()) {
                            defaultSocket.getSocket().getOutputStream().flush();
                            defaultSocket.getSocket().shutdownOutput();
                        }
                        return;
                    }
                    defaultSocket.getSocket().close();
                    C10786q c10786q = C10786q.f26013a;
                    if (socketAsyncTimeout.exit()) {
                        throw socketAsyncTimeout.access$newTimeoutException(null);
                    }
                }
            } catch (IOException e10) {
                if (!socketAsyncTimeout.exit()) {
                    throw e10;
                }
                throw socketAsyncTimeout.access$newTimeoutException(e10);
            } finally {
                socketAsyncTimeout.exit();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            SocketAsyncTimeout socketAsyncTimeout = this.timeout;
            DefaultSocket defaultSocket = DefaultSocket.this;
            socketAsyncTimeout.enter();
            try {
                defaultSocket.getSocket().getOutputStream().flush();
                C10786q c10786q = C10786q.f26013a;
                if (socketAsyncTimeout.exit()) {
                    throw socketAsyncTimeout.access$newTimeoutException(null);
                }
            } catch (IOException e10) {
                if (!socketAsyncTimeout.exit()) {
                    throw e10;
                }
                throw socketAsyncTimeout.access$newTimeoutException(e10);
            } finally {
                socketAsyncTimeout.exit();
            }
        }

        public String toString() {
            return "sink(" + DefaultSocket.this.getSocket() + ')';
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
                SocketAsyncTimeout socketAsyncTimeout = this.timeout;
                DefaultSocket defaultSocket = DefaultSocket.this;
                socketAsyncTimeout.enter();
                try {
                    try {
                        defaultSocket.getSocket().getOutputStream().write(segment.data, segment.pos, iMin);
                        C10786q c10786q = C10786q.f26013a;
                        if (socketAsyncTimeout.exit()) {
                            throw socketAsyncTimeout.access$newTimeoutException(null);
                        }
                        segment.pos += iMin;
                        long j11 = iMin;
                        j10 -= j11;
                        source.setSize$okio(source.size() - j11);
                        if (segment.pos == segment.limit) {
                            source.head = segment.pop();
                            SegmentPool.recycle(segment);
                        }
                    } catch (IOException e10) {
                        if (!socketAsyncTimeout.exit()) {
                            throw e10;
                        }
                        throw socketAsyncTimeout.access$newTimeoutException(e10);
                    }
                } catch (Throwable th) {
                    socketAsyncTimeout.exit();
                    throw th;
                }
            }
        }

        @Override // okio.Sink
        public SocketAsyncTimeout timeout() {
            return this.timeout;
        }
    }

    public final class SocketSource implements Source {
        private final SocketAsyncTimeout timeout;

        public SocketSource() {
            this.timeout = new SocketAsyncTimeout(DefaultSocket.this.getSocket());
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            SocketAsyncTimeout socketAsyncTimeout = this.timeout;
            DefaultSocket defaultSocket = DefaultSocket.this;
            socketAsyncTimeout.enter();
            try {
                int bitsOrZero = _AtomicKt.setBitsOrZero(defaultSocket.closeBits, 2);
                if (bitsOrZero != 0) {
                    if (bitsOrZero != 3) {
                        if (!defaultSocket.getSocket().isClosed() && !defaultSocket.getSocket().isInputShutdown()) {
                            defaultSocket.getSocket().shutdownInput();
                        }
                        return;
                    }
                    defaultSocket.getSocket().close();
                    C10786q c10786q = C10786q.f26013a;
                    if (socketAsyncTimeout.exit()) {
                        throw socketAsyncTimeout.access$newTimeoutException(null);
                    }
                }
            } catch (IOException e10) {
                if (!socketAsyncTimeout.exit()) {
                    throw e10;
                }
                throw socketAsyncTimeout.access$newTimeoutException(e10);
            } finally {
                socketAsyncTimeout.exit();
            }
        }

        @Override // okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            AbstractC9979u.m20294g(sink, "sink");
            if (j10 == 0) {
                return 0L;
            }
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            this.timeout.throwIfReached();
            Segment segmentWritableSegment$okio = sink.writableSegment$okio(1);
            int iMin = (int) Math.min(j10, 8192 - segmentWritableSegment$okio.limit);
            try {
                SocketAsyncTimeout socketAsyncTimeout = this.timeout;
                DefaultSocket defaultSocket = DefaultSocket.this;
                socketAsyncTimeout.enter();
                try {
                    int i10 = defaultSocket.getSocket().getInputStream().read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
                    if (socketAsyncTimeout.exit()) {
                        throw socketAsyncTimeout.access$newTimeoutException(null);
                    }
                    if (i10 != -1) {
                        segmentWritableSegment$okio.limit += i10;
                        long j11 = i10;
                        sink.setSize$okio(sink.size() + j11);
                        return j11;
                    }
                    if (segmentWritableSegment$okio.pos != segmentWritableSegment$okio.limit) {
                        return -1L;
                    }
                    sink.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                    return -1L;
                } catch (IOException e10) {
                    if (socketAsyncTimeout.exit()) {
                        throw socketAsyncTimeout.access$newTimeoutException(e10);
                    }
                    throw e10;
                } finally {
                    socketAsyncTimeout.exit();
                }
            } catch (AssertionError e11) {
                if (_JavaIoKt.isAndroidGetsocknameError(e11)) {
                    throw new IOException(e11);
                }
                throw e11;
            }
        }

        public String toString() {
            return "source(" + DefaultSocket.this.getSocket() + ')';
        }

        @Override // okio.Source
        public SocketAsyncTimeout timeout() {
            return this.timeout;
        }
    }

    public DefaultSocket(java.net.Socket socket) {
        AbstractC9979u.m20294g(socket, "socket");
        this.socket = socket;
        this.closeBits = new AtomicInteger();
        this.source = new SocketSource();
        this.sink = new SocketSink();
    }

    @Override // okio.Socket
    public void cancel() throws IOException {
        this.socket.close();
    }

    @Override // okio.Socket
    public Sink getSink() {
        return this.sink;
    }

    public final java.net.Socket getSocket() {
        return this.socket;
    }

    @Override // okio.Socket
    public Source getSource() {
        return this.source;
    }

    public String toString() {
        String string = this.socket.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }
}
