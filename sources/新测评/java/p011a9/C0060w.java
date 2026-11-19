package p011a9;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p011a9.C0054q;
import p028b9.AbstractC5070d;
import p103g9.C7605f;

/* renamed from: a9.w */
/* loaded from: classes5.dex */
public final class C0060w {

    /* renamed from: a */
    public final C0055r f277a;

    /* renamed from: b */
    public final String f278b;

    /* renamed from: c */
    public final C0054q f279c;

    /* renamed from: d */
    public final AbstractC0061x f280d;

    /* renamed from: e */
    public final Map f281e;

    /* renamed from: f */
    public C0041d f282f;

    public C0060w(C0055r url, String method, C0054q headers, AbstractC0061x abstractC0061x, Map tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f277a = url;
        this.f278b = method;
        this.f279c = headers;
        this.f280d = abstractC0061x;
        this.f281e = tags;
    }

    /* renamed from: a */
    public final AbstractC0061x m372a() {
        return this.f280d;
    }

    /* renamed from: b */
    public final C0041d m373b() {
        C0041d c0041d = this.f282f;
        if (c0041d != null) {
            return c0041d;
        }
        C0041d c0041dM106b = C0041d.f101n.m106b(this.f279c);
        this.f282f = c0041dM106b;
        return c0041dM106b;
    }

    /* renamed from: c */
    public final Map m374c() {
        return this.f281e;
    }

    /* renamed from: d */
    public final String m375d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f279c.m180a(name);
    }

    /* renamed from: e */
    public final C0054q m376e() {
        return this.f279c;
    }

    /* renamed from: f */
    public final boolean m377f() {
        return this.f277a.m211j();
    }

    /* renamed from: g */
    public final String m378g() {
        return this.f278b;
    }

    /* renamed from: h */
    public final a m379h() {
        return new a(this);
    }

    /* renamed from: i */
    public final Object m380i(Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.f281e.get(type));
    }

    /* renamed from: j */
    public final C0055r m381j() {
        return this.f277a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f278b);
        sb.append(", url=");
        sb.append(this.f277a);
        if (this.f279c.size() != 0) {
            sb.append(", headers=[");
            int i10 = 0;
            for (Object obj : this.f279c) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i10 = i11;
            }
            sb.append(']');
        }
        if (!this.f281e.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f281e);
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: a9.w$a */
    public static class a {

        /* renamed from: a */
        public C0055r f283a;

        /* renamed from: b */
        public String f284b;

        /* renamed from: c */
        public C0054q.a f285c;

        /* renamed from: d */
        public AbstractC0061x f286d;

        /* renamed from: e */
        public Map f287e;

        public a() {
            this.f287e = new LinkedHashMap();
            this.f284b = "GET";
            this.f285c = new C0054q.a();
        }

        /* renamed from: e */
        public static /* synthetic */ a m382e(a aVar, AbstractC0061x abstractC0061x, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i10 & 1) != 0) {
                abstractC0061x = AbstractC5070d.f2636d;
            }
            return aVar.m386d(abstractC0061x);
        }

        /* renamed from: a */
        public a m383a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f285c.m186a(name, value);
            return this;
        }

        /* renamed from: b */
        public C0060w m384b() {
            C0055r c0055r = this.f283a;
            if (c0055r != null) {
                return new C0060w(c0055r, this.f284b, this.f285c.m191f(), this.f286d, AbstractC5070d.m2629T(this.f287e));
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: c */
        public final a m385c() {
            return m382e(this, null, 1, null);
        }

        /* renamed from: d */
        public a m386d(AbstractC0061x abstractC0061x) {
            return m391j("DELETE", abstractC0061x);
        }

        /* renamed from: f */
        public a m387f() {
            return m391j("GET", null);
        }

        /* renamed from: g */
        public a m388g() {
            return m391j("HEAD", null);
        }

        /* renamed from: h */
        public a m389h(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f285c.m194i(name, value);
            return this;
        }

        /* renamed from: i */
        public a m390i(C0054q headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f285c = headers.m182c();
            return this;
        }

        /* renamed from: j */
        public a m391j(String method, AbstractC0061x abstractC0061x) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (abstractC0061x == null) {
                if (C7605f.m12510d(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!C7605f.m12509a(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f284b = method;
            this.f286d = abstractC0061x;
            return this;
        }

        /* renamed from: k */
        public a m392k(AbstractC0061x body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return m391j("POST", body);
        }

        /* renamed from: l */
        public a m393l(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f285c.m193h(name);
            return this;
        }

        /* renamed from: m */
        public a m394m(Class type, Object obj) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (obj == null) {
                this.f287e.remove(type);
                return this;
            }
            if (this.f287e.isEmpty()) {
                this.f287e = new LinkedHashMap();
            }
            Map map = this.f287e;
            Object objCast = type.cast(obj);
            Intrinsics.checkNotNull(objCast);
            map.put(type, objCast);
            return this;
        }

        /* renamed from: n */
        public a m395n(C0055r url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f283a = url;
            return this;
        }

        /* renamed from: o */
        public a m396o(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt.startsWith(url, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                url = sb.toString();
            } else if (StringsKt.startsWith(url, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String strSubstring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring2);
                url = sb2.toString();
            }
            return m395n(C0055r.f168k.m259d(url));
        }

        public a(C0060w request) {
            Map mutableMap;
            Intrinsics.checkNotNullParameter(request, "request");
            this.f287e = new LinkedHashMap();
            this.f283a = request.m381j();
            this.f284b = request.m378g();
            this.f286d = request.m372a();
            if (request.m374c().isEmpty()) {
                mutableMap = new LinkedHashMap();
            } else {
                mutableMap = MapsKt.toMutableMap(request.m374c());
            }
            this.f287e = mutableMap;
            this.f285c = request.m376e().m182c();
        }
    }
}
