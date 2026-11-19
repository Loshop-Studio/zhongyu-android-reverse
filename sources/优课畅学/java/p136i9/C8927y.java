package p136i9;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.text.Regex;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p113g8.C8670i;
import p113g8.InterfaceC8672k;
import p223q7.AbstractC9844c;

/* renamed from: i9.y */
/* loaded from: classes5.dex */
public final class C8927y {

    /* renamed from: e */
    public static final a f16815e = new a(null);

    /* renamed from: f */
    public static final Regex f16816f = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: g */
    public static final Regex f16817g = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f16818a;

    /* renamed from: b */
    public final String f16819b;

    /* renamed from: c */
    public final String f16820c;

    /* renamed from: d */
    public final String[] f16821d;

    /* renamed from: i9.y$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final C8927y m15342a(String str) {
            AbstractC9133u.m16133g(str, "<this>");
            InterfaceC8672k interfaceC8672kM16179e = C8927y.f16816f.m16179e(str, 0);
            if (interfaceC8672kM16179e == null) {
                throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
            }
            String str2 = (String) interfaceC8672kM16179e.mo14054a().get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((String) interfaceC8672kM16179e.mo14054a().get(2)).toLowerCase(locale);
            AbstractC9133u.m16132f(lowerCase2, "toLowerCase(...)");
            ArrayList arrayList = new ArrayList();
            int iM13497c = interfaceC8672kM16179e.mo14055b().m13497c();
            while (true) {
                int i10 = iM13497c + 1;
                if (i10 >= str.length()) {
                    return new C8927y(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
                InterfaceC8672k interfaceC8672kM16179e2 = C8927y.f16817g.m16179e(str, i10);
                if (interfaceC8672kM16179e2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(i10);
                    AbstractC9133u.m16132f(strSubstring, "substring(...)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                C8670i c8670i = interfaceC8672kM16179e2.mo14056c().get(1);
                String strM14053b = c8670i != null ? c8670i.m14053b() : null;
                if (strM14053b == null) {
                    iM13497c = interfaceC8672kM16179e2.mo14055b().m13497c();
                } else {
                    C8670i c8670i2 = interfaceC8672kM16179e2.mo14056c().get(2);
                    String strM14053b2 = c8670i2 != null ? c8670i2.m14053b() : null;
                    if (strM14053b2 == null) {
                        C8670i c8670i3 = interfaceC8672kM16179e2.mo14056c().get(3);
                        AbstractC9133u.m16130d(c8670i3);
                        strM14053b2 = c8670i3.m14053b();
                    } else if (AbstractC8661c0.m13961L0(strM14053b2, '\'', false, 2, null) && AbstractC8661c0.m13981W(strM14053b2, '\'', false, 2, null) && strM14053b2.length() > 2) {
                        strM14053b2 = strM14053b2.substring(1, strM14053b2.length() - 1);
                        AbstractC9133u.m16132f(strM14053b2, "substring(...)");
                    }
                    arrayList.add(strM14053b);
                    arrayList.add(strM14053b2);
                    iM13497c = interfaceC8672kM16179e2.mo14055b().m13497c();
                }
            }
        }

        /* renamed from: b */
        public final C8927y m15343b(String str) {
            AbstractC9133u.m16133g(str, "<this>");
            try {
                return m15342a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public a() {
        }
    }

    public C8927y(String mediaType, String type, String subtype, String[] parameterNamesAndValues) {
        AbstractC9133u.m16133g(mediaType, "mediaType");
        AbstractC9133u.m16133g(type, "type");
        AbstractC9133u.m16133g(subtype, "subtype");
        AbstractC9133u.m16133g(parameterNamesAndValues, "parameterNamesAndValues");
        this.f16818a = mediaType;
        this.f16819b = type;
        this.f16820c = subtype;
        this.f16821d = parameterNamesAndValues;
    }

    /* renamed from: d */
    public static /* synthetic */ Charset m15336d(C8927y c8927y, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return c8927y.m15339c(charset);
    }

    /* renamed from: e */
    public static final C8927y m15337e(String str) {
        return f16815e.m15342a(str);
    }

    /* renamed from: g */
    public static final C8927y m15338g(String str) {
        return f16815e.m15343b(str);
    }

    /* renamed from: c */
    public final Charset m15339c(Charset charset) {
        String strM15340f = m15340f("charset");
        if (strM15340f == null) {
            return charset;
        }
        try {
            return Charset.forName(strM15340f);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8927y) && AbstractC9133u.m16128b(((C8927y) obj).f16818a, this.f16818a);
    }

    /* renamed from: f */
    public final String m15340f(String name) {
        AbstractC9133u.m16133g(name, "name");
        int i10 = 0;
        int iM18367b = AbstractC9844c.m18367b(0, this.f16821d.length - 1, 2);
        if (iM18367b < 0) {
            return null;
        }
        while (!AbstractC8687z.m14093A(this.f16821d[i10], name, true)) {
            if (i10 == iM18367b) {
                return null;
            }
            i10 += 2;
        }
        return this.f16821d[i10 + 1];
    }

    /* renamed from: h */
    public final String m15341h() {
        return this.f16819b;
    }

    public int hashCode() {
        return this.f16818a.hashCode();
    }

    public String toString() {
        return this.f16818a;
    }
}
