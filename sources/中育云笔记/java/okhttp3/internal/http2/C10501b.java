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
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ne.AbstractC10411a;
import ne.C10413c;
import ne.C10414d;
import ne.C10415e;
import okhttp3.internal.http2.C10502c;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import re.C10997d;
import re.C11000g;
import re.InterfaceC10999f;
import se.C11192j;

/* renamed from: okhttp3.internal.http2.b */
/* loaded from: classes6.dex */
public final class C10501b implements Closeable {

    /* renamed from: E */
    public static final b f25176E = new b(null);

    /* renamed from: F */
    public static final C11000g f25177F;

    /* renamed from: A */
    public final Socket f25178A;

    /* renamed from: B */
    public final C10503d f25179B;

    /* renamed from: C */
    public final d f25180C;

    /* renamed from: D */
    public final Set f25181D;

    /* renamed from: c */
    public final boolean f25182c;

    /* renamed from: d */
    public final c f25183d;

    /* renamed from: e */
    public final Map f25184e;

    /* renamed from: f */
    public final String f25185f;

    /* renamed from: g */
    public int f25186g;

    /* renamed from: h */
    public int f25187h;

    /* renamed from: i */
    public boolean f25188i;

    /* renamed from: j */
    public final C10415e f25189j;

    /* renamed from: k */
    public final C10414d f25190k;

    /* renamed from: l */
    public final C10414d f25191l;

    /* renamed from: m */
    public final C10414d f25192m;

    /* renamed from: n */
    public final InterfaceC10999f f25193n;

    /* renamed from: o */
    public long f25194o;

    /* renamed from: p */
    public long f25195p;

    /* renamed from: q */
    public long f25196q;

    /* renamed from: r */
    public long f25197r;

    /* renamed from: s */
    public long f25198s;

    /* renamed from: t */
    public long f25199t;

    /* renamed from: u */
    public final C11000g f25200u;

    /* renamed from: v */
    public C11000g f25201v;

    /* renamed from: w */
    public long f25202w;

    /* renamed from: x */
    public long f25203x;

    /* renamed from: y */
    public long f25204y;

    /* renamed from: z */
    public long f25205z;

    /* renamed from: okhttp3.internal.http2.b$a */
    public static final class a {

        /* renamed from: a */
        public boolean f25206a;

        /* renamed from: b */
        public final C10415e f25207b;

        /* renamed from: c */
        public Socket f25208c;

        /* renamed from: d */
        public String f25209d;

        /* renamed from: e */
        public BufferedSource f25210e;

        /* renamed from: f */
        public BufferedSink f25211f;

        /* renamed from: g */
        public c f25212g;

        /* renamed from: h */
        public InterfaceC10999f f25213h;

        /* renamed from: i */
        public int f25214i;

        public a(boolean z10, C10415e taskRunner) {
            AbstractC9979u.m20294g(taskRunner, "taskRunner");
            this.f25206a = z10;
            this.f25207b = taskRunner;
            this.f25212g = c.f25216b;
            this.f25213h = InterfaceC10999f.f26561b;
        }

        /* renamed from: a */
        public final C10501b m22104a() {
            return new C10501b(this);
        }

        /* renamed from: b */
        public final boolean m22105b() {
            return this.f25206a;
        }

        /* renamed from: c */
        public final String m22106c() {
            String str = this.f25209d;
            if (str != null) {
                return str;
            }
            AbstractC9979u.m20312y("connectionName");
            return null;
        }

        /* renamed from: d */
        public final c m22107d() {
            return this.f25212g;
        }

        /* renamed from: e */
        public final int m22108e() {
            return this.f25214i;
        }

        /* renamed from: f */
        public final InterfaceC10999f m22109f() {
            return this.f25213h;
        }

        /* renamed from: g */
        public final BufferedSink m22110g() {
            BufferedSink bufferedSink = this.f25211f;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            AbstractC9979u.m20312y("sink");
            return null;
        }

        /* renamed from: h */
        public final Socket m22111h() {
            Socket socket = this.f25208c;
            if (socket != null) {
                return socket;
            }
            AbstractC9979u.m20312y("socket");
            return null;
        }

        /* renamed from: i */
        public final BufferedSource m22112i() {
            BufferedSource bufferedSource = this.f25210e;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            AbstractC9979u.m20312y("source");
            return null;
        }

        /* renamed from: j */
        public final C10415e m22113j() {
            return this.f25207b;
        }

        /* renamed from: k */
        public final a m22114k(c listener) {
            AbstractC9979u.m20294g(listener, "listener");
            this.f25212g = listener;
            return this;
        }

        /* renamed from: l */
        public final a m22115l(int i10) {
            this.f25214i = i10;
            return this;
        }

        /* renamed from: m */
        public final void m22116m(String str) {
            AbstractC9979u.m20294g(str, "<set-?>");
            this.f25209d = str;
        }

