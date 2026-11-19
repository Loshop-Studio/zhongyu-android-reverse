package p058f5;

import java.io.Closeable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C7527c;
import okhttp3.Protocol;
import p058f5.C6383v;
import p093k5.C6685h;
import p102l5.AbstractC7351e;

/* renamed from: f5.d0 */
/* loaded from: classes4.dex */
public final class C6362d0 implements Closeable {

    /* renamed from: a */
    public final C6358b0 f7857a;

    /* renamed from: b */
    public final Protocol f7858b;

    /* renamed from: c */
    public final String f7859c;

    /* renamed from: d */
    public final int f7860d;

    /* renamed from: e */
    public final C7527c f7861e;

    /* renamed from: f */
    public final C6383v f7862f;

    /* renamed from: g */
    public final AbstractC6364e0 f7863g;

    /* renamed from: h */
    public final C6362d0 f7864h;

    /* renamed from: i */
    public final C6362d0 f7865i;

    /* renamed from: j */
    public final C6362d0 f7866j;

    /* renamed from: k */
    public final long f7867k;

    /* renamed from: l */
    public final long f7868l;

    /* renamed from: m */
    public final C6685h f7869m;

    /* renamed from: n */
    public InterfaceC6368g0 f7870n;

    /* renamed from: o */
    public C6361d f7871o;

    /* renamed from: p */
    public final boolean f7872p;

    /* renamed from: q */
    public final boolean f7873q;

