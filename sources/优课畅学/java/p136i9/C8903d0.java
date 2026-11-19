package p136i9;

import java.io.Closeable;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.C9561c;
import okhttp3.Protocol;
import p134i7.AbstractC8809v;
import p136i9.C8924v;
import p192n9.C9481h;
import p203o9.AbstractC9550e;

/* renamed from: i9.d0 */
/* loaded from: classes5.dex */
public final class C8903d0 implements Closeable {

    /* renamed from: a */
    public final C8899b0 f16689a;

    /* renamed from: b */
    public final Protocol f16690b;

    /* renamed from: c */
    public final String f16691c;

    /* renamed from: d */
    public final int f16692d;

    /* renamed from: e */
    public final C9561c f16693e;

    /* renamed from: f */
    public final C8924v f16694f;

    /* renamed from: g */
    public final AbstractC8905e0 f16695g;

    /* renamed from: h */
    public final C8903d0 f16696h;

    /* renamed from: i */
    public final C8903d0 f16697i;

    /* renamed from: j */
    public final C8903d0 f16698j;

    /* renamed from: k */
    public final long f16699k;

    /* renamed from: l */
    public final long f16700l;

    /* renamed from: m */
    public final C9481h f16701m;

    /* renamed from: n */
    public InterfaceC8909g0 f16702n;

    /* renamed from: o */
    public C8902d f16703o;

    /* renamed from: p */
    public final boolean f16704p;

    /* renamed from: q */
    public final boolean f16705q;

