package je;

import java.io.Closeable;
import java.util.List;
import je.C9737q;
import kotlin.jvm.internal.AbstractC9979u;
import okhttp3.Handshake;
import okhttp3.Protocol;
import p281oe.C10485c;
import p325rc.AbstractC10978w;
import pe.AbstractC10678e;

/* renamed from: je.y */
/* loaded from: classes6.dex */
public final class C9745y implements Closeable {

    /* renamed from: c */
    public final C9743w f22877c;

    /* renamed from: d */
    public final Protocol f22878d;

    /* renamed from: e */
    public final String f22879e;

    /* renamed from: f */
    public final int f22880f;

    /* renamed from: g */
    public final Handshake f22881g;

    /* renamed from: h */
    public final C9737q f22882h;

    /* renamed from: i */
    public final AbstractC9746z f22883i;

    /* renamed from: j */
    public final C9745y f22884j;

    /* renamed from: k */
    public final C9745y f22885k;

    /* renamed from: l */
    public final C9745y f22886l;

    /* renamed from: m */
    public final long f22887m;

    /* renamed from: n */
    public final long f22888n;

    /* renamed from: o */
    public final C10485c f22889o;

    /* renamed from: p */
    public C9724d f22890p;

    public C9745y(C9743w request, Protocol protocol, String message, int i10, Handshake handshake, C9737q headers, AbstractC9746z abstractC9746z, C9745y c9745y, C9745y c9745y2, C9745y c9745y3, long j10, long j11, C10485c c10485c) {
        AbstractC9979u.m20294g(request, "request");
        AbstractC9979u.m20294g(protocol, "protocol");
        AbstractC9979u.m20294g(message, "message");
        AbstractC9979u.m20294g(headers, "headers");
        this.f22877c = request;
        this.f22878d = protocol;
        this.f22879e = message;
        this.f22880f = i10;
        this.f22881g = handshake;
        this.f22882h = headers;
        this.f22883i = abstractC9746z;
        this.f22884j = c9745y;
        this.f22885k = c9745y2;
        this.f22886l = c9745y3;
        this.f22887m = j10;
        this.f22888n = j11;
        this.f22889o = c10485c;
    }

    /* renamed from: p */
    public static /* synthetic */ String m19626p(C9745y c9745y, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c9745y.m19636n(str, str2);
    }

