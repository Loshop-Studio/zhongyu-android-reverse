package p200z5;

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
import p029c6.InterfaceC4510a;
import p029c6.InterfaceC4511b;
import p029c6.InterfaceC4512c;
import p029c6.InterfaceC4513d;
import p029c6.InterfaceC4514e;
import p029c6.InterfaceC4515f;
import p029c6.InterfaceC4516g;
import p029c6.InterfaceC4517h;
import p029c6.InterfaceC4518i;
import p029c6.InterfaceC4519j;
import p029c6.InterfaceC4520k;
import p029c6.InterfaceC4521l;
import p029c6.InterfaceC4522m;
import p029c6.InterfaceC4523n;
import p029c6.InterfaceC4524o;
import p029c6.InterfaceC4525p;
import p029c6.InterfaceC4526q;
import p029c6.InterfaceC4527r;
import p029c6.InterfaceC4528s;
import p029c6.InterfaceC4529t;
import p029c6.InterfaceC4530u;
import p029c6.InterfaceC4531v;
import p029c6.InterfaceC4533x;
import p029c6.InterfaceC4534y;
import p058f5.C6358b0;
import p058f5.C6383v;
import p058f5.C6384w;
import p058f5.C6386y;
import p058f5.C6387z;
import p200z5.AbstractC7981v;

/* renamed from: z5.b0 */
/* loaded from: classes4.dex */
public final class C7955b0 {

    /* renamed from: a */
    public final Class f10695a;

    /* renamed from: b */
    public final Method f10696b;

    /* renamed from: c */
    public final C6384w f10697c;

    /* renamed from: d */
    public final String f10698d;

    /* renamed from: e */
    public final String f10699e;

    /* renamed from: f */
    public final C6383v f10700f;

    /* renamed from: g */
    public final C6386y f10701g;

    /* renamed from: h */
    public final boolean f10702h;

    /* renamed from: i */
    public final boolean f10703i;

    /* renamed from: j */
    public final boolean f10704j;

    /* renamed from: k */
    public final AbstractC7981v[] f10705k;

    /* renamed from: l */
    public final boolean f10706l;

    /* renamed from: z5.b0$a */
    public static final class a {

        /* renamed from: y */
        public static final Pattern f10707y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: z */
        public static final Pattern f10708z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final C7959d0 f10709a;

        /* renamed from: b */
        public final Class f10710b;

        /* renamed from: c */
        public final Method f10711c;

        /* renamed from: d */
        public final Annotation[] f10712d;

        /* renamed from: e */
        public final Annotation[][] f10713e;

        /* renamed from: f */
        public final Type[] f10714f;

        /* renamed from: g */
        public boolean f10715g;

        /* renamed from: h */
        public boolean f10716h;

        /* renamed from: i */
        public boolean f10717i;

        /* renamed from: j */
        public boolean f10718j;

        /* renamed from: k */
        public boolean f10719k;

        /* renamed from: l */
        public boolean f10720l;

        /* renamed from: m */
        public boolean f10721m;

        /* renamed from: n */
        public boolean f10722n;

        /* renamed from: o */
        public String f10723o;

        /* renamed from: p */
        public boolean f10724p;

        /* renamed from: q */
        public boolean f10725q;

        /* renamed from: r */
        public boolean f10726r;

        /* renamed from: s */
        public String f10727s;

        /* renamed from: t */
        public C6383v f10728t;

        /* renamed from: u */
        public C6386y f10729u;

        /* renamed from: v */
        public Set f10730v;

        /* renamed from: w */
        public AbstractC7981v[] f10731w;

        /* renamed from: x */
        public boolean f10732x;

