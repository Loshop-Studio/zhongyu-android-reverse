package p149z2;

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
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import p004a3.C0021k;
import p121s2.AbstractC4550b;
import p133v2.AbstractC4631a;
import p133v2.C4633c;
import p133v2.C4634d;
import p133v2.C4635e;
import p149z2.C4713f;

/* renamed from: z2.d */
/* loaded from: classes2.dex */
public final class C4711d implements Closeable {

    /* renamed from: C */
    public static final C4718k f6103C;

    /* renamed from: D */
    public static final c f6104D = new c(null);

    /* renamed from: A */
    public final e f6105A;

    /* renamed from: B */
    public final Set f6106B;

    /* renamed from: a */
    public final boolean f6107a;

    /* renamed from: b */
    public final d f6108b;

    /* renamed from: c */
    public final Map f6109c;

    /* renamed from: d */
    public final String f6110d;

    /* renamed from: e */
    public int f6111e;

    /* renamed from: f */
    public int f6112f;

    /* renamed from: g */
    public boolean f6113g;

    /* renamed from: h */
    public final C4635e f6114h;

    /* renamed from: i */
    public final C4634d f6115i;

    /* renamed from: j */
    public final C4634d f6116j;

    /* renamed from: k */
    public final C4634d f6117k;

    /* renamed from: l */
    public final InterfaceC4717j f6118l;

    /* renamed from: m */
    public long f6119m;

    /* renamed from: n */
    public long f6120n;

    /* renamed from: o */
    public long f6121o;

    /* renamed from: p */
    public long f6122p;

    /* renamed from: q */
    public long f6123q;

    /* renamed from: r */
    public long f6124r;

    /* renamed from: s */
    public final C4718k f6125s;

    /* renamed from: t */
    public C4718k f6126t;

    /* renamed from: u */
    public long f6127u;

    /* renamed from: v */
    public long f6128v;

    /* renamed from: w */
    public long f6129w;

    /* renamed from: x */
    public long f6130x;

    /* renamed from: y */
    public final Socket f6131y;

    /* renamed from: z */
    public final C4715h f6132z;

    /* renamed from: z2.d$a */
    public static final class a extends AbstractC4631a {

        /* renamed from: e */
        public final /* synthetic */ String f6133e;

        /* renamed from: f */
        public final /* synthetic */ C4711d f6134f;

        /* renamed from: g */
        public final /* synthetic */ long f6135g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, C4711d c4711d, long j4) {
            super(str2, false, 2, null);
            this.f6133e = str;
            this.f6134f = c4711d;
            this.f6135g = j4;
        }

