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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.InstantKt;
import okhttp3.internal.http2.C9245c;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import p182m8.AbstractC9045d;
import p216p8.AbstractC9338a;
import p216p8.C9340c;
import p216p8.C9341d;
import p216p8.C9342e;
import p256t8.C9639d;
import p256t8.C9642g;
import p256t8.InterfaceC9641f;
import p266u8.C9734j;

/* renamed from: okhttp3.internal.http2.b */
/* loaded from: classes5.dex */
public final class C9244b implements Closeable {

    /* renamed from: C */
    public static final b f15879C = new b(null);

    /* renamed from: D */
    public static final C9642g f15880D;

    /* renamed from: A */
    public final d f15881A;

    /* renamed from: B */
    public final Set f15882B;

    /* renamed from: a */
    public final boolean f15883a;

    /* renamed from: b */
    public final c f15884b;

    /* renamed from: c */
    public final Map f15885c;

    /* renamed from: d */
    public final String f15886d;

    /* renamed from: e */
    public int f15887e;

    /* renamed from: f */
    public int f15888f;

    /* renamed from: g */
    public boolean f15889g;

    /* renamed from: h */
    public final C9342e f15890h;

    /* renamed from: i */
    public final C9341d f15891i;

    /* renamed from: j */
    public final C9341d f15892j;

    /* renamed from: k */
    public final C9341d f15893k;

    /* renamed from: l */
    public final InterfaceC9641f f15894l;

    /* renamed from: m */
    public long f15895m;

    /* renamed from: n */
    public long f15896n;

    /* renamed from: o */
    public long f15897o;

    /* renamed from: p */
    public long f15898p;

    /* renamed from: q */
    public long f15899q;

    /* renamed from: r */
    public long f15900r;

    /* renamed from: s */
    public final C9642g f15901s;

    /* renamed from: t */
    public C9642g f15902t;

    /* renamed from: u */
    public long f15903u;

    /* renamed from: v */
    public long f15904v;

    /* renamed from: w */
    public long f15905w;

    /* renamed from: x */
    public long f15906x;

    /* renamed from: y */
    public final Socket f15907y;

    /* renamed from: z */
    public final C9246d f15908z;

    /* renamed from: okhttp3.internal.http2.b$a */
    public static final class a {

        /* renamed from: a */
        public boolean f15909a;

        /* renamed from: b */
        public final C9342e f15910b;

        /* renamed from: c */
        public Socket f15911c;

        /* renamed from: d */
        public String f15912d;

        /* renamed from: e */
        public BufferedSource f15913e;

        /* renamed from: f */
        public BufferedSink f15914f;

        /* renamed from: g */
        public c f15915g;

        /* renamed from: h */
        public InterfaceC9641f f15916h;

        /* renamed from: i */
        public int f15917i;

        public a(boolean z9, C9342e taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f15909a = z9;
            this.f15910b = taskRunner;
            this.f15915g = c.f15919b;
            this.f15916h = InterfaceC9641f.f16979b;
        }

        /* renamed from: a */
        public final C9244b m14978a() {
            return new C9244b(this);
        }

        /* renamed from: b */
        public final boolean m14979b() {
            return this.f15909a;
        }

        /* renamed from: c */
        public final String m14980c() {
            String str = this.f15912d;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }

        /* renamed from: d */
        public final c m14981d() {
            return this.f15915g;
        }

        /* renamed from: e */
        public final int m14982e() {
            return this.f15917i;
        }

        /* renamed from: f */
        public final InterfaceC9641f m14983f() {
            return this.f15916h;
        }

