package je;

import anet.channel.request.Request;
import java.util.LinkedHashMap;
import java.util.Map;
import je.C9737q;
import ke.AbstractC9920d;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10978w;
import pe.C10679f;

/* renamed from: je.w */
/* loaded from: classes6.dex */
public final class C9743w {

    /* renamed from: a */
    public final C9738r f22858a;

    /* renamed from: b */
    public final String f22859b;

    /* renamed from: c */
    public final C9737q f22860c;

    /* renamed from: d */
    public final AbstractC9744x f22861d;

    /* renamed from: e */
    public final Map f22862e;

    /* renamed from: f */
    public C9724d f22863f;

    public C9743w(C9738r url, String method, C9737q headers, AbstractC9744x abstractC9744x, Map tags) {
        AbstractC9979u.m20294g(url, "url");
        AbstractC9979u.m20294g(method, "method");
        AbstractC9979u.m20294g(headers, "headers");
        AbstractC9979u.m20294g(tags, "tags");
        this.f22858a = url;
        this.f22859b = method;
        this.f22860c = headers;
        this.f22861d = abstractC9744x;
        this.f22862e = tags;
    }

    /* renamed from: a */
    public final AbstractC9744x m19583a() {
        return this.f22861d;
    }

    /* renamed from: b */
    public final C9724d m19584b() {
        C9724d c9724d = this.f22863f;
        if (c9724d != null) {
            return c9724d;
        }
        C9724d c9724dM19317b = C9724d.f22682n.m19317b(this.f22860c);
        this.f22863f = c9724dM19317b;
        return c9724dM19317b;
    }

    /* renamed from: c */
    public final Map m19585c() {
        return this.f22862e;
    }

    /* renamed from: d */
    public final String m19586d(String name) {
        AbstractC9979u.m20294g(name, "name");
        return this.f22860c.m19389a(name);
    }

    /* renamed from: e */
    public final C9737q m19587e() {
        return this.f22860c;
    }

    /* renamed from: f */
    public final boolean m19588f() {
        return this.f22858a.m19420j();
    }

    /* renamed from: g */
    public final String m19589g() {
        return this.f22859b;
    }

    /* renamed from: h */
    public final a m19590h() {
        return new a(this);
    }

    /* renamed from: i */
    public final Object m19591i(Class type) {
        AbstractC9979u.m20294g(type, "type");
        return type.cast(this.f22862e.get(type));
    }

    /* renamed from: j */
    public final C9738r m19592j() {
        return this.f22858a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f22859b);
        sb2.append(", url=");
        sb2.append(this.f22858a);
        if (this.f22860c.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Object obj : this.f22860c) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC10978w.m24145w();
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.m20048a();
                String str2 = (String) pair.m20049c();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!this.f22862e.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f22862e);
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: je.w$a */
    public static class a {

        /* renamed from: a */
        public C9738r f22864a;

        /* renamed from: b */
        public String f22865b;

        /* renamed from: c */
        public C9737q.a f22866c;

        /* renamed from: d */
        public AbstractC9744x f22867d;

        /* renamed from: e */
        public Map f22868e;

        public a() {
            this.f22868e = new LinkedHashMap();
            this.f22865b = "GET";
            this.f22866c = new C9737q.a();
        }

        /* renamed from: e */
        public static /* synthetic */ a m19593e(a aVar, AbstractC9744x abstractC9744x, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i10 & 1) != 0) {
                abstractC9744x = AbstractC9920d.f23244d;
            }
            return aVar.m19597d(abstractC9744x);
        }

        /* renamed from: a */
        public a m19594a(String name, String value) {
            AbstractC9979u.m20294g(name, "name");
            AbstractC9979u.m20294g(value, "value");
            this.f22866c.m19395a(name, value);
            return this;
        }

        /* renamed from: b */
        public C9743w m19595b() {
            C9738r c9738r = this.f22864a;
            if (c9738r != null) {
                return new C9743w(c9738r, this.f22865b, this.f22866c.m19400f(), this.f22867d, AbstractC9920d.m20012T(this.f22868e));
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: c */
        public final a m19596c() {
            return m19593e(this, null, 1, null);
        }

        /* renamed from: d */
        public a m19597d(AbstractC9744x abstractC9744x) {
            return m19602j(Request.Method.DELETE, abstractC9744x);
        }

        /* renamed from: f */
        public a m19598f() {
            return m19602j("GET", null);
        }

        /* renamed from: g */
        public a m19599g() {
            return m19602j(Request.Method.HEAD, null);
        }

        /* renamed from: h */
        public a m19600h(String name, String value) {
            AbstractC9979u.m20294g(name, "name");
            AbstractC9979u.m20294g(value, "value");
            this.f22866c.m19403i(name, value);
            return this;
        }

        /* renamed from: i */
        public a m19601i(C9737q headers) {
            AbstractC9979u.m20294g(headers, "headers");
            this.f22866c = headers.m19391c();
            return this;
        }

        /* renamed from: j */
        public a m19602j(String method, AbstractC9744x abstractC9744x) {
            AbstractC9979u.m20294g(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (abstractC9744x == null) {
                if (C10679f.m22623d(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!C10679f.m22622a(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f22865b = method;
            this.f22867d = abstractC9744x;
            return this;
        }

        /* renamed from: k */
        public a m19603k(AbstractC9744x body) {
            AbstractC9979u.m20294g(body, "body");
            return m19602j("POST", body);
        }

        /* renamed from: l */
        public a m19604l(AbstractC9744x body) {
            AbstractC9979u.m20294g(body, "body");
            return m19602j(Request.Method.PUT, body);
        }

        /* renamed from: m */
        public a m19605m(String name) {
            AbstractC9979u.m20294g(name, "name");
            this.f22866c.m19402h(name);
            return this;
        }

        /* renamed from: n */
        public a m19606n(Class type, Object obj) {
            AbstractC9979u.m20294g(type, "type");
            if (obj == null) {
                this.f22868e.remove(type);
                return this;
            }
            if (this.f22868e.isEmpty()) {
                this.f22868e = new LinkedHashMap();
            }
            Map map = this.f22868e;
            Object objCast = type.cast(obj);
            AbstractC9979u.m20291d(objCast);
            map.put(type, objCast);
            return this;
        }

        /* renamed from: o */
        public a m19607o(Object obj) {
            return m19606n(Object.class, obj);
        }

        /* renamed from: p */
        public a m19608p(String url) {
            AbstractC9979u.m20294g(url, "url");
            if (AbstractC10819z.m23240M(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String strSubstring = url.substring(3);
                AbstractC9979u.m20293f(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                url = sb2.toString();
            } else if (AbstractC10819z.m23240M(url, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https:");
                String strSubstring2 = url.substring(4);
                AbstractC9979u.m20293f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb3.append(strSubstring2);
                url = sb3.toString();
            }
            return m19609q(C9738r.f22749k.m19468d(url));
        }

        /* renamed from: q */
        public a m19609q(C9738r url) {
            AbstractC9979u.m20294g(url, "url");
            this.f22864a = url;
            return this;
        }

        public a(C9743w request) {
            Map mapM20104x;
            AbstractC9979u.m20294g(request, "request");
            this.f22868e = new LinkedHashMap();
            this.f22864a = request.m19592j();
            this.f22865b = request.m19589g();
            this.f22867d = request.m19583a();
            if (request.m19585c().isEmpty()) {
                mapM20104x = new LinkedHashMap();
            } else {
                mapM20104x = AbstractC9925a.m20104x(request.m19585c());
            }
            this.f22868e = mapM20104x;
            this.f22866c = request.m19587e().m19391c();
        }
    }
}
