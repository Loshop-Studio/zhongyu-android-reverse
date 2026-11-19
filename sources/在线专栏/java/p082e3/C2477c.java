package p082e3;

/* renamed from: e3.c */
/* loaded from: classes.dex */
class C2477c extends C2476b {
    /* renamed from: d */
    public static final boolean m8263d(char c4, char c5, boolean z3) {
        if (c4 == c5) {
            return true;
        }
        if (!z3) {
            return false;
        }
        char upperCase = Character.toUpperCase(c4);
        char upperCase2 = Character.toUpperCase(c5);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
