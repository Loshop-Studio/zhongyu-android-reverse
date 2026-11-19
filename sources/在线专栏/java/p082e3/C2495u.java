package p082e3;

import java.util.Comparator;
import kotlin.jvm.internal.C2757a0;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014b3.C1037f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e3.u */
/* loaded from: classes.dex */
public class C2495u extends C2494t {
    /* renamed from: A */
    public static boolean m8338A(@NotNull String str, @NotNull String prefix, boolean z3) {
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(prefix, "prefix");
        return !z3 ? str.startsWith(prefix) : m8347s(str, 0, prefix, 0, prefix.length(), z3);
    }

    /* renamed from: B */
    public static /* synthetic */ boolean m8339B(String str, String str2, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return m8354z(str, str2, i4, z3);
    }

    /* renamed from: C */
    public static /* synthetic */ boolean m8340C(String str, String str2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return m8338A(str, str2, z3);
    }

    /* renamed from: m */
    public static final boolean m8341m(@NotNull String str, @NotNull String suffix, boolean z3) {
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(suffix, "suffix");
        return !z3 ? str.endsWith(suffix) : m8347s(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    /* renamed from: n */
    public static /* synthetic */ boolean m8342n(String str, String str2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return m8341m(str, str2, z3);
    }

    /* renamed from: o */
    public static boolean m8343o(@Nullable String str, @Nullable String str2, boolean z3) {
        return str == null ? str2 == null : !z3 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: p */
    public static /* synthetic */ boolean m8344p(String str, String str2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return m8343o(str, str2, z3);
    }

    @NotNull
    /* renamed from: q */
    public static Comparator<String> m8345q(@NotNull C2757a0 c2757a0) {
        C2769l.m9241e(c2757a0, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        C2769l.m9240d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m8346r(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C2769l.m9241e(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3e
            b3.c r0 = p082e3.C2496v.m8374N(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L20
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L20
        L1e:
            r4 = 1
            goto L3c
        L20:
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1e
            r3 = r0
            kotlin.collections.y r3 = (kotlin.collections.AbstractC2743y) r3
            int r3 = r3.mo4807a()
            char r3 = r4.charAt(r3)
            boolean r3 = p082e3.C2476b.m8262c(r3)
            if (r3 != 0) goto L24
            r4 = 0
        L3c:
            if (r4 == 0) goto L3f
        L3e:
            r1 = 1
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e3.C2495u.m8346r(java.lang.CharSequence):boolean");
    }

    /* renamed from: s */
    public static final boolean m8347s(@NotNull String str, int i4, @NotNull String other, int i5, int i6, boolean z3) {
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(other, "other");
        return !z3 ? str.regionMatches(i4, other, i5, i6) : str.regionMatches(z3, i4, other, i5, i6);
    }

    @NotNull
    /* renamed from: u */
    public static String m8349u(@NotNull CharSequence charSequence, int i4) {
        C2769l.m9241e(charSequence, "<this>");
        int i5 = 1;
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i4 + '.').toString());
        }
        if (i4 == 0) {
            return "";
        }
        if (i4 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i4];
            for (int i6 = 0; i6 < i4; i6++) {
                cArr[i6] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i4);
        if (1 <= i4) {
            while (true) {
                int i7 = i5 + 1;
                sb.append(charSequence);
                if (i5 == i4) {
                    break;
                }
                i5 = i7;
            }
        }
        String string = sb.toString();
        C2769l.m9240d(string, "{\n                    va…tring()\n                }");
        return string;
    }

    @NotNull
    /* renamed from: v */
    public static final String m8350v(@NotNull String str, char c4, char c5, boolean z3) {
        C2769l.m9241e(str, "<this>");
        if (!z3) {
            String strReplace = str.replace(c4, c5);
            C2769l.m9240d(strReplace, "this as java.lang.String…replace(oldChar, newChar)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i4 = 0;
        while (i4 < str.length()) {
            char cCharAt = str.charAt(i4);
            i4++;
            if (C2477c.m8263d(cCharAt, c4, z3)) {
                cCharAt = c5;
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        C2769l.m9240d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @NotNull
    /* renamed from: w */
    public static final String m8351w(@NotNull String str, @NotNull String oldValue, @NotNull String newValue, boolean z3) {
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(oldValue, "oldValue");
        C2769l.m9241e(newValue, "newValue");
        int i4 = 0;
        int iM8377Q = C2496v.m8377Q(str, oldValue, 0, z3);
        if (iM8377Q < 0) {
            return str;
        }
        int length = oldValue.length();
        int iM4821b = C1037f.m4821b(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i4, iM8377Q);
            sb.append(newValue);
            i4 = iM8377Q + length;
            if (iM8377Q >= str.length()) {
                break;
            }
            iM8377Q = C2496v.m8377Q(str, oldValue, iM8377Q + iM4821b, z3);
        } while (iM8377Q > 0);
        sb.append((CharSequence) str, i4, str.length());
        String string = sb.toString();
        C2769l.m9240d(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    /* renamed from: x */
    public static /* synthetic */ String m8352x(String str, char c4, char c5, boolean z3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return m8350v(str, c4, c5, z3);
    }

    /* renamed from: y */
    public static /* synthetic */ String m8353y(String str, String str2, String str3, boolean z3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return m8351w(str, str2, str3, z3);
    }

    /* renamed from: z */
    public static boolean m8354z(@NotNull String str, @NotNull String prefix, int i4, boolean z3) {
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(prefix, "prefix");
        return !z3 ? str.startsWith(prefix, i4) : m8347s(str, i4, prefix, 0, prefix.length(), z3);
    }
}
