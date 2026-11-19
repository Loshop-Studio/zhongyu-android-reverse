package p191n8;

/* renamed from: n8.f0 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC9446f0 {

    /* renamed from: a */
    public static final int f18651a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m17331a() {
        return f18651a;
    }

    /* renamed from: b */
    public static final String m17332b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
