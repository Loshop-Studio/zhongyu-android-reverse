package p080j3;

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
import p080j3.AbstractC3832s;
import p097m3.InterfaceC4367a;
import p097m3.InterfaceC4368b;
import p097m3.InterfaceC4369c;
import p097m3.InterfaceC4370d;
import p097m3.InterfaceC4371e;
import p097m3.InterfaceC4372f;
import p097m3.InterfaceC4373g;
import p097m3.InterfaceC4374h;
import p097m3.InterfaceC4375i;
import p097m3.InterfaceC4376j;
import p097m3.InterfaceC4377k;
import p097m3.InterfaceC4378l;
import p097m3.InterfaceC4379m;
import p097m3.InterfaceC4380n;
import p097m3.InterfaceC4381o;
import p097m3.InterfaceC4382p;
import p097m3.InterfaceC4383q;
import p097m3.InterfaceC4384r;
import p097m3.InterfaceC4385s;
import p097m3.InterfaceC4386t;
import p097m3.InterfaceC4387u;
import p097m3.InterfaceC4388v;
import p097m3.InterfaceC4390x;
import p097m3.InterfaceC4391y;
import p117r2.C4516s;
import p117r2.C4517t;
import p117r2.C4519v;
import p117r2.C4520w;
import p117r2.C4522y;

/* renamed from: j3.c0 */
/* loaded from: classes2.dex */
public final class C3810c0 {

    /* renamed from: a */
    public final Method f4575a;

    /* renamed from: b */
    public final C4517t f4576b;

    /* renamed from: c */
    public final String f4577c;

    /* renamed from: d */
    public final String f4578d;

    /* renamed from: e */
    public final C4516s f4579e;

    /* renamed from: f */
    public final C4519v f4580f;

    /* renamed from: g */
    public final boolean f4581g;

    /* renamed from: h */
    public final boolean f4582h;

    /* renamed from: i */
    public final boolean f4583i;

    /* renamed from: j */
    public final AbstractC3832s[] f4584j;

    /* renamed from: k */
    public final boolean f4585k;

    /* renamed from: j3.c0$a */
    public static final class a {

        /* renamed from: x */
        public static final Pattern f4586x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        public static final Pattern f4587y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final C3814e0 f4588a;

        /* renamed from: b */
        public final Method f4589b;

        /* renamed from: c */
        public final Annotation[] f4590c;

        /* renamed from: d */
        public final Annotation[][] f4591d;

        /* renamed from: e */
        public final Type[] f4592e;

        /* renamed from: f */
        public boolean f4593f;

        /* renamed from: g */
        public boolean f4594g;

        /* renamed from: h */
        public boolean f4595h;

        /* renamed from: i */
        public boolean f4596i;

        /* renamed from: j */
        public boolean f4597j;

        /* renamed from: k */
        public boolean f4598k;

        /* renamed from: l */
        public boolean f4599l;

        /* renamed from: m */
        public boolean f4600m;

        /* renamed from: n */
        public String f4601n;

        /* renamed from: o */
        public boolean f4602o;

        /* renamed from: p */
        public boolean f4603p;

        /* renamed from: q */
        public boolean f4604q;

        /* renamed from: r */
        public String f4605r;

        /* renamed from: s */
        public C4516s f4606s;

        /* renamed from: t */
        public C4519v f4607t;

        /* renamed from: u */
        public Set f4608u;

        /* renamed from: v */
        public AbstractC3832s[] f4609v;

        /* renamed from: w */
        public boolean f4610w;

