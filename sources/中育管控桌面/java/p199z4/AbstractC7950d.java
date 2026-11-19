package p199z4;

/* renamed from: z4.d */
/* loaded from: classes4.dex */
public abstract class AbstractC7950d {
    /* renamed from: a */
    public static void m9745a(boolean z6, String str, Object... objArr) {
        if (!z6) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public static Object m9746b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m9747c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m9748d(boolean z6, String str, Object... objArr) {
        if (!z6) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
