package p038c9;

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
import kotlin.coroutines.Continuation;
import p038c9.AbstractC5288n;
import p110f9.InterfaceC7956a;
import p110f9.InterfaceC7957b;
import p110f9.InterfaceC7958c;
import p110f9.InterfaceC7959d;
import p110f9.InterfaceC7960e;
import p110f9.InterfaceC7961f;
import p110f9.InterfaceC7962g;
import p110f9.InterfaceC7963h;
import p110f9.InterfaceC7964i;
import p110f9.InterfaceC7965j;
import p110f9.InterfaceC7966k;
import p110f9.InterfaceC7967l;
import p110f9.InterfaceC7968m;
import p110f9.InterfaceC7969n;
import p110f9.InterfaceC7970o;
import p110f9.InterfaceC7971p;
import p110f9.InterfaceC7972q;
import p110f9.InterfaceC7973r;
import p110f9.InterfaceC7974s;
import p110f9.InterfaceC7975t;
import p110f9.InterfaceC7976u;
import p110f9.InterfaceC7977v;
import p110f9.InterfaceC7979x;
import p110f9.InterfaceC7980y;
import p172l8.C8918q;
import p172l8.C8919r;
import p172l8.C8921t;
import p172l8.C8922u;
import p172l8.C8924w;

/* renamed from: c9.w */
/* loaded from: classes5.dex */
public final class C5297w {

    /* renamed from: a */
    public final Method f2644a;

    /* renamed from: b */
    public final C8919r f2645b;

    /* renamed from: c */
    public final String f2646c;

    /* renamed from: d */
    public final String f2647d;

    /* renamed from: e */
    public final C8918q f2648e;

    /* renamed from: f */
    public final C8921t f2649f;

    /* renamed from: g */
    public final boolean f2650g;

    /* renamed from: h */
    public final boolean f2651h;

    /* renamed from: i */
    public final boolean f2652i;

    /* renamed from: j */
    public final AbstractC5288n[] f2653j;

    /* renamed from: k */
    public final boolean f2654k;

    /* renamed from: c9.w$a */
    public static final class a {

        /* renamed from: x */
        public static final Pattern f2655x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        public static final Pattern f2656y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final C5299y f2657a;

        /* renamed from: b */
        public final Method f2658b;

        /* renamed from: c */
        public final Annotation[] f2659c;

        /* renamed from: d */
        public final Annotation[][] f2660d;

        /* renamed from: e */
        public final Type[] f2661e;

        /* renamed from: f */
        public boolean f2662f;

        /* renamed from: g */
        public boolean f2663g;

        /* renamed from: h */
        public boolean f2664h;

        /* renamed from: i */
        public boolean f2665i;

        /* renamed from: j */
        public boolean f2666j;

        /* renamed from: k */
        public boolean f2667k;

        /* renamed from: l */
        public boolean f2668l;

        /* renamed from: m */
        public boolean f2669m;

        /* renamed from: n */
        public String f2670n;

        /* renamed from: o */
        public boolean f2671o;

        /* renamed from: p */
        public boolean f2672p;

        /* renamed from: q */
        public boolean f2673q;

        /* renamed from: r */
        public String f2674r;

        /* renamed from: s */
        public C8918q f2675s;

        /* renamed from: t */
        public C8921t f2676t;

        /* renamed from: u */
        public Set f2677u;

        /* renamed from: v */
        public AbstractC5288n[] f2678v;

        /* renamed from: w */
        public boolean f2679w;

