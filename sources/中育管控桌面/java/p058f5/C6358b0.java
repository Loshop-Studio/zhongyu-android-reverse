package p058f5;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
import kotlin.text.StringsKt;
import p058f5.C6383v;
import p065g5.AbstractC6424h;
import p102l5.C7352f;

/* renamed from: f5.b0 */
/* loaded from: classes4.dex */
public final class C6358b0 {

    /* renamed from: a */
    public final C6384w f7807a;

    /* renamed from: b */
    public final String f7808b;

    /* renamed from: c */
    public final C6383v f7809c;

    /* renamed from: d */
    public final AbstractC6360c0 f7810d;

    /* renamed from: e */
    public final C6384w f7811e;

    /* renamed from: f */
    public final Map f7812f;

    /* renamed from: g */
    public C6361d f7813g;

    public C6358b0(a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        C6384w c6384wM6601m = builder.m6601m();
        if (c6384wM6601m == null) {
            throw new IllegalStateException("url == null");
        }
        this.f7807a = c6384wM6601m;
        this.f7808b = builder.m6599k();
        this.f7809c = builder.m6598j().m6811f();
        this.f7810d = builder.m6596h();
        this.f7811e = builder.m6597i();
        this.f7812f = MapsKt.toMap(builder.m6600l());
    }

    /* renamed from: a */
    public final AbstractC6360c0 m6577a() {
        return this.f7810d;
    }

    /* renamed from: b */
    public final C6361d m6578b() {
        C6361d c6361d = this.f7813g;
        if (c6361d != null) {
            return c6361d;
        }
        C6361d c6361dM6658a = C6361d.f7833n.m6658a(this.f7809c);
        this.f7813g = c6361dM6658a;
        return c6361dM6658a;
    }

    /* renamed from: c */
    public final C6384w m6579c() {
        return this.f7811e;
    }

    /* renamed from: d */
    public final Map m6580d() {
        return this.f7812f;
    }

    /* renamed from: e */
    public final String m6581e(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f7809c.m6799a(name);
    }

    /* renamed from: f */
    public final C6383v m6582f() {
        return this.f7809c;
    }

    /* renamed from: g */
    public final boolean m6583g() {
        return this.f7807a.m6824i();
    }

    /* renamed from: h */
    public final String m6584h() {
        return this.f7808b;
    }

    /* renamed from: i */
    public final a m6585i() {
        return new a(this);
    }

    /* renamed from: j */
    public final Object m6586j(Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return m6587k(JvmClassMappingKt.getKotlinClass(type));
    }

    /* renamed from: k */
    public final Object m6587k(KClass type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return JvmClassMappingKt.getJavaClass(type).cast(this.f7812f.get(type));
    }

    /* renamed from: l */
    public final C6384w m6588l() {
        return this.f7807a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.f7808b);
        sb.append(", url=");
        sb.append(this.f7807a);
        if (this.f7809c.size() != 0) {
            sb.append(", headers=[");
            int i6 = 0;
            for (Object obj : this.f7809c) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (AbstractC6424h.m7008v(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i6 = i7;
            }
            sb.append(']');
        }
        if (!this.f7812f.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f7812f);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: f5.b0$a */
    public static class a {

        /* renamed from: a */
        public C6384w f7814a;

        /* renamed from: b */
        public String f7815b;

        /* renamed from: c */
        public C6383v.a f7816c;

        /* renamed from: d */
        public AbstractC6360c0 f7817d;

        /* renamed from: e */
        public C6384w f7818e;

        /* renamed from: f */
        public Map f7819f;

        public a() {
            this.f7819f = MapsKt.emptyMap();
            this.f7815b = "GET";
            this.f7816c = new C6383v.a();
        }

        /* renamed from: f */
        public static /* synthetic */ a m6589f(a aVar, AbstractC6360c0 abstractC6360c0, int i6, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i6 & 1) != 0) {
                abstractC6360c0 = AbstractC6360c0.EMPTY;
            }
            return aVar.m6594e(abstractC6360c0);
        }

