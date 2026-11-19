package p410xd;

/* renamed from: xd.e0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC11843e0 {

    /* renamed from: a */
    public static final int f28084a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m26257a() {
        return f28084a;
    }

    /* renamed from: b */
    public static final String m26258b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