        public a(C7959d0 c7959d0, Class cls, Method method) {
            this.f10709a = c7959d0;
            this.f10710b = cls;
            this.f10711c = method;
            this.f10712d = method.getAnnotations();
            this.f10714f = method.getGenericParameterTypes();
            this.f10713e = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class m9771a(Class cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: h */
        public static Set m9772h(String str) {
            Matcher matcher = f10707y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: b */
        public C7955b0 m9773b() {
            for (Annotation annotation : this.f10712d) {
                m9776e(annotation);
            }
            if (this.f10723o == null) {
                throw AbstractC7967h0.m9834n(this.f10711c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f10724p) {
                if (this.f10726r) {
                    throw AbstractC7967h0.m9834n(this.f10711c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f10725q) {
                    throw AbstractC7967h0.m9834n(this.f10711c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f10713e.length;
            this.f10731w = new AbstractC7981v[length];
            int i6 = length - 1;
            int i7 = 0;
            while (i7 < length) {
                this.f10731w[i7] = m9777f(i7, this.f10714f[i7], this.f10713e[i7], i7 == i6);
                i7++;
            }
            if (this.f10727s == null && !this.f10722n) {
                throw AbstractC7967h0.m9834n(this.f10711c, "Missing either @%s URL or @Url parameter.", this.f10723o);
            }
            boolean z6 = this.f10725q;
            if (!z6 && !this.f10726r && !this.f10724p && this.f10717i) {
                throw AbstractC7967h0.m9834n(this.f10711c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z6 && !this.f10715g) {
                throw AbstractC7967h0.m9834n(this.f10711c, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f10726r || this.f10716h) {
                return new C7955b0(this);
            }
            throw AbstractC7967h0.m9834n(this.f10711c, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        /* renamed from: c */
        public final C6383v m9774c(String[] strArr, boolean z6) {
            C6383v.a aVar = new C6383v.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw AbstractC7967h0.m9834n(this.f10711c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f10729u = C6386y.m6876e(strTrim);
                    } catch (IllegalArgumentException e6) {
                        throw AbstractC7967h0.m9835o(this.f10711c, e6, "Malformed content type: %s", strTrim);
                    }
                } else if (z6) {
                    aVar.m6810e(strSubstring, strTrim);
                } else {
                    aVar.m6806a(strSubstring, strTrim);
                }
            }
            return aVar.m6811f();
        }

        /* renamed from: d */
        public final void m9775d(String str, String str2, boolean z6) {
            String str3 = this.f10723o;
            if (str3 != null) {
                throw AbstractC7967h0.m9834n(this.f10711c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f10723o = str;
            this.f10724p = z6;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f10707y.matcher(strSubstring).find()) {
                    throw AbstractC7967h0.m9834n(this.f10711c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f10727s = str2;
            this.f10730v = m9772h(str2);
        }

        /* renamed from: e */
        public final void m9776e(Annotation annotation) {
            if (annotation instanceof InterfaceC4511b) {
                m9775d("DELETE", ((InterfaceC4511b) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC4515f) {
                m9775d("GET", ((InterfaceC4515f) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC4516g) {
                m9775d("HEAD", ((InterfaceC4516g) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC4523n) {
                m9775d("PATCH", ((InterfaceC4523n) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC4524o) {
                m9775d("POST", ((InterfaceC4524o) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC4525p) {
                m9775d("PUT", ((InterfaceC4525p) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC4522m) {
                m9775d("OPTIONS", ((InterfaceC4522m) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC4517h) {
                InterfaceC4517h interfaceC4517h = (InterfaceC4517h) annotation;
                m9775d(interfaceC4517h.method(), interfaceC4517h.path(), interfaceC4517h.hasBody());
                return;
            }
            if (annotation instanceof InterfaceC4520k) {
                InterfaceC4520k interfaceC4520k = (InterfaceC4520k) annotation;
                String[] strArrValue = interfaceC4520k.value();
                if (strArrValue.length == 0) {
                    throw AbstractC7967h0.m9834n(this.f10711c, "@Headers annotation is empty.", new Object[0]);
                }
                this.f10728t = m9774c(strArrValue, interfaceC4520k.allowUnsafeNonAsciiValues());
                return;
            }
            if (annotation instanceof InterfaceC4521l) {
                if (this.f10725q) {
                    throw AbstractC7967h0.m9834n(this.f10711c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f10726r = true;
            } else if (annotation instanceof InterfaceC4514e) {
                if (this.f10726r) {
                    throw AbstractC7967h0.m9834n(this.f10711c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f10725q = true;
            }
        }

        /* renamed from: f */
        public final AbstractC7981v m9777f(int i6, Type type, Annotation[] annotationArr, boolean z6) {
            AbstractC7981v abstractC7981v;
            if (annotationArr != null) {
                abstractC7981v = null;
                for (Annotation annotation : annotationArr) {
                    AbstractC7981v abstractC7981vM9778g = m9778g(i6, type, annotationArr, annotation);
                    if (abstractC7981vM9778g != null) {
                        if (abstractC7981v != null) {
                            throw AbstractC7967h0.m9836p(this.f10711c, i6, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        abstractC7981v = abstractC7981vM9778g;
                    }
                }
            } else {
                abstractC7981v = null;
            }
            if (abstractC7981v != null) {
                return abstractC7981v;
            }
            if (z6) {
                try {
                    if (AbstractC7967h0.m9828h(type) == Continuation.class) {
                        this.f10732x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw AbstractC7967h0.m9836p(this.f10711c, i6, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: g */
        public final AbstractC7981v m9778g(int i6, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof InterfaceC4534y) {
                m9780j(i6, type);
                if (this.f10722n) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f10718j) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f10719k) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f10720l) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f10721m) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f10727s != null) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "@Url cannot be used with @%s URL", this.f10723o);
                }
                this.f10722n = true;
                if (type == C6384w.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new AbstractC7981v.p(this.f10711c, i6);
                }
                throw AbstractC7967h0.m9836p(this.f10711c, i6, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof InterfaceC4528s) {
                m9780j(i6, type);
                if (this.f10719k) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f10720l) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f10721m) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f10722n) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f10727s == null) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "@Path can only be used with relative url on @%s", this.f10723o);
                }
                this.f10718j = true;
                InterfaceC4528s interfaceC4528s = (InterfaceC4528s) annotation;
                String strValue = interfaceC4528s.value();
                m9779i(i6, strValue);
                return new AbstractC7981v.k(this.f10711c, i6, strValue, this.f10709a.m9800i(type, annotationArr), interfaceC4528s.encoded());
            }
            if (annotation instanceof InterfaceC4529t) {
                m9780j(i6, type);
                InterfaceC4529t interfaceC4529t = (InterfaceC4529t) annotation;
                String strValue2 = interfaceC4529t.value();
                boolean zEncoded = interfaceC4529t.encoded();
                Class clsM9828h = AbstractC7967h0.m9828h(type);
                this.f10719k = true;
                if (!Iterable.class.isAssignableFrom(clsM9828h)) {
                    if (!clsM9828h.isArray()) {
                        return new AbstractC7981v.l(strValue2, this.f10709a.m9800i(type, annotationArr), zEncoded);
                    }
                    return new AbstractC7981v.l(strValue2, this.f10709a.m9800i(m9771a(clsM9828h.getComponentType()), annotationArr), zEncoded).m9865b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC7981v.l(strValue2, this.f10709a.m9800i(AbstractC7967h0.m9827g(0, (ParameterizedType) type), annotationArr), zEncoded).m9866c();
                }
                throw AbstractC7967h0.m9836p(this.f10711c, i6, clsM9828h.getSimpleName() + " must include generic type (e.g., " + clsM9828h.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC4531v) {
                m9780j(i6, type);
                boolean zEncoded2 = ((InterfaceC4531v) annotation).encoded();
                Class clsM9828h2 = AbstractC7967h0.m9828h(type);
                this.f10720l = true;
                if (!Iterable.class.isAssignableFrom(clsM9828h2)) {
                    if (!clsM9828h2.isArray()) {
                        return new AbstractC7981v.n(this.f10709a.m9800i(type, annotationArr), zEncoded2);
                    }
                    return new AbstractC7981v.n(this.f10709a.m9800i(m9771a(clsM9828h2.getComponentType()), annotationArr), zEncoded2).m9865b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC7981v.n(this.f10709a.m9800i(AbstractC7967h0.m9827g(0, (ParameterizedType) type), annotationArr), zEncoded2).m9866c();
                }
                throw AbstractC7967h0.m9836p(this.f10711c, i6, clsM9828h2.getSimpleName() + " must include generic type (e.g., " + clsM9828h2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC4530u) {
                m9780j(i6, type);
                Class clsM9828h3 = AbstractC7967h0.m9828h(type);
                this.f10721m = true;
                if (!Map.class.isAssignableFrom(clsM9828h3)) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeM9829i = AbstractC7967h0.m9829i(type, clsM9828h3, Map.class);
                if (!(typeM9829i instanceof ParameterizedType)) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeM9829i;
                Type typeM9827g = AbstractC7967h0.m9827g(0, parameterizedType);
                if (String.class == typeM9827g) {
                    return new AbstractC7981v.m(this.f10711c, i6, this.f10709a.m9800i(AbstractC7967h0.m9827g(1, parameterizedType), annotationArr), ((InterfaceC4530u) annotation).encoded());
                }
                throw AbstractC7967h0.m9836p(this.f10711c, i6, "@QueryMap keys must be of type String: " + typeM9827g, new Object[0]);
            }
            if (annotation instanceof InterfaceC4518i) {
                m9780j(i6, type);
                InterfaceC4518i interfaceC4518i = (InterfaceC4518i) annotation;
                String strValue3 = interfaceC4518i.value();
                Class clsM9828h4 = AbstractC7967h0.m9828h(type);
                if (!Iterable.class.isAssignableFrom(clsM9828h4)) {
                    if (!clsM9828h4.isArray()) {
                        return new AbstractC7981v.f(strValue3, this.f10709a.m9800i(type, annotationArr), interfaceC4518i.allowUnsafeNonAsciiValues());
                    }
                    return new AbstractC7981v.f(strValue3, this.f10709a.m9800i(m9771a(clsM9828h4.getComponentType()), annotationArr), interfaceC4518i.allowUnsafeNonAsciiValues()).m9865b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC7981v.f(strValue3, this.f10709a.m9800i(AbstractC7967h0.m9827g(0, (ParameterizedType) type), annotationArr), interfaceC4518i.allowUnsafeNonAsciiValues()).m9866c();
                }
                throw AbstractC7967h0.m9836p(this.f10711c, i6, clsM9828h4.getSimpleName() + " must include generic type (e.g., " + clsM9828h4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC4519j) {
                if (type == C6383v.class) {
                    return new AbstractC7981v.h(this.f10711c, i6);
                }
                m9780j(i6, type);
                Class clsM9828h5 = AbstractC7967h0.m9828h(type);
                if (!Map.class.isAssignableFrom(clsM9828h5)) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                }
                Type typeM9829i2 = AbstractC7967h0.m9829i(type, clsM9828h5, Map.class);
                if (!(typeM9829i2 instanceof ParameterizedType)) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeM9829i2;
                Type typeM9827g2 = AbstractC7967h0.m9827g(0, parameterizedType2);
                if (String.class == typeM9827g2) {
                    return new AbstractC7981v.g(this.f10711c, i6, this.f10709a.m9800i(AbstractC7967h0.m9827g(1, parameterizedType2), annotationArr), ((InterfaceC4519j) annotation).allowUnsafeNonAsciiValues());
                }
                throw AbstractC7967h0.m9836p(this.f10711c, i6, "@HeaderMap keys must be of type String: " + typeM9827g2, new Object[0]);
            }
            if (annotation instanceof InterfaceC4512c) {
                m9780j(i6, type);
                if (!this.f10725q) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                InterfaceC4512c interfaceC4512c = (InterfaceC4512c) annotation;
                String strValue4 = interfaceC4512c.value();
                boolean zEncoded3 = interfaceC4512c.encoded();
                this.f10715g = true;
                Class clsM9828h6 = AbstractC7967h0.m9828h(type);
                if (!Iterable.class.isAssignableFrom(clsM9828h6)) {
                    if (!clsM9828h6.isArray()) {
                        return new AbstractC7981v.d(strValue4, this.f10709a.m9800i(type, annotationArr), zEncoded3);
                    }
                    return new AbstractC7981v.d(strValue4, this.f10709a.m9800i(m9771a(clsM9828h6.getComponentType()), annotationArr), zEncoded3).m9865b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC7981v.d(strValue4, this.f10709a.m9800i(AbstractC7967h0.m9827g(0, (ParameterizedType) type), annotationArr), zEncoded3).m9866c();
                }
                throw AbstractC7967h0.m9836p(this.f10711c, i6, clsM9828h6.getSimpleName() + " must include generic type (e.g., " + clsM9828h6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC4513d) {
                m9780j(i6, type);
                if (!this.f10725q) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class clsM9828h7 = AbstractC7967h0.m9828h(type);
                if (!Map.class.isAssignableFrom(clsM9828h7)) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeM9829i3 = AbstractC7967h0.m9829i(type, clsM9828h7, Map.class);
                if (!(typeM9829i3 instanceof ParameterizedType)) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeM9829i3;
                Type typeM9827g3 = AbstractC7967h0.m9827g(0, parameterizedType3);
                if (String.class == typeM9827g3) {
                    InterfaceC7966h interfaceC7966hM9800i = this.f10709a.m9800i(AbstractC7967h0.m9827g(1, parameterizedType3), annotationArr);
                    this.f10715g = true;
                    return new AbstractC7981v.e(this.f10711c, i6, interfaceC7966hM9800i, ((InterfaceC4513d) annotation).encoded());
                }
                throw AbstractC7967h0.m9836p(this.f10711c, i6, "@FieldMap keys must be of type String: " + typeM9827g3, new Object[0]);
            }
            if (!(annotation instanceof InterfaceC4526q)) {
                if (annotation instanceof InterfaceC4527r) {
                    m9780j(i6, type);
                    if (!this.f10726r) {
                        throw AbstractC7967h0.m9836p(this.f10711c, i6, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f10716h = true;
                    Class clsM9828h8 = AbstractC7967h0.m9828h(type);
                    if (!Map.class.isAssignableFrom(clsM9828h8)) {
                        throw AbstractC7967h0.m9836p(this.f10711c, i6, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeM9829i4 = AbstractC7967h0.m9829i(type, clsM9828h8, Map.class);
                    if (!(typeM9829i4 instanceof ParameterizedType)) {
                        throw AbstractC7967h0.m9836p(this.f10711c, i6, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeM9829i4;
                    Type typeM9827g4 = AbstractC7967h0.m9827g(0, parameterizedType4);
                    if (String.class == typeM9827g4) {
                        Type typeM9827g5 = AbstractC7967h0.m9827g(1, parameterizedType4);
                        if (C6387z.c.class.isAssignableFrom(AbstractC7967h0.m9828h(typeM9827g5))) {
                            throw AbstractC7967h0.m9836p(this.f10711c, i6, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new AbstractC7981v.j(this.f10711c, i6, this.f10709a.m9798g(typeM9827g5, annotationArr, this.f10712d), ((InterfaceC4527r) annotation).encoding());
                    }
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "@PartMap keys must be of type String: " + typeM9827g4, new Object[0]);
                }
                if (annotation instanceof InterfaceC4510a) {
                    m9780j(i6, type);
                    if (this.f10725q || this.f10726r) {
                        throw AbstractC7967h0.m9836p(this.f10711c, i6, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f10717i) {
                        throw AbstractC7967h0.m9836p(this.f10711c, i6, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        InterfaceC7966h interfaceC7966hM9798g = this.f10709a.m9798g(type, annotationArr, this.f10712d);
                        this.f10717i = true;
                        return new AbstractC7981v.c(this.f10711c, i6, interfaceC7966hM9798g);
                    } catch (RuntimeException e6) {
                        throw AbstractC7967h0.m9837q(this.f10711c, e6, i6, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof InterfaceC4533x)) {
                    return null;
                }
                m9780j(i6, type);
                Class clsM9771a = m9771a(AbstractC7967h0.m9828h(type));
                for (int i7 = i6 - 1; i7 >= 0; i7--) {
                    AbstractC7981v abstractC7981v = this.f10731w[i7];
                    if ((abstractC7981v instanceof AbstractC7981v.q) && ((AbstractC7981v.q) abstractC7981v).f10861a.equals(clsM9771a)) {
                        throw AbstractC7967h0.m9836p(this.f10711c, i6, "@Tag type " + clsM9771a.getName() + " is duplicate of " + AbstractC7982w.f10863b.mo9874a(this.f10711c, i7) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new AbstractC7981v.q(clsM9771a);
            }
            m9780j(i6, type);
            if (!this.f10726r) {
                throw AbstractC7967h0.m9836p(this.f10711c, i6, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            InterfaceC4526q interfaceC4526q = (InterfaceC4526q) annotation;
            this.f10716h = true;
            String strValue5 = interfaceC4526q.value();
            Class clsM9828h9 = AbstractC7967h0.m9828h(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsM9828h9)) {
                    if (clsM9828h9.isArray()) {
                        if (C6387z.c.class.isAssignableFrom(clsM9828h9.getComponentType())) {
                            return AbstractC7981v.o.f10858a.m9865b();
                        }
                        throw AbstractC7967h0.m9836p(this.f10711c, i6, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (C6387z.c.class.isAssignableFrom(clsM9828h9)) {
                        return AbstractC7981v.o.f10858a;
                    }
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (C6387z.c.class.isAssignableFrom(AbstractC7967h0.m9828h(AbstractC7967h0.m9827g(0, (ParameterizedType) type)))) {
                        return AbstractC7981v.o.f10858a.m9866c();
                    }
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw AbstractC7967h0.m9836p(this.f10711c, i6, clsM9828h9.getSimpleName() + " must include generic type (e.g., " + clsM9828h9.getSimpleName() + "<String>)", new Object[0]);
            }
            C6383v c6383vM6798e = C6383v.m6798e(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", interfaceC4526q.encoding());
            if (!Iterable.class.isAssignableFrom(clsM9828h9)) {
                if (!clsM9828h9.isArray()) {
                    if (C6387z.c.class.isAssignableFrom(clsM9828h9)) {
                        throw AbstractC7967h0.m9836p(this.f10711c, i6, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new AbstractC7981v.i(this.f10711c, i6, c6383vM6798e, this.f10709a.m9798g(type, annotationArr, this.f10712d));
                }
                Class clsM9771a2 = m9771a(clsM9828h9.getComponentType());
                if (C6387z.c.class.isAssignableFrom(clsM9771a2)) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new AbstractC7981v.i(this.f10711c, i6, c6383vM6798e, this.f10709a.m9798g(clsM9771a2, annotationArr, this.f10712d)).m9865b();
            }
            if (type instanceof ParameterizedType) {
                Type typeM9827g6 = AbstractC7967h0.m9827g(0, (ParameterizedType) type);
                if (C6387z.c.class.isAssignableFrom(AbstractC7967h0.m9828h(typeM9827g6))) {
                    throw AbstractC7967h0.m9836p(this.f10711c, i6, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new AbstractC7981v.i(this.f10711c, i6, c6383vM6798e, this.f10709a.m9798g(typeM9827g6, annotationArr, this.f10712d)).m9866c();
            }
            throw AbstractC7967h0.m9836p(this.f10711c, i6, clsM9828h9.getSimpleName() + " must include generic type (e.g., " + clsM9828h9.getSimpleName() + "<String>)", new Object[0]);
        }

        /* renamed from: i */
        public final void m9779i(int i6, String str) {
            if (!f10708z.matcher(str).matches()) {
                throw AbstractC7967h0.m9836p(this.f10711c, i6, "@Path parameter name must match %s. Found: %s", f10707y.pattern(), str);
            }
            if (!this.f10730v.contains(str)) {
                throw AbstractC7967h0.m9836p(this.f10711c, i6, "URL \"%s\" does not contain \"{%s}\".", this.f10727s, str);
            }
        }

        /* renamed from: j */
        public final void m9780j(int i6, Type type) {
            if (AbstractC7967h0.m9830j(type)) {
                throw AbstractC7967h0.m9836p(this.f10711c, i6, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public C7955b0(a aVar) {
        this.f10695a = aVar.f10710b;
        this.f10696b = aVar.f10711c;
        this.f10697c = aVar.f10709a.f10738c;
        this.f10698d = aVar.f10723o;
        this.f10699e = aVar.f10727s;
        this.f10700f = aVar.f10728t;
        this.f10701g = aVar.f10729u;
        this.f10702h = aVar.f10724p;
        this.f10703i = aVar.f10725q;
        this.f10704j = aVar.f10726r;
        this.f10705k = aVar.f10731w;
        this.f10706l = aVar.f10732x;
    }

    /* renamed from: b */
    public static C7955b0 m9769b(C7959d0 c7959d0, Class cls, Method method) {
        return new a(c7959d0, cls, method).m9773b();
    }

    /* renamed from: a */
    public C6358b0 m9770a(Object obj, Object[] objArr) {
        AbstractC7981v[] abstractC7981vArr = this.f10705k;
        int length = objArr.length;
        if (length != abstractC7981vArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + abstractC7981vArr.length + ")");
        }
        C7953a0 c7953a0 = new C7953a0(this.f10698d, this.f10697c, this.f10699e, this.f10700f, this.f10701g, this.f10702h, this.f10703i, this.f10704j);
        if (this.f10706l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i6 = 0; i6 < length; i6++) {
            arrayList.add(objArr[i6]);
            abstractC7981vArr[i6].mo9864a(c7953a0, objArr[i6]);
        }
        return c7953a0.m9760k().m6608t(C7978s.class, new C7978s(this.f10695a, obj, this.f10696b, arrayList)).m6591b();
    }
}