    public C8903d0(C8899b0 request, Protocol protocol, String message, int i10, C9561c c9561c, C8924v headers, AbstractC8905e0 body, C8903d0 c8903d0, C8903d0 c8903d02, C8903d0 c8903d03, long j10, long j11, C9481h c9481h, InterfaceC8909g0 trailersSource) {
        AbstractC9133u.m16133g(request, "request");
        AbstractC9133u.m16133g(protocol, "protocol");
        AbstractC9133u.m16133g(message, "message");
        AbstractC9133u.m16133g(headers, "headers");
        AbstractC9133u.m16133g(body, "body");
        AbstractC9133u.m16133g(trailersSource, "trailersSource");
        this.f16689a = request;
        this.f16690b = protocol;
        this.f16691c = message;
        this.f16692d = i10;
        this.f16693e = c9561c;
        this.f16694f = headers;
        this.f16695g = body;
        this.f16696h = c8903d0;
        this.f16697i = c8903d02;
        this.f16698j = c8903d03;
        this.f16699k = j10;
        this.f16700l = j11;
        this.f16701m = c9481h;
        this.f16702n = trailersSource;
        boolean z10 = true;
        this.f16704p = 200 <= i10 && i10 < 300;
        if (i10 != 307 && i10 != 308) {
            switch (i10) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    z10 = false;
                    break;
            }
        }
        this.f16705q = z10;
    }

    /* renamed from: k */
    public static /* synthetic */ String m15123k(C8903d0 c8903d0, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c8903d0.m15132j(str, str2);
    }

    /* renamed from: b */
    public final AbstractC8905e0 m15124b() {
        return this.f16695g;
    }

    /* renamed from: c */
    public final C8902d m15125c() {
        C8902d c8902d = this.f16703o;
        if (c8902d != null) {
            return c8902d;
        }
        C8902d c8902dM15121a = C8902d.f16665n.m15121a(this.f16694f);
        this.f16703o = c8902dM15121a;
        return c8902dM15121a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16695g.close();
    }

    /* renamed from: d */
    public final C8903d0 m15126d() {
        return this.f16697i;
    }

    /* renamed from: e */
    public final List m15127e() {
        String str;
        C8924v c8924v = this.f16694f;
        int i10 = this.f16692d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return AbstractC8809v.m14771n();
            }
            str = "Proxy-Authenticate";
        }
        return AbstractC9550e.m17836a(c8924v, str);
    }

    /* renamed from: f */
    public final int m15128f() {
        return this.f16692d;
    }

    /* renamed from: g */
    public final C9481h m15129g() {
        return this.f16701m;
    }

    /* renamed from: h */
    public final C9561c m15130h() {
        return this.f16693e;
    }

    /* renamed from: i */
    public final String m15131i(String name) {
        AbstractC9133u.m16133g(name, "name");
        return m15123k(this, name, null, 2, null);
    }

    /* renamed from: j */
    public final String m15132j(String name, String str) {
        AbstractC9133u.m16133g(name, "name");
        String strM15260a = this.f16694f.m15260a(name);
        return strM15260a == null ? str : strM15260a;
    }

    /* renamed from: l */
    public final C8924v m15133l() {
        return this.f16694f;
    }

    /* renamed from: m */
    public final boolean m15134m() {
        return this.f16704p;
    }

    /* renamed from: n */
    public final String m15135n() {
        return this.f16691c;
    }

    /* renamed from: o */
    public final C8903d0 m15136o() {
        return this.f16696h;
    }

    /* renamed from: p */
    public final a m15137p() {
        return new a(this);
    }

    /* renamed from: q */
    public final C8903d0 m15138q() {
        return this.f16698j;
    }

    /* renamed from: r */
    public final Protocol m15139r() {
        return this.f16690b;
    }

    /* renamed from: s */
    public final long m15140s() {
        return this.f16700l;
    }

    /* renamed from: t */
    public final C8899b0 m15141t() {
        return this.f16689a;
    }

    public String toString() {
        return "Response{protocol=" + this.f16690b + ", code=" + this.f16692d + ", message=" + this.f16691c + ", url=" + this.f16689a.m15052l() + '}';
    }

    /* renamed from: u */
    public final long m15142u() {
        return this.f16699k;
    }

    /* renamed from: i9.d0$a */
    public static class a {

        /* renamed from: a */
        public C8899b0 f16706a;

        /* renamed from: b */
        public Protocol f16707b;

        /* renamed from: c */
        public int f16708c;

        /* renamed from: d */
        public String f16709d;

        /* renamed from: e */
        public C9561c f16710e;

        /* renamed from: f */
        public C8924v.a f16711f;

        /* renamed from: g */
        public AbstractC8905e0 f16712g;

        /* renamed from: h */
        public C8903d0 f16713h;

        /* renamed from: i */
        public C8903d0 f16714i;

        /* renamed from: j */
        public C8903d0 f16715j;

        /* renamed from: k */
        public long f16716k;

        /* renamed from: l */
        public long f16717l;

        /* renamed from: m */
        public C9481h f16718m;

        /* renamed from: n */
        public InterfaceC8909g0 f16719n;

        public a() {
            this.f16708c = -1;
            this.f16712g = AbstractC8905e0.EMPTY;
            this.f16719n = InterfaceC8909g0.f16734b;
            this.f16711f = new C8924v.a();
        }

        /* renamed from: a */
        public a m15143a(String name, String value) {
            AbstractC9133u.m16133g(name, "name");
            AbstractC9133u.m16133g(value, "value");
            this.f16711f.m15267a(name, value);
            return this;
        }

        /* renamed from: b */
        public a m15144b(AbstractC8905e0 body) {
            AbstractC9133u.m16133g(body, "body");
            this.f16712g = body;
            return this;
        }

        /* renamed from: c */
        public C8903d0 m15145c() {
            int i10 = this.f16708c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f16708c).toString());
            }
            C8899b0 c8899b0 = this.f16706a;
            if (c8899b0 == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.f16707b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f16709d;
            if (str != null) {
                return new C8903d0(c8899b0, protocol, str, i10, this.f16710e, this.f16711f.m15272f(), this.f16712g, this.f16713h, this.f16714i, this.f16715j, this.f16716k, this.f16717l, this.f16718m, this.f16719n);
            }
            throw new IllegalStateException("message == null");
        }

        /* renamed from: d */
        public a m15146d(C8903d0 c8903d0) {
            m15147e("cacheResponse", c8903d0);
            this.f16714i = c8903d0;
            return this;
        }

        /* renamed from: e */
        public final void m15147e(String str, C8903d0 c8903d0) {
            if (c8903d0 != null) {
                if (c8903d0.m15136o() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (c8903d0.m15126d() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (c8903d0.m15138q() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        /* renamed from: f */
        public a m15148f(int i10) {
            this.f16708c = i10;
            return this;
        }

        /* renamed from: g */
        public final int m15149g() {
            return this.f16708c;
        }

        /* renamed from: h */
        public a m15150h(C9561c c9561c) {
            this.f16710e = c9561c;
            return this;
        }

        /* renamed from: i */
        public a m15151i(String name, String value) {
            AbstractC9133u.m16133g(name, "name");
            AbstractC9133u.m16133g(value, "value");
            this.f16711f.m15275i(name, value);
            return this;
        }

        /* renamed from: j */
        public a m15152j(C8924v headers) {
            AbstractC9133u.m16133g(headers, "headers");
            this.f16711f = headers.m15263d();
            return this;
        }

        /* renamed from: k */
        public final void m15153k(C9481h exchange) {
            AbstractC9133u.m16133g(exchange, "exchange");
            this.f16718m = exchange;
        }

        /* renamed from: l */
        public a m15154l(String message) {
            AbstractC9133u.m16133g(message, "message");
            this.f16709d = message;
            return this;
        }

        /* renamed from: m */
        public a m15155m(C8903d0 c8903d0) {
            m15147e("networkResponse", c8903d0);
            this.f16713h = c8903d0;
            return this;
        }

        /* renamed from: n */
        public a m15156n(C8903d0 c8903d0) {
            this.f16715j = c8903d0;
            return this;
        }

        /* renamed from: o */
        public a m15157o(Protocol protocol) {
            AbstractC9133u.m16133g(protocol, "protocol");
            this.f16707b = protocol;
            return this;
        }

        /* renamed from: p */
        public a m15158p(long j10) {
            this.f16717l = j10;
            return this;
        }

        /* renamed from: q */
        public a m15159q(C8899b0 request) {
            AbstractC9133u.m16133g(request, "request");
            this.f16706a = request;
            return this;
        }

        /* renamed from: r */
        public a m15160r(long j10) {
            this.f16716k = j10;
            return this;
        }

        /* renamed from: s */
        public a m15161s(InterfaceC8909g0 trailersSource) {
            AbstractC9133u.m16133g(trailersSource, "trailersSource");
            this.f16719n = trailersSource;
            return this;
        }

        public a(C8903d0 response) {
            AbstractC9133u.m16133g(response, "response");
            this.f16708c = -1;
            this.f16712g = AbstractC8905e0.EMPTY;
            this.f16719n = InterfaceC8909g0.f16734b;
            this.f16706a = response.m15141t();
            this.f16707b = response.m15139r();
            this.f16708c = response.m15128f();
            this.f16709d = response.m15135n();
            this.f16710e = response.m15130h();
            this.f16711f = response.m15133l().m15263d();
            this.f16712g = response.m15124b();
            this.f16713h = response.m15136o();
            this.f16714i = response.m15126d();
            this.f16715j = response.m15138q();
            this.f16716k = response.m15142u();
            this.f16717l = response.m15140s();
            this.f16718m = response.m15129g();
            this.f16719n = response.f16702n;
        }
    }
}
