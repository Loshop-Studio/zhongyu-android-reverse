package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.internal.http2.C9565c;
import okhttp3.internal.http2.C9566d;
import okhttp3.internal.http2.InterfaceC9563a;
import okhttp3.internal.platform.AbstractC9570c;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import p123h7.C8736p;
import p136i9.C8924v;
import p147j9.AbstractC9038h;
import p147j9.AbstractC9041k;
import p181m9.C9345c;
import p181m9.C9346d;
import p225q9.C9871p;
import p225q9.C9874s;
import p225q9.InterfaceC9873r;
import p236r9.C9947a;
import p300x7.InterfaceC10559a;

/* renamed from: okhttp3.internal.http2.c */
/* loaded from: classes5.dex */
public final class C9565c implements Closeable {

    /* renamed from: C */
    public static final b f19141C = new b(null);

    /* renamed from: D */
    public static final C9874s f19142D;

    /* renamed from: A */
    public final d f19143A;

    /* renamed from: B */
    public final Set f19144B;

    /* renamed from: a */
    public final boolean f19145a;

    /* renamed from: b */
    public final c f19146b;

    /* renamed from: c */
    public final Map f19147c;

    /* renamed from: d */
    public final String f19148d;

    /* renamed from: e */
    public int f19149e;

    /* renamed from: f */
    public int f19150f;

    /* renamed from: g */
    public boolean f19151g;

    /* renamed from: h */
    public final C9346d f19152h;

    /* renamed from: i */
    public final C9345c f19153i;

    /* renamed from: j */
    public final C9345c f19154j;

    /* renamed from: k */
    public final C9345c f19155k;

    /* renamed from: l */
    public final InterfaceC9873r f19156l;

    /* renamed from: m */
    public long f19157m;

    /* renamed from: n */
    public long f19158n;

    /* renamed from: o */
    public long f19159o;

    /* renamed from: p */
    public long f19160p;

    /* renamed from: q */
    public long f19161q;

    /* renamed from: r */
    public long f19162r;

    /* renamed from: s */
    public final InterfaceC9563a f19163s;

    /* renamed from: t */
    public final C9874s f19164t;

    /* renamed from: u */
    public C9874s f19165u;

    /* renamed from: v */
    public final C9947a f19166v;

    /* renamed from: w */
    public long f19167w;

    /* renamed from: x */
    public long f19168x;

    /* renamed from: y */
    public final Socket f19169y;

    /* renamed from: z */
    public final C9567e f19170z;

    /* renamed from: okhttp3.internal.http2.c$a */
    public static final class a {

        /* renamed from: a */
        public boolean f19171a;

        /* renamed from: b */
        public final C9346d f19172b;

        /* renamed from: c */
        public Socket f19173c;

        /* renamed from: d */
        public String f19174d;

        /* renamed from: e */
        public BufferedSource f19175e;

        /* renamed from: f */
        public BufferedSink f19176f;

        /* renamed from: g */
        public c f19177g;

        /* renamed from: h */
        public InterfaceC9873r f19178h;

        /* renamed from: i */
        public int f19179i;

        /* renamed from: j */
        public InterfaceC9563a f19180j;

        public a(boolean z10, C9346d taskRunner) {
            AbstractC9133u.m16133g(taskRunner, "taskRunner");
            this.f19171a = z10;
            this.f19172b = taskRunner;
            this.f19177g = c.f19182b;
            this.f19178h = InterfaceC9873r.f19754b;
            this.f19180j = InterfaceC9563a.a.f19119a;
        }

        /* renamed from: a */
        public final C9565c m18007a() {
            return new C9565c(this);
        }

        /* renamed from: b */
        public final a m18008b(InterfaceC9563a flowControlListener) {
            AbstractC9133u.m16133g(flowControlListener, "flowControlListener");
            this.f19180j = flowControlListener;
            return this;
        }

        /* renamed from: c */
        public final boolean m18009c() {
            return this.f19171a;
        }

        /* renamed from: d */
        public final String m18010d() {
            String str = this.f19174d;
            if (str != null) {
                return str;
            }
            AbstractC9133u.m16151y("connectionName");
            return null;
        }

        /* renamed from: e */
        public final InterfaceC9563a m18011e() {
            return this.f19180j;
        }

        /* renamed from: f */
        public final c m18012f() {
            return this.f19177g;
        }

        /* renamed from: g */
        public final int m18013g() {
            return this.f19179i;
        }

        /* renamed from: h */
        public final InterfaceC9873r m18014h() {
            return this.f19178h;
        }

