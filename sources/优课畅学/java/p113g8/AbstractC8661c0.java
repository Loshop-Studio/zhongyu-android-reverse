package p113g8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p077d8.C8319d;
import p077d8.C8321f;
import p101f8.AbstractC8479q;
import p101f8.InterfaceC8469g;
import p123h7.AbstractC8726f;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8811w;
import p300x7.InterfaceC10574p;

/* renamed from: g8.c0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8661c0 extends AbstractC8687z {

    /* renamed from: g8.c0$a */
    public static final class a implements InterfaceC8469g {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f16214a;

        public a(CharSequence charSequence) {
            this.f16214a = charSequence;
        }

        @Override // p101f8.InterfaceC8469g
        public Iterator iterator() {
            return new C8669h(this.f16214a);
        }
    }

    /* renamed from: A0 */
    public static final String m13950A0(String str, String delimiter, String replacement, String missingDelimiterValue) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(delimiter, "delimiter");
        AbstractC9133u.m16133g(replacement, "replacement");
        AbstractC9133u.m16133g(missingDelimiterValue, "missingDelimiterValue");
        int iM13997l0 = m13997l0(str, delimiter, 0, false, 6, null);
        return iM13997l0 == -1 ? missingDelimiterValue : m13952C0(str, iM13997l0 + delimiter.length(), str.length(), replacement).toString();
    }

    /* renamed from: B0 */
    public static /* synthetic */ String m13951B0(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return m13950A0(str, str2, str3, str4);
    }

    /* renamed from: C0 */
    public static CharSequence m13952C0(CharSequence charSequence, int i10, int i11, CharSequence replacement) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        AbstractC9133u.m16133g(replacement, "replacement");
        if (i11 >= i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i10);
            AbstractC9133u.m16132f(sb, "append(...)");
            sb.append(replacement);
            sb.append(charSequence, i11, charSequence.length());
            AbstractC9133u.m16132f(sb, "append(...)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    /* renamed from: D0 */
    public static final void m13953D0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    /* renamed from: E0 */
    public static final List m13954E0(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        AbstractC9133u.m16133g(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return m13956G0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableM13845n = AbstractC8479q.m13845n(m14005t0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(iterableM13845n, 10));
        Iterator it = iterableM13845n.iterator();
        while (it.hasNext()) {
            arrayList.add(m13964N0(charSequence, (C8321f) it.next()));
        }
        return arrayList;
    }

    /* renamed from: F0 */
    public static final List m13955F0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        AbstractC9133u.m16133g(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return m13956G0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableM13845n = AbstractC8479q.m13845n(m14006u0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(iterableM13845n, 10));
        Iterator it = iterableM13845n.iterator();
        while (it.hasNext()) {
            arrayList.add(m13964N0(charSequence, (C8321f) it.next()));
        }
        return arrayList;
    }

    /* renamed from: G0 */
    public static final List m13956G0(CharSequence charSequence, String str, boolean z10, int i10) {
        m13953D0(i10);
        int length = 0;
        int iM13987b0 = m13987b0(charSequence, str, 0, z10);
        if (iM13987b0 == -1 || i10 == 1) {
            return AbstractC8807u.m14755e(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? AbstractC8323h.m13513h(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iM13987b0).toString());
            length = str.length() + iM13987b0;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iM13987b0 = m13987b0(charSequence, str, length, z10);
        } while (iM13987b0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: H0 */
    public static /* synthetic */ List m13957H0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m13954E0(charSequence, cArr, z10, i10);
    }

    /* renamed from: I0 */
    public static /* synthetic */ List m13958I0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m13955F0(charSequence, strArr, z10, i10);
    }

    /* renamed from: J0 */
    public static final boolean m13959J0(CharSequence charSequence, char c10, boolean z10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        return charSequence.length() > 0 && AbstractC8658b.m13946h(charSequence.charAt(0), c10, z10);
    }

    /* renamed from: K0 */
    public static final boolean m13960K0(CharSequence charSequence, CharSequence prefix, boolean z10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        AbstractC9133u.m16133g(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? AbstractC8687z.m14105M((String) charSequence, (String) prefix, false, 2, null) : m14009x0(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    /* renamed from: L0 */
    public static /* synthetic */ boolean m13961L0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m13959J0(charSequence, c10, z10);
    }

    /* renamed from: M0 */
    public static /* synthetic */ boolean m13962M0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m13960K0(charSequence, charSequence2, z10);
    }

    /* renamed from: N0 */
    public static final String m13964N0(CharSequence charSequence, C8321f range) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        AbstractC9133u.m16133g(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    /* renamed from: O0 */
    public static String m13966O0(String str, C8321f range) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(range, "range");
        String strSubstring = str.substring(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: P */
    public static final boolean m13967P(CharSequence charSequence, char c10, boolean z10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        return m13990e0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    /* renamed from: P0 */
    public static final String m13968P0(String str, char c10, String missingDelimiterValue) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(missingDelimiterValue, "missingDelimiterValue");
        int iM13990e0 = m13990e0(str, c10, 0, false, 6, null);
        if (iM13990e0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM13990e0 + 1, str.length());
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: Q */
    public static boolean m13969Q(CharSequence charSequence, CharSequence other, boolean z10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        AbstractC9133u.m16133g(other, "other");
        return other instanceof String ? m13991f0(charSequence, (String) other, 0, z10, 2, null) >= 0 : m13989d0(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0;
    }

    /* renamed from: Q0 */
    public static final String m13970Q0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(delimiter, "delimiter");
        AbstractC9133u.m16133g(missingDelimiterValue, "missingDelimiterValue");
        int iM13991f0 = m13991f0(str, delimiter, 0, false, 6, null);
        if (iM13991f0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM13991f0 + delimiter.length(), str.length());
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: R */
    public static /* synthetic */ boolean m13971R(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m13967P(charSequence, c10, z10);
    }

    /* renamed from: R0 */
    public static /* synthetic */ String m13972R0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m13968P0(str, c10, str2);
    }

    /* renamed from: S */
    public static /* synthetic */ boolean m13973S(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m13969Q(charSequence, charSequence2, z10);
    }

    /* renamed from: S0 */
    public static /* synthetic */ String m13974S0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m13970Q0(str, str2, str3);
    }

    /* renamed from: T */
    public static final boolean m13975T(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return AbstractC9133u.m16128b(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: T0 */
    public static String m13976T0(String str, char c10, String missingDelimiterValue) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(missingDelimiterValue, "missingDelimiterValue");
        int iM13996k0 = m13996k0(str, c10, 0, false, 6, null);
        if (iM13996k0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM13996k0 + 1, str.length());
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: U */
    public static final boolean m13977U(CharSequence charSequence, char c10, boolean z10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        return charSequence.length() > 0 && AbstractC8658b.m13946h(charSequence.charAt(m13985Z(charSequence)), c10, z10);
    }

    /* renamed from: U0 */
    public static final String m13978U0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(delimiter, "delimiter");
        AbstractC9133u.m16133g(missingDelimiterValue, "missingDelimiterValue");
        int iM13997l0 = m13997l0(str, delimiter, 0, false, 6, null);
        if (iM13997l0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM13997l0);
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: V */
    public static final boolean m13979V(CharSequence charSequence, CharSequence suffix, boolean z10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        AbstractC9133u.m16133g(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? AbstractC8687z.m14111z((String) charSequence, (String) suffix, false, 2, null) : m14009x0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    /* renamed from: V0 */
    public static /* synthetic */ String m13980V0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m13978U0(str, str2, str3);
    }

    /* renamed from: W */
    public static /* synthetic */ boolean m13981W(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m13977U(charSequence, c10, z10);
    }

    /* renamed from: W0 */
    public static CharSequence m13982W0(CharSequence charSequence) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zM13941c = AbstractC8656a.m13941c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zM13941c) {
                    break;
                }
                length--;
            } else if (zM13941c) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    /* renamed from: X */
    public static /* synthetic */ boolean m13983X(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m13979V(charSequence, charSequence2, z10);
    }

    /* renamed from: Y */
    public static final Pair m13984Y(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        CharSequence charSequence2;
        Object next;
        boolean z12;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) AbstractC8778f0.m14532I0(collection);
            int iM13991f0 = !z11 ? m13991f0(charSequence, str, i10, false, 4, null) : m13997l0(charSequence, str, i10, false, 4, null);
            if (iM13991f0 < 0) {
                return null;
            }
            return AbstractC8726f.m14230a(Integer.valueOf(iM13991f0), str);
        }
        CharSequence charSequence3 = charSequence;
        C8319d c8321f = !z11 ? new C8321f(AbstractC8323h.m13510e(i10, 0), charSequence3.length()) : AbstractC8323h.m13522q(AbstractC8323h.m13513h(i10, m13985Z(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iM13496b = c8321f.m13496b();
            int iM13497c = c8321f.m13497c();
            int iM13498d = c8321f.m13498d();
            if ((iM13498d > 0 && iM13496b <= iM13497c) || (iM13498d < 0 && iM13497c <= iM13496b)) {
                int i11 = iM13496b;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z12 = z10;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z12 = z10;
                        if (AbstractC8687z.m14096D(str2, 0, (String) charSequence3, i11, str2.length(), z12)) {
                            break;
                        }
                        z10 = z12;
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i11 == iM13497c) {
                            break;
                        }
                        i11 += iM13498d;
                        z10 = z12;
                    } else {
                        return AbstractC8726f.m14230a(Integer.valueOf(i11), str3);
                    }
                }
            }
        } else {
            boolean z13 = z10;
            int iM13496b2 = c8321f.m13496b();
            int iM13497c2 = c8321f.m13497c();
            int iM13498d2 = c8321f.m13498d();
            if ((iM13498d2 > 0 && iM13496b2 <= iM13497c2) || (iM13498d2 < 0 && iM13497c2 <= iM13496b2)) {
                int i12 = iM13496b2;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z14 = z13;
                        charSequence2 = charSequence3;
                        z13 = z14;
                        if (m14009x0(str4, 0, charSequence2, i12, str4.length(), z14)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i12 == iM13497c2) {
                            break;
                        }
                        i12 += iM13498d2;
                        charSequence3 = charSequence2;
                    } else {
                        return AbstractC8726f.m14230a(Integer.valueOf(i12), str5);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: Z */
    public static final int m13985Z(CharSequence charSequence) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: a0 */
    public static final int m13986a0(CharSequence charSequence, char c10, int i10, boolean z10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? m13992g0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    /* renamed from: b0 */
    public static final int m13987b0(CharSequence charSequence, String string, int i10, boolean z10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        AbstractC9133u.m16133g(string, "string");
        return (z10 || !(charSequence instanceof String)) ? m13989d0(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    /* renamed from: c0 */
    public static final int m13988c0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        C8319d c8321f = !z11 ? new C8321f(AbstractC8323h.m13510e(i10, 0), AbstractC8323h.m13513h(i11, charSequence.length())) : AbstractC8323h.m13522q(AbstractC8323h.m13513h(i10, m13985Z(charSequence)), AbstractC8323h.m13510e(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iM13496b = c8321f.m13496b();
            int iM13497c = c8321f.m13497c();
            int iM13498d = c8321f.m13498d();
            if ((iM13498d <= 0 || iM13496b > iM13497c) && (iM13498d >= 0 || iM13497c > iM13496b)) {
                return -1;
            }
            int i12 = iM13496b;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z10;
                if (AbstractC8687z.m14096D(str, 0, (String) charSequence, i12, str.length(), z12)) {
                    return i12;
                }
                if (i12 == iM13497c) {
                    return -1;
                }
                i12 += iM13498d;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int iM13496b2 = c8321f.m13496b();
            int iM13497c2 = c8321f.m13497c();
            int iM13498d2 = c8321f.m13498d();
            if ((iM13498d2 <= 0 || iM13496b2 > iM13497c2) && (iM13498d2 >= 0 || iM13497c2 > iM13496b2)) {
                return -1;
            }
            int i13 = iM13496b2;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (m14009x0(charSequence4, 0, charSequence3, i13, charSequence2.length(), z14)) {
                    return i13;
                }
                if (i13 == iM13497c2) {
                    return -1;
                }
                i13 += iM13498d2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    /* renamed from: d0 */
    public static /* synthetic */ int m13989d0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return m13988c0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    /* renamed from: e0 */
    public static /* synthetic */ int m13990e0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m13986a0(charSequence, c10, i10, z10);
    }

    /* renamed from: f0 */
    public static /* synthetic */ int m13991f0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m13987b0(charSequence, str, i10, z10);
    }

    /* renamed from: g0 */
    public static final int m13992g0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        AbstractC9133u.m16133g(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC8801r.m14700c1(chars), i10);
        }
        int iM13510e = AbstractC8323h.m13510e(i10, 0);
        int iM13985Z = m13985Z(charSequence);
        if (iM13510e > iM13985Z) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iM13510e);
            for (char c10 : chars) {
                if (AbstractC8658b.m13946h(c10, cCharAt, z10)) {
                    return iM13510e;
                }
            }
            if (iM13510e == iM13985Z) {
                return -1;
            }
            iM13510e++;
        }
    }

    /* renamed from: h0 */
    public static boolean m13993h0(CharSequence charSequence) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!AbstractC8656a.m13941c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i0 */
    public static final int m13994i0(CharSequence charSequence, char c10, int i10, boolean z10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? m13998m0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    /* renamed from: j0 */
    public static final int m13995j0(CharSequence charSequence, String string, int i10, boolean z10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        AbstractC9133u.m16133g(string, "string");
        return (z10 || !(charSequence instanceof String)) ? m13988c0(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    /* renamed from: k0 */
    public static /* synthetic */ int m13996k0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m13985Z(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m13994i0(charSequence, c10, i10, z10);
    }

    /* renamed from: l0 */
    public static /* synthetic */ int m13997l0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m13985Z(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m13995j0(charSequence, str, i10, z10);
    }

    /* renamed from: m0 */
    public static final int m13998m0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        AbstractC9133u.m16133g(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC8801r.m14700c1(chars), i10);
        }
        for (int iM13513h = AbstractC8323h.m13513h(i10, m13985Z(charSequence)); -1 < iM13513h; iM13513h--) {
            char cCharAt = charSequence.charAt(iM13513h);
            for (char c10 : chars) {
                if (AbstractC8658b.m13946h(c10, cCharAt, z10)) {
                    return iM13513h;
                }
            }
        }
        return -1;
    }

    /* renamed from: n0 */
    public static final InterfaceC8469g m13999n0(CharSequence charSequence) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        return new a(charSequence);
    }

    /* renamed from: o0 */
    public static List m14000o0(CharSequence charSequence) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        return AbstractC8479q.m13843F(m13999n0(charSequence));
    }

    /* renamed from: p0 */
    public static final CharSequence m14001p0(CharSequence charSequence, int i10, char c10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    /* renamed from: q0 */
    public static String m14002q0(String str, int i10, char c10) {
        AbstractC9133u.m16133g(str, "<this>");
        return m14001p0(str, i10, c10).toString();
    }

    /* renamed from: r0 */
    public static final InterfaceC8469g m14003r0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        m13953D0(i11);
        return new C8662d(charSequence, i10, i11, new InterfaceC10574p() { // from class: g8.a0
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC8661c0.m14007v0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* renamed from: s0 */
    public static final InterfaceC8469g m14004s0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        m13953D0(i11);
        final List listM14640g = AbstractC8797p.m14640g(strArr);
        return new C8662d(charSequence, i10, i11, new InterfaceC10574p() { // from class: g8.b0
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC8661c0.m14008w0(listM14640g, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* renamed from: t0 */
    public static /* synthetic */ InterfaceC8469g m14005t0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m14003r0(charSequence, cArr, i10, z10, i11);
    }

    /* renamed from: u0 */
    public static /* synthetic */ InterfaceC8469g m14006u0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m14004s0(charSequence, strArr, i10, z10, i11);
    }

    /* renamed from: v0 */
    public static final Pair m14007v0(char[] cArr, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        AbstractC9133u.m16133g(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iM13992g0 = m13992g0(DelimitedRangesSequence, cArr, i10, z10);
        if (iM13992g0 < 0) {
            return null;
        }
        return AbstractC8726f.m14230a(Integer.valueOf(iM13992g0), 1);
    }

    /* renamed from: w0 */
    public static final Pair m14008w0(List list, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        AbstractC9133u.m16133g(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair pairM13984Y = m13984Y(DelimitedRangesSequence, list, i10, z10, false);
        if (pairM13984Y != null) {
            return AbstractC8726f.m14230a(pairM13984Y.m15906e(), Integer.valueOf(((String) pairM13984Y.m15907g()).length()));
        }
        return null;
    }

    /* renamed from: x0 */
    public static final boolean m14009x0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        AbstractC9133u.m16133g(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!AbstractC8658b.m13946h(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y0 */
    public static String m14010y0(String str, CharSequence prefix) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(prefix, "prefix");
        if (!m13962M0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: z0 */
    public static String m14011z0(String str, CharSequence suffix) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(suffix, "suffix");
        if (!m13983X(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return strSubstring;
    }
}
