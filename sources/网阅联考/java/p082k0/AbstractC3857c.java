package p082k0;

/* renamed from: k0.c */
/* loaded from: classes2.dex */
public abstract class AbstractC3857c {

    /* renamed from: a */
    public static InterfaceC3855a f4764a = new C3856b();

    /* renamed from: b */
    public static String f4765b = "[XUI]";

    /* renamed from: c */
    public static boolean f4766c = false;

    /* renamed from: d */
    public static int f4767d = 10;

    /* renamed from: a */
    public static void m5159a(String str) {
        if (m5163e(3)) {
            f4764a.mo5155a(3, f4765b, str, null);
        }
    }

    /* renamed from: b */
    public static void m5160b(String str, String str2) {
        if (m5163e(3)) {
            f4764a.mo5155a(3, str, str2, null);
        }
    }

    /* renamed from: c */
    public static void m5161c(String str) {
        if (m5163e(6)) {
            f4764a.mo5155a(6, f4765b, str, null);
        }
    }

    /* renamed from: d */
    public static void m5162d(Throwable th) {
        if (m5163e(6)) {
            f4764a.mo5155a(6, f4765b, null, th);
        }
    }

    /* renamed from: e */
    public static boolean m5163e(int i4) {
        return f4764a != null && f4766c && i4 >= f4767d;
    }

    /* renamed from: f */
    public static void m5164f(String str, String str2) {
        if (m5163e(4)) {
            f4764a.mo5155a(4, str, str2, null);
        }
    }
}
