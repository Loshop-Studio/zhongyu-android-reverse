package p167l6;

/* renamed from: l6.e */
/* loaded from: classes5.dex */
public abstract class AbstractC9257e {
    /* renamed from: a */
    public static void m16971a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static Object m16972b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m16973c(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
