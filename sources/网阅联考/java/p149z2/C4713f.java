package p149z2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import okhttp3.internal.http2.ErrorCode;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import p121s2.AbstractC4550b;
import p149z2.C4709b;

/* renamed from: z2.f */
/* loaded from: classes2.dex */
public final class C4713f implements Closeable {

    /* renamed from: e */
    public static final Logger f6220e;

    /* renamed from: f */
    public static final a f6221f = new a(null);

    /* renamed from: a */
    public final b f6222a;

    /* renamed from: b */
    public final C4709b.a f6223b;

    /* renamed from: c */
    public final BufferedSource f6224c;

    /* renamed from: d */
    public final boolean f6225d;

    /* renamed from: z2.f$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Logger m6840a() {
            return C4713f.f6220e;
        }

        /* renamed from: b */
        public final int m6841b(int i4, int i5, int i6) throws IOException {
            if ((i5 & 8) != 0) {
                i4--;
            }
            if (i6 <= i4) {
                return i4 - i6;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i6 + " > remaining length " + i4);
        }
    }

    /* renamed from: z2.f$b */
    public static final class b implements Source {

        /* renamed from: a */
        public int f6226a;

        /* renamed from: b */
        public int f6227b;

        /* renamed from: c */
        public int f6228c;

        /* renamed from: d */
        public int f6229d;

        /* renamed from: e */
        public int f6230e;

        /* renamed from: f */
        public final BufferedSource f6231f;

        public b(BufferedSource source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f6231f = source;
        }

        /* renamed from: a */
        public final int m6842a() {
            return this.f6229d;
        }

        /* renamed from: b */
        public final void m6843b() throws IOException {
            int i4 = this.f6228c;
            int iM6203F = AbstractC4550b.m6203F(this.f6231f);
            this.f6229d = iM6203F;
            this.f6226a = iM6203F;
            int iM6220b = AbstractC4550b.m6220b(this.f6231f.readByte(), 255);
            this.f6227b = AbstractC4550b.m6220b(this.f6231f.readByte(), 255);
            a aVar = C4713f.f6221f;
            if (aVar.m6840a().isLoggable(Level.FINE)) {
                aVar.m6840a().fine(C4710c.f6102e.m6742c(true, this.f6228c, this.f6226a, iM6220b, this.f6227b));
            }
            int i5 = this.f6231f.readInt() & Integer.MAX_VALUE;
            this.f6228c = i5;
            if (iM6220b == 9) {
                if (i5 != i4) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iM6220b + " != TYPE_CONTINUATION");
            }
        }

        /* renamed from: c */
        public final void m6844c(int i4) {
            this.f6227b = i4;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: d */
        public final void m6845d(int i4) {
            this.f6229d = i4;
        }

        /* renamed from: e */
        public final void m6846e(int i4) {
            this.f6226a = i4;
        }

        /* renamed from: f */
        public final void m6847f(int i4) {
            this.f6230e = i4;
        }

        /* renamed from: g */
        public final void m6848g(int i4) {
            this.f6228c = i4;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j4) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i4 = this.f6229d;
                if (i4 != 0) {
                    long j5 = this.f6231f.read(sink, Math.min(j4, i4));
                    if (j5 == -1) {
                        return -1L;
                    }
                    this.f6229d -= (int) j5;
                    return j5;
                }
                this.f6231f.skip(this.f6230e);
                this.f6230e = 0;
                if ((this.f6227b & 4) != 0) {
                    return -1L;
                }
                m6843b();
            }
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f6231f.getTimeout();
        }
    }

    /* renamed from: z2.f$c */
    public interface c {
        /* renamed from: a */
        void mo6810a();

        /* renamed from: b */
        void mo6811b(boolean z3, int i4, int i5, List list);

        /* renamed from: c */
        void mo6812c(int i4, long j4);

        /* renamed from: d */
        void mo6813d(boolean z3, int i4, BufferedSource bufferedSource, int i5);

        /* renamed from: e */
        void mo6814e(boolean z3, int i4, int i5);

        /* renamed from: f */
        void mo6815f(int i4, int i5, int i6, boolean z3);

        /* renamed from: g */
        void mo6816g(int i4, ErrorCode errorCode);

        /* renamed from: h */
        void mo6817h(boolean z3, C4718k c4718k);

        /* renamed from: i */
        void mo6818i(int i4, int i5, List list);

        /* renamed from: j */
        void mo6819j(int i4, ErrorCode errorCode, ByteString byteString);
    }

    static {
        Logger logger = Logger.getLogger(C4710c.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "Logger.getLogger(Http2::class.java.name)");
        f6220e = logger;
    }

    public C4713f(BufferedSource source, boolean z3) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f6224c = source;
        this.f6225d = z3;
        b bVar = new b(source);
        this.f6222a = bVar;
        this.f6223b = new C4709b.a(bVar, 4096, 0, 4, null);
    }

    /* renamed from: b */
    public final boolean m6827b(boolean z3, c handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.f6224c.require(9L);
            int iM6203F = AbstractC4550b.m6203F(this.f6224c);
            if (iM6203F > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iM6203F);
            }
            int iM6220b = AbstractC4550b.m6220b(this.f6224c.readByte(), 255);
            int iM6220b2 = AbstractC4550b.m6220b(this.f6224c.readByte(), 255);
            int i4 = this.f6224c.readInt() & Integer.MAX_VALUE;
            Logger logger = f6220e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C4710c.f6102e.m6742c(true, i4, iM6203F, iM6220b, iM6220b2));
            }
            if (z3 && iM6220b != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + C4710c.f6102e.m6741b(iM6220b));
            }
            switch (iM6220b) {
                case 0:
                    m6829d(handler, iM6203F, iM6220b2, i4);
                    return true;
                case 1:
                    m6832g(handler, iM6203F, iM6220b2, i4);
                    return true;
                case 2:
                    m6835j(handler, iM6203F, iM6220b2, i4);
                    return true;
                case 3:
                    m6837l(handler, iM6203F, iM6220b2, i4);
                    return true;
                case 4:
                    m6838m(handler, iM6203F, iM6220b2, i4);
                    return true;
                case 5:
                    m6836k(handler, iM6203F, iM6220b2, i4);
                    return true;
                case 6:
                    m6833h(handler, iM6203F, iM6220b2, i4);
                    return true;
                case 7:
                    m6830e(handler, iM6203F, iM6220b2, i4);
                    return true;
                case 8:
                    m6839n(handler, iM6203F, iM6220b2, i4);
                    return true;
                default:
                    this.f6224c.skip(iM6203F);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final void m6828c(c handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f6225d) {
            if (!m6827b(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        BufferedSource bufferedSource = this.f6224c;
        ByteString byteString = C4710c.f6098a;
        ByteString byteString2 = bufferedSource.readByteString(byteString.size());
        Logger logger = f6220e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(AbstractC4550b.m6235q("<< CONNECTION " + byteString2.hex(), new Object[0]));
        }
        if (!Intrinsics.areEqual(byteString, byteString2)) {
            throw new IOException("Expected a connection header but was " + byteString2.utf8());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6224c.close();
    }

    /* renamed from: d */
    public final void m6829d(c cVar, int i4, int i5, int i6) throws IOException {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z3 = (i5 & 1) != 0;
        if ((i5 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iM6220b = (i5 & 8) != 0 ? AbstractC4550b.m6220b(this.f6224c.readByte(), 255) : 0;
        cVar.mo6813d(z3, i6, this.f6224c, f6221f.m6841b(i4, i5, iM6220b));
        this.f6224c.skip(iM6220b);
    }

    /* renamed from: e */
    public final void m6830e(c cVar, int i4, int i5, int i6) throws IOException {
        if (i4 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i4);
        }
        if (i6 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i7 = this.f6224c.readInt();
        int i8 = this.f6224c.readInt();
        int i9 = i4 - 8;
        ErrorCode errorCodeM5636a = ErrorCode.INSTANCE.m5636a(i8);
        if (errorCodeM5636a == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i8);
        }
        ByteString byteString = ByteString.EMPTY;
        if (i9 > 0) {
            byteString = this.f6224c.readByteString(i9);
        }
        cVar.mo6819j(i7, errorCodeM5636a, byteString);
    }

    /* renamed from: f */
    public final List m6831f(int i4, int i5, int i6, int i7) throws IOException {
        this.f6222a.m6845d(i4);
        b bVar = this.f6222a;
        bVar.m6846e(bVar.m6842a());
        this.f6222a.m6847f(i5);
        this.f6222a.m6844c(i6);
        this.f6222a.m6848g(i7);
        this.f6223b.m6725k();
        return this.f6223b.m6719e();
    }

    /* renamed from: g */
    public final void m6832g(c cVar, int i4, int i5, int i6) throws IOException {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z3 = (i5 & 1) != 0;
        int iM6220b = (i5 & 8) != 0 ? AbstractC4550b.m6220b(this.f6224c.readByte(), 255) : 0;
        if ((i5 & 32) != 0) {
            m6834i(cVar, i6);
            i4 -= 5;
        }
        cVar.mo6811b(z3, i6, -1, m6831f(f6221f.m6841b(i4, i5, iM6220b), iM6220b, i5, i6));
    }

    /* renamed from: h */
    public final void m6833h(c cVar, int i4, int i5, int i6) throws IOException {
        if (i4 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i4);
        }
        if (i6 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.mo6814e((i5 & 1) != 0, this.f6224c.readInt(), this.f6224c.readInt());
    }

    /* renamed from: i */
    public final void m6834i(c cVar, int i4) throws IOException {
        int i5 = this.f6224c.readInt();
        cVar.mo6815f(i4, i5 & Integer.MAX_VALUE, AbstractC4550b.m6220b(this.f6224c.readByte(), 255) + 1, (((int) 2147483648L) & i5) != 0);
    }

    /* renamed from: j */
    public final void m6835j(c cVar, int i4, int i5, int i6) throws IOException {
        if (i4 == 5) {
            if (i6 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            m6834i(cVar, i6);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i4 + " != 5");
        }
    }

    /* renamed from: k */
    public final void m6836k(c cVar, int i4, int i5, int i6) throws IOException {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iM6220b = (i5 & 8) != 0 ? AbstractC4550b.m6220b(this.f6224c.readByte(), 255) : 0;
        cVar.mo6818i(i6, this.f6224c.readInt() & Integer.MAX_VALUE, m6831f(f6221f.m6841b(i4 - 4, i5, iM6220b), iM6220b, i5, i6));
    }

    /* renamed from: l */
    public final void m6837l(c cVar, int i4, int i5, int i6) throws IOException {
        if (i4 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i4 + " != 4");
        }
        if (i6 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i7 = this.f6224c.readInt();
        ErrorCode errorCodeM5636a = ErrorCode.INSTANCE.m5636a(i7);
        if (errorCodeM5636a != null) {
            cVar.mo6816g(i6, errorCodeM5636a);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i7);
    }

    /* renamed from: m */
    public final void m6838m(c cVar, int i4, int i5, int i6) throws IOException {
        int i7;
        if (i6 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i5 & 1) != 0) {
            if (i4 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.mo6810a();
            return;
        }
        if (i4 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i4);
        }
        C4718k c4718k = new C4718k();
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, i4), 6);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if (step < 0 ? first >= last : first <= last) {
            while (true) {
                int iM6221c = AbstractC4550b.m6221c(this.f6224c.readShort(), 65535);
                i7 = this.f6224c.readInt();
                if (iM6221c != 2) {
                    if (iM6221c == 3) {
                        iM6221c = 4;
                    } else if (iM6221c != 4) {
                        if (iM6221c == 5 && (i7 < 16384 || i7 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i7 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iM6221c = 7;
                    }
                } else if (i7 != 0 && i7 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                c4718k.m6922h(iM6221c, i7);
                if (first == last) {
                    break;
                } else {
                    first += step;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i7);
        }
        cVar.mo6817h(false, c4718k);
    }

    /* renamed from: n */
    public final void m6839n(c cVar, int i4, int i5, int i6) throws IOException {
        if (i4 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i4);
        }
        long jM6222d = AbstractC4550b.m6222d(this.f6224c.readInt(), 2147483647L);
        if (jM6222d == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.mo6812c(i6, jM6222d);
    }
}
