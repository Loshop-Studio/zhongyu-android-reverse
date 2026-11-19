package okhttp3.internal.http2;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okhttp3.internal.http2.C10500a;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import p265nd.AbstractC10410o;
import p265nd.C10403h;
import re.C10995b;
import re.C11000g;

/* renamed from: okhttp3.internal.http2.c */
/* loaded from: classes6.dex */
public final class C10502c implements Closeable {

    /* renamed from: g */
    public static final a f25253g = new a(null);

    /* renamed from: h */
    public static final Logger f25254h;

    /* renamed from: c */
    public final BufferedSource f25255c;

    /* renamed from: d */
    public final boolean f25256d;

    /* renamed from: e */
    public final b f25257e;

    /* renamed from: f */
    public final C10500a.a f25258f;

    /* renamed from: okhttp3.internal.http2.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final Logger m22148a() {
            return C10502c.f25254h;
        }

        /* renamed from: b */
        public final int m22149b(int i10, int i11, int i12) throws IOException {
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

        /* renamed from: c */
        public final BufferedSource f25259c;

        /* renamed from: d */
        public int f25260d;

        /* renamed from: e */
        public int f25261e;

        /* renamed from: f */
        public int f25262f;

        /* renamed from: g */
        public int f25263g;

        /* renamed from: h */
        public int f25264h;

        public b(BufferedSource source) {
            AbstractC9979u.m20294g(source, "source");
            this.f25259c = source;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: e */
        public final int m22150e() {
            return this.f25263g;
        }

        /* renamed from: f */
        public final void m22151f() throws IOException {
            int i10 = this.f25262f;
            int iM20002J = AbstractC9920d.m20002J(this.f25259c);
            this.f25263g = iM20002J;
            this.f25260d = iM20002J;
            int iM20022d = AbstractC9920d.m20022d(this.f25259c.readByte(), 255);
            this.f25261e = AbstractC9920d.m20022d(this.f25259c.readByte(), 255);
            a aVar = C10502c.f25253g;
            if (aVar.m22148a().isLoggable(Level.FINE)) {
                aVar.m22148a().fine(C10995b.f26511a.m24249c(true, this.f25262f, this.f25260d, iM20022d, this.f25261e));
            }
            int i11 = this.f25259c.readInt() & Integer.MAX_VALUE;
            this.f25262f = i11;
            if (iM20022d == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iM20022d + " != TYPE_CONTINUATION");
            }
        }

        /* renamed from: g */
        public final void m22152g(int i10) {
            this.f25261e = i10;
        }

        /* renamed from: i */
        public final void m22153i(int i10) {
            this.f25263g = i10;
        }

        /* renamed from: j */
        public final void m22154j(int i10) {
            this.f25260d = i10;
        }

        /* renamed from: k */
        public final void m22155k(int i10) {
            this.f25264h = i10;
        }

        /* renamed from: l */
        public final void m22156l(int i10) {
            this.f25262f = i10;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            AbstractC9979u.m20294g(sink, "sink");
            while (true) {
                int i10 = this.f25263g;
                if (i10 != 0) {
                    long j11 = this.f25259c.read(sink, Math.min(j10, i10));
                    if (j11 == -1) {
                        return -1L;
                    }
                    this.f25263g -= (int) j11;
                    return j11;
                }
                this.f25259c.skip(this.f25264h);
                this.f25264h = 0;
                if ((this.f25261e & 4) != 0) {
                    return -1L;
                }
                m22151f();
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.f25259c.timeout();
        }
    }

    /* renamed from: okhttp3.internal.http2.c$c */
    public interface c {
        /* renamed from: a */
        void mo22122a(boolean z10, int i10, int i11, List list);

        /* renamed from: b */
        void mo22123b(int i10, long j10);

        /* renamed from: c */
        void mo22124c(int i10, int i11, List list);

        /* renamed from: d */
        void mo22125d();

        /* renamed from: e */
        void mo22126e(boolean z10, C11000g c11000g);

        /* renamed from: f */
        void mo22127f(boolean z10, int i10, BufferedSource bufferedSource, int i11);

        /* renamed from: g */
        void mo22128g(boolean z10, int i10, int i11);

        /* renamed from: h */
        void mo22129h(int i10, int i11, int i12, boolean z10);

        /* renamed from: i */
        void mo22130i(int i10, ErrorCode errorCode);

        /* renamed from: j */
        void mo22131j(int i10, ErrorCode errorCode, ByteString byteString);
    }

    static {
        Logger logger = Logger.getLogger(C10995b.class.getName());
        AbstractC9979u.m20293f(logger, "getLogger(Http2::class.java.name)");
        f25254h = logger;
    }

    public C10502c(BufferedSource source, boolean z10) {
        AbstractC9979u.m20294g(source, "source");
        this.f25255c = source;
        this.f25256d = z10;
        b bVar = new b(source);
        this.f25257e = bVar;
        this.f25258f = new C10500a.a(bVar, 4096, 0, 4, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f25255c.close();
    }

    /* renamed from: f */
    public final boolean m22135f(boolean z10, c handler) throws IOException {
        AbstractC9979u.m20294g(handler, "handler");
        try {
            this.f25255c.require(9L);
            int iM20002J = AbstractC9920d.m20002J(this.f25255c);
            if (iM20002J > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iM20002J);
            }
            int iM20022d = AbstractC9920d.m20022d(this.f25255c.readByte(), 255);
            int iM20022d2 = AbstractC9920d.m20022d(this.f25255c.readByte(), 255);
            int i10 = this.f25255c.readInt() & Integer.MAX_VALUE;
            Logger logger = f25254h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C10995b.f26511a.m24249c(true, i10, iM20002J, iM20022d, iM20022d2));
            }
            if (z10 && iM20022d != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + C10995b.f26511a.m24248b(iM20022d));
            }
            switch (iM20022d) {
                case 0:
                    m22137i(handler, iM20002J, iM20022d2, i10);
                    return true;
                case 1:
                    m22140l(handler, iM20002J, iM20022d2, i10);
                    return true;
                case 2:
                    m22143p(handler, iM20002J, iM20022d2, i10);
                    return true;
                case 3:
                    m22145s(handler, iM20002J, iM20022d2, i10);
                    return true;
                case 4:
                    m22146t(handler, iM20002J, iM20022d2, i10);
                    return true;
                case 5:
                    m22144r(handler, iM20002J, iM20022d2, i10);
                    return true;
                case 6:
                    m22141m(handler, iM20002J, iM20022d2, i10);
                    return true;
                case 7:
                    m22138j(handler, iM20002J, iM20022d2, i10);
                    return true;
                case 8:
                    m22147u(handler, iM20002J, iM20022d2, i10);
                    return true;
                default:
                    this.f25255c.skip(iM20002J);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: g */
    public final void m22136g(c handler) throws IOException {
        AbstractC9979u.m20294g(handler, "handler");
        if (this.f25256d) {
            if (!m22135f(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        BufferedSource bufferedSource = this.f25255c;
        ByteString byteString = C10995b.f26512b;
        ByteString byteString2 = bufferedSource.readByteString(byteString.size());
        Logger logger = f25254h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(AbstractC9920d.m20038t("<< CONNECTION " + byteString2.hex(), new Object[0]));
        }
        if (AbstractC9979u.m20289b(byteString, byteString2)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + byteString2.utf8());
    }

    /* renamed from: i */
    public final void m22137i(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iM20022d = (i11 & 8) != 0 ? AbstractC9920d.m20022d(this.f25255c.readByte(), 255) : 0;
        cVar.mo22127f(z10, i12, this.f25255c, f25253g.m22149b(i10, i11, iM20022d));
        this.f25255c.skip(iM20022d);
    }

    /* renamed from: j */
    public final void m22138j(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i13 = this.f25255c.readInt();
        int i14 = this.f25255c.readInt();
        int i15 = i10 - 8;
        ErrorCode errorCodeM22021a = ErrorCode.f25137d.m22021a(i14);
        if (errorCodeM22021a == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i14);
        }
        ByteString byteString = ByteString.EMPTY;
        if (i15 > 0) {
            byteString = this.f25255c.readByteString(i15);
        }
        cVar.mo22131j(i13, errorCodeM22021a, byteString);
    }

    /* renamed from: k */
    public final List m22139k(int i10, int i11, int i12, int i13) throws IOException {
        this.f25257e.m22153i(i10);
        b bVar = this.f25257e;
        bVar.m22154j(bVar.m22150e());
        this.f25257e.m22155k(i11);
        this.f25257e.m22152g(i12);
        this.f25257e.m22156l(i13);
        this.f25258f.m22036k();
        return this.f25258f.m22030e();
    }

    /* renamed from: l */
    public final void m22140l(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        int iM20022d = (i11 & 8) != 0 ? AbstractC9920d.m20022d(this.f25255c.readByte(), 255) : 0;
        if ((i11 & 32) != 0) {
            m22142n(cVar, i12);
            i10 -= 5;
        }
        cVar.mo22122a(z10, i12, -1, m22139k(f25253g.m22149b(i10, i11, iM20022d), iM20022d, i11, i12));
    }

    /* renamed from: m */
    public final void m22141m(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.mo22128g((i11 & 1) != 0, this.f25255c.readInt(), this.f25255c.readInt());
    }

    /* renamed from: n */
    public final void m22142n(c cVar, int i10) {
        int i11 = this.f25255c.readInt();
        cVar.mo22129h(i10, i11 & Integer.MAX_VALUE, AbstractC9920d.m20022d(this.f25255c.readByte(), 255) + 1, (Integer.MIN_VALUE & i11) != 0);
    }

    /* renamed from: p */
    public final void m22143p(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            m22142n(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    /* renamed from: r */
    public final void m22144r(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iM20022d = (i11 & 8) != 0 ? AbstractC9920d.m20022d(this.f25255c.readByte(), 255) : 0;
        cVar.mo22124c(i12, this.f25255c.readInt() & Integer.MAX_VALUE, m22139k(f25253g.m22149b(i10 - 4, i11, iM20022d), iM20022d, i11, i12));
    }

    /* renamed from: s */
    public final void m22145s(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i13 = this.f25255c.readInt();
        ErrorCode errorCodeM22021a = ErrorCode.f25137d.m22021a(i13);
        if (errorCodeM22021a != null) {
            cVar.mo22130i(i12, errorCodeM22021a);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i13);
    }

    /* renamed from: t */
    public final void m22146t(c cVar, int i10, int i11, int i12) throws IOException {
        int i13;
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i11 & 1) != 0) {
            if (i10 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.mo22125d();
            return;
        }
        if (i10 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i10);
        }
        C11000g c11000g = new C11000g();
        C10403h c10403hM21767t = AbstractC10410o.m21767t(AbstractC10410o.m21768u(0, i10), 6);
        int iM21733b = c10403hM21767t.m21733b();
        int iM21734c = c10403hM21767t.m21734c();
        int iM21735d = c10403hM21767t.m21735d();
        if ((iM21735d > 0 && iM21733b <= iM21734c) || (iM21735d < 0 && iM21734c <= iM21733b)) {
            while (true) {
                int iM20023e = AbstractC9920d.m20023e(this.f25255c.readShort(), 65535);
                i13 = this.f25255c.readInt();
                if (iM20023e != 2) {
                    if (iM20023e == 3) {
                        iM20023e = 4;
                    } else if (iM20023e != 4) {
                        if (iM20023e == 5 && (i13 < 16384 || i13 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i13 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iM20023e = 7;
                    }
                } else if (i13 != 0 && i13 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                c11000g.m24313h(iM20023e, i13);
                if (iM21733b == iM21734c) {
                    break;
                } else {
                    iM21733b += iM21735d;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i13);
        }
        cVar.mo22126e(false, c11000g);
    }

    /* renamed from: u */
    public final void m22147u(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
        }
        long jM20024f = AbstractC9920d.m20024f(this.f25255c.readInt(), SieveCacheKt.NodeLinkMask);
        if (jM20024f == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.mo22123b(i12, jM20024f);
    }
}