    /* renamed from: A */
    public final long m19627A() {
        return this.f22887m;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC9746z abstractC9746z = this.f22883i;
        if (abstractC9746z == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC9746z.close();
    }

    /* renamed from: e */
    public final AbstractC9746z m19628e() {
        return this.f22883i;
    }

    /* renamed from: f */
    public final C9724d m19629f() {
        C9724d c9724d = this.f22890p;
        if (c9724d != null) {
            return c9724d;
        }
        C9724d c9724dM19317b = C9724d.f22682n.m19317b(this.f22882h);
        this.f22890p = c9724dM19317b;
        return c9724dM19317b;
    }

    /* renamed from: g */
    public final C9745y m19630g() {
        return this.f22885k;
    }

    /* renamed from: i */
    public final List m19631i() {
        String str;
        C9737q c9737q = this.f22882h;
        int i10 = this.f22880f;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return AbstractC10978w.m24136n();
            }
            str = "Proxy-Authenticate";
        }
        return AbstractC10678e.m22614b(c9737q, str);
    }

    /* renamed from: j */
    public final int m19632j() {
        return this.f22880f;
    }

    /* renamed from: k */
    public final C10485c m19633k() {
        return this.f22889o;
    }

    /* renamed from: l */
    public final Handshake m19634l() {
        return this.f22881g;
    }

    /* renamed from: m */
    public final String m19635m(String name) {
        AbstractC9979u.m20294g(name, "name");
        return m19626p(this, name, null, 2, null);
    }

    /* renamed from: n */
    public final String m19636n(String name, String str) {
        AbstractC9979u.m20294g(name, "name");
        String strM19389a = this.f22882h.m19389a(name);
        return strM19389a == null ? str : strM19389a;
    }

    /* renamed from: r */
    public final C9737q m19637r() {
        return this.f22882h;
    }

    /* renamed from: s */
    public final boolean m19638s() {
        int i10 = this.f22880f;
        return 200 <= i10 && i10 < 300;
    }

    /* renamed from: t */
    public final String m19639t() {
        return this.f22879e;
    }

    public String toString() {
        return "Response{protocol=" + this.f22878d + ", code=" + this.f22880f + ", message=" + this.f22879e + ", url=" + this.f22877c.m19592j() + '}';
    }

    /* renamed from: u */
    public final C9745y m19640u() {
        return this.f22884j;
    }

    /* renamed from: v */
    public final a m19641v() {
        return new a(this);
    }

    /* renamed from: w */
    public final C9745y m19642w() {
        return this.f22886l;
    }

    /* renamed from: x */
    public final Protocol m19643x() {
        return this.f22878d;
    }

    /* renamed from: y */
    public final long m19644y() {
        return this.f22888n;
    }

    /* renamed from: z */
    public final C9743w m19645z() {
        return this.f22877c;
    }

    /* renamed from: je.y$a */
    public static class a {

        /* renamed from: a */
        public C9743w f22891a;

        /* renamed from: b */
        public Protocol f22892b;

        /* renamed from: c */
        public int f22893c;

        /* renamed from: d */
        public String f22894d;

        /* renamed from: e */
        public Handshake f22895e;

        /* renamed from: f */
        public C9737q.a f22896f;

        /* renamed from: g */
        public AbstractC9746z f22897g;

        /* renamed from: h */
        public C9745y f22898h;

        /* renamed from: i */
        public C9745y f22899i;

        /* renamed from: j */
        public C9745y f22900j;

        /* renamed from: k */
        public long f22901k;

        /* renamed from: l */
        public long f22902l;

        /* renamed from: m */
        public C10485c f22903m;

        public a() {
            this.f22893c = -1;
            this.f22896f = new C9737q.a();
        }

        /* renamed from: a */
        public a m19646a(String name, String value) {
            AbstractC9979u.m20294g(name, "name");
            AbstractC9979u.m20294g(value, "value");
            this.f22896f.m19395a(name, value);
            return this;
        }

        /* renamed from: b */
        public a m19647b(AbstractC9746z abstractC9746z) {
            this.f22897g = abstractC9746z;
            return this;
        }

        /* renamed from: c */
        public C9745y m19648c() {
            int i10 = this.f22893c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f22893c).toString());
            }
            C9743w c9743w = this.f22891a;
            if (c9743w == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.f22892b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f22894d;
            if (str != null) {
                return new C9745y(c9743w, protocol, str, i10, this.f22895e, this.f22896f.m19400f(), this.f22897g, this.f22898h, this.f22899i, this.f22900j, this.f22901k, this.f22902l, this.f22903m);
            }
            throw new IllegalStateException("message == null");
        }

        /* renamed from: d */
        public a m19649d(C9745y c9745y) {
            m19651f("cacheResponse", c9745y);
            this.f22899i = c9745y;
            return this;
        }

        /* renamed from: e */
        public final void m19650e(C9745y c9745y) {
            if (c9745y != null && c9745y.m19628e() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: f */
        public final void m19651f(String str, C9745y c9745y) {
            if (c9745y != null) {
                if (c9745y.m19628e() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (c9745y.m19640u() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (c9745y.m19630g() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (c9745y.m19642w() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        /* renamed from: g */
        public a m19652g(int i10) {
            this.f22893c = i10;
            return this;
        }

        /* renamed from: h */
        public final int m19653h() {
            return this.f22893c;
        }

        /* renamed from: i */
        public a m19654i(Handshake handshake) {
            this.f22895e = handshake;
            return this;
        }

        /* renamed from: j */
        public a m19655j(String name, String value) {
            AbstractC9979u.m20294g(name, "name");
            AbstractC9979u.m20294g(value, "value");
            this.f22896f.m19403i(name, value);
            return this;
        }

        /* renamed from: k */
        public a m19656k(C9737q headers) {
            AbstractC9979u.m20294g(headers, "headers");
            this.f22896f = headers.m19391c();
            return this;
        }

        /* renamed from: l */
        public final void m19657l(C10485c deferredTrailers) {
            AbstractC9979u.m20294g(deferredTrailers, "deferredTrailers");
            this.f22903m = deferredTrailers;
        }

        /* renamed from: m */
        public a m19658m(String message) {
            AbstractC9979u.m20294g(message, "message");
            this.f22894d = message;
            return this;
        }

        /* renamed from: n */
        public a m19659n(C9745y c9745y) {
            m19651f("networkResponse", c9745y);
            this.f22898h = c9745y;
            return this;
        }

        /* renamed from: o */
        public a m19660o(C9745y c9745y) {
            m19650e(c9745y);
            this.f22900j = c9745y;
            return this;
        }

        /* renamed from: p */
        public a m19661p(Protocol protocol) {
            AbstractC9979u.m20294g(protocol, "protocol");
            this.f22892b = protocol;
            return this;
        }

        /* renamed from: q */
        public a m19662q(long j10) {
            this.f22902l = j10;
            return this;
        }

        /* renamed from: r */
        public a m19663r(C9743w request) {
            AbstractC9979u.m20294g(request, "request");
            this.f22891a = request;
            return this;
        }

        /* renamed from: s */
        public a m19664s(long j10) {
            this.f22901k = j10;
            return this;
        }

        public a(C9745y response) {
            AbstractC9979u.m20294g(response, "response");
            this.f22893c = -1;
            this.f22891a = response.m19645z();
            this.f22892b = response.m19643x();
            this.f22893c = response.m19632j();
            this.f22894d = response.m19639t();
            this.f22895e = response.m19634l();
            this.f22896f = response.m19637r().m19391c();
            this.f22897g = response.m19628e();
            this.f22898h = response.m19640u();
            this.f22899i = response.m19630g();
            this.f22900j = response.m19642w();
            this.f22901k = response.m19627A();
            this.f22902l = response.m19644y();
            this.f22903m = response.m19633k();
        }
    }
}
