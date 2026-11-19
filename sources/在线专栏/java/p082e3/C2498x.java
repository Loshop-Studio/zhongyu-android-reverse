package p082e3;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p014b3.C1037f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e3.x */
/* loaded from: classes.dex */
public class C2498x extends C2497w {
    @NotNull
    /* renamed from: J0 */
    public static final String m8416J0(@NotNull String str, int i4) {
        C2769l.m9241e(str, "<this>");
        if (i4 >= 0) {
            String strSubstring = str.substring(C1037f.m4823d(i4, str.length()));
            C2769l.m9240d(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    /* renamed from: K0 */
    public static CharSequence m8417K0(@NotNull CharSequence charSequence) {
        C2769l.m9241e(charSequence, "<this>");
        StringBuilder sbReverse = new StringBuilder(charSequence).reverse();
        C2769l.m9240d(sbReverse, "StringBuilder(this).reverse()");
        return sbReverse;
    }

    @NotNull
    /* renamed from: L0 */
    public static String m8418L0(@NotNull String str, int i4) {
        C2769l.m9241e(str, "<this>");
        if (i4 >= 0) {
            String strSubstring = str.substring(0, C1037f.m4823d(i4, str.length()));
            C2769l.m9240d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }
}
