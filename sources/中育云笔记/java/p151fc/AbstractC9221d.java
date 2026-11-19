package p151fc;

/* renamed from: fc.d */
/* loaded from: classes6.dex */
public abstract class AbstractC9221d {
    /* renamed from: a */
    public static void m18137a(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public static Object m18138b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m18139c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m18140d(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
