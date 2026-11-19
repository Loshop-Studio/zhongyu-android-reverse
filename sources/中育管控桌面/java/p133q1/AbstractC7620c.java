package p133q1;

/* renamed from: q1.c */
/* loaded from: classes3.dex */
public abstract class AbstractC7620c {

    /* renamed from: a */
    public static InterfaceC7618a f10076a = new C7619b();

    /* renamed from: b */
    public static String f10077b = "[XUI]";

    /* renamed from: c */
    public static boolean f10078c = false;

    /* renamed from: d */
    public static int f10079d = 10;

    /* renamed from: a */
    public static void m9059a(String str) {
        if (m9063e(3)) {
            f10076a.mo9055a(3, f10077b, str, null);
        }
    }

    /* renamed from: b */
    public static void m9060b(String str, String str2) {
        if (m9063e(3)) {
            f10076a.mo9055a(3, str, str2, null);
        }
    }

    /* renamed from: c */
    public static void m9061c(String str) {
        if (m9063e(6)) {
            f10076a.mo9055a(6, f10077b, str, null);
        }
    }

    /* renamed from: d */
    public static void m9062d(Throwable th) {
        if (m9063e(6)) {
            f10076a.mo9055a(6, f10077b, null, th);
        }
    }

    /* renamed from: e */
    public static boolean m9063e(int i6) {
        return f10076a != null && f10078c && i6 >= f10079d;
    }

    /* renamed from: f */
    public static void m9064f(String str, String str2) {
        if (m9063e(4)) {
            f10076a.mo9055a(4, str, str2, null);
        }
    }
}
