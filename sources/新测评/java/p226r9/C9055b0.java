package p226r9;

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
import p011a9.C0054q;
import p011a9.C0055r;
import p011a9.C0057t;
import p011a9.C0058u;
import p011a9.C0060w;
import p226r9.AbstractC9081v;
import p259u9.InterfaceC9597a;
import p259u9.InterfaceC9598b;
import p259u9.InterfaceC9599c;
import p259u9.InterfaceC9600d;
import p259u9.InterfaceC9601e;
import p259u9.InterfaceC9602f;
import p259u9.InterfaceC9603g;
import p259u9.InterfaceC9604h;
import p259u9.InterfaceC9605i;
import p259u9.InterfaceC9606j;
import p259u9.InterfaceC9607k;
import p259u9.InterfaceC9608l;
import p259u9.InterfaceC9609m;
import p259u9.InterfaceC9610n;
import p259u9.InterfaceC9611o;
import p259u9.InterfaceC9612p;
import p259u9.InterfaceC9613q;
import p259u9.InterfaceC9614r;
import p259u9.InterfaceC9615s;
import p259u9.InterfaceC9616t;
import p259u9.InterfaceC9617u;
import p259u9.InterfaceC9618v;
import p259u9.InterfaceC9620x;
import p259u9.InterfaceC9621y;

/* renamed from: r9.b0 */
/* loaded from: classes5.dex */
public final class C9055b0 {

    /* renamed from: a */
    public final Class f15540a;

    /* renamed from: b */
    public final Method f15541b;

    /* renamed from: c */
    public final C0055r f15542c;

    /* renamed from: d */
    public final String f15543d;

    /* renamed from: e */
    public final String f15544e;

    /* renamed from: f */
    public final C0054q f15545f;

    /* renamed from: g */
    public final C0057t f15546g;

    /* renamed from: h */
    public final boolean f15547h;

    /* renamed from: i */
    public final boolean f15548i;

    /* renamed from: j */
    public final boolean f15549j;

    /* renamed from: k */
    public final AbstractC9081v[] f15550k;

    /* renamed from: l */
    public final boolean f15551l;

    /* renamed from: r9.b0$a */
    public static final class a {

        /* renamed from: y */
        public static final Pattern f15552y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: z */
        public static final Pattern f15553z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final C9059d0 f15554a;

        /* renamed from: b */
        public final Class f15555b;

        /* renamed from: c */
        public final Method f15556c;

        /* renamed from: d */
        public final Annotation[] f15557d;

        /* renamed from: e */
        public final Annotation[][] f15558e;

        /* renamed from: f */
        public final Type[] f15559f;

        /* renamed from: g */
        public boolean f15560g;

        /* renamed from: h */
        public boolean f15561h;

        /* renamed from: i */
        public boolean f15562i;

        /* renamed from: j */
        public boolean f15563j;

        /* renamed from: k */
        public boolean f15564k;

        /* renamed from: l */
        public boolean f15565l;

        /* renamed from: m */
        public boolean f15566m;

        /* renamed from: n */
        public boolean f15567n;

        /* renamed from: o */
        public String f15568o;

        /* renamed from: p */
        public boolean f15569p;

        /* renamed from: q */
        public boolean f15570q;

        /* renamed from: r */
        public boolean f15571r;

        /* renamed from: s */
        public String f15572s;

        /* renamed from: t */
        public C0054q f15573t;

        /* renamed from: u */
        public C0057t f15574u;

        /* renamed from: v */
        public Set f15575v;

        /* renamed from: w */
        public AbstractC9081v[] f15576w;

        /* renamed from: x */
        public boolean f15577x;

