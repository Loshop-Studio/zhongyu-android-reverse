package p256t8;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.C9244b;
import okhttp3.internal.http2.ErrorCode;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p172l8.C8918q;
import p172l8.C8923v;
import p172l8.C8924w;
import p172l8.C8926y;
import p182m8.AbstractC9045d;
import p236r8.AbstractC9443e;
import p236r8.C9445g;
import p236r8.C9447i;
import p236r8.C9449k;
import p236r8.InterfaceC9442d;

/* renamed from: t8.c */
/* loaded from: classes5.dex */
public final class C9638c implements InterfaceC9442d {

    /* renamed from: g */
    public static final a f16934g = new a(null);

    /* renamed from: h */
    public static final List f16935h = AbstractC9045d.m14507w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i */
    public static final List f16936i = AbstractC9045d.m14507w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public final RealConnection f16937a;

    /* renamed from: b */
    public final C9445g f16938b;

    /* renamed from: c */
    public final C9244b f16939c;

    /* renamed from: d */
    public volatile C9639d f16940d;

    /* renamed from: e */
    public final Protocol f16941e;

    /* renamed from: f */
    public volatile boolean f16942f;

    /* renamed from: t8.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List m15917a(C8924w request) {
            Intrinsics.checkNotNullParameter(request, "request");
            C8918q c8918qM14132e = request.m14132e();
            ArrayList arrayList = new ArrayList(c8918qM14132e.size() + 4);
            arrayList.add(new C9636a(C9636a.f16922g, request.m14134g()));
            arrayList.add(new C9636a(C9636a.f16923h, C9447i.f16473a.m15611c(request.m14137j())));
            String strM14131d = request.m14131d(HttpHeaders.HOST);
            if (strM14131d != null) {
                arrayList.add(new C9636a(C9636a.f16925j, strM14131d));
            }
            arrayList.add(new C9636a(C9636a.f16924i, request.m14137j().m13975r()));
            int size = c8918qM14132e.size();
            for (int i9 = 0; i9 < size; i9++) {
                String strM13937b = c8918qM14132e.m13937b(i9);
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = strM13937b.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!C9638c.f16935h.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(c8918qM14132e.m13940f(i9), "trailers"))) {
                    arrayList.add(new C9636a(lowerCase, c8918qM14132e.m13940f(i9)));
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final C8926y.a m15918b(C8918q headerBlock, Protocol protocol) throws ProtocolException, NumberFormatException {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            C8918q.a aVar = new C8918q.a();
            int size = headerBlock.size();
            C9449k c9449kM15618a = null;
            for (int i9 = 0; i9 < size; i9++) {
                String strM13937b = headerBlock.m13937b(i9);
                String strM13940f = headerBlock.m13940f(i9);
                if (Intrinsics.areEqual(strM13937b, ":status")) {
                    c9449kM15618a = C9449k.f16476d.m15618a("HTTP/1.1 " + strM13940f);
                } else if (!C9638c.f16936i.contains(strM13937b)) {
                    aVar.m13945d(strM13937b, strM13940f);
                }
            }
            if (c9449kM15618a != null) {
                return new C8926y.a().m14204p(protocol).m14195g(c9449kM15618a.f16478b).m14201m(c9449kM15618a.f16479c).m14199k(aVar.m13947f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public a() {
        }
    }

    public C9638c(C8923v client, RealConnection connection, C9445g chain, C9244b http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f16937a = connection;
        this.f16938b = chain;
        this.f16939c = http2Connection;
        List listM14053C = client.m14053C();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f16941e = listM14053C.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // p236r8.InterfaceC9442d
    /* renamed from: a */
    public void mo15580a() throws IOException {
        C9639d c9639d = this.f16940d;
        Intrinsics.checkNotNull(c9639d);
        c9639d.m15937n().close();
    }

    @Override // p236r8.InterfaceC9442d
    /* renamed from: b */
    public RealConnection mo15581b() {
        return this.f16937a;
    }

    @Override // p236r8.InterfaceC9442d
    /* renamed from: c */
    public Sink mo15582c(C8924w request, long j9) {
        Intrinsics.checkNotNullParameter(request, "request");
        C9639d c9639d = this.f16940d;
        Intrinsics.checkNotNull(c9639d);
        return c9639d.m15937n();
    }

    @Override // p236r8.InterfaceC9442d
    public void cancel() {
        this.f16942f = true;
        C9639d c9639d = this.f16940d;
        if (c9639d != null) {
            c9639d.m15929f(ErrorCode.CANCEL);
        }
    }

    @Override // p236r8.InterfaceC9442d
    /* renamed from: d */
    public long mo15583d(C8926y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (AbstractC9443e.m15589b(response)) {
            return AbstractC9045d.m14506v(response);
        }
        return 0L;
    }

    @Override // p236r8.InterfaceC9442d
    /* renamed from: e */
    public Source mo15584e(C8926y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        C9639d c9639d = this.f16940d;
        Intrinsics.checkNotNull(c9639d);
        return c9639d.m15939p();
    }

    @Override // p236r8.InterfaceC9442d
    /* renamed from: f */
    public C8926y.a mo15585f(boolean z9) throws NumberFormatException, IOException {
        C9639d c9639d = this.f16940d;
        if (c9639d == null) {
            throw new IOException("stream wasn't created");
        }
        C8926y.a aVarM15918b = f16934g.m15918b(c9639d.m15921C(), this.f16941e);
        if (z9 && aVarM15918b.m14196h() == 100) {
            return null;
        }
        return aVarM15918b;
    }

    @Override // p236r8.InterfaceC9442d
    /* renamed from: g */
    public void mo15586g(C8924w request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f16940d != null) {
            return;
        }
        this.f16940d = this.f16939c.m14955L(f16934g.m15917a(request), request.m14128a() != null);
        if (this.f16942f) {
            C9639d c9639d = this.f16940d;
            Intrinsics.checkNotNull(c9639d);
            c9639d.m15929f(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        C9639d c9639d2 = this.f16940d;
        Intrinsics.checkNotNull(c9639d2);
        Timeout timeoutM15945v = c9639d2.m15945v();
        long jM15605h = this.f16938b.m15605h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeoutM15945v.timeout(jM15605h, timeUnit);
        C9639d c9639d3 = this.f16940d;
        Intrinsics.checkNotNull(c9639d3);
        c9639d3.m15923E().timeout(this.f16938b.m15607j(), timeUnit);
    }

    @Override // p236r8.InterfaceC9442d
    /* renamed from: h */
    public void mo15587h() {
        this.f16939c.flush();
    }
}
