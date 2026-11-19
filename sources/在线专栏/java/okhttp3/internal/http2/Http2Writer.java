package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.Buffer;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final Buffer hpackBuffer;

    @NotNull
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final BufferedSink sink;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }
    }

    public Http2Writer(@NotNull BufferedSink sink, boolean z3) {
        C2769l.m9241e(sink, "sink");
        this.sink = sink;
        this.client = z3;
        Buffer buffer = new Buffer();
        this.hpackBuffer = buffer;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, buffer, 3, null);
    }

    private final void writeContinuationFrames(int i4, long j4) throws IOException {
        while (j4 > 0) {
            long jMin = Math.min(this.maxFrameSize, j4);
            j4 -= jMin;
            frameHeader(i4, (int) jMin, 9, j4 == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, jMin);
        }
    }

    public final synchronized void applyAndAckSettings(@NotNull Settings peerSettings) throws IOException {
        C2769l.m9241e(peerSettings, "peerSettings");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
        if (peerSettings.getHeaderTableSize() != -1) {
            this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
        }
        frameHeader(0, 0, 4, 1);
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (this.client) {
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.hex(), new Object[0]));
            }
            this.sink.write(Http2.CONNECTION_PREFACE);
            this.sink.flush();
        }
    }

    public final synchronized void data(boolean z3, int i4, @Nullable Buffer buffer, int i5) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        dataFrame(i4, z3 ? 1 : 0, buffer, i5);
    }

    public final void dataFrame(int i4, int i5, @Nullable Buffer buffer, int i6) throws IOException {
        frameHeader(i4, i6, 0, i5);
        if (i6 > 0) {
            BufferedSink bufferedSink = this.sink;
            C2769l.m9239c(buffer);
            bufferedSink.write(buffer, i6);
        }
    }

    public final synchronized void flush() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final void frameHeader(int i4, int i5, int i6, int i7) throws IOException {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, i4, i5, i6, i7));
        }
        if (!(i5 <= this.maxFrameSize)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i5).toString());
        }
        if (!((((int) 2147483648L) & i4) == 0)) {
            throw new IllegalArgumentException(("reserved bit set: " + i4).toString());
        }
        Util.writeMedium(this.sink, i5);
        this.sink.writeByte(i6 & 255);
        this.sink.writeByte(i7 & 255);
        this.sink.writeInt(i4 & Integer.MAX_VALUE);
    }

    @NotNull
    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i4, @NotNull ErrorCode errorCode, @NotNull byte[] debugData) throws IOException {
        C2769l.m9241e(errorCode, "errorCode");
        C2769l.m9241e(debugData, "debugData");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        frameHeader(0, debugData.length + 8, 7, 0);
        this.sink.writeInt(i4);
        this.sink.writeInt(errorCode.getHttpCode());
        if (!(debugData.length == 0)) {
            this.sink.write(debugData);
        }
        this.sink.flush();
    }

    public final synchronized void headers(boolean z3, int i4, @NotNull List<Header> headerBlock) throws IOException {
        C2769l.m9241e(headerBlock, "headerBlock");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(headerBlock);
        long size = this.hpackBuffer.size();
        long jMin = Math.min(this.maxFrameSize, size);
        int i5 = size == jMin ? 4 : 0;
        if (z3) {
            i5 |= 1;
        }
        frameHeader(i4, (int) jMin, 1, i5);
        this.sink.write(this.hpackBuffer, jMin);
        if (size > jMin) {
            writeContinuationFrames(i4, size - jMin);
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z3, int i4, int i5) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, 6, z3 ? 1 : 0);
        this.sink.writeInt(i4);
        this.sink.writeInt(i5);
        this.sink.flush();
    }

    public final synchronized void pushPromise(int i4, int i5, @NotNull List<Header> requestHeaders) throws IOException {
        C2769l.m9241e(requestHeaders, "requestHeaders");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(requestHeaders);
        long size = this.hpackBuffer.size();
        int iMin = (int) Math.min(this.maxFrameSize - 4, size);
        long j4 = iMin;
        frameHeader(i4, iMin + 4, 5, size == j4 ? 4 : 0);
        this.sink.writeInt(i5 & Integer.MAX_VALUE);
        this.sink.write(this.hpackBuffer, j4);
        if (size > j4) {
            writeContinuationFrames(i4, size - j4);
        }
    }

    public final synchronized void rstStream(int i4, @NotNull ErrorCode errorCode) throws IOException {
        C2769l.m9241e(errorCode, "errorCode");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        frameHeader(i4, 4, 3, 0);
        this.sink.writeInt(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void settings(@NotNull Settings settings) throws IOException {
        C2769l.m9241e(settings, "settings");
        if (this.closed) {
            throw new IOException("closed");
        }
        int i4 = 0;
        frameHeader(0, settings.size() * 6, 4, 0);
        while (i4 < 10) {
            if (settings.isSet(i4)) {
                this.sink.writeShort(i4 != 4 ? i4 != 7 ? i4 : 4 : 3);
                this.sink.writeInt(settings.get(i4));
            }
            i4++;
        }
        this.sink.flush();
    }

    public final synchronized void windowUpdate(int i4, long j4) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(j4 != 0 && j4 <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j4).toString());
        }
        frameHeader(i4, 4, 8, 0);
        this.sink.writeInt((int) j4);
        this.sink.flush();
    }
}
