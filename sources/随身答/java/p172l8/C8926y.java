package p172l8;

import java.io.Closeable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Handshake;
import okhttp3.Protocol;
import p172l8.C8918q;
import p226q8.C9380c;
import p236r8.AbstractC9443e;

/* renamed from: l8.y */
/* loaded from: classes5.dex */
public final class C8926y implements Closeable {

    /* renamed from: a */
    public final C8924w f14924a;

    /* renamed from: b */
    public final Protocol f14925b;

    /* renamed from: c */
    public final String f14926c;

    /* renamed from: d */
    public final int f14927d;

    /* renamed from: e */
    public final Handshake f14928e;

    /* renamed from: f */
    public final C8918q f14929f;

    /* renamed from: g */
    public final AbstractC8927z f14930g;

    /* renamed from: h */
    public final C8926y f14931h;

    /* renamed from: i */
    public final C8926y f14932i;

    /* renamed from: j */
    public final C8926y f14933j;

    /* renamed from: k */
    public final long f14934k;

    /* renamed from: l */
    public final long f14935l;

    /* renamed from: m */
    public final C9380c f14936m;

    /* renamed from: n */
    public C8905d f14937n;

    public C8926y(C8924w request, Protocol protocol, String message, int i9, Handshake handshake, C8918q headers, AbstractC8927z abstractC8927z, C8926y c8926y, C8926y c8926y2, C8926y c8926y3, long j9, long j10, C9380c c9380c) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f14924a = request;
        this.f14925b = protocol;
        this.f14926c = message;
        this.f14927d = i9;
        this.f14928e = handshake;
        this.f14929f = headers;
        this.f14930g = abstractC8927z;
        this.f14931h = c8926y;
        this.f14932i = c8926y2;
        this.f14933j = c8926y3;
        this.f14934k = j9;
        this.f14935l = j10;
        this.f14936m = c9380c;
    }

    /* renamed from: n */
    public static /* synthetic */ String m14169n(C8926y c8926y, String str, String str2, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str2 = null;
        }
        return c8926y.m14178m(str, str2);
    }

    /* renamed from: a */
    public final AbstractC8927z m14170a() {
        return this.f14930g;
    }

    /* renamed from: c */
    public final C8905d m14171c() {
        C8905d c8905d = this.f14937n;
        if (c8905d != null) {
            return c8905d;
        }
        C8905d c8905dM13865b = C8905d.f14729n.m13865b(this.f14929f);
        this.f14937n = c8905dM13865b;
        return c8905dM13865b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC8927z abstractC8927z = this.f14930g;
        if (abstractC8927z == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC8927z.close();
    }

    /* renamed from: g */
    public final C8926y m14172g() {
        return this.f14932i;
    }

    /* renamed from: h */
    public final List m14173h() {
        String str;
        C8918q c8918q = this.f14929f;
        int i9 = this.f14927d;
        if (i9 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i9 != 407) {
                return CollectionsKt.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return AbstractC9443e.m15588a(c8918q, str);
    }

    /* renamed from: i */
    public final int m14174i() {
        return this.f14927d;
    }

    /* renamed from: j */
    public final C9380c m14175j() {
        return this.f14936m;
    }

    /* renamed from: k */
    public final Handshake m14176k() {
        return this.f14928e;
    }

    /* renamed from: l */
    public final String m14177l(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return m14169n(this, name, null, 2, null);
    }

    /* renamed from: m */
    public final String m14178m(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strM13936a = this.f14929f.m13936a(name);
        return strM13936a == null ? str : strM13936a;
    }

    /* renamed from: o */
    public final C8918q m14179o() {
        return this.f14929f;
    }

    /* renamed from: p */
    public final boolean m14180p() {
        int i9 = this.f14927d;
        return 200 <= i9 && i9 < 300;
    }

    /* renamed from: q */
    public final String m14181q() {
        return this.f14926c;
    }

    /* renamed from: r */
    public final C8926y m14182r() {
        return this.f14931h;
    }

    /* renamed from: s */
    public final a m14183s() {
        return new a(this);
    }

    /* renamed from: t */
    public final C8926y m14184t() {
        return this.f14933j;
    }

    public String toString() {
        return "Response{protocol=" + this.f14925b + ", code=" + this.f14927d + ", message=" + this.f14926c + ", url=" + this.f14924a.m14137j() + '}';
    }

    /* renamed from: u */
    public final Protocol m14185u() {
        return this.f14925b;
    }

    /* renamed from: v */
    public final long m14186v() {
        return this.f14935l;
    }

    /* renamed from: w */
    public final C8924w m14187w() {
        return this.f14924a;
    }

    /* renamed from: x */
    public final long m14188x() {
        return this.f14934k;
    }

    /* renamed from: l8.y$a */
    public static class a {

        /* renamed from: a */
        public C8924w f14938a;

        /* renamed from: b */
        public Protocol f14939b;

        /* renamed from: c */
        public int f14940c;

        /* renamed from: d */
        public String f14941d;

        /* renamed from: e */
        public Handshake f14942e;

        /* renamed from: f */
        public C8918q.a f14943f;

        /* renamed from: g */
        public AbstractC8927z f14944g;

        /* renamed from: h */
        public C8926y f14945h;

        /* renamed from: i */
        public C8926y f14946i;

        /* renamed from: j */
        public C8926y f14947j;

        /* renamed from: k */
        public long f14948k;

        /* renamed from: l */
        public long f14949l;

        /* renamed from: m */
        public C9380c f14950m;

        public a() {
            this.f14940c = -1;
            this.f14943f = new C8918q.a();
        }

        /* renamed from: a */
        public a m14189a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f14943f.m13942a(name, value);
            return this;
        }

        /* renamed from: b */
        public a m14190b(AbstractC8927z abstractC8927z) {
            this.f14944g = abstractC8927z;
            return this;
        }

        /* renamed from: c */
        public C8926y m14191c() {
            int i9 = this.f14940c;
            if (i9 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f14940c).toString());
            }
            C8924w c8924w = this.f14938a;
            if (c8924w == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.f14939b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f14941d;
            if (str != null) {
                return new C8926y(c8924w, protocol, str, i9, this.f14942e, this.f14943f.m13947f(), this.f14944g, this.f14945h, this.f14946i, this.f14947j, this.f14948k, this.f14949l, this.f14950m);
            }
            throw new IllegalStateException("message == null");
        }

        /* renamed from: d */
        public a m14192d(C8926y c8926y) {
            m14194f("cacheResponse", c8926y);
            this.f14946i = c8926y;
            return this;
        }

        /* renamed from: e */
        public final void m14193e(C8926y c8926y) {
            if (c8926y != null && c8926y.m14170a() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: f */
        public final void m14194f(String str, C8926y c8926y) {
            if (c8926y != null) {
                if (c8926y.m14170a() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (c8926y.m14182r() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (c8926y.m14172g() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (c8926y.m14184t() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        /* renamed from: g */
        public a m14195g(int i9) {
            this.f14940c = i9;
            return this;
        }

        /* renamed from: h */
        public final int m14196h() {
            return this.f14940c;
        }

        /* renamed from: i */
        public a m14197i(Handshake handshake) {
            this.f14942e = handshake;
            return this;
        }

        /* renamed from: j */
        public a m14198j(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f14943f.m13950i(name, value);
            return this;
        }

        /* renamed from: k */
        public a m14199k(C8918q headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f14943f = headers.m13938c();
            return this;
        }

        /* renamed from: l */
        public final void m14200l(C9380c deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.f14950m = deferredTrailers;
        }

        /* renamed from: m */
        public a m14201m(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f14941d = message;
            return this;
        }

        /* renamed from: n */
        public a m14202n(C8926y c8926y) {
            m14194f("networkResponse", c8926y);
            this.f14945h = c8926y;
            return this;
        }

        /* renamed from: o */
        public a m14203o(C8926y c8926y) {
            m14193e(c8926y);
            this.f14947j = c8926y;
            return this;
        }

        /* renamed from: p */
        public a m14204p(Protocol protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f14939b = protocol;
            return this;
        }

        /* renamed from: q */
        public a m14205q(long j9) {
            this.f14949l = j9;
            return this;
        }

        /* renamed from: r */
        public a m14206r(C8924w request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f14938a = request;
            return this;
        }

        /* renamed from: s */
        public a m14207s(long j9) {
            this.f14948k = j9;
            return this;
        }

        public a(C8926y response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f14940c = -1;
            this.f14938a = response.m14187w();
            this.f14939b = response.m14185u();
            this.f14940c = response.m14174i();
            this.f14941d = response.m14181q();
            this.f14942e = response.m14176k();
            this.f14943f = response.m14179o().m13938c();
            this.f14944g = response.m14170a();
            this.f14945h = response.m14182r();
            this.f14946i = response.m14172g();
            this.f14947j = response.m14184t();
            this.f14948k = response.m14188x();
            this.f14949l = response.m14186v();
            this.f14950m = response.m14175j();
        }
    }
}
