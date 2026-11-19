package ca;

import ca.AbstractC5305v;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p103fa.InterfaceC8487a;
import p103fa.InterfaceC8488b;
import p103fa.InterfaceC8489c;
import p103fa.InterfaceC8490d;
import p103fa.InterfaceC8491e;
import p103fa.InterfaceC8492f;
import p103fa.InterfaceC8493g;
import p103fa.InterfaceC8494h;
import p103fa.InterfaceC8495i;
import p103fa.InterfaceC8496j;
import p103fa.InterfaceC8497k;
import p103fa.InterfaceC8498l;
import p103fa.InterfaceC8499m;
import p103fa.InterfaceC8500n;
import p103fa.InterfaceC8501o;
import p103fa.InterfaceC8502p;
import p103fa.InterfaceC8503q;
import p103fa.InterfaceC8504r;
import p103fa.InterfaceC8505s;
import p103fa.InterfaceC8506t;
import p103fa.InterfaceC8507u;
import p103fa.InterfaceC8508v;
import p103fa.InterfaceC8510x;
import p103fa.InterfaceC8511y;
import p136i9.C8899b0;
import p136i9.C8924v;
import p136i9.C8925w;
import p136i9.C8927y;
import p136i9.C8928z;
import p179m7.InterfaceC9324c;

/* renamed from: ca.b0 */
/* loaded from: classes5.dex */
public final class C5279b0 {

    /* renamed from: a */
    public final Class f2434a;

    /* renamed from: b */
    public final Method f2435b;

    /* renamed from: c */
    public final C8925w f2436c;

    /* renamed from: d */
    public final String f2437d;

    /* renamed from: e */
    public final String f2438e;

    /* renamed from: f */
    public final C8924v f2439f;

    /* renamed from: g */
    public final C8927y f2440g;

    /* renamed from: h */
    public final boolean f2441h;

    /* renamed from: i */
    public final boolean f2442i;

    /* renamed from: j */
    public final boolean f2443j;

    /* renamed from: k */
    public final AbstractC5305v[] f2444k;

    /* renamed from: l */
    public final boolean f2445l;

    /* renamed from: ca.b0$a */
    public static final class a {

        /* renamed from: y */
        public static final Pattern f2446y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: z */
        public static final Pattern f2447z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final C5283d0 f2448a;

        /* renamed from: b */
        public final Class f2449b;

        /* renamed from: c */
        public final Method f2450c;

        /* renamed from: d */
        public final Annotation[] f2451d;

        /* renamed from: e */
        public final Annotation[][] f2452e;

        /* renamed from: f */
        public final Type[] f2453f;

        /* renamed from: g */
        public boolean f2454g;

        /* renamed from: h */
        public boolean f2455h;

        /* renamed from: i */
        public boolean f2456i;

        /* renamed from: j */
        public boolean f2457j;

        /* renamed from: k */
        public boolean f2458k;

        /* renamed from: l */
        public boolean f2459l;

        /* renamed from: m */
        public boolean f2460m;

        /* renamed from: n */
        public boolean f2461n;

        /* renamed from: o */
        public String f2462o;

        /* renamed from: p */
        public boolean f2463p;

        /* renamed from: q */
        public boolean f2464q;

        /* renamed from: r */
        public boolean f2465r;

        /* renamed from: s */
        public String f2466s;

        /* renamed from: t */
        public C8924v f2467t;

        /* renamed from: u */
        public C8927y f2468u;

        /* renamed from: v */
        public Set f2469v;

        /* renamed from: w */
        public AbstractC5305v[] f2470w;

        /* renamed from: x */
        public boolean f2471x;

