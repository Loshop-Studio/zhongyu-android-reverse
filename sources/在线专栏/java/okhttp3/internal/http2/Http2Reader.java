package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import p014b3.C1032a;
import p014b3.C1037f;

/* loaded from: classes.dex */
public final class Http2Reader implements Closeable {
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final BufferedSource source;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }

        @NotNull
        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i4, int i5, int i6) throws IOException {
            if ((i5 & 8) != 0) {
                i4--;
            }
            if (i6 <= i4) {
                return i4 - i6;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i6 + " > remaining length " + i4);
        }
    }

    public static final class ContinuationSource implements Source {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final BufferedSource source;
        private int streamId;

        public ContinuationSource(@NotNull BufferedSource source) {
            C2769l.m9241e(source, "source");
            this.source = source;
        }

        private final void readContinuationHeader() throws IOException {
            int i4 = this.streamId;
            int medium = Util.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            int iAnd = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
            }
            int i5 = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = i5;
            if (iAnd == 9) {
                if (i5 != i4) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iAnd + " != TYPE_CONTINUATION");
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // okio.Source
        public long read(@NotNull Buffer sink, long j4) throws IOException {
            C2769l.m9241e(sink, "sink");
            while (true) {
                int i4 = this.left;
                if (i4 != 0) {
                    long j5 = this.source.read(sink, Math.min(j4, i4));
                    if (j5 == -1) {
                        return -1L;
                    }
                    this.left -= (int) j5;
                    return j5;
                }
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        public final void setFlags(int i4) {
            this.flags = i4;
        }

        public final void setLeft(int i4) {
            this.left = i4;
        }

        public final void setLength(int i4) {
            this.length = i4;
        }

        public final void setPadding(int i4) {
            this.padding = i4;
        }

        public final void setStreamId(int i4) {
            this.streamId = i4;
        }

        @Override // okio.Source
        @NotNull
        public Timeout timeout() {
            return this.source.timeout();
        }
    }

    public interface Handler {
        void ackSettings();

        void alternateService(int i4, @NotNull String str, @NotNull ByteString byteString, @NotNull String str2, int i5, long j4);

        void data(boolean z3, int i4, @NotNull BufferedSource bufferedSource, int i5) throws IOException;

        void goAway(int i4, @NotNull ErrorCode errorCode, @NotNull ByteString byteString);

        void headers(boolean z3, int i4, int i5, @NotNull List<Header> list);

        void ping(boolean z3, int i4, int i5);

        void priority(int i4, int i5, int i6, boolean z3);

        void pushPromise(int i4, int i5, @NotNull List<Header> list) throws IOException;

        void rstStream(int i4, @NotNull ErrorCode errorCode);

        void settings(boolean z3, @NotNull Settings settings);

        void windowUpdate(int i4, long j4);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        C2769l.m9240d(logger2, "Logger.getLogger(Http2::class.java.name)");
        logger = logger2;
    }

    public Http2Reader(@NotNull BufferedSource source, boolean z3) {
        C2769l.m9241e(source, "source");
        this.source = source;
        this.client = z3;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    private final void readData(Handler handler, int i4, int i5, int i6) throws IOException {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z3 = (i5 & 1) != 0;
        if ((i5 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iAnd = (i5 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.data(z3, i6, this.source, Companion.lengthWithoutPadding(i4, i5, iAnd));
        this.source.skip(iAnd);
    }

    private final void readGoAway(Handler handler, int i4, int i5, int i6) throws IOException {
        if (i4 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i4);
        }
        if (i6 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i7 = this.source.readInt();
        int i8 = this.source.readInt();
        int i9 = i4 - 8;
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(i8);
        if (errorCodeFromHttp2 == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i8);
        }
        ByteString byteString = ByteString.EMPTY;
        if (i9 > 0) {
            byteString = this.source.readByteString(i9);
        }
        handler.goAway(i7, errorCodeFromHttp2, byteString);
    }

    private final List<Header> readHeaderBlock(int i4, int i5, int i6, int i7) throws IOException {
        this.continuation.setLeft(i4);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i5);
        this.continuation.setFlags(i6);
        this.continuation.setStreamId(i7);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i4, int i5, int i6) throws IOException {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z3 = (i5 & 1) != 0;
        int iAnd = (i5 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        if ((i5 & 32) != 0) {
            readPriority(handler, i6);
            i4 -= 5;
        }
        handler.headers(z3, i6, -1, readHeaderBlock(Companion.lengthWithoutPadding(i4, i5, iAnd), iAnd, i5, i6));
    }

    private final void readPing(Handler handler, int i4, int i5, int i6) throws IOException {
        if (i4 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i4);
        }
        if (i6 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.ping((i5 & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void readPriority(Handler handler, int i4, int i5, int i6) throws IOException {
        if (i4 == 5) {
            if (i6 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            readPriority(handler, i6);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i4 + " != 5");
        }
    }

    private final void readPushPromise(Handler handler, int i4, int i5, int i6) throws IOException {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iAnd = (i5 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.pushPromise(i6, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(Companion.lengthWithoutPadding(i4 - 4, i5, iAnd), iAnd, i5, i6));
    }

    private final void readRstStream(Handler handler, int i4, int i5, int i6) throws IOException {
        if (i4 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i4 + " != 4");
        }
        if (i6 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i7 = this.source.readInt();
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(i7);
        if (errorCodeFromHttp2 != null) {
            handler.rstStream(i6, errorCodeFromHttp2);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i7);
    }

    private final void readSettings(Handler handler, int i4, int i5, int i6) throws IOException {
        int i7;
        if (i6 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i5 & 1) != 0) {
            if (i4 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.ackSettings();
            return;
        }
        if (i4 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i4);
        }
        Settings settings = new Settings();
        C1032a c1032aM4827h = C1037f.m4827h(C1037f.m4828i(0, i4), 6);
        int iM4802a = c1032aM4827h.m4802a();
        int iM4803b = c1032aM4827h.m4803b();
        int iM4804c = c1032aM4827h.m4804c();
        if (iM4804c < 0 ? iM4802a >= iM4803b : iM4802a <= iM4803b) {
            while (true) {
                int iAnd = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                i7 = this.source.readInt();
                if (iAnd != 2) {
                    if (iAnd == 3) {
                        iAnd = 4;
                    } else if (iAnd == 4) {
                        iAnd = 7;
                        if (i7 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                    } else if (iAnd == 5 && (i7 < 16384 || i7 > 16777215)) {
                        break;
                    }
                } else if (i7 != 0 && i7 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.set(iAnd, i7);
                if (iM4802a == iM4803b) {
                    break;
                } else {
                    iM4802a += iM4804c;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i7);
        }
        handler.settings(false, settings);
    }

    private final void readWindowUpdate(Handler handler, int i4, int i5, int i6) throws IOException {
        if (i4 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i4);
        }
        long jAnd = Util.and(this.source.readInt(), 2147483647L);
        if (jAnd == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.windowUpdate(i6, jAnd);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean z3, @NotNull Handler handler) throws IOException {
        C2769l.m9241e(handler, "handler");
        try {
            this.source.require(9L);
            int medium = Util.readMedium(this.source);
            if (medium > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + medium);
            }
            int iAnd = Util.and(this.source.readByte(), 255);
            int iAnd2 = Util.and(this.source.readByte(), 255);
            int i4 = this.source.readInt() & Integer.MAX_VALUE;
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLog(true, i4, medium, iAnd, iAnd2));
            }
            if (z3 && iAnd != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(iAnd));
            }
            switch (iAnd) {
                case 0:
                    readData(handler, medium, iAnd2, i4);
                    return true;
                case 1:
                    readHeaders(handler, medium, iAnd2, i4);
                    return true;
                case 2:
                    readPriority(handler, medium, iAnd2, i4);
                    return true;
                case 3:
                    readRstStream(handler, medium, iAnd2, i4);
                    return true;
                case 4:
                    readSettings(handler, medium, iAnd2, i4);
                    return true;
                case 5:
                    readPushPromise(handler, medium, iAnd2, i4);
                    return true;
                case 6:
                    readPing(handler, medium, iAnd2, i4);
                    return true;
                case 7:
                    readGoAway(handler, medium, iAnd2, i4);
                    return true;
                case 8:
                    readWindowUpdate(handler, medium, iAnd2, i4);
                    return true;
                default:
                    this.source.skip(medium);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(@NotNull Handler handler) throws IOException {
        C2769l.m9241e(handler, "handler");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        BufferedSource bufferedSource = this.source;
        ByteString byteString = Http2.CONNECTION_PREFACE;
        ByteString byteString2 = bufferedSource.readByteString(byteString.size());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION " + byteString2.hex(), new Object[0]));
        }
        if (!C2769l.m9237a(byteString, byteString2)) {
            throw new IOException("Expected a connection header but was " + byteString2.utf8());
        }
    }

    private final void readPriority(Handler handler, int i4) throws IOException {
        int i5 = this.source.readInt();
        handler.priority(i4, i5 & Integer.MAX_VALUE, Util.and(this.source.readByte(), 255) + 1, (i5 & ((int) 2147483648L)) != 0);
    }
}
