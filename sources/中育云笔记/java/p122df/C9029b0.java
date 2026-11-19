package p122df;

import anet.channel.request.Request;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import gf.InterfaceC9408a;
import gf.InterfaceC9409b;
import gf.InterfaceC9410c;
import gf.InterfaceC9411d;
import gf.InterfaceC9412e;
import gf.InterfaceC9413f;
import gf.InterfaceC9414g;
import gf.InterfaceC9415h;
import gf.InterfaceC9416i;
import gf.InterfaceC9417j;
import gf.InterfaceC9418k;
import gf.InterfaceC9419l;
import gf.InterfaceC9420m;
import gf.InterfaceC9421n;
import gf.InterfaceC9422o;
import gf.InterfaceC9423p;
import gf.InterfaceC9424q;
import gf.InterfaceC9425r;
import gf.InterfaceC9426s;
import gf.InterfaceC9427t;
import gf.InterfaceC9428u;
import gf.InterfaceC9429v;
import gf.InterfaceC9431x;
import gf.InterfaceC9432y;
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
import je.C9737q;
import je.C9738r;
import je.C9740t;
import je.C9741u;
import je.C9743w;
import p122df.AbstractC9055v;
import vc.InterfaceC11588c;

/* renamed from: df.b0 */
/* loaded from: classes6.dex */
public final class C9029b0 {

    /* renamed from: a */
    public final Class f21043a;

    /* renamed from: b */
    public final Method f21044b;

    /* renamed from: c */
    public final C9738r f21045c;

    /* renamed from: d */
    public final String f21046d;

    /* renamed from: e */
    public final String f21047e;

    /* renamed from: f */
    public final C9737q f21048f;

    /* renamed from: g */
    public final C9740t f21049g;

    /* renamed from: h */
    public final boolean f21050h;

    /* renamed from: i */
    public final boolean f21051i;

    /* renamed from: j */
    public final boolean f21052j;

    /* renamed from: k */
    public final AbstractC9055v[] f21053k;

    /* renamed from: l */
    public final boolean f21054l;

    /* renamed from: df.b0$a */
    public static final class a {

        /* renamed from: y */
        public static final Pattern f21055y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: z */
        public static final Pattern f21056z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final C9033d0 f21057a;

        /* renamed from: b */
        public final Class f21058b;

        /* renamed from: c */
        public final Method f21059c;

        /* renamed from: d */
        public final Annotation[] f21060d;

        /* renamed from: e */
        public final Annotation[][] f21061e;

        /* renamed from: f */
        public final Type[] f21062f;

        /* renamed from: g */
        public boolean f21063g;

        /* renamed from: h */
        public boolean f21064h;

        /* renamed from: i */
        public boolean f21065i;

        /* renamed from: j */
        public boolean f21066j;

        /* renamed from: k */
        public boolean f21067k;

        /* renamed from: l */
        public boolean f21068l;

        /* renamed from: m */
        public boolean f21069m;

        /* renamed from: n */
        public boolean f21070n;

        /* renamed from: o */
        public String f21071o;

        /* renamed from: p */
        public boolean f21072p;

        /* renamed from: q */
        public boolean f21073q;

        /* renamed from: r */
        public boolean f21074r;

        /* renamed from: s */
        public String f21075s;

        /* renamed from: t */
        public C9737q f21076t;

        /* renamed from: u */
        public C9740t f21077u;

        /* renamed from: v */
        public Set f21078v;

        /* renamed from: w */
        public AbstractC9055v[] f21079w;

        /* renamed from: x */
        public boolean f21080x;

