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
import okhttp3.internal.http2.C8740a;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import p028b9.AbstractC5070d;
import p125i9.C7717b;
import p125i9.C7722g;

/* renamed from: okhttp3.internal.http2.c */
/* loaded from: classes5.dex */
public final class C8742c implements Closeable {

    /* renamed from: e */
    public static final a f14829e = new a(null);

    /* renamed from: f */
    public static final Logger f14830f;

    /* renamed from: a */
    public final BufferedSource f14831a;

    /* renamed from: b */
    public final boolean f14832b;

    /* renamed from: c */
    public final b f14833c;

    /* renamed from: d */
    public final C8740a.a f14834d;

    /* renamed from: okhttp3.internal.http2.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Logger m14588a() {
            return C8742c.f14830f;
        }

        /* renamed from: b */
        public final int m14589b(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }

        public a() {
        }
    }

    /* renamed from: okhttp3.internal.http2.c$b */
    public static final class b implements Source {

        /* renamed from: a */
        public final BufferedSource f14835a;

        /* renamed from: b */
        public int f14836b;

        /* renamed from: c */
        public int f14837c;

        /* renamed from: d */
        public int f14838d;

        /* renamed from: e */
        public int f14839e;

        /* renamed from: f */
        public int f14840f;

        public b(BufferedSource source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f14835a = source;
        }

        /* renamed from: a */
        public final int m14590a() {
            return this.f14839e;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: f */
        public final void m14591f() throws IOException {
            int i10 = this.f14838d;
            int iM2619J = AbstractC5070d.m2619J(this.f14835a);
            this.f14839e = iM2619J;
            this.f14836b = iM2619J;
            int iM2639d = AbstractC5070d.m2639d(this.f14835a.readByte(), 255);
            this.f14837c = AbstractC5070d.m2639d(this.f14835a.readByte(), 255);
            a aVar = C8742c.f14829e;
            if (aVar.m14588a().isLoggable(Level.FINE)) {
                aVar.m14588a().fine(C7717b.f13099a.m12895c(true, this.f14838d, this.f14836b, iM2639d, this.f14837c));
            }
            int i11 = this.f14835a.readInt() & Integer.MAX_VALUE;
            this.f14838d = i11;
            if (iM2639d == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iM2639d + " != TYPE_CONTINUATION");
            }
        }

        /* renamed from: g */
        public final void m14592g(int i10) {
            this.f14837c = i10;
        }

        /* renamed from: h */
        public final void m14593h(int i10) {
            this.f14839e = i10;
        }

        /* renamed from: i */
        public final void m14594i(int i10) {
            this.f14836b = i10;
        }

        /* renamed from: j */
        public final void m14595j(int i10) {
            this.f14840f = i10;
        }

        /* renamed from: k */
        public final void m14596k(int i10) {
            this.f14838d = i10;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i10 = this.f14839e;
                if (i10 != 0) {
                    long j11 = this.f14835a.read(sink, Math.min(j10, i10));
                    if (j11 == -1) {
                        return -1L;
                    }
                    this.f14839e -= (int) j11;
                    return j11;
                }
                this.f14835a.skip(this.f14840f);
                this.f14840f = 0;
                if ((this.f14837c & 4) != 0) {
                    return -1L;
                }
                m14591f();
            }
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f14835a.getTimeout();
        }
    }

    /* renamed from: okhttp3.internal.http2.c$c */
    public interface c {
        /* renamed from: a */
        void mo14562a(boolean z9, int i10, int i11, List list);

        /* renamed from: b */
        void mo14563b(int i10, long j10);

        /* renamed from: c */
        void mo14564c(int i10, int i11, List list);

        /* renamed from: d */
        void mo14565d();

        /* renamed from: e */
        void mo14566e(boolean z9, C7722g c7722g);

        /* renamed from: f */
        void mo14567f(boolean z9, int i10, BufferedSource bufferedSource, int i11);

        /* renamed from: g */
        void mo14568g(boolean z9, int i10, int i11);

        /* renamed from: h */
        void mo14569h(int i10, int i11, int i12, boolean z9);

        /* renamed from: i */
        void mo14570i(int i10, ErrorCode errorCode);

        /* renamed from: j */
        void mo14571j(int i10, ErrorCode errorCode, ByteString byteString);
    }

    static {
        Logger logger = Logger.getLogger(C7717b.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f14830f = logger;
    }

    public C8742c(BufferedSource source, boolean z9) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f14831a = source;
        this.f14832b = z9;
        b bVar = new b(source);
        this.f14833c = bVar;
        this.f14834d = new C8740a.a(bVar, 4096, 0, 4, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14831a.close();
    }

    /* renamed from: f */
    public final boolean m14575f(boolean z9, c handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.f14831a.require(9L);
            int iM2619J = AbstractC5070d.m2619J(this.f14831a);
            if (iM2619J > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iM2619J);
            }
            int iM2639d = AbstractC5070d.m2639d(this.f14831a.readByte(), 255);
            int iM2639d2 = AbstractC5070d.m2639d(this.f14831a.readByte(), 255);
            int i10 = this.f14831a.readInt() & Integer.MAX_VALUE;
            Logger logger = f14830f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C7717b.f13099a.m12895c(true, i10, iM2619J, iM2639d, iM2639d2));
            }
            if (z9 && iM2639d != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + C7717b.f13099a.m12894b(iM2639d));
            }
            switch (iM2639d) {
                case 0:
                    m14577h(handler, iM2619J, iM2639d2, i10);
                    return true;
                case 1:
                    m14580k(handler, iM2619J, iM2639d2, i10);
                    return true;
                case 2:
                    m14583n(handler, iM2619J, iM2639d2, i10);
                    return true;
                case 3:
                    m14585p(handler, iM2619J, iM2639d2, i10);
                    return true;
                case 4:
                    m14586q(handler, iM2619J, iM2639d2, i10);
                    return true;
                case 5:
                    m14584o(handler, iM2619J, iM2639d2, i10);
                    return true;
                case 6:
                    m14581l(handler, iM2619J, iM2639d2, i10);
                    return true;
                case 7:
                    m14578i(handler, iM2619J, iM2639d2, i10);
                    return true;
                case 8:
                    m14587r(handler, iM2619J, iM2639d2, i10);
                    return true;
                default:
                    this.f14831a.skip(iM2619J);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: g */
    public final void m14576g(c handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f14832b) {
            if (!m14575f(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        BufferedSource bufferedSource = this.f14831a;
        ByteString byteString = C7717b.f13100b;
        ByteString byteString2 = bufferedSource.readByteString(byteString.size());
        Logger logger = f14830f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(AbstractC5070d.m2655t("<< CONNECTION " + byteString2.hex(), new Object[0]));
        }
        if (Intrinsics.areEqual(byteString, byteString2)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + byteString2.utf8());
    }

    /* renamed from: h */
    public final void m14577h(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z9 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iM2639d = (i11 & 8) != 0 ? AbstractC5070d.m2639d(this.f14831a.readByte(), 255) : 0;
        cVar.mo14567f(z9, i12, this.f14831a, f14829e.m14589b(i10, i11, iM2639d));
        this.f14831a.skip(iM2639d);
    }

    /* renamed from: i */
    public final void m14578i(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i13 = this.f14831a.readInt();
        int i14 = this.f14831a.readInt();
        int i15 = i10 - 8;
        ErrorCode errorCodeM14461a = ErrorCode.INSTANCE.m14461a(i14);
        if (errorCodeM14461a == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i14);
        }
        ByteString byteString = ByteString.EMPTY;
        if (i15 > 0) {
            byteString = this.f14831a.readByteString(i15);
        }
        cVar.mo14571j(i13, errorCodeM14461a, byteString);
    }

    /* renamed from: j */
    public final List m14579j(int i10, int i11, int i12, int i13) throws IOException {
        this.f14833c.m14593h(i10);
        b bVar = this.f14833c;
        bVar.m14594i(bVar.m14590a());
        this.f14833c.m14595j(i11);
        this.f14833c.m14592g(i12);
        this.f14833c.m14596k(i13);
        this.f14834d.m14476k();
        return this.f14834d.m14470e();
    }

    /* renamed from: k */
    public final void m14580k(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z9 = (i11 & 1) != 0;
        int iM2639d = (i11 & 8) != 0 ? AbstractC5070d.m2639d(this.f14831a.readByte(), 255) : 0;
        if ((i11 & 32) != 0) {
            m14582m(cVar, i12);
            i10 -= 5;
        }
        cVar.mo14562a(z9, i12, -1, m14579j(f14829e.m14589b(i10, i11, iM2639d), iM2639d, i11, i12));
    }

    /* renamed from: l */
    public final void m14581l(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.mo14568g((i11 & 1) != 0, this.f14831a.readInt(), this.f14831a.readInt());
    }

    /* renamed from: m */
    public final void m14582m(c cVar, int i10) throws IOException {
        int i11 = this.f14831a.readInt();
        cVar.mo14569h(i10, i11 & Integer.MAX_VALUE, AbstractC5070d.m2639d(this.f14831a.readByte(), 255) + 1, (Integer.MIN_VALUE & i11) != 0);
    }

    /* renamed from: n */
    public final void m14583n(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            m14582m(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    /* renamed from: o */
    public final void m14584o(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iM2639d = (i11 & 8) != 0 ? AbstractC5070d.m2639d(this.f14831a.readByte(), 255) : 0;
        cVar.mo14564c(i12, this.f14831a.readInt() & Integer.MAX_VALUE, m14579j(f14829e.m14589b(i10 - 4, i11, iM2639d), iM2639d, i11, i12));
    }

    /* renamed from: p */
    public final void m14585p(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i13 = this.f14831a.readInt();
        ErrorCode errorCodeM14461a = ErrorCode.INSTANCE.m14461a(i13);
        if (errorCodeM14461a != null) {
            cVar.mo14570i(i12, errorCodeM14461a);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i13);
    }

    /* renamed from: q */
    public final void m14586q(c cVar, int i10, int i11, int i12) throws IOException {
        int i13;
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i11 & 1) != 0) {
            if (i10 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.mo14565d();
            return;
        }
        if (i10 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i10);
        }
        C7722g c7722g = new C7722g();
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, i10), 6);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                int iM2640e = AbstractC5070d.m2640e(this.f14831a.readShort(), 65535);
                i13 = this.f14831a.readInt();
                if (iM2640e != 2) {
                    if (iM2640e == 3) {
                        iM2640e = 4;
                    } else if (iM2640e != 4) {
                        if (iM2640e == 5 && (i13 < 16384 || i13 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i13 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iM2640e = 7;
                    }
                } else if (i13 != 0 && i13 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                c7722g.m12959h(iM2640e, i13);
                if (first == last) {
                    break;
                } else {
                    first += step;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i13);
        }
        cVar.mo14566e(false, c7722g);
    }

    /* renamed from: r */
    public final void m14587r(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
        }
        long jM2641f = AbstractC5070d.m2641f(this.f14831a.readInt(), SieveCacheKt.NodeLinkMask);
        if (jM2641f == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.mo14563b(i12, jM2641f);
    }
}
