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
import okhttp3.internal.http2.C7530b;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import p065g5.AbstractC6424h;
import p065g5.AbstractC6427k;
import p116n5.C7468b;
import p116n5.C7485s;

/* renamed from: okhttp3.internal.http2.d */
/* loaded from: classes4.dex */
public final class C7532d implements Closeable {

    /* renamed from: e */
    public static final a f9963e = new a(null);

    /* renamed from: f */
    public static final Logger f9964f;

    /* renamed from: a */
    public final BufferedSource f9965a;

    /* renamed from: b */
    public final boolean f9966b;

    /* renamed from: c */
    public final b f9967c;

    /* renamed from: d */
    public final C7530b.a f9968d;

    /* renamed from: okhttp3.internal.http2.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Logger m8880a() {
            return C7532d.f9964f;
        }

        /* renamed from: b */
        public final int m8881b(int i6, int i7, int i8) throws IOException {
            if ((i7 & 8) != 0) {
                i6--;
            }
            if (i8 <= i6) {
                return i6 - i8;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i8 + " > remaining length " + i6);
        }

        public a() {
        }
    }

    /* renamed from: okhttp3.internal.http2.d$b */
    public static final class b implements Source {

        /* renamed from: a */
        public final BufferedSource f9969a;

        /* renamed from: b */
        public int f9970b;

        /* renamed from: c */
        public int f9971c;

        /* renamed from: d */
        public int f9972d;

        /* renamed from: e */
        public int f9973e;

        /* renamed from: f */
        public int f9974f;

        public b(BufferedSource source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f9969a = source;
        }

        /* renamed from: a */
        public final int m8882a() {
            return this.f9973e;
        }

        /* renamed from: c */
        public final void m8883c() throws IOException {
            int i6 = this.f9972d;
            int iM7010x = AbstractC6424h.m7010x(this.f9969a);
            this.f9973e = iM7010x;
            this.f9970b = iM7010x;
            int iM6988b = AbstractC6424h.m6988b(this.f9969a.readByte(), 255);
            this.f9971c = AbstractC6424h.m6988b(this.f9969a.readByte(), 255);
            a aVar = C7532d.f9963e;
            if (aVar.m8880a().isLoggable(Level.FINE)) {
                aVar.m8880a().fine(C7468b.f9577a.m8545c(true, this.f9972d, this.f9970b, iM6988b, this.f9971c));
            }
            int i7 = this.f9969a.readInt() & Integer.MAX_VALUE;
            this.f9972d = i7;
            if (iM6988b == 9) {
                if (i7 != i6) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iM6988b + " != TYPE_CONTINUATION");
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: g */
        public final void m8884g(int i6) {
            this.f9971c = i6;
        }

        /* renamed from: h */
        public final void m8885h(int i6) {
            this.f9973e = i6;
        }

        /* renamed from: i */
        public final void m8886i(int i6) {
            this.f9970b = i6;
        }

        /* renamed from: j */
        public final void m8887j(int i6) {
            this.f9974f = i6;
        }

        /* renamed from: k */
        public final void m8888k(int i6) {
            this.f9972d = i6;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j6) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i6 = this.f9973e;
                if (i6 != 0) {
                    long j7 = this.f9969a.read(sink, Math.min(j6, i6));
                    if (j7 == -1) {
                        return -1L;
                    }
                    this.f9973e -= (int) j7;
                    return j7;
                }
                this.f9969a.skip(this.f9974f);
                this.f9974f = 0;
                if ((this.f9971c & 4) != 0) {
                    return -1L;
                }
                m8883c();
            }
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f9969a.getTimeout();
        }
    }

    /* renamed from: okhttp3.internal.http2.d$c */
    public interface c {
        /* renamed from: a */
        void mo8854a(boolean z6, int i6, int i7, List list);

        /* renamed from: b */
        void mo8855b(int i6, long j6);

        /* renamed from: c */
        void mo8856c(boolean z6, C7485s c7485s);

        /* renamed from: d */
        void mo8857d(int i6, int i7, List list);

        /* renamed from: e */
        void mo8858e();

        /* renamed from: f */
        void mo8859f(boolean z6, int i6, BufferedSource bufferedSource, int i7);

        /* renamed from: g */
        void mo8860g(boolean z6, int i6, int i7);

        /* renamed from: h */
        void mo8861h(int i6, int i7, int i8, boolean z6);

        /* renamed from: i */
        void mo8862i(int i6, ErrorCode errorCode);

        /* renamed from: j */
        void mo8863j(int i6, ErrorCode errorCode, ByteString byteString);
    }

    static {
        Logger logger = Logger.getLogger(C7468b.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        f9964f = logger;
    }

    public C7532d(BufferedSource source, boolean z6) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f9965a = source;
        this.f9966b = z6;
        b bVar = new b(source);
        this.f9967c = bVar;
        this.f9968d = new C7530b.a(bVar, 4096, 0, 4, null);
    }

    /* renamed from: c */
    public final boolean m8867c(boolean z6, c handler) throws Exception {
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.f9965a.require(9L);
            int iM7010x = AbstractC6424h.m7010x(this.f9965a);
            if (iM7010x > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iM7010x);
            }
            int iM6988b = AbstractC6424h.m6988b(this.f9965a.readByte(), 255);
            int iM6988b2 = AbstractC6424h.m6988b(this.f9965a.readByte(), 255);
            int i6 = this.f9965a.readInt() & Integer.MAX_VALUE;
            if (iM6988b != 8) {
                Logger logger = f9964f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C7468b.f9577a.m8545c(true, i6, iM7010x, iM6988b, iM6988b2));
                }
            }
            if (z6 && iM6988b != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + C7468b.f9577a.m8544b(iM6988b));
            }
            switch (iM6988b) {
                case 0:
                    m8869h(handler, iM7010x, iM6988b2, i6);
                    return true;
                case 1:
                    m8872k(handler, iM7010x, iM6988b2, i6);
                    return true;
                case 2:
                    m8875n(handler, iM7010x, iM6988b2, i6);
                    return true;
                case 3:
                    m8877p(handler, iM7010x, iM6988b2, i6);
                    return true;
                case 4:
                    m8878q(handler, iM7010x, iM6988b2, i6);
                    return true;
                case 5:
                    m8876o(handler, iM7010x, iM6988b2, i6);
                    return true;
                case 6:
                    m8873l(handler, iM7010x, iM6988b2, i6);
                    return true;
                case 7:
                    m8870i(handler, iM7010x, iM6988b2, i6);
                    return true;
                case 8:
                    m8879r(handler, iM7010x, iM6988b2, i6);
                    return true;
                default:
                    this.f9965a.skip(iM7010x);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9965a.close();
    }

    /* renamed from: g */
    public final void m8868g(c handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f9966b) {
            if (!m8867c(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        BufferedSource bufferedSource = this.f9965a;
        ByteString byteString = C7468b.f9578b;
        ByteString byteString2 = bufferedSource.readByteString(byteString.size());
        Logger logger = f9964f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(AbstractC6427k.m7022j("<< CONNECTION " + byteString2.hex(), new Object[0]));
        }
        if (Intrinsics.areEqual(byteString, byteString2)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + byteString2.utf8());
    }

    /* renamed from: h */
    public final void m8869h(c cVar, int i6, int i7, int i8) throws IOException {
        if (i8 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z6 = (i7 & 1) != 0;
        if ((i7 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iM6988b = (i7 & 8) != 0 ? AbstractC6424h.m6988b(this.f9965a.readByte(), 255) : 0;
        cVar.mo8859f(z6, i8, this.f9965a, f9963e.m8881b(i6, i7, iM6988b));
        this.f9965a.skip(iM6988b);
    }

    /* renamed from: i */
    public final void m8870i(c cVar, int i6, int i7, int i8) throws IOException {
        if (i6 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i6);
        }
        if (i8 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i9 = this.f9965a.readInt();
        int i10 = this.f9965a.readInt();
        int i11 = i6 - 8;
        ErrorCode errorCodeM8728a = ErrorCode.INSTANCE.m8728a(i10);
        if (errorCodeM8728a == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i10);
        }
        ByteString byteString = ByteString.EMPTY;
        if (i11 > 0) {
            byteString = this.f9965a.readByteString(i11);
        }
        cVar.mo8863j(i9, errorCodeM8728a, byteString);
    }

    /* renamed from: j */
    public final List m8871j(int i6, int i7, int i8, int i9) throws IOException {
        this.f9967c.m8885h(i6);
        b bVar = this.f9967c;
        bVar.m8886i(bVar.m8882a());
        this.f9967c.m8887j(i7);
        this.f9967c.m8884g(i8);
        this.f9967c.m8888k(i9);
        this.f9968d.m8745k();
        return this.f9968d.m8739e();
    }

    /* renamed from: k */
    public final void m8872k(c cVar, int i6, int i7, int i8) throws IOException {
        if (i8 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z6 = (i7 & 1) != 0;
        int iM6988b = (i7 & 8) != 0 ? AbstractC6424h.m6988b(this.f9965a.readByte(), 255) : 0;
        if ((i7 & 32) != 0) {
            m8874m(cVar, i8);
            i6 -= 5;
        }
        cVar.mo8854a(z6, i8, -1, m8871j(f9963e.m8881b(i6, i7, iM6988b), iM6988b, i7, i8));
    }

    /* renamed from: l */
    public final void m8873l(c cVar, int i6, int i7, int i8) throws IOException {
        if (i6 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i6);
        }
        if (i8 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.mo8860g((i7 & 1) != 0, this.f9965a.readInt(), this.f9965a.readInt());
    }

    /* renamed from: m */
    public final void m8874m(c cVar, int i6) {
        int i7 = this.f9965a.readInt();
        cVar.mo8861h(i6, i7 & Integer.MAX_VALUE, AbstractC6424h.m6988b(this.f9965a.readByte(), 255) + 1, (Integer.MIN_VALUE & i7) != 0);
    }

    /* renamed from: n */
    public final void m8875n(c cVar, int i6, int i7, int i8) throws IOException {
        if (i6 == 5) {
            if (i8 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            m8874m(cVar, i8);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i6 + " != 5");
        }
    }

    /* renamed from: o */
    public final void m8876o(c cVar, int i6, int i7, int i8) throws IOException {
        if (i8 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iM6988b = (i7 & 8) != 0 ? AbstractC6424h.m6988b(this.f9965a.readByte(), 255) : 0;
        cVar.mo8857d(i8, this.f9965a.readInt() & Integer.MAX_VALUE, m8871j(f9963e.m8881b(i6 - 4, i7, iM6988b), iM6988b, i7, i8));
    }

    /* renamed from: p */
    public final void m8877p(c cVar, int i6, int i7, int i8) throws IOException {
        if (i6 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i6 + " != 4");
        }
        if (i8 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i9 = this.f9965a.readInt();
        ErrorCode errorCodeM8728a = ErrorCode.INSTANCE.m8728a(i9);
        if (errorCodeM8728a != null) {
            cVar.mo8862i(i8, errorCodeM8728a);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + r4);
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8878q(okhttp3.internal.http2.C7532d.c r7, int r8, int r9, int r10) throws java.io.IOException {
        /*
            r6 = this;
            if (r10 != 0) goto Lb3
            r10 = 1
            r9 = r9 & r10
            if (r9 == 0) goto L14
            if (r8 != 0) goto Lc
            r7.mo8858e()
            return
        Lc:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r7.<init>(r8)
            throw r7
        L14:
            int r9 = r8 % 6
            if (r9 != 0) goto L9c
            n5.s r9 = new n5.s
            r9.<init>()
            r0 = 0
            kotlin.ranges.IntRange r8 = kotlin.ranges.RangesKt.until(r0, r8)
            r1 = 6
            kotlin.ranges.IntProgression r8 = kotlin.ranges.RangesKt.step(r8, r1)
            int r1 = r8.getFirst()
            int r2 = r8.getLast()
            int r8 = r8.getStep()
            if (r8 <= 0) goto L37
            if (r1 <= r2) goto L3b
        L37:
            if (r8 >= 0) goto L98
            if (r2 > r1) goto L98
        L3b:
            okio.BufferedSource r3 = r6.f9965a
            short r3 = r3.readShort()
            r4 = 65535(0xffff, float:9.1834E-41)
            int r3 = p065g5.AbstractC6424h.m6989c(r3, r4)
            okio.BufferedSource r4 = r6.f9965a
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
            r9.m8610h(r3, r4)
            if (r1 == r2) goto L98
            int r1 = r1 + r8
            goto L3b
        L98:
            r7.mo8856c(r0, r9)
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
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C7532d.m8878q(okhttp3.internal.http2.d$c, int, int, int):void");
    }

    /* renamed from: r */
    public final void m8879r(c cVar, int i6, int i7, int i8) throws Exception {
        int i9;
        try {
            if (i6 != 4) {
                throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i6);
            }
            try {
                long jM6990d = AbstractC6424h.m6990d(this.f9965a.readInt(), SieveCacheKt.NodeLinkMask);
                if (jM6990d == 0) {
                    throw new IOException("windowSizeIncrement was 0");
                }
                Logger logger = f9964f;
                if (logger.isLoggable(Level.FINE)) {
                    i9 = i8;
                    logger.fine(C7468b.f9577a.m8546d(true, i8, i6, jM6990d));
                } else {
                    i9 = i8;
                }
                cVar.mo8855b(i9, jM6990d);
            } catch (Exception e6) {
                e = e6;
                Exception exc = e;
                f9964f.fine(C7468b.f9577a.m8545c(true, i8, i6, 8, i7));
                throw exc;
            }
        } catch (Exception e7) {
            e = e7;
        }
    }
}