        public a(C5283d0 c5283d0, Class cls, Method method) {
            this.f2448a = c5283d0;
            this.f2449b = cls;
            this.f2450c = method;
            this.f2451d = method.getAnnotations();
            this.f2453f = method.getGenericParameterTypes();
            this.f2452e = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class m2229a(Class cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: h */
        public static Set m2230h(String str) {
            Matcher matcher = f2446y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: b */
        public C5279b0 m2231b() {
            for (Annotation annotation : this.f2451d) {
                m2234e(annotation);
            }
            if (this.f2462o == null) {
                throw AbstractC5291h0.m2294n(this.f2450c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f2463p) {
                if (this.f2465r) {
                    throw AbstractC5291h0.m2294n(this.f2450c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f2464q) {
                    throw AbstractC5291h0.m2294n(this.f2450c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f2452e.length;
            this.f2470w = new AbstractC5305v[length];
            int i10 = length - 1;
            int i11 = 0;
            while (i11 < length) {
                this.f2470w[i11] = m2235f(i11, this.f2453f[i11], this.f2452e[i11], i11 == i10);
                i11++;
            }
            if (this.f2466s == null && !this.f2461n) {
                throw AbstractC5291h0.m2294n(this.f2450c, "Missing either @%s URL or @Url parameter.", this.f2462o);
            }
            boolean z10 = this.f2464q;
            if (!z10 && !this.f2465r && !this.f2463p && this.f2456i) {
                throw AbstractC5291h0.m2294n(this.f2450c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z10 && !this.f2454g) {
                throw AbstractC5291h0.m2294n(this.f2450c, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f2465r || this.f2455h) {
                return new C5279b0(this);
            }
            throw AbstractC5291h0.m2294n(this.f2450c, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        /* renamed from: c */
        public final C8924v m2232c(String[] strArr, boolean z10) {
            C8924v.a aVar = new C8924v.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw AbstractC5291h0.m2294n(this.f2450c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f2468u = C8927y.m15337e(strTrim);
                    } catch (IllegalArgumentException e10) {
                        throw AbstractC5291h0.m2295o(this.f2450c, e10, "Malformed content type: %s", strTrim);
                    }
                } else if (z10) {
                    aVar.m15271e(strSubstring, strTrim);
                } else {
                    aVar.m15267a(strSubstring, strTrim);
                }
            }
            return aVar.m15272f();
        }

        /* renamed from: d */
        public final void m2233d(String str, String str2, boolean z10) {
            String str3 = this.f2462o;
            if (str3 != null) {
                throw AbstractC5291h0.m2294n(this.f2450c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f2462o = str;
            this.f2463p = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f2446y.matcher(strSubstring).find()) {
                    throw AbstractC5291h0.m2294n(this.f2450c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f2466s = str2;
            this.f2469v = m2230h(str2);
        }

        /* renamed from: e */
        public final void m2234e(Annotation annotation) {
            if (annotation instanceof InterfaceC8488b) {
                m2233d("DELETE", ((InterfaceC8488b) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC8492f) {
                m2233d("GET", ((InterfaceC8492f) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC8493g) {
                m2233d("HEAD", ((InterfaceC8493g) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC8500n) {
                m2233d("PATCH", ((InterfaceC8500n) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC8501o) {
                m2233d("POST", ((InterfaceC8501o) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC8502p) {
                m2233d("PUT", ((InterfaceC8502p) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC8499m) {
                m2233d("OPTIONS", ((InterfaceC8499m) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC8494h) {
                InterfaceC8494h interfaceC8494h = (InterfaceC8494h) annotation;
                m2233d(interfaceC8494h.method(), interfaceC8494h.path(), interfaceC8494h.hasBody());
                return;
            }
            if (annotation instanceof InterfaceC8497k) {
                InterfaceC8497k interfaceC8497k = (InterfaceC8497k) annotation;
                String[] strArrValue = interfaceC8497k.value();
                if (strArrValue.length == 0) {
                    throw AbstractC5291h0.m2294n(this.f2450c, "@Headers annotation is empty.", new Object[0]);
                }
                this.f2467t = m2232c(strArrValue, interfaceC8497k.allowUnsafeNonAsciiValues());
                return;
            }
            if (annotation instanceof InterfaceC8498l) {
                if (this.f2464q) {
                    throw AbstractC5291h0.m2294n(this.f2450c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f2465r = true;
            } else if (annotation instanceof InterfaceC8491e) {
                if (this.f2465r) {
                    throw AbstractC5291h0.m2294n(this.f2450c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f2464q = true;
            }
        }

        /* renamed from: f */
        public final AbstractC5305v m2235f(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            AbstractC5305v abstractC5305v;
            if (annotationArr != null) {
                abstractC5305v = null;
                for (Annotation annotation : annotationArr) {
                    AbstractC5305v abstractC5305vM2236g = m2236g(i10, type, annotationArr, annotation);
                    if (abstractC5305vM2236g != null) {
                        if (abstractC5305v != null) {
                            throw AbstractC5291h0.m2296p(this.f2450c, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        abstractC5305v = abstractC5305vM2236g;
                    }
                }
            } else {
                abstractC5305v = null;
            }
            if (abstractC5305v != null) {
                return abstractC5305v;
            }
            if (z10) {
                try {
                    if (AbstractC5291h0.m2288h(type) == InterfaceC9324c.class) {
                        this.f2471x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw AbstractC5291h0.m2296p(this.f2450c, i10, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: g */
        public final AbstractC5305v m2236g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof InterfaceC8511y) {
                m2238j(i10, type);
                if (this.f2461n) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f2457j) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f2458k) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f2459l) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f2460m) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f2466s != null) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "@Url cannot be used with @%s URL", this.f2462o);
                }
                this.f2461n = true;
                if (type == C8925w.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new AbstractC5305v.p(this.f2450c, i10);
                }
                throw AbstractC5291h0.m2296p(this.f2450c, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof InterfaceC8505s) {
                m2238j(i10, type);
                if (this.f2458k) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f2459l) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f2460m) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f2461n) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f2466s == null) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "@Path can only be used with relative url on @%s", this.f2462o);
                }
                this.f2457j = true;
                InterfaceC8505s interfaceC8505s = (InterfaceC8505s) annotation;
                String strValue = interfaceC8505s.value();
                m2237i(i10, strValue);
                return new AbstractC5305v.k(this.f2450c, i10, strValue, this.f2448a.m2258i(type, annotationArr), interfaceC8505s.encoded());
            }
            if (annotation instanceof InterfaceC8506t) {
                m2238j(i10, type);
                InterfaceC8506t interfaceC8506t = (InterfaceC8506t) annotation;
                String strValue2 = interfaceC8506t.value();
                boolean zEncoded = interfaceC8506t.encoded();
                Class clsM2288h = AbstractC5291h0.m2288h(type);
                this.f2458k = true;
                if (!Iterable.class.isAssignableFrom(clsM2288h)) {
                    if (!clsM2288h.isArray()) {
                        return new AbstractC5305v.l(strValue2, this.f2448a.m2258i(type, annotationArr), zEncoded);
                    }
                    return new AbstractC5305v.l(strValue2, this.f2448a.m2258i(m2229a(clsM2288h.getComponentType()), annotationArr), zEncoded).m2327b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC5305v.l(strValue2, this.f2448a.m2258i(AbstractC5291h0.m2287g(0, (ParameterizedType) type), annotationArr), zEncoded).m2328c();
                }
                throw AbstractC5291h0.m2296p(this.f2450c, i10, clsM2288h.getSimpleName() + " must include generic type (e.g., " + clsM2288h.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC8508v) {
                m2238j(i10, type);
                boolean zEncoded2 = ((InterfaceC8508v) annotation).encoded();
                Class clsM2288h2 = AbstractC5291h0.m2288h(type);
                this.f2459l = true;
                if (!Iterable.class.isAssignableFrom(clsM2288h2)) {
                    if (!clsM2288h2.isArray()) {
                        return new AbstractC5305v.n(this.f2448a.m2258i(type, annotationArr), zEncoded2);
                    }
                    return new AbstractC5305v.n(this.f2448a.m2258i(m2229a(clsM2288h2.getComponentType()), annotationArr), zEncoded2).m2327b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC5305v.n(this.f2448a.m2258i(AbstractC5291h0.m2287g(0, (ParameterizedType) type), annotationArr), zEncoded2).m2328c();
                }
                throw AbstractC5291h0.m2296p(this.f2450c, i10, clsM2288h2.getSimpleName() + " must include generic type (e.g., " + clsM2288h2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC8507u) {
                m2238j(i10, type);
                Class clsM2288h3 = AbstractC5291h0.m2288h(type);
                this.f2460m = true;
                if (!Map.class.isAssignableFrom(clsM2288h3)) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeM2289i = AbstractC5291h0.m2289i(type, clsM2288h3, Map.class);
                if (!(typeM2289i instanceof ParameterizedType)) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeM2289i;
                Type typeM2287g = AbstractC5291h0.m2287g(0, parameterizedType);
                if (String.class == typeM2287g) {
                    return new AbstractC5305v.m(this.f2450c, i10, this.f2448a.m2258i(AbstractC5291h0.m2287g(1, parameterizedType), annotationArr), ((InterfaceC8507u) annotation).encoded());
                }
                throw AbstractC5291h0.m2296p(this.f2450c, i10, "@QueryMap keys must be of type String: " + typeM2287g, new Object[0]);
            }
            if (annotation instanceof InterfaceC8495i) {
                m2238j(i10, type);
                InterfaceC8495i interfaceC8495i = (InterfaceC8495i) annotation;
                String strValue3 = interfaceC8495i.value();
                Class clsM2288h4 = AbstractC5291h0.m2288h(type);
                if (!Iterable.class.isAssignableFrom(clsM2288h4)) {
                    if (!clsM2288h4.isArray()) {
                        return new AbstractC5305v.f(strValue3, this.f2448a.m2258i(type, annotationArr), interfaceC8495i.allowUnsafeNonAsciiValues());
                    }
                    return new AbstractC5305v.f(strValue3, this.f2448a.m2258i(m2229a(clsM2288h4.getComponentType()), annotationArr), interfaceC8495i.allowUnsafeNonAsciiValues()).m2327b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC5305v.f(strValue3, this.f2448a.m2258i(AbstractC5291h0.m2287g(0, (ParameterizedType) type), annotationArr), interfaceC8495i.allowUnsafeNonAsciiValues()).m2328c();
                }
                throw AbstractC5291h0.m2296p(this.f2450c, i10, clsM2288h4.getSimpleName() + " must include generic type (e.g., " + clsM2288h4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC8496j) {
                if (type == C8924v.class) {
                    return new AbstractC5305v.h(this.f2450c, i10);
                }
                m2238j(i10, type);
                Class clsM2288h5 = AbstractC5291h0.m2288h(type);
                if (!Map.class.isAssignableFrom(clsM2288h5)) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                }
                Type typeM2289i2 = AbstractC5291h0.m2289i(type, clsM2288h5, Map.class);
                if (!(typeM2289i2 instanceof ParameterizedType)) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeM2289i2;
                Type typeM2287g2 = AbstractC5291h0.m2287g(0, parameterizedType2);
                if (String.class == typeM2287g2) {
                    return new AbstractC5305v.g(this.f2450c, i10, this.f2448a.m2258i(AbstractC5291h0.m2287g(1, parameterizedType2), annotationArr), ((InterfaceC8496j) annotation).allowUnsafeNonAsciiValues());
                }
                throw AbstractC5291h0.m2296p(this.f2450c, i10, "@HeaderMap keys must be of type String: " + typeM2287g2, new Object[0]);
            }
            if (annotation instanceof InterfaceC8489c) {
                m2238j(i10, type);
                if (!this.f2464q) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                InterfaceC8489c interfaceC8489c = (InterfaceC8489c) annotation;
                String strValue4 = interfaceC8489c.value();
                boolean zEncoded3 = interfaceC8489c.encoded();
                this.f2454g = true;
                Class clsM2288h6 = AbstractC5291h0.m2288h(type);
                if (!Iterable.class.isAssignableFrom(clsM2288h6)) {
                    if (!clsM2288h6.isArray()) {
                        return new AbstractC5305v.d(strValue4, this.f2448a.m2258i(type, annotationArr), zEncoded3);
                    }
                    return new AbstractC5305v.d(strValue4, this.f2448a.m2258i(m2229a(clsM2288h6.getComponentType()), annotationArr), zEncoded3).m2327b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC5305v.d(strValue4, this.f2448a.m2258i(AbstractC5291h0.m2287g(0, (ParameterizedType) type), annotationArr), zEncoded3).m2328c();
                }
                throw AbstractC5291h0.m2296p(this.f2450c, i10, clsM2288h6.getSimpleName() + " must include generic type (e.g., " + clsM2288h6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC8490d) {
                m2238j(i10, type);
                if (!this.f2464q) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class clsM2288h7 = AbstractC5291h0.m2288h(type);
                if (!Map.class.isAssignableFrom(clsM2288h7)) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeM2289i3 = AbstractC5291h0.m2289i(type, clsM2288h7, Map.class);
                if (!(typeM2289i3 instanceof ParameterizedType)) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeM2289i3;
                Type typeM2287g3 = AbstractC5291h0.m2287g(0, parameterizedType3);
                if (String.class == typeM2287g3) {
                    InterfaceC5290h interfaceC5290hM2258i = this.f2448a.m2258i(AbstractC5291h0.m2287g(1, parameterizedType3), annotationArr);
                    this.f2454g = true;
                    return new AbstractC5305v.e(this.f2450c, i10, interfaceC5290hM2258i, ((InterfaceC8490d) annotation).encoded());
                }
                throw AbstractC5291h0.m2296p(this.f2450c, i10, "@FieldMap keys must be of type String: " + typeM2287g3, new Object[0]);
            }
            if (!(annotation instanceof InterfaceC8503q)) {
                if (annotation instanceof InterfaceC8504r) {
                    m2238j(i10, type);
                    if (!this.f2465r) {
                        throw AbstractC5291h0.m2296p(this.f2450c, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f2455h = true;
                    Class clsM2288h8 = AbstractC5291h0.m2288h(type);
                    if (!Map.class.isAssignableFrom(clsM2288h8)) {
                        throw AbstractC5291h0.m2296p(this.f2450c, i10, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeM2289i4 = AbstractC5291h0.m2289i(type, clsM2288h8, Map.class);
                    if (!(typeM2289i4 instanceof ParameterizedType)) {
                        throw AbstractC5291h0.m2296p(this.f2450c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeM2289i4;
                    Type typeM2287g4 = AbstractC5291h0.m2287g(0, parameterizedType4);
                    if (String.class == typeM2287g4) {
                        Type typeM2287g5 = AbstractC5291h0.m2287g(1, parameterizedType4);
                        if (C8928z.c.class.isAssignableFrom(AbstractC5291h0.m2288h(typeM2287g5))) {
                            throw AbstractC5291h0.m2296p(this.f2450c, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new AbstractC5305v.j(this.f2450c, i10, this.f2448a.m2256g(typeM2287g5, annotationArr, this.f2451d), ((InterfaceC8504r) annotation).encoding());
                    }
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "@PartMap keys must be of type String: " + typeM2287g4, new Object[0]);
                }
                if (annotation instanceof InterfaceC8487a) {
                    m2238j(i10, type);
                    if (this.f2464q || this.f2465r) {
                        throw AbstractC5291h0.m2296p(this.f2450c, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f2456i) {
                        throw AbstractC5291h0.m2296p(this.f2450c, i10, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        InterfaceC5290h interfaceC5290hM2256g = this.f2448a.m2256g(type, annotationArr, this.f2451d);
                        this.f2456i = true;
                        return new AbstractC5305v.c(this.f2450c, i10, interfaceC5290hM2256g);
                    } catch (RuntimeException e10) {
                        throw AbstractC5291h0.m2297q(this.f2450c, e10, i10, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof InterfaceC8510x)) {
                    return null;
                }
                m2238j(i10, type);
                Class clsM2229a = m2229a(AbstractC5291h0.m2288h(type));
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    AbstractC5305v abstractC5305v = this.f2470w[i11];
                    if ((abstractC5305v instanceof AbstractC5305v.q) && ((AbstractC5305v.q) abstractC5305v).f2600a.equals(clsM2229a)) {
                        throw AbstractC5291h0.m2296p(this.f2450c, i10, "@Tag type " + clsM2229a.getName() + " is duplicate of " + AbstractC5306w.f2602b.mo2336a(this.f2450c, i11) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new AbstractC5305v.q(clsM2229a);
            }
            m2238j(i10, type);
            if (!this.f2465r) {
                throw AbstractC5291h0.m2296p(this.f2450c, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            InterfaceC8503q interfaceC8503q = (InterfaceC8503q) annotation;
            this.f2455h = true;
            String strValue5 = interfaceC8503q.value();
            Class clsM2288h9 = AbstractC5291h0.m2288h(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsM2288h9)) {
                    if (clsM2288h9.isArray()) {
                        if (C8928z.c.class.isAssignableFrom(clsM2288h9.getComponentType())) {
                            return AbstractC5305v.o.f2597a.m2327b();
                        }
                        throw AbstractC5291h0.m2296p(this.f2450c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (C8928z.c.class.isAssignableFrom(clsM2288h9)) {
                        return AbstractC5305v.o.f2597a;
                    }
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (C8928z.c.class.isAssignableFrom(AbstractC5291h0.m2288h(AbstractC5291h0.m2287g(0, (ParameterizedType) type)))) {
                        return AbstractC5305v.o.f2597a.m2328c();
                    }
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw AbstractC5291h0.m2296p(this.f2450c, i10, clsM2288h9.getSimpleName() + " must include generic type (e.g., " + clsM2288h9.getSimpleName() + "<String>)", new Object[0]);
            }
            C8924v c8924vM15259e = C8924v.m15259e(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", interfaceC8503q.encoding());
            if (!Iterable.class.isAssignableFrom(clsM2288h9)) {
                if (!clsM2288h9.isArray()) {
                    if (C8928z.c.class.isAssignableFrom(clsM2288h9)) {
                        throw AbstractC5291h0.m2296p(this.f2450c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new AbstractC5305v.i(this.f2450c, i10, c8924vM15259e, this.f2448a.m2256g(type, annotationArr, this.f2451d));
                }
                Class clsM2229a2 = m2229a(clsM2288h9.getComponentType());
                if (C8928z.c.class.isAssignableFrom(clsM2229a2)) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new AbstractC5305v.i(this.f2450c, i10, c8924vM15259e, this.f2448a.m2256g(clsM2229a2, annotationArr, this.f2451d)).m2327b();
            }
            if (type instanceof ParameterizedType) {
                Type typeM2287g6 = AbstractC5291h0.m2287g(0, (ParameterizedType) type);
                if (C8928z.c.class.isAssignableFrom(AbstractC5291h0.m2288h(typeM2287g6))) {
                    throw AbstractC5291h0.m2296p(this.f2450c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new AbstractC5305v.i(this.f2450c, i10, c8924vM15259e, this.f2448a.m2256g(typeM2287g6, annotationArr, this.f2451d)).m2328c();
            }
            throw AbstractC5291h0.m2296p(this.f2450c, i10, clsM2288h9.getSimpleName() + " must include generic type (e.g., " + clsM2288h9.getSimpleName() + "<String>)", new Object[0]);
        }

        /* renamed from: i */
        public final void m2237i(int i10, String str) {
            if (!f2447z.matcher(str).matches()) {
                throw AbstractC5291h0.m2296p(this.f2450c, i10, "@Path parameter name must match %s. Found: %s", f2446y.pattern(), str);
            }
            if (!this.f2469v.contains(str)) {
                throw AbstractC5291h0.m2296p(this.f2450c, i10, "URL \"%s\" does not contain \"{%s}\".", this.f2466s, str);
            }
        }

        /* renamed from: j */
        public final void m2238j(int i10, Type type) {
            if (AbstractC5291h0.m2290j(type)) {
                throw AbstractC5291h0.m2296p(this.f2450c, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public C5279b0(a aVar) {
        this.f2434a = aVar.f2449b;
        this.f2435b = aVar.f2450c;
        this.f2436c = aVar.f2448a.f2477c;
        this.f2437d = aVar.f2462o;
        this.f2438e = aVar.f2466s;
        this.f2439f = aVar.f2467t;
        this.f2440g = aVar.f2468u;
        this.f2441h = aVar.f2463p;
        this.f2442i = aVar.f2464q;
        this.f2443j = aVar.f2465r;
        this.f2444k = aVar.f2470w;
        this.f2445l = aVar.f2471x;
    }

    /* renamed from: b */
    public static C5279b0 m2227b(C5283d0 c5283d0, Class cls, Method method) {
        return new a(c5283d0, cls, method).m2231b();
    }

    /* renamed from: a */
    public C8899b0 m2228a(Object obj, Object[] objArr) {
        AbstractC5305v[] abstractC5305vArr = this.f2444k;
        int length = objArr.length;
        if (length != abstractC5305vArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + abstractC5305vArr.length + ")");
        }
        C5277a0 c5277a0 = new C5277a0(this.f2437d, this.f2436c, this.f2438e, this.f2439f, this.f2440g, this.f2441h, this.f2442i, this.f2443j);
        if (this.f2445l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            abstractC5305vArr[i10].mo2326a(c5277a0, objArr[i10]);
        }
        return c5277a0.m2216k().m15072t(C5302s.class, new C5302s(this.f2434a, obj, this.f2435b, arrayList)).m15055b();
    }
}
