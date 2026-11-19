package kotlin.text;

import android.support.v4.media.AbstractC0037f;
import android.view.viewmodel.compose.C2779a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import p101k7.C5767i;
import p200x6.C6754d;
import p200x6.C6756f;
import p204y1.AbstractC6768a;

/* renamed from: kotlin.text.p */
/* loaded from: classes4.dex */
public abstract class AbstractC5855p extends AbstractC5862w {
    /* renamed from: F */
    public static boolean m5372F(CharSequence charSequence, CharSequence other, boolean z8) {
        AbstractC5830k.m5330g(charSequence, "<this>");
        AbstractC5830k.m5330g(other, "other");
        if (other instanceof String) {
            if (m5380N(charSequence, (String) other, 0, z8, 2) >= 0) {
                return true;
            }
        } else if (m5378L(charSequence, other, 0, charSequence.length(), z8, false) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m5373G(CharSequence charSequence, char c) {
        AbstractC5830k.m5330g(charSequence, "<this>");
        return m5379M(charSequence, c, 0, 2) >= 0;
    }

    /* renamed from: H */
    public static String m5374H(int i, String str) {
        AbstractC5830k.m5330g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m82g(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(i);
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: I */
    public static boolean m5375I(CharSequence charSequence, String str) {
        AbstractC5830k.m5330g(charSequence, "<this>");
        return charSequence instanceof String ? AbstractC5862w.m5414u((String) charSequence, str, false) : m5387U(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* renamed from: J */
    public static final int m5376J(CharSequence charSequence) {
        AbstractC5830k.m5330g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: K */
    public static final int m5377K(CharSequence charSequence, String string, int i, boolean z8) {
        AbstractC5830k.m5330g(charSequence, "<this>");
        AbstractC5830k.m5330g(string, "string");
        return (z8 || !(charSequence instanceof String)) ? m5378L(charSequence, string, i, charSequence.length(), z8, false) : ((String) charSequence).indexOf(string, i);
    }

    /* renamed from: L */
    public static final int m5378L(CharSequence charSequence, CharSequence charSequence2, int i, int i8, boolean z8, boolean z9) {
        C6754d c6754d;
        CharSequence charSequence3 = charSequence2;
        int i9 = i;
        int i10 = i8;
        if (z9) {
            int iM5376J = m5376J(charSequence);
            if (i9 > iM5376J) {
                i9 = iM5376J;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            c6754d = new C6754d(i9, i10, -1);
        } else {
            if (i9 < 0) {
                i9 = 0;
            }
            int length = charSequence.length();
            if (i10 > length) {
                i10 = length;
            }
            c6754d = new C6756f(i9, i10, 1);
        }
        boolean z10 = charSequence instanceof String;
        int i11 = c6754d.f11422c;
        int i12 = c6754d.f11421b;
        int i13 = c6754d.f11420a;
        if (z10 && (charSequence3 instanceof String)) {
            if ((i11 > 0 && i13 <= i12) || (i11 < 0 && i12 <= i13)) {
                int i14 = i13;
                while (true) {
                    String str = (String) charSequence3;
                    if (!AbstractC5862w.m5417x(str, 0, z8, (String) charSequence, i14, str.length())) {
                        if (i14 == i12) {
                            break;
                        }
                        i14 += i11;
                    } else {
                        return i14;
                    }
                }
            }
        } else if ((i11 > 0 && i13 <= i12) || (i11 < 0 && i12 <= i13)) {
            int i15 = i13;
            while (!m5387U(charSequence3, 0, charSequence, i15, charSequence3.length(), z8)) {
                if (i15 != i12) {
                    i15 += i11;
                    charSequence3 = charSequence2;
                }
            }
            return i15;
        }
        return -1;
    }

    /* renamed from: M */
    public static int m5379M(CharSequence charSequence, char c, int i, int i8) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        AbstractC5830k.m5330g(charSequence, "<this>");
        return !(charSequence instanceof String) ? m5381O(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    /* renamed from: N */
    public static /* synthetic */ int m5380N(CharSequence charSequence, String str, int i, boolean z8, int i8) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return m5377K(charSequence, str, i, z8);
    }

    /* renamed from: O */
    public static final int m5381O(CharSequence charSequence, char[] cArr, int i, boolean z8) {
        AbstractC5830k.m5330g(charSequence, "<this>");
        if (!z8 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC5802q.m5198Y(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int iM5376J = m5376J(charSequence);
        if (i > iM5376J) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (AbstractC6768a.m6446k(c, cCharAt, z8)) {
                    return i;
                }
            }
            if (i == iM5376J) {
                return -1;
            }
            i++;
        }
    }

    /* renamed from: P */
    public static boolean m5382P(CharSequence charSequence) {
        AbstractC5830k.m5330g(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!AbstractC6768a.m6450o(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Q */
    public static char m5383Q(CharSequence charSequence) {
        AbstractC5830k.m5330g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(m5376J(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: R */
    public static int m5384R(int i, String str, String string) {
        int iM5376J = (i & 2) != 0 ? m5376J(str) : 0;
        AbstractC5830k.m5330g(str, "<this>");
        AbstractC5830k.m5330g(string, "string");
        return str.lastIndexOf(string, iM5376J);
    }

    /* renamed from: S */
    public static int m5385S(CharSequence charSequence, char c, int i, int i8) {
        if ((i8 & 2) != 0) {
            i = m5376J(charSequence);
        }
        AbstractC5830k.m5330g(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(AbstractC5802q.m5198Y(cArr), i);
        }
        int iM5376J = m5376J(charSequence);
        if (i > iM5376J) {
            i = iM5376J;
        }
        while (-1 < i) {
            if (AbstractC6768a.m6446k(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* renamed from: T */
    public static String m5386T(int i, String str) {
        CharSequence charSequenceSubSequence;
        AbstractC5830k.m5330g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m82g(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i8 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* renamed from: U */
    public static final boolean m5387U(CharSequence charSequence, int i, CharSequence other, int i8, int i9, boolean z8) {
        AbstractC5830k.m5330g(charSequence, "<this>");
        AbstractC5830k.m5330g(other, "other");
        if (i8 < 0 || i < 0 || i > charSequence.length() - i9 || i8 > other.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!AbstractC6768a.m6446k(charSequence.charAt(i + i10), other.charAt(i8 + i10), z8)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: V */
    public static String m5388V(String str, String prefix) {
        AbstractC5830k.m5330g(str, "<this>");
        AbstractC5830k.m5330g(prefix, "prefix");
        if (!AbstractC5862w.m5409C(str, prefix, false)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: W */
    public static CharSequence m5389W(StringBuffer stringBuffer) {
        return m5375I(stringBuffer, "+") ? stringBuffer.subSequence(0, stringBuffer.length() - 1) : stringBuffer.subSequence(0, stringBuffer.length());
    }

    /* renamed from: X */
    public static String m5390X(String str, String str2) {
        AbstractC5830k.m5330g(str, "<this>");
        if (!m5375I(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: Y */
    public static final void m5391Y(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "Limit must be non-negative, but was ").toString());
        }
    }

    /* renamed from: Z */
    public static final List m5392Z(CharSequence charSequence, String str) {
        m5391Y(0);
        int iM5377K = m5377K(charSequence, str, 0, false);
        if (iM5377K == -1) {
            return AbstractC5806u.m5286y(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM5377K).toString());
            length = str.length() + iM5377K;
            iM5377K = m5377K(charSequence, str, length, false);
        } while (iM5377K != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: a0 */
    public static List m5393a0(String str, char[] cArr) {
        AbstractC5830k.m5330g(str, "<this>");
        if (cArr.length == 1) {
            return m5392Z(str, String.valueOf(cArr[0]));
        }
        m5391Y(0);
        C5767i c5767i = new C5767i(new C5842c(str, new C2779a(cArr, 2)), 7);
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(c5767i, 10));
        Iterator it = c5767i.iterator();
        while (true) {
            C5841b c5841b = (C5841b) it;
            if (!c5841b.hasNext()) {
                return arrayList;
            }
            C6756f range = (C6756f) c5841b.next();
            AbstractC5830k.m5330g(range, "range");
            arrayList.add(str.subSequence(range.f11420a, range.f11421b + 1).toString());
        }
    }

    /* renamed from: b0 */
    public static List m5394b0(String str, String[] strArr) {
        AbstractC5830k.m5330g(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return m5392Z(str, str2);
            }
        }
        m5391Y(0);
        C5767i c5767i = new C5767i(new C5842c(str, new C2779a(AbstractC5802q.m5208u(strArr), 3)), 7);
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(c5767i, 10));
        Iterator it = c5767i.iterator();
        while (true) {
            C5841b c5841b = (C5841b) it;
            if (!c5841b.hasNext()) {
                return arrayList;
            }
            C6756f range = (C6756f) c5841b.next();
            AbstractC5830k.m5330g(range, "range");
            arrayList.add(str.subSequence(range.f11420a, range.f11421b + 1).toString());
        }
    }

    /* renamed from: c0 */
    public static String m5395c0(char c, String str, String str2) {
        int iM5379M = m5379M(str, c, 0, 6);
        if (iM5379M == -1) {
            return str2;
        }
        String strSubstring = str.substring(iM5379M + 1, str.length());
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: d0 */
    public static String m5396d0(String str, String delimiter) {
        AbstractC5830k.m5330g(delimiter, "delimiter");
        int iM5380N = m5380N(str, delimiter, 0, false, 6);
        if (iM5380N == -1) {
            return str;
        }
        String strSubstring = str.substring(delimiter.length() + iM5380N, str.length());
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: e0 */
    public static String m5397e0(char c, String str, String str2) {
        AbstractC5830k.m5330g(str, "<this>");
        int iM5385S = m5385S(str, c, 0, 6);
        if (iM5385S == -1) {
            return str2;
        }
        String strSubstring = str.substring(iM5385S + 1, str.length());
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: f0 */
    public static String m5398f0(String missingDelimiterValue, char c) {
        AbstractC5830k.m5330g(missingDelimiterValue, "<this>");
        AbstractC5830k.m5330g(missingDelimiterValue, "missingDelimiterValue");
        int iM5379M = m5379M(missingDelimiterValue, c, 0, 6);
        if (iM5379M == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iM5379M);
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: g0 */
    public static String m5399g0(String str, String str2) {
        int iM5380N = m5380N(str, str2, 0, false, 6);
        if (iM5380N == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iM5380N);
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: h0 */
    public static String m5400h0(String missingDelimiterValue, char c) {
        AbstractC5830k.m5330g(missingDelimiterValue, "<this>");
        AbstractC5830k.m5330g(missingDelimiterValue, "missingDelimiterValue");
        int iM5385S = m5385S(missingDelimiterValue, c, 0, 6);
        if (iM5385S == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iM5385S);
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: i0 */
    public static String m5401i0(int i, String str) {
        AbstractC5830k.m5330g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m82g(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: j0 */
    public static void m5402j0(CharSequence charSequence, PersistentCollection.Builder destination) {
        AbstractC5830k.m5330g(charSequence, "<this>");
        AbstractC5830k.m5330g(destination, "destination");
        for (int i = 0; i < charSequence.length(); i++) {
            destination.add(Character.valueOf(charSequence.charAt(i)));
        }
    }

    /* renamed from: k0 */
    public static CharSequence m5403k0(CharSequence charSequence) {
        AbstractC5830k.m5330g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z8 = false;
        while (i <= length) {
            boolean zM6450o = AbstractC6768a.m6450o(charSequence.charAt(!z8 ? i : length));
            if (z8) {
                if (!zM6450o) {
                    break;
                }
                length--;
            } else if (zM6450o) {
                i++;
            } else {
                z8 = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
