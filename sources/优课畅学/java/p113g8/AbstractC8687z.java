package p113g8;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9114c0;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8773d;

/* renamed from: g8.z */
/* loaded from: classes5.dex */
public abstract class AbstractC8687z extends AbstractC8686y {
    /* renamed from: A */
    public static boolean m14093A(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: B */
    public static /* synthetic */ boolean m14094B(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m14093A(str, str2, z10);
    }

    /* renamed from: C */
    public static Comparator m14095C(C9114c0 c9114c0) {
        AbstractC9133u.m16133g(c9114c0, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        AbstractC9133u.m16132f(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    /* renamed from: D */
    public static boolean m14096D(String str, int i10, String other, int i11, int i12, boolean z10) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    /* renamed from: E */
    public static String m14097E(CharSequence charSequence, int i10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb.toString();
        AbstractC9133u.m16130d(string);
        return string;
    }

    /* renamed from: F */
    public static final String m14098F(String str, char c10, char c11, boolean z10) {
        AbstractC9133u.m16133g(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            AbstractC9133u.m16132f(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC8658b.m13946h(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* renamed from: G */
    public static final String m14099G(String str, String oldValue, String newValue, boolean z10) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(oldValue, "oldValue");
        AbstractC9133u.m16133g(newValue, "newValue");
        int i10 = 0;
        int iM13987b0 = AbstractC8661c0.m13987b0(str, oldValue, 0, z10);
        if (iM13987b0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int iM13510e = AbstractC8323h.m13510e(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i10, iM13987b0);
            sb.append(newValue);
            i10 = iM13987b0 + length;
            if (iM13987b0 >= str.length()) {
                break;
            }
            iM13987b0 = AbstractC8661c0.m13987b0(str, oldValue, iM13987b0 + iM13510e, z10);
        } while (iM13987b0 > 0);
        sb.append((CharSequence) str, i10, str.length());
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    /* renamed from: H */
    public static /* synthetic */ String m14100H(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m14098F(str, c10, c11, z10);
    }

    /* renamed from: I */
    public static /* synthetic */ String m14101I(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m14099G(str, str2, str3, z10);
    }

    /* renamed from: J */
    public static boolean m14102J(String str, String prefix, int i10, boolean z10) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : m14096D(str, i10, prefix, 0, prefix.length(), z10);
    }

    /* renamed from: K */
    public static boolean m14103K(String str, String prefix, boolean z10) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : m14096D(str, 0, prefix, 0, prefix.length(), z10);
    }

    /* renamed from: L */
    public static /* synthetic */ boolean m14104L(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m14102J(str, str2, i10, z10);
    }

    /* renamed from: M */
    public static /* synthetic */ boolean m14105M(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m14103K(str, str2, z10);
    }

    /* renamed from: u */
    public static String m14106u(char[] cArr) {
        AbstractC9133u.m16133g(cArr, "<this>");
        return new String(cArr);
    }

    /* renamed from: v */
    public static String m14107v(char[] cArr, int i10, int i11) {
        AbstractC9133u.m16133g(cArr, "<this>");
        AbstractC8773d.Companion.m14511a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    /* renamed from: w */
    public static boolean m14108w(CharSequence charSequence, CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? AbstractC8661c0.m13975T(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    /* renamed from: x */
    public static String m14109x(byte[] bArr) {
        AbstractC9133u.m16133g(bArr, "<this>");
        return new String(bArr, C8660c.f16206b);
    }

    /* renamed from: y */
    public static boolean m14110y(String str, String suffix, boolean z10) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : m14096D(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    /* renamed from: z */
    public static /* synthetic */ boolean m14111z(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m14110y(str, str2, z10);
    }
}