        @Override // p133v2.AbstractC4631a
        /* renamed from: f */
        public long mo6424f() throws IOException {
            boolean z3;
            synchronized (this.f6134f) {
                if (this.f6134f.f6120n < this.f6134f.f6119m) {
                    z3 = true;
                } else {
                    this.f6134f.f6119m++;
                    z3 = false;
                }
            }
            if (z3) {
                this.f6134f.m6789t(null);
                return -1L;
            }
            this.f6134f.m6784X(false, 1, 0);
            return this.f6135g;
        }
    }

    /* renamed from: z2.d$b */
    public static final class b {

        /* renamed from: a */
        public Socket f6136a;

        /* renamed from: b */
        public String f6137b;

        /* renamed from: c */
        public BufferedSource f6138c;

        /* renamed from: d */
        public BufferedSink f6139d;

        /* renamed from: e */
        public d f6140e;

        /* renamed from: f */
        public InterfaceC4717j f6141f;

        /* renamed from: g */
        public int f6142g;

        /* renamed from: h */
        public boolean f6143h;

        /* renamed from: i */
        public final C4635e f6144i;

        public b(boolean z3, C4635e taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f6143h = z3;
            this.f6144i = taskRunner;
            this.f6140e = d.f6145a;
            this.f6141f = InterfaceC4717j.f6275a;
        }

        /* renamed from: a */
        public final C4711d m6796a() {
            return new C4711d(this);
        }

        /* renamed from: b */
        public final boolean m6797b() {
            return this.f6143h;
        }

        /* renamed from: c */
        public final String m6798c() {
            String str = this.f6137b;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            }
            return str;
        }

        /* renamed from: d */
        public final d m6799d() {
            return this.f6140e;
        }

        /* renamed from: e */
        public final int m6800e() {
            return this.f6142g;
        }

        /* renamed from: f */
        public final InterfaceC4717j m6801f() {
            return this.f6141f;
        }

        /* renamed from: g */
        public final BufferedSink m6802g() {
            BufferedSink bufferedSink = this.f6139d;
            if (bufferedSink == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sink");
            }
            return bufferedSink;
        }

        /* renamed from: h */
        public final Socket m6803h() {
            Socket socket = this.f6136a;
            if (socket == null) {
                Intrinsics.throwUninitializedPropertyAccessException("socket");
            }
            return socket;
        }

        /* renamed from: i */
        public final BufferedSource m6804i() {
            BufferedSource bufferedSource = this.f6138c;
            if (bufferedSource == null) {
                Intrinsics.throwUninitializedPropertyAccessException("source");
            }
            return bufferedSource;
        }

        /* renamed from: j */
        public final C4635e m6805j() {
            return this.f6144i;
        }

        /* renamed from: k */
        public final b m6806k(d listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f6140e = listener;
            return this;
        }

        /* renamed from: l */
        public final b m6807l(int i4) {
            this.f6142g = i4;
            return this;
        }

        /* renamed from: m */
        public final b m6808m(Socket socket, String peerName, BufferedSource source, BufferedSink sink) {
            String str;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.f6136a = socket;
            if (this.f6143h) {
                str = AbstractC4550b.f5709i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            this.f6137b = str;
            this.f6138c = source;
            this.f6139d = sink;
            return this;
        }
    }

    /* renamed from: z2.d$c */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C4718k m6809a() {
            return C4711d.f6103C;
        }
    }

    /* renamed from: z2.d$d */
    public static abstract class d {

        /* renamed from: b */
        public static final b f6146b = new b(null);

        /* renamed from: a */
        public static final d f6145a = new a();

        /* renamed from: z2.d$d$a */
        public static final class a extends d {
            @Override // p149z2.C4711d.d
            /* renamed from: b */
            public void mo5594b(C4714g stream) {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.m6857d(ErrorCode.REFUSED_STREAM, null);
            }
        }

        /* renamed from: z2.d$d$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public void mo5593a(C4711d connection, C4718k settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        /* renamed from: b */
        public abstract void mo5594b(C4714g c4714g);
    }

    /* renamed from: z2.d$e */
    public final class e implements C4713f.c, Function0 {

        /* renamed from: a */
        public final C4713f f6147a;

        /* renamed from: b */
        public final /* synthetic */ C4711d f6148b;

        /* renamed from: z2.d$e$a */
        public static final class a extends AbstractC4631a {

            /* renamed from: e */
            public final /* synthetic */ String f6149e;

            /* renamed from: f */
            public final /* synthetic */ boolean f6150f;

            /* renamed from: g */
            public final /* synthetic */ e f6151g;

            /* renamed from: h */
            public final /* synthetic */ Ref.ObjectRef f6152h;

            /* renamed from: i */
            public final /* synthetic */ boolean f6153i;

            /* renamed from: j */
            public final /* synthetic */ C4718k f6154j;

            /* renamed from: k */
            public final /* synthetic */ Ref.LongRef f6155k;

            /* renamed from: l */
            public final /* synthetic */ Ref.ObjectRef f6156l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z3, String str2, boolean z4, e eVar, Ref.ObjectRef objectRef, boolean z5, C4718k c4718k, Ref.LongRef longRef, Ref.ObjectRef objectRef2) {
                super(str2, z4);
                this.f6149e = str;
                this.f6150f = z3;
                this.f6151g = eVar;
                this.f6152h = objectRef;
                this.f6153i = z5;
                this.f6154j = c4718k;
                this.f6155k = longRef;
                this.f6156l = objectRef2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p133v2.AbstractC4631a
            /* renamed from: f */
            public long mo6424f() {
                this.f6151g.f6148b.m6793x().mo5593a(this.f6151g.f6148b, (C4718k) this.f6152h.element);
                return -1L;
            }
        }

        /* renamed from: z2.d$e$b */
        public static final class b extends AbstractC4631a {

            /* renamed from: e */
            public final /* synthetic */ String f6157e;

            /* renamed from: f */
            public final /* synthetic */ boolean f6158f;

            /* renamed from: g */
            public final /* synthetic */ C4714g f6159g;

            /* renamed from: h */
            public final /* synthetic */ e f6160h;

            /* renamed from: i */
            public final /* synthetic */ C4714g f6161i;

            /* renamed from: j */
            public final /* synthetic */ int f6162j;

            /* renamed from: k */
            public final /* synthetic */ List f6163k;

            /* renamed from: l */
            public final /* synthetic */ boolean f6164l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z3, String str2, boolean z4, C4714g c4714g, e eVar, C4714g c4714g2, int i4, List list, boolean z5) {
                super(str2, z4);
                this.f6157e = str;
                this.f6158f = z3;
                this.f6159g = c4714g;
                this.f6160h = eVar;
                this.f6161i = c4714g2;
                this.f6162j = i4;
                this.f6163k = list;
                this.f6164l = z5;
            }

            @Override // p133v2.AbstractC4631a
            /* renamed from: f */
            public long mo6424f() {
                try {
                    this.f6160h.f6148b.m6793x().mo5594b(this.f6159g);
                    return -1L;
                } catch (IOException e4) {
                    C0021k.f39c.m71g().m64j("Http2Connection.Listener failure for " + this.f6160h.f6148b.m6791v(), 4, e4);
                    try {
                        this.f6159g.m6857d(ErrorCode.PROTOCOL_ERROR, e4);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* renamed from: z2.d$e$c */
        public static final class c extends AbstractC4631a {

            /* renamed from: e */
            public final /* synthetic */ String f6165e;

            /* renamed from: f */
            public final /* synthetic */ boolean f6166f;

            /* renamed from: g */
            public final /* synthetic */ e f6167g;

            /* renamed from: h */
            public final /* synthetic */ int f6168h;

            /* renamed from: i */
            public final /* synthetic */ int f6169i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z3, String str2, boolean z4, e eVar, int i4, int i5) {
                super(str2, z4);
                this.f6165e = str;
                this.f6166f = z3;
                this.f6167g = eVar;
                this.f6168h = i4;
                this.f6169i = i5;
            }

            @Override // p133v2.AbstractC4631a
            /* renamed from: f */
            public long mo6424f() throws IOException {
                this.f6167g.f6148b.m6784X(true, this.f6168h, this.f6169i);
                return -1L;
            }
        }

        /* renamed from: z2.d$e$d */
        public static final class d extends AbstractC4631a {

            /* renamed from: e */
            public final /* synthetic */ String f6170e;

            /* renamed from: f */
            public final /* synthetic */ boolean f6171f;

            /* renamed from: g */
            public final /* synthetic */ e f6172g;

            /* renamed from: h */
            public final /* synthetic */ boolean f6173h;

            /* renamed from: i */
            public final /* synthetic */ C4718k f6174i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, boolean z3, String str2, boolean z4, e eVar, boolean z5, C4718k c4718k) {
                super(str2, z4);
                this.f6170e = str;
                this.f6171f = z3;
                this.f6172g = eVar;
                this.f6173h = z5;
                this.f6174i = c4718k;
            }

            @Override // p133v2.AbstractC4631a
            /* renamed from: f */
            public long mo6424f() {
                this.f6172g.m6820k(this.f6173h, this.f6174i);
                return -1L;
            }
        }

        public e(C4711d c4711d, C4713f reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f6148b = c4711d;
            this.f6147a = reader;
        }

        @Override // p149z2.C4713f.c
        /* renamed from: a */
        public void mo6810a() {
        }

        @Override // p149z2.C4713f.c
        /* renamed from: b */
        public void mo6811b(boolean z3, int i4, int i5, List headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f6148b.m6774M(i4)) {
                this.f6148b.m6771J(i4, headerBlock, z3);
                return;
            }
            synchronized (this.f6148b) {
                C4714g c4714gM6763B = this.f6148b.m6763B(i4);
                if (c4714gM6763B != null) {
                    Unit unit = Unit.INSTANCE;
                    c4714gM6763B.m6877x(AbstractC4550b.m6208K(headerBlock), z3);
                    return;
                }
                if (this.f6148b.f6113g) {
                    return;
                }
                if (i4 <= this.f6148b.m6792w()) {
                    return;
                }
                if (i4 % 2 == this.f6148b.m6794y() % 2) {
                    return;
                }
                C4714g c4714g = new C4714g(i4, this.f6148b, false, z3, AbstractC4550b.m6208K(headerBlock));
                this.f6148b.m6777P(i4);
                this.f6148b.m6764C().put(Integer.valueOf(i4), c4714g);
                C4634d c4634dM6451i = this.f6148b.f6114h.m6451i();
                String str = this.f6148b.m6791v() + '[' + i4 + "] onStream";
                c4634dM6451i.m6438i(new b(str, true, str, true, c4714g, this, c4714gM6763B, i4, headerBlock, z3), 0L);
            }
        }

        @Override // p149z2.C4713f.c
        /* renamed from: c */
        public void mo6812c(int i4, long j4) {
            if (i4 != 0) {
                C4714g c4714gM6763B = this.f6148b.m6763B(i4);
                if (c4714gM6763B != null) {
                    synchronized (c4714gM6763B) {
                        c4714gM6763B.m6854a(j4);
                        Unit unit = Unit.INSTANCE;
                    }
                    return;
                }
                return;
            }
            synchronized (this.f6148b) {
                C4711d c4711d = this.f6148b;
                c4711d.f6130x = c4711d.m6765D() + j4;
                C4711d c4711d2 = this.f6148b;
                if (c4711d2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                c4711d2.notifyAll();
                Unit unit2 = Unit.INSTANCE;
            }
        }

        @Override // p149z2.C4713f.c
        /* renamed from: d */
        public void mo6813d(boolean z3, int i4, BufferedSource source, int i5) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f6148b.m6774M(i4)) {
                this.f6148b.m6770I(i4, source, i5, z3);
                return;
            }
            C4714g c4714gM6763B = this.f6148b.m6763B(i4);
            if (c4714gM6763B == null) {
                this.f6148b.m6786Z(i4, ErrorCode.PROTOCOL_ERROR);
                long j4 = i5;
                this.f6148b.m6781U(j4);
                source.skip(j4);
                return;
            }
            c4714gM6763B.m6876w(source, i5);
            if (z3) {
                c4714gM6763B.m6877x(AbstractC4550b.f5702b, true);
            }
        }

        @Override // p149z2.C4713f.c
        /* renamed from: e */
        public void mo6814e(boolean z3, int i4, int i5) {
            if (!z3) {
                C4634d c4634d = this.f6148b.f6115i;
                String str = this.f6148b.m6791v() + " ping";
                c4634d.m6438i(new c(str, true, str, true, this, i4, i5), 0L);
                return;
            }
            synchronized (this.f6148b) {
                if (i4 == 1) {
                    this.f6148b.f6120n++;
                } else if (i4 != 2) {
                    if (i4 == 3) {
                        this.f6148b.f6123q++;
                        C4711d c4711d = this.f6148b;
                        if (c4711d == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                        }
                        c4711d.notifyAll();
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    this.f6148b.f6122p++;
                }
            }
        }

        @Override // p149z2.C4713f.c
        /* renamed from: f */
        public void mo6815f(int i4, int i5, int i6, boolean z3) {
        }

        @Override // p149z2.C4713f.c
        /* renamed from: g */
        public void mo6816g(int i4, ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.f6148b.m6774M(i4)) {
                this.f6148b.m6773L(i4, errorCode);
                return;
            }
            C4714g c4714gM6775N = this.f6148b.m6775N(i4);
            if (c4714gM6775N != null) {
                c4714gM6775N.m6878y(errorCode);
            }
        }

        @Override // p149z2.C4713f.c
        /* renamed from: h */
        public void mo6817h(boolean z3, C4718k settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            C4634d c4634d = this.f6148b.f6115i;
            String str = this.f6148b.m6791v() + " applyAndAckSettings";
            c4634d.m6438i(new d(str, true, str, true, this, z3, settings), 0L);
        }

        @Override // p149z2.C4713f.c
        /* renamed from: i */
        public void mo6818i(int i4, int i5, List requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.f6148b.m6772K(i5, requestHeaders);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m6821l();
            return Unit.INSTANCE;
        }

        @Override // p149z2.C4713f.c
        /* renamed from: j */
        public void mo6819j(int i4, ErrorCode errorCode, ByteString debugData) {
            int i5;
            C4714g[] c4714gArr;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.size();
            synchronized (this.f6148b) {
                Object[] array = this.f6148b.m6764C().values().toArray(new C4714g[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                c4714gArr = (C4714g[]) array;
                this.f6148b.f6113g = true;
                Unit unit = Unit.INSTANCE;
            }
            for (C4714g c4714g : c4714gArr) {
                if (c4714g.m6863j() > i4 && c4714g.m6873t()) {
                    c4714g.m6878y(ErrorCode.REFUSED_STREAM);
                    this.f6148b.m6775N(c4714g.m6863j());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, z2.k] */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* renamed from: k */
        public final void m6820k(boolean z3, C4718k settings) {
            C4711d c4711d;
            ?? r22;
            T t3;
            Intrinsics.checkNotNullParameter(settings, "settings");
            Ref.LongRef longRef = new Ref.LongRef();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            synchronized (this.f6148b.m6766E()) {
                C4711d c4711d2 = this.f6148b;
                synchronized (c4711d2) {
                    try {
                        C4718k c4718kM6762A = this.f6148b.m6762A();
                        if (z3) {
                            r22 = settings;
                        } else {
                            C4718k c4718k = new C4718k();
                            c4718k.m6921g(c4718kM6762A);
                            c4718k.m6921g(settings);
                            Unit unit = Unit.INSTANCE;
                            r22 = c4718k;
                        }
                        objectRef2.element = r22;
                        long jM6917c = r22.m6917c() - c4718kM6762A.m6917c();
                        longRef.element = jM6917c;
                        if (jM6917c == 0 || this.f6148b.m6764C().isEmpty()) {
                            t3 = 0;
                        } else {
                            Object[] array = this.f6148b.m6764C().values().toArray(new C4714g[0]);
                            if (array == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                            t3 = (C4714g[]) array;
                        }
                        objectRef.element = t3;
                        this.f6148b.m6778Q((C4718k) objectRef2.element);
                        C4634d c4634d = this.f6148b.f6117k;
                        String str = this.f6148b.m6791v() + " onSettings";
                        c4711d = c4711d2;
                        try {
                            c4634d.m6438i(new a(str, true, str, true, this, objectRef2, z3, settings, longRef, objectRef), 0L);
                            Unit unit2 = Unit.INSTANCE;
                            try {
                                this.f6148b.m6766E().m6890a((C4718k) objectRef2.element);
                            } catch (IOException e4) {
                                this.f6148b.m6789t(e4);
                            }
                            Unit unit3 = Unit.INSTANCE;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c4711d = c4711d2;
                    }
                }
            }
            T t4 = objectRef.element;
            if (((C4714g[]) t4) != null) {
                C4714g[] c4714gArr = (C4714g[]) t4;
                Intrinsics.checkNotNull(c4714gArr);
                for (C4714g c4714g : c4714gArr) {
                    synchronized (c4714g) {
                        c4714g.m6854a(longRef.element);
                        Unit unit4 = Unit.INSTANCE;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, z2.f] */
        /* renamed from: l */
        public void m6821l() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e4 = null;
            try {
                try {
                    this.f6147a.m6828c(this);
                    while (this.f6147a.m6827b(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        this.f6148b.m6788s(errorCode3, ErrorCode.CANCEL, null);
                        errorCode = errorCode3;
                    } catch (IOException e5) {
                        e4 = e5;
                        ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                        C4711d c4711d = this.f6148b;
                        c4711d.m6788s(errorCode4, errorCode4, e4);
                        errorCode = c4711d;
                        errorCode2 = this.f6147a;
                        AbstractC4550b.m6228j(errorCode2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f6148b.m6788s(errorCode, errorCode2, e4);
                    AbstractC4550b.m6228j(this.f6147a);
                    throw th;
                }
            } catch (IOException e6) {
                e4 = e6;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                this.f6148b.m6788s(errorCode, errorCode2, e4);
                AbstractC4550b.m6228j(this.f6147a);
                throw th;
            }
            errorCode2 = this.f6147a;
            AbstractC4550b.m6228j(errorCode2);
        }
    }

    /* renamed from: z2.d$f */
    public static final class f extends AbstractC4631a {

        /* renamed from: e */
        public final /* synthetic */ String f6175e;

        /* renamed from: f */
        public final /* synthetic */ boolean f6176f;

        /* renamed from: g */
        public final /* synthetic */ C4711d f6177g;

        /* renamed from: h */
        public final /* synthetic */ int f6178h;

        /* renamed from: i */
        public final /* synthetic */ Buffer f6179i;

        /* renamed from: j */
        public final /* synthetic */ int f6180j;

        /* renamed from: k */
        public final /* synthetic */ boolean f6181k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z3, String str2, boolean z4, C4711d c4711d, int i4, Buffer buffer, int i5, boolean z5) {
            super(str2, z4);
            this.f6175e = str;
            this.f6176f = z3;
            this.f6177g = c4711d;
            this.f6178h = i4;
            this.f6179i = buffer;
            this.f6180j = i5;
            this.f6181k = z5;
        }

        @Override // p133v2.AbstractC4631a
        /* renamed from: f */
        public long mo6424f() {
            try {
                boolean zMo6914d = this.f6177g.f6118l.mo6914d(this.f6178h, this.f6179i, this.f6180j, this.f6181k);
                if (zMo6914d) {
                    this.f6177g.m6766E().m6900k(this.f6178h, ErrorCode.CANCEL);
                }
                if (!zMo6914d && !this.f6181k) {
                    return -1L;
                }
                synchronized (this.f6177g) {
                    this.f6177g.f6106B.remove(Integer.valueOf(this.f6178h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: z2.d$g */
    public static final class g extends AbstractC4631a {

        /* renamed from: e */
        public final /* synthetic */ String f6182e;

        /* renamed from: f */
        public final /* synthetic */ boolean f6183f;

        /* renamed from: g */
        public final /* synthetic */ C4711d f6184g;

        /* renamed from: h */
        public final /* synthetic */ int f6185h;

        /* renamed from: i */
        public final /* synthetic */ List f6186i;

        /* renamed from: j */
        public final /* synthetic */ boolean f6187j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z3, String str2, boolean z4, C4711d c4711d, int i4, List list, boolean z5) {
            super(str2, z4);
            this.f6182e = str;
            this.f6183f = z3;
            this.f6184g = c4711d;
            this.f6185h = i4;
            this.f6186i = list;
            this.f6187j = z5;
        }

        @Override // p133v2.AbstractC4631a
        /* renamed from: f */
        public long mo6424f() {
            boolean zMo6912b = this.f6184g.f6118l.mo6912b(this.f6185h, this.f6186i, this.f6187j);
            if (zMo6912b) {
                try {
                    this.f6184g.m6766E().m6900k(this.f6185h, ErrorCode.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zMo6912b && !this.f6187j) {
                return -1L;
            }
            synchronized (this.f6184g) {
                this.f6184g.f6106B.remove(Integer.valueOf(this.f6185h));
            }
            return -1L;
        }
    }

    /* renamed from: z2.d$h */
    public static final class h extends AbstractC4631a {

        /* renamed from: e */
        public final /* synthetic */ String f6188e;

        /* renamed from: f */
        public final /* synthetic */ boolean f6189f;

        /* renamed from: g */
        public final /* synthetic */ C4711d f6190g;

        /* renamed from: h */
        public final /* synthetic */ int f6191h;

        /* renamed from: i */
        public final /* synthetic */ List f6192i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z3, String str2, boolean z4, C4711d c4711d, int i4, List list) {
            super(str2, z4);
            this.f6188e = str;
            this.f6189f = z3;
            this.f6190g = c4711d;
            this.f6191h = i4;
            this.f6192i = list;
        }

        @Override // p133v2.AbstractC4631a
        /* renamed from: f */
        public long mo6424f() {
            if (!this.f6190g.f6118l.mo6911a(this.f6191h, this.f6192i)) {
                return -1L;
            }
            try {
                this.f6190g.m6766E().m6900k(this.f6191h, ErrorCode.CANCEL);
                synchronized (this.f6190g) {
                    this.f6190g.f6106B.remove(Integer.valueOf(this.f6191h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: z2.d$i */
    public static final class i extends AbstractC4631a {

        /* renamed from: e */
        public final /* synthetic */ String f6193e;

        /* renamed from: f */
        public final /* synthetic */ boolean f6194f;

        /* renamed from: g */
        public final /* synthetic */ C4711d f6195g;

        /* renamed from: h */
        public final /* synthetic */ int f6196h;

        /* renamed from: i */
        public final /* synthetic */ ErrorCode f6197i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z3, String str2, boolean z4, C4711d c4711d, int i4, ErrorCode errorCode) {
            super(str2, z4);
            this.f6193e = str;
            this.f6194f = z3;
            this.f6195g = c4711d;
            this.f6196h = i4;
            this.f6197i = errorCode;
        }

        @Override // p133v2.AbstractC4631a
        /* renamed from: f */
        public long mo6424f() {
            this.f6195g.f6118l.mo6913c(this.f6196h, this.f6197i);
            synchronized (this.f6195g) {
                this.f6195g.f6106B.remove(Integer.valueOf(this.f6196h));
                Unit unit = Unit.INSTANCE;
            }
            return -1L;
        }
    }

    /* renamed from: z2.d$j */
    public static final class j extends AbstractC4631a {

        /* renamed from: e */
        public final /* synthetic */ String f6198e;

        /* renamed from: f */
        public final /* synthetic */ boolean f6199f;

        /* renamed from: g */
        public final /* synthetic */ C4711d f6200g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z3, String str2, boolean z4, C4711d c4711d) {
            super(str2, z4);
            this.f6198e = str;
            this.f6199f = z3;
            this.f6200g = c4711d;
        }

        @Override // p133v2.AbstractC4631a
        /* renamed from: f */
        public long mo6424f() throws IOException {
            this.f6200g.m6784X(false, 2, 0);
            return -1L;
        }
    }

    /* renamed from: z2.d$k */
    public static final class k extends AbstractC4631a {

        /* renamed from: e */
        public final /* synthetic */ String f6201e;

        /* renamed from: f */
        public final /* synthetic */ boolean f6202f;

        /* renamed from: g */
        public final /* synthetic */ C4711d f6203g;

        /* renamed from: h */
        public final /* synthetic */ int f6204h;

        /* renamed from: i */
        public final /* synthetic */ ErrorCode f6205i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z3, String str2, boolean z4, C4711d c4711d, int i4, ErrorCode errorCode) {
            super(str2, z4);
            this.f6201e = str;
            this.f6202f = z3;
            this.f6203g = c4711d;
            this.f6204h = i4;
            this.f6205i = errorCode;
        }

        @Override // p133v2.AbstractC4631a
        /* renamed from: f */
        public long mo6424f() throws IOException {
            try {
                this.f6203g.m6785Y(this.f6204h, this.f6205i);
                return -1L;
            } catch (IOException e4) {
                this.f6203g.m6789t(e4);
                return -1L;
            }
        }
    }

    /* renamed from: z2.d$l */
    public static final class l extends AbstractC4631a {

        /* renamed from: e */
        public final /* synthetic */ String f6206e;

        /* renamed from: f */
        public final /* synthetic */ boolean f6207f;

        /* renamed from: g */
        public final /* synthetic */ C4711d f6208g;

        /* renamed from: h */
        public final /* synthetic */ int f6209h;

        /* renamed from: i */
        public final /* synthetic */ long f6210i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z3, String str2, boolean z4, C4711d c4711d, int i4, long j4) {
            super(str2, z4);
            this.f6206e = str;
            this.f6207f = z3;
            this.f6208g = c4711d;
            this.f6209h = i4;
            this.f6210i = j4;
        }

        @Override // p133v2.AbstractC4631a
        /* renamed from: f */
        public long mo6424f() throws IOException {
            try {
                this.f6208g.m6766E().m6902m(this.f6209h, this.f6210i);
                return -1L;
            } catch (IOException e4) {
                this.f6208g.m6789t(e4);
                return -1L;
            }
        }
    }

    static {
        C4718k c4718k = new C4718k();
        c4718k.m6922h(7, 65535);
        c4718k.m6922h(5, 16384);
        f6103C = c4718k;
    }

    public C4711d(b builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean zM6797b = builder.m6797b();
        this.f6107a = zM6797b;
        this.f6108b = builder.m6799d();
        this.f6109c = new LinkedHashMap();
        String strM6798c = builder.m6798c();
        this.f6110d = strM6798c;
        this.f6112f = builder.m6797b() ? 3 : 2;
        C4635e c4635eM6805j = builder.m6805j();
        this.f6114h = c4635eM6805j;
        C4634d c4634dM6451i = c4635eM6805j.m6451i();
        this.f6115i = c4634dM6451i;
        this.f6116j = c4635eM6805j.m6451i();
        this.f6117k = c4635eM6805j.m6451i();
        this.f6118l = builder.m6801f();
        C4718k c4718k = new C4718k();
        if (builder.m6797b()) {
            c4718k.m6922h(7, 16777216);
        }
        Unit unit = Unit.INSTANCE;
        this.f6125s = c4718k;
        this.f6126t = f6103C;
        this.f6130x = r2.m6917c();
        this.f6131y = builder.m6803h();
        this.f6132z = new C4715h(builder.m6802g(), zM6797b);
        this.f6105A = new e(this, new C4713f(builder.m6804i(), zM6797b));
        this.f6106B = new LinkedHashSet();
        if (builder.m6800e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.m6800e());
            String str = strM6798c + " ping";
            c4634dM6451i.m6438i(new a(str, str, this, nanos), nanos);
        }
    }

    /* renamed from: T */
    public static /* synthetic */ void m6743T(C4711d c4711d, boolean z3, C4635e c4635e, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = true;
        }
        if ((i4 & 2) != 0) {
            c4635e = C4635e.f5849h;
        }
        c4711d.m6780S(z3, c4635e);
    }

    /* renamed from: A */
    public final C4718k m6762A() {
        return this.f6126t;
    }

    /* renamed from: B */
    public final synchronized C4714g m6763B(int i4) {
        return (C4714g) this.f6109c.get(Integer.valueOf(i4));
    }

    /* renamed from: C */
    public final Map m6764C() {
        return this.f6109c;
    }

    /* renamed from: D */
    public final long m6765D() {
        return this.f6130x;
    }

    /* renamed from: E */
    public final C4715h m6766E() {
        return this.f6132z;
    }

    /* renamed from: F */
    public final synchronized boolean m6767F(long j4) {
        if (this.f6113g) {
            return false;
        }
        if (this.f6122p < this.f6121o) {
            if (j4 >= this.f6124r) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public final C4714g m6768G(int i4, List list, boolean z3) {
        int i5;
        C4714g c4714g;
        boolean z4;
        boolean z5 = !z3;
        synchronized (this.f6132z) {
            synchronized (this) {
                if (this.f6112f > 1073741823) {
                    m6779R(ErrorCode.REFUSED_STREAM);
                }
                if (this.f6113g) {
                    throw new ConnectionShutdownException();
                }
                i5 = this.f6112f;
                this.f6112f = i5 + 2;
                c4714g = new C4714g(i5, this, z5, false, null);
                z4 = !z3 || this.f6129w >= this.f6130x || c4714g.m6871r() >= c4714g.m6870q();
                if (c4714g.m6874u()) {
                    this.f6109c.put(Integer.valueOf(i5), c4714g);
                }
                Unit unit = Unit.INSTANCE;
            }
            if (i4 == 0) {
                this.f6132z.m6896g(z5, i5, list);
            } else {
                if (!(true ^ this.f6107a)) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                }
                this.f6132z.m6899j(i4, i5, list);
            }
        }
        if (z4) {
            this.f6132z.flush();
        }
        return c4714g;
    }

    /* renamed from: H */
    public final C4714g m6769H(List requestHeaders, boolean z3) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return m6768G(0, requestHeaders, z3);
    }

    /* renamed from: I */
    public final void m6770I(int i4, BufferedSource source, int i5, boolean z3) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Buffer buffer = new Buffer();
        long j4 = i5;
        source.require(j4);
        source.read(buffer, j4);
        C4634d c4634d = this.f6116j;
        String str = this.f6110d + '[' + i4 + "] onData";
        c4634d.m6438i(new f(str, true, str, true, this, i4, buffer, i5, z3), 0L);
    }

    /* renamed from: J */
    public final void m6771J(int i4, List requestHeaders, boolean z3) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        C4634d c4634d = this.f6116j;
        String str = this.f6110d + '[' + i4 + "] onHeaders";
        c4634d.m6438i(new g(str, true, str, true, this, i4, requestHeaders, z3), 0L);
    }

    /* renamed from: K */
    public final void m6772K(int i4, List requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.f6106B.contains(Integer.valueOf(i4))) {
                m6786Z(i4, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.f6106B.add(Integer.valueOf(i4));
            C4634d c4634d = this.f6116j;
            String str = this.f6110d + '[' + i4 + "] onRequest";
            c4634d.m6438i(new h(str, true, str, true, this, i4, requestHeaders), 0L);
        }
    }

    /* renamed from: L */
    public final void m6773L(int i4, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        C4634d c4634d = this.f6116j;
        String str = this.f6110d + '[' + i4 + "] onReset";
        c4634d.m6438i(new i(str, true, str, true, this, i4, errorCode), 0L);
    }

    /* renamed from: M */
    public final boolean m6774M(int i4) {
        return i4 != 0 && (i4 & 1) == 0;
    }

    /* renamed from: N */
    public final synchronized C4714g m6775N(int i4) {
        C4714g c4714g;
        c4714g = (C4714g) this.f6109c.remove(Integer.valueOf(i4));
        notifyAll();
        return c4714g;
    }

    /* renamed from: O */
    public final void m6776O() {
        synchronized (this) {
            long j4 = this.f6122p;
            long j5 = this.f6121o;
            if (j4 < j5) {
                return;
            }
            this.f6121o = j5 + 1;
            this.f6124r = System.nanoTime() + 1000000000;
            Unit unit = Unit.INSTANCE;
            C4634d c4634d = this.f6115i;
            String str = this.f6110d + " ping";
            c4634d.m6438i(new j(str, true, str, true, this), 0L);
        }
    }

    /* renamed from: P */
    public final void m6777P(int i4) {
        this.f6111e = i4;
    }

    /* renamed from: Q */
    public final void m6778Q(C4718k c4718k) {
        Intrinsics.checkNotNullParameter(c4718k, "<set-?>");
        this.f6126t = c4718k;
    }

    /* renamed from: R */
    public final void m6779R(ErrorCode statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f6132z) {
            synchronized (this) {
                if (this.f6113g) {
                    return;
                }
                this.f6113g = true;
                int i4 = this.f6111e;
                Unit unit = Unit.INSTANCE;
                this.f6132z.m6895f(i4, statusCode, AbstractC4550b.f5701a);
            }
        }
    }

    /* renamed from: S */
    public final void m6780S(boolean z3, C4635e taskRunner) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        if (z3) {
            this.f6132z.m6891b();
            this.f6132z.m6901l(this.f6125s);
            if (this.f6125s.m6917c() != 65535) {
                this.f6132z.m6902m(0, r7 - 65535);
            }
        }
        C4634d c4634dM6451i = taskRunner.m6451i();
        String str = this.f6110d;
        c4634dM6451i.m6438i(new C4633c(this.f6105A, str, true, str, true), 0L);
    }

    /* renamed from: U */
    public final synchronized void m6781U(long j4) {
        long j5 = this.f6127u + j4;
        this.f6127u = j5;
        long j6 = j5 - this.f6128v;
        if (j6 >= this.f6125s.m6917c() / 2) {
            m6787a0(0, j6);
            this.f6128v += j6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f6132z.m6897h());
        r6 = r2;
        r8.f6129w += r6;
        r4 = kotlin.Unit.INSTANCE;
     */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6782V(int r9, boolean r10, okio.Buffer r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            z2.h r12 = r8.f6132z
            r12.m6892c(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6c
            monitor-enter(r8)
        L12:
            long r4 = r8.f6129w     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            long r6 = r8.f6130x     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L32
            java.util.Map r2 = r8.f6109c     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            throw r9     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
        L32:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L5b
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L5b
            z2.h r4 = r8.f6132z     // Catch: java.lang.Throwable -> L5b
            int r4 = r4.m6897h()     // Catch: java.lang.Throwable -> L5b
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L5b
            long r4 = r8.f6129w     // Catch: java.lang.Throwable -> L5b
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L5b
            long r4 = r4 + r6
            r8.f6129w = r4     // Catch: java.lang.Throwable -> L5b
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r8)
            long r12 = r12 - r6
            z2.h r4 = r8.f6132z
            if (r10 == 0) goto L56
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = r3
        L57:
            r4.m6892c(r5, r9, r11, r2)
            goto Ld
        L5b:
            r9 = move-exception
            goto L6a
        L5d:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5b
            r9.interrupt()     // Catch: java.lang.Throwable -> L5b
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L5b
            r9.<init>()     // Catch: java.lang.Throwable -> L5b
            throw r9     // Catch: java.lang.Throwable -> L5b
        L6a:
            monitor-exit(r8)
            throw r9
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p149z2.C4711d.m6782V(int, boolean, okio.Buffer, long):void");
    }

    /* renamed from: W */
    public final void m6783W(int i4, boolean z3, List alternating) {
        Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.f6132z.m6896g(z3, i4, alternating);
    }

    /* renamed from: X */
    public final void m6784X(boolean z3, int i4, int i5) throws IOException {
        try {
            this.f6132z.m6898i(z3, i4, i5);
        } catch (IOException e4) {
            m6789t(e4);
        }
    }

    /* renamed from: Y */
    public final void m6785Y(int i4, ErrorCode statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.f6132z.m6900k(i4, statusCode);
    }

    /* renamed from: Z */
    public final void m6786Z(int i4, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        C4634d c4634d = this.f6115i;
        String str = this.f6110d + '[' + i4 + "] writeSynReset";
        c4634d.m6438i(new k(str, true, str, true, this, i4, errorCode), 0L);
    }

    /* renamed from: a0 */
    public final void m6787a0(int i4, long j4) {
        C4634d c4634d = this.f6115i;
        String str = this.f6110d + '[' + i4 + "] windowUpdate";
        c4634d.m6438i(new l(str, true, str, true, this, i4, j4), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m6788s(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void flush() {
        this.f6132z.flush();
    }

    /* renamed from: s */
    public final void m6788s(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) throws IOException {
        int i4;
        C4714g[] c4714gArr;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (AbstractC4550b.f5708h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        try {
            m6779R(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f6109c.isEmpty()) {
                Object[] array = this.f6109c.values().toArray(new C4714g[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                c4714gArr = (C4714g[]) array;
                this.f6109c.clear();
            } else {
                c4714gArr = null;
            }
            Unit unit = Unit.INSTANCE;
        }
        if (c4714gArr != null) {
            for (C4714g c4714g : c4714gArr) {
                try {
                    c4714g.m6857d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f6132z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f6131y.close();
        } catch (IOException unused4) {
        }
        this.f6115i.m6442n();
        this.f6116j.m6442n();
        this.f6117k.m6442n();
    }

    /* renamed from: t */
    public final void m6789t(IOException iOException) throws IOException {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        m6788s(errorCode, errorCode, iOException);
    }

    /* renamed from: u */
    public final boolean m6790u() {
        return this.f6107a;
    }

    /* renamed from: v */
    public final String m6791v() {
        return this.f6110d;
    }

    /* renamed from: w */
    public final int m6792w() {
        return this.f6111e;
    }

    /* renamed from: x */
    public final d m6793x() {
        return this.f6108b;
    }

    /* renamed from: y */
    public final int m6794y() {
        return this.f6112f;
    }

    /* renamed from: z */
    public final C4718k m6795z() {
        return this.f6125s;
    }
}
