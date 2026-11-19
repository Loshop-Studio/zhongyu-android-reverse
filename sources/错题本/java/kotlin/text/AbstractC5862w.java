package kotlin.text;

import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import kotlin.collections.AbstractC5786f;
import kotlin.collections.C5780c;
import kotlin.jvm.internal.AbstractC5830k;
import p204y1.AbstractC6768a;

/* renamed from: kotlin.text.w */
/* loaded from: classes4.dex */
public abstract class AbstractC5862w extends AbstractC5861v {
    /* renamed from: A */
    public static String m5407A(String str, String oldValue, String str2) {
        AbstractC5830k.m5330g(str, "<this>");
        AbstractC5830k.m5330g(oldValue, "oldValue");
        int iM5377K = AbstractC5855p.m5377K(str, oldValue, 0, false);
        if (iM5377K < 0) {
            return str;
        }
        int length = oldValue.length();
        int i = length >= 1 ? length : 1;
        int length2 = str2.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i8 = 0;
        do {
            sb.append((CharSequence) str, i8, iM5377K);
            sb.append(str2);
            i8 = iM5377K + length;
            if (iM5377K >= str.length()) {
                break;
            }
            iM5377K = AbstractC5855p.m5377K(str, oldValue, iM5377K + i, false);
        } while (iM5377K > 0);
        sb.append((CharSequence) str, i8, str.length());
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    /* renamed from: B */
    public static boolean m5408B(String str, int i, String str2, boolean z8) {
        AbstractC5830k.m5330g(str, "<this>");
        return !z8 ? str.startsWith(str2, i) : m5417x(str, i, z8, str2, 0, str2.length());
    }

    /* renamed from: C */
    public static boolean m5409C(String str, String prefix, boolean z8) {
        AbstractC5830k.m5330g(str, "<this>");
        AbstractC5830k.m5330g(prefix, "prefix");
        return !z8 ? str.startsWith(prefix) : m5417x(str, 0, z8, prefix, 0, prefix.length());
    }

    /* renamed from: D */
    public static Integer m5410D(String str) {
        boolean z8;
        int i;
        int i8;
        AbstractC5830k.m5330g(str, "<this>");
        AbstractC6768a.m6440d(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char cCharAt = str.charAt(0);
        int i10 = -2147483647;
        if (AbstractC5830k.m5332i(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z8 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i10 = Integer.MIN_VALUE;
                z8 = true;
            }
        } else {
            z8 = false;
            i = 0;
        }
        int i11 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i9 < i11 && (i11 != -59652323 || i9 < (i11 = i10 / 10))) || (i8 = i9 * 10) < i10 + iDigit) {
                return null;
            }
            i9 = i8 - iDigit;
            i++;
        }
        return z8 ? Integer.valueOf(i9) : Integer.valueOf(-i9);
    }

    /* renamed from: E */
    public static Long m5411E(String str) {
        boolean z8;
        AbstractC5830k.m5330g(str, "<this>");
        AbstractC6768a.m6440d(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j7 = -9223372036854775807L;
        if (AbstractC5830k.m5332i(cCharAt, 48) < 0) {
            z8 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z8 = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j7 = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z8 = false;
        }
        long j8 = 0;
        long j9 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j8 < j9) {
                if (j9 != -256204778801521550L) {
                    return null;
                }
                j9 = j7 / 10;
                if (j8 < j9) {
                    return null;
                }
            }
            long j10 = j8 * 10;
            long j11 = iDigit;
            if (j10 < j7 + j11) {
                return null;
            }
            j8 = j10 - j11;
            i++;
        }
        return z8 ? Long.valueOf(j8) : Long.valueOf(-j8);
    }

    /* renamed from: s */
    public static String m5412s(char[] cArr, int i, int i8) {
        C5780c c5780c = AbstractC5786f.Companion;
        int length = cArr.length;
        c5780c.getClass();
        C5780c.m5142a(i, i8, length);
        return new String(cArr, i, i8 - i);
    }

    /* renamed from: t */
    public static boolean m5413t(CharSequence charSequence, CharSequence charSequence2) {
        boolean z8 = charSequence instanceof String;
        if (z8 && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z8 && (charSequence2 instanceof String)) {
            return AbstractC5830k.m5325b(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (charSequence.charAt(i) == charSequence2.charAt(i)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static boolean m5414u(String str, String str2, boolean z8) {
        AbstractC5830k.m5330g(str, "<this>");
        return !z8 ? str.endsWith(str2) : m5417x(str, str.length() - str2.length(), true, str2, 0, str2.length());
    }

    /* renamed from: v */
    public static boolean m5415v(String str, String str2, boolean z8) {
        return str == null ? str2 == null : !z8 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: w */
    public static final void m5416w(String str) {
        throw new NumberFormatException(AbstractC1923c.m1047k('\'', "Invalid number format: '", str));
    }

    /* renamed from: x */
    public static boolean m5417x(String str, int i, boolean z8, String other, int i8, int i9) {
        AbstractC5830k.m5330g(str, "<this>");
        AbstractC5830k.m5330g(other, "other");
        return !z8 ? str.regionMatches(i, other, i8, i9) : str.regionMatches(z8, i, other, i8, i9);
    }

    /* renamed from: y */
    public static String m5418y(int i, String str) {
        AbstractC5830k.m5330g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0584a.m914o("Count 'n' must be non-negative, but was ", i, '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i8 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i9 = 0; i9 < i; i9++) {
                cArr[i9] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append((CharSequence) str);
                if (i8 == i) {
                    break;
                }
                i8++;
            }
        }
        String string = sb.toString();
        AbstractC5830k.m5327d(string);
        return string;
    }

    /* renamed from: z */
    public static String m5419z(String str, char c, char c9) {
        AbstractC5830k.m5330g(str, "<this>");
        String strReplace = str.replace(c, c9);
        AbstractC5830k.m5329f(strReplace, "replace(...)");
        return strReplace;
    }
}
