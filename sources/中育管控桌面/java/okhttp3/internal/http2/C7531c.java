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
import okhttp3.internal.http2.C7531c;
import okhttp3.internal.http2.C7532d;
import okhttp3.internal.http2.InterfaceC7529a;
import okhttp3.internal.platform.AbstractC7536c;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import p058f5.C6383v;
import p065g5.AbstractC6424h;
import p065g5.AbstractC6427k;
import p086j5.C6600c;
import p086j5.C6601d;
import p116n5.C7482p;
import p116n5.C7485s;
import p116n5.InterfaceC7484r;
import p123o5.C7522a;

/* renamed from: okhttp3.internal.http2.c */
/* loaded from: classes4.dex */
public final class C7531c implements Closeable {

    /* renamed from: C */
    public static final b f9919C = new b(null);

    /* renamed from: D */
    public static final C7485s f9920D;

    /* renamed from: A */
    public final d f9921A;

    /* renamed from: B */
    public final Set f9922B;

    /* renamed from: a */
    public final boolean f9923a;

    /* renamed from: b */
    public final c f9924b;

    /* renamed from: c */
    public final Map f9925c;

    /* renamed from: d */
    public final String f9926d;

    /* renamed from: e */
    public int f9927e;

    /* renamed from: f */
    public int f9928f;

    /* renamed from: g */
    public boolean f9929g;

    /* renamed from: h */
    public final C6601d f9930h;

    /* renamed from: i */
    public final C6600c f9931i;

    /* renamed from: j */
    public final C6600c f9932j;

    /* renamed from: k */
    public final C6600c f9933k;

    /* renamed from: l */
    public final InterfaceC7484r f9934l;

    /* renamed from: m */
    public long f9935m;

    /* renamed from: n */
    public long f9936n;

    /* renamed from: o */
    public long f9937o;

    /* renamed from: p */
    public long f9938p;

    /* renamed from: q */
    public long f9939q;

    /* renamed from: r */
    public long f9940r;

    /* renamed from: s */
    public final InterfaceC7529a f9941s;

    /* renamed from: t */
    public final C7485s f9942t;

    /* renamed from: u */
    public C7485s f9943u;

    /* renamed from: v */
    public final C7522a f9944v;

    /* renamed from: w */
    public long f9945w;

    /* renamed from: x */
    public long f9946x;

    /* renamed from: y */
    public final Socket f9947y;

    /* renamed from: z */
    public final C7533e f9948z;

    /* renamed from: okhttp3.internal.http2.c$a */
    public static final class a {

        /* renamed from: a */
        public boolean f9949a;

        /* renamed from: b */
        public final C6601d f9950b;

        /* renamed from: c */
        public Socket f9951c;

        /* renamed from: d */
        public String f9952d;

        /* renamed from: e */
        public BufferedSource f9953e;

        /* renamed from: f */
        public BufferedSink f9954f;

        /* renamed from: g */
        public c f9955g;

        /* renamed from: h */
        public InterfaceC7484r f9956h;

        /* renamed from: i */
        public int f9957i;

        /* renamed from: j */
        public InterfaceC7529a f9958j;

        public a(boolean z6, C6601d taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f9949a = z6;
            this.f9950b = taskRunner;
            this.f9955g = c.f9960b;
            this.f9956h = InterfaceC7484r.f9660b;
            this.f9958j = InterfaceC7529a.a.f9897a;
        }

        /* renamed from: a */
        public final C7531c m8826a() {
            return new C7531c(this);
        }

        /* renamed from: b */
        public final a m8827b(InterfaceC7529a flowControlListener) {
            Intrinsics.checkNotNullParameter(flowControlListener, "flowControlListener");
            this.f9958j = flowControlListener;
            return this;
        }

        /* renamed from: c */
        public final boolean m8828c() {
            return this.f9949a;
        }

        /* renamed from: d */
        public final String m8829d() {
            String str = this.f9952d;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }

        /* renamed from: e */
        public final InterfaceC7529a m8830e() {
            return this.f9958j;
        }

        /* renamed from: f */
        public final c m8831f() {
            return this.f9955g;
        }