        /* renamed from: g */
        public final BufferedSink m14984g() {
            BufferedSink bufferedSink = this.f15914f;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        /* renamed from: h */
        public final Socket m14985h() {
            Socket socket = this.f15911c;
            if (socket != null) {
                return socket;
            }
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        /* renamed from: i */
        public final BufferedSource m14986i() {
            BufferedSource bufferedSource = this.f15913e;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            Intrinsics.throwUninitializedPropertyAccessException("source");
            return null;
        }

        /* renamed from: j */
        public final C9342e m14987j() {
            return this.f15910b;
        }

        /* renamed from: k */
        public final a m14988k(c listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f15915g = listener;
            return this;
        }

        /* renamed from: l */
        public final a m14989l(int i9) {
            this.f15917i = i9;
            return this;
        }

        /* renamed from: m */
        public final void m14990m(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f15912d = str;
        }

        /* renamed from: n */
        public final void m14991n(BufferedSink bufferedSink) {
            Intrinsics.checkNotNullParameter(bufferedSink, "<set-?>");
            this.f15914f = bufferedSink;
        }

        /* renamed from: o */
        public final void m14992o(Socket socket) {
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.f15911c = socket;
        }

        /* renamed from: p */
        public final void m14993p(BufferedSource bufferedSource) {
            Intrinsics.checkNotNullParameter(bufferedSource, "<set-?>");
            this.f15913e = bufferedSource;
        }

        /* renamed from: q */
        public final a m14994q(Socket socket, String peerName, BufferedSource source, BufferedSink sink) {
            String str;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            m14992o(socket);
            if (this.f15909a) {
                str = AbstractC9045d.f15232i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            m14990m(str);
            m14993p(source);
            m14991n(sink);
            return this;
        }
    }

    /* renamed from: okhttp3.internal.http2.b$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9642g m14995a() {
            return C9244b.f15880D;
        }

        public b() {
        }
    }

    /* renamed from: okhttp3.internal.http2.b$c */
    public static abstract class c {

        /* renamed from: a */
        public static final b f15918a = new b(null);

        /* renamed from: b */
        public static final c f15919b = new a();

        /* renamed from: okhttp3.internal.http2.b$c$a */
        public static final class a extends c {
            @Override // okhttp3.internal.http2.C9244b.c
            /* renamed from: b */
            public void mo14866b(C9639d stream) {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.m15927d(ErrorCode.REFUSED_STREAM, null);
            }
        }

        /* renamed from: okhttp3.internal.http2.b$c$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public b() {
            }
        }

        /* renamed from: a */
        public void mo14865a(C9244b connection, C9642g settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        /* renamed from: b */
        public abstract void mo14866b(C9639d c9639d);
    }

    /* renamed from: okhttp3.internal.http2.b$d */
    public final class d implements C9245c.c, Function0 {

        /* renamed from: a */
        public final C9245c f15920a;

        /* renamed from: b */
        public final /* synthetic */ C9244b f15921b;

        /* renamed from: okhttp3.internal.http2.b$d$a */
        public static final class a extends AbstractC9338a {

            /* renamed from: e */
            public final /* synthetic */ C9244b f15922e;

            /* renamed from: f */
            public final /* synthetic */ Ref.ObjectRef f15923f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z9, C9244b c9244b, Ref.ObjectRef objectRef) {
                super(str, z9);
                this.f15922e = c9244b;
                this.f15923f = objectRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p216p8.AbstractC9338a
            /* renamed from: f */
            public long mo15008f() {
                this.f15922e.m14945B().mo14865a(this.f15922e, (C9642g) this.f15923f.element);
                return -1L;
            }
        }

        /* renamed from: okhttp3.internal.http2.b$d$b */
        public static final class b extends AbstractC9338a {

            /* renamed from: e */
            public final /* synthetic */ C9244b f15924e;

            /* renamed from: f */
            public final /* synthetic */ C9639d f15925f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z9, C9244b c9244b, C9639d c9639d) {
                super(str, z9);
                this.f15924e = c9244b;
                this.f15925f = c9639d;
            }

            @Override // p216p8.AbstractC9338a
            /* renamed from: f */
            public long mo15008f() {
                try {
                    this.f15924e.m14945B().mo14866b(this.f15925f);
                    return -1L;
                } catch (IOException e10) {
                    C9734j.f17200a.m16271g().m16264j("Http2Connection.Listener failure for " + this.f15924e.m14977z(), 4, e10);
                    try {
                        this.f15925f.m15927d(ErrorCode.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* renamed from: okhttp3.internal.http2.b$d$c */
        public static final class c extends AbstractC9338a {

            /* renamed from: e */
            public final /* synthetic */ C9244b f15926e;

            /* renamed from: f */
            public final /* synthetic */ int f15927f;

            /* renamed from: g */
            public final /* synthetic */ int f15928g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z9, C9244b c9244b, int i9, int i10) {
                super(str, z9);
                this.f15926e = c9244b;
                this.f15927f = i9;
                this.f15928g = i10;
            }

            @Override // p216p8.AbstractC9338a
            /* renamed from: f */
            public long mo15008f() throws IOException {
                this.f15926e.m14970b0(true, this.f15927f, this.f15928g);
                return -1L;
            }
        }

        /* renamed from: okhttp3.internal.http2.b$d$d, reason: collision with other inner class name */
        public static final class C10084d extends AbstractC9338a {

            /* renamed from: e */
            public final /* synthetic */ d f15929e;

            /* renamed from: f */
            public final /* synthetic */ boolean f15930f;

            /* renamed from: g */
            public final /* synthetic */ C9642g f15931g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10084d(String str, boolean z9, d dVar, boolean z10, C9642g c9642g) {
                super(str, z9);
                this.f15929e = dVar;
                this.f15930f = z10;
                this.f15931g = c9642g;
            }

            @Override // p216p8.AbstractC9338a
            /* renamed from: f */
            public long mo15008f() {
                this.f15929e.m15006k(this.f15930f, this.f15931g);
                return -1L;
            }
        }

        public d(C9244b c9244b, C9245c reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f15921b = c9244b;
            this.f15920a = reader;
        }

        @Override // okhttp3.internal.http2.C9245c.c
        /* renamed from: a */
        public void mo14996a(boolean z9, int i9, int i10, List headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f15921b.m14960Q(i9)) {
                this.f15921b.m14957N(i9, headerBlock, z9);
                return;
            }
            C9244b c9244b = this.f15921b;
            synchronized (c9244b) {
                C9639d c9639dM14949F = c9244b.m14949F(i9);
                if (c9639dM14949F != null) {
                    Unit unit = Unit.INSTANCE;
                    c9639dM14949F.m15947x(AbstractC9045d.m14474P(headerBlock), z9);
                    return;
                }
                if (c9244b.f15889g) {
                    return;
                }
                if (i9 <= c9244b.m14944A()) {
                    return;
                }
                if (i9 % 2 == c9244b.m14946C() % 2) {
                    return;
                }
                C9639d c9639d = new C9639d(i9, c9244b, false, z9, AbstractC9045d.m14474P(headerBlock));
                c9244b.m14963T(i9);
                c9244b.m14950G().put(Integer.valueOf(i9), c9639d);
                c9244b.f15890h.m15279i().m15266i(new b(c9244b.m14977z() + '[' + i9 + "] onStream", true, c9244b, c9639d), 0L);
            }
        }

        @Override // okhttp3.internal.http2.C9245c.c
        /* renamed from: b */
        public void mo14997b(int i9, long j9) {
            if (i9 == 0) {
                C9244b c9244b = this.f15921b;
                synchronized (c9244b) {
                    c9244b.f15906x = c9244b.m14951H() + j9;
                    Intrinsics.checkNotNull(c9244b, "null cannot be cast to non-null type java.lang.Object");
                    c9244b.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            C9639d c9639dM14949F = this.f15921b.m14949F(i9);
            if (c9639dM14949F != null) {
                synchronized (c9639dM14949F) {
                    c9639dM14949F.m15924a(j9);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }

        @Override // okhttp3.internal.http2.C9245c.c
        /* renamed from: c */
        public void mo14998c(boolean z9, C9642g settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f15921b.f15891i.m15266i(new C10084d(this.f15921b.m14977z() + " applyAndAckSettings", true, this, z9, settings), 0L);
        }

        @Override // okhttp3.internal.http2.C9245c.c
        /* renamed from: d */
        public void mo14999d(int i9, int i10, List requestHeaders) throws Throwable {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.f15921b.m14958O(i10, requestHeaders);
        }

        @Override // okhttp3.internal.http2.C9245c.c
        /* renamed from: e */
        public void mo15000e() {
        }

        @Override // okhttp3.internal.http2.C9245c.c
        /* renamed from: f */
        public void mo15001f(boolean z9, int i9, BufferedSource source, int i10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f15921b.m14960Q(i9)) {
                this.f15921b.m14956M(i9, source, i10, z9);
                return;
            }
            C9639d c9639dM14949F = this.f15921b.m14949F(i9);
            if (c9639dM14949F == null) {
                this.f15921b.m14972d0(i9, ErrorCode.PROTOCOL_ERROR);
                long j9 = i10;
                this.f15921b.m14967Y(j9);
                source.skip(j9);
                return;
            }
            c9639dM14949F.m15946w(source, i10);
            if (z9) {
                c9639dM14949F.m15947x(AbstractC9045d.f15225b, true);
            }
        }

        @Override // okhttp3.internal.http2.C9245c.c
        /* renamed from: g */
        public void mo15002g(boolean z9, int i9, int i10) {
            if (!z9) {
                this.f15921b.f15891i.m15266i(new c(this.f15921b.m14977z() + " ping", true, this.f15921b, i9, i10), 0L);
                return;
            }
            C9244b c9244b = this.f15921b;
            synchronized (c9244b) {
                try {
                    if (i9 == 1) {
                        c9244b.f15896n++;
                    } else if (i9 != 2) {
                        if (i9 == 3) {
                            c9244b.f15899q++;
                            Intrinsics.checkNotNull(c9244b, "null cannot be cast to non-null type java.lang.Object");
                            c9244b.notifyAll();
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        c9244b.f15898p++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.C9245c.c
        /* renamed from: h */
        public void mo15003h(int i9, int i10, int i11, boolean z9) {
        }

        @Override // okhttp3.internal.http2.C9245c.c
        /* renamed from: i */
        public void mo15004i(int i9, ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.f15921b.m14960Q(i9)) {
                this.f15921b.m14959P(i9, errorCode);
                return;
            }
            C9639d c9639dM14961R = this.f15921b.m14961R(i9);
            if (c9639dM14961R != null) {
                c9639dM14961R.m15948y(errorCode);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m15007l();
            return Unit.INSTANCE;
        }

        @Override // okhttp3.internal.http2.C9245c.c
        /* renamed from: j */
        public void mo15005j(int i9, ErrorCode errorCode, ByteString debugData) {
            int i10;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.size();
            C9244b c9244b = this.f15921b;
            synchronized (c9244b) {
                array = c9244b.m14950G().values().toArray(new C9639d[0]);
                c9244b.f15889g = true;
                Unit unit = Unit.INSTANCE;
            }
            for (C9639d c9639d : (C9639d[]) array) {
                if (c9639d.m15933j() > i9 && c9639d.m15943t()) {
                    c9639d.m15948y(ErrorCode.REFUSED_STREAM);
                    this.f15921b.m14961R(c9639d.m15933j());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, t8.g] */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* renamed from: k */
        public final void m15006k(boolean z9, C9642g settings) {
            ?? r13;
            long jM15973c;
            int i9;
            C9639d[] c9639dArr;
            Intrinsics.checkNotNullParameter(settings, "settings");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            C9246d c9246dM14952I = this.f15921b.m14952I();
            C9244b c9244b = this.f15921b;
            synchronized (c9246dM14952I) {
                synchronized (c9244b) {
                    try {
                        C9642g c9642gM14948E = c9244b.m14948E();
                        if (z9) {
                            r13 = settings;
                        } else {
                            C9642g c9642g = new C9642g();
                            c9642g.m15977g(c9642gM14948E);
                            c9642g.m15977g(settings);
                            r13 = c9642g;
                        }
                        objectRef.element = r13;
                        jM15973c = r13.m15973c() - c9642gM14948E.m15973c();
                        c9639dArr = (jM15973c == 0 || c9244b.m14950G().isEmpty()) ? null : (C9639d[]) c9244b.m14950G().values().toArray(new C9639d[0]);
                        c9244b.m14964U((C9642g) objectRef.element);
                        c9244b.f15893k.m15266i(new a(c9244b.m14977z() + " onSettings", true, c9244b, objectRef), 0L);
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    c9244b.m14952I().m15032a((C9642g) objectRef.element);
                } catch (IOException e10) {
                    c9244b.m14975x(e10);
                }
                Unit unit2 = Unit.INSTANCE;
            }
            if (c9639dArr != null) {
                for (C9639d c9639d : c9639dArr) {
                    synchronized (c9639d) {
                        c9639d.m15924a(jM15973c);
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.c] */
        /* renamed from: l */
        public void m15007l() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f15920a.m15011g(this);
                    while (this.f15920a.m15010c(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        this.f15921b.m14974w(errorCode3, ErrorCode.CANCEL, null);
                        errorCode = errorCode3;
                    } catch (IOException e11) {
                        e10 = e11;
                        ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                        C9244b c9244b = this.f15921b;
                        c9244b.m14974w(errorCode4, errorCode4, e10);
                        errorCode = c9244b;
                        errorCode2 = this.f15920a;
                        AbstractC9045d.m14497m(errorCode2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f15921b.m14974w(errorCode, errorCode2, e10);
                    AbstractC9045d.m14497m(this.f15920a);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                this.f15921b.m14974w(errorCode, errorCode2, e10);
                AbstractC9045d.m14497m(this.f15920a);
                throw th;
            }
            errorCode2 = this.f15920a;
            AbstractC9045d.m14497m(errorCode2);
        }
    }

    /* renamed from: okhttp3.internal.http2.b$e */
    public static final class e extends AbstractC9338a {

        /* renamed from: e */
        public final /* synthetic */ C9244b f15932e;

        /* renamed from: f */
        public final /* synthetic */ int f15933f;

        /* renamed from: g */
        public final /* synthetic */ Buffer f15934g;

        /* renamed from: h */
        public final /* synthetic */ int f15935h;

        /* renamed from: i */
        public final /* synthetic */ boolean f15936i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z9, C9244b c9244b, int i9, Buffer buffer, int i10, boolean z10) {
            super(str, z9);
            this.f15932e = c9244b;
            this.f15933f = i9;
            this.f15934g = buffer;
            this.f15935h = i10;
            this.f15936i = z10;
        }

        @Override // p216p8.AbstractC9338a
        /* renamed from: f */
        public long mo15008f() {
            try {
                boolean zMo15970d = this.f15932e.f15894l.mo15970d(this.f15933f, this.f15934g, this.f15935h, this.f15936i);
                if (zMo15970d) {
                    this.f15932e.m14952I().m15042o(this.f15933f, ErrorCode.CANCEL);
                }
                if (!zMo15970d && !this.f15936i) {
                    return -1L;
                }
                synchronized (this.f15932e) {
                    this.f15932e.f15882B.remove(Integer.valueOf(this.f15933f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.b$f */
    public static final class f extends AbstractC9338a {

        /* renamed from: e */
        public final /* synthetic */ C9244b f15937e;

        /* renamed from: f */
        public final /* synthetic */ int f15938f;

        /* renamed from: g */
        public final /* synthetic */ List f15939g;

        /* renamed from: h */
        public final /* synthetic */ boolean f15940h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z9, C9244b c9244b, int i9, List list, boolean z10) {
            super(str, z9);
            this.f15937e = c9244b;
            this.f15938f = i9;
            this.f15939g = list;
            this.f15940h = z10;
        }

        @Override // p216p8.AbstractC9338a
        /* renamed from: f */
        public long mo15008f() {
            boolean zMo15969c = this.f15937e.f15894l.mo15969c(this.f15938f, this.f15939g, this.f15940h);
            if (zMo15969c) {
                try {
                    this.f15937e.m14952I().m15042o(this.f15938f, ErrorCode.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zMo15969c && !this.f15940h) {
                return -1L;
            }
            synchronized (this.f15937e) {
                this.f15937e.f15882B.remove(Integer.valueOf(this.f15938f));
            }
            return -1L;
        }
    }

    /* renamed from: okhttp3.internal.http2.b$g */
    public static final class g extends AbstractC9338a {

        /* renamed from: e */
        public final /* synthetic */ C9244b f15941e;

        /* renamed from: f */
        public final /* synthetic */ int f15942f;

        /* renamed from: g */
        public final /* synthetic */ List f15943g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z9, C9244b c9244b, int i9, List list) {
            super(str, z9);
            this.f15941e = c9244b;
            this.f15942f = i9;
            this.f15943g = list;
        }

        @Override // p216p8.AbstractC9338a
        /* renamed from: f */
        public long mo15008f() {
            if (!this.f15941e.f15894l.mo15968b(this.f15942f, this.f15943g)) {
                return -1L;
            }
            try {
                this.f15941e.m14952I().m15042o(this.f15942f, ErrorCode.CANCEL);
                synchronized (this.f15941e) {
                    this.f15941e.f15882B.remove(Integer.valueOf(this.f15942f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.b$h */
    public static final class h extends AbstractC9338a {

        /* renamed from: e */
        public final /* synthetic */ C9244b f15944e;

        /* renamed from: f */
        public final /* synthetic */ int f15945f;

        /* renamed from: g */
        public final /* synthetic */ ErrorCode f15946g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z9, C9244b c9244b, int i9, ErrorCode errorCode) {
            super(str, z9);
            this.f15944e = c9244b;
            this.f15945f = i9;
            this.f15946g = errorCode;
        }

        @Override // p216p8.AbstractC9338a
        /* renamed from: f */
        public long mo15008f() {
            this.f15944e.f15894l.mo15967a(this.f15945f, this.f15946g);
            synchronized (this.f15944e) {
                this.f15944e.f15882B.remove(Integer.valueOf(this.f15945f));
                Unit unit = Unit.INSTANCE;
            }
            return -1L;
        }
    }

    /* renamed from: okhttp3.internal.http2.b$i */
    public static final class i extends AbstractC9338a {

        /* renamed from: e */
        public final /* synthetic */ C9244b f15947e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z9, C9244b c9244b) {
            super(str, z9);
            this.f15947e = c9244b;
        }

        @Override // p216p8.AbstractC9338a
        /* renamed from: f */
        public long mo15008f() throws IOException {
            this.f15947e.m14970b0(false, 2, 0);
            return -1L;
        }
    }

    /* renamed from: okhttp3.internal.http2.b$j */
    public static final class j extends AbstractC9338a {

        /* renamed from: e */
        public final /* synthetic */ C9244b f15948e;

        /* renamed from: f */
        public final /* synthetic */ long f15949f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, C9244b c9244b, long j9) {
            super(str, false, 2, null);
            this.f15948e = c9244b;
            this.f15949f = j9;
        }

        @Override // p216p8.AbstractC9338a
        /* renamed from: f */
        public long mo15008f() throws IOException {
            boolean z9;
            synchronized (this.f15948e) {
                if (this.f15948e.f15896n < this.f15948e.f15895m) {
                    z9 = true;
                } else {
                    this.f15948e.f15895m++;
                    z9 = false;
                }
            }
            if (z9) {
                this.f15948e.m14975x(null);
                return -1L;
            }
            this.f15948e.m14970b0(false, 1, 0);
            return this.f15949f;
        }
    }

    /* renamed from: okhttp3.internal.http2.b$k */
    public static final class k extends AbstractC9338a {

        /* renamed from: e */
        public final /* synthetic */ C9244b f15950e;

        /* renamed from: f */
        public final /* synthetic */ int f15951f;

        /* renamed from: g */
        public final /* synthetic */ ErrorCode f15952g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z9, C9244b c9244b, int i9, ErrorCode errorCode) {
            super(str, z9);
            this.f15950e = c9244b;
            this.f15951f = i9;
            this.f15952g = errorCode;
        }

        @Override // p216p8.AbstractC9338a
        /* renamed from: f */
        public long mo15008f() throws IOException {
            try {
                this.f15950e.m14971c0(this.f15951f, this.f15952g);
                return -1L;
            } catch (IOException e10) {
                this.f15950e.m14975x(e10);
                return -1L;
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.b$l */
    public static final class l extends AbstractC9338a {

        /* renamed from: e */
        public final /* synthetic */ C9244b f15953e;

        /* renamed from: f */
        public final /* synthetic */ int f15954f;

        /* renamed from: g */
        public final /* synthetic */ long f15955g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z9, C9244b c9244b, int i9, long j9) {
            super(str, z9);
            this.f15953e = c9244b;
            this.f15954f = i9;
            this.f15955g = j9;
        }

        @Override // p216p8.AbstractC9338a
        /* renamed from: f */
        public long mo15008f() throws IOException {
            try {
                this.f15953e.m14952I().m15044q(this.f15954f, this.f15955g);
                return -1L;
            } catch (IOException e10) {
                this.f15953e.m14975x(e10);
                return -1L;
            }
        }
    }

    static {
        C9642g c9642g = new C9642g();
        c9642g.m15978h(7, 65535);
        c9642g.m15978h(5, 16384);
        f15880D = c9642g;
    }

    public C9244b(a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean zM14979b = builder.m14979b();
        this.f15883a = zM14979b;
        this.f15884b = builder.m14981d();
        this.f15885c = new LinkedHashMap();
        String strM14980c = builder.m14980c();
        this.f15886d = strM14980c;
        this.f15888f = builder.m14979b() ? 3 : 2;
        C9342e c9342eM14987j = builder.m14987j();
        this.f15890h = c9342eM14987j;
        C9341d c9341dM15279i = c9342eM14987j.m15279i();
        this.f15891i = c9341dM15279i;
        this.f15892j = c9342eM14987j.m15279i();
        this.f15893k = c9342eM14987j.m15279i();
        this.f15894l = builder.m14983f();
        C9642g c9642g = new C9642g();
        if (builder.m14979b()) {
            c9642g.m15978h(7, 16777216);
        }
        this.f15901s = c9642g;
        this.f15902t = f15880D;
        this.f15906x = r2.m15973c();
        this.f15907y = builder.m14985h();
        this.f15908z = new C9246d(builder.m14984g(), zM14979b);
        this.f15881A = new d(this, new C9245c(builder.m14986i(), zM14979b));
        this.f15882B = new LinkedHashSet();
        if (builder.m14982e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.m14982e());
            c9341dM15279i.m15266i(new j(strM14980c + " ping", this, nanos), nanos);
        }
    }

    /* renamed from: X */
    public static /* synthetic */ void m14925X(C9244b c9244b, boolean z9, C9342e c9342e, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = true;
        }
        if ((i9 & 2) != 0) {
            c9342e = C9342e.f16227i;
        }
        c9244b.m14966W(z9, c9342e);
    }

    /* renamed from: A */
    public final int m14944A() {
        return this.f15887e;
    }

    /* renamed from: B */
    public final c m14945B() {
        return this.f15884b;
    }

    /* renamed from: C */
    public final int m14946C() {
        return this.f15888f;
    }

    /* renamed from: D */
    public final C9642g m14947D() {
        return this.f15901s;
    }

    /* renamed from: E */
    public final C9642g m14948E() {
        return this.f15902t;
    }

    /* renamed from: F */
    public final synchronized C9639d m14949F(int i9) {
        return (C9639d) this.f15885c.get(Integer.valueOf(i9));
    }

    /* renamed from: G */
    public final Map m14950G() {
        return this.f15885c;
    }

    /* renamed from: H */
    public final long m14951H() {
        return this.f15906x;
    }

    /* renamed from: I */
    public final C9246d m14952I() {
        return this.f15908z;
    }

    /* renamed from: J */
    public final synchronized boolean m14953J(long j9) {
        if (this.f15889g) {
            return false;
        }
        if (this.f15898p < this.f15897o) {
            if (j9 >= this.f15900r) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: K */
    public final C9639d m14954K(int i9, List list, boolean z9) throws Throwable {
        Throwable th;
        boolean z10 = !z9;
        synchronized (this.f15908z) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f15888f > 1073741823) {
                                try {
                                    m14965V(ErrorCode.REFUSED_STREAM);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            try {
                                if (this.f15889g) {
                                    throw new ConnectionShutdownException();
                                }
                                int i10 = this.f15888f;
                                this.f15888f = i10 + 2;
                                C9639d c9639d = new C9639d(i10, this, z10, false, null);
                                boolean z11 = !z9 || this.f15905w >= this.f15906x || c9639d.m15941r() >= c9639d.m15940q();
                                if (c9639d.m15944u()) {
                                    this.f15885c.put(Integer.valueOf(i10), c9639d);
                                }
                                Unit unit = Unit.INSTANCE;
                                if (i9 == 0) {
                                    this.f15908z.m15038k(z10, i10, list);
                                } else {
                                    if (this.f15883a) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.f15908z.m15041n(i9, i10, list);
                                }
                                if (z11) {
                                    this.f15908z.flush();
                                }
                                return c9639d;
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
    public final C9639d m14955L(List requestHeaders, boolean z9) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return m14954K(0, requestHeaders, z9);
    }

    /* renamed from: M */
    public final void m14956M(int i9, BufferedSource source, int i10, boolean z9) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Buffer buffer = new Buffer();
        long j9 = i10;
        source.require(j9);
        source.read(buffer, j9);
        this.f15892j.m15266i(new e(this.f15886d + '[' + i9 + "] onData", true, this, i9, buffer, i10, z9), 0L);
    }

    /* renamed from: N */
    public final void m14957N(int i9, List requestHeaders, boolean z9) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        this.f15892j.m15266i(new f(this.f15886d + '[' + i9 + "] onHeaders", true, this, i9, requestHeaders, z9), 0L);
    }

    /* renamed from: O */
    public final void m14958O(int i9, List requestHeaders) throws Throwable {
        Throwable th;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (this.f15882B.contains(Integer.valueOf(i9))) {
                    try {
                        m14972d0(i9, ErrorCode.PROTOCOL_ERROR);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f15882B.add(Integer.valueOf(i9));
                this.f15892j.m15266i(new g(this.f15886d + '[' + i9 + "] onRequest", true, this, i9, requestHeaders), 0L);
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* renamed from: P */
    public final void m14959P(int i9, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f15892j.m15266i(new h(this.f15886d + '[' + i9 + "] onReset", true, this, i9, errorCode), 0L);
    }

    /* renamed from: Q */
    public final boolean m14960Q(int i9) {
        return i9 != 0 && (i9 & 1) == 0;
    }

    /* renamed from: R */
    public final synchronized C9639d m14961R(int i9) {
        C9639d c9639d;
        c9639d = (C9639d) this.f15885c.remove(Integer.valueOf(i9));
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return c9639d;
    }

    /* renamed from: S */
    public final void m14962S() {
        synchronized (this) {
            long j9 = this.f15898p;
            long j10 = this.f15897o;
            if (j9 < j10) {
                return;
            }
            this.f15897o = j10 + 1;
            this.f15900r = System.nanoTime() + InstantKt.NANOS_PER_SECOND;
            Unit unit = Unit.INSTANCE;
            this.f15891i.m15266i(new i(this.f15886d + " ping", true, this), 0L);
        }
    }

    /* renamed from: T */
    public final void m14963T(int i9) {
        this.f15887e = i9;
    }

    /* renamed from: U */
    public final void m14964U(C9642g c9642g) {
        Intrinsics.checkNotNullParameter(c9642g, "<set-?>");
        this.f15902t = c9642g;
    }

    /* renamed from: V */
    public final void m14965V(ErrorCode statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f15908z) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (this.f15889g) {
                    return;
                }
                this.f15889g = true;
                int i9 = this.f15887e;
                intRef.element = i9;
                Unit unit = Unit.INSTANCE;
                this.f15908z.m15037j(i9, statusCode, AbstractC9045d.f15224a);
            }
        }
    }

    /* renamed from: W */
    public final void m14966W(boolean z9, C9342e taskRunner) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        if (z9) {
            this.f15908z.m15033c();
            this.f15908z.m15043p(this.f15901s);
            if (this.f15901s.m15973c() != 65535) {
                this.f15908z.m15044q(0, r5 - 65535);
            }
        }
        taskRunner.m15279i().m15266i(new C9340c(this.f15886d, true, this.f15881A), 0L);
    }

    /* renamed from: Y */
    public final synchronized void m14967Y(long j9) {
        long j10 = this.f15903u + j9;
        this.f15903u = j10;
        long j11 = j10 - this.f15904v;
        if (j11 >= this.f15901s.m15973c() / 2) {
            m14973e0(0, j11);
            this.f15904v += j11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f15908z.m15039l());
        r6 = r2;
        r8.f15905w += r6;
        r4 = kotlin.Unit.INSTANCE;
     */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14968Z(int r9, boolean r10, okio.Buffer r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.d r12 = r8.f15908z
            r12.m15034g(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.f15905w     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r6 = r8.f15906x     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.Map r2 = r8.f15885c     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            if (r2 == 0) goto L31
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r2)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
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
            okhttp3.internal.http2.d r4 = r8.f15908z     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.m15039l()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.f15905w     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.f15905w = r4     // Catch: java.lang.Throwable -> L2f
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.d r4 = r8.f15908z
            if (r10 == 0) goto L5d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = r3
        L5e:
            r4.m15034g(r5, r9, r11, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C9244b.m14968Z(int, boolean, okio.Buffer, long):void");
    }

    /* renamed from: a0 */
    public final void m14969a0(int i9, boolean z9, List alternating) {
        Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.f15908z.m15038k(z9, i9, alternating);
    }

    /* renamed from: b0 */
    public final void m14970b0(boolean z9, int i9, int i10) throws IOException {
        try {
            this.f15908z.m15040m(z9, i9, i10);
        } catch (IOException e10) {
            m14975x(e10);
        }
    }

    /* renamed from: c0 */
    public final void m14971c0(int i9, ErrorCode statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.f15908z.m15042o(i9, statusCode);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m14974w(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    /* renamed from: d0 */
    public final void m14972d0(int i9, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f15891i.m15266i(new k(this.f15886d + '[' + i9 + "] writeSynReset", true, this, i9, errorCode), 0L);
    }

    /* renamed from: e0 */
    public final void m14973e0(int i9, long j9) {
        this.f15891i.m15266i(new l(this.f15886d + '[' + i9 + "] windowUpdate", true, this, i9, j9), 0L);
    }

    public final void flush() {
        this.f15908z.flush();
    }

    /* renamed from: w */
    public final void m14974w(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) throws IOException {
        int i9;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (AbstractC9045d.f15231h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            m14965V(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f15885c.isEmpty()) {
                    array = null;
                } else {
                    array = this.f15885c.values().toArray(new C9639d[0]);
                    this.f15885c.clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        C9639d[] c9639dArr = (C9639d[]) array;
        if (c9639dArr != null) {
            for (C9639d c9639d : c9639dArr) {
                try {
                    c9639d.m15927d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f15908z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f15907y.close();
        } catch (IOException unused4) {
        }
        this.f15891i.m15270n();
        this.f15892j.m15270n();
        this.f15893k.m15270n();
    }

    /* renamed from: x */
    public final void m14975x(IOException iOException) throws IOException {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        m14974w(errorCode, errorCode, iOException);
    }

    /* renamed from: y */
    public final boolean m14976y() {
        return this.f15883a;
    }

    /* renamed from: z */
    public final String m14977z() {
        return this.f15886d;
    }
}
