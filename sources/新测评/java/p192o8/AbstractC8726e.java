package p192o8;

/* renamed from: o8.e */
/* loaded from: classes5.dex */
public abstract class AbstractC8726e {
    /* renamed from: a */
    public static void m14364a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static Object m14365b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m14366c(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
