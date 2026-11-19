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
import okhttp3.internal.http2.C8742c;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import p028b9.AbstractC5070d;
import p081e9.AbstractC7416a;
import p081e9.C7418c;
import p081e9.C7419d;
import p081e9.C7420e;
import p125i9.C7719d;
import p125i9.C7722g;
import p125i9.InterfaceC7721f;
import p136j9.C7828j;

/* renamed from: okhttp3.internal.http2.b */
/* loaded from: classes5.dex */
public final class C8741b implements Closeable {

    /* renamed from: C */
    public static final b f14752C = new b(null);

    /* renamed from: D */
    public static final C7722g f14753D;

    /* renamed from: A */
    public final d f14754A;

    /* renamed from: B */
    public final Set f14755B;

    /* renamed from: a */
    public final boolean f14756a;

    /* renamed from: b */
    public final c f14757b;

    /* renamed from: c */
    public final Map f14758c;

    /* renamed from: d */
    public final String f14759d;

    /* renamed from: e */
    public int f14760e;

    /* renamed from: f */
    public int f14761f;

    /* renamed from: g */
    public boolean f14762g;

    /* renamed from: h */
    public final C7420e f14763h;

    /* renamed from: i */
    public final C7419d f14764i;

    /* renamed from: j */
    public final C7419d f14765j;

    /* renamed from: k */
    public final C7419d f14766k;

    /* renamed from: l */
    public final InterfaceC7721f f14767l;

    /* renamed from: m */
    public long f14768m;

    /* renamed from: n */
    public long f14769n;

    /* renamed from: o */
    public long f14770o;

    /* renamed from: p */
    public long f14771p;

    /* renamed from: q */
    public long f14772q;

    /* renamed from: r */
    public long f14773r;

    /* renamed from: s */
    public final C7722g f14774s;

    /* renamed from: t */
    public C7722g f14775t;

    /* renamed from: u */
    public long f14776u;

    /* renamed from: v */
    public long f14777v;

    /* renamed from: w */
    public long f14778w;

    /* renamed from: x */
    public long f14779x;

    /* renamed from: y */
    public final Socket f14780y;

    /* renamed from: z */
    public final C8743d f14781z;

    /* renamed from: okhttp3.internal.http2.b$a */
    public static final class a {

        /* renamed from: a */
        public boolean f14782a;

        /* renamed from: b */
        public final C7420e f14783b;

        /* renamed from: c */
        public Socket f14784c;

        /* renamed from: d */
        public String f14785d;

        /* renamed from: e */
        public BufferedSource f14786e;

        /* renamed from: f */
        public BufferedSink f14787f;

        /* renamed from: g */
        public c f14788g;

        /* renamed from: h */
        public InterfaceC7721f f14789h;

        /* renamed from: i */
        public int f14790i;

        public a(boolean z9, C7420e taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f14782a = z9;
            this.f14783b = taskRunner;
            this.f14788g = c.f14792b;
            this.f14789h = InterfaceC7721f.f13149b;
        }

        /* renamed from: a */
        public final C8741b m14544a() {
            return new C8741b(this);
        }

        /* renamed from: b */
        public final boolean m14545b() {
            return this.f14782a;
        }

        /* renamed from: c */
        public final String m14546c() {
            String str = this.f14785d;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }

        /* renamed from: d */
        public final c m14547d() {
            return this.f14788g;
        }

        /* renamed from: e */
        public final int m14548e() {
            return this.f14790i;
        }

        /* renamed from: f */
        public final InterfaceC7721f m14549f() {
            return this.f14789h;
        }

