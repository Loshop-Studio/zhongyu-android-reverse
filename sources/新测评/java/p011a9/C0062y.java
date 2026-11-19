package p011a9;

import java.io.Closeable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Handshake;
import okhttp3.Protocol;
import p011a9.C0054q;
import p092f9.C7499c;
import p103g9.AbstractC7604e;

/* renamed from: a9.y */
/* loaded from: classes5.dex */
public final class C0062y implements Closeable {

    /* renamed from: a */
    public final C0060w f296a;

    /* renamed from: b */
    public final Protocol f297b;

    /* renamed from: c */
    public final String f298c;

    /* renamed from: d */
    public final int f299d;

    /* renamed from: e */
    public final Handshake f300e;

    /* renamed from: f */
    public final C0054q f301f;

    /* renamed from: g */
    public final AbstractC0063z f302g;

    /* renamed from: h */
    public final C0062y f303h;

    /* renamed from: i */
    public final C0062y f304i;

    /* renamed from: j */
    public final C0062y f305j;

    /* renamed from: k */
    public final long f306k;

    /* renamed from: l */
    public final long f307l;

    /* renamed from: m */
    public final C7499c f308m;

    /* renamed from: n */
    public C0041d f309n;

    public C0062y(C0060w request, Protocol protocol, String message, int i10, Handshake handshake, C0054q headers, AbstractC0063z abstractC0063z, C0062y c0062y, C0062y c0062y2, C0062y c0062y3, long j10, long j11, C7499c c7499c) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f296a = request;
        this.f297b = protocol;
        this.f298c = message;
        this.f299d = i10;
        this.f300e = handshake;
        this.f301f = headers;
        this.f302g = abstractC0063z;
        this.f303h = c0062y;
        this.f304i = c0062y2;
        this.f305j = c0062y3;
        this.f306k = j10;
        this.f307l = j11;
        this.f308m = c7499c;
    }

    /* renamed from: n */
    public static /* synthetic */ String m413n(C0062y c0062y, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c0062y.m422m(str, str2);
    }

    /* renamed from: a */
    public final AbstractC0063z m414a() {
        return this.f302g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC0063z abstractC0063z = this.f302g;
        if (abstractC0063z == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC0063z.close();
    }

    /* renamed from: f */
    public final C0041d m415f() {
        C0041d c0041d = this.f309n;
        if (c0041d != null) {
            return c0041d;
        }
        C0041d c0041dM106b = C0041d.f101n.m106b(this.f301f);
        this.f309n = c0041dM106b;
        return c0041dM106b;
    }

    /* renamed from: g */
    public final C0062y m416g() {
        return this.f304i;
    }

    /* renamed from: h */
    public final List m417h() {
        String str;
        C0054q c0054q = this.f301f;
        int i10 = this.f299d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return CollectionsKt.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return AbstractC7604e.m12501a(c0054q, str);
    }

    /* renamed from: i */
    public final int m418i() {
        return this.f299d;
    }

    /* renamed from: j */
    public final C7499c m419j() {
        return this.f308m;
    }

    /* renamed from: k */
    public final Handshake m420k() {
        return this.f300e;
    }

    /* renamed from: l */
    public final String m421l(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return m413n(this, name, null, 2, null);
    }

    /* renamed from: m */
    public final String m422m(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strM180a = this.f301f.m180a(name);
        return strM180a == null ? str : strM180a;
    }

    /* renamed from: o */
    public final C0054q m423o() {
        return this.f301f;
    }

    /* renamed from: p */
    public final boolean m424p() {
        int i10 = this.f299d;
        return 200 <= i10 && i10 < 300;
    }

    /* renamed from: q */
    public final String m425q() {
        return this.f298c;
    }

    /* renamed from: r */
    public final C0062y m426r() {
        return this.f303h;
    }

    /* renamed from: s */
    public final a m427s() {
        return new a(this);
    }

    /* renamed from: t */
    public final C0062y m428t() {
        return this.f305j;
    }

    public String toString() {
        return "Response{protocol=" + this.f297b + ", code=" + this.f299d + ", message=" + this.f298c + ", url=" + this.f296a.m381j() + '}';
    }

    /* renamed from: u */
    public final Protocol m429u() {
        return this.f297b;
    }

    /* renamed from: v */
    public final long m430v() {
        return this.f307l;
    }

    /* renamed from: w */
    public final C0060w m431w() {
        return this.f296a;
    }

    /* renamed from: x */
    public final long m432x() {
        return this.f306k;
    }

    /* renamed from: a9.y$a */
    public static class a {

        /* renamed from: a */
        public C0060w f310a;

        /* renamed from: b */
        public Protocol f311b;

        /* renamed from: c */
        public int f312c;

        /* renamed from: d */
        public String f313d;

        /* renamed from: e */
        public Handshake f314e;

        /* renamed from: f */
        public C0054q.a f315f;

        /* renamed from: g */
        public AbstractC0063z f316g;

        /* renamed from: h */
        public C0062y f317h;

        /* renamed from: i */
        public C0062y f318i;

        /* renamed from: j */
        public C0062y f319j;

        /* renamed from: k */
        public long f320k;

        /* renamed from: l */
        public long f321l;

        /* renamed from: m */
        public C7499c f322m;

        public a() {
            this.f312c = -1;
            this.f315f = new C0054q.a();
        }

        /* renamed from: a */
        public a m433a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f315f.m186a(name, value);
            return this;
        }

        /* renamed from: b */
        public a m434b(AbstractC0063z abstractC0063z) {
            this.f316g = abstractC0063z;
            return this;
        }

        /* renamed from: c */
        public C0062y m435c() {
            int i10 = this.f312c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f312c).toString());
            }
            C0060w c0060w = this.f310a;
            if (c0060w == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.f311b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f313d;
            if (str != null) {
                return new C0062y(c0060w, protocol, str, i10, this.f314e, this.f315f.m191f(), this.f316g, this.f317h, this.f318i, this.f319j, this.f320k, this.f321l, this.f322m);
            }
            throw new IllegalStateException("message == null");
        }

        /* renamed from: d */
        public a m436d(C0062y c0062y) {
            m438f("cacheResponse", c0062y);
            this.f318i = c0062y;
            return this;
        }

        /* renamed from: e */
        public final void m437e(C0062y c0062y) {
            if (c0062y != null && c0062y.m414a() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: f */
        public final void m438f(String str, C0062y c0062y) {
            if (c0062y != null) {
                if (c0062y.m414a() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (c0062y.m426r() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (c0062y.m416g() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (c0062y.m428t() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        /* renamed from: g */
        public a m439g(int i10) {
            this.f312c = i10;
            return this;
        }

        /* renamed from: h */
        public final int m440h() {
            return this.f312c;
        }

        /* renamed from: i */
        public a m441i(Handshake handshake) {
            this.f314e = handshake;
            return this;
        }

        /* renamed from: j */
        public a m442j(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f315f.m194i(name, value);
            return this;
        }

        /* renamed from: k */
        public a m443k(C0054q headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f315f = headers.m182c();
            return this;
        }

        /* renamed from: l */
        public final void m444l(C7499c deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.f322m = deferredTrailers;
        }

        /* renamed from: m */
        public a m445m(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f313d = message;
            return this;
        }

        /* renamed from: n */
        public a m446n(C0062y c0062y) {
            m438f("networkResponse", c0062y);
            this.f317h = c0062y;
            return this;
        }

        /* renamed from: o */
        public a m447o(C0062y c0062y) {
            m437e(c0062y);
            this.f319j = c0062y;
            return this;
        }

        /* renamed from: p */
        public a m448p(Protocol protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f311b = protocol;
            return this;
        }

        /* renamed from: q */
        public a m449q(long j10) {
            this.f321l = j10;
            return this;
        }

        /* renamed from: r */
        public a m450r(C0060w request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f310a = request;
            return this;
        }

        /* renamed from: s */
        public a m451s(long j10) {
            this.f320k = j10;
            return this;
        }

        public a(C0062y response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f312c = -1;
            this.f310a = response.m431w();
            this.f311b = response.m429u();
            this.f312c = response.m418i();
            this.f313d = response.m425q();
            this.f314e = response.m420k();
            this.f315f = response.m423o().m182c();
            this.f316g = response.m414a();
            this.f317h = response.m426r();
            this.f318i = response.m416g();
            this.f319j = response.m428t();
            this.f320k = response.m432x();
            this.f321l = response.m430v();
            this.f322m = response.m419j();
        }
    }
}
