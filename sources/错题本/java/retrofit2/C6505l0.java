package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.C6329q;
import okhttp3.C6333u;

/* renamed from: retrofit2.l0 */
/* loaded from: classes4.dex */
public final class C6505l0 {

    /* renamed from: y */
    public static final Pattern f10722y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: z */
    public static final Pattern f10723z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a */
    public final C6513p0 f10724a;

    /* renamed from: b */
    public final Class f10725b;

    /* renamed from: c */
    public final Method f10726c;

    /* renamed from: d */
    public final Annotation[] f10727d;

    /* renamed from: e */
    public final Annotation[][] f10728e;

    /* renamed from: f */
    public final Type[] f10729f;

    /* renamed from: g */
    public boolean f10730g;

    /* renamed from: h */
    public boolean f10731h;

    /* renamed from: i */
    public boolean f10732i;

    /* renamed from: j */
    public boolean f10733j;

    /* renamed from: k */
    public boolean f10734k;

    /* renamed from: l */
    public boolean f10735l;

    /* renamed from: m */
    public boolean f10736m;

    /* renamed from: n */
    public boolean f10737n;

    /* renamed from: o */
    public String f10738o;

    /* renamed from: p */
    public boolean f10739p;

    /* renamed from: q */
    public boolean f10740q;

    /* renamed from: r */
    public boolean f10741r;

    /* renamed from: s */
    public String f10742s;

    /* renamed from: t */
    public C6329q f10743t;

    /* renamed from: u */
    public C6333u f10744u;

    /* renamed from: v */
    public LinkedHashSet f10745v;

    /* renamed from: w */
    public AbstractC6522v[] f10746w;

    /* renamed from: x */
    public boolean f10747x;

    public C6505l0(C6513p0 c6513p0, Class cls, Method method) {
        this.f10724a = c6513p0;
        this.f10725b = cls;
        this.f10726c = method;
        this.f10727d = method.getAnnotations();
        this.f10729f = method.getGenericParameterTypes();
        this.f10728e = method.getParameterAnnotations();
    }

    /* renamed from: a */
    public static Class m6150a(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    /* renamed from: b */
    public final void m6151b(String str, String str2, boolean z8) {
        String str3 = this.f10738o;
        Method method = this.f10726c;
        if (str3 != null) {
            throw AbstractC6522v.m6171m(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f10738o = str;
        this.f10739p = z8;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f10722y;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw AbstractC6522v.m6171m(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f10742s = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f10745v = linkedHashSet;
    }

    /* renamed from: c */
    public final void m6152c(int i, Type type) {
        if (AbstractC6522v.m6168j(type)) {
            throw AbstractC6522v.m6172n(this.f10726c, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