        /* renamed from: i */
        public final BufferedSink m18015i() {
            BufferedSink bufferedSink = this.f19176f;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            AbstractC9133u.m16151y("sink");
            return null;
        }

        /* renamed from: j */
        public final Socket m18016j() {
            Socket socket = this.f19173c;
            if (socket != null) {
                return socket;
            }
            AbstractC9133u.m16151y("socket");
            return null;
        }

        /* renamed from: k */
        public final BufferedSource m18017k() {
            BufferedSource bufferedSource = this.f19175e;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            AbstractC9133u.m16151y("source");
            return null;
        }

        /* renamed from: l */
        public final C9346d m18018l() {
            return this.f19172b;
        }

        /* renamed from: m */
        public final a m18019m(c listener) {
            AbstractC9133u.m16133g(listener, "listener");
            this.f19177g = listener;
            return this;
        }

        /* renamed from: n */
        public final a m18020n(int i10) {
            this.f19179i = i10;
            return this;
        }

        /* renamed from: o */
        public final void m18021o(String str) {
            AbstractC9133u.m16133g(str, "<set-?>");
            this.f19174d = str;
        }

        /* renamed from: p */
        public final void m18022p(BufferedSink bufferedSink) {
            AbstractC9133u.m16133g(bufferedSink, "<set-?>");
            this.f19176f = bufferedSink;
        }

        /* renamed from: q */
        public final void m18023q(Socket socket) {
            AbstractC9133u.m16133g(socket, "<set-?>");
            this.f19173c = socket;
        }

        /* renamed from: r */
        public final void m18024r(BufferedSource bufferedSource) {
            AbstractC9133u.m16133g(bufferedSource, "<set-?>");
            this.f19175e = bufferedSource;
        }

        /* renamed from: s */
        public final a m18025s(Socket socket, String peerName, BufferedSource source, BufferedSink sink) {
            String str;
            AbstractC9133u.m16133g(socket, "socket");
            AbstractC9133u.m16133g(peerName, "peerName");
            AbstractC9133u.m16133g(source, "source");
            AbstractC9133u.m16133g(sink, "sink");
            m18023q(socket);
            if (this.f19171a) {
                str = AbstractC9041k.f17266c + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            m18021o(str);
            m18024r(source);
            m18022p(sink);
            return this;
        }
    }

    /* renamed from: okhttp3.internal.http2.c$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final C9874s m18026a() {
            return C9565c.f19142D;
        }

        public b() {
        }
    }

    /* renamed from: okhttp3.internal.http2.c$c */
    public static abstract class c {

        /* renamed from: a */
        public static final b f19181a = new b(null);

        /* renamed from: b */
        public static final c f19182b = new a();

        /* renamed from: okhttp3.internal.http2.c$c$a */
        public static final class a extends c {
            @Override // okhttp3.internal.http2.C9565c.c
            /* renamed from: c */
            public void mo17545c(C9871p stream) {
                AbstractC9133u.m16133g(stream, "stream");
                stream.m18392e(ErrorCode.f19108j, null);
            }
        }

        /* renamed from: okhttp3.internal.http2.c$c$b */
        public static final class b {
            public /* synthetic */ b(AbstractC9126n abstractC9126n) {
                this();
            }

            public b() {
            }
        }

        /* renamed from: a */
        public void mo17544a(C9565c connection, C9874s settings) {
            AbstractC9133u.m16133g(connection, "connection");
            AbstractC9133u.m16133g(settings, "settings");
        }

        /* renamed from: c */
        public abstract void mo17545c(C9871p c9871p);
    }

    /* renamed from: okhttp3.internal.http2.c$d */
    public final class d implements C9566d.c, InterfaceC10559a {

        /* renamed from: a */
        public final C9566d f19183a;

        /* renamed from: b */
        public final /* synthetic */ C9565c f19184b;

        public d(C9565c c9565c, C9566d reader) {
            AbstractC9133u.m16133g(reader, "reader");
            this.f19184b = c9565c;
            this.f19183a = reader;
        }

        /* renamed from: q */
        public static final C8736p m18031q(C9565c c9565c, Ref$ObjectRef ref$ObjectRef) {
            c9565c.m17975D().mo17544a(c9565c, (C9874s) ref$ObjectRef.f17473a);
            return C8736p.f16368a;
        }

        /* renamed from: r */
        public static final C8736p m18032r(C9565c c9565c, C9871p c9871p) {
            try {
                c9565c.m17975D().mo17545c(c9871p);
            } catch (IOException e10) {
                AbstractC9570c.f19216a.m18112e().mo18100l("Http2Connection.Listener failure for " + c9565c.m17972A(), 4, e10);
                try {
                    c9871p.m18392e(ErrorCode.f19102d, e10);
                } catch (IOException unused) {
                }
            }
            return C8736p.f16368a;
        }

