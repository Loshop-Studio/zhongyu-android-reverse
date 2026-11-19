package okhttp3.internal.http2;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.internal.http2.C9564b;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import p147j9.AbstractC9038h;
import p147j9.AbstractC9041k;
import p225q9.C9857b;
import p225q9.C9874s;

/* renamed from: okhttp3.internal.http2.d */
/* loaded from: classes5.dex */
public final class C9566d implements Closeable {

    /* renamed from: e */
    public static final a f19185e = new a(null);

    /* renamed from: f */
    public static final Logger f19186f;

    /* renamed from: a */
    public final BufferedSource f19187a;

    /* renamed from: b */
    public final boolean f19188b;

    /* renamed from: c */
    public final b f19189c;

    /* renamed from: d */
    public final C9564b.a f19190d;

    /* renamed from: okhttp3.internal.http2.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final Logger m18061a() {
            return C9566d.f19186f;
        }

        /* renamed from: b */
        public final int m18062b(int i10, int i11, int i12) throws IOException {
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

    /* renamed from: okhttp3.internal.http2.d$b */
    public static final class b implements Source {

        /* renamed from: a */
        public final BufferedSource f19191a;

        /* renamed from: b */
        public int f19192b;

        /* renamed from: c */
        public int f19193c;

        /* renamed from: d */
        public int f19194d;

        /* renamed from: e */
        public int f19195e;

        /* renamed from: f */
        public int f19196f;

        public b(BufferedSource source) {
            AbstractC9133u.m16133g(source, "source");
            this.f19191a = source;
        }

        /* renamed from: a */
        public final int m18063a() {
            return this.f19195e;
        }

        /* renamed from: b */
        public final void m18064b() throws IOException {
            int i10 = this.f19194d;
            int iM15768x = AbstractC9038h.m15768x(this.f19191a);
            this.f19195e = iM15768x;
            this.f19192b = iM15768x;
            int iM15746b = AbstractC9038h.m15746b(this.f19191a.readByte(), 255);
            this.f19193c = AbstractC9038h.m15746b(this.f19191a.readByte(), 255);
            a aVar = C9566d.f19185e;
            if (aVar.m18061a().isLoggable(Level.FINE)) {
                aVar.m18061a().fine(C9857b.f19671a.m18378c(true, this.f19194d, this.f19192b, iM15746b, this.f19193c));
            }
            int i11 = this.f19191a.readInt() & Integer.MAX_VALUE;
            this.f19194d = i11;
            if (iM15746b == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iM15746b + " != TYPE_CONTINUATION");
            }
        }

        /* renamed from: c */
        public final void m18065c(int i10) {
            this.f19193c = i10;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: d */
        public final void m18066d(int i10) {
            this.f19195e = i10;
        }

        /* renamed from: e */
        public final void m18067e(int i10) {
            this.f19192b = i10;
        }

        /* renamed from: f */
        public final void m18068f(int i10) {
            this.f19196f = i10;
        }

        /* renamed from: g */
        public final void m18069g(int i10) {
            this.f19194d = i10;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            AbstractC9133u.m16133g(sink, "sink");
            while (true) {
                int i10 = this.f19195e;
                if (i10 != 0) {
                    long j11 = this.f19191a.read(sink, Math.min(j10, i10));
                    if (j11 == -1) {
                        return -1L;
                    }
                    this.f19195e -= (int) j11;
                    return j11;
                }
                this.f19191a.skip(this.f19196f);
                this.f19196f = 0;
                if ((this.f19193c & 4) != 0) {
                    return -1L;
                }
                m18064b();
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.f19191a.timeout();
        }
    }

    /* renamed from: okhttp3.internal.http2.d$c */
    public interface c {
        /* renamed from: a */
        void mo18035a(boolean z10, int i10, int i11, List list);

        /* renamed from: b */
        void mo18036b(int i10, long j10);

        /* renamed from: c */
        void mo18037c(int i10, int i11, List list);

        /* renamed from: d */
        void mo18038d();

        /* renamed from: e */
        void mo18039e(boolean z10, C9874s c9874s);

        /* renamed from: f */
        void mo18040f(boolean z10, int i10, BufferedSource bufferedSource, int i11);

        /* renamed from: g */
        void mo18041g(boolean z10, int i10, int i11);

        /* renamed from: h */
        void mo18042h(int i10, int i11, int i12, boolean z10);

        /* renamed from: i */
        void mo18043i(int i10, ErrorCode errorCode);

        /* renamed from: k */
        void mo18044k(int i10, ErrorCode errorCode, ByteString byteString);
    }

    static {
        Logger logger = Logger.getLogger(C9857b.class.getName());
        AbstractC9133u.m16132f(logger, "getLogger(...)");
        f19186f = logger;
    }

    public C9566d(BufferedSource source, boolean z10) {
        AbstractC9133u.m16133g(source, "source");
        this.f19187a = source;
        this.f19188b = z10;
        b bVar = new b(source);
        this.f19189c = bVar;
        this.f19190d = new C9564b.a(bVar, 4096, 0, 4, null);
    }

    /* renamed from: b */
    public final boolean m18048b(boolean z10, c handler) throws Exception {
        AbstractC9133u.m16133g(handler, "handler");
        try {
            this.f19187a.require(9L);
            int iM15768x = AbstractC9038h.m15768x(this.f19187a);
            if (iM15768x > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iM15768x);
            }
            int iM15746b = AbstractC9038h.m15746b(this.f19187a.readByte(), 255);
            int iM15746b2 = AbstractC9038h.m15746b(this.f19187a.readByte(), 255);
            int i10 = this.f19187a.readInt() & Integer.MAX_VALUE;
            if (iM15746b != 8) {
                Logger logger = f19186f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C9857b.f19671a.m18378c(true, i10, iM15768x, iM15746b, iM15746b2));
                }
            }
            if (z10 && iM15746b != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + C9857b.f19671a.m18377b(iM15746b));
            }
            switch (iM15746b) {
                case 0:
                    m18050d(handler, iM15768x, iM15746b2, i10);
                    return true;
                case 1:
                    m18053g(handler, iM15768x, iM15746b2, i10);
                    return true;
                case 2:
                    m18056j(handler, iM15768x, iM15746b2, i10);
                    return true;
                case 3:
                    m18058l(handler, iM15768x, iM15746b2, i10);
                    return true;
                case 4:
                    m18059m(handler, iM15768x, iM15746b2, i10);
                    return true;
                case 5:
                    m18057k(handler, iM15768x, iM15746b2, i10);
                    return true;
                case 6:
                    m18054h(handler, iM15768x, iM15746b2, i10);
                    return true;
                case 7:
                    m18051e(handler, iM15768x, iM15746b2, i10);
                    return true;
                case 8:
                    m18060n(handler, iM15768x, iM15746b2, i10);
                    return true;
                default:
                    this.f19187a.skip(iM15768x);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final void m18049c(c handler) throws IOException {
        AbstractC9133u.m16133g(handler, "handler");
        if (this.f19188b) {
            if (!m18048b(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        BufferedSource bufferedSource = this.f19187a;
        ByteString byteString = C9857b.f19672b;
        ByteString byteString2 = bufferedSource.readByteString(byteString.size());
        Logger logger = f19186f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(AbstractC9041k.m15780j("<< CONNECTION " + byteString2.hex(), new Object[0]));
        }
        if (AbstractC9133u.m16128b(byteString, byteString2)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + byteString2.utf8());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19187a.close();
    }

    /* renamed from: d */
    public final void m18050d(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iM15746b = (i11 & 8) != 0 ? AbstractC9038h.m15746b(this.f19187a.readByte(), 255) : 0;
        cVar.mo18040f(z10, i12, this.f19187a, f19185e.m18062b(i10, i11, iM15746b));
        this.f19187a.skip(iM15746b);
    }

    /* renamed from: e */
    public final void m18051e(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i13 = this.f19187a.readInt();
        int i14 = this.f19187a.readInt();
        int i15 = i10 - 8;
        ErrorCode errorCodeM17909a = ErrorCode.f19100b.m17909a(i14);
        if (errorCodeM17909a == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i14);
        }
        ByteString byteString = ByteString.EMPTY;
        if (i15 > 0) {
            byteString = this.f19187a.readByteString(i15);
        }
        cVar.mo18044k(i13, errorCodeM17909a, byteString);
    }

    /* renamed from: f */
    public final List m18052f(int i10, int i11, int i12, int i13) throws IOException {
        this.f19189c.m18066d(i10);
        b bVar = this.f19189c;
        bVar.m18067e(bVar.m18063a());
        this.f19189c.m18068f(i11);
        this.f19189c.m18065c(i12);
        this.f19189c.m18069g(i13);
        this.f19190d.m17926k();
        return this.f19190d.m17920e();
    }

    /* renamed from: g */
    public final void m18053g(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        int iM15746b = (i11 & 8) != 0 ? AbstractC9038h.m15746b(this.f19187a.readByte(), 255) : 0;
        if ((i11 & 32) != 0) {
            m18055i(cVar, i12);
            i10 -= 5;
        }
        cVar.mo18035a(z10, i12, -1, m18052f(f19185e.m18062b(i10, i11, iM15746b), iM15746b, i11, i12));
    }

    /* renamed from: h */
    public final void m18054h(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.mo18041g((i11 & 1) != 0, this.f19187a.readInt(), this.f19187a.readInt());
    }

    /* renamed from: i */
    public final void m18055i(c cVar, int i10) {
        int i11 = this.f19187a.readInt();
        cVar.mo18042h(i10, i11 & Integer.MAX_VALUE, AbstractC9038h.m15746b(this.f19187a.readByte(), 255) + 1, (Integer.MIN_VALUE & i11) != 0);
    }

    /* renamed from: j */
    public final void m18056j(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            m18055i(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    /* renamed from: k */
    public final void m18057k(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iM15746b = (i11 & 8) != 0 ? AbstractC9038h.m15746b(this.f19187a.readByte(), 255) : 0;
        cVar.mo18037c(i12, this.f19187a.readInt() & Integer.MAX_VALUE, m18052f(f19185e.m18062b(i10 - 4, i11, iM15746b), iM15746b, i11, i12));
    }

    /* renamed from: l */
    public final void m18058l(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i13 = this.f19187a.readInt();
        ErrorCode errorCodeM17909a = ErrorCode.f19100b.m17909a(i13);
        if (errorCodeM17909a != null) {
            cVar.mo18043i(i12, errorCodeM17909a);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + r4);
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m18059m(okhttp3.internal.http2.C9566d.c r7, int r8, int r9, int r10) throws java.io.IOException {
        /*
            r6 = this;
            if (r10 != 0) goto Lb3
            r10 = 1
            r9 = r9 & r10
            if (r9 == 0) goto L14
            if (r8 != 0) goto Lc
            r7.mo18038d()
            return
        Lc:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r7.<init>(r8)
            throw r7
        L14:
            int r9 = r8 % 6
            if (r9 != 0) goto L9c
            q9.s r9 = new q9.s
            r9.<init>()
            r0 = 0
            d8.f r8 = p077d8.AbstractC8323h.m13525t(r0, r8)
            r1 = 6
            d8.d r8 = p077d8.AbstractC8323h.m13524s(r8, r1)
            int r1 = r8.m13496b()
            int r2 = r8.m13497c()
            int r8 = r8.m13498d()
            if (r8 <= 0) goto L37
            if (r1 <= r2) goto L3b
        L37:
            if (r8 >= 0) goto L98
            if (r2 > r1) goto L98
        L3b:
            okio.BufferedSource r3 = r6.f19187a
            short r3 = r3.readShort()
            r4 = 65535(0xffff, float:9.1834E-41)
            int r3 = p147j9.AbstractC9038h.m15747c(r3, r4)
            okio.BufferedSource r4 = r6.f19187a
            int r4 = r4.readInt()
            r5 = 2
            if (r3 == r5) goto L84
            r5 = 4
            if (r3 == r5) goto L79
            r5 = 5
            if (r3 == r5) goto L58
            goto L91
        L58:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L62
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L62
            goto L91
        L62:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            r8.append(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L79:
            if (r4 < 0) goto L7c
            goto L91
        L7c:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r7.<init>(r8)
            throw r7
        L84:
            if (r4 == 0) goto L91
            if (r4 != r10) goto L89
            goto L91
        L89:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r7.<init>(r8)
            throw r7
        L91:
            r9.m18443h(r3, r4)
            if (r1 == r2) goto L98
            int r1 = r1 + r8
            goto L3b
        L98:
            r7.mo18039e(r0, r9)
            return
        L9c:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "TYPE_SETTINGS length % 6 != 0: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        Lb3:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "TYPE_SETTINGS streamId != 0"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C9566d.m18059m(okhttp3.internal.http2.d$c, int, int, int):void");
    }

    /* renamed from: n */
    public final void m18060n(c cVar, int i10, int i11, int i12) throws Exception {
        int i13;
        try {
            if (i10 != 4) {
                throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
            }
            try {
                long jM15748d = AbstractC9038h.m15748d(this.f19187a.readInt(), SieveCacheKt.NodeLinkMask);
                if (jM15748d == 0) {
                    throw new IOException("windowSizeIncrement was 0");
                }
                Logger logger = f19186f;
                if (logger.isLoggable(Level.FINE)) {
                    i13 = i12;
                    logger.fine(C9857b.f19671a.m18379d(true, i12, i10, jM15748d));
                } else {
                    i13 = i12;
                }
                cVar.mo18036b(i13, jM15748d);
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                f19186f.fine(C9857b.f19671a.m18378c(true, i12, i10, 8, i11));
                throw exc;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
