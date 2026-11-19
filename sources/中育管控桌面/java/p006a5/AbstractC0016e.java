package p006a5;

/* renamed from: a5.e */
/* loaded from: classes4.dex */
public abstract class AbstractC0016e {
    /* renamed from: a */
    public static void m24a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static Object m25b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m26c(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
