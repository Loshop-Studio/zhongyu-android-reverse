package p155k6;

/* renamed from: k6.c */
/* loaded from: classes5.dex */
public abstract class AbstractC9061c {
    /* renamed from: a */
    public static Object m15861a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: b */
    public static Object m15862b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static void m15863c(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
