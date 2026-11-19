package p113g8;

/* renamed from: g8.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8658b extends AbstractC8656a {
    /* renamed from: g */
    public static int m13945g(char c10) {
        int iM13940b = AbstractC8656a.m13940b(c10, 10);
        if (iM13940b >= 0) {
            return iM13940b;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    /* renamed from: h */
    public static final boolean m13946h(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* renamed from: i */
    public static boolean m13947i(char c10) {
        return 55296 <= c10 && c10 < 57344;
    }
}
