package p305y7;

/* renamed from: y7.c */
/* loaded from: classes5.dex */
public abstract class AbstractC9967c {
    /* renamed from: a */
    public static Object m17237a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: b */
    public static Object m17238b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static void m17239c(boolean z9, String str, Object... objArr) {
        if (!z9) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