        /* renamed from: n */
        public final void m22117n(BufferedSink bufferedSink) {
            AbstractC9979u.m20294g(bufferedSink, "<set-?>");
            this.f25211f = bufferedSink;
        }

        /* renamed from: o */
        public final void m22118o(Socket socket) {
            AbstractC9979u.m20294g(socket, "<set-?>");
            this.f25208c = socket;
        }

        /* renamed from: p */
        public final void m22119p(BufferedSource bufferedSource) {
            AbstractC9979u.m20294g(bufferedSource, "<set-?>");
            this.f25210e = bufferedSource;
        }

        /* renamed from: q */
        public final a m22120q(Socket socket, String peerName, BufferedSource source, BufferedSink sink) {
            String str;
            AbstractC9979u.m20294g(socket, "socket");
            AbstractC9979u.m20294g(peerName, "peerName");
            AbstractC9979u.m20294g(source, "source");
            AbstractC9979u.m20294g(sink, "sink");
            m22118o(socket);
            if (this.f25206a) {
                str = AbstractC9920d.f23249i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            m22116m(str);
            m22119p(source);
            m22117n(sink);
            return this;
        }
    }

    /* renamed from: okhttp3.internal.http2.b$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C11000g m22121a() {
            return C10501b.f25177F;
        }

        public b() {
        }
    }

    /* renamed from: okhttp3.internal.http2.b$c */
    public static abstract class c {

        /* renamed from: a */
        public static final b f25215a = new b(null);

        /* renamed from: b */
        public static final c f25216b = new a();

        /* renamed from: okhttp3.internal.http2.b$c$a */
        public static final class a extends c {
            @Override // okhttp3.internal.http2.C10501b.c
            /* renamed from: c */
            public void mo21993c(C10997d stream) {
                AbstractC9979u.m20294g(stream, "stream");
                stream.m24262d(ErrorCode.REFUSED_STREAM, null);
            }
        }

        /* renamed from: okhttp3.internal.http2.b$c$b */
        public static final class b {
            public /* synthetic */ b(AbstractC9972n abstractC9972n) {
                this();
            }

            public b() {
            }
        }

        /* renamed from: b */
        public void mo21992b(C10501b connection, C11000g settings) {
            AbstractC9979u.m20294g(connection, "connection");
            AbstractC9979u.m20294g(settings, "settings");
        }

        /* renamed from: c */
        public abstract void mo21993c(C10997d c10997d);
    }

    /* renamed from: okhttp3.internal.http2.b$d */
    public final class d implements C10502c.c, InterfaceC9529a {

        /* renamed from: c */
        public final C10502c f25217c;

        /* renamed from: d */
        public final /* synthetic */ C10501b f25218d;

        /* renamed from: okhttp3.internal.http2.b$d$a */
        public static final class a extends AbstractC10411a {

            /* renamed from: e */
            public final /* synthetic */ C10501b f25219e;

            /* renamed from: f */
            public final /* synthetic */ Ref$ObjectRef f25220f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, C10501b c10501b, Ref$ObjectRef ref$ObjectRef) {
                super(str, z10);
                this.f25219e = c10501b;
                this.f25220f = ref$ObjectRef;
            }

            @Override // ne.AbstractC10411a
            /* renamed from: f */
            public long mo21774f() {
                this.f25219e.m22071B().mo21992b(this.f25219e, (C11000g) this.f25220f.f23402c);
                return -1L;
            }
        }

        /* renamed from: okhttp3.internal.http2.b$d$b */
        public static final class b extends AbstractC10411a {

            /* renamed from: e */
            public final /* synthetic */ C10501b f25221e;

            /* renamed from: f */
            public final /* synthetic */ C10997d f25222f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, C10501b c10501b, C10997d c10997d) {
                super(str, z10);
                this.f25221e = c10501b;
                this.f25222f = c10997d;
            }