        public a(C5299y c5299y, Method method) {
            this.f2657a = c5299y;
            this.f2658b = method;
            this.f2659c = method.getAnnotations();
            this.f2661e = method.getGenericParameterTypes();
            this.f2660d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class m2507a(Class cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: h */
        public static Set m2508h(String str) {
            Matcher matcher = f2655x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: b */
        public C5297w m2509b() {
            for (Annotation annotation : this.f2659c) {
                m2512e(annotation);
            }
            if (this.f2670n == null) {
                throw AbstractC5277c0.m2437m(this.f2658b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f2671o) {
                if (this.f2673q) {
                    throw AbstractC5277c0.m2437m(this.f2658b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f2672p) {
                    throw AbstractC5277c0.m2437m(this.f2658b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f2660d.length;
            this.f2678v = new AbstractC5288n[length];
            int i9 = length - 1;
            int i10 = 0;
            while (i10 < length) {
                this.f2678v[i10] = m2513f(i10, this.f2661e[i10], this.f2660d[i10], i10 == i9);
                i10++;
            }
            if (this.f2674r == null && !this.f2669m) {
                throw AbstractC5277c0.m2437m(this.f2658b, "Missing either @%s URL or @Url parameter.", this.f2670n);
            }
            boolean z9 = this.f2672p;
            if (!z9 && !this.f2673q && !this.f2671o && this.f2664h) {
                throw AbstractC5277c0.m2437m(this.f2658b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z9 && !this.f2662f) {
                throw AbstractC5277c0.m2437m(this.f2658b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f2673q || this.f2663g) {
                return new C5297w(this);
            }
            throw AbstractC5277c0.m2437m(this.f2658b, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        /* renamed from: c */
        public final C8918q m2510c(String[] strArr) {
            C8918q.a aVar = new C8918q.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw AbstractC5277c0.m2437m(this.f2658b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f2676t = C8921t.m14029e(strTrim);
                    } catch (IllegalArgumentException e10) {
                        throw AbstractC5277c0.m2438n(this.f2658b, e10, "Malformed content type: %s", strTrim);
                    }
                } else {
                    aVar.m13942a(strSubstring, strTrim);
                }
            }
            return aVar.m13947f();
        }

        /* renamed from: d */
        public final void m2511d(String str, String str2, boolean z9) {
            String str3 = this.f2670n;
            if (str3 != null) {
                throw AbstractC5277c0.m2437m(this.f2658b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f2670n = str;
            this.f2671o = z9;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f2655x.matcher(strSubstring).find()) {
                    throw AbstractC5277c0.m2437m(this.f2658b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f2674r = str2;
            this.f2677u = m2508h(str2);
        }

        /* renamed from: e */
        public final void m2512e(Annotation annotation) {
            if (annotation instanceof InterfaceC7957b) {
                m2511d("DELETE", ((InterfaceC7957b) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC7961f) {
                m2511d("GET", ((InterfaceC7961f) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC7962g) {
                m2511d("HEAD", ((InterfaceC7962g) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC7969n) {
                m2511d("PATCH", ((InterfaceC7969n) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC7970o) {
                m2511d("POST", ((InterfaceC7970o) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC7971p) {
                m2511d("PUT", ((InterfaceC7971p) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC7968m) {
                m2511d("OPTIONS", ((InterfaceC7968m) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC7963h) {
                InterfaceC7963h interfaceC7963h = (InterfaceC7963h) annotation;
                m2511d(interfaceC7963h.method(), interfaceC7963h.path(), interfaceC7963h.hasBody());
                return;
            }
            if (annotation instanceof InterfaceC7966k) {
                String[] strArrValue = ((InterfaceC7966k) annotation).value();
                if (strArrValue.length == 0) {
                    throw AbstractC5277c0.m2437m(this.f2658b, "@Headers annotation is empty.", new Object[0]);
                }
                this.f2675s = m2510c(strArrValue);
                return;
            }
            if (annotation instanceof InterfaceC7967l) {
                if (this.f2672p) {
                    throw AbstractC5277c0.m2437m(this.f2658b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f2673q = true;
            } else if (annotation instanceof InterfaceC7960e) {
                if (this.f2673q) {
                    throw AbstractC5277c0.m2437m(this.f2658b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f2672p = true;
            }
        }

        /* renamed from: f */
        public final AbstractC5288n m2513f(int i9, Type type, Annotation[] annotationArr, boolean z9) {
            AbstractC5288n abstractC5288n;
            if (annotationArr != null) {
                abstractC5288n = null;
                for (Annotation annotation : annotationArr) {
                    AbstractC5288n abstractC5288nM2514g = m2514g(i9, type, annotationArr, annotation);
                    if (abstractC5288nM2514g != null) {
                        if (abstractC5288n != null) {
                            throw AbstractC5277c0.m2439o(this.f2658b, i9, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        abstractC5288n = abstractC5288nM2514g;
                    }
                }
            } else {
                abstractC5288n = null;
            }
            if (abstractC5288n != null) {
                return abstractC5288n;
            }
            if (z9) {
                try {
                    if (AbstractC5277c0.m2432h(type) == Continuation.class) {
                        this.f2679w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw AbstractC5277c0.m2439o(this.f2658b, i9, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: g */
        public final AbstractC5288n m2514g(int i9, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof InterfaceC7980y) {
                m2516j(i9, type);
                if (this.f2669m) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f2665i) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f2666j) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f2667k) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f2668l) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f2674r != null) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "@Url cannot be used with @%s URL", this.f2670n);
                }
                this.f2669m = true;
                if (type == C8919r.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new AbstractC5288n.p(this.f2658b, i9);
                }
                throw AbstractC5277c0.m2439o(this.f2658b, i9, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof InterfaceC7974s) {
                m2516j(i9, type);
                if (this.f2666j) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f2667k) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f2668l) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f2669m) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f2674r == null) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "@Path can only be used with relative url on @%s", this.f2670n);
                }
                this.f2665i = true;
                InterfaceC7974s interfaceC7974s = (InterfaceC7974s) annotation;
                String strValue = interfaceC7974s.value();
                m2515i(i9, strValue);
                return new AbstractC5288n.k(this.f2658b, i9, strValue, this.f2657a.m2534i(type, annotationArr), interfaceC7974s.encoded());
            }
            if (annotation instanceof InterfaceC7975t) {
                m2516j(i9, type);
                InterfaceC7975t interfaceC7975t = (InterfaceC7975t) annotation;
                String strValue2 = interfaceC7975t.value();
                boolean zEncoded = interfaceC7975t.encoded();
                Class clsM2432h = AbstractC5277c0.m2432h(type);
                this.f2666j = true;
                if (!Iterable.class.isAssignableFrom(clsM2432h)) {
                    if (!clsM2432h.isArray()) {
                        return new AbstractC5288n.l(strValue2, this.f2657a.m2534i(type, annotationArr), zEncoded);
                    }
                    return new AbstractC5288n.l(strValue2, this.f2657a.m2534i(m2507a(clsM2432h.getComponentType()), annotationArr), zEncoded).m2469b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC5288n.l(strValue2, this.f2657a.m2534i(AbstractC5277c0.m2431g(0, (ParameterizedType) type), annotationArr), zEncoded).m2470c();
                }
                throw AbstractC5277c0.m2439o(this.f2658b, i9, clsM2432h.getSimpleName() + " must include generic type (e.g., " + clsM2432h.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC7977v) {
                m2516j(i9, type);
                boolean zEncoded2 = ((InterfaceC7977v) annotation).encoded();
                Class clsM2432h2 = AbstractC5277c0.m2432h(type);
                this.f2667k = true;
                if (!Iterable.class.isAssignableFrom(clsM2432h2)) {
                    if (!clsM2432h2.isArray()) {
                        return new AbstractC5288n.n(this.f2657a.m2534i(type, annotationArr), zEncoded2);
                    }
                    return new AbstractC5288n.n(this.f2657a.m2534i(m2507a(clsM2432h2.getComponentType()), annotationArr), zEncoded2).m2469b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC5288n.n(this.f2657a.m2534i(AbstractC5277c0.m2431g(0, (ParameterizedType) type), annotationArr), zEncoded2).m2470c();
                }
                throw AbstractC5277c0.m2439o(this.f2658b, i9, clsM2432h2.getSimpleName() + " must include generic type (e.g., " + clsM2432h2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC7976u) {
                m2516j(i9, type);
                Class clsM2432h3 = AbstractC5277c0.m2432h(type);
                this.f2668l = true;
                if (!Map.class.isAssignableFrom(clsM2432h3)) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeM2433i = AbstractC5277c0.m2433i(type, clsM2432h3, Map.class);
                if (!(typeM2433i instanceof ParameterizedType)) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeM2433i;
                Type typeM2431g = AbstractC5277c0.m2431g(0, parameterizedType);
                if (String.class == typeM2431g) {
                    return new AbstractC5288n.m(this.f2658b, i9, this.f2657a.m2534i(AbstractC5277c0.m2431g(1, parameterizedType), annotationArr), ((InterfaceC7976u) annotation).encoded());
                }
                throw AbstractC5277c0.m2439o(this.f2658b, i9, "@QueryMap keys must be of type String: " + typeM2431g, new Object[0]);
            }
            if (annotation instanceof InterfaceC7964i) {
                m2516j(i9, type);
                String strValue3 = ((InterfaceC7964i) annotation).value();
                Class clsM2432h4 = AbstractC5277c0.m2432h(type);
                if (!Iterable.class.isAssignableFrom(clsM2432h4)) {
                    if (!clsM2432h4.isArray()) {
                        return new AbstractC5288n.f(strValue3, this.f2657a.m2534i(type, annotationArr));
                    }
                    return new AbstractC5288n.f(strValue3, this.f2657a.m2534i(m2507a(clsM2432h4.getComponentType()), annotationArr)).m2469b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC5288n.f(strValue3, this.f2657a.m2534i(AbstractC5277c0.m2431g(0, (ParameterizedType) type), annotationArr)).m2470c();
                }
                throw AbstractC5277c0.m2439o(this.f2658b, i9, clsM2432h4.getSimpleName() + " must include generic type (e.g., " + clsM2432h4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC7965j) {
                if (type == C8918q.class) {
                    return new AbstractC5288n.h(this.f2658b, i9);
                }
                m2516j(i9, type);
                Class clsM2432h5 = AbstractC5277c0.m2432h(type);
                if (!Map.class.isAssignableFrom(clsM2432h5)) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type typeM2433i2 = AbstractC5277c0.m2433i(type, clsM2432h5, Map.class);
                if (!(typeM2433i2 instanceof ParameterizedType)) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeM2433i2;
                Type typeM2431g2 = AbstractC5277c0.m2431g(0, parameterizedType2);
                if (String.class == typeM2431g2) {
                    return new AbstractC5288n.g(this.f2658b, i9, this.f2657a.m2534i(AbstractC5277c0.m2431g(1, parameterizedType2), annotationArr));
                }
                throw AbstractC5277c0.m2439o(this.f2658b, i9, "@HeaderMap keys must be of type String: " + typeM2431g2, new Object[0]);
            }
            if (annotation instanceof InterfaceC7958c) {
                m2516j(i9, type);
                if (!this.f2672p) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                InterfaceC7958c interfaceC7958c = (InterfaceC7958c) annotation;
                String strValue4 = interfaceC7958c.value();
                boolean zEncoded3 = interfaceC7958c.encoded();
                this.f2662f = true;
                Class clsM2432h6 = AbstractC5277c0.m2432h(type);
                if (!Iterable.class.isAssignableFrom(clsM2432h6)) {
                    if (!clsM2432h6.isArray()) {
                        return new AbstractC5288n.d(strValue4, this.f2657a.m2534i(type, annotationArr), zEncoded3);
                    }
                    return new AbstractC5288n.d(strValue4, this.f2657a.m2534i(m2507a(clsM2432h6.getComponentType()), annotationArr), zEncoded3).m2469b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC5288n.d(strValue4, this.f2657a.m2534i(AbstractC5277c0.m2431g(0, (ParameterizedType) type), annotationArr), zEncoded3).m2470c();
                }
                throw AbstractC5277c0.m2439o(this.f2658b, i9, clsM2432h6.getSimpleName() + " must include generic type (e.g., " + clsM2432h6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC7959d) {
                m2516j(i9, type);
                if (!this.f2672p) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class clsM2432h7 = AbstractC5277c0.m2432h(type);
                if (!Map.class.isAssignableFrom(clsM2432h7)) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeM2433i3 = AbstractC5277c0.m2433i(type, clsM2432h7, Map.class);
                if (!(typeM2433i3 instanceof ParameterizedType)) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeM2433i3;
                Type typeM2431g3 = AbstractC5277c0.m2431g(0, parameterizedType3);
                if (String.class == typeM2431g3) {
                    InterfaceC5280f interfaceC5280fM2534i = this.f2657a.m2534i(AbstractC5277c0.m2431g(1, parameterizedType3), annotationArr);
                    this.f2662f = true;
                    return new AbstractC5288n.e(this.f2658b, i9, interfaceC5280fM2534i, ((InterfaceC7959d) annotation).encoded());
                }
                throw AbstractC5277c0.m2439o(this.f2658b, i9, "@FieldMap keys must be of type String: " + typeM2431g3, new Object[0]);
            }
            if (!(annotation instanceof InterfaceC7972q)) {
                if (annotation instanceof InterfaceC7973r) {
                    m2516j(i9, type);
                    if (!this.f2673q) {
                        throw AbstractC5277c0.m2439o(this.f2658b, i9, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f2663g = true;
                    Class clsM2432h8 = AbstractC5277c0.m2432h(type);
                    if (!Map.class.isAssignableFrom(clsM2432h8)) {
                        throw AbstractC5277c0.m2439o(this.f2658b, i9, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeM2433i4 = AbstractC5277c0.m2433i(type, clsM2432h8, Map.class);
                    if (!(typeM2433i4 instanceof ParameterizedType)) {
                        throw AbstractC5277c0.m2439o(this.f2658b, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeM2433i4;
                    Type typeM2431g4 = AbstractC5277c0.m2431g(0, parameterizedType4);
                    if (String.class == typeM2431g4) {
                        Type typeM2431g5 = AbstractC5277c0.m2431g(1, parameterizedType4);
                        if (C8922u.c.class.isAssignableFrom(AbstractC5277c0.m2432h(typeM2431g5))) {
                            throw AbstractC5277c0.m2439o(this.f2658b, i9, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new AbstractC5288n.j(this.f2658b, i9, this.f2657a.m2532g(typeM2431g5, annotationArr, this.f2659c), ((InterfaceC7973r) annotation).encoding());
                    }
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "@PartMap keys must be of type String: " + typeM2431g4, new Object[0]);
                }
                if (annotation instanceof InterfaceC7956a) {
                    m2516j(i9, type);
                    if (this.f2672p || this.f2673q) {
                        throw AbstractC5277c0.m2439o(this.f2658b, i9, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f2664h) {
                        throw AbstractC5277c0.m2439o(this.f2658b, i9, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        InterfaceC5280f interfaceC5280fM2532g = this.f2657a.m2532g(type, annotationArr, this.f2659c);
                        this.f2664h = true;
                        return new AbstractC5288n.c(this.f2658b, i9, interfaceC5280fM2532g);
                    } catch (RuntimeException e10) {
                        throw AbstractC5277c0.m2440p(this.f2658b, e10, i9, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof InterfaceC7979x)) {
                    return null;
                }
                m2516j(i9, type);
                Class clsM2432h9 = AbstractC5277c0.m2432h(type);
                for (int i10 = i9 - 1; i10 >= 0; i10--) {
                    AbstractC5288n abstractC5288n = this.f2678v[i10];
                    if ((abstractC5288n instanceof AbstractC5288n.q) && ((AbstractC5288n.q) abstractC5288n).f2624a.equals(clsM2432h9)) {
                        throw AbstractC5277c0.m2439o(this.f2658b, i9, "@Tag type " + clsM2432h9.getName() + " is duplicate of parameter #" + (i10 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new AbstractC5288n.q(clsM2432h9);
            }
            m2516j(i9, type);
            if (!this.f2673q) {
                throw AbstractC5277c0.m2439o(this.f2658b, i9, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            InterfaceC7972q interfaceC7972q = (InterfaceC7972q) annotation;
            this.f2663g = true;
            String strValue5 = interfaceC7972q.value();
            Class clsM2432h10 = AbstractC5277c0.m2432h(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsM2432h10)) {
                    if (clsM2432h10.isArray()) {
                        if (C8922u.c.class.isAssignableFrom(clsM2432h10.getComponentType())) {
                            return AbstractC5288n.o.f2621a.m2469b();
                        }
                        throw AbstractC5277c0.m2439o(this.f2658b, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (C8922u.c.class.isAssignableFrom(clsM2432h10)) {
                        return AbstractC5288n.o.f2621a;
                    }
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (C8922u.c.class.isAssignableFrom(AbstractC5277c0.m2432h(AbstractC5277c0.m2431g(0, (ParameterizedType) type)))) {
                        return AbstractC5288n.o.f2621a.m2470c();
                    }
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw AbstractC5277c0.m2439o(this.f2658b, i9, clsM2432h10.getSimpleName() + " must include generic type (e.g., " + clsM2432h10.getSimpleName() + "<String>)", new Object[0]);
            }
            C8918q c8918qM13935d = C8918q.m13935d(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", interfaceC7972q.encoding());
            if (!Iterable.class.isAssignableFrom(clsM2432h10)) {
                if (!clsM2432h10.isArray()) {
                    if (C8922u.c.class.isAssignableFrom(clsM2432h10)) {
                        throw AbstractC5277c0.m2439o(this.f2658b, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new AbstractC5288n.i(this.f2658b, i9, c8918qM13935d, this.f2657a.m2532g(type, annotationArr, this.f2659c));
                }
                Class clsM2507a = m2507a(clsM2432h10.getComponentType());
                if (C8922u.c.class.isAssignableFrom(clsM2507a)) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new AbstractC5288n.i(this.f2658b, i9, c8918qM13935d, this.f2657a.m2532g(clsM2507a, annotationArr, this.f2659c)).m2469b();
            }
            if (type instanceof ParameterizedType) {
                Type typeM2431g6 = AbstractC5277c0.m2431g(0, (ParameterizedType) type);
                if (C8922u.c.class.isAssignableFrom(AbstractC5277c0.m2432h(typeM2431g6))) {
                    throw AbstractC5277c0.m2439o(this.f2658b, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new AbstractC5288n.i(this.f2658b, i9, c8918qM13935d, this.f2657a.m2532g(typeM2431g6, annotationArr, this.f2659c)).m2470c();
            }
            throw AbstractC5277c0.m2439o(this.f2658b, i9, clsM2432h10.getSimpleName() + " must include generic type (e.g., " + clsM2432h10.getSimpleName() + "<String>)", new Object[0]);
        }

        /* renamed from: i */
        public final void m2515i(int i9, String str) {
            if (!f2656y.matcher(str).matches()) {
                throw AbstractC5277c0.m2439o(this.f2658b, i9, "@Path parameter name must match %s. Found: %s", f2655x.pattern(), str);
            }
            if (!this.f2677u.contains(str)) {
                throw AbstractC5277c0.m2439o(this.f2658b, i9, "URL \"%s\" does not contain \"{%s}\".", this.f2674r, str);
            }
        }

        /* renamed from: j */
        public final void m2516j(int i9, Type type) {
            if (AbstractC5277c0.m2434j(type)) {
                throw AbstractC5277c0.m2439o(this.f2658b, i9, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public C5297w(a aVar) {
        this.f2644a = aVar.f2658b;
        this.f2645b = aVar.f2657a.f2685c;
        this.f2646c = aVar.f2670n;
        this.f2647d = aVar.f2674r;
        this.f2648e = aVar.f2675s;
        this.f2649f = aVar.f2676t;
        this.f2650g = aVar.f2671o;
        this.f2651h = aVar.f2672p;
        this.f2652i = aVar.f2673q;
        this.f2653j = aVar.f2678v;
        this.f2654k = aVar.f2679w;
    }

    /* renamed from: b */
    public static C5297w m2505b(C5299y c5299y, Method method) {
        return new a(c5299y, method).m2509b();
    }

    /* renamed from: a */
    public C8924w m2506a(Object[] objArr) {
        AbstractC5288n[] abstractC5288nArr = this.f2653j;
        int length = objArr.length;
        if (length != abstractC5288nArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + abstractC5288nArr.length + ")");
        }
        C5296v c5296v = new C5296v(this.f2646c, this.f2645b, this.f2647d, this.f2648e, this.f2649f, this.f2650g, this.f2651h, this.f2652i);
        if (this.f2654k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i9 = 0; i9 < length; i9++) {
            arrayList.add(objArr[i9]);
            abstractC5288nArr[i9].mo2468a(c5296v, objArr[i9]);
        }
        return c5296v.m2502k().m14150m(C5285k.class, new C5285k(this.f2644a, arrayList)).m14140b();
    }
}
