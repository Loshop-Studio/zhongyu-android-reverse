package okhttp3.internal.http2;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import okhttp3.internal.http2.C9243a;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import p182m8.AbstractC9045d;
import p256t8.C9637b;
import p256t8.C9642g;

/* renamed from: okhttp3.internal.http2.c */
/* loaded from: classes5.dex */
public final class C9245c implements Closeable {

    /* renamed from: e */
    public static final a f15956e = new a(null);

    /* renamed from: f */
    public static final Logger f15957f;

    /* renamed from: a */
    public final BufferedSource f15958a;

    /* renamed from: b */
    public final boolean f15959b;

    /* renamed from: c */
    public final b f15960c;

    /* renamed from: d */
    public final C9243a.a f15961d;

    /* renamed from: okhttp3.internal.http2.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Logger m15023a() {
            return C9245c.f15957f;
        }

        /* renamed from: b */
        public final int m15024b(int i9, int i10, int i11) throws IOException {
            if ((i10 & 8) != 0) {
                i9--;
            }
            if (i11 <= i9) {
                return i9 - i11;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i11 + " > remaining length " + i9);
        }

        public a() {
        }
    }

    /* renamed from: okhttp3.internal.http2.c$b */
    public static final class b implements Source {

        /* renamed from: a */
        public final BufferedSource f15962a;

        /* renamed from: b */
        public int f15963b;

        /* renamed from: c */
        public int f15964c;

        /* renamed from: d */
        public int f15965d;

        /* renamed from: e */
        public int f15966e;

        /* renamed from: f */
        public int f15967f;

        public b(BufferedSource source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f15962a = source;
        }

        /* renamed from: a */
        public final int m15025a() {
            return this.f15966e;
        }

        /* renamed from: c */
        public final void m15026c() throws IOException {
            int i9 = this.f15965d;
            int iM14468J = AbstractC9045d.m14468J(this.f15962a);
            this.f15966e = iM14468J;
            this.f15963b = iM14468J;
            int iM14488d = AbstractC9045d.m14488d(this.f15962a.readByte(), 255);
            this.f15964c = AbstractC9045d.m14488d(this.f15962a.readByte(), 255);
            a aVar = C9245c.f15956e;
            if (aVar.m15023a().isLoggable(Level.FINE)) {
                aVar.m15023a().fine(C9637b.f16929a.m15914c(true, this.f15965d, this.f15963b, iM14488d, this.f15964c));
            }
            int i10 = this.f15962a.readInt() & Integer.MAX_VALUE;
            this.f15965d = i10;
            if (iM14488d == 9) {
                if (i10 != i9) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iM14488d + " != TYPE_CONTINUATION");
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: g */
        public final void m15027g(int i9) {
            this.f15964c = i9;
        }

        /* renamed from: h */
        public final void m15028h(int i9) {
            this.f15966e = i9;
        }

        /* renamed from: i */
        public final void m15029i(int i9) {
            this.f15963b = i9;
        }

        /* renamed from: j */
        public final void m15030j(int i9) {
            this.f15967f = i9;
        }

        /* renamed from: k */
        public final void m15031k(int i9) {
            this.f15965d = i9;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j9) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i9 = this.f15966e;
                if (i9 != 0) {
                    long j10 = this.f15962a.read(sink, Math.min(j9, i9));
                    if (j10 == -1) {
                        return -1L;
                    }
                    this.f15966e -= (int) j10;
                    return j10;
                }
                this.f15962a.skip(this.f15967f);
                this.f15967f = 0;
                if ((this.f15964c & 4) != 0) {
                    return -1L;
                }
                m15026c();
            }
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f15962a.getTimeout();
        }
    }

    /* renamed from: okhttp3.internal.http2.c$c */
    public interface c {
        /* renamed from: a */
        void mo14996a(boolean z9, int i9, int i10, List list);

        /* renamed from: b */
        void mo14997b(int i9, long j9);

        /* renamed from: c */
        void mo14998c(boolean z9, C9642g c9642g);

        /* renamed from: d */
        void mo14999d(int i9, int i10, List list);

        /* renamed from: e */
        void mo15000e();

        /* renamed from: f */
        void mo15001f(boolean z9, int i9, BufferedSource bufferedSource, int i10);

        /* renamed from: g */
        void mo15002g(boolean z9, int i9, int i10);

        /* renamed from: h */
        void mo15003h(int i9, int i10, int i11, boolean z9);

        /* renamed from: i */
        void mo15004i(int i9, ErrorCode errorCode);

        /* renamed from: j */
        void mo15005j(int i9, ErrorCode errorCode, ByteString byteString);
    }

    static {
        Logger logger = Logger.getLogger(C9637b.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f15957f = logger;
    }

    public C9245c(BufferedSource source, boolean z9) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f15958a = source;
        this.f15959b = z9;
        b bVar = new b(source);
        this.f15960c = bVar;
        this.f15961d = new C9243a.a(bVar, 4096, 0, 4, null);
    }

    /* renamed from: c */
    public final boolean m15010c(boolean z9, c handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.f15958a.require(9L);
            int iM14468J = AbstractC9045d.m14468J(this.f15958a);
            if (iM14468J > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iM14468J);
            }
            int iM14488d = AbstractC9045d.m14488d(this.f15958a.readByte(), 255);
            int iM14488d2 = AbstractC9045d.m14488d(this.f15958a.readByte(), 255);
            int i9 = this.f15958a.readInt() & Integer.MAX_VALUE;
            Logger logger = f15957f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C9637b.f16929a.m15914c(true, i9, iM14468J, iM14488d, iM14488d2));
            }
            if (z9 && iM14488d != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + C9637b.f16929a.m15913b(iM14488d));
            }
            switch (iM14488d) {
                case 0:
                    m15012h(handler, iM14468J, iM14488d2, i9);
                    return true;
                case 1:
                    m15015k(handler, iM14468J, iM14488d2, i9);
                    return true;
                case 2:
                    m15018n(handler, iM14468J, iM14488d2, i9);
                    return true;
                case 3:
                    m15020p(handler, iM14468J, iM14488d2, i9);
                    return true;
                case 4:
                    m15021q(handler, iM14468J, iM14488d2, i9);
                    return true;
                case 5:
                    m15019o(handler, iM14468J, iM14488d2, i9);
                    return true;
                case 6:
                    m15016l(handler, iM14468J, iM14488d2, i9);
                    return true;
                case 7:
                    m15013i(handler, iM14468J, iM14488d2, i9);
                    return true;
                case 8:
                    m15022r(handler, iM14468J, iM14488d2, i9);
                    return true;
                default:
                    this.f15958a.skip(iM14468J);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15958a.close();
    }

    /* renamed from: g */
    public final void m15011g(c handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f15959b) {
            if (!m15010c(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        BufferedSource bufferedSource = this.f15958a;
        ByteString byteString = C9637b.f16930b;
        ByteString byteString2 = bufferedSource.readByteString(byteString.size());
        Logger logger = f15957f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(AbstractC9045d.m14504t("<< CONNECTION " + byteString2.hex(), new Object[0]));
        }
        if (Intrinsics.areEqual(byteString, byteString2)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + byteString2.utf8());
    }

    /* renamed from: h */
    public final void m15012h(c cVar, int i9, int i10, int i11) throws IOException {
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z9 = (i10 & 1) != 0;
        if ((i10 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iM14488d = (i10 & 8) != 0 ? AbstractC9045d.m14488d(this.f15958a.readByte(), 255) : 0;
        cVar.mo15001f(z9, i11, this.f15958a, f15956e.m15024b(i9, i10, iM14488d));
        this.f15958a.skip(iM14488d);
    }

    /* renamed from: i */
    public final void m15013i(c cVar, int i9, int i10, int i11) throws IOException {
        if (i9 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i9);
        }
        if (i11 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i12 = this.f15958a.readInt();
        int i13 = this.f15958a.readInt();
        int i14 = i9 - 8;
        ErrorCode errorCodeM14895a = ErrorCode.INSTANCE.m14895a(i13);
        if (errorCodeM14895a == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i13);
        }
        ByteString byteString = ByteString.EMPTY;
        if (i14 > 0) {
            byteString = this.f15958a.readByteString(i14);
        }
        cVar.mo15005j(i12, errorCodeM14895a, byteString);
    }

    /* renamed from: j */
    public final List m15014j(int i9, int i10, int i11, int i12) throws IOException {
        this.f15960c.m15028h(i9);
        b bVar = this.f15960c;
        bVar.m15029i(bVar.m15025a());
        this.f15960c.m15030j(i10);
        this.f15960c.m15027g(i11);
        this.f15960c.m15031k(i12);
        this.f15961d.m14910k();
        return this.f15961d.m14904e();
    }

    /* renamed from: k */
    public final void m15015k(c cVar, int i9, int i10, int i11) throws IOException {
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z9 = (i10 & 1) != 0;
        int iM14488d = (i10 & 8) != 0 ? AbstractC9045d.m14488d(this.f15958a.readByte(), 255) : 0;
        if ((i10 & 32) != 0) {
            m15017m(cVar, i11);
            i9 -= 5;
        }
        cVar.mo14996a(z9, i11, -1, m15014j(f15956e.m15024b(i9, i10, iM14488d), iM14488d, i10, i11));
    }

    /* renamed from: l */
    public final void m15016l(c cVar, int i9, int i10, int i11) throws IOException {
        if (i9 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i9);
        }
        if (i11 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.mo15002g((i10 & 1) != 0, this.f15958a.readInt(), this.f15958a.readInt());
    }

    /* renamed from: m */
    public final void m15017m(c cVar, int i9) throws IOException {
        int i10 = this.f15958a.readInt();
        cVar.mo15003h(i9, i10 & Integer.MAX_VALUE, AbstractC9045d.m14488d(this.f15958a.readByte(), 255) + 1, (Integer.MIN_VALUE & i10) != 0);
    }

    /* renamed from: n */
    public final void m15018n(c cVar, int i9, int i10, int i11) throws IOException {
        if (i9 == 5) {
            if (i11 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            m15017m(cVar, i11);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i9 + " != 5");
        }
    }

    /* renamed from: o */
    public final void m15019o(c cVar, int i9, int i10, int i11) throws IOException {
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iM14488d = (i10 & 8) != 0 ? AbstractC9045d.m14488d(this.f15958a.readByte(), 255) : 0;
        cVar.mo14999d(i11, this.f15958a.readInt() & Integer.MAX_VALUE, m15014j(f15956e.m15024b(i9 - 4, i10, iM14488d), iM14488d, i10, i11));
    }

    /* renamed from: p */
    public final void m15020p(c cVar, int i9, int i10, int i11) throws IOException {
        if (i9 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i9 + " != 4");
        }
        if (i11 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i12 = this.f15958a.readInt();
        ErrorCode errorCodeM14895a = ErrorCode.INSTANCE.m14895a(i12);
        if (errorCodeM14895a != null) {
            cVar.mo15004i(i11, errorCodeM14895a);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i12);
    }

    /* renamed from: q */
    public final void m15021q(c cVar, int i9, int i10, int i11) throws IOException {
        int i12;
        if (i11 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i10 & 1) != 0) {
            if (i9 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.mo15000e();
            return;
        }
        if (i9 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i9);
        }
        C9642g c9642g = new C9642g();
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, i9), 6);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                int iM14489e = AbstractC9045d.m14489e(this.f15958a.readShort(), 65535);
                i12 = this.f15958a.readInt();
                if (iM14489e != 2) {
                    if (iM14489e == 3) {
                        iM14489e = 4;
                    } else if (iM14489e != 4) {
                        if (iM14489e == 5 && (i12 < 16384 || i12 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i12 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iM14489e = 7;
                    }
                } else if (i12 != 0 && i12 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                c9642g.m15978h(iM14489e, i12);
                if (first == last) {
                    break;
                } else {
                    first += step;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i12);
        }
        cVar.mo14998c(false, c9642g);
    }

    /* renamed from: r */
    public final void m15022r(c cVar, int i9, int i10, int i11) throws IOException {
        if (i9 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i9);
        }
        long jM14490f = AbstractC9045d.m14490f(this.f15958a.readInt(), SieveCacheKt.NodeLinkMask);
        if (jM14490f == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.mo14997b(i11, jM14490f);
    }
}