            @Override // ne.AbstractC10411a
            /* renamed from: f */
            public long mo21774f() {
                try {
                    this.f25221e.m22071B().mo21993c(this.f25222f);
                    return -1L;
                } catch (IOException e10) {
                    C11192j.f26882a.m24899g().m24892j("Http2Connection.Listener failure for " + this.f25221e.m22103z(), 4, e10);
                    try {
                        this.f25222f.m24262d(ErrorCode.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* renamed from: okhttp3.internal.http2.b$d$c */
        public static final class c extends AbstractC10411a {

            /* renamed from: e */
            public final /* synthetic */ C10501b f25223e;

            /* renamed from: f */
            public final /* synthetic */ int f25224f;

            /* renamed from: g */
            public final /* synthetic */ int f25225g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, C10501b c10501b, int i10, int i11) {
                super(str, z10);
                this.f25223e = c10501b;
                this.f25224f = i10;
                this.f25225g = i11;
            }

            @Override // ne.AbstractC10411a
            /* renamed from: f */
            public long mo21774f() throws IOException {
                this.f25223e.m22096b0(true, this.f25224f, this.f25225g);
                return -1L;
            }
        }

        /* renamed from: okhttp3.internal.http2.b$d$d, reason: collision with other inner class name */
        public static final class C12147d extends AbstractC10411a {

            /* renamed from: e */
            public final /* synthetic */ d f25226e;

            /* renamed from: f */
            public final /* synthetic */ boolean f25227f;

            /* renamed from: g */
            public final /* synthetic */ C11000g f25228g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12147d(String str, boolean z10, d dVar, boolean z11, C11000g c11000g) {
                super(str, z10);
                this.f25226e = dVar;
                this.f25227f = z11;
                this.f25228g = c11000g;
            }

            @Override // ne.AbstractC10411a
            /* renamed from: f */
            public long mo21774f() {
                this.f25226e.m22132k(this.f25227f, this.f25228g);
                return -1L;
            }
        }

        public d(C10501b c10501b, C10502c reader) {
            AbstractC9979u.m20294g(reader, "reader");
            this.f25218d = c10501b;
            this.f25217c = reader;
        }

        @Override // okhttp3.internal.http2.C10502c.c
        /* renamed from: a */
        public void mo22122a(boolean z10, int i10, int i11, List headerBlock) {
            AbstractC9979u.m20294g(headerBlock, "headerBlock");
            if (this.f25218d.m22086Q(i10)) {
                this.f25218d.m22083N(i10, headerBlock, z10);
                return;
            }
            C10501b c10501b = this.f25218d;
            synchronized (c10501b) {
                C10997d c10997dM22075F = c10501b.m22075F(i10);
                if (c10997dM22075F != null) {
                    C10786q c10786q = C10786q.f26013a;
                    c10997dM22075F.m24282x(AbstractC9920d.m20008P(headerBlock), z10);
                    return;
                }
                if (c10501b.f25188i) {
                    return;
                }
                if (i10 <= c10501b.m22070A()) {
                    return;
                }
                if (i10 % 2 == c10501b.m22072C() % 2) {
                    return;
                }
                C10997d c10997d = new C10997d(i10, c10501b, false, z10, AbstractC9920d.m20008P(headerBlock));
                c10501b.m22089T(i10);
                c10501b.m22076G().put(Integer.valueOf(i10), c10997d);
                c10501b.f25189j.m21801i().m21788i(new b(c10501b.m22103z() + '[' + i10 + "] onStream", true, c10501b, c10997d), 0L);
            }
        }

        @Override // okhttp3.internal.http2.C10502c.c
        /* renamed from: b */
        public void mo22123b(int i10, long j10) {
            if (i10 == 0) {
                C10501b c10501b = this.f25218d;
                synchronized (c10501b) {
                    c10501b.f25205z = c10501b.m22077H() + j10;
                    AbstractC9979u.m20292e(c10501b, "null cannot be cast to non-null type java.lang.Object");
                    c10501b.notifyAll();
                    C10786q c10786q = C10786q.f26013a;
                }
                return;
            }
            C10997d c10997dM22075F = this.f25218d.m22075F(i10);
            if (c10997dM22075F != null) {
                synchronized (c10997dM22075F) {
                    c10997dM22075F.m24259a(j10);
                    C10786q c10786q2 = C10786q.f26013a;
                }
            }
        }

        @Override // okhttp3.internal.http2.C10502c.c
        /* renamed from: c */
        public void mo22124c(int i10, int i11, List requestHeaders) throws Throwable {
            AbstractC9979u.m20294g(requestHeaders, "requestHeaders");
            this.f25218d.m22084O(i11, requestHeaders);
        }

        @Override // okhttp3.internal.http2.C10502c.c
        /* renamed from: d */
        public void mo22125d() {
        }

        @Override // okhttp3.internal.http2.C10502c.c
        /* renamed from: e */
        public void mo22126e(boolean z10, C11000g settings) {
            AbstractC9979u.m20294g(settings, "settings");
            this.f25218d.f25190k.m21788i(new C12147d(this.f25218d.m22103z() + " applyAndAckSettings", true, this, z10, settings), 0L);
        }

        @Override // okhttp3.internal.http2.C10502c.c
        /* renamed from: f */
        public void mo22127f(boolean z10, int i10, BufferedSource source, int i11) {
            AbstractC9979u.m20294g(source, "source");
            if (this.f25218d.m22086Q(i10)) {
                this.f25218d.m22082M(i10, source, i11, z10);
                return;
            }
            C10997d c10997dM22075F = this.f25218d.m22075F(i10);
            if (c10997dM22075F == null) {
                this.f25218d.m22098d0(i10, ErrorCode.PROTOCOL_ERROR);
                long j10 = i11;
                this.f25218d.m22093Y(j10);
                source.skip(j10);
                return;
            }
            c10997dM22075F.m24281w(source, i11);
            if (z10) {
                c10997dM22075F.m24282x(AbstractC9920d.f23242b, true);
            }
        }

        @Override // okhttp3.internal.http2.C10502c.c
        /* renamed from: g */
        public void mo22128g(boolean z10, int i10, int i11) {
            if (!z10) {
                this.f25218d.f25190k.m21788i(new c(this.f25218d.m22103z() + " ping", true, this.f25218d, i10, i11), 0L);
                return;
            }
            C10501b c10501b = this.f25218d;
            synchronized (c10501b) {
                try {
                    if (i10 == 1) {
                        c10501b.f25195p++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            c10501b.f25198s++;
                            AbstractC9979u.m20292e(c10501b, "null cannot be cast to non-null type java.lang.Object");
                            c10501b.notifyAll();
                        }
                        C10786q c10786q = C10786q.f26013a;
                    } else {
                        c10501b.f25197r++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.C10502c.c
        /* renamed from: h */
        public void mo22129h(int i10, int i11, int i12, boolean z10) {
        }

        @Override // okhttp3.internal.http2.C10502c.c
        /* renamed from: i */
        public void mo22130i(int i10, ErrorCode errorCode) {
            AbstractC9979u.m20294g(errorCode, "errorCode");
            if (this.f25218d.m22086Q(i10)) {
                this.f25218d.m22085P(i10, errorCode);
                return;
            }
            C10997d c10997dM22087R = this.f25218d.m22087R(i10);
            if (c10997dM22087R != null) {
                c10997dM22087R.m24283y(errorCode);
            }
        }

        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m22133l();
            return C10786q.f26013a;
        }

        @Override // okhttp3.internal.http2.C10502c.c
        /* renamed from: j */
        public void mo22131j(int i10, ErrorCode errorCode, ByteString debugData) {
            int i11;
            Object[] array;
            AbstractC9979u.m20294g(errorCode, "errorCode");
            AbstractC9979u.m20294g(debugData, "debugData");
            debugData.size();
            C10501b c10501b = this.f25218d;
            synchronized (c10501b) {
                array = c10501b.m22076G().values().toArray(new C10997d[0]);
                c10501b.f25188i = true;
                C10786q c10786q = C10786q.f26013a;
            }
            for (C10997d c10997d : (C10997d[]) array) {
                if (c10997d.m24268j() > i10 && c10997d.m24278t()) {
                    c10997d.m24283y(ErrorCode.REFUSED_STREAM);
                    this.f25218d.m22087R(c10997d.m24268j());
                }
            }
        }

        /* renamed from: k */
        public final void m22132k(boolean z10, C11000g settings) {
            long jM24308c;
            int i10;
            C10997d[] c10997dArr;
            AbstractC9979u.m20294g(settings, "settings");
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            C10503d c10503dM22078I = this.f25218d.m22078I();
            C10501b c10501b = this.f25218d;
            synchronized (c10503dM22078I) {
                synchronized (c10501b) {
                    try {
                        C11000g c11000gM22074E = c10501b.m22074E();
                        if (!z10) {
                            C11000g c11000g = new C11000g();
                            c11000g.m24312g(c11000gM22074E);
                            c11000g.m24312g(settings);
                            settings = c11000g;
                        }
                        ref$ObjectRef.f23402c = settings;
                        jM24308c = settings.m24308c() - c11000gM22074E.m24308c();
                        c10997dArr = (jM24308c == 0 || c10501b.m22076G().isEmpty()) ? null : (C10997d[]) c10501b.m22076G().values().toArray(new C10997d[0]);
                        c10501b.m22090U((C11000g) ref$ObjectRef.f23402c);
                        c10501b.f25192m.m21788i(new a(c10501b.m22103z() + " onSettings", true, c10501b, ref$ObjectRef), 0L);
                        C10786q c10786q = C10786q.f26013a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    c10501b.m22078I().m22157a((C11000g) ref$ObjectRef.f23402c);
                } catch (IOException e10) {
                    c10501b.m22101x(e10);
                }
                C10786q c10786q2 = C10786q.f26013a;
            }
            if (c10997dArr != null) {
                for (C10997d c10997d : c10997dArr) {
                    synchronized (c10997d) {
                        c10997d.m24259a(jM24308c);
                        C10786q c10786q3 = C10786q.f26013a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.c] */
        /* renamed from: l */
        public void m22133l() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f25217c.m22136g(this);
                    while (this.f25217c.m22135f(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        this.f25218d.m22100w(errorCode3, ErrorCode.CANCEL, null);
                        errorCode = errorCode3;
                    } catch (IOException e11) {
                        e10 = e11;
                        ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                        C10501b c10501b = this.f25218d;
                        c10501b.m22100w(errorCode4, errorCode4, e10);
                        errorCode = c10501b;
                        errorCode2 = this.f25217c;
                        AbstractC9920d.m20031m(errorCode2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f25218d.m22100w(errorCode, errorCode2, e10);
                    AbstractC9920d.m20031m(this.f25217c);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                this.f25218d.m22100w(errorCode, errorCode2, e10);
                AbstractC9920d.m20031m(this.f25217c);
                throw th;
            }
            errorCode2 = this.f25217c;
            AbstractC9920d.m20031m(errorCode2);
        }
    }

    /* renamed from: okhttp3.internal.http2.b$e */
    public static final class e extends AbstractC10411a {

        /* renamed from: e */
        public final /* synthetic */ C10501b f25229e;

        /* renamed from: f */
        public final /* synthetic */ int f25230f;

        /* renamed from: g */
        public final /* synthetic */ Buffer f25231g;

        /* renamed from: h */
        public final /* synthetic */ int f25232h;

        /* renamed from: i */
        public final /* synthetic */ boolean f25233i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z10, C10501b c10501b, int i10, Buffer buffer, int i11, boolean z11) {
            super(str, z10);
            this.f25229e = c10501b;
            this.f25230f = i10;
            this.f25231g = buffer;
            this.f25232h = i11;
            this.f25233i = z11;
        }

        @Override // ne.AbstractC10411a
        /* renamed from: f */
        public long mo21774f() {
            try {
                boolean zMo24305d = this.f25229e.f25193n.mo24305d(this.f25230f, this.f25231g, this.f25232h, this.f25233i);
                if (zMo24305d) {
                    this.f25229e.m22078I().m22167p(this.f25230f, ErrorCode.CANCEL);
                }
                if (!zMo24305d && !this.f25233i) {
                    return -1L;
                }
                synchronized (this.f25229e) {
                    this.f25229e.f25181D.remove(Integer.valueOf(this.f25230f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.b$f */
    public static final class f extends AbstractC10411a {

        /* renamed from: e */
        public final /* synthetic */ C10501b f25234e;

        /* renamed from: f */
        public final /* synthetic */ int f25235f;

        /* renamed from: g */
        public final /* synthetic */ List f25236g;

        /* renamed from: h */
        public final /* synthetic */ boolean f25237h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z10, C10501b c10501b, int i10, List list, boolean z11) {
            super(str, z10);
            this.f25234e = c10501b;
            this.f25235f = i10;
            this.f25236g = list;
            this.f25237h = z11;
        }

        @Override // ne.AbstractC10411a
        /* renamed from: f */
        public long mo21774f() {
            boolean zMo24304c = this.f25234e.f25193n.mo24304c(this.f25235f, this.f25236g, this.f25237h);
            if (zMo24304c) {
                try {
                    this.f25234e.m22078I().m22167p(this.f25235f, ErrorCode.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zMo24304c && !this.f25237h) {
                return -1L;
            }
            synchronized (this.f25234e) {
                this.f25234e.f25181D.remove(Integer.valueOf(this.f25235f));
            }
            return -1L;
        }
    }

    /* renamed from: okhttp3.internal.http2.b$g */
    public static final class g extends AbstractC10411a {

        /* renamed from: e */
        public final /* synthetic */ C10501b f25238e;

        /* renamed from: f */
        public final /* synthetic */ int f25239f;

        /* renamed from: g */
        public final /* synthetic */ List f25240g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z10, C10501b c10501b, int i10, List list) {
            super(str, z10);
            this.f25238e = c10501b;
            this.f25239f = i10;
            this.f25240g = list;
        }

        @Override // ne.AbstractC10411a
        /* renamed from: f */
        public long mo21774f() {
            if (!this.f25238e.f25193n.mo24303b(this.f25239f, this.f25240g)) {
                return -1L;
            }
            try {
                this.f25238e.m22078I().m22167p(this.f25239f, ErrorCode.CANCEL);
                synchronized (this.f25238e) {
                    this.f25238e.f25181D.remove(Integer.valueOf(this.f25239f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.b$h */
    public static final class h extends AbstractC10411a {

        /* renamed from: e */
        public final /* synthetic */ C10501b f25241e;

        /* renamed from: f */
        public final /* synthetic */ int f25242f;

        /* renamed from: g */
        public final /* synthetic */ ErrorCode f25243g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, C10501b c10501b, int i10, ErrorCode errorCode) {
            super(str, z10);
            this.f25241e = c10501b;
            this.f25242f = i10;
            this.f25243g = errorCode;
        }

        @Override // ne.AbstractC10411a
        /* renamed from: f */
        public long mo21774f() {
            this.f25241e.f25193n.mo24302a(this.f25242f, this.f25243g);
            synchronized (this.f25241e) {
                this.f25241e.f25181D.remove(Integer.valueOf(this.f25242f));
                C10786q c10786q = C10786q.f26013a;
            }
            return -1L;
        }
    }

    /* renamed from: okhttp3.internal.http2.b$i */
    public static final class i extends AbstractC10411a {

        /* renamed from: e */
        public final /* synthetic */ C10501b f25244e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z10, C10501b c10501b) {
            super(str, z10);
            this.f25244e = c10501b;
        }

        @Override // ne.AbstractC10411a
        /* renamed from: f */
        public long mo21774f() throws IOException {
            this.f25244e.m22096b0(false, 2, 0);
            return -1L;
        }
    }

    /* renamed from: okhttp3.internal.http2.b$j */
    public static final class j extends AbstractC10411a {

        /* renamed from: e */
        public final /* synthetic */ C10501b f25245e;

        /* renamed from: f */
        public final /* synthetic */ long f25246f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, C10501b c10501b, long j10) {
            super(str, false, 2, null);
            this.f25245e = c10501b;
            this.f25246f = j10;
        }

        @Override // ne.AbstractC10411a
        /* renamed from: f */
        public long mo21774f() throws IOException {
            boolean z10;
            synchronized (this.f25245e) {
                if (this.f25245e.f25195p < this.f25245e.f25194o) {
                    z10 = true;
                } else {
                    this.f25245e.f25194o++;
                    z10 = false;
                }
            }
            if (z10) {
                this.f25245e.m22101x(null);
                return -1L;
            }
            this.f25245e.m22096b0(false, 1, 0);
            return this.f25246f;
        }
    }

    /* renamed from: okhttp3.internal.http2.b$k */
    public static final class k extends AbstractC10411a {

        /* renamed from: e */
        public final /* synthetic */ C10501b f25247e;

        /* renamed from: f */
        public final /* synthetic */ int f25248f;

        /* renamed from: g */
        public final /* synthetic */ ErrorCode f25249g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z10, C10501b c10501b, int i10, ErrorCode errorCode) {
            super(str, z10);
            this.f25247e = c10501b;
            this.f25248f = i10;
            this.f25249g = errorCode;
        }

        @Override // ne.AbstractC10411a
        /* renamed from: f */
        public long mo21774f() throws IOException {
            try {
                this.f25247e.m22097c0(this.f25248f, this.f25249g);
                return -1L;
            } catch (IOException e10) {
                this.f25247e.m22101x(e10);
                return -1L;
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.b$l */
    public static final class l extends AbstractC10411a {

        /* renamed from: e */
        public final /* synthetic */ C10501b f25250e;

        /* renamed from: f */
        public final /* synthetic */ int f25251f;

        /* renamed from: g */
        public final /* synthetic */ long f25252g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z10, C10501b c10501b, int i10, long j10) {
            super(str, z10);
            this.f25250e = c10501b;
            this.f25251f = i10;
            this.f25252g = j10;
        }

        @Override // ne.AbstractC10411a
        /* renamed from: f */
        public long mo21774f() throws IOException {
            try {
                this.f25250e.m22078I().m22169s(this.f25251f, this.f25252g);
                return -1L;
            } catch (IOException e10) {
                this.f25250e.m22101x(e10);
                return -1L;
            }
        }
    }

    static {
        C11000g c11000g = new C11000g();
        c11000g.m24313h(7, 65535);
        c11000g.m24313h(5, 16384);
        f25177F = c11000g;
    }

    public C10501b(a builder) {
        AbstractC9979u.m20294g(builder, "builder");
        boolean zM22105b = builder.m22105b();
        this.f25182c = zM22105b;
        this.f25183d = builder.m22107d();
        this.f25184e = new LinkedHashMap();
        String strM22106c = builder.m22106c();
        this.f25185f = strM22106c;
        this.f25187h = builder.m22105b() ? 3 : 2;
        C10415e c10415eM22113j = builder.m22113j();
        this.f25189j = c10415eM22113j;
        C10414d c10414dM21801i = c10415eM22113j.m21801i();
        this.f25190k = c10414dM21801i;
        this.f25191l = c10415eM22113j.m21801i();
        this.f25192m = c10415eM22113j.m21801i();
        this.f25193n = builder.m22109f();
        C11000g c11000g = new C11000g();
        if (builder.m22105b()) {
            c11000g.m24313h(7, 16777216);
        }
        this.f25200u = c11000g;
        this.f25201v = f25177F;
        this.f25205z = r2.m24308c();
        this.f25178A = builder.m22111h();
        this.f25179B = new C10503d(builder.m22110g(), zM22105b);
        this.f25180C = new d(this, new C10502c(builder.m22112i(), zM22105b));
        this.f25181D = new LinkedHashSet();
        if (builder.m22108e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.m22108e());
            c10414dM21801i.m21788i(new j(strM22106c + " ping", this, nanos), nanos);
        }
    }

    /* renamed from: X */
    public static /* synthetic */ void m22051X(C10501b c10501b, boolean z10, C10415e c10415e, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            c10415e = C10415e.f24784i;
        }
        c10501b.m22092W(z10, c10415e);
    }

    /* renamed from: A */
    public final int m22070A() {
        return this.f25186g;
    }

    /* renamed from: B */
    public final c m22071B() {
        return this.f25183d;
    }

    /* renamed from: C */
    public final int m22072C() {
        return this.f25187h;
    }

    /* renamed from: D */
    public final C11000g m22073D() {
        return this.f25200u;
    }

    /* renamed from: E */
    public final C11000g m22074E() {
        return this.f25201v;
    }

    /* renamed from: F */
    public final synchronized C10997d m22075F(int i10) {
        return (C10997d) this.f25184e.get(Integer.valueOf(i10));
    }

    /* renamed from: G */
    public final Map m22076G() {
        return this.f25184e;
    }

    /* renamed from: H */
    public final long m22077H() {
        return this.f25205z;
    }

    /* renamed from: I */
    public final C10503d m22078I() {
        return this.f25179B;
    }

    /* renamed from: J */
    public final synchronized boolean m22079J(long j10) {
        if (this.f25188i) {
            return false;
        }
        if (this.f25197r < this.f25196q) {
            if (j10 >= this.f25199t) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: K */
    public final C10997d m22080K(int i10, List list, boolean z10) throws Throwable {
        Throwable th;
        boolean z11 = !z10;
        synchronized (this.f25179B) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f25187h > 1073741823) {
                                try {
                                    m22091V(ErrorCode.REFUSED_STREAM);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            try {
                                if (this.f25188i) {
                                    throw new ConnectionShutdownException();
                                }
                                int i11 = this.f25187h;
                                this.f25187h = i11 + 2;
                                C10997d c10997d = new C10997d(i11, this, z11, false, null);
                                boolean z12 = !z10 || this.f25204y >= this.f25205z || c10997d.m24276r() >= c10997d.m24275q();
                                if (c10997d.m24279u()) {
                                    this.f25184e.put(Integer.valueOf(i11), c10997d);
                                }
                                C10786q c10786q = C10786q.f26013a;
                                if (i10 == 0) {
                                    this.f25179B.m22163k(z11, i11, list);
                                } else {
                                    if (this.f25182c) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.f25179B.m22166n(i10, i11, list);
                                }
                                if (z12) {
                                    this.f25179B.flush();
                                }
                                return c10997d;
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

    /* renamed from: L */
    public final C10997d m22081L(List requestHeaders, boolean z10) {
        AbstractC9979u.m20294g(requestHeaders, "requestHeaders");
        return m22080K(0, requestHeaders, z10);
    }

    /* renamed from: M */
    public final void m22082M(int i10, BufferedSource source, int i11, boolean z10) {
        AbstractC9979u.m20294g(source, "source");
        Buffer buffer = new Buffer();
        long j10 = i11;
        source.require(j10);
        source.read(buffer, j10);
        this.f25191l.m21788i(new e(this.f25185f + '[' + i10 + "] onData", true, this, i10, buffer, i11, z10), 0L);
    }

    /* renamed from: N */
    public final void m22083N(int i10, List requestHeaders, boolean z10) {
        AbstractC9979u.m20294g(requestHeaders, "requestHeaders");
        this.f25191l.m21788i(new f(this.f25185f + '[' + i10 + "] onHeaders", true, this, i10, requestHeaders, z10), 0L);
    }

    /* renamed from: O */
    public final void m22084O(int i10, List requestHeaders) throws Throwable {
        Throwable th;
        AbstractC9979u.m20294g(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (this.f25181D.contains(Integer.valueOf(i10))) {
                    try {
                        m22098d0(i10, ErrorCode.PROTOCOL_ERROR);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f25181D.add(Integer.valueOf(i10));
                this.f25191l.m21788i(new g(this.f25185f + '[' + i10 + "] onRequest", true, this, i10, requestHeaders), 0L);
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* renamed from: P */
    public final void m22085P(int i10, ErrorCode errorCode) {
        AbstractC9979u.m20294g(errorCode, "errorCode");
        this.f25191l.m21788i(new h(this.f25185f + '[' + i10 + "] onReset", true, this, i10, errorCode), 0L);
    }

    /* renamed from: Q */
    public final boolean m22086Q(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    /* renamed from: R */
    public final synchronized C10997d m22087R(int i10) {
        C10997d c10997d;
        c10997d = (C10997d) this.f25184e.remove(Integer.valueOf(i10));
        AbstractC9979u.m20292e(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return c10997d;
    }

    /* renamed from: S */
    public final void m22088S() {
        synchronized (this) {
            long j10 = this.f25197r;
            long j11 = this.f25196q;
            if (j10 < j11) {
                return;
            }
            this.f25196q = j11 + 1;
            this.f25199t = System.nanoTime() + 1000000000;
            C10786q c10786q = C10786q.f26013a;
            this.f25190k.m21788i(new i(this.f25185f + " ping", true, this), 0L);
        }
    }

    /* renamed from: T */
    public final void m22089T(int i10) {
        this.f25186g = i10;
    }

    /* renamed from: U */
    public final void m22090U(C11000g c11000g) {
        AbstractC9979u.m20294g(c11000g, "<set-?>");
        this.f25201v = c11000g;
    }

    /* renamed from: V */
    public final void m22091V(ErrorCode statusCode) {
        AbstractC9979u.m20294g(statusCode, "statusCode");
        synchronized (this.f25179B) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            synchronized (this) {
                if (this.f25188i) {
                    return;
                }
                this.f25188i = true;
                int i10 = this.f25186g;
                ref$IntRef.f23400c = i10;
                C10786q c10786q = C10786q.f26013a;
                this.f25179B.m22162j(i10, statusCode, AbstractC9920d.f23241a);
            }
        }
    }

    /* renamed from: W */
    public final void m22092W(boolean z10, C10415e taskRunner) {
        AbstractC9979u.m20294g(taskRunner, "taskRunner");
        if (z10) {
            this.f25179B.m22158e();
            this.f25179B.m22168r(this.f25200u);
            if (this.f25200u.m24308c() != 65535) {
                this.f25179B.m22169s(0, r5 - 65535);
            }
        }
        taskRunner.m21801i().m21788i(new C10413c(this.f25185f, true, this.f25180C), 0L);
    }

    /* renamed from: Y */
    public final synchronized void m22093Y(long j10) {
        long j11 = this.f25202w + j10;
        this.f25202w = j11;
        long j12 = j11 - this.f25203x;
        if (j12 >= this.f25200u.m24308c() / 2) {
            m22099e0(0, j12);
            this.f25203x += j12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f25179B.m22164l());
        r6 = r2;
        r8.f25204y += r6;
        r4 = p309qc.C10786q.f26013a;
     */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m22094Z(int r9, boolean r10, okio.Buffer r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.d r12 = r8.f25179B
            r12.m22159f(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.f25204y     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r6 = r8.f25205z     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.Map r2 = r8.f25184e     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            if (r2 == 0) goto L31
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.AbstractC9979u.m20292e(r8, r2)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
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
            okhttp3.internal.http2.d r4 = r8.f25179B     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.m22164l()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.f25204y     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.f25204y = r4     // Catch: java.lang.Throwable -> L2f
            qc.q r4 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.d r4 = r8.f25179B
            if (r10 == 0) goto L5d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = r3
        L5e:
            r4.m22159f(r5, r9, r11, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C10501b.m22094Z(int, boolean, okio.Buffer, long):void");
    }

    /* renamed from: a0 */
    public final void m22095a0(int i10, boolean z10, List alternating) {
        AbstractC9979u.m20294g(alternating, "alternating");
        this.f25179B.m22163k(z10, i10, alternating);
    }

    /* renamed from: b0 */
    public final void m22096b0(boolean z10, int i10, int i11) throws IOException {
        try {
            this.f25179B.m22165m(z10, i10, i11);
        } catch (IOException e10) {
            m22101x(e10);
        }
    }

    /* renamed from: c0 */
    public final void m22097c0(int i10, ErrorCode statusCode) {
        AbstractC9979u.m20294g(statusCode, "statusCode");
        this.f25179B.m22167p(i10, statusCode);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m22100w(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    /* renamed from: d0 */
    public final void m22098d0(int i10, ErrorCode errorCode) {
        AbstractC9979u.m20294g(errorCode, "errorCode");
        this.f25190k.m21788i(new k(this.f25185f + '[' + i10 + "] writeSynReset", true, this, i10, errorCode), 0L);
    }

    /* renamed from: e0 */
    public final void m22099e0(int i10, long j10) {
        this.f25190k.m21788i(new l(this.f25185f + '[' + i10 + "] windowUpdate", true, this, i10, j10), 0L);
    }

    public final void flush() {
        this.f25179B.flush();
    }

    /* renamed from: w */
    public final void m22100w(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) throws IOException {
        int i10;
        Object[] array;
        AbstractC9979u.m20294g(connectionCode, "connectionCode");
        AbstractC9979u.m20294g(streamCode, "streamCode");
        if (AbstractC9920d.f23248h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            m22091V(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f25184e.isEmpty()) {
                    array = null;
                } else {
                    array = this.f25184e.values().toArray(new C10997d[0]);
                    this.f25184e.clear();
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C10997d[] c10997dArr = (C10997d[]) array;
        if (c10997dArr != null) {
            for (C10997d c10997d : c10997dArr) {
                try {
                    c10997d.m24262d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f25179B.close();
        } catch (IOException unused3) {
        }
        try {
            this.f25178A.close();
        } catch (IOException unused4) {
        }
        this.f25190k.m21792n();
        this.f25191l.m21792n();
        this.f25192m.m21792n();
    }

    /* renamed from: x */
    public final void m22101x(IOException iOException) throws IOException {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        m22100w(errorCode, errorCode, iOException);
    }

    /* renamed from: y */
    public final boolean m22102y() {
        return this.f25182c;
    }

    /* renamed from: z */
    public final String m22103z() {
        return this.f25185f;
    }
}
