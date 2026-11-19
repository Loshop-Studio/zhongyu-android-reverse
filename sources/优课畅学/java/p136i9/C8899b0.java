package p136i9;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9116d0;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.AbstractC8376d;
import p089e8.InterfaceC8375c;
import p113g8.AbstractC8687z;
import p134i7.AbstractC8809v;
import p136i9.C8924v;
import p147j9.AbstractC9038h;
import p203o9.C9551f;
import p289w7.AbstractC10360a;

/* renamed from: i9.b0 */
/* loaded from: classes5.dex */
public final class C8899b0 {

    /* renamed from: a */
    public final C8925w f16639a;

    /* renamed from: b */
    public final String f16640b;

    /* renamed from: c */
    public final C8924v f16641c;

    /* renamed from: d */
    public final AbstractC8901c0 f16642d;

    /* renamed from: e */
    public final C8925w f16643e;

    /* renamed from: f */
    public final Map f16644f;

    /* renamed from: g */
    public C8902d f16645g;

    public C8899b0(a builder) {
        AbstractC9133u.m16133g(builder, "builder");
        C8925w c8925wM15065m = builder.m15065m();
        if (c8925wM15065m == null) {
            throw new IllegalStateException("url == null");
        }
        this.f16639a = c8925wM15065m;
        this.f16640b = builder.m15063k();
        this.f16641c = builder.m15062j().m15272f();
        this.f16642d = builder.m15060h();
        this.f16643e = builder.m15061i();
        this.f16644f = AbstractC9080a.m15956u(builder.m15064l());
    }

    /* renamed from: a */
    public final AbstractC8901c0 m15041a() {
        return this.f16642d;
    }

    /* renamed from: b */
    public final C8902d m15042b() {
        C8902d c8902d = this.f16645g;
        if (c8902d != null) {
            return c8902d;
        }
        C8902d c8902dM15121a = C8902d.f16665n.m15121a(this.f16641c);
        this.f16645g = c8902dM15121a;
        return c8902dM15121a;
    }

    /* renamed from: c */
    public final C8925w m15043c() {
        return this.f16643e;
    }

    /* renamed from: d */
    public final Map m15044d() {
        return this.f16644f;
    }

    /* renamed from: e */
    public final String m15045e(String name) {
        AbstractC9133u.m16133g(name, "name");
        return this.f16641c.m15260a(name);
    }

    /* renamed from: f */
    public final C8924v m15046f() {
        return this.f16641c;
    }

    /* renamed from: g */
    public final boolean m15047g() {
        return this.f16639a.m15285i();
    }

    /* renamed from: h */
    public final String m15048h() {
        return this.f16640b;
    }

    /* renamed from: i */
    public final a m15049i() {
        return new a(this);
    }

    /* renamed from: j */
    public final Object m15050j(InterfaceC8375c type) {
        AbstractC9133u.m16133g(type, "type");
        return AbstractC10360a.m19298a(type).cast(this.f16644f.get(type));
    }

    /* renamed from: k */
    public final Object m15051k(Class type) {
        AbstractC9133u.m16133g(type, "type");
        return m15050j(AbstractC10360a.m19300c(type));
    }

    /* renamed from: l */
    public final C8925w m15052l() {
        return this.f16639a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.f16640b);
        sb.append(", url=");
        sb.append(this.f16639a);
        if (this.f16641c.size() != 0) {
            sb.append(", headers=[");
            int i10 = 0;
            for (Object obj : this.f16641c) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC8809v.m14780w();
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.m15903a();
                String str2 = (String) pair.m15904b();
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (AbstractC9038h.m15766v(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i10 = i11;
            }
            sb.append(']');
        }
        if (!this.f16644f.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f16644f);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: i9.b0$a */
    public static class a {

        /* renamed from: a */
        public C8925w f16646a;

        /* renamed from: b */
        public String f16647b;

        /* renamed from: c */
        public C8924v.a f16648c;

        /* renamed from: d */
        public AbstractC8901c0 f16649d;

        /* renamed from: e */
        public C8925w f16650e;

        /* renamed from: f */
        public Map f16651f;

        public a() {
            this.f16651f = AbstractC9080a.m15943h();
            this.f16647b = "GET";
            this.f16648c = new C8924v.a();
        }

        /* renamed from: f */
        public static /* synthetic */ a m15053f(a aVar, AbstractC8901c0 abstractC8901c0, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i10 & 1) != 0) {
                abstractC8901c0 = AbstractC8901c0.EMPTY;
            }
            return aVar.m15058e(abstractC8901c0);
        }

        /* renamed from: a */
        public a m15054a(String name, String value) {
            AbstractC9133u.m16133g(name, "name");
            AbstractC9133u.m16133g(value, "value");
            this.f16648c.m15267a(name, value);
            return this;
        }