    public C6362d0(C6358b0 request, Protocol protocol, String message, int i6, C7527c c7527c, C6383v headers, AbstractC6364e0 body, C6362d0 c6362d0, C6362d0 c6362d02, C6362d0 c6362d03, long j6, long j7, C6685h c6685h, InterfaceC6368g0 trailersSource) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(trailersSource, "trailersSource");
        this.f7857a = request;
        this.f7858b = protocol;
        this.f7859c = message;
        this.f7860d = i6;
        this.f7861e = c7527c;
        this.f7862f = headers;
        this.f7863g = body;
        this.f7864h = c6362d0;
        this.f7865i = c6362d02;
        this.f7866j = c6362d03;
        this.f7867k = j6;
        this.f7868l = j7;
        this.f7869m = c6685h;
        this.f7870n = trailersSource;
        boolean z6 = true;
        this.f7872p = 200 <= i6 && i6 < 300;
        if (i6 != 307 && i6 != 308) {
            switch (i6) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    z6 = false;
                    break;
            }
        }
        this.f7873q = z6;
    }

    /* renamed from: o */
    public static /* synthetic */ String m6660o(C6362d0 c6362d0, String str, String str2, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            str2 = null;
        }
        return c6362d0.m6669n(str, str2);
    }

    /* renamed from: c */
    public final AbstractC6364e0 m6661c() {
        return this.f7863g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7863g.close();
    }

    /* renamed from: g */
    public final C6361d m6662g() {
        C6361d c6361d = this.f7871o;
        if (c6361d != null) {
            return c6361d;
        }
        C6361d c6361dM6658a = C6361d.f7833n.m6658a(this.f7862f);
        this.f7871o = c6361dM6658a;
        return c6361dM6658a;
    }

    /* renamed from: h */
    public final C6362d0 m6663h() {
        return this.f7865i;
    }

    /* renamed from: i */
    public final List m6664i() {
        String str;
        C6383v c6383v = this.f7862f;
        int i6 = this.f7860d;
        if (i6 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i6 != 407) {
                return CollectionsKt.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return AbstractC7351e.m8331a(c6383v, str);
    }

    /* renamed from: j */
    public final int m6665j() {
        return this.f7860d;
    }

    /* renamed from: k */
    public final C6685h m6666k() {
        return this.f7869m;
    }

    /* renamed from: l */
    public final C7527c m6667l() {
        return this.f7861e;
    }

    /* renamed from: m */
    public final String m6668m(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return m6660o(this, name, null, 2, null);
    }

    /* renamed from: n */
    public final String m6669n(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strM6799a = this.f7862f.m6799a(name);
        return strM6799a == null ? str : strM6799a;
    }

    /* renamed from: p */
    public final C6383v m6670p() {
        return this.f7862f;
    }

    /* renamed from: q */
    public final boolean m6671q() {
        return this.f7872p;
    }

    /* renamed from: r */
    public final String m6672r() {
        return this.f7859c;
    }

    /* renamed from: s */
    public final C6362d0 m6673s() {
        return this.f7864h;
    }

    /* renamed from: t */
    public final a m6674t() {
        return new a(this);
    }

    public String toString() {
        return "Response{protocol=" + this.f7858b + ", code=" + this.f7860d + ", message=" + this.f7859c + ", url=" + this.f7857a.m6588l() + '}';
    }

    /* renamed from: u */
    public final C6362d0 m6675u() {
        return this.f7866j;
    }

    /* renamed from: v */
    public final Protocol m6676v() {
        return this.f7858b;
    }

    /* renamed from: w */
    public final long m6677w() {
        return this.f7868l;
    }

    /* renamed from: x */
    public final C6358b0 m6678x() {
        return this.f7857a;
    }

    /* renamed from: y */
    public final long m6679y() {
        return this.f7867k;
    }

    /* renamed from: f5.d0$a */
    public static class a {

        /* renamed from: a */
        public C6358b0 f7874a;

        /* renamed from: b */
        public Protocol f7875b;

        /* renamed from: c */
        public int f7876c;

        /* renamed from: d */
        public String f7877d;

        /* renamed from: e */
        public C7527c f7878e;

        /* renamed from: f */
        public C6383v.a f7879f;

        /* renamed from: g */
        public AbstractC6364e0 f7880g;

        /* renamed from: h */
        public C6362d0 f7881h;

        /* renamed from: i */
        public C6362d0 f7882i;

        /* renamed from: j */
        public C6362d0 f7883j;

        /* renamed from: k */
        public long f7884k;

        /* renamed from: l */
        public long f7885l;

        /* renamed from: m */
        public C6685h f7886m;

        /* renamed from: n */
        public InterfaceC6368g0 f7887n;

        public a() {
            this.f7876c = -1;
            this.f7880g = AbstractC6364e0.EMPTY;
            this.f7887n = InterfaceC6368g0.f7902b;
            this.f7879f = new C6383v.a();
        }

        /* renamed from: a */
        public a m6680a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7879f.m6806a(name, value);
            return this;
        }

        /* renamed from: b */
        public a m6681b(AbstractC6364e0 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            this.f7880g = body;
            return this;
        }

        /* renamed from: c */
        public C6362d0 m6682c() {
            int i6 = this.f7876c;
            if (i6 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f7876c).toString());
            }
            C6358b0 c6358b0 = this.f7874a;
            if (c6358b0 == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.f7875b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f7877d;
            if (str != null) {
                return new C6362d0(c6358b0, protocol, str, i6, this.f7878e, this.f7879f.m6811f(), this.f7880g, this.f7881h, this.f7882i, this.f7883j, this.f7884k, this.f7885l, this.f7886m, this.f7887n);
            }
            throw new IllegalStateException("message == null");
        }

        /* renamed from: d */
        public a m6683d(C6362d0 c6362d0) {
            m6684e("cacheResponse", c6362d0);
            this.f7882i = c6362d0;
            return this;
        }

        /* renamed from: e */
        public final void m6684e(String str, C6362d0 c6362d0) {
            if (c6362d0 != null) {
                if (c6362d0.m6673s() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (c6362d0.m6663h() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (c6362d0.m6675u() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        /* renamed from: f */
        public a m6685f(int i6) {
            this.f7876c = i6;
            return this;
        }

        /* renamed from: g */
        public final int m6686g() {
            return this.f7876c;
        }

        /* renamed from: h */
        public a m6687h(C7527c c7527c) {
            this.f7878e = c7527c;
            return this;
        }

        /* renamed from: i */
        public a m6688i(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7879f.m6814i(name, value);
            return this;
        }

        /* renamed from: j */
        public a m6689j(C6383v headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f7879f = headers.m6802d();
            return this;
        }

        /* renamed from: k */
        public final void m6690k(C6685h exchange) {
            Intrinsics.checkNotNullParameter(exchange, "exchange");
            this.f7886m = exchange;
        }

        /* renamed from: l */
        public a m6691l(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f7877d = message;
            return this;
        }

        /* renamed from: m */
        public a m6692m(C6362d0 c6362d0) {
            m6684e("networkResponse", c6362d0);
            this.f7881h = c6362d0;
            return this;
        }

        /* renamed from: n */
        public a m6693n(C6362d0 c6362d0) {
            this.f7883j = c6362d0;
            return this;
        }

        /* renamed from: o */
        public a m6694o(Protocol protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f7875b = protocol;
            return this;
        }

        /* renamed from: p */
        public a m6695p(long j6) {
            this.f7885l = j6;
            return this;
        }

        /* renamed from: q */
        public a m6696q(C6358b0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f7874a = request;
            return this;
        }

        /* renamed from: r */
        public a m6697r(long j6) {
            this.f7884k = j6;
            return this;
        }

        /* renamed from: s */
        public a m6698s(InterfaceC6368g0 trailersSource) {
            Intrinsics.checkNotNullParameter(trailersSource, "trailersSource");
            this.f7887n = trailersSource;
            return this;
        }

        public a(C6362d0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f7876c = -1;
            this.f7880g = AbstractC6364e0.EMPTY;
            this.f7887n = InterfaceC6368g0.f7902b;
            this.f7874a = response.m6678x();
            this.f7875b = response.m6676v();
            this.f7876c = response.m6665j();
            this.f7877d = response.m6672r();
            this.f7878e = response.m6667l();
            this.f7879f = response.m6670p().m6802d();
            this.f7880g = response.m6661c();
            this.f7881h = response.m6673s();
            this.f7882i = response.m6663h();
            this.f7883j = response.m6675u();
            this.f7884k = response.m6679y();
            this.f7885l = response.m6677w();
            this.f7886m = response.m6666k();
            this.f7887n = response.f7870n;
        }
    }
}
