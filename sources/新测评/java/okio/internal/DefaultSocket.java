package okio.internal;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Socket;
import okio.Source;

@Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m13558d2 = {"Lokio/internal/DefaultSocket;", "Lokio/Socket;", "socket", "Ljava/net/Socket;", "<init>", "(Ljava/net/Socket;)V", "getSocket", "()Ljava/net/Socket;", "closeBits", "Ljava/util/concurrent/atomic/AtomicInteger;", "source", "Lokio/Source;", "getSource", "()Lokio/Source;", "sink", "Lokio/Sink;", "getSink", "()Lokio/Sink;", "cancel", "", "toString", "", "SocketSink", "SocketSource", "okio"}, m13559k = 1, m13560mv = {2, 1, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class DefaultSocket implements Socket {
    private AtomicInteger closeBits;
    private final Sink sink;
    private final java.net.Socket socket;
    private final Source source;

    @Metadata(m13557d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m13558d2 = {"Lokio/internal/DefaultSocket$SocketSink;", "Lokio/Sink;", "<init>", "(Lokio/internal/DefaultSocket;)V", "timeout", "Lokio/internal/SocketAsyncTimeout;", "write", "", "source", "Lokio/Buffer;", "byteCount", "", "flush", "close", "toString", "", "okio"}, m13559k = 1, m13560mv = {2, 1, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nDefaultSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSocket.kt\nokio/internal/DefaultSocket$SocketSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,162:1\n85#2:163\n171#3,11:164\n171#3,11:175\n171#3,11:186\n*S KotlinDebug\n*F\n+ 1 DefaultSocket.kt\nokio/internal/DefaultSocket$SocketSink\n*L\n59#1:163\n60#1:164,11\n76#1:175,11\n82#1:186,11\n*E\n"})
    /* renamed from: okio.internal.DefaultSocket$SocketSink, reason: from toString */
    public final class sink implements Sink {
        private final SocketAsyncTimeout timeout;

        public sink() {
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
                    Unit unit = Unit.INSTANCE;
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
                Unit unit = Unit.INSTANCE;
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
        public void write(Buffer source, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
            while (byteCount > 0) {
                this.timeout.throwIfReached();
                Segment segment = source.head;
                Intrinsics.checkNotNull(segment);
                int iMin = (int) Math.min(byteCount, segment.limit - segment.pos);
                SocketAsyncTimeout socketAsyncTimeout = this.timeout;
                DefaultSocket defaultSocket = DefaultSocket.this;
                socketAsyncTimeout.enter();
                try {
                    try {
                        defaultSocket.getSocket().getOutputStream().write(segment.data, segment.pos, iMin);
                        Unit unit = Unit.INSTANCE;
                        if (socketAsyncTimeout.exit()) {
                            throw socketAsyncTimeout.access$newTimeoutException(null);
                        }
                        segment.pos += iMin;
                        long j10 = iMin;
                        byteCount -= j10;
                        source.setSize$okio(source.size() - j10);
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
        /* renamed from: timeout, reason: from getter */
        public SocketAsyncTimeout getTimeout() {
            return this.timeout;
        }
    }

    @Metadata(m13557d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m13558d2 = {"Lokio/internal/DefaultSocket$SocketSource;", "Lokio/Source;", "<init>", "(Lokio/internal/DefaultSocket;)V", "timeout", "Lokio/internal/SocketAsyncTimeout;", "read", "", "sink", "Lokio/Buffer;", "byteCount", "close", "", "toString", "", "okio"}, m13559k = 1, m13560mv = {2, 1, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nDefaultSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSocket.kt\nokio/internal/DefaultSocket$SocketSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n+ 4 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,162:1\n1#2:163\n85#3:164\n171#4,11:165\n171#4,11:176\n*S KotlinDebug\n*F\n+ 1 DefaultSocket.kt\nokio/internal/DefaultSocket$SocketSource\n*L\n113#1:164\n115#1:165,11\n136#1:176,11\n*E\n"})
    /* renamed from: okio.internal.DefaultSocket$SocketSource, reason: from toString */
    public final class source implements Source {
        private final SocketAsyncTimeout timeout;

        public source() {
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
                    Unit unit = Unit.INSTANCE;
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
        public long read(Buffer sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount == 0) {
                return 0L;
            }
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            this.timeout.throwIfReached();
            Segment segmentWritableSegment$okio = sink.writableSegment$okio(1);
            int iMin = (int) Math.min(byteCount, 8192 - segmentWritableSegment$okio.limit);
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
                        long j10 = i10;
                        sink.setSize$okio(sink.size() + j10);
                        return j10;
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
        /* renamed from: timeout, reason: from getter */
        public SocketAsyncTimeout getTimeout() {
            return this.timeout;
        }
    }

    public DefaultSocket(java.net.Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.socket = socket;
        this.closeBits = new AtomicInteger();
        this.source = new source();
        this.sink = new sink();
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
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