        /* renamed from: a */
        public a m6590a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7816c.m6806a(name, value);
            return this;
        }

        /* renamed from: b */
        public C6358b0 m6591b() {
            return new C6358b0(this);
        }

        /* renamed from: c */
        public final String m6592c(String str) {
            if (StringsKt.startsWith(str, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String strSubstring = str.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                sb.append(strSubstring);
                return sb.toString();
            }
            if (!StringsKt.startsWith(str, "wss:", true)) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("https:");
            String strSubstring2 = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            sb2.append(strSubstring2);
            return sb2.toString();
        }

        /* renamed from: d */
        public final a m6593d() {
            return m6589f(this, null, 1, null);
        }

        /* renamed from: e */
        public a m6594e(AbstractC6360c0 abstractC6360c0) {
            return m6605q("DELETE", abstractC6360c0);
        }

        /* renamed from: g */
        public a m6595g() {
            return m6605q("GET", null);
        }

        /* renamed from: h */
        public final AbstractC6360c0 m6596h() {
            return this.f7817d;
        }

        /* renamed from: i */
        public final C6384w m6597i() {
            return this.f7818e;
        }

        /* renamed from: j */
        public final C6383v.a m6598j() {
            return this.f7816c;
        }

        /* renamed from: k */
        public final String m6599k() {
            return this.f7815b;
        }

        /* renamed from: l */
        public final Map m6600l() {
            return this.f7819f;
        }

        /* renamed from: m */
        public final C6384w m6601m() {
            return this.f7814a;
        }

        /* renamed from: n */
        public a m6602n() {
            return m6605q("HEAD", null);
        }

        /* renamed from: o */
        public a m6603o(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7816c.m6814i(name, value);
            return this;
        }

        /* renamed from: p */
        public a m6604p(C6383v headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f7816c = headers.m6802d();
            return this;
        }

        /* renamed from: q */
        public a m6605q(String method, AbstractC6360c0 abstractC6360c0) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (abstractC6360c0 == null) {
                if (C7352f.m8340d(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!C7352f.m8339a(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f7815b = method;
            this.f7817d = abstractC6360c0;
            return this;
        }

        /* renamed from: r */
        public a m6606r(AbstractC6360c0 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return m6605q("POST", body);
        }

        /* renamed from: s */
        public a m6607s(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f7816c.m6813h(name);
            return this;
        }

        /* renamed from: t */
        public a m6608t(Class type, Object obj) {
            Intrinsics.checkNotNullParameter(type, "type");
            return m6609u(JvmClassMappingKt.getKotlinClass(type), obj);
        }

        /* renamed from: u */
        public final a m6609u(KClass type, Object obj) {
            Map mapAsMutableMap;
            Intrinsics.checkNotNullParameter(type, "type");
            if (obj == null) {
                if (!this.f7819f.isEmpty()) {
                    Map map = this.f7819f;
                    Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                    TypeIntrinsics.asMutableMap(map).remove(type);
                }
                return this;
            }
            if (this.f7819f.isEmpty()) {
                mapAsMutableMap = new LinkedHashMap();
                this.f7819f = mapAsMutableMap;
            } else {
                Map map2 = this.f7819f;
                Intrinsics.checkNotNull(map2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                mapAsMutableMap = TypeIntrinsics.asMutableMap(map2);
            }
            mapAsMutableMap.put(type, KClasses.cast(type, obj));
            return this;
        }

        /* renamed from: v */
        public a m6610v(C6384w url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f7814a = url;
            return this;
        }

        /* renamed from: w */
        public a m6611w(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return m6610v(C6384w.f7965j.m6868c(m6592c(url)));
        }

        public a(C6358b0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f7819f = MapsKt.emptyMap();
            this.f7814a = request.m6588l();
            this.f7815b = request.m6584h();
            this.f7817d = request.m6577a();
            this.f7819f = request.m6580d().isEmpty() ? MapsKt.emptyMap() : MapsKt.toMutableMap(request.m6580d());
            this.f7816c = request.m6582f().m6802d();
            this.f7818e = request.m6579c();
        }
    }
}
