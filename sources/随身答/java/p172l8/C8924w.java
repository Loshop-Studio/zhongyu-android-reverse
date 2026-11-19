package p172l8;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p172l8.C8918q;
import p182m8.AbstractC9045d;
import p236r8.C9444f;

/* renamed from: l8.w */
/* loaded from: classes5.dex */
public final class C8924w {

    /* renamed from: a */
    public final C8919r f14905a;

    /* renamed from: b */
    public final String f14906b;

    /* renamed from: c */
    public final C8918q f14907c;

    /* renamed from: d */
    public final AbstractC8925x f14908d;

    /* renamed from: e */
    public final Map f14909e;

    /* renamed from: f */
    public C8905d f14910f;

    public C8924w(C8919r url, String method, C8918q headers, AbstractC8925x abstractC8925x, Map tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f14905a = url;
        this.f14906b = method;
        this.f14907c = headers;
        this.f14908d = abstractC8925x;
        this.f14909e = tags;
    }

    /* renamed from: a */
    public final AbstractC8925x m14128a() {
        return this.f14908d;
    }

    /* renamed from: b */
    public final C8905d m14129b() {
        C8905d c8905d = this.f14910f;
        if (c8905d != null) {
            return c8905d;
        }
        C8905d c8905dM13865b = C8905d.f14729n.m13865b(this.f14907c);
        this.f14910f = c8905dM13865b;
        return c8905dM13865b;
    }

    /* renamed from: c */
    public final Map m14130c() {
        return this.f14909e;
    }

    /* renamed from: d */
    public final String m14131d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f14907c.m13936a(name);
    }

    /* renamed from: e */
    public final C8918q m14132e() {
        return this.f14907c;
    }

    /* renamed from: f */
    public final boolean m14133f() {
        return this.f14905a.m13967j();
    }

    /* renamed from: g */
    public final String m14134g() {
        return this.f14906b;
    }

    /* renamed from: h */
    public final a m14135h() {
        return new a(this);
    }

    /* renamed from: i */
    public final Object m14136i(Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.f14909e.get(type));
    }

    /* renamed from: j */
    public final C8919r m14137j() {
        return this.f14905a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f14906b);
        sb.append(", url=");
        sb.append(this.f14905a);
        if (this.f14907c.size() != 0) {
            sb.append(", headers=[");
            int i9 = 0;
            for (Object obj : this.f14907c) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (i9 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i9 = i10;
            }
            sb.append(']');
        }
        if (!this.f14909e.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f14909e);
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: l8.w$a */
    public static class a {

        /* renamed from: a */
        public C8919r f14911a;

        /* renamed from: b */
        public String f14912b;

        /* renamed from: c */
        public C8918q.a f14913c;

        /* renamed from: d */
        public AbstractC8925x f14914d;

        /* renamed from: e */
        public Map f14915e;

        public a() {
            this.f14915e = new LinkedHashMap();
            this.f14912b = "GET";
            this.f14913c = new C8918q.a();
        }

        /* renamed from: e */
        public static /* synthetic */ a m14138e(a aVar, AbstractC8925x abstractC8925x, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i9 & 1) != 0) {
                abstractC8925x = AbstractC9045d.f15227d;
            }
            return aVar.m14142d(abstractC8925x);
        }

        /* renamed from: a */
        public a m14139a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f14913c.m13942a(name, value);
            return this;
        }

        /* renamed from: b */
        public C8924w m14140b() {
            C8919r c8919r = this.f14911a;
            if (c8919r != null) {
                return new C8924w(c8919r, this.f14912b, this.f14913c.m13947f(), this.f14914d, AbstractC9045d.m14478T(this.f14915e));
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: c */
        public final a m14141c() {
            return m14138e(this, null, 1, null);
        }

        /* renamed from: d */
        public a m14142d(AbstractC8925x abstractC8925x) {
            return m14147j("DELETE", abstractC8925x);
        }

        /* renamed from: f */
        public a m14143f() {
            return m14147j("GET", null);
        }

        /* renamed from: g */
        public a m14144g() {
            return m14147j("HEAD", null);
        }

        /* renamed from: h */
        public a m14145h(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f14913c.m13950i(name, value);
            return this;
        }

        /* renamed from: i */
        public a m14146i(C8918q headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f14913c = headers.m13938c();
            return this;
        }

        /* renamed from: j */
        public a m14147j(String method, AbstractC8925x abstractC8925x) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (abstractC8925x == null) {
                if (C9444f.m15597d(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!C9444f.m15596a(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f14912b = method;
            this.f14914d = abstractC8925x;
            return this;
        }

        /* renamed from: k */
        public a m14148k(AbstractC8925x body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return m14147j("POST", body);
        }

        /* renamed from: l */
        public a m14149l(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f14913c.m13949h(name);
            return this;
        }

        /* renamed from: m */
        public a m14150m(Class type, Object obj) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (obj == null) {
                this.f14915e.remove(type);
                return this;
            }
            if (this.f14915e.isEmpty()) {
                this.f14915e = new LinkedHashMap();
            }
            Map map = this.f14915e;
            Object objCast = type.cast(obj);
            Intrinsics.checkNotNull(objCast);
            map.put(type, objCast);
            return this;
        }

        /* renamed from: n */
        public a m14151n(String url) {
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
            return m14152o(C8919r.f14796k.m14015d(url));
        }

        /* renamed from: o */
        public a m14152o(C8919r url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f14911a = url;
            return this;
        }

        public a(C8924w request) {
            Map mutableMap;
            Intrinsics.checkNotNullParameter(request, "request");
            this.f14915e = new LinkedHashMap();
            this.f14911a = request.m14137j();
            this.f14912b = request.m14134g();
            this.f14914d = request.m14128a();
            if (request.m14130c().isEmpty()) {
                mutableMap = new LinkedHashMap();
            } else {
                mutableMap = MapsKt.toMutableMap(request.m14130c());
            }
            this.f14915e = mutableMap;
            this.f14913c = request.m14132e().m13938c();
        }
    }
}
