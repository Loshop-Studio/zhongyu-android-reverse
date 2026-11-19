package p329s1;

/* renamed from: s1.l */
/* loaded from: classes3.dex */
public abstract class AbstractC11045l {
    /* renamed from: a */
    public static void m24464a(Object... objArr) {
        for (Object obj : objArr) {
            obj.getClass();
        }
    }

    /* renamed from: b */
    public static void m24465b(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static void m24466c(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: d */
    public static Object m24467d(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: e */
    public static Object m24468e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