        public a(C9059d0 c9059d0, Class cls, Method method) {
            this.f15554a = c9059d0;
            this.f15555b = cls;
            this.f15556c = method;
            this.f15557d = method.getAnnotations();
            this.f15559f = method.getGenericParameterTypes();
            this.f15558e = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class m15228a(Class cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: h */
        public static Set m15229h(String str) {
            Matcher matcher = f15552y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: b */
        public C9055b0 m15230b() {
            for (Annotation annotation : this.f15557d) {
                m15233e(annotation);
            }
            if (this.f15568o == null) {
                throw AbstractC9067h0.m15292n(this.f15556c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f15569p) {
                if (this.f15571r) {
                    throw AbstractC9067h0.m15292n(this.f15556c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f15570q) {
                    throw AbstractC9067h0.m15292n(this.f15556c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f15558e.length;
            this.f15576w = new AbstractC9081v[length];
            int i10 = length - 1;
            int i11 = 0;
            while (i11 < length) {
                this.f15576w[i11] = m15234f(i11, this.f15559f[i11], this.f15558e[i11], i11 == i10);
                i11++;
            }
            if (this.f15572s == null && !this.f15567n) {
                throw AbstractC9067h0.m15292n(this.f15556c, "Missing either @%s URL or @Url parameter.", this.f15568o);
            }
            boolean z9 = this.f15570q;
            if (!z9 && !this.f15571r && !this.f15569p && this.f15562i) {
                throw AbstractC9067h0.m15292n(this.f15556c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z9 && !this.f15560g) {
                throw AbstractC9067h0.m15292n(this.f15556c, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f15571r || this.f15561h) {
                return new C9055b0(this);
            }
            throw AbstractC9067h0.m15292n(this.f15556c, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        /* renamed from: c */
        public final C0054q m15231c(String[] strArr, boolean z9) {
            C0054q.a aVar = new C0054q.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw AbstractC9067h0.m15292n(this.f15556c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f15574u = C0057t.m273e(strTrim);
                    } catch (IllegalArgumentException e10) {
                        throw AbstractC9067h0.m15293o(this.f15556c, e10, "Malformed content type: %s", strTrim);
                    }
                } else if (z9) {
                    aVar.m190e(strSubstring, strTrim);
                } else {
                    aVar.m186a(strSubstring, strTrim);
                }
            }
            return aVar.m191f();
        }

        /* renamed from: d */
        public final void m15232d(String str, String str2, boolean z9) {
            String str3 = this.f15568o;
            if (str3 != null) {
                throw AbstractC9067h0.m15292n(this.f15556c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f15568o = str;
            this.f15569p = z9;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f15552y.matcher(strSubstring).find()) {
                    throw AbstractC9067h0.m15292n(this.f15556c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f15572s = str2;
            this.f15575v = m15229h(str2);
        }

        /* renamed from: e */
        public final void m15233e(Annotation annotation) {
            if (annotation instanceof InterfaceC9598b) {
                m15232d("DELETE", ((InterfaceC9598b) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC9602f) {
                m15232d("GET", ((InterfaceC9602f) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC9603g) {
                m15232d("HEAD", ((InterfaceC9603g) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC9610n) {
                m15232d("PATCH", ((InterfaceC9610n) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC9611o) {
                m15232d("POST", ((InterfaceC9611o) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC9612p) {
                m15232d("PUT", ((InterfaceC9612p) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC9609m) {
                m15232d("OPTIONS", ((InterfaceC9609m) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC9604h) {
                InterfaceC9604h interfaceC9604h = (InterfaceC9604h) annotation;
                m15232d(interfaceC9604h.method(), interfaceC9604h.path(), interfaceC9604h.hasBody());
                return;
            }
            if (annotation instanceof InterfaceC9607k) {
                InterfaceC9607k interfaceC9607k = (InterfaceC9607k) annotation;
                String[] strArrValue = interfaceC9607k.value();
                if (strArrValue.length == 0) {
                    throw AbstractC9067h0.m15292n(this.f15556c, "@Headers annotation is empty.", new Object[0]);
                }
                this.f15573t = m15231c(strArrValue, interfaceC9607k.allowUnsafeNonAsciiValues());
                return;
            }
            if (annotation instanceof InterfaceC9608l) {
                if (this.f15570q) {
                    throw AbstractC9067h0.m15292n(this.f15556c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f15571r = true;
            } else if (annotation instanceof InterfaceC9601e) {
                if (this.f15571r) {
                    throw AbstractC9067h0.m15292n(this.f15556c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f15570q = true;
            }
        }

        /* renamed from: f */
        public final AbstractC9081v m15234f(int i10, Type type, Annotation[] annotationArr, boolean z9) {
            AbstractC9081v abstractC9081v;
            if (annotationArr != null) {
                abstractC9081v = null;
                for (Annotation annotation : annotationArr) {
                    AbstractC9081v abstractC9081vM15235g = m15235g(i10, type, annotationArr, annotation);
                    if (abstractC9081vM15235g != null) {
                        if (abstractC9081v != null) {
                            throw AbstractC9067h0.m15294p(this.f15556c, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        abstractC9081v = abstractC9081vM15235g;
                    }
                }
            } else {
                abstractC9081v = null;
            }
            if (abstractC9081v != null) {
                return abstractC9081v;
            }
            if (z9) {
                try {
                    if (AbstractC9067h0.m15286h(type) == Continuation.class) {
                        this.f15577x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw AbstractC9067h0.m15294p(this.f15556c, i10, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: g */
        public final AbstractC9081v m15235g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof InterfaceC9621y) {
                m15237j(i10, type);
                if (this.f15567n) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f15563j) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f15564k) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f15565l) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f15566m) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f15572s != null) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "@Url cannot be used with @%s URL", this.f15568o);
                }
                this.f15567n = true;
                if (type == C0055r.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new AbstractC9081v.p(this.f15556c, i10);
                }
                throw AbstractC9067h0.m15294p(this.f15556c, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof InterfaceC9615s) {
                m15237j(i10, type);
                if (this.f15564k) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f15565l) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f15566m) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f15567n) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f15572s == null) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "@Path can only be used with relative url on @%s", this.f15568o);
                }
                this.f15563j = true;
                InterfaceC9615s interfaceC9615s = (InterfaceC9615s) annotation;
                String strValue = interfaceC9615s.value();
                m15236i(i10, strValue);
                return new AbstractC9081v.k(this.f15556c, i10, strValue, this.f15554a.m15256i(type, annotationArr), interfaceC9615s.encoded());
            }
            if (annotation instanceof InterfaceC9616t) {
                m15237j(i10, type);
                InterfaceC9616t interfaceC9616t = (InterfaceC9616t) annotation;
                String strValue2 = interfaceC9616t.value();
                boolean zEncoded = interfaceC9616t.encoded();
                Class clsM15286h = AbstractC9067h0.m15286h(type);
                this.f15564k = true;
                if (!Iterable.class.isAssignableFrom(clsM15286h)) {
                    if (!clsM15286h.isArray()) {
                        return new AbstractC9081v.l(strValue2, this.f15554a.m15256i(type, annotationArr), zEncoded);
                    }
                    return new AbstractC9081v.l(strValue2, this.f15554a.m15256i(m15228a(clsM15286h.getComponentType()), annotationArr), zEncoded).m15323b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC9081v.l(strValue2, this.f15554a.m15256i(AbstractC9067h0.m15285g(0, (ParameterizedType) type), annotationArr), zEncoded).m15324c();
                }
                throw AbstractC9067h0.m15294p(this.f15556c, i10, clsM15286h.getSimpleName() + " must include generic type (e.g., " + clsM15286h.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC9618v) {
                m15237j(i10, type);
                boolean zEncoded2 = ((InterfaceC9618v) annotation).encoded();
                Class clsM15286h2 = AbstractC9067h0.m15286h(type);
                this.f15565l = true;
                if (!Iterable.class.isAssignableFrom(clsM15286h2)) {
                    if (!clsM15286h2.isArray()) {
                        return new AbstractC9081v.n(this.f15554a.m15256i(type, annotationArr), zEncoded2);
                    }
                    return new AbstractC9081v.n(this.f15554a.m15256i(m15228a(clsM15286h2.getComponentType()), annotationArr), zEncoded2).m15323b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC9081v.n(this.f15554a.m15256i(AbstractC9067h0.m15285g(0, (ParameterizedType) type), annotationArr), zEncoded2).m15324c();
                }
                throw AbstractC9067h0.m15294p(this.f15556c, i10, clsM15286h2.getSimpleName() + " must include generic type (e.g., " + clsM15286h2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC9617u) {
                m15237j(i10, type);
                Class clsM15286h3 = AbstractC9067h0.m15286h(type);
                this.f15566m = true;
                if (!Map.class.isAssignableFrom(clsM15286h3)) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeM15287i = AbstractC9067h0.m15287i(type, clsM15286h3, Map.class);
                if (!(typeM15287i instanceof ParameterizedType)) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeM15287i;
                Type typeM15285g = AbstractC9067h0.m15285g(0, parameterizedType);
                if (String.class == typeM15285g) {
                    return new AbstractC9081v.m(this.f15556c, i10, this.f15554a.m15256i(AbstractC9067h0.m15285g(1, parameterizedType), annotationArr), ((InterfaceC9617u) annotation).encoded());
                }
                throw AbstractC9067h0.m15294p(this.f15556c, i10, "@QueryMap keys must be of type String: " + typeM15285g, new Object[0]);
            }
            if (annotation instanceof InterfaceC9605i) {
                m15237j(i10, type);
                InterfaceC9605i interfaceC9605i = (InterfaceC9605i) annotation;
                String strValue3 = interfaceC9605i.value();
                Class clsM15286h4 = AbstractC9067h0.m15286h(type);
                if (!Iterable.class.isAssignableFrom(clsM15286h4)) {
                    if (!clsM15286h4.isArray()) {
                        return new AbstractC9081v.f(strValue3, this.f15554a.m15256i(type, annotationArr), interfaceC9605i.allowUnsafeNonAsciiValues());
                    }
                    return new AbstractC9081v.f(strValue3, this.f15554a.m15256i(m15228a(clsM15286h4.getComponentType()), annotationArr), interfaceC9605i.allowUnsafeNonAsciiValues()).m15323b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC9081v.f(strValue3, this.f15554a.m15256i(AbstractC9067h0.m15285g(0, (ParameterizedType) type), annotationArr), interfaceC9605i.allowUnsafeNonAsciiValues()).m15324c();
                }
                throw AbstractC9067h0.m15294p(this.f15556c, i10, clsM15286h4.getSimpleName() + " must include generic type (e.g., " + clsM15286h4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC9606j) {
                if (type == C0054q.class) {
                    return new AbstractC9081v.h(this.f15556c, i10);
                }
                m15237j(i10, type);
                Class clsM15286h5 = AbstractC9067h0.m15286h(type);
                if (!Map.class.isAssignableFrom(clsM15286h5)) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                }
                Type typeM15287i2 = AbstractC9067h0.m15287i(type, clsM15286h5, Map.class);
                if (!(typeM15287i2 instanceof ParameterizedType)) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeM15287i2;
                Type typeM15285g2 = AbstractC9067h0.m15285g(0, parameterizedType2);
                if (String.class == typeM15285g2) {
                    return new AbstractC9081v.g(this.f15556c, i10, this.f15554a.m15256i(AbstractC9067h0.m15285g(1, parameterizedType2), annotationArr), ((InterfaceC9606j) annotation).allowUnsafeNonAsciiValues());
                }
                throw AbstractC9067h0.m15294p(this.f15556c, i10, "@HeaderMap keys must be of type String: " + typeM15285g2, new Object[0]);
            }
            if (annotation instanceof InterfaceC9599c) {
                m15237j(i10, type);
                if (!this.f15570q) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                InterfaceC9599c interfaceC9599c = (InterfaceC9599c) annotation;
                String strValue4 = interfaceC9599c.value();
                boolean zEncoded3 = interfaceC9599c.encoded();
                this.f15560g = true;
                Class clsM15286h6 = AbstractC9067h0.m15286h(type);
                if (!Iterable.class.isAssignableFrom(clsM15286h6)) {
                    if (!clsM15286h6.isArray()) {
                        return new AbstractC9081v.d(strValue4, this.f15554a.m15256i(type, annotationArr), zEncoded3);
                    }
                    return new AbstractC9081v.d(strValue4, this.f15554a.m15256i(m15228a(clsM15286h6.getComponentType()), annotationArr), zEncoded3).m15323b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC9081v.d(strValue4, this.f15554a.m15256i(AbstractC9067h0.m15285g(0, (ParameterizedType) type), annotationArr), zEncoded3).m15324c();
                }
                throw AbstractC9067h0.m15294p(this.f15556c, i10, clsM15286h6.getSimpleName() + " must include generic type (e.g., " + clsM15286h6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC9600d) {
                m15237j(i10, type);
                if (!this.f15570q) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class clsM15286h7 = AbstractC9067h0.m15286h(type);
                if (!Map.class.isAssignableFrom(clsM15286h7)) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeM15287i3 = AbstractC9067h0.m15287i(type, clsM15286h7, Map.class);
                if (!(typeM15287i3 instanceof ParameterizedType)) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeM15287i3;
                Type typeM15285g3 = AbstractC9067h0.m15285g(0, parameterizedType3);
                if (String.class == typeM15285g3) {
                    InterfaceC9066h interfaceC9066hM15256i = this.f15554a.m15256i(AbstractC9067h0.m15285g(1, parameterizedType3), annotationArr);
                    this.f15560g = true;
                    return new AbstractC9081v.e(this.f15556c, i10, interfaceC9066hM15256i, ((InterfaceC9600d) annotation).encoded());
                }
                throw AbstractC9067h0.m15294p(this.f15556c, i10, "@FieldMap keys must be of type String: " + typeM15285g3, new Object[0]);
            }
            if (!(annotation instanceof InterfaceC9613q)) {
                if (annotation instanceof InterfaceC9614r) {
                    m15237j(i10, type);
                    if (!this.f15571r) {
                        throw AbstractC9067h0.m15294p(this.f15556c, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f15561h = true;
                    Class clsM15286h8 = AbstractC9067h0.m15286h(type);
                    if (!Map.class.isAssignableFrom(clsM15286h8)) {
                        throw AbstractC9067h0.m15294p(this.f15556c, i10, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeM15287i4 = AbstractC9067h0.m15287i(type, clsM15286h8, Map.class);
                    if (!(typeM15287i4 instanceof ParameterizedType)) {
                        throw AbstractC9067h0.m15294p(this.f15556c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeM15287i4;
                    Type typeM15285g4 = AbstractC9067h0.m15285g(0, parameterizedType4);
                    if (String.class == typeM15285g4) {
                        Type typeM15285g5 = AbstractC9067h0.m15285g(1, parameterizedType4);
                        if (C0058u.c.class.isAssignableFrom(AbstractC9067h0.m15286h(typeM15285g5))) {
                            throw AbstractC9067h0.m15294p(this.f15556c, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new AbstractC9081v.j(this.f15556c, i10, this.f15554a.m15254g(typeM15285g5, annotationArr, this.f15557d), ((InterfaceC9614r) annotation).encoding());
                    }
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "@PartMap keys must be of type String: " + typeM15285g4, new Object[0]);
                }
                if (annotation instanceof InterfaceC9597a) {
                    m15237j(i10, type);
                    if (this.f15570q || this.f15571r) {
                        throw AbstractC9067h0.m15294p(this.f15556c, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f15562i) {
                        throw AbstractC9067h0.m15294p(this.f15556c, i10, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        InterfaceC9066h interfaceC9066hM15254g = this.f15554a.m15254g(type, annotationArr, this.f15557d);
                        this.f15562i = true;
                        return new AbstractC9081v.c(this.f15556c, i10, interfaceC9066hM15254g);
                    } catch (RuntimeException e10) {
                        throw AbstractC9067h0.m15295q(this.f15556c, e10, i10, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof InterfaceC9620x)) {
                    return null;
                }
                m15237j(i10, type);
                Class clsM15228a = m15228a(AbstractC9067h0.m15286h(type));
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    AbstractC9081v abstractC9081v = this.f15576w[i11];
                    if ((abstractC9081v instanceof AbstractC9081v.q) && ((AbstractC9081v.q) abstractC9081v).f15706a.equals(clsM15228a)) {
                        throw AbstractC9067h0.m15294p(this.f15556c, i10, "@Tag type " + clsM15228a.getName() + " is duplicate of " + AbstractC9082w.f15708b.mo15332a(this.f15556c, i11) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new AbstractC9081v.q(clsM15228a);
            }
            m15237j(i10, type);
            if (!this.f15571r) {
                throw AbstractC9067h0.m15294p(this.f15556c, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            InterfaceC9613q interfaceC9613q = (InterfaceC9613q) annotation;
            this.f15561h = true;
            String strValue5 = interfaceC9613q.value();
            Class clsM15286h9 = AbstractC9067h0.m15286h(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsM15286h9)) {
                    if (clsM15286h9.isArray()) {
                        if (C0058u.c.class.isAssignableFrom(clsM15286h9.getComponentType())) {
                            return AbstractC9081v.o.f15703a.m15323b();
                        }
                        throw AbstractC9067h0.m15294p(this.f15556c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (C0058u.c.class.isAssignableFrom(clsM15286h9)) {
                        return AbstractC9081v.o.f15703a;
                    }
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (C0058u.c.class.isAssignableFrom(AbstractC9067h0.m15286h(AbstractC9067h0.m15285g(0, (ParameterizedType) type)))) {
                        return AbstractC9081v.o.f15703a.m15324c();
                    }
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw AbstractC9067h0.m15294p(this.f15556c, i10, clsM15286h9.getSimpleName() + " must include generic type (e.g., " + clsM15286h9.getSimpleName() + "<String>)", new Object[0]);
            }
            C0054q c0054qM179d = C0054q.m179d(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", interfaceC9613q.encoding());
            if (!Iterable.class.isAssignableFrom(clsM15286h9)) {
                if (!clsM15286h9.isArray()) {
                    if (C0058u.c.class.isAssignableFrom(clsM15286h9)) {
                        throw AbstractC9067h0.m15294p(this.f15556c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new AbstractC9081v.i(this.f15556c, i10, c0054qM179d, this.f15554a.m15254g(type, annotationArr, this.f15557d));
                }
                Class clsM15228a2 = m15228a(clsM15286h9.getComponentType());
                if (C0058u.c.class.isAssignableFrom(clsM15228a2)) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new AbstractC9081v.i(this.f15556c, i10, c0054qM179d, this.f15554a.m15254g(clsM15228a2, annotationArr, this.f15557d)).m15323b();
            }
            if (type instanceof ParameterizedType) {
                Type typeM15285g6 = AbstractC9067h0.m15285g(0, (ParameterizedType) type);
                if (C0058u.c.class.isAssignableFrom(AbstractC9067h0.m15286h(typeM15285g6))) {
                    throw AbstractC9067h0.m15294p(this.f15556c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new AbstractC9081v.i(this.f15556c, i10, c0054qM179d, this.f15554a.m15254g(typeM15285g6, annotationArr, this.f15557d)).m15324c();
            }
            throw AbstractC9067h0.m15294p(this.f15556c, i10, clsM15286h9.getSimpleName() + " must include generic type (e.g., " + clsM15286h9.getSimpleName() + "<String>)", new Object[0]);
        }

        /* renamed from: i */
        public final void m15236i(int i10, String str) {
            if (!f15553z.matcher(str).matches()) {
                throw AbstractC9067h0.m15294p(this.f15556c, i10, "@Path parameter name must match %s. Found: %s", f15552y.pattern(), str);
            }
            if (!this.f15575v.contains(str)) {
                throw AbstractC9067h0.m15294p(this.f15556c, i10, "URL \"%s\" does not contain \"{%s}\".", this.f15572s, str);
            }
        }

        /* renamed from: j */
        public final void m15237j(int i10, Type type) {
            if (AbstractC9067h0.m15288j(type)) {
                throw AbstractC9067h0.m15294p(this.f15556c, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public C9055b0(a aVar) {
        this.f15540a = aVar.f15555b;
        this.f15541b = aVar.f15556c;
        this.f15542c = aVar.f15554a.f15583c;
        this.f15543d = aVar.f15568o;
        this.f15544e = aVar.f15572s;
        this.f15545f = aVar.f15573t;
        this.f15546g = aVar.f15574u;
        this.f15547h = aVar.f15569p;
        this.f15548i = aVar.f15570q;
        this.f15549j = aVar.f15571r;
        this.f15550k = aVar.f15576w;
        this.f15551l = aVar.f15577x;
    }

    /* renamed from: b */
    public static C9055b0 m15226b(C9059d0 c9059d0, Class cls, Method method) {
        return new a(c9059d0, cls, method).m15230b();
    }

    /* renamed from: a */
    public C0060w m15227a(Object obj, Object[] objArr) {
        AbstractC9081v[] abstractC9081vArr = this.f15550k;
        int length = objArr.length;
        if (length != abstractC9081vArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + abstractC9081vArr.length + ")");
        }
        C9053a0 c9053a0 = new C9053a0(this.f15543d, this.f15542c, this.f15544e, this.f15545f, this.f15546g, this.f15547h, this.f15548i, this.f15549j);
        if (this.f15551l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            abstractC9081vArr[i10].mo15322a(c9053a0, objArr[i10]);
        }
        return c9053a0.m15215k().m394m(C9078s.class, new C9078s(this.f15540a, obj, this.f15541b, arrayList)).m384b();
    }
}