        /* renamed from: t */
        public static final C8736p m18033t(C9565c c9565c, int i10, int i11) throws IOException {
            c9565c.m18000i0(true, i10, i11);
            return C8736p.f16368a;
        }

        /* renamed from: u */
        public static final C8736p m18034u(d dVar, boolean z10, C9874s c9874s) {
            dVar.m18045p(z10, c9874s);
            return C8736p.f16368a;
        }

        @Override // okhttp3.internal.http2.C9566d.c
        /* renamed from: a */
        public void mo18035a(boolean z10, int i10, int i11, List headerBlock) {
            AbstractC9133u.m16133g(headerBlock, "headerBlock");
            if (this.f19184b.m17990W(i10)) {
                this.f19184b.m17987R(i10, headerBlock, z10);
                return;
            }
            final C9565c c9565c = this.f19184b;
            synchronized (c9565c) {
                C9871p c9871pM17979H = c9565c.m17979H(i10);
                if (c9871pM17979H != null) {
                    C8736p c8736p = C8736p.f16368a;
                    c9871pM17979H.m18412y(AbstractC9041k.m15789s(headerBlock), z10);
                    return;
                }
                if (c9565c.f19151g) {
                    return;
                }
                if (i10 <= c9565c.m17974C()) {
                    return;
                }
                if (i10 % 2 == c9565c.m17976E() % 2) {
                    return;
                }
                final C9871p c9871p = new C9871p(i10, c9565c, false, z10, AbstractC9041k.m15789s(headerBlock));
                c9565c.m17993a0(i10);
                c9565c.m17980I().put(Integer.valueOf(i10), c9871p);
                C9345c.m17181d(c9565c.f19152h.m17208k(), c9565c.m17972A() + '[' + i10 + "] onStream", 0L, false, new InterfaceC10559a() { // from class: q9.l
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return C9565c.d.m18032r(c9565c, c9871p);
                    }
                }, 6, null);
            }
        }

        @Override // okhttp3.internal.http2.C9566d.c
        /* renamed from: b */
        public void mo18036b(int i10, long j10) {
            if (i10 == 0) {
                C9565c c9565c = this.f19184b;
                synchronized (c9565c) {
                    c9565c.f19168x = c9565c.m17981J() + j10;
                    AbstractC9133u.m16131e(c9565c, "null cannot be cast to non-null type java.lang.Object");
                    c9565c.notifyAll();
                    C8736p c8736p = C8736p.f16368a;
                }
                return;
            }
            C9871p c9871pM17979H = this.f19184b.m17979H(i10);
            if (c9871pM17979H != null) {
                synchronized (c9871pM17979H) {
                    c9871pM17979H.m18389b(j10);
                    C8736p c8736p2 = C8736p.f16368a;
                }
            }
        }

        @Override // okhttp3.internal.http2.C9566d.c
        /* renamed from: c */
        public void mo18037c(int i10, int i11, List requestHeaders) {
            AbstractC9133u.m16133g(requestHeaders, "requestHeaders");
            this.f19184b.m17988T(i11, requestHeaders);
        }

        @Override // okhttp3.internal.http2.C9566d.c
        /* renamed from: d */
        public void mo18038d() {
        }

        @Override // okhttp3.internal.http2.C9566d.c
        /* renamed from: e */
        public void mo18039e(final boolean z10, final C9874s settings) {
            AbstractC9133u.m16133g(settings, "settings");
            C9345c.m17181d(this.f19184b.f19153i, this.f19184b.m17972A() + " applyAndAckSettings", 0L, false, new InterfaceC10559a() { // from class: q9.m
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return C9565c.d.m18034u(this.f19705a, z10, settings);
                }
            }, 6, null);
        }

        @Override // okhttp3.internal.http2.C9566d.c
        /* renamed from: f */
        public void mo18040f(boolean z10, int i10, BufferedSource source, int i11) {
            AbstractC9133u.m16133g(source, "source");
            if (this.f19184b.m17990W(i10)) {
                this.f19184b.m17986P(i10, source, i11, z10);
                return;
            }
            C9871p c9871pM17979H = this.f19184b.m17979H(i10);
            if (c9871pM17979H == null) {
                this.f19184b.m18002l0(i10, ErrorCode.f19102d);
                long j10 = i11;
                this.f19184b.m17997f0(j10);
                source.skip(j10);
                return;
            }
            c9871pM17979H.m18411x(source, i11);
            if (z10) {
                c9871pM17979H.m18412y(C8924v.f16794c, true);
            }
        }

