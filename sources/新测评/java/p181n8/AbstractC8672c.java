package p181n8;

/* renamed from: n8.c */
/* loaded from: classes5.dex */
public abstract class AbstractC8672c {
    /* renamed from: a */
    public static Object m14275a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: b */
    public static Object m14276b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static void m14277c(boolean z9, String str, Object... objArr) {
        if (!z9) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