        /* renamed from: b */
        public C8899b0 m15055b() {
            return new C8899b0(this);
        }

        /* renamed from: c */
        public final String m15056c(String str) {
            if (AbstractC8687z.m14103K(str, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String strSubstring = str.substring(3);
                AbstractC9133u.m16132f(strSubstring, "substring(...)");
                sb.append(strSubstring);
                return sb.toString();
            }
            if (!AbstractC8687z.m14103K(str, "wss:", true)) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("https:");
            String strSubstring2 = str.substring(4);
            AbstractC9133u.m16132f(strSubstring2, "substring(...)");
            sb2.append(strSubstring2);
            return sb2.toString();
        }

        /* renamed from: d */
        public final a m15057d() {
            return m15053f(this, null, 1, null);
        }

        /* renamed from: e */
        public a m15058e(AbstractC8901c0 abstractC8901c0) {
            return m15069q("DELETE", abstractC8901c0);
        }

        /* renamed from: g */
        public a m15059g() {
            return m15069q("GET", null);
        }

        /* renamed from: h */
        public final AbstractC8901c0 m15060h() {
            return this.f16649d;
        }

        /* renamed from: i */
        public final C8925w m15061i() {
            return this.f16650e;
        }

        /* renamed from: j */
        public final C8924v.a m15062j() {
            return this.f16648c;
        }

        /* renamed from: k */
        public final String m15063k() {
            return this.f16647b;
        }

        /* renamed from: l */
        public final Map m15064l() {
            return this.f16651f;
        }

        /* renamed from: m */
        public final C8925w m15065m() {
            return this.f16646a;
        }

        /* renamed from: n */
        public a m15066n() {
            return m15069q("HEAD", null);
        }

        /* renamed from: o */
        public a m15067o(String name, String value) {
            AbstractC9133u.m16133g(name, "name");
            AbstractC9133u.m16133g(value, "value");
            this.f16648c.m15275i(name, value);
            return this;
        }

        /* renamed from: p */
        public a m15068p(C8924v headers) {
            AbstractC9133u.m16133g(headers, "headers");
            this.f16648c = headers.m15263d();
            return this;
        }

        /* renamed from: q */
        public a m15069q(String method, AbstractC8901c0 abstractC8901c0) {
            AbstractC9133u.m16133g(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (abstractC8901c0 == null) {
                if (C9551f.m17845d(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!C9551f.m17844a(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f16647b = method;
            this.f16649d = abstractC8901c0;
            return this;
        }

        /* renamed from: r */
        public a m15070r(String name) {
            AbstractC9133u.m16133g(name, "name");
            this.f16648c.m15274h(name);
            return this;
        }

        /* renamed from: s */
        public final a m15071s(InterfaceC8375c type, Object obj) {
            Map mapM16095d;
            AbstractC9133u.m16133g(type, "type");
            if (obj == null) {
                if (!this.f16651f.isEmpty()) {
                    Map map = this.f16651f;
                    AbstractC9133u.m16131e(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                    AbstractC9116d0.m16095d(map).remove(type);
                }
                return this;
            }
            if (this.f16651f.isEmpty()) {
                mapM16095d = new LinkedHashMap();
                this.f16651f = mapM16095d;
            } else {
                Map map2 = this.f16651f;
                AbstractC9133u.m16131e(map2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                mapM16095d = AbstractC9116d0.m16095d(map2);
            }
            mapM16095d.put(type, AbstractC8376d.m13673a(type, obj));
            return this;
        }

        /* renamed from: t */
        public a m15072t(Class type, Object obj) {
            AbstractC9133u.m16133g(type, "type");
            return m15071s(AbstractC10360a.m19300c(type), obj);
        }

        /* renamed from: u */
        public a m15073u(C8925w url) {
            AbstractC9133u.m16133g(url, "url");
            this.f16646a = url;
            return this;
        }

        /* renamed from: v */
        public a m15074v(String url) {
            AbstractC9133u.m16133g(url, "url");
            return m15073u(C8925w.f16797j.m15329c(m15056c(url)));
        }

        public a(C8899b0 request) {
            AbstractC9133u.m16133g(request, "request");
            this.f16651f = AbstractC9080a.m15943h();
            this.f16646a = request.m15052l();
            this.f16647b = request.m15048h();
            this.f16649d = request.m15041a();
            this.f16651f = request.m15044d().isEmpty() ? AbstractC9080a.m15943h() : AbstractC9080a.m15959x(request.m15044d());
            this.f16648c = request.m15046f().m15263d();
            this.f16650e = request.m15043c();
        }
    }
}
