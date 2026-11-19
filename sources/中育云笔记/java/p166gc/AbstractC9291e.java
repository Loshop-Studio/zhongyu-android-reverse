package p166gc;

/* renamed from: gc.e */
/* loaded from: classes6.dex */
public abstract class AbstractC9291e {
    /* renamed from: a */
    public static void m18321a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static Object m18322b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m18323c(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
