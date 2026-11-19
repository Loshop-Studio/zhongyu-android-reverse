package p117r2;

import java.io.Closeable;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Handshake;
import okhttp3.Protocol;
import p117r2.C4516s;
import p137w2.C4643c;
import p141x2.AbstractC4668e;

/* renamed from: r2.a0 */
/* loaded from: classes2.dex */
public final class C4496a0 implements Closeable {

    /* renamed from: a */
    public C4501d f5290a;

    /* renamed from: b */
    public final C4522y f5291b;

    /* renamed from: c */
    public final Protocol f5292c;

    /* renamed from: d */
    public final String f5293d;

    /* renamed from: e */
    public final int f5294e;

    /* renamed from: f */
    public final Handshake f5295f;

    /* renamed from: g */
    public final C4516s f5296g;

    /* renamed from: h */
    public final AbstractC4498b0 f5297h;

    /* renamed from: i */
    public final C4496a0 f5298i;

    /* renamed from: j */
    public final C4496a0 f5299j;

    /* renamed from: k */
    public final C4496a0 f5300k;

    /* renamed from: l */
    public final long f5301l;

    /* renamed from: m */
    public final long f5302m;

    /* renamed from: n */
    public final C4643c f5303n;

    public C4496a0(C4522y request, Protocol protocol, String message, int i4, Handshake handshake, C4516s headers, AbstractC4498b0 abstractC4498b0, C4496a0 c4496a0, C4496a0 c4496a02, C4496a0 c4496a03, long j4, long j5, C4643c c4643c) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f5291b = request;
        this.f5292c = protocol;
        this.f5293d = message;
        this.f5294e = i4;
        this.f5295f = handshake;
        this.f5296g = headers;
        this.f5297h = abstractC4498b0;
        this.f5298i = c4496a0;
        this.f5299j = c4496a02;
        this.f5300k = c4496a03;
        this.f5301l = j4;
        this.f5302m = j5;
        this.f5303n = c4643c;
    }

    /* renamed from: i */
    public static /* synthetic */ String m5799i(C4496a0 c4496a0, String str, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        return c4496a0.m5807h(str, str2);
    }

    /* renamed from: a */
    public final AbstractC4498b0 m5800a() {
        return this.f5297h;
    }

    /* renamed from: b */
    public final C4501d m5801b() {
        C4501d c4501d = this.f5290a;
        if (c4501d != null) {
            return c4501d;
        }
        C4501d c4501dM5866b = C4501d.f5334p.m5866b(this.f5296g);
        this.f5290a = c4501dM5866b;
        return c4501dM5866b;
    }

    /* renamed from: c */
    public final C4496a0 m5802c() {
        return this.f5299j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC4498b0 abstractC4498b0 = this.f5297h;
        if (abstractC4498b0 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        abstractC4498b0.close();
    }

    /* renamed from: d */
    public final List m5803d() {
        String str;
        C4516s c4516s = this.f5296g;
        int i4 = this.f5294e;
        if (i4 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i4 != 407) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return AbstractC4668e.m6574a(c4516s, str);
    }

    /* renamed from: e */
    public final int m5804e() {
        return this.f5294e;
    }

    /* renamed from: f */
    public final C4643c m5805f() {
        return this.f5303n;
    }

    /* renamed from: g */
    public final Handshake m5806g() {
        return this.f5295f;
    }

    /* renamed from: h */
    public final String m5807h(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strM5959a = this.f5296g.m5959a(name);
        return strM5959a != null ? strM5959a : str;
    }

    /* renamed from: j */
    public final C4516s m5808j() {
        return this.f5296g;
    }

    /* renamed from: k */
    public final boolean m5809k() {
        int i4 = this.f5294e;
        return 200 <= i4 && 299 >= i4;
    }

    /* renamed from: l */
    public final String m5810l() {
        return this.f5293d;
    }

    /* renamed from: m */
    public final C4496a0 m5811m() {
        return this.f5298i;
    }

    /* renamed from: n */
    public final a m5812n() {
        return new a(this);
    }

    /* renamed from: o */
    public final C4496a0 m5813o() {
        return this.f5300k;
    }

    /* renamed from: p */
    public final Protocol m5814p() {
        return this.f5292c;
    }

    /* renamed from: q */
    public final long m5815q() {
        return this.f5302m;
    }

    /* renamed from: r */
    public final C4522y m5816r() {
        return this.f5291b;
    }

    /* renamed from: s */
    public final long m5817s() {
        return this.f5301l;
    }

    public String toString() {
        return "Response{protocol=" + this.f5292c + ", code=" + this.f5294e + ", message=" + this.f5293d + ", url=" + this.f5291b.m6141j() + '}';
    }

    /* renamed from: r2.a0$a */
    public static class a {

        /* renamed from: a */
        public C4522y f5304a;

        /* renamed from: b */
        public Protocol f5305b;

        /* renamed from: c */
        public int f5306c;

        /* renamed from: d */
        public String f5307d;

        /* renamed from: e */
        public Handshake f5308e;

        /* renamed from: f */
        public C4516s.a f5309f;

        /* renamed from: g */
        public AbstractC4498b0 f5310g;

        /* renamed from: h */
        public C4496a0 f5311h;

        /* renamed from: i */
        public C4496a0 f5312i;

        /* renamed from: j */
        public C4496a0 f5313j;

        /* renamed from: k */
        public long f5314k;

        /* renamed from: l */
        public long f5315l;

        /* renamed from: m */
        public C4643c f5316m;

        public a() {
            this.f5306c = -1;
            this.f5309f = new C4516s.a();
        }

        /* renamed from: a */
        public a m5818a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5309f.m5964a(name, value);
            return this;
        }

        /* renamed from: b */
        public a m5819b(AbstractC4498b0 abstractC4498b0) {
            this.f5310g = abstractC4498b0;
            return this;
        }

        /* renamed from: c */
        public C4496a0 m5820c() {
            int i4 = this.f5306c;
            if (!(i4 >= 0)) {
                throw new IllegalStateException(("code < 0: " + this.f5306c).toString());
            }
            C4522y c4522y = this.f5304a;
            if (c4522y == null) {
                throw new IllegalStateException("request == null".toString());
            }
            Protocol protocol = this.f5305b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f5307d;
            if (str != null) {
                return new C4496a0(c4522y, protocol, str, i4, this.f5308e, this.f5309f.m5968e(), this.f5310g, this.f5311h, this.f5312i, this.f5313j, this.f5314k, this.f5315l, this.f5316m);
            }
            throw new IllegalStateException("message == null".toString());
        }

        /* renamed from: d */
        public a m5821d(C4496a0 c4496a0) {
            m5823f("cacheResponse", c4496a0);
            this.f5312i = c4496a0;
            return this;
        }

        /* renamed from: e */
        public final void m5822e(C4496a0 c4496a0) {
            if (c4496a0 != null) {
                if (!(c4496a0.m5800a() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        /* renamed from: f */
        public final void m5823f(String str, C4496a0 c4496a0) {
            if (c4496a0 != null) {
                if (!(c4496a0.m5800a() == null)) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (!(c4496a0.m5811m() == null)) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (!(c4496a0.m5802c() == null)) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (c4496a0.m5813o() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        /* renamed from: g */
        public a m5824g(int i4) {
            this.f5306c = i4;
            return this;
        }

        /* renamed from: h */
        public final int m5825h() {
            return this.f5306c;
        }

        /* renamed from: i */
        public a m5826i(Handshake handshake) {
            this.f5308e = handshake;
            return this;
        }

        /* renamed from: j */
        public a m5827j(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5309f.m5971h(name, value);
            return this;
        }

        /* renamed from: k */
        public a m5828k(C4516s headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f5309f = headers.m5961c();
            return this;
        }

        /* renamed from: l */
        public final void m5829l(C4643c deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.f5316m = deferredTrailers;
        }

        /* renamed from: m */
        public a m5830m(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f5307d = message;
            return this;
        }

        /* renamed from: n */
        public a m5831n(C4496a0 c4496a0) {
            m5823f("networkResponse", c4496a0);
            this.f5311h = c4496a0;
            return this;
        }

        /* renamed from: o */
        public a m5832o(C4496a0 c4496a0) {
            m5822e(c4496a0);
            this.f5313j = c4496a0;
            return this;
        }

        /* renamed from: p */
        public a m5833p(Protocol protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f5305b = protocol;
            return this;
        }

        /* renamed from: q */
        public a m5834q(long j4) {
            this.f5315l = j4;
            return this;
        }

        /* renamed from: r */
        public a m5835r(C4522y request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f5304a = request;
            return this;
        }

        /* renamed from: s */
        public a m5836s(long j4) {
            this.f5314k = j4;
            return this;
        }

        public a(C4496a0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f5306c = -1;
            this.f5304a = response.m5816r();
            this.f5305b = response.m5814p();
            this.f5306c = response.m5804e();
            this.f5307d = response.m5810l();
            this.f5308e = response.m5806g();
            this.f5309f = response.m5808j().m5961c();
            this.f5310g = response.m5800a();
            this.f5311h = response.m5811m();
            this.f5312i = response.m5802c();
            this.f5313j = response.m5813o();
            this.f5314k = response.m5817s();
            this.f5315l = response.m5815q();
            this.f5316m = response.m5805f();
        }
    }
}
