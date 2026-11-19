package p315z7;

/* renamed from: z7.e */
/* loaded from: classes5.dex */
public abstract class AbstractC10011e {
    /* renamed from: a */
    public static void m17381a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static Object m17382b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m17383c(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