        @Override // okhttp3.internal.http2.C9566d.c
        /* renamed from: g */
        public void mo18041g(boolean z10, final int i10, final int i11) {
            if (!z10) {
                C9345c c9345c = this.f19184b.f19153i;
                String str = this.f19184b.m17972A() + " ping";
                final C9565c c9565c = this.f19184b;
                C9345c.m17181d(c9345c, str, 0L, false, new InterfaceC10559a() { // from class: q9.k
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return C9565c.d.m18033t(c9565c, i10, i11);
                    }
                }, 6, null);
                return;
            }
            C9565c c9565c2 = this.f19184b;
            synchronized (c9565c2) {
                try {
                    if (i10 == 1) {
                        c9565c2.f19158n++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            c9565c2.f19161q++;
                            AbstractC9133u.m16131e(c9565c2, "null cannot be cast to non-null type java.lang.Object");
                            c9565c2.notifyAll();
                        }
                        C8736p c8736p = C8736p.f16368a;
                    } else {
                        c9565c2.f19160p++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.C9566d.c
        /* renamed from: h */
        public void mo18042h(int i10, int i11, int i12, boolean z10) {
        }

        @Override // okhttp3.internal.http2.C9566d.c
        /* renamed from: i */
        public void mo18043i(int i10, ErrorCode errorCode) {
            AbstractC9133u.m16133g(errorCode, "errorCode");
            if (this.f19184b.m17990W(i10)) {
                this.f19184b.m17989V(i10, errorCode);
                return;
            }
            C9871p c9871pM17991X = this.f19184b.m17991X(i10);
            if (c9871pM17991X != null) {
                c9871pM17991X.m18413z(errorCode);
            }
        }

        @Override // p300x7.InterfaceC10559a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m18046s();
            return C8736p.f16368a;
        }

        @Override // okhttp3.internal.http2.C9566d.c
        /* renamed from: k */
        public void mo18044k(int i10, ErrorCode errorCode, ByteString debugData) {
            int i11;
            Object[] array;
            AbstractC9133u.m16133g(errorCode, "errorCode");
            AbstractC9133u.m16133g(debugData, "debugData");
            debugData.size();
            C9565c c9565c = this.f19184b;
            synchronized (c9565c) {
                array = c9565c.m17980I().values().toArray(new C9871p[0]);
                c9565c.f19151g = true;
                C8736p c8736p = C8736p.f16368a;
            }
            for (C9871p c9871p : (C9871p[]) array) {
                if (c9871p.m18399l() > i10 && c9871p.m18407t()) {
                    c9871p.m18413z(ErrorCode.f19108j);
                    this.f19184b.m17991X(c9871p.m18399l());
                }
            }
        }

        /* renamed from: p */
        public final void m18045p(boolean z10, C9874s c9874s) {
            long jM18438c;
            int i10;
            C9871p[] c9871pArr;
            C9874s settings = c9874s;
            AbstractC9133u.m16133g(settings, "settings");
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            C9567e c9567eM17982K = this.f19184b.m17982K();
            final C9565c c9565c = this.f19184b;
            synchronized (c9567eM17982K) {
                synchronized (c9565c) {
                    try {
                        C9874s c9874sM17978G = c9565c.m17978G();
                        if (!z10) {
                            C9874s c9874s2 = new C9874s();
                            c9874s2.m18442g(c9874sM17978G);
                            c9874s2.m18442g(settings);
                            settings = c9874s2;
                        }
                        ref$ObjectRef.f17473a = settings;
                        jM18438c = settings.m18438c() - c9874sM17978G.m18438c();
                        c9871pArr = (jM18438c == 0 || c9565c.m17980I().isEmpty()) ? null : (C9871p[]) c9565c.m17980I().values().toArray(new C9871p[0]);
                        c9565c.m17994b0((C9874s) ref$ObjectRef.f17473a);
                        C9345c.m17181d(c9565c.f19155k, c9565c.m17972A() + " onSettings", 0L, false, new InterfaceC10559a() { // from class: q9.n
                            @Override // p300x7.InterfaceC10559a
                            public final Object invoke() {
                                return C9565c.d.m18031q(c9565c, ref$ObjectRef);
                            }
                        }, 6, null);
                        C8736p c8736p = C8736p.f16368a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    c9565c.m17982K().m18070a((C9874s) ref$ObjectRef.f17473a);
                } catch (IOException e10) {
                    c9565c.m18005y(e10);
                }
                C8736p c8736p2 = C8736p.f16368a;
            }
            if (c9871pArr != null) {
                for (C9871p c9871p : c9871pArr) {
                    synchronized (c9871p) {
                        c9871p.m18389b(jM18438c);
                        C8736p c8736p3 = C8736p.f16368a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.d] */
        /* renamed from: s */
        public void m18046s() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.f19103e;
            IOException e10 = null;
            try {
                try {
                    this.f19183a.m18049c(this);
                    while (this.f19183a.m18048b(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.f19101c;
                    try {
                        this.f19184b.m18004x(errorCode3, ErrorCode.f19109k, null);
                        errorCode = errorCode3;
                    } catch (IOException e11) {
                        e10 = e11;
                        ErrorCode errorCode4 = ErrorCode.f19102d;
                        C9565c c9565c = this.f19184b;
                        c9565c.m18004x(errorCode4, errorCode4, e10);
                        errorCode = c9565c;
                        errorCode2 = this.f19183a;
                        AbstractC9038h.m15750f(errorCode2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f19184b.m18004x(errorCode, errorCode2, e10);
                    AbstractC9038h.m15750f(this.f19183a);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                this.f19184b.m18004x(errorCode, errorCode2, e10);
                AbstractC9038h.m15750f(this.f19183a);
                throw th;
            }
            errorCode2 = this.f19183a;
            AbstractC9038h.m15750f(errorCode2);
        }
    }

    static {
        C9874s c9874s = new C9874s();
        c9874s.m18443h(4, 65535);
        c9874s.m18443h(5, 16384);
        f19142D = c9874s;
    }

    public C9565c(a builder) {
        AbstractC9133u.m16133g(builder, "builder");
        boolean zM18009c = builder.m18009c();
        this.f19145a = zM18009c;
        this.f19146b = builder.m18012f();
        this.f19147c = new LinkedHashMap();
        String strM18010d = builder.m18010d();
        this.f19148d = strM18010d;
        this.f19150f = builder.m18009c() ? 3 : 2;
        C9346d c9346dM18018l = builder.m18018l();
        this.f19152h = c9346dM18018l;
        C9345c c9345cM17208k = c9346dM18018l.m17208k();
        this.f19153i = c9345cM17208k;
        this.f19154j = c9346dM18018l.m17208k();
        this.f19155k = c9346dM18018l.m17208k();
        this.f19156l = builder.m18014h();
        this.f19163s = builder.m18011e();
        C9874s c9874s = new C9874s();
        if (builder.m18009c()) {
            c9874s.m18443h(4, 16777216);
        }
        this.f19164t = c9874s;
        this.f19165u = f19142D;
        this.f19166v = new C9947a(0);
        this.f19168x = this.f19165u.m18438c();
        this.f19169y = builder.m18016j();
        this.f19170z = new C9567e(builder.m18015i(), zM18009c);
        this.f19143A = new d(this, new C9566d(builder.m18017k(), zM18009c));
        this.f19144B = new LinkedHashSet();
        if (builder.m18013g() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.m18013g());
            c9345cM17208k.m17192k(strM18010d + " ping", nanos, new InterfaceC10559a() { // from class: q9.c
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return Long.valueOf(C9565c.m17955i(this.f19676a, nanos));
                }
            });
        }
    }

    /* renamed from: O */
    public static final C8736p m17941O(C9565c c9565c, int i10, Buffer buffer, int i11, boolean z10) {
        try {
            boolean zMo18435d = c9565c.f19156l.mo18435d(i10, buffer, i11, z10);
            if (zMo18435d) {
                c9565c.f19170z.m18080k(i10, ErrorCode.f19109k);
            }
            if (zMo18435d || z10) {
                synchronized (c9565c) {
                    c9565c.f19144B.remove(Integer.valueOf(i10));
                    C8736p c8736p = C8736p.f16368a;
                }
            }
        } catch (IOException unused) {
        }
        return C8736p.f16368a;
    }

    /* renamed from: Q */
    public static final C8736p m17942Q(C9565c c9565c, int i10, List list, boolean z10) {
        boolean zMo18434c = c9565c.f19156l.mo18434c(i10, list, z10);
        if (zMo18434c) {
            try {
                c9565c.f19170z.m18080k(i10, ErrorCode.f19109k);
            } catch (IOException unused) {
            }
        }
        if (zMo18434c || z10) {
            synchronized (c9565c) {
                c9565c.f19144B.remove(Integer.valueOf(i10));
                C8736p c8736p = C8736p.f16368a;
            }
        }
        return C8736p.f16368a;
    }

    /* renamed from: S */
    public static final C8736p m17943S(C9565c c9565c, int i10, List list) {
        if (c9565c.f19156l.mo18433b(i10, list)) {
            try {
                c9565c.f19170z.m18080k(i10, ErrorCode.f19109k);
                synchronized (c9565c) {
                    c9565c.f19144B.remove(Integer.valueOf(i10));
                    C8736p c8736p = C8736p.f16368a;
                }
            } catch (IOException unused) {
            }
        }
        return C8736p.f16368a;
    }

    /* renamed from: U */
    public static final C8736p m17944U(C9565c c9565c, int i10, ErrorCode errorCode) {
        c9565c.f19156l.mo18432a(i10, errorCode);
        synchronized (c9565c) {
            c9565c.f19144B.remove(Integer.valueOf(i10));
        }
        return C8736p.f16368a;
    }

    /* renamed from: Y */
    public static final C8736p m17945Y(C9565c c9565c) throws IOException {
        c9565c.m18000i0(false, 2, 0);
        return C8736p.f16368a;
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m17951e0(C9565c c9565c, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        c9565c.m17996d0(z10);
    }

    /* renamed from: i */
    public static final long m17955i(C9565c c9565c, long j10) throws IOException {
        boolean z10;
        synchronized (c9565c) {
            long j11 = c9565c.f19158n;
            long j12 = c9565c.f19157m;
            if (j11 < j12) {
                z10 = true;
            } else {
                c9565c.f19157m = j12 + 1;
                z10 = false;
            }
        }
        if (z10) {
            c9565c.m18005y(null);
            return -1L;
        }
        c9565c.m18000i0(false, 1, 0);
        return j10;
    }

    /* renamed from: k0 */
    public static final C8736p m17958k0(C9565c c9565c, int i10, ErrorCode errorCode) throws IOException {
        try {
            c9565c.m18001j0(i10, errorCode);
        } catch (IOException e10) {
            c9565c.m18005y(e10);
        }
        return C8736p.f16368a;
    }

    /* renamed from: m0 */
    public static final C8736p m17961m0(C9565c c9565c, int i10, long j10) throws IOException {
        try {
            c9565c.f19170z.m18082m(i10, j10);
        } catch (IOException e10) {
            c9565c.m18005y(e10);
        }
        return C8736p.f16368a;
    }

    /* renamed from: A */
    public final String m17972A() {
        return this.f19148d;
    }

    /* renamed from: B */
    public final InterfaceC9563a m17973B() {
        return this.f19163s;
    }

    /* renamed from: C */
    public final int m17974C() {
        return this.f19149e;
    }

    /* renamed from: D */
    public final c m17975D() {
        return this.f19146b;
    }

    /* renamed from: E */
    public final int m17976E() {
        return this.f19150f;
    }

    /* renamed from: F */
    public final C9874s m17977F() {
        return this.f19164t;
    }

    /* renamed from: G */
    public final C9874s m17978G() {
        return this.f19165u;
    }

    /* renamed from: H */
    public final C9871p m17979H(int i10) {
        C9871p c9871p;
        synchronized (this) {
            c9871p = (C9871p) this.f19147c.get(Integer.valueOf(i10));
        }
        return c9871p;
    }

    /* renamed from: I */
    public final Map m17980I() {
        return this.f19147c;
    }

    /* renamed from: J */
    public final long m17981J() {
        return this.f19168x;
    }

    /* renamed from: K */
    public final C9567e m17982K() {
        return this.f19170z;
    }

    /* renamed from: L */
    public final boolean m17983L(long j10) {
        synchronized (this) {
            if (this.f19151g) {
                return false;
            }
            if (this.f19160p < this.f19159o) {
                if (j10 >= this.f19162r) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: M */
    public final C9871p m17984M(int i10, List list, boolean z10) throws Throwable {
        Throwable th;
        boolean z11 = !z10;
        synchronized (this.f19170z) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f19150f > 1073741823) {
                                try {
                                    m17995c0(ErrorCode.f19108j);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            try {
                                if (this.f19151g) {
                                    throw new ConnectionShutdownException();
                                }
                                int i11 = this.f19150f;
                                this.f19150f = i11 + 2;
                                C9871p c9871p = new C9871p(i11, this, z11, false, null);
                                boolean z12 = !z10 || this.f19167w >= this.f19168x || c9871p.m18405r() >= c9871p.m18404q();
                                if (c9871p.m18408u()) {
                                    this.f19147c.put(Integer.valueOf(i11), c9871p);
                                }
                                C8736p c8736p = C8736p.f16368a;
                                if (i10 == 0) {
                                    this.f19170z.m18076g(z11, i11, list);
                                } else {
                                    if (this.f19145a) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.f19170z.m18079j(i10, i11, list);
                                }
                                if (z12) {
                                    this.f19170z.flush();
                                }
                                return c9871p;
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    /* renamed from: N */
    public final C9871p m17985N(List requestHeaders, boolean z10) {
        AbstractC9133u.m16133g(requestHeaders, "requestHeaders");
        return m17984M(0, requestHeaders, z10);
    }

    /* renamed from: P */
    public final void m17986P(final int i10, BufferedSource source, final int i11, final boolean z10) {
        AbstractC9133u.m16133g(source, "source");
        final Buffer buffer = new Buffer();
        long j10 = i11;
        source.require(j10);
        source.read(buffer, j10);
        C9345c.m17181d(this.f19154j, this.f19148d + '[' + i10 + "] onData", 0L, false, new InterfaceC10559a() { // from class: q9.g
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return C9565c.m17941O(this.f19685a, i10, buffer, i11, z10);
            }
        }, 6, null);
    }

    /* renamed from: R */
    public final void m17987R(final int i10, final List requestHeaders, final boolean z10) {
        AbstractC9133u.m16133g(requestHeaders, "requestHeaders");
        C9345c.m17181d(this.f19154j, this.f19148d + '[' + i10 + "] onHeaders", 0L, false, new InterfaceC10559a() { // from class: q9.j
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return C9565c.m17942Q(this.f19696a, i10, requestHeaders, z10);
            }
        }, 6, null);
    }

    /* renamed from: T */
    public final void m17988T(final int i10, final List requestHeaders) {
        AbstractC9133u.m16133g(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.f19144B.contains(Integer.valueOf(i10))) {
                m18002l0(i10, ErrorCode.f19102d);
                return;
            }
            this.f19144B.add(Integer.valueOf(i10));
            C9345c.m17181d(this.f19154j, this.f19148d + '[' + i10 + "] onRequest", 0L, false, new InterfaceC10559a() { // from class: q9.h
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return C9565c.m17943S(this.f19690a, i10, requestHeaders);
                }
            }, 6, null);
        }
    }

    /* renamed from: V */
    public final void m17989V(final int i10, final ErrorCode errorCode) {
        AbstractC9133u.m16133g(errorCode, "errorCode");
        C9345c.m17181d(this.f19154j, this.f19148d + '[' + i10 + "] onReset", 0L, false, new InterfaceC10559a() { // from class: q9.i
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return C9565c.m17944U(this.f19693a, i10, errorCode);
            }
        }, 6, null);
    }

    /* renamed from: W */
    public final boolean m17990W(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    /* renamed from: X */
    public final C9871p m17991X(int i10) {
        C9871p c9871p;
        synchronized (this) {
            c9871p = (C9871p) this.f19147c.remove(Integer.valueOf(i10));
            AbstractC9133u.m16131e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
        return c9871p;
    }

    /* renamed from: Z */
    public final void m17992Z() {
        synchronized (this) {
            long j10 = this.f19160p;
            long j11 = this.f19159o;
            if (j10 < j11) {
                return;
            }
            this.f19159o = j11 + 1;
            this.f19162r = System.nanoTime() + 1000000000;
            C8736p c8736p = C8736p.f16368a;
            C9345c.m17181d(this.f19153i, this.f19148d + " ping", 0L, false, new InterfaceC10559a() { // from class: q9.e
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return C9565c.m17945Y(this.f19681a);
                }
            }, 6, null);
        }
    }

    /* renamed from: a0 */
    public final void m17993a0(int i10) {
        this.f19149e = i10;
    }

    /* renamed from: b0 */
    public final void m17994b0(C9874s c9874s) {
        AbstractC9133u.m16133g(c9874s, "<set-?>");
        this.f19165u = c9874s;
    }

    /* renamed from: c0 */
    public final void m17995c0(ErrorCode statusCode) {
        AbstractC9133u.m16133g(statusCode, "statusCode");
        synchronized (this.f19170z) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            synchronized (this) {
                if (this.f19151g) {
                    return;
                }
                this.f19151g = true;
                int i10 = this.f19149e;
                ref$IntRef.f17471a = i10;
                C8736p c8736p = C8736p.f16368a;
                this.f19170z.m18075f(i10, statusCode, AbstractC9038h.f17259a);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m18004x(ErrorCode.f19101c, ErrorCode.f19109k, null);
    }

    /* renamed from: d0 */
    public final void m17996d0(boolean z10) {
        if (z10) {
            this.f19170z.m18071b();
            this.f19170z.m18081l(this.f19164t);
            if (this.f19164t.m18438c() != 65535) {
                this.f19170z.m18082m(0, r9 - 65535);
            }
        }
        C9345c.m17181d(this.f19152h.m17208k(), this.f19148d, 0L, false, this.f19143A, 6, null);
    }

    /* renamed from: f0 */
    public final void m17997f0(long j10) {
        synchronized (this) {
            try {
                C9947a.m18585c(this.f19166v, j10, 0L, 2, null);
                long jM18586a = this.f19166v.m18586a();
                if (jM18586a >= this.f19164t.m18438c() / 2) {
                    m18003n0(0, jM18586a);
                    C9947a.m18585c(this.f19166v, 0L, jM18586a, 1, null);
                }
                this.f19163s.mo17910a(this.f19166v);
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void flush() {
        this.f19170z.flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f19170z.m18077h());
        r6 = r2;
        r8.f19167w += r6;
        r4 = p123h7.C8736p.f16368a;
     */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m17998g0(int r9, boolean r10, okio.Buffer r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.e r12 = r8.f19170z
            r12.m18072c(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.f19167w     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r6 = r8.f19168x     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.Map r2 = r8.f19147c     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            if (r2 == 0) goto L31
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.AbstractC9133u.m16131e(r8, r2)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            goto L12
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
        L39:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2f
            okhttp3.internal.http2.e r4 = r8.f19170z     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.m18077h()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.f19167w     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.f19167w = r4     // Catch: java.lang.Throwable -> L2f
            h7.p r4 = p123h7.C8736p.f16368a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.e r4 = r8.f19170z
            if (r10 == 0) goto L5d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = r3
        L5e:
            r4.m18072c(r5, r9, r11, r2)
            goto Ld
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C9565c.m17998g0(int, boolean, okio.Buffer, long):void");
    }

    /* renamed from: h0 */
    public final void m17999h0(int i10, boolean z10, List alternating) {
        AbstractC9133u.m16133g(alternating, "alternating");
        this.f19170z.m18076g(z10, i10, alternating);
    }

    /* renamed from: i0 */
    public final void m18000i0(boolean z10, int i10, int i11) throws IOException {
        try {
            this.f19170z.m18078i(z10, i10, i11);
        } catch (IOException e10) {
            m18005y(e10);
        }
    }

    /* renamed from: j0 */
    public final void m18001j0(int i10, ErrorCode statusCode) {
        AbstractC9133u.m16133g(statusCode, "statusCode");
        this.f19170z.m18080k(i10, statusCode);
    }

    /* renamed from: l0 */
    public final void m18002l0(final int i10, final ErrorCode errorCode) {
        AbstractC9133u.m16133g(errorCode, "errorCode");
        C9345c.m17181d(this.f19153i, this.f19148d + '[' + i10 + "] writeSynReset", 0L, false, new InterfaceC10559a() { // from class: q9.f
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return C9565c.m17958k0(this.f19682a, i10, errorCode);
            }
        }, 6, null);
    }

    /* renamed from: n0 */
    public final void m18003n0(final int i10, final long j10) {
        C9345c.m17181d(this.f19153i, this.f19148d + '[' + i10 + "] windowUpdate", 0L, false, new InterfaceC10559a() { // from class: q9.d
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return C9565c.m17961m0(this.f19678a, i10, j10);
            }
        }, 6, null);
    }

    /* renamed from: x */
    public final void m18004x(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) throws IOException {
        int i10;
        Object[] array;
        AbstractC9133u.m16133g(connectionCode, "connectionCode");
        AbstractC9133u.m16133g(streamCode, "streamCode");
        if (AbstractC9041k.f17265b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            m17995c0(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f19147c.isEmpty()) {
                    array = null;
                } else {
                    array = this.f19147c.values().toArray(new C9871p[0]);
                    this.f19147c.clear();
                }
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C9871p[] c9871pArr = (C9871p[]) array;
        if (c9871pArr != null) {
            for (C9871p c9871p : c9871pArr) {
                try {
                    c9871p.m18392e(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f19170z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f19169y.close();
        } catch (IOException unused4) {
        }
        this.f19153i.m17197q();
        this.f19154j.m17197q();
        this.f19155k.m17197q();
    }

    /* renamed from: y */
    public final void m18005y(IOException iOException) throws IOException {
        ErrorCode errorCode = ErrorCode.f19102d;
        m18004x(errorCode, errorCode, iOException);
    }

    /* renamed from: z */
    public final boolean m18006z() {
        return this.f19145a;
    }
}
