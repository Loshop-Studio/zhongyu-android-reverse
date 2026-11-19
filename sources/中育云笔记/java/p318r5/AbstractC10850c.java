package p318r5;

import java.util.Map;

/* renamed from: r5.c */
/* loaded from: classes5.dex */
public abstract class AbstractC10850c {
    /* renamed from: a */
    public static void m23362a(String str, String str2, long j10) {
        C10906y0 c10906y0M23370i = m23370i(str, str2);
        if (c10906y0M23370i != null) {
            c10906y0M23370i.m23715b(j10);
        }
    }

    /* renamed from: b */
    public static boolean m23363b(String str, String str2) {
        C10906y0 c10906y0M23370i = m23370i(str, str2);
        if (c10906y0M23370i != null) {
            return c10906y0M23370i.m23719f();
        }
        return true;
    }

    /* renamed from: c */
    public static int m23364c(String str, String str2) {
        C10906y0 c10906y0M23370i = m23370i(str, str2);
        if (c10906y0M23370i != null) {
            return c10906y0M23370i.m23727n();
        }
        return 7;
    }

    /* renamed from: d */
    public static boolean m23365d(String str, String str2) {
        C10906y0 c10906y0M23370i = m23370i(str, str2);
        if (c10906y0M23370i != null) {
            return c10906y0M23370i.m23736w();
        }
        return true;
    }

    /* renamed from: e */
    public static String m23366e(String str, String str2) {
        C10906y0 c10906y0M23370i = m23370i(str, str2);
        return c10906y0M23370i != null ? c10906y0M23370i.m23733t() : "";
    }

    /* renamed from: f */
    public static boolean m23367f(String str, String str2) {
        C10906y0 c10906y0M23370i = m23370i(str, str2);
        if (c10906y0M23370i != null) {
            return c10906y0M23370i.m23738y();
        }
        return false;
    }

    /* renamed from: g */
    public static String m23368g(String str, String str2) {
        C10906y0 c10906y0M23370i = m23370i(str, str2);
        return c10906y0M23370i != null ? c10906y0M23370i.m23737x() : "";
    }

    /* renamed from: h */
    public static String m23369h(String str, String str2) {
        C10906y0 c10906y0M23370i = m23370i(str, str2);
        return c10906y0M23370i != null ? c10906y0M23370i.m23710D() : "";
    }

    /* renamed from: i */
    public static C10906y0 m23370i(String str, String str2) {
        C10869i0 c10869i0M23744b = C10908z0.m23741e().m23744b(str);
        if (c10869i0M23744b == null) {
            return null;
        }
        if (!"alltype".equals(str2)) {
            return c10869i0M23744b.m23480b(str2);
        }
        C10906y0 c10906y0M23480b = c10869i0M23744b.m23480b("oper");
        return c10906y0M23480b == null ? c10869i0M23744b.m23480b("maint") : c10906y0M23480b;
    }

    /* renamed from: j */
    public static Map m23371j(String str, String str2) {
        C10906y0 c10906y0M23370i = m23370i(str, str2);
        if (c10906y0M23370i != null) {
            return c10906y0M23370i.m23707A();
        }
        return null;
    }

    /* renamed from: k */
    public static long m23372k(String str, String str2) {
        C10906y0 c10906y0M23370i = m23370i(str, str2);
        if (c10906y0M23370i != null) {
            return c10906y0M23370i.m23708B();
        }
        return 0L;
    }

    /* renamed from: l */
    public static int m23373l(String str, String str2) {
        C10906y0 c10906y0M23370i = m23370i(str, str2);
        if (c10906y0M23370i != null) {
            return c10906y0M23370i.m23720g();
        }
        return 10;
    }

    /* renamed from: m */
    public static String m23374m(String str, String str2) {
        C10906y0 c10906y0M23370i = m23370i(str, str2);
        return c10906y0M23370i != null ? c10906y0M23370i.m23711E() : "";
    }

    /* renamed from: n */
    public static String m23375n(String str, String str2) {
        C10906y0 c10906y0M23370i = m23370i(str, str2);
        return c10906y0M23370i != null ? c10906y0M23370i.m23713G() : "";
    }

    /* renamed from: o */
    public static String m23376o(String str, String str2) {
        C10906y0 c10906y0M23370i = m23370i(str, str2);
        return c10906y0M23370i != null ? c10906y0M23370i.m23709C() : "";
    }

    /* renamed from: p */
    public static String m23377p(String str, String str2) {
        C10906y0 c10906y0M23370i = m23370i(str, str2);
        return c10906y0M23370i != null ? c10906y0M23370i.m23712F() : "";
    }
}
