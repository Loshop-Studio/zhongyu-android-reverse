package p310qd;

/* renamed from: qd.b */
/* loaded from: classes6.dex */
public abstract class AbstractC10790b extends AbstractC10788a {
    /* renamed from: g */
    public static int m23079g(char c10) {
        int iM23074b = AbstractC10788a.m23074b(c10, 10);
        if (iM23074b >= 0) {
            return iM23074b;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    /* renamed from: h */
    public static final boolean m23080h(char c10, char c11, boolean z10) {
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
}
