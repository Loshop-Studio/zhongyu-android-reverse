package p160d.p167i;

import p070b.p113c.p114a.C0787a;
import p160d.p162f.p164b.C1011d;
import p160d.p165g.C1015a;
import p160d.p165g.C1017c;

/* renamed from: d.i.g */
/* loaded from: classes.dex */
public class C1026g extends C1025f {
    /* renamed from: a */
    public static boolean m2818a(CharSequence charSequence, char c2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        C1011d.m2809e(charSequence, "$this$contains");
        return m2825h(charSequence, c2, 0, z, 2) >= 0;
    }

    /* renamed from: b */
    public static boolean m2819b(CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        boolean z2 = (i & 2) != 0 ? false : z;
        C1011d.m2809e(charSequence, "$this$contains");
        C1011d.m2809e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m2822e(charSequence, (String) charSequence2, 0, z2) < 0) {
                return false;
            }
        } else if (m2824g(charSequence, charSequence2, 0, charSequence.length(), z2, false, 16) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m2820c(String str, String str2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        C1011d.m2809e(str, "$this$endsWith");
        C1011d.m2809e(str2, "suffix");
        return !z ? str.endsWith(str2) : m2826i(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: d */
    public static final int m2821d(CharSequence charSequence) {
        C1011d.m2809e(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: e */
    public static final int m2822e(CharSequence charSequence, String str, int i, boolean z) {
        C1011d.m2809e(charSequence, "$this$indexOf");
        C1011d.m2809e(str, "string");
        return (z || !(charSequence instanceof String)) ? m2824g(charSequence, str, i, charSequence.length(), z, false, 16) : ((String) charSequence).indexOf(str, i);
    }

    /* renamed from: f */
    public static final int m2823f(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C1015a c1015a;
        if (z2) {
            int iM2821d = m2821d(charSequence);
            if (i > iM2821d) {
                i = iM2821d;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            c1015a = new C1015a(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c1015a = new C1017c(i, i2);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i3 = c1015a.f5485b;
            int i4 = c1015a.f5486c;
            int i5 = c1015a.f5487d;
            if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
                while (!m2826i((String) charSequence2, 0, (String) charSequence, i3, charSequence2.length(), z)) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                return i3;
            }
        } else {
            int i6 = c1015a.f5485b;
            int i7 = c1015a.f5486c;
            int i8 = c1015a.f5487d;
            if (i8 < 0 ? i6 >= i7 : i6 <= i7) {
                while (!m2827j(charSequence2, 0, charSequence, i6, charSequence2.length(), z)) {
                    if (i6 != i7) {
                        i6 += i8;
                    }
                }
                return i6;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public static /* synthetic */ int m2824g(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return m2823f(charSequence, charSequence2, i, i2, z, z2);
    }

    /* renamed from: h */
    public static int m2825h(CharSequence charSequence, char c2, int i, boolean z, int i2) {
        boolean z2;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        C1011d.m2809e(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c2, i);
        }
        char[] cArr = {c2};
        C1011d.m2809e(charSequence, "$this$indexOfAny");
        C1011d.m2809e(cArr, "chars");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C0787a.m2466F(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int iM2821d = m2821d(charSequence);
        if (i <= iM2821d) {
            while (true) {
                char cCharAt = charSequence.charAt(i);
                int i3 = 0;
                while (true) {
                    if (i3 >= 1) {
                        z2 = false;
                        break;
                    }
                    if (C0787a.m2475i(cArr[i3], cCharAt, z)) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
                if (!z2) {
                    if (i == iM2821d) {
                        break;
                    }
                    i++;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: i */
    public static final boolean m2826i(String str, int i, String str2, int i2, int i3, boolean z) {
        C1011d.m2809e(str, "$this$regionMatches");
        C1011d.m2809e(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: j */
    public static final boolean m2827j(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C1011d.m2809e(charSequence, "$this$regionMatchesImpl");
        C1011d.m2809e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C0787a.m2475i(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static String m2828k(String str, String str2, String str3, boolean z, int i) {
        int i2 = 0;
        if ((i & 4) != 0) {
            z = false;
        }
        C1011d.m2809e(str, "$this$replace");
        C1011d.m2809e(str2, "oldValue");
        C1011d.m2809e(str3, "newValue");
        int iM2822e = m2822e(str, str2, 0, z);
        if (iM2822e < 0) {
            return str;
        }
        int length = str2.length();
        int i3 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i2, iM2822e);
            sb.append(str3);
            i2 = iM2822e + length;
            if (iM2822e >= str.length()) {
                break;
            }
            iM2822e = m2822e(str, str2, iM2822e + i3, z);
        } while (iM2822e > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        C1011d.m2808d(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    /* renamed from: l */
    public static boolean m2829l(String str, String str2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        C1011d.m2809e(str, "$this$startsWith");
        C1011d.m2809e(str2, "prefix");
        return !z2 ? str.startsWith(str2) : m2826i(str, 0, str2, 0, str2.length(), z2);
    }
}