        /* renamed from: g */
        public final int m8832g() {
            return this.f9957i;
        }

        /* renamed from: h */
        public final InterfaceC7484r m8833h() {
            return this.f9956h;
        }

        /* renamed from: i */
        public final BufferedSink m8834i() {
            BufferedSink bufferedSink = this.f9954f;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        /* renamed from: j */
        public final Socket m8835j() {
            Socket socket = this.f9951c;
            if (socket != null) {
                return socket;
            }
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        /* renamed from: k */
        public final BufferedSource m8836k() {
            BufferedSource bufferedSource = this.f9953e;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            Intrinsics.throwUninitializedPropertyAccessException("source");
            return null;
        }

        /* renamed from: l */
        public final C6601d m8837l() {
            return this.f9950b;
        }

        /* renamed from: m */
        public final a m8838m(c listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f9955g = listener;
            return this;
        }

        /* renamed from: n */
        public final a m8839n(int i6) {
            this.f9957i = i6;
            return this;
        }

        /* renamed from: o */
        public final void m8840o(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f9952d = str;
        }

        /* renamed from: p */
        public final void m8841p(BufferedSink bufferedSink) {
            Intrinsics.checkNotNullParameter(bufferedSink, "<set-?>");
            this.f9954f = bufferedSink;
        }

        /* renamed from: q */
        public final void m8842q(Socket socket) {
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.f9951c = socket;
        }

        /* renamed from: r */
        public final void m8843r(BufferedSource bufferedSource) {
            Intrinsics.checkNotNullParameter(bufferedSource, "<set-?>");
            this.f9953e = bufferedSource;
        }

        /* renamed from: s */
        public final a m8844s(Socket socket, String peerName, BufferedSource source, BufferedSink sink) {
            String str;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            m8842q(socket);
            if (this.f9949a) {
                str = AbstractC6427k.f8101c + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            m8840o(str);
            m8843r(source);
            m8841p(sink);
            return this;
        }
    }

    /* renamed from: okhttp3.internal.http2.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7485s m8845a() {
            return C7531c.f9920D;
        }

        public b() {
        }
    }

    /* renamed from: okhttp3.internal.http2.c$c */
    public static abstract class c {

        /* renamed from: a */
        public static final b f9959a = new b(null);

        /* renamed from: b */
        public static final c f9960b = new a();

        /* renamed from: okhttp3.internal.http2.c$c$a */
        public static final class a extends c {
            @Override // okhttp3.internal.http2.C7531c.c
            /* renamed from: c */
            public void mo7812c(C7482p stream) {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.m8559e(ErrorCode.f9886j, null);
            }
        }

        /* renamed from: okhttp3.internal.http2.c$c$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public b() {
            }
        }

        /* renamed from: a */
        public void mo7811a(C7531c connection, C7485s settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        /* renamed from: c */
        public abstract void mo7812c(C7482p c7482p);
    }

    /* renamed from: okhttp3.internal.http2.c$d */
    public final class d implements C7532d.c, Function0 {

        /* renamed from: a */
        public final C7532d f9961a;

        /* renamed from: b */
        public final /* synthetic */ C7531c f9962b;

        public d(C7531c c7531c, C7532d reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f9962b = c7531c;
            this.f9961a = reader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: p */
        public static final Unit m8850p(C7531c c7531c, Ref.ObjectRef objectRef) {
            c7531c.m8797H().mo7811a(c7531c, (C7485s) objectRef.element);
            return Unit.INSTANCE;
        }

        /* renamed from: q */
        public static final Unit m8851q(C7531c c7531c, C7482p c7482p) {
            try {
                c7531c.m8797H().mo7812c(c7482p);
            } catch (IOException e6) {
                AbstractC7536c.f9994a.m8931e().mo8919l("Http2Connection.Listener failure for " + c7531c.m8794E(), 4, e6);
                try {
                    c7482p.m8559e(ErrorCode.f9880d, e6);
                } catch (IOException unused) {
                }
            }
            return Unit.INSTANCE;
        }

        /* renamed from: s */
        public static final Unit m8852s(C7531c c7531c, int i6, int i7) throws IOException {
            c7531c.m8822m0(true, i6, i7);
            return Unit.INSTANCE;
        }

        /* renamed from: t */
        public static final Unit m8853t(d dVar, boolean z6, C7485s c7485s) {
            dVar.m8864o(z6, c7485s);
            return Unit.INSTANCE;
        }

        @Override // okhttp3.internal.http2.C7532d.c
        /* renamed from: a */
        public void mo8854a(boolean z6, int i6, int i7, List headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f9962b.m8812a0(i6)) {
                this.f9962b.m8809V(i6, headerBlock, z6);
                return;
            }
            final C7531c c7531c = this.f9962b;
            synchronized (c7531c) {
                C7482p c7482pM8801L = c7531c.m8801L(i6);
                if (c7482pM8801L != null) {
                    Unit unit = Unit.INSTANCE;
                    c7482pM8801L.m8579y(AbstractC6427k.m7031s(headerBlock), z6);
                    return;
                }
                if (c7531c.f9929g) {
                    return;
                }
                if (i6 <= c7531c.m8796G()) {
                    return;
                }
                if (i6 % 2 == c7531c.m8798I() % 2) {
                    return;
                }
                final C7482p c7482p = new C7482p(i6, c7531c, false, z6, AbstractC6427k.m7031s(headerBlock));
                c7531c.m8815e0(i6);
                c7531c.m8802M().put(Integer.valueOf(i6), c7482p);
                C6600c.m7531d(c7531c.f9930h.m7558k(), c7531c.m8794E() + '[' + i6 + "] onStream", 0L, false, new Function0() { // from class: n5.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C7531c.d.m8851q(c7531c, c7482p);
                    }
                }, 6, null);
            }
        }

        @Override // okhttp3.internal.http2.C7532d.c
        /* renamed from: b */
        public void mo8855b(int i6, long j6) {
            if (i6 == 0) {
                C7531c c7531c = this.f9962b;
                synchronized (c7531c) {
                    c7531c.f9946x = c7531c.m8803N() + j6;
                    Intrinsics.checkNotNull(c7531c, "null cannot be cast to non-null type java.lang.Object");
                    c7531c.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            C7482p c7482pM8801L = this.f9962b.m8801L(i6);
            if (c7482pM8801L != null) {
                synchronized (c7482pM8801L) {
                    c7482pM8801L.m8556b(j6);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }

        @Override // okhttp3.internal.http2.C7532d.c
        /* renamed from: c */
        public void mo8856c(final boolean z6, final C7485s settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            C6600c.m7531d(this.f9962b.f9931i, this.f9962b.m8794E() + " applyAndAckSettings", 0L, false, new Function0() { // from class: n5.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C7531c.d.m8853t(this.f9611a, z6, settings);
                }
            }, 6, null);
        }

        @Override // okhttp3.internal.http2.C7532d.c
        /* renamed from: d */
        public void mo8857d(int i6, int i7, List requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.f9962b.m8810X(i7, requestHeaders);
        }

        @Override // okhttp3.internal.http2.C7532d.c
        /* renamed from: e */
        public void mo8858e() {
        }

        @Override // okhttp3.internal.http2.C7532d.c
        /* renamed from: f */
        public void mo8859f(boolean z6, int i6, BufferedSource source, int i7) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f9962b.m8812a0(i6)) {
                this.f9962b.m8808T(i6, source, i7, z6);
                return;
            }
            C7482p c7482pM8801L = this.f9962b.m8801L(i6);
            if (c7482pM8801L == null) {
                this.f9962b.m8824p0(i6, ErrorCode.f9880d);
                long j6 = i7;
                this.f9962b.m8819j0(j6);
                source.skip(j6);
                return;
            }
            c7482pM8801L.m8578x(source, i7);
            if (z6) {
                c7482pM8801L.m8579y(C6383v.f7962c, true);
            }
        }

        @Override // okhttp3.internal.http2.C7532d.c
        /* renamed from: g */
        public void mo8860g(boolean z6, final int i6, final int i7) {
            if (!z6) {
                C6600c c6600c = this.f9962b.f9931i;
                String str = this.f9962b.m8794E() + " ping";
                final C7531c c7531c = this.f9962b;
                C6600c.m7531d(c6600c, str, 0L, false, new Function0() { // from class: n5.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C7531c.d.m8852s(c7531c, i6, i7);
                    }
                }, 6, null);
                return;
            }
            C7531c c7531c2 = this.f9962b;
            synchronized (c7531c2) {
                try {
                    if (i6 == 1) {
                        c7531c2.f9936n++;
                    } else if (i6 != 2) {
                        if (i6 == 3) {
                            c7531c2.f9939q++;
                            Intrinsics.checkNotNull(c7531c2, "null cannot be cast to non-null type java.lang.Object");
                            c7531c2.notifyAll();
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        c7531c2.f9938p++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.C7532d.c
        /* renamed from: h */
        public void mo8861h(int i6, int i7, int i8, boolean z6) {
        }

        @Override // okhttp3.internal.http2.C7532d.c
        /* renamed from: i */
        public void mo8862i(int i6, ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.f9962b.m8812a0(i6)) {
                this.f9962b.m8811Z(i6, errorCode);
                return;
            }
            C7482p c7482pM8813b0 = this.f9962b.m8813b0(i6);
            if (c7482pM8813b0 != null) {
                c7482pM8813b0.m8580z(errorCode);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m8865r();
            return Unit.INSTANCE;
        }

        @Override // okhttp3.internal.http2.C7532d.c
        /* renamed from: j */
        public void mo8863j(int i6, ErrorCode errorCode, ByteString debugData) {
            int i7;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.size();
            C7531c c7531c = this.f9962b;
            synchronized (c7531c) {
                array = c7531c.m8802M().values().toArray(new C7482p[0]);
                c7531c.f9929g = true;
                Unit unit = Unit.INSTANCE;
            }
            for (C7482p c7482p : (C7482p[]) array) {
                if (c7482p.m8566l() > i6 && c7482p.m8574t()) {
                    c7482p.m8580z(ErrorCode.f9886j);
                    this.f9962b.m8813b0(c7482p.m8566l());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v25 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4, types: [T, n5.s] */
        /* renamed from: o */
        public final void m8864o(boolean z6, C7485s c7485s) {
            ?? r02;
            long jM8605c;
            int i6;
            C7482p[] c7482pArr;
            C7485s settings = c7485s;
            Intrinsics.checkNotNullParameter(settings, "settings");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            C7533e c7533eM8804O = this.f9962b.m8804O();
            final C7531c c7531c = this.f9962b;
            synchronized (c7533eM8804O) {
                synchronized (c7531c) {
                    try {
                        C7485s c7485sM8800K = c7531c.m8800K();
                        if (z6) {
                            r02 = settings;
                        } else {
                            C7485s c7485s2 = new C7485s();
                            c7485s2.m8609g(c7485sM8800K);
                            c7485s2.m8609g(settings);
                            r02 = c7485s2;
                        }
                        objectRef.element = r02;
                        jM8605c = r02.m8605c() - c7485sM8800K.m8605c();
                        c7482pArr = (jM8605c == 0 || c7531c.m8802M().isEmpty()) ? null : (C7482p[]) c7531c.m8802M().values().toArray(new C7482p[0]);
                        c7531c.m8816f0((C7485s) objectRef.element);
                        C6600c.m7531d(c7531c.f9933k, c7531c.m8794E() + " onSettings", 0L, false, new Function0() { // from class: n5.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C7531c.d.m8850p(c7531c, objectRef);
                            }
                        }, 6, null);
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    c7531c.m8804O().m8889a((C7485s) objectRef.element);
                } catch (IOException e6) {
                    c7531c.m8792C(e6);
                }
                Unit unit2 = Unit.INSTANCE;
            }
            if (c7482pArr != null) {
                for (C7482p c7482p : c7482pArr) {
                    synchronized (c7482p) {
                        c7482p.m8556b(jM8605c);
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.d] */
        /* renamed from: r */
        public void m8865r() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.f9881e;
            IOException e6 = null;
            try {
                try {
                    this.f9961a.m8868g(this);
                    while (this.f9961a.m8867c(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.f9879c;
                    try {
                        this.f9962b.m8791B(errorCode3, ErrorCode.f9887k, null);
                        errorCode = errorCode3;
                    } catch (IOException e7) {
                        e6 = e7;
                        ErrorCode errorCode4 = ErrorCode.f9880d;
                        C7531c c7531c = this.f9962b;
                        c7531c.m8791B(errorCode4, errorCode4, e6);
                        errorCode = c7531c;
                        errorCode2 = this.f9961a;
                        AbstractC6424h.m6992f(errorCode2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f9962b.m8791B(errorCode, errorCode2, e6);
                    AbstractC6424h.m6992f(this.f9961a);
                    throw th;
                }
            } catch (IOException e8) {
                e6 = e8;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                this.f9962b.m8791B(errorCode, errorCode2, e6);
                AbstractC6424h.m6992f(this.f9961a);
                throw th;
            }
            errorCode2 = this.f9961a;
            AbstractC6424h.m6992f(errorCode2);
        }
    }

    static {
        C7485s c7485s = new C7485s();
        c7485s.m8610h(4, 65535);
        c7485s.m8610h(5, 16384);
        f9920D = c7485s;
    }

    public C7531c(a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean zM8828c = builder.m8828c();
        this.f9923a = zM8828c;
        this.f9924b = builder.m8831f();
        this.f9925c = new LinkedHashMap();
        String strM8829d = builder.m8829d();
        this.f9926d = strM8829d;
        this.f9928f = builder.m8828c() ? 3 : 2;
        C6601d c6601dM8837l = builder.m8837l();
        this.f9930h = c6601dM8837l;
        C6600c c6600cM7558k = c6601dM8837l.m7558k();
        this.f9931i = c6600cM7558k;
        this.f9932j = c6601dM8837l.m7558k();
        this.f9933k = c6601dM8837l.m7558k();
        this.f9934l = builder.m8833h();
        this.f9941s = builder.m8830e();
        C7485s c7485s = new C7485s();
        if (builder.m8828c()) {
            c7485s.m8610h(4, 16777216);
        }
        this.f9942t = c7485s;
        this.f9943u = f9920D;
        this.f9944v = new C7522a(0);
        this.f9946x = this.f9943u.m8605c();
        this.f9947y = builder.m8835j();
        this.f9948z = new C7533e(builder.m8834i(), zM8828c);
        this.f9921A = new d(this, new C7532d(builder.m8836k(), zM8828c));
        this.f9922B = new LinkedHashSet();
        if (builder.m8832g() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.m8832g());
            c6600cM7558k.m7543l(strM8829d + " ping", nanos, new Function0() { // from class: n5.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Long.valueOf(C7531c.m8775m(this.f9582a, nanos));
                }
            });
        }
    }

    /* renamed from: S */
    public static final Unit m8761S(C7531c c7531c, int i6, Buffer buffer, int i7, boolean z6) {
        try {
            boolean zMo8602d = c7531c.f9934l.mo8602d(i6, buffer, i7, z6);
            if (zMo8602d) {
                c7531c.f9948z.m8899o(i6, ErrorCode.f9887k);
            }
            if (zMo8602d || z6) {
                synchronized (c7531c) {
                    c7531c.f9922B.remove(Integer.valueOf(i6));
                    Unit unit = Unit.INSTANCE;
                }
            }
        } catch (IOException unused) {
        }
        return Unit.INSTANCE;
    }

    /* renamed from: U */
    public static final Unit m8762U(C7531c c7531c, int i6, List list, boolean z6) {
        boolean zMo8601c = c7531c.f9934l.mo8601c(i6, list, z6);
        if (zMo8601c) {
            try {
                c7531c.f9948z.m8899o(i6, ErrorCode.f9887k);
            } catch (IOException unused) {
            }
        }
        if (zMo8601c || z6) {
            synchronized (c7531c) {
                c7531c.f9922B.remove(Integer.valueOf(i6));
                Unit unit = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: W */
    public static final Unit m8763W(C7531c c7531c, int i6, List list) {
        if (c7531c.f9934l.mo8600b(i6, list)) {
            try {
                c7531c.f9948z.m8899o(i6, ErrorCode.f9887k);
                synchronized (c7531c) {
                    c7531c.f9922B.remove(Integer.valueOf(i6));
                    Unit unit = Unit.INSTANCE;
                }
            } catch (IOException unused) {
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: Y */
    public static final Unit m8764Y(C7531c c7531c, int i6, ErrorCode errorCode) {
        c7531c.f9934l.mo8599a(i6, errorCode);
        synchronized (c7531c) {
            c7531c.f9922B.remove(Integer.valueOf(i6));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: c0 */
    public static final Unit m8767c0(C7531c c7531c) throws IOException {
        c7531c.m8822m0(false, 2, 0);
        return Unit.INSTANCE;
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m8771i0(C7531c c7531c, boolean z6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        c7531c.m8818h0(z6);
    }

    /* renamed from: m */
    public static final long m8775m(C7531c c7531c, long j6) throws IOException {
        boolean z6;
        synchronized (c7531c) {
            long j7 = c7531c.f9936n;
            long j8 = c7531c.f9935m;
            if (j7 < j8) {
                z6 = true;
            } else {
                c7531c.f9935m = j8 + 1;
                z6 = false;
            }
        }
        if (z6) {
            c7531c.m8792C(null);
            return -1L;
        }
        c7531c.m8822m0(false, 1, 0);
        return j6;
    }

    /* renamed from: o0 */
    public static final Unit m8778o0(C7531c c7531c, int i6, ErrorCode errorCode) throws IOException {
        try {
            c7531c.m8823n0(i6, errorCode);
        } catch (IOException e6) {
            c7531c.m8792C(e6);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: q0 */
    public static final Unit m8781q0(C7531c c7531c, int i6, long j6) throws IOException {
        try {
            c7531c.f9948z.m8901q(i6, j6);
        } catch (IOException e6) {
            c7531c.m8792C(e6);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public final void m8791B(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) throws IOException {
        int i6;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (AbstractC6427k.f8100b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            m8817g0(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f9925c.isEmpty()) {
                    array = null;
                } else {
                    array = this.f9925c.values().toArray(new C7482p[0]);
                    this.f9925c.clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        C7482p[] c7482pArr = (C7482p[]) array;
        if (c7482pArr != null) {
            for (C7482p c7482p : c7482pArr) {
                try {
                    c7482p.m8559e(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f9948z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f9947y.close();
        } catch (IOException unused4) {
        }
        this.f9931i.m7547q();
        this.f9932j.m7547q();
        this.f9933k.m7547q();
    }

    /* renamed from: C */
    public final void m8792C(IOException iOException) throws IOException {
        ErrorCode errorCode = ErrorCode.f9880d;
        m8791B(errorCode, errorCode, iOException);
    }

    /* renamed from: D */
    public final boolean m8793D() {
        return this.f9923a;
    }

    /* renamed from: E */
    public final String m8794E() {
        return this.f9926d;
    }

    /* renamed from: F */
    public final InterfaceC7529a m8795F() {
        return this.f9941s;
    }

    /* renamed from: G */
    public final int m8796G() {
        return this.f9927e;
    }

    /* renamed from: H */
    public final c m8797H() {
        return this.f9924b;
    }

    /* renamed from: I */
    public final int m8798I() {
        return this.f9928f;
    }

    /* renamed from: J */
    public final C7485s m8799J() {
        return this.f9942t;
    }

    /* renamed from: K */
    public final C7485s m8800K() {
        return this.f9943u;
    }

    /* renamed from: L */
    public final C7482p m8801L(int i6) {
        C7482p c7482p;
        synchronized (this) {
            c7482p = (C7482p) this.f9925c.get(Integer.valueOf(i6));
        }
        return c7482p;
    }

    /* renamed from: M */
    public final Map m8802M() {
        return this.f9925c;
    }

    /* renamed from: N */
    public final long m8803N() {
        return this.f9946x;
    }

    /* renamed from: O */
    public final C7533e m8804O() {
        return this.f9948z;
    }

    /* renamed from: P */
    public final boolean m8805P(long j6) {
        synchronized (this) {
            if (this.f9929g) {
                return false;
            }
            if (this.f9938p < this.f9937o) {
                if (j6 >= this.f9940r) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: Q */
    public final C7482p m8806Q(int i6, List list, boolean z6) throws Throwable {
        Throwable th;
        boolean z7 = !z6;
        synchronized (this.f9948z) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f9928f > 1073741823) {
                                try {
                                    m8817g0(ErrorCode.f9886j);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            try {
                                if (this.f9929g) {
                                    throw new ConnectionShutdownException();
                                }
                                int i7 = this.f9928f;
                                this.f9928f = i7 + 2;
                                C7482p c7482p = new C7482p(i7, this, z7, false, null);
                                boolean z8 = !z6 || this.f9945w >= this.f9946x || c7482p.m8572r() >= c7482p.m8571q();
                                if (c7482p.m8575u()) {
                                    this.f9925c.put(Integer.valueOf(i7), c7482p);
                                }
                                Unit unit = Unit.INSTANCE;
                                if (i6 == 0) {
                                    this.f9948z.m8895k(z7, i7, list);
                                } else {
                                    if (this.f9923a) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.f9948z.m8898n(i6, i7, list);
                                }
                                if (z8) {
                                    this.f9948z.flush();
                                }
                                return c7482p;
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

    /* renamed from: R */
    public final C7482p m8807R(List requestHeaders, boolean z6) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return m8806Q(0, requestHeaders, z6);
    }

    /* renamed from: T */
    public final void m8808T(final int i6, BufferedSource source, final int i7, final boolean z6) {
        Intrinsics.checkNotNullParameter(source, "source");
        final Buffer buffer = new Buffer();
        long j6 = i7;
        source.require(j6);
        source.read(buffer, j6);
        C6600c.m7531d(this.f9932j, this.f9926d + '[' + i6 + "] onData", 0L, false, new Function0() { // from class: n5.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7531c.m8761S(this.f9591a, i6, buffer, i7, z6);
            }
        }, 6, null);
    }

    /* renamed from: V */
    public final void m8809V(final int i6, final List requestHeaders, final boolean z6) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        C6600c.m7531d(this.f9932j, this.f9926d + '[' + i6 + "] onHeaders", 0L, false, new Function0() { // from class: n5.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7531c.m8762U(this.f9602a, i6, requestHeaders, z6);
            }
        }, 6, null);
    }

    /* renamed from: X */
    public final void m8810X(final int i6, final List requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.f9922B.contains(Integer.valueOf(i6))) {
                m8824p0(i6, ErrorCode.f9880d);
                return;
            }
            this.f9922B.add(Integer.valueOf(i6));
            C6600c.m7531d(this.f9932j, this.f9926d + '[' + i6 + "] onRequest", 0L, false, new Function0() { // from class: n5.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C7531c.m8763W(this.f9596a, i6, requestHeaders);
                }
            }, 6, null);
        }
    }

    /* renamed from: Z */
    public final void m8811Z(final int i6, final ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        C6600c.m7531d(this.f9932j, this.f9926d + '[' + i6 + "] onReset", 0L, false, new Function0() { // from class: n5.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7531c.m8764Y(this.f9599a, i6, errorCode);
            }
        }, 6, null);
    }

    /* renamed from: a0 */
    public final boolean m8812a0(int i6) {
        return i6 != 0 && (i6 & 1) == 0;
    }

    /* renamed from: b0 */
    public final C7482p m8813b0(int i6) {
        C7482p c7482p;
        synchronized (this) {
            c7482p = (C7482p) this.f9925c.remove(Integer.valueOf(i6));
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
        return c7482p;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m8791B(ErrorCode.f9879c, ErrorCode.f9887k, null);
    }

    /* renamed from: d0 */
    public final void m8814d0() {
        synchronized (this) {
            long j6 = this.f9938p;
            long j7 = this.f9937o;
            if (j6 < j7) {
                return;
            }
            this.f9937o = j7 + 1;
            this.f9940r = System.nanoTime() + InstantKt.NANOS_PER_SECOND;
            Unit unit = Unit.INSTANCE;
            C6600c.m7531d(this.f9931i, this.f9926d + " ping", 0L, false, new Function0() { // from class: n5.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C7531c.m8767c0(this.f9587a);
                }
            }, 6, null);
        }
    }

    /* renamed from: e0 */
    public final void m8815e0(int i6) {
        this.f9927e = i6;
    }

    /* renamed from: f0 */
    public final void m8816f0(C7485s c7485s) {
        Intrinsics.checkNotNullParameter(c7485s, "<set-?>");
        this.f9943u = c7485s;
    }

    public final void flush() {
        this.f9948z.flush();
    }

    /* renamed from: g0 */
    public final void m8817g0(ErrorCode statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f9948z) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (this.f9929g) {
                    return;
                }
                this.f9929g = true;
                int i6 = this.f9927e;
                intRef.element = i6;
                Unit unit = Unit.INSTANCE;
                this.f9948z.m8894j(i6, statusCode, AbstractC6424h.f8094a);
            }
        }
    }

    /* renamed from: h0 */
    public final void m8818h0(boolean z6) {
        if (z6) {
            this.f9948z.m8890c();
            this.f9948z.m8900p(this.f9942t);
            if (this.f9942t.m8605c() != 65535) {
                this.f9948z.m8901q(0, r9 - 65535);
            }
        }
        C6600c.m7531d(this.f9930h.m7558k(), this.f9926d, 0L, false, this.f9921A, 6, null);
    }

    /* renamed from: j0 */
    public final void m8819j0(long j6) {
        synchronized (this) {
            try {
                C7522a.m8683c(this.f9944v, j6, 0L, 2, null);
                long jM8684a = this.f9944v.m8684a();
                if (jM8684a >= this.f9942t.m8605c() / 2) {
                    m8825r0(0, jM8684a);
                    C7522a.m8683c(this.f9944v, 0L, jM8684a, 1, null);
                }
                this.f9941s.mo8730b(this.f9944v);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f9948z.m8896l());
        r6 = r2;
        r8.f9945w += r6;
        r4 = kotlin.Unit.INSTANCE;
     */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8820k0(int r9, boolean r10, okio.Buffer r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.e r12 = r8.f9948z
            r12.m8891g(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.f9945w     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r6 = r8.f9946x     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.Map r2 = r8.f9925c     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
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
            okhttp3.internal.http2.e r4 = r8.f9948z     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.m8896l()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.f9945w     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.f9945w = r4     // Catch: java.lang.Throwable -> L2f
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.e r4 = r8.f9948z
            if (r10 == 0) goto L5d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = r3
        L5e:
            r4.m8891g(r5, r9, r11, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C7531c.m8820k0(int, boolean, okio.Buffer, long):void");
    }

    /* renamed from: l0 */
    public final void m8821l0(int i6, boolean z6, List alternating) {
        Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.f9948z.m8895k(z6, i6, alternating);
    }

    /* renamed from: m0 */
    public final void m8822m0(boolean z6, int i6, int i7) throws IOException {
        try {
            this.f9948z.m8897m(z6, i6, i7);
        } catch (IOException e6) {
            m8792C(e6);
        }
    }

    /* renamed from: n0 */
    public final void m8823n0(int i6, ErrorCode statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.f9948z.m8899o(i6, statusCode);
    }

    /* renamed from: p0 */
    public final void m8824p0(final int i6, final ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        C6600c.m7531d(this.f9931i, this.f9926d + '[' + i6 + "] writeSynReset", 0L, false, new Function0() { // from class: n5.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7531c.m8778o0(this.f9588a, i6, errorCode);
            }
        }, 6, null);
    }

    /* renamed from: r0 */
    public final void m8825r0(final int i6, final long j6) {
        C6600c.m7531d(this.f9931i, this.f9926d + '[' + i6 + "] windowUpdate", 0L, false, new Function0() { // from class: n5.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7531c.m8781q0(this.f9584a, i6, j6);
            }
        }, 6, null);
    }
}
