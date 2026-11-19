package p084k2;

/* renamed from: k2.b */
/* loaded from: classes2.dex */
public abstract class AbstractC3860b {
    /* renamed from: a */
    public static void m5167a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static Object m5168b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m5169c(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