        public a(C9033d0 c9033d0, Class cls, Method method) {
            this.f21057a = c9033d0;
            this.f21058b = cls;
            this.f21059c = method;
            this.f21060d = method.getAnnotations();
            this.f21062f = method.getGenericParameterTypes();
            this.f21061e = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class m17690a(Class cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: h */
        public static Set m17691h(String str) {
            Matcher matcher = f21055y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: b */
        public C9029b0 m17692b() {
            for (Annotation annotation : this.f21060d) {
                m17695e(annotation);
            }
            if (this.f21071o == null) {
                throw AbstractC9041h0.m17752n(this.f21059c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f21072p) {
                if (this.f21074r) {
                    throw AbstractC9041h0.m17752n(this.f21059c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f21073q) {
                    throw AbstractC9041h0.m17752n(this.f21059c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f21061e.length;
            this.f21079w = new AbstractC9055v[length];
            int i10 = length - 1;
            int i11 = 0;
            while (i11 < length) {
                this.f21079w[i11] = m17696f(i11, this.f21062f[i11], this.f21061e[i11], i11 == i10);
                i11++;
            }
            if (this.f21075s == null && !this.f21070n) {
                throw AbstractC9041h0.m17752n(this.f21059c, "Missing either @%s URL or @Url parameter.", this.f21071o);
            }
            boolean z10 = this.f21073q;
            if (!z10 && !this.f21074r && !this.f21072p && this.f21065i) {
                throw AbstractC9041h0.m17752n(this.f21059c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z10 && !this.f21063g) {
                throw AbstractC9041h0.m17752n(this.f21059c, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f21074r || this.f21064h) {
                return new C9029b0(this);
            }
            throw AbstractC9041h0.m17752n(this.f21059c, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        /* renamed from: c */
        public final C9737q m17693c(String[] strArr, boolean z10) {
            C9737q.a aVar = new C9737q.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw AbstractC9041h0.m17752n(this.f21059c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f21077u = C9740t.m19482e(strTrim);
                    } catch (IllegalArgumentException e10) {
                        throw AbstractC9041h0.m17753o(this.f21059c, e10, "Malformed content type: %s", strTrim);
                    }
                } else if (z10) {
                    aVar.m19399e(strSubstring, strTrim);
                } else {
                    aVar.m19395a(strSubstring, strTrim);
                }
            }
            return aVar.m19400f();
        }

        /* renamed from: d */
        public final void m17694d(String str, String str2, boolean z10) {
            String str3 = this.f21071o;
            if (str3 != null) {
                throw AbstractC9041h0.m17752n(this.f21059c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f21071o = str;
            this.f21072p = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f21055y.matcher(strSubstring).find()) {
                    throw AbstractC9041h0.m17752n(this.f21059c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f21075s = str2;
            this.f21078v = m17691h(str2);
        }

        /* renamed from: e */
        public final void m17695e(Annotation annotation) {
            if (annotation instanceof InterfaceC9409b) {
                m17694d(Request.Method.DELETE, ((InterfaceC9409b) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC9413f) {
                m17694d("GET", ((InterfaceC9413f) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC9414g) {
                m17694d(Request.Method.HEAD, ((InterfaceC9414g) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC9421n) {
                m17694d("PATCH", ((InterfaceC9421n) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC9422o) {
                m17694d("POST", ((InterfaceC9422o) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC9423p) {
                m17694d(Request.Method.PUT, ((InterfaceC9423p) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC9420m) {
                m17694d(Request.Method.OPTION, ((InterfaceC9420m) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC9415h) {
                InterfaceC9415h interfaceC9415h = (InterfaceC9415h) annotation;
                m17694d(interfaceC9415h.method(), interfaceC9415h.path(), interfaceC9415h.hasBody());
                return;
            }
            if (annotation instanceof InterfaceC9418k) {
                InterfaceC9418k interfaceC9418k = (InterfaceC9418k) annotation;
                String[] strArrValue = interfaceC9418k.value();
                if (strArrValue.length == 0) {
                    throw AbstractC9041h0.m17752n(this.f21059c, "@Headers annotation is empty.", new Object[0]);
                }
                this.f21076t = m17693c(strArrValue, interfaceC9418k.allowUnsafeNonAsciiValues());
                return;
            }
            if (annotation instanceof InterfaceC9419l) {
                if (this.f21073q) {
                    throw AbstractC9041h0.m17752n(this.f21059c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f21074r = true;
            } else if (annotation instanceof InterfaceC9412e) {
                if (this.f21074r) {
                    throw AbstractC9041h0.m17752n(this.f21059c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f21073q = true;
            }
        }

        /* renamed from: f */
        public final AbstractC9055v m17696f(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            AbstractC9055v abstractC9055v;
            if (annotationArr != null) {
                abstractC9055v = null;
                for (Annotation annotation : annotationArr) {
                    AbstractC9055v abstractC9055vM17697g = m17697g(i10, type, annotationArr, annotation);
                    if (abstractC9055vM17697g != null) {
                        if (abstractC9055v != null) {
                            throw AbstractC9041h0.m17754p(this.f21059c, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        abstractC9055v = abstractC9055vM17697g;
                    }
                }
            } else {
                abstractC9055v = null;
            }
            if (abstractC9055v != null) {
                return abstractC9055v;
            }
            if (z10) {
                try {
                    if (AbstractC9041h0.m17746h(type) == InterfaceC11588c.class) {
                        this.f21080x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw AbstractC9041h0.m17754p(this.f21059c, i10, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: g */
        public final AbstractC9055v m17697g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof InterfaceC9432y) {
                m17699j(i10, type);
                if (this.f21070n) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f21066j) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f21067k) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f21068l) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f21069m) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f21075s != null) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "@Url cannot be used with @%s URL", this.f21071o);
                }
                this.f21070n = true;
                if (type == C9738r.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new AbstractC9055v.p(this.f21059c, i10);
                }
                throw AbstractC9041h0.m17754p(this.f21059c, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof InterfaceC9426s) {
                m17699j(i10, type);
                if (this.f21067k) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f21068l) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f21069m) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f21070n) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f21075s == null) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "@Path can only be used with relative url on @%s", this.f21071o);
                }
                this.f21066j = true;
                InterfaceC9426s interfaceC9426s = (InterfaceC9426s) annotation;
                String strValue = interfaceC9426s.value();
                m17698i(i10, strValue);
                return new AbstractC9055v.k(this.f21059c, i10, strValue, this.f21057a.m17719i(type, annotationArr), interfaceC9426s.encoded());
            }
            if (annotation instanceof InterfaceC9427t) {
                m17699j(i10, type);
                InterfaceC9427t interfaceC9427t = (InterfaceC9427t) annotation;
                String strValue2 = interfaceC9427t.value();
                boolean zEncoded = interfaceC9427t.encoded();
                Class clsM17746h = AbstractC9041h0.m17746h(type);
                this.f21067k = true;
                if (!Iterable.class.isAssignableFrom(clsM17746h)) {
                    if (!clsM17746h.isArray()) {
                        return new AbstractC9055v.l(strValue2, this.f21057a.m17719i(type, annotationArr), zEncoded);
                    }
                    return new AbstractC9055v.l(strValue2, this.f21057a.m17719i(m17690a(clsM17746h.getComponentType()), annotationArr), zEncoded).m17783b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC9055v.l(strValue2, this.f21057a.m17719i(AbstractC9041h0.m17745g(0, (ParameterizedType) type), annotationArr), zEncoded).m17784c();
                }
                throw AbstractC9041h0.m17754p(this.f21059c, i10, clsM17746h.getSimpleName() + " must include generic type (e.g., " + clsM17746h.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC9429v) {
                m17699j(i10, type);
                boolean zEncoded2 = ((InterfaceC9429v) annotation).encoded();
                Class clsM17746h2 = AbstractC9041h0.m17746h(type);
                this.f21068l = true;
                if (!Iterable.class.isAssignableFrom(clsM17746h2)) {
                    if (!clsM17746h2.isArray()) {
                        return new AbstractC9055v.n(this.f21057a.m17719i(type, annotationArr), zEncoded2);
                    }
                    return new AbstractC9055v.n(this.f21057a.m17719i(m17690a(clsM17746h2.getComponentType()), annotationArr), zEncoded2).m17783b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC9055v.n(this.f21057a.m17719i(AbstractC9041h0.m17745g(0, (ParameterizedType) type), annotationArr), zEncoded2).m17784c();
                }
                throw AbstractC9041h0.m17754p(this.f21059c, i10, clsM17746h2.getSimpleName() + " must include generic type (e.g., " + clsM17746h2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC9428u) {
                m17699j(i10, type);
                Class clsM17746h3 = AbstractC9041h0.m17746h(type);
                this.f21069m = true;
                if (!Map.class.isAssignableFrom(clsM17746h3)) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeM17747i = AbstractC9041h0.m17747i(type, clsM17746h3, Map.class);
                if (!(typeM17747i instanceof ParameterizedType)) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeM17747i;
                Type typeM17745g = AbstractC9041h0.m17745g(0, parameterizedType);
                if (String.class == typeM17745g) {
                    return new AbstractC9055v.m(this.f21059c, i10, this.f21057a.m17719i(AbstractC9041h0.m17745g(1, parameterizedType), annotationArr), ((InterfaceC9428u) annotation).encoded());
                }
                throw AbstractC9041h0.m17754p(this.f21059c, i10, "@QueryMap keys must be of type String: " + typeM17745g, new Object[0]);
            }
            if (annotation instanceof InterfaceC9416i) {
                m17699j(i10, type);
                InterfaceC9416i interfaceC9416i = (InterfaceC9416i) annotation;
                String strValue3 = interfaceC9416i.value();
                Class clsM17746h4 = AbstractC9041h0.m17746h(type);
                if (!Iterable.class.isAssignableFrom(clsM17746h4)) {
                    if (!clsM17746h4.isArray()) {
                        return new AbstractC9055v.f(strValue3, this.f21057a.m17719i(type, annotationArr), interfaceC9416i.allowUnsafeNonAsciiValues());
                    }
                    return new AbstractC9055v.f(strValue3, this.f21057a.m17719i(m17690a(clsM17746h4.getComponentType()), annotationArr), interfaceC9416i.allowUnsafeNonAsciiValues()).m17783b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC9055v.f(strValue3, this.f21057a.m17719i(AbstractC9041h0.m17745g(0, (ParameterizedType) type), annotationArr), interfaceC9416i.allowUnsafeNonAsciiValues()).m17784c();
                }
                throw AbstractC9041h0.m17754p(this.f21059c, i10, clsM17746h4.getSimpleName() + " must include generic type (e.g., " + clsM17746h4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC9417j) {
                if (type == C9737q.class) {
                    return new AbstractC9055v.h(this.f21059c, i10);
                }
                m17699j(i10, type);
                Class clsM17746h5 = AbstractC9041h0.m17746h(type);
                if (!Map.class.isAssignableFrom(clsM17746h5)) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                }
                Type typeM17747i2 = AbstractC9041h0.m17747i(type, clsM17746h5, Map.class);
                if (!(typeM17747i2 instanceof ParameterizedType)) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeM17747i2;
                Type typeM17745g2 = AbstractC9041h0.m17745g(0, parameterizedType2);
                if (String.class == typeM17745g2) {
                    return new AbstractC9055v.g(this.f21059c, i10, this.f21057a.m17719i(AbstractC9041h0.m17745g(1, parameterizedType2), annotationArr), ((InterfaceC9417j) annotation).allowUnsafeNonAsciiValues());
                }
                throw AbstractC9041h0.m17754p(this.f21059c, i10, "@HeaderMap keys must be of type String: " + typeM17745g2, new Object[0]);
            }
            if (annotation instanceof InterfaceC9410c) {
                m17699j(i10, type);
                if (!this.f21073q) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                InterfaceC9410c interfaceC9410c = (InterfaceC9410c) annotation;
                String strValue4 = interfaceC9410c.value();
                boolean zEncoded3 = interfaceC9410c.encoded();
                this.f21063g = true;
                Class clsM17746h6 = AbstractC9041h0.m17746h(type);
                if (!Iterable.class.isAssignableFrom(clsM17746h6)) {
                    if (!clsM17746h6.isArray()) {
                        return new AbstractC9055v.d(strValue4, this.f21057a.m17719i(type, annotationArr), zEncoded3);
                    }
                    return new AbstractC9055v.d(strValue4, this.f21057a.m17719i(m17690a(clsM17746h6.getComponentType()), annotationArr), zEncoded3).m17783b();
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC9055v.d(strValue4, this.f21057a.m17719i(AbstractC9041h0.m17745g(0, (ParameterizedType) type), annotationArr), zEncoded3).m17784c();
                }
                throw AbstractC9041h0.m17754p(this.f21059c, i10, clsM17746h6.getSimpleName() + " must include generic type (e.g., " + clsM17746h6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC9411d) {
                m17699j(i10, type);
                if (!this.f21073q) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class clsM17746h7 = AbstractC9041h0.m17746h(type);
                if (!Map.class.isAssignableFrom(clsM17746h7)) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeM17747i3 = AbstractC9041h0.m17747i(type, clsM17746h7, Map.class);
                if (!(typeM17747i3 instanceof ParameterizedType)) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeM17747i3;
                Type typeM17745g3 = AbstractC9041h0.m17745g(0, parameterizedType3);
                if (String.class == typeM17745g3) {
                    InterfaceC9040h interfaceC9040hM17719i = this.f21057a.m17719i(AbstractC9041h0.m17745g(1, parameterizedType3), annotationArr);
                    this.f21063g = true;
                    return new AbstractC9055v.e(this.f21059c, i10, interfaceC9040hM17719i, ((InterfaceC9411d) annotation).encoded());
                }
                throw AbstractC9041h0.m17754p(this.f21059c, i10, "@FieldMap keys must be of type String: " + typeM17745g3, new Object[0]);
            }
            if (!(annotation instanceof InterfaceC9424q)) {
                if (annotation instanceof InterfaceC9425r) {
                    m17699j(i10, type);
                    if (!this.f21074r) {
                        throw AbstractC9041h0.m17754p(this.f21059c, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f21064h = true;
                    Class clsM17746h8 = AbstractC9041h0.m17746h(type);
                    if (!Map.class.isAssignableFrom(clsM17746h8)) {
                        throw AbstractC9041h0.m17754p(this.f21059c, i10, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeM17747i4 = AbstractC9041h0.m17747i(type, clsM17746h8, Map.class);
                    if (!(typeM17747i4 instanceof ParameterizedType)) {
                        throw AbstractC9041h0.m17754p(this.f21059c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeM17747i4;
                    Type typeM17745g4 = AbstractC9041h0.m17745g(0, parameterizedType4);
                    if (String.class == typeM17745g4) {
                        Type typeM17745g5 = AbstractC9041h0.m17745g(1, parameterizedType4);
                        if (C9741u.c.class.isAssignableFrom(AbstractC9041h0.m17746h(typeM17745g5))) {
                            throw AbstractC9041h0.m17754p(this.f21059c, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new AbstractC9055v.j(this.f21059c, i10, this.f21057a.m17717g(typeM17745g5, annotationArr, this.f21060d), ((InterfaceC9425r) annotation).encoding());
                    }
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "@PartMap keys must be of type String: " + typeM17745g4, new Object[0]);
                }
                if (annotation instanceof InterfaceC9408a) {
                    m17699j(i10, type);
                    if (this.f21073q || this.f21074r) {
                        throw AbstractC9041h0.m17754p(this.f21059c, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f21065i) {
                        throw AbstractC9041h0.m17754p(this.f21059c, i10, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        InterfaceC9040h interfaceC9040hM17717g = this.f21057a.m17717g(type, annotationArr, this.f21060d);
                        this.f21065i = true;
                        return new AbstractC9055v.c(this.f21059c, i10, interfaceC9040hM17717g);
                    } catch (RuntimeException e10) {
                        throw AbstractC9041h0.m17755q(this.f21059c, e10, i10, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof InterfaceC9431x)) {
                    return null;
                }
                m17699j(i10, type);
                Class clsM17690a = m17690a(AbstractC9041h0.m17746h(type));
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    AbstractC9055v abstractC9055v = this.f21079w[i11];
                    if ((abstractC9055v instanceof AbstractC9055v.q) && ((AbstractC9055v.q) abstractC9055v).f21209a.equals(clsM17690a)) {
                        throw AbstractC9041h0.m17754p(this.f21059c, i10, "@Tag type " + clsM17690a.getName() + " is duplicate of " + AbstractC9056w.f21211b.mo17792a(this.f21059c, i11) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new AbstractC9055v.q(clsM17690a);
            }
            m17699j(i10, type);
            if (!this.f21074r) {
                throw AbstractC9041h0.m17754p(this.f21059c, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            InterfaceC9424q interfaceC9424q = (InterfaceC9424q) annotation;
            this.f21064h = true;
            String strValue5 = interfaceC9424q.value();
            Class clsM17746h9 = AbstractC9041h0.m17746h(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsM17746h9)) {
                    if (clsM17746h9.isArray()) {
                        if (C9741u.c.class.isAssignableFrom(clsM17746h9.getComponentType())) {
                            return AbstractC9055v.o.f21206a.m17783b();
                        }
                        throw AbstractC9041h0.m17754p(this.f21059c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (C9741u.c.class.isAssignableFrom(clsM17746h9)) {
                        return AbstractC9055v.o.f21206a;
                    }
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (C9741u.c.class.isAssignableFrom(AbstractC9041h0.m17746h(AbstractC9041h0.m17745g(0, (ParameterizedType) type)))) {
                        return AbstractC9055v.o.f21206a.m17784c();
                    }
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw AbstractC9041h0.m17754p(this.f21059c, i10, clsM17746h9.getSimpleName() + " must include generic type (e.g., " + clsM17746h9.getSimpleName() + "<String>)", new Object[0]);
            }
            C9737q c9737qM19388d = C9737q.m19388d(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", interfaceC9424q.encoding());
            if (!Iterable.class.isAssignableFrom(clsM17746h9)) {
                if (!clsM17746h9.isArray()) {
                    if (C9741u.c.class.isAssignableFrom(clsM17746h9)) {
                        throw AbstractC9041h0.m17754p(this.f21059c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new AbstractC9055v.i(this.f21059c, i10, c9737qM19388d, this.f21057a.m17717g(type, annotationArr, this.f21060d));
                }
                Class clsM17690a2 = m17690a(clsM17746h9.getComponentType());
                if (C9741u.c.class.isAssignableFrom(clsM17690a2)) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new AbstractC9055v.i(this.f21059c, i10, c9737qM19388d, this.f21057a.m17717g(clsM17690a2, annotationArr, this.f21060d)).m17783b();
            }
            if (type instanceof ParameterizedType) {
                Type typeM17745g6 = AbstractC9041h0.m17745g(0, (ParameterizedType) type);
                if (C9741u.c.class.isAssignableFrom(AbstractC9041h0.m17746h(typeM17745g6))) {
                    throw AbstractC9041h0.m17754p(this.f21059c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new AbstractC9055v.i(this.f21059c, i10, c9737qM19388d, this.f21057a.m17717g(typeM17745g6, annotationArr, this.f21060d)).m17784c();
            }
            throw AbstractC9041h0.m17754p(this.f21059c, i10, clsM17746h9.getSimpleName() + " must include generic type (e.g., " + clsM17746h9.getSimpleName() + "<String>)", new Object[0]);
        }

        /* renamed from: i */
        public final void m17698i(int i10, String str) {
            if (!f21056z.matcher(str).matches()) {
                throw AbstractC9041h0.m17754p(this.f21059c, i10, "@Path parameter name must match %s. Found: %s", f21055y.pattern(), str);
            }
            if (!this.f21078v.contains(str)) {
                throw AbstractC9041h0.m17754p(this.f21059c, i10, "URL \"%s\" does not contain \"{%s}\".", this.f21075s, str);
            }
        }

        /* renamed from: j */
        public final void m17699j(int i10, Type type) {
            if (AbstractC9041h0.m17748j(type)) {
                throw AbstractC9041h0.m17754p(this.f21059c, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public C9029b0(a aVar) {
        this.f21043a = aVar.f21058b;
        this.f21044b = aVar.f21059c;
        this.f21045c = aVar.f21057a.f21086c;
        this.f21046d = aVar.f21071o;
        this.f21047e = aVar.f21075s;
        this.f21048f = aVar.f21076t;
        this.f21049g = aVar.f21077u;
        this.f21050h = aVar.f21072p;
        this.f21051i = aVar.f21073q;
        this.f21052j = aVar.f21074r;
        this.f21053k = aVar.f21079w;
        this.f21054l = aVar.f21080x;
    }

    /* renamed from: b */
    public static C9029b0 m17688b(C9033d0 c9033d0, Class cls, Method method) {
        return new a(c9033d0, cls, method).m17692b();
    }

    /* renamed from: a */
    public C9743w m17689a(Object obj, Object[] objArr) {
        AbstractC9055v[] abstractC9055vArr = this.f21053k;
        int length = objArr.length;
        if (length != abstractC9055vArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + abstractC9055vArr.length + ")");
        }
        C9027a0 c9027a0 = new C9027a0(this.f21046d, this.f21045c, this.f21047e, this.f21048f, this.f21049g, this.f21050h, this.f21051i, this.f21052j);
        if (this.f21054l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            abstractC9055vArr[i10].mo17782a(c9027a0, objArr[i10]);
        }
        return c9027a0.m17679k().m19606n(C9052s.class, new C9052s(this.f21043a, obj, this.f21044b, arrayList)).m19595b();
    }
}
