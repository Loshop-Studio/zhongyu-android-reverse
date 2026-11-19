package p117r2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p117r2.C4516s;
import p121s2.AbstractC4550b;
import p141x2.C4669f;

/* renamed from: r2.y */
/* loaded from: classes2.dex */
public final class C4522y {

    /* renamed from: a */
    public C4501d f5644a;

    /* renamed from: b */
    public final C4517t f5645b;

    /* renamed from: c */
    public final String f5646c;

    /* renamed from: d */
    public final C4516s f5647d;

    /* renamed from: e */
    public final AbstractC4523z f5648e;

    /* renamed from: f */
    public final Map f5649f;

    public C4522y(C4517t url, String method, C4516s headers, AbstractC4523z abstractC4523z, Map tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f5645b = url;
        this.f5646c = method;
        this.f5647d = headers;
        this.f5648e = abstractC4523z;
        this.f5649f = tags;
    }

    /* renamed from: a */
    public final AbstractC4523z m6132a() {
        return this.f5648e;
    }

    /* renamed from: b */
    public final C4501d m6133b() {
        C4501d c4501d = this.f5644a;
        if (c4501d != null) {
            return c4501d;
        }
        C4501d c4501dM5866b = C4501d.f5334p.m5866b(this.f5647d);
        this.f5644a = c4501dM5866b;
        return c4501dM5866b;
    }

    /* renamed from: c */
    public final Map m6134c() {
        return this.f5649f;
    }

    /* renamed from: d */
    public final String m6135d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f5647d.m5959a(name);
    }

    /* renamed from: e */
    public final C4516s m6136e() {
        return this.f5647d;
    }

    /* renamed from: f */
    public final boolean m6137f() {
        return this.f5645b.m5988j();
    }

    /* renamed from: g */
    public final String m6138g() {
        return this.f5646c;
    }

    /* renamed from: h */
    public final a m6139h() {
        return new a(this);
    }

    /* renamed from: i */
    public final Object m6140i(Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.f5649f.get(type));
    }

    /* renamed from: j */
    public final C4517t m6141j() {
        return this.f5645b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f5646c);
        sb.append(", url=");
        sb.append(this.f5645b);
        if (this.f5647d.size() != 0) {
            sb.append(", headers=[");
            int i4 = 0;
            for (Object obj : this.f5647d) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i4 = i5;
            }
            sb.append(']');
        }
        if (!this.f5649f.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f5649f);
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: r2.y$a */
    public static class a {

        /* renamed from: a */
        public C4517t f5650a;

        /* renamed from: b */
        public String f5651b;

        /* renamed from: c */
        public C4516s.a f5652c;

        /* renamed from: d */
        public AbstractC4523z f5653d;

        /* renamed from: e */
        public Map f5654e;

        public a() {
            this.f5654e = new LinkedHashMap();
            this.f5651b = "GET";
            this.f5652c = new C4516s.a();
        }

        /* renamed from: a */
        public a m6142a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5652c.m5964a(name, value);
            return this;
        }

        /* renamed from: b */
        public C4522y m6143b() {
            C4517t c4517t = this.f5650a;
            if (c4517t != null) {
                return new C4522y(c4517t, this.f5651b, this.f5652c.m5968e(), this.f5653d, AbstractC4550b.m6212O(this.f5654e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        /* renamed from: c */
        public a m6144c(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5652c.m5971h(name, value);
            return this;
        }

        /* renamed from: d */
        public a m6145d(C4516s headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f5652c = headers.m5961c();
            return this;
        }

        /* renamed from: e */
        public a m6146e(String method, AbstractC4523z abstractC4523z) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (!(method.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (abstractC4523z == null) {
                if (!(true ^ C4669f.m6583d(method))) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!C4669f.m6582a(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f5651b = method;
            this.f5653d = abstractC4523z;
            return this;
        }

        /* renamed from: f */
        public a m6147f(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f5652c.m5970g(name);
            return this;
        }

        /* renamed from: g */
        public a m6148g(Class type, Object obj) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (obj == null) {
                this.f5654e.remove(type);
            } else {
                if (this.f5654e.isEmpty()) {
                    this.f5654e = new LinkedHashMap();
                }
                Map map = this.f5654e;
                Object objCast = type.cast(obj);
                Intrinsics.checkNotNull(objCast);
                map.put(type, objCast);
            }
            return this;
        }

        /* renamed from: h */
        public a m6149h(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt__StringsJVMKt.startsWith(url, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                url = sb.toString();
            } else if (StringsKt__StringsJVMKt.startsWith(url, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String strSubstring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring2);
                url = sb2.toString();
            }
            return m6150i(C4517t.f5536l.m6036d(url));
        }

        /* renamed from: i */
        public a m6150i(C4517t url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f5650a = url;
            return this;
        }

        public a(C4522y request) {
            Map mutableMap;
            Intrinsics.checkNotNullParameter(request, "request");
            this.f5654e = new LinkedHashMap();
            this.f5650a = request.m6141j();
            this.f5651b = request.m6138g();
            this.f5653d = request.m6132a();
            if (!request.m6134c().isEmpty()) {
                mutableMap = MapsKt__MapsKt.toMutableMap(request.m6134c());
            } else {
                mutableMap = new LinkedHashMap();
            }
            this.f5654e = mutableMap;
            this.f5652c = request.m6136e().m5961c();
        }
    }
}