        public a(C3814e0 c3814e0, Method method) {
            this.f4588a = c3814e0;
            this.f4589b = method;
            this.f4590c = method.getAnnotations();
            this.f4592e = method.getGenericParameterTypes();
            this.f4591d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class m5005a(Class cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: h */
        public static Set m5006h(String str) {
            Matcher matcher = f4586x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: b */
        public C3810c0 m5007b() {
            for (Annotation annotation : this.f4590c) {
                m5010e(annotation);
            }
            if (this.f4601n == null) {
                throw AbstractC3822i0.m5065m(this.f4589b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f4602o) {
                if (this.f4604q) {
                    throw AbstractC3822i0.m5065m(this.f4589b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f4603p) {
                    throw AbstractC3822i0.m5065m(this.f4589b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f4591d.length;
            this.f4609v = new AbstractC3832s[length];
            int i4 = length - 1;
            int i5 = 0;
            while (true) {
                boolean z3 = true;
                if (i5 >= length) {
                    break;
                }
                AbstractC3832s[] abstractC3832sArr = this.f4609v;
                Type type = this.f4592e[i5];
                Annotation[] annotationArr = this.f4591d[i5];
                if (i5 != i4) {
                    z3 = false;
                }
                abstractC3832sArr[i5] = m5011f(i5, type, annotationArr, z3);
                i5++;
            }
            if (this.f4605r == null && !this.f4600m) {
                throw AbstractC3822i0.m5065m(this.f4589b, "Missing either @%s URL or @Url parameter.", this.f4601n);
            }
            boolean z4 = this.f4603p;
            if (!z4 && !this.f4604q && !this.f4602o && this.f4595h) {
                throw AbstractC3822i0.m5065m(this.f4589b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z4 && !this.f4593f) {
                throw AbstractC3822i0.m5065m(this.f4589b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f4604q || this.f4594g) {
                return new C3810c0(this);
            }
            throw AbstractC3822i0.m5065m(this.f4589b, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        /* renamed from: c */
        public final C4516s m5008c(String[] strArr) {
            C4516s.a aVar = new C4516s.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw AbstractC3822i0.m5065m(this.f4589b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f4607t = C4519v.m6050e(strTrim);
                    } catch (IllegalArgumentException e4) {
                        throw AbstractC3822i0.m5066n(this.f4589b, e4, "Malformed content type: %s", strTrim);
                    }
                } else {
                    aVar.m5964a(strSubstring, strTrim);
                }
            }
            return aVar.m5968e();
        }

        /* renamed from: d */
        public final void m5009d(String str, String str2, boolean z3) {
            String str3 = this.f4601n;
            if (str3 != null) {
                throw AbstractC3822i0.m5065m(this.f4589b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f4601n = str;
            this.f4602o = z3;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f4586x.matcher(strSubstring).find()) {
                    throw AbstractC3822i0.m5065m(this.f4589b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f4605r = str2;
            this.f4608u = m5006h(str2);
        }

        /* renamed from: e */
        public final void m5010e(Annotation annotation) {
            if (annotation instanceof InterfaceC4368b) {
                m5009d("DELETE", ((InterfaceC4368b) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC4372f) {
                m5009d("GET", ((InterfaceC4372f) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC4373g) {
                m5009d("HEAD", ((InterfaceC4373g) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC4380n) {
                m5009d("PATCH", ((InterfaceC4380n) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC4381o) {
                m5009d("POST", ((InterfaceC4381o) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC4382p) {
                m5009d("PUT", ((InterfaceC4382p) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC4379m) {
                m5009d("OPTIONS", ((InterfaceC4379m) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC4374h) {
                InterfaceC4374h interfaceC4374h = (InterfaceC4374h) annotation;
                m5009d(interfaceC4374h.method(), interfaceC4374h.path(), interfaceC4374h.hasBody());
                return;
            }
            if (annotation instanceof InterfaceC4377k) {
                String[] strArrValue = ((InterfaceC4377k) annotation).value();
                if (strArrValue.length == 0) {
                    throw AbstractC3822i0.m5065m(this.f4589b, "@Headers annotation is empty.", new Object[0]);
                }
                this.f4606s = m5008c(strArrValue);
                return;
            }
            if (annotation instanceof InterfaceC4378l) {
                if (this.f4603p) {
                    throw AbstractC3822i0.m5065m(this.f4589b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f4604q = true;
            } else if (annotation instanceof InterfaceC4371e) {
                if (this.f4604q) {
                    throw AbstractC3822i0.m5065m(this.f4589b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f4603p = true;
            }
        }

        /* renamed from: f */
        public final AbstractC3832s m5011f(int i4, Type type, Annotation[] annotationArr, boolean z3) {
            AbstractC3832s abstractC3832s;
            if (annotationArr != null) {
                abstractC3832s = null;
                for (Annotation annotation : annotationArr) {
                    AbstractC3832s abstractC3832sM5012g = m5012g(i4, type, annotationArr, annotation);
                    if (abstractC3832sM5012g != null) {
                        if (abstractC3832s != null) {
                            throw AbstractC3822i0.m5067o(this.f4589b, i4, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        abstractC3832s = abstractC3832sM5012g;
                    }
                }
            } else {
                abstractC3832s = null;
            }
            if (abstractC3832s != null) {
                return abstractC3832s;
            }
            if (z3) {
                try {
                    if (AbstractC3822i0.m5060h(type) == Continuation.class) {
                        this.f4610w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw AbstractC3822i0.m5067o(this.f4589b, i4, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: g */
        public final AbstractC3832s m5012g(int i4, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof InterfaceC4391y) {
                m5014j(i4, type);
                if (this.f4600m) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f4596i) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f4597j) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f4598k) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f4599l) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f4605r != null) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "@Url cannot be used with @%s URL", this.f4601n);
                }
                this.f4600m = true;
                if (type == C4517t.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new AbstractC3832s.p(this.f4589b, i4);
                }
                throw AbstractC3822i0.m5067o(this.f4589b, i4, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof InterfaceC4385s) {
                m5014j(i4, type);
                if (this.f4597j) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f4598k) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f4599l) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f4600m) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f4605r == null) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "@Path can only be used with relative url on @%s", this.f4601n);
                }
                this.f4596i = true;
                InterfaceC4385s interfaceC4385s = (InterfaceC4385s) annotation;
                String strValue = interfaceC4385s.value();
                m5013i(i4, strValue);
                return new AbstractC3832s.k(this.f4589b, i4, strValue, this.f4588a.m5034i(type, annotationArr), interfaceC4385s.encoded());
            }
            if (annotation instanceof InterfaceC4386t) {
                m5014j(i4, type);
                InterfaceC4386t interfaceC4386t = (InterfaceC4386t) annotation;
                String strValue2 = interfaceC4386t.value();
                boolean zEncoded = interfaceC4386t.encoded();
                Class clsM5060h = AbstractC3822i0.m5060h(type);
                this.f4597j = true;
                if (!Iterable.class.isAssignableFrom(clsM5060h)) {
                    return clsM5060h.isArray() ? new AbstractC3832s.l(strValue2, this.f4588a.m5034i(m5005a(clsM5060h.getComponentType()), annotationArr), zEncoded).m5098b() : new AbstractC3832s.l(strValue2, this.f4588a.m5034i(type, annotationArr), zEncoded);
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC3832s.l(strValue2, this.f4588a.m5034i(AbstractC3822i0.m5059g(0, (ParameterizedType) type), annotationArr), zEncoded).m5099c();
                }
                throw AbstractC3822i0.m5067o(this.f4589b, i4, clsM5060h.getSimpleName() + " must include generic type (e.g., " + clsM5060h.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC4388v) {
                m5014j(i4, type);
                boolean zEncoded2 = ((InterfaceC4388v) annotation).encoded();
                Class clsM5060h2 = AbstractC3822i0.m5060h(type);
                this.f4598k = true;
                if (!Iterable.class.isAssignableFrom(clsM5060h2)) {
                    return clsM5060h2.isArray() ? new AbstractC3832s.n(this.f4588a.m5034i(m5005a(clsM5060h2.getComponentType()), annotationArr), zEncoded2).m5098b() : new AbstractC3832s.n(this.f4588a.m5034i(type, annotationArr), zEncoded2);
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC3832s.n(this.f4588a.m5034i(AbstractC3822i0.m5059g(0, (ParameterizedType) type), annotationArr), zEncoded2).m5099c();
                }
                throw AbstractC3822i0.m5067o(this.f4589b, i4, clsM5060h2.getSimpleName() + " must include generic type (e.g., " + clsM5060h2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC4387u) {
                m5014j(i4, type);
                Class clsM5060h3 = AbstractC3822i0.m5060h(type);
                this.f4599l = true;
                if (!Map.class.isAssignableFrom(clsM5060h3)) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeM5061i = AbstractC3822i0.m5061i(type, clsM5060h3, Map.class);
                if (!(typeM5061i instanceof ParameterizedType)) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeM5061i;
                Type typeM5059g = AbstractC3822i0.m5059g(0, parameterizedType);
                if (String.class == typeM5059g) {
                    return new AbstractC3832s.m(this.f4589b, i4, this.f4588a.m5034i(AbstractC3822i0.m5059g(1, parameterizedType), annotationArr), ((InterfaceC4387u) annotation).encoded());
                }
                throw AbstractC3822i0.m5067o(this.f4589b, i4, "@QueryMap keys must be of type String: " + typeM5059g, new Object[0]);
            }
            if (annotation instanceof InterfaceC4375i) {
                m5014j(i4, type);
                String strValue3 = ((InterfaceC4375i) annotation).value();
                Class clsM5060h4 = AbstractC3822i0.m5060h(type);
                if (!Iterable.class.isAssignableFrom(clsM5060h4)) {
                    return clsM5060h4.isArray() ? new AbstractC3832s.f(strValue3, this.f4588a.m5034i(m5005a(clsM5060h4.getComponentType()), annotationArr)).m5098b() : new AbstractC3832s.f(strValue3, this.f4588a.m5034i(type, annotationArr));
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC3832s.f(strValue3, this.f4588a.m5034i(AbstractC3822i0.m5059g(0, (ParameterizedType) type), annotationArr)).m5099c();
                }
                throw AbstractC3822i0.m5067o(this.f4589b, i4, clsM5060h4.getSimpleName() + " must include generic type (e.g., " + clsM5060h4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC4376j) {
                if (type == C4516s.class) {
                    return new AbstractC3832s.h(this.f4589b, i4);
                }
                m5014j(i4, type);
                Class clsM5060h5 = AbstractC3822i0.m5060h(type);
                if (!Map.class.isAssignableFrom(clsM5060h5)) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type typeM5061i2 = AbstractC3822i0.m5061i(type, clsM5060h5, Map.class);
                if (!(typeM5061i2 instanceof ParameterizedType)) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeM5061i2;
                Type typeM5059g2 = AbstractC3822i0.m5059g(0, parameterizedType2);
                if (String.class == typeM5059g2) {
                    return new AbstractC3832s.g(this.f4589b, i4, this.f4588a.m5034i(AbstractC3822i0.m5059g(1, parameterizedType2), annotationArr));
                }
                throw AbstractC3822i0.m5067o(this.f4589b, i4, "@HeaderMap keys must be of type String: " + typeM5059g2, new Object[0]);
            }
            if (annotation instanceof InterfaceC4369c) {
                m5014j(i4, type);
                if (!this.f4603p) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                InterfaceC4369c interfaceC4369c = (InterfaceC4369c) annotation;
                String strValue4 = interfaceC4369c.value();
                boolean zEncoded3 = interfaceC4369c.encoded();
                this.f4593f = true;
                Class clsM5060h6 = AbstractC3822i0.m5060h(type);
                if (!Iterable.class.isAssignableFrom(clsM5060h6)) {
                    return clsM5060h6.isArray() ? new AbstractC3832s.d(strValue4, this.f4588a.m5034i(m5005a(clsM5060h6.getComponentType()), annotationArr), zEncoded3).m5098b() : new AbstractC3832s.d(strValue4, this.f4588a.m5034i(type, annotationArr), zEncoded3);
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC3832s.d(strValue4, this.f4588a.m5034i(AbstractC3822i0.m5059g(0, (ParameterizedType) type), annotationArr), zEncoded3).m5099c();
                }
                throw AbstractC3822i0.m5067o(this.f4589b, i4, clsM5060h6.getSimpleName() + " must include generic type (e.g., " + clsM5060h6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC4370d) {
                m5014j(i4, type);
                if (!this.f4603p) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class clsM5060h7 = AbstractC3822i0.m5060h(type);
                if (!Map.class.isAssignableFrom(clsM5060h7)) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeM5061i3 = AbstractC3822i0.m5061i(type, clsM5060h7, Map.class);
                if (!(typeM5061i3 instanceof ParameterizedType)) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeM5061i3;
                Type typeM5059g3 = AbstractC3822i0.m5059g(0, parameterizedType3);
                if (String.class == typeM5059g3) {
                    InterfaceC3821i interfaceC3821iM5034i = this.f4588a.m5034i(AbstractC3822i0.m5059g(1, parameterizedType3), annotationArr);
                    this.f4593f = true;
                    return new AbstractC3832s.e(this.f4589b, i4, interfaceC3821iM5034i, ((InterfaceC4370d) annotation).encoded());
                }
                throw AbstractC3822i0.m5067o(this.f4589b, i4, "@FieldMap keys must be of type String: " + typeM5059g3, new Object[0]);
            }
            if (annotation instanceof InterfaceC4383q) {
                m5014j(i4, type);
                if (!this.f4604q) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                InterfaceC4383q interfaceC4383q = (InterfaceC4383q) annotation;
                this.f4594g = true;
                String strValue5 = interfaceC4383q.value();
                Class clsM5060h8 = AbstractC3822i0.m5060h(type);
                if (strValue5.isEmpty()) {
                    if (!Iterable.class.isAssignableFrom(clsM5060h8)) {
                        if (clsM5060h8.isArray()) {
                            if (C4520w.c.class.isAssignableFrom(clsM5060h8.getComponentType())) {
                                return AbstractC3832s.o.f4730a.m5098b();
                            }
                            throw AbstractC3822i0.m5067o(this.f4589b, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        if (C4520w.c.class.isAssignableFrom(clsM5060h8)) {
                            return AbstractC3832s.o.f4730a;
                        }
                        throw AbstractC3822i0.m5067o(this.f4589b, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (type instanceof ParameterizedType) {
                        if (C4520w.c.class.isAssignableFrom(AbstractC3822i0.m5060h(AbstractC3822i0.m5059g(0, (ParameterizedType) type)))) {
                            return AbstractC3832s.o.f4730a.m5099c();
                        }
                        throw AbstractC3822i0.m5067o(this.f4589b, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, clsM5060h8.getSimpleName() + " must include generic type (e.g., " + clsM5060h8.getSimpleName() + "<String>)", new Object[0]);
                }
                C4516s c4516sM5958d = C4516s.m5958d("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", interfaceC4383q.encoding());
                if (!Iterable.class.isAssignableFrom(clsM5060h8)) {
                    if (!clsM5060h8.isArray()) {
                        if (C4520w.c.class.isAssignableFrom(clsM5060h8)) {
                            throw AbstractC3822i0.m5067o(this.f4589b, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        return new AbstractC3832s.i(this.f4589b, i4, c4516sM5958d, this.f4588a.m5032g(type, annotationArr, this.f4590c));
                    }
                    Class clsM5005a = m5005a(clsM5060h8.getComponentType());
                    if (C4520w.c.class.isAssignableFrom(clsM5005a)) {
                        throw AbstractC3822i0.m5067o(this.f4589b, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new AbstractC3832s.i(this.f4589b, i4, c4516sM5958d, this.f4588a.m5032g(clsM5005a, annotationArr, this.f4590c)).m5098b();
                }
                if (type instanceof ParameterizedType) {
                    Type typeM5059g4 = AbstractC3822i0.m5059g(0, (ParameterizedType) type);
                    if (C4520w.c.class.isAssignableFrom(AbstractC3822i0.m5060h(typeM5059g4))) {
                        throw AbstractC3822i0.m5067o(this.f4589b, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new AbstractC3832s.i(this.f4589b, i4, c4516sM5958d, this.f4588a.m5032g(typeM5059g4, annotationArr, this.f4590c)).m5099c();
                }
                throw AbstractC3822i0.m5067o(this.f4589b, i4, clsM5060h8.getSimpleName() + " must include generic type (e.g., " + clsM5060h8.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC4384r) {
                m5014j(i4, type);
                if (!this.f4604q) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.f4594g = true;
                Class clsM5060h9 = AbstractC3822i0.m5060h(type);
                if (!Map.class.isAssignableFrom(clsM5060h9)) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type typeM5061i4 = AbstractC3822i0.m5061i(type, clsM5060h9, Map.class);
                if (!(typeM5061i4 instanceof ParameterizedType)) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) typeM5061i4;
                Type typeM5059g5 = AbstractC3822i0.m5059g(0, parameterizedType4);
                if (String.class == typeM5059g5) {
                    Type typeM5059g6 = AbstractC3822i0.m5059g(1, parameterizedType4);
                    if (C4520w.c.class.isAssignableFrom(AbstractC3822i0.m5060h(typeM5059g6))) {
                        throw AbstractC3822i0.m5067o(this.f4589b, i4, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                    }
                    return new AbstractC3832s.j(this.f4589b, i4, this.f4588a.m5032g(typeM5059g6, annotationArr, this.f4590c), ((InterfaceC4384r) annotation).encoding());
                }
                throw AbstractC3822i0.m5067o(this.f4589b, i4, "@PartMap keys must be of type String: " + typeM5059g5, new Object[0]);
            }
            if (annotation instanceof InterfaceC4367a) {
                m5014j(i4, type);
                if (this.f4603p || this.f4604q) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.f4595h) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "Multiple @Body method annotations found.", new Object[0]);
                }
                try {
                    InterfaceC3821i interfaceC3821iM5032g = this.f4588a.m5032g(type, annotationArr, this.f4590c);
                    this.f4595h = true;
                    return new AbstractC3832s.c(this.f4589b, i4, interfaceC3821iM5032g);
                } catch (RuntimeException e4) {
                    throw AbstractC3822i0.m5068p(this.f4589b, e4, i4, "Unable to create @Body converter for %s", type);
                }
            }
            if (!(annotation instanceof InterfaceC4390x)) {
                return null;
            }
            m5014j(i4, type);
            Class clsM5060h10 = AbstractC3822i0.m5060h(type);
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                AbstractC3832s abstractC3832s = this.f4609v[i5];
                if ((abstractC3832s instanceof AbstractC3832s.q) && ((AbstractC3832s.q) abstractC3832s).f4733a.equals(clsM5060h10)) {
                    throw AbstractC3822i0.m5067o(this.f4589b, i4, "@Tag type " + clsM5060h10.getName() + " is duplicate of parameter #" + (i5 + 1) + " and would always overwrite its value.", new Object[0]);
                }
            }
            return new AbstractC3832s.q(clsM5060h10);
        }

        /* renamed from: i */
        public final void m5013i(int i4, String str) {
            if (!f4587y.matcher(str).matches()) {
                throw AbstractC3822i0.m5067o(this.f4589b, i4, "@Path parameter name must match %s. Found: %s", f4586x.pattern(), str);
            }
            if (!this.f4608u.contains(str)) {
                throw AbstractC3822i0.m5067o(this.f4589b, i4, "URL \"%s\" does not contain \"{%s}\".", this.f4605r, str);
            }
        }

        /* renamed from: j */
        public final void m5014j(int i4, Type type) {
            if (AbstractC3822i0.m5062j(type)) {
                throw AbstractC3822i0.m5067o(this.f4589b, i4, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public C3810c0(a aVar) {
        this.f4575a = aVar.f4589b;
        this.f4576b = aVar.f4588a.f4616c;
        this.f4577c = aVar.f4601n;
        this.f4578d = aVar.f4605r;
        this.f4579e = aVar.f4606s;
        this.f4580f = aVar.f4607t;
        this.f4581g = aVar.f4602o;
        this.f4582h = aVar.f4603p;
        this.f4583i = aVar.f4604q;
        this.f4584j = aVar.f4609v;
        this.f4585k = aVar.f4610w;
    }

    /* renamed from: b */
    public static C3810c0 m5003b(C3814e0 c3814e0, Method method) {
        return new a(c3814e0, method).m5007b();
    }

    /* renamed from: a */
    public C4522y m5004a(Object[] objArr) {
        AbstractC3832s[] abstractC3832sArr = this.f4584j;
        int length = objArr.length;
        if (length != abstractC3832sArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + abstractC3832sArr.length + ")");
        }
        C3808b0 c3808b0 = new C3808b0(this.f4577c, this.f4576b, this.f4578d, this.f4579e, this.f4580f, this.f4581g, this.f4582h, this.f4583i);
        if (this.f4585k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 0; i4 < length; i4++) {
            arrayList.add(objArr[i4]);
            abstractC3832sArr[i4].mo5097a(c3808b0, objArr[i4]);
        }
        return c3808b0.m4995k().m6148g(C3827n.class, new C3827n(this.f4575a, arrayList)).m6143b();
    }
}