        /* renamed from: g */
        public final BufferedSink m14550g() {
            BufferedSink bufferedSink = this.f14787f;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        /* renamed from: h */
        public final Socket m14551h() {
            Socket socket = this.f14784c;
            if (socket != null) {
                return socket;
            }
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        /* renamed from: i */
        public final BufferedSource m14552i() {
            BufferedSource bufferedSource = this.f14786e;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            Intrinsics.throwUninitializedPropertyAccessException("source");
            return null;
        }

        /* renamed from: j */
        public final C7420e m14553j() {
            return this.f14783b;
        }

        /* renamed from: k */
        public final a m14554k(c listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f14788g = listener;
            return this;
        }

        /* renamed from: l */
        public final a m14555l(int i10) {
            this.f14790i = i10;
            return this;
        }

        /* renamed from: m */
        public final void m14556m(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f14785d = str;
        }

        /* renamed from: n */
        public final void m14557n(BufferedSink bufferedSink) {
            Intrinsics.checkNotNullParameter(bufferedSink, "<set-?>");
            this.f14787f = bufferedSink;
        }

        /* renamed from: o */
        public final void m14558o(Socket socket) {
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.f14784c = socket;
        }

        /* renamed from: p */
        public final void m14559p(BufferedSource bufferedSource) {
            Intrinsics.checkNotNullParameter(bufferedSource, "<set-?>");
            this.f14786e = bufferedSource;
        }

        /* renamed from: q */
        public final a m14560q(Socket socket, String peerName, BufferedSource source, BufferedSink sink) {
            String str;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            m14558o(socket);
            if (this.f14782a) {
                str = AbstractC5070d.f2641i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            m14556m(str);
            m14559p(source);
            m14557n(sink);
            return this;
        }
    }

    /* renamed from: okhttp3.internal.http2.b$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7722g m14561a() {
            return C8741b.f14753D;
        }

        public b() {
        }
    }

    /* renamed from: okhttp3.internal.http2.b$c */
    public static abstract class c {

        /* renamed from: a */
        public static final b f14791a = new b(null);

        /* renamed from: b */
        public static final c f14792b = new a();

        /* renamed from: okhttp3.internal.http2.b$c$a */
        public static final class a extends c {
            @Override // okhttp3.internal.http2.C8741b.c
            /* renamed from: b */
            public void mo14432b(C7719d stream) {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.m12908d(ErrorCode.REFUSED_STREAM, null);
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
        public void mo14431a(C8741b connection, C7722g settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        /* renamed from: b */
        public abstract void mo14432b(C7719d c7719d);
    }

    /* renamed from: okhttp3.internal.http2.b$d */
    public final class d implements C8742c.c, Function0 {

        /* renamed from: a */
        public final C8742c f14793a;

        /* renamed from: b */
        public final /* synthetic */ C8741b f14794b;

        /* renamed from: okhttp3.internal.http2.b$d$a */
        public static final class a extends AbstractC7416a {

            /* renamed from: e */
            public final /* synthetic */ C8741b f14795e;

            /* renamed from: f */
            public final /* synthetic */ Ref.ObjectRef f14796f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z9, C8741b c8741b, Ref.ObjectRef objectRef) {
                super(str, z9);
                this.f14795e = c8741b;
                this.f14796f = objectRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p081e9.AbstractC7416a
            /* renamed from: f */
            public long mo11916f() {
                this.f14795e.m14511B().mo14431a(this.f14795e, (C7722g) this.f14796f.element);
                return -1L;
            }
        }

        /* renamed from: okhttp3.internal.http2.b$d$b */
        public static final class b extends AbstractC7416a {

            /* renamed from: e */
            public final /* synthetic */ C8741b f14797e;

            /* renamed from: f */
            public final /* synthetic */ C7719d f14798f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z9, C8741b c8741b, C7719d c7719d) {
                super(str, z9);
                this.f14797e = c8741b;
                this.f14798f = c7719d;
            }

            @Override // p081e9.AbstractC7416a
            /* renamed from: f */
            public long mo11916f() {
                try {
                    this.f14797e.m14511B().mo14432b(this.f14798f);
                    return -1L;
                } catch (IOException e10) {
                    C7828j.f13560a.m13291g().m13284j("Http2Connection.Listener failure for " + this.f14797e.m14543z(), 4, e10);
                    try {
                        this.f14798f.m12908d(ErrorCode.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* renamed from: okhttp3.internal.http2.b$d$c */
        public static final class c extends AbstractC7416a {

            /* renamed from: e */
            public final /* synthetic */ C8741b f14799e;

            /* renamed from: f */
            public final /* synthetic */ int f14800f;

            /* renamed from: g */
            public final /* synthetic */ int f14801g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z9, C8741b c8741b, int i10, int i11) {
                super(str, z9);
                this.f14799e = c8741b;
                this.f14800f = i10;
                this.f14801g = i11;
            }

            @Override // p081e9.AbstractC7416a
            /* renamed from: f */
            public long mo11916f() throws IOException {
                this.f14799e.m14536b0(true, this.f14800f, this.f14801g);
                return -1L;
            }
        }

        /* renamed from: okhttp3.internal.http2.b$d$d, reason: collision with other inner class name */
        public static final class C10155d extends AbstractC7416a {

            /* renamed from: e */
            public final /* synthetic */ d f14802e;

            /* renamed from: f */
            public final /* synthetic */ boolean f14803f;

            /* renamed from: g */
            public final /* synthetic */ C7722g f14804g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10155d(String str, boolean z9, d dVar, boolean z10, C7722g c7722g) {
                super(str, z9);
                this.f14802e = dVar;
                this.f14803f = z10;
                this.f14804g = c7722g;
            }

            @Override // p081e9.AbstractC7416a
            /* renamed from: f */
            public long mo11916f() {
                this.f14802e.m14572k(this.f14803f, this.f14804g);
                return -1L;
            }
        }

        public d(C8741b c8741b, C8742c reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f14794b = c8741b;
            this.f14793a = reader;
        }

        @Override // okhttp3.internal.http2.C8742c.c
        /* renamed from: a */
        public void mo14562a(boolean z9, int i10, int i11, List headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f14794b.m14526Q(i10)) {
                this.f14794b.m14523N(i10, headerBlock, z9);
                return;
            }
            C8741b c8741b = this.f14794b;
            synchronized (c8741b) {
                C7719d c7719dM14515F = c8741b.m14515F(i10);
                if (c7719dM14515F != null) {
                    Unit unit = Unit.INSTANCE;
                    c7719dM14515F.m12928x(AbstractC5070d.m2625P(headerBlock), z9);
                    return;
                }
                if (c8741b.f14762g) {
                    return;
                }
                if (i10 <= c8741b.m14510A()) {
                    return;
                }
                if (i10 % 2 == c8741b.m14512C() % 2) {
                    return;
                }
                C7719d c7719d = new C7719d(i10, c8741b, false, z9, AbstractC5070d.m2625P(headerBlock));
                c8741b.m14529T(i10);
                c8741b.m14516G().put(Integer.valueOf(i10), c7719d);
                c8741b.f14763h.m11943i().m11930i(new b(c8741b.m14543z() + '[' + i10 + "] onStream", true, c8741b, c7719d), 0L);
            }
        }

        @Override // okhttp3.internal.http2.C8742c.c
        /* renamed from: b */
        public void mo14563b(int i10, long j10) {
            if (i10 == 0) {
                C8741b c8741b = this.f14794b;
                synchronized (c8741b) {
                    c8741b.f14779x = c8741b.m14517H() + j10;
                    Intrinsics.checkNotNull(c8741b, "null cannot be cast to non-null type java.lang.Object");
                    c8741b.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            C7719d c7719dM14515F = this.f14794b.m14515F(i10);
            if (c7719dM14515F != null) {
                synchronized (c7719dM14515F) {
                    c7719dM14515F.m12905a(j10);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }

        @Override // okhttp3.internal.http2.C8742c.c
        /* renamed from: c */
        public void mo14564c(int i10, int i11, List requestHeaders) throws Throwable {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.f14794b.m14524O(i11, requestHeaders);
        }

        @Override // okhttp3.internal.http2.C8742c.c
        /* renamed from: d */
        public void mo14565d() {
        }

        @Override // okhttp3.internal.http2.C8742c.c
        /* renamed from: e */
        public void mo14566e(boolean z9, C7722g settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f14794b.f14764i.m11930i(new C10155d(this.f14794b.m14543z() + " applyAndAckSettings", true, this, z9, settings), 0L);
        }

        @Override // okhttp3.internal.http2.C8742c.c
        /* renamed from: f */
        public void mo14567f(boolean z9, int i10, BufferedSource source, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f14794b.m14526Q(i10)) {
                this.f14794b.m14522M(i10, source, i11, z9);
                return;
            }
            C7719d c7719dM14515F = this.f14794b.m14515F(i10);
            if (c7719dM14515F == null) {
                this.f14794b.m14538d0(i10, ErrorCode.PROTOCOL_ERROR);
                long j10 = i11;
                this.f14794b.m14533Y(j10);
                source.skip(j10);
                return;
            }
            c7719dM14515F.m12927w(source, i11);
            if (z9) {
                c7719dM14515F.m12928x(AbstractC5070d.f2634b, true);
            }
        }

        @Override // okhttp3.internal.http2.C8742c.c
        /* renamed from: g */
        public void mo14568g(boolean z9, int i10, int i11) {
            if (!z9) {
                this.f14794b.f14764i.m11930i(new c(this.f14794b.m14543z() + " ping", true, this.f14794b, i10, i11), 0L);
                return;
            }
            C8741b c8741b = this.f14794b;
            synchronized (c8741b) {
                try {
                    if (i10 == 1) {
                        c8741b.f14769n++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            c8741b.f14772q++;
                            Intrinsics.checkNotNull(c8741b, "null cannot be cast to non-null type java.lang.Object");
                            c8741b.notifyAll();
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        c8741b.f14771p++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.C8742c.c
        /* renamed from: h */
        public void mo14569h(int i10, int i11, int i12, boolean z9) {
        }

        @Override // okhttp3.internal.http2.C8742c.c
        /* renamed from: i */
        public void mo14570i(int i10, ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.f14794b.m14526Q(i10)) {
                this.f14794b.m14525P(i10, errorCode);
                return;
            }
            C7719d c7719dM14527R = this.f14794b.m14527R(i10);
            if (c7719dM14527R != null) {
                c7719dM14527R.m12929y(errorCode);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m14573l();
            return Unit.INSTANCE;
        }

        @Override // okhttp3.internal.http2.C8742c.c
        /* renamed from: j */
        public void mo14571j(int i10, ErrorCode errorCode, ByteString debugData) {
            int i11;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.size();
            C8741b c8741b = this.f14794b;
            synchronized (c8741b) {
                array = c8741b.m14516G().values().toArray(new C7719d[0]);
                c8741b.f14762g = true;
                Unit unit = Unit.INSTANCE;
            }
            for (C7719d c7719d : (C7719d[]) array) {
                if (c7719d.m12914j() > i10 && c7719d.m12924t()) {
                    c7719d.m12929y(ErrorCode.REFUSED_STREAM);
                    this.f14794b.m14527R(c7719d.m12914j());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, i9.g] */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* renamed from: k */
        public final void m14572k(boolean z9, C7722g settings) {
            ?? r13;
            long jM12954c;
            int i10;
            C7719d[] c7719dArr;
            Intrinsics.checkNotNullParameter(settings, "settings");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            C8743d c8743dM14518I = this.f14794b.m14518I();
            C8741b c8741b = this.f14794b;
            synchronized (c8743dM14518I) {
                synchronized (c8741b) {
                    try {
                        C7722g c7722gM14514E = c8741b.m14514E();
                        if (z9) {
                            r13 = settings;
                        } else {
                            C7722g c7722g = new C7722g();
                            c7722g.m12958g(c7722gM14514E);
                            c7722g.m12958g(settings);
                            r13 = c7722g;
                        }
                        objectRef.element = r13;
                        jM12954c = r13.m12954c() - c7722gM14514E.m12954c();
                        c7719dArr = (jM12954c == 0 || c8741b.m14516G().isEmpty()) ? null : (C7719d[]) c8741b.m14516G().values().toArray(new C7719d[0]);
                        c8741b.m14530U((C7722g) objectRef.element);
                        c8741b.f14766k.m11930i(new a(c8741b.m14543z() + " onSettings", true, c8741b, objectRef), 0L);
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    c8741b.m14518I().m14597a((C7722g) objectRef.element);
                } catch (IOException e10) {
                    c8741b.m14541x(e10);
                }
                Unit unit2 = Unit.INSTANCE;
            }
            if (c7719dArr != null) {
                for (C7719d c7719d : c7719dArr) {
                    synchronized (c7719d) {
                        c7719d.m12905a(jM12954c);
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
        public void m14573l() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f14793a.m14576g(this);
                    while (this.f14793a.m14575f(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        this.f14794b.m14540w(errorCode3, ErrorCode.CANCEL, null);
                        errorCode = errorCode3;
                    } catch (IOException e11) {
                        e10 = e11;
                        ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                        C8741b c8741b = this.f14794b;
                        c8741b.m14540w(errorCode4, errorCode4, e10);
                        errorCode = c8741b;
                        errorCode2 = this.f14793a;
                        AbstractC5070d.m2648m(errorCode2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f14794b.m14540w(errorCode, errorCode2, e10);
                    AbstractC5070d.m2648m(this.f14793a);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                this.f14794b.m14540w(errorCode, errorCode2, e10);
                AbstractC5070d.m2648m(this.f14793a);
                throw th;
            }
            errorCode2 = this.f14793a;
            AbstractC5070d.m2648m(errorCode2);
        }
    }

    /* renamed from: okhttp3.internal.http2.b$e */
    public static final class e extends AbstractC7416a {

        /* renamed from: e */
        public final /* synthetic */ C8741b f14805e;

        /* renamed from: f */
        public final /* synthetic */ int f14806f;

        /* renamed from: g */
        public final /* synthetic */ Buffer f14807g;

        /* renamed from: h */
        public final /* synthetic */ int f14808h;

        /* renamed from: i */
        public final /* synthetic */ boolean f14809i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z9, C8741b c8741b, int i10, Buffer buffer, int i11, boolean z10) {
            super(str, z9);
            this.f14805e = c8741b;
            this.f14806f = i10;
            this.f14807g = buffer;
            this.f14808h = i11;
            this.f14809i = z10;
        }

        @Override // p081e9.AbstractC7416a
        /* renamed from: f */
        public long mo11916f() {
            try {
                boolean zMo12951d = this.f14805e.f14767l.mo12951d(this.f14806f, this.f14807g, this.f14808h, this.f14809i);
                if (zMo12951d) {
                    this.f14805e.m14518I().m14607o(this.f14806f, ErrorCode.CANCEL);
                }
                if (!zMo12951d && !this.f14809i) {
                    return -1L;
                }
                synchronized (this.f14805e) {
                    this.f14805e.f14755B.remove(Integer.valueOf(this.f14806f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.b$f */
    public static final class f extends AbstractC7416a {

        /* renamed from: e */
        public final /* synthetic */ C8741b f14810e;

        /* renamed from: f */
        public final /* synthetic */ int f14811f;

        /* renamed from: g */
        public final /* synthetic */ List f14812g;

        /* renamed from: h */
        public final /* synthetic */ boolean f14813h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z9, C8741b c8741b, int i10, List list, boolean z10) {
            super(str, z9);
            this.f14810e = c8741b;
            this.f14811f = i10;
            this.f14812g = list;
            this.f14813h = z10;
        }

        @Override // p081e9.AbstractC7416a
        /* renamed from: f */
        public long mo11916f() {
            boolean zMo12950c = this.f14810e.f14767l.mo12950c(this.f14811f, this.f14812g, this.f14813h);
            if (zMo12950c) {
                try {
                    this.f14810e.m14518I().m14607o(this.f14811f, ErrorCode.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zMo12950c && !this.f14813h) {
                return -1L;
            }
            synchronized (this.f14810e) {
                this.f14810e.f14755B.remove(Integer.valueOf(this.f14811f));
            }
            return -1L;
        }
    }

    /* renamed from: okhttp3.internal.http2.b$g */
    public static final class g extends AbstractC7416a {

        /* renamed from: e */
        public final /* synthetic */ C8741b f14814e;

        /* renamed from: f */
        public final /* synthetic */ int f14815f;

        /* renamed from: g */
        public final /* synthetic */ List f14816g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z9, C8741b c8741b, int i10, List list) {
            super(str, z9);
            this.f14814e = c8741b;
            this.f14815f = i10;
            this.f14816g = list;
        }

        @Override // p081e9.AbstractC7416a
        /* renamed from: f */
        public long mo11916f() {
            if (!this.f14814e.f14767l.mo12949b(this.f14815f, this.f14816g)) {
                return -1L;
            }
            try {
                this.f14814e.m14518I().m14607o(this.f14815f, ErrorCode.CANCEL);
                synchronized (this.f14814e) {
                    this.f14814e.f14755B.remove(Integer.valueOf(this.f14815f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.b$h */
    public static final class h extends AbstractC7416a {

        /* renamed from: e */
        public final /* synthetic */ C8741b f14817e;

        /* renamed from: f */
        public final /* synthetic */ int f14818f;

        /* renamed from: g */
        public final /* synthetic */ ErrorCode f14819g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z9, C8741b c8741b, int i10, ErrorCode errorCode) {
            super(str, z9);
            this.f14817e = c8741b;
            this.f14818f = i10;
            this.f14819g = errorCode;
        }

        @Override // p081e9.AbstractC7416a
        /* renamed from: f */
        public long mo11916f() {
            this.f14817e.f14767l.mo12948a(this.f14818f, this.f14819g);
            synchronized (this.f14817e) {
                this.f14817e.f14755B.remove(Integer.valueOf(this.f14818f));
                Unit unit = Unit.INSTANCE;
            }
            return -1L;
        }
    }

    /* renamed from: okhttp3.internal.http2.b$i */
    public static final class i extends AbstractC7416a {

        /* renamed from: e */
        public final /* synthetic */ C8741b f14820e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z9, C8741b c8741b) {
            super(str, z9);
            this.f14820e = c8741b;
        }

        @Override // p081e9.AbstractC7416a
        /* renamed from: f */
        public long mo11916f() throws IOException {
            this.f14820e.m14536b0(false, 2, 0);
            return -1L;
        }
    }

    /* renamed from: okhttp3.internal.http2.b$j */
    public static final class j extends AbstractC7416a {

        /* renamed from: e */
        public final /* synthetic */ C8741b f14821e;

        /* renamed from: f */
        public final /* synthetic */ long f14822f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, C8741b c8741b, long j10) {
            super(str, false, 2, null);
            this.f14821e = c8741b;
            this.f14822f = j10;
        }

        @Override // p081e9.AbstractC7416a
        /* renamed from: f */
        public long mo11916f() throws IOException {
            boolean z9;
            synchronized (this.f14821e) {
                if (this.f14821e.f14769n < this.f14821e.f14768m) {
                    z9 = true;
                } else {
                    this.f14821e.f14768m++;
                    z9 = false;
                }
            }
            if (z9) {
                this.f14821e.m14541x(null);
                return -1L;
            }
            this.f14821e.m14536b0(false, 1, 0);
            return this.f14822f;
        }
    }

    /* renamed from: okhttp3.internal.http2.b$k */
    public static final class k extends AbstractC7416a {

        /* renamed from: e */
        public final /* synthetic */ C8741b f14823e;

        /* renamed from: f */
        public final /* synthetic */ int f14824f;

        /* renamed from: g */
        public final /* synthetic */ ErrorCode f14825g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z9, C8741b c8741b, int i10, ErrorCode errorCode) {
            super(str, z9);
            this.f14823e = c8741b;
            this.f14824f = i10;
            this.f14825g = errorCode;
        }

        @Override // p081e9.AbstractC7416a
        /* renamed from: f */
        public long mo11916f() throws IOException {
            try {
                this.f14823e.m14537c0(this.f14824f, this.f14825g);
                return -1L;
            } catch (IOException e10) {
                this.f14823e.m14541x(e10);
                return -1L;
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.b$l */
    public static final class l extends AbstractC7416a {

        /* renamed from: e */
        public final /* synthetic */ C8741b f14826e;

        /* renamed from: f */
        public final /* synthetic */ int f14827f;

        /* renamed from: g */
        public final /* synthetic */ long f14828g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z9, C8741b c8741b, int i10, long j10) {
            super(str, z9);
            this.f14826e = c8741b;
            this.f14827f = i10;
            this.f14828g = j10;
        }

        @Override // p081e9.AbstractC7416a
        /* renamed from: f */
        public long mo11916f() throws IOException {
            try {
                this.f14826e.m14518I().m14609q(this.f14827f, this.f14828g);
                return -1L;
            } catch (IOException e10) {
                this.f14826e.m14541x(e10);
                return -1L;
            }
        }
    }

    static {
        C7722g c7722g = new C7722g();
        c7722g.m12959h(7, 65535);
        c7722g.m12959h(5, 16384);
        f14753D = c7722g;
    }

    public C8741b(a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean zM14545b = builder.m14545b();
        this.f14756a = zM14545b;
        this.f14757b = builder.m14547d();
        this.f14758c = new LinkedHashMap();
        String strM14546c = builder.m14546c();
        this.f14759d = strM14546c;
        this.f14761f = builder.m14545b() ? 3 : 2;
        C7420e c7420eM14553j = builder.m14553j();
        this.f14763h = c7420eM14553j;
        C7419d c7419dM11943i = c7420eM14553j.m11943i();
        this.f14764i = c7419dM11943i;
        this.f14765j = c7420eM14553j.m11943i();
        this.f14766k = c7420eM14553j.m11943i();
        this.f14767l = builder.m14549f();
        C7722g c7722g = new C7722g();
        if (builder.m14545b()) {
            c7722g.m12959h(7, 16777216);
        }
        this.f14774s = c7722g;
        this.f14775t = f14753D;
        this.f14779x = r2.m12954c();
        this.f14780y = builder.m14551h();
        this.f14781z = new C8743d(builder.m14550g(), zM14545b);
        this.f14754A = new d(this, new C8742c(builder.m14552i(), zM14545b));
        this.f14755B = new LinkedHashSet();
        if (builder.m14548e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.m14548e());
            c7419dM11943i.m11930i(new j(strM14546c + " ping", this, nanos), nanos);
        }
    }

    /* renamed from: X */
    public static /* synthetic */ void m14491X(C8741b c8741b, boolean z9, C7420e c7420e, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        if ((i10 & 2) != 0) {
            c7420e = C7420e.f12105i;
        }
        c8741b.m14532W(z9, c7420e);
    }

    /* renamed from: A */
    public final int m14510A() {
        return this.f14760e;
    }

    /* renamed from: B */
    public final c m14511B() {
        return this.f14757b;
    }

    /* renamed from: C */
    public final int m14512C() {
        return this.f14761f;
    }

    /* renamed from: D */
    public final C7722g m14513D() {
        return this.f14774s;
    }

    /* renamed from: E */
    public final C7722g m14514E() {
        return this.f14775t;
    }

    /* renamed from: F */
    public final synchronized C7719d m14515F(int i10) {
        return (C7719d) this.f14758c.get(Integer.valueOf(i10));
    }

    /* renamed from: G */
    public final Map m14516G() {
        return this.f14758c;
    }

    /* renamed from: H */
    public final long m14517H() {
        return this.f14779x;
    }

    /* renamed from: I */
    public final C8743d m14518I() {
        return this.f14781z;
    }

    /* renamed from: J */
    public final synchronized boolean m14519J(long j10) {
        if (this.f14762g) {
            return false;
        }
        if (this.f14771p < this.f14770o) {
            if (j10 >= this.f14773r) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: K */
    public final C7719d m14520K(int i10, List list, boolean z9) throws Throwable {
        Throwable th;
        boolean z10 = !z9;
        synchronized (this.f14781z) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f14761f > 1073741823) {
                                try {
                                    m14531V(ErrorCode.REFUSED_STREAM);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            try {
                                if (this.f14762g) {
                                    throw new ConnectionShutdownException();
                                }
                                int i11 = this.f14761f;
                                this.f14761f = i11 + 2;
                                C7719d c7719d = new C7719d(i11, this, z10, false, null);
                                boolean z11 = !z9 || this.f14778w >= this.f14779x || c7719d.m12922r() >= c7719d.m12921q();
                                if (c7719d.m12925u()) {
                                    this.f14758c.put(Integer.valueOf(i11), c7719d);
                                }
                                Unit unit = Unit.INSTANCE;
                                if (i10 == 0) {
                                    this.f14781z.m14603k(z10, i11, list);
                                } else {
                                    if (this.f14756a) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.f14781z.m14606n(i10, i11, list);
                                }
                                if (z11) {
                                    this.f14781z.flush();
                                }
                                return c7719d;
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
    public final C7719d m14521L(List requestHeaders, boolean z9) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return m14520K(0, requestHeaders, z9);
    }

    /* renamed from: M */
    public final void m14522M(int i10, BufferedSource source, int i11, boolean z9) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Buffer buffer = new Buffer();
        long j10 = i11;
        source.require(j10);
        source.read(buffer, j10);
        this.f14765j.m11930i(new e(this.f14759d + '[' + i10 + "] onData", true, this, i10, buffer, i11, z9), 0L);
    }

    /* renamed from: N */
    public final void m14523N(int i10, List requestHeaders, boolean z9) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        this.f14765j.m11930i(new f(this.f14759d + '[' + i10 + "] onHeaders", true, this, i10, requestHeaders, z9), 0L);
    }

    /* renamed from: O */
    public final void m14524O(int i10, List requestHeaders) throws Throwable {
        Throwable th;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (this.f14755B.contains(Integer.valueOf(i10))) {
                    try {
                        m14538d0(i10, ErrorCode.PROTOCOL_ERROR);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f14755B.add(Integer.valueOf(i10));
                this.f14765j.m11930i(new g(this.f14759d + '[' + i10 + "] onRequest", true, this, i10, requestHeaders), 0L);
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* renamed from: P */
    public final void m14525P(int i10, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f14765j.m11930i(new h(this.f14759d + '[' + i10 + "] onReset", true, this, i10, errorCode), 0L);
    }

    /* renamed from: Q */
    public final boolean m14526Q(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    /* renamed from: R */
    public final synchronized C7719d m14527R(int i10) {
        C7719d c7719d;
        c7719d = (C7719d) this.f14758c.remove(Integer.valueOf(i10));
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return c7719d;
    }

    /* renamed from: S */
    public final void m14528S() {
        synchronized (this) {
            long j10 = this.f14771p;
            long j11 = this.f14770o;
            if (j10 < j11) {
                return;
            }
            this.f14770o = j11 + 1;
            this.f14773r = System.nanoTime() + InstantKt.NANOS_PER_SECOND;
            Unit unit = Unit.INSTANCE;
            this.f14764i.m11930i(new i(this.f14759d + " ping", true, this), 0L);
        }
    }

    /* renamed from: T */
    public final void m14529T(int i10) {
        this.f14760e = i10;
    }

    /* renamed from: U */
    public final void m14530U(C7722g c7722g) {
        Intrinsics.checkNotNullParameter(c7722g, "<set-?>");
        this.f14775t = c7722g;
    }

    /* renamed from: V */
    public final void m14531V(ErrorCode statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f14781z) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (this.f14762g) {
                    return;
                }
                this.f14762g = true;
                int i10 = this.f14760e;
                intRef.element = i10;
                Unit unit = Unit.INSTANCE;
                this.f14781z.m14602j(i10, statusCode, AbstractC5070d.f2633a);
            }
        }
    }

    /* renamed from: W */
    public final void m14532W(boolean z9, C7420e taskRunner) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        if (z9) {
            this.f14781z.m14598f();
            this.f14781z.m14608p(this.f14774s);
            if (this.f14774s.m12954c() != 65535) {
                this.f14781z.m14609q(0, r5 - 65535);
            }
        }
        taskRunner.m11943i().m11930i(new C7418c(this.f14759d, true, this.f14754A), 0L);
    }

    /* renamed from: Y */
    public final synchronized void m14533Y(long j10) {
        long j11 = this.f14776u + j10;
        this.f14776u = j11;
        long j12 = j11 - this.f14777v;
        if (j12 >= this.f14774s.m12954c() / 2) {
            m14539e0(0, j12);
            this.f14777v += j12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f14781z.m14604l());
        r6 = r2;
        r8.f14778w += r6;
        r4 = kotlin.Unit.INSTANCE;
     */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14534Z(int r9, boolean r10, okio.Buffer r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.d r12 = r8.f14781z
            r12.m14599g(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.f14778w     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r6 = r8.f14779x     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.Map r2 = r8.f14758c     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
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
            okhttp3.internal.http2.d r4 = r8.f14781z     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.m14604l()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.f14778w     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.f14778w = r4     // Catch: java.lang.Throwable -> L2f
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.d r4 = r8.f14781z
            if (r10 == 0) goto L5d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = r3
        L5e:
            r4.m14599g(r5, r9, r11, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C8741b.m14534Z(int, boolean, okio.Buffer, long):void");
    }

    /* renamed from: a0 */
    public final void m14535a0(int i10, boolean z9, List alternating) {
        Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.f14781z.m14603k(z9, i10, alternating);
    }

    /* renamed from: b0 */
    public final void m14536b0(boolean z9, int i10, int i11) throws IOException {
        try {
            this.f14781z.m14605m(z9, i10, i11);
        } catch (IOException e10) {
            m14541x(e10);
        }
    }

    /* renamed from: c0 */
    public final void m14537c0(int i10, ErrorCode statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.f14781z.m14607o(i10, statusCode);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m14540w(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    /* renamed from: d0 */
    public final void m14538d0(int i10, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f14764i.m11930i(new k(this.f14759d + '[' + i10 + "] writeSynReset", true, this, i10, errorCode), 0L);
    }

    /* renamed from: e0 */
    public final void m14539e0(int i10, long j10) {
        this.f14764i.m11930i(new l(this.f14759d + '[' + i10 + "] windowUpdate", true, this, i10, j10), 0L);
    }

    public final void flush() {
        this.f14781z.flush();
    }

    /* renamed from: w */
    public final void m14540w(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) throws IOException {
        int i10;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (AbstractC5070d.f2640h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            m14531V(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f14758c.isEmpty()) {
                    array = null;
                } else {
                    array = this.f14758c.values().toArray(new C7719d[0]);
                    this.f14758c.clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        C7719d[] c7719dArr = (C7719d[]) array;
        if (c7719dArr != null) {
            for (C7719d c7719d : c7719dArr) {
                try {
                    c7719d.m12908d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f14781z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f14780y.close();
        } catch (IOException unused4) {
        }
        this.f14764i.m11934n();
        this.f14765j.m11934n();
        this.f14766k.m11934n();
    }

    /* renamed from: x */
    public final void m14541x(IOException iOException) throws IOException {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        m14540w(errorCode, errorCode, iOException);
    }

    /* renamed from: y */
    public final boolean m14542y() {
        return this.f14756a;
    }

    /* renamed from: z */
    public final String m14543z() {
        return this.f14759d;
    }
}
