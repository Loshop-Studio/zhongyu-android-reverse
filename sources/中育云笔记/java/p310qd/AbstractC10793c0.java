package p310qd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10410o;
import p265nd.C10403h;
import p265nd.C10405j;
import p296pd.AbstractC10669q;
import p296pd.InterfaceC10659g;
import p309qc.AbstractC10776g;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10980x;

/* renamed from: qd.c0 */
/* loaded from: classes6.dex */
public abstract class AbstractC10793c0 extends AbstractC10819z {

    /* renamed from: qd.c0$a */
    public static final class a implements InterfaceC10659g {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f26027a;

        public a(CharSequence charSequence) {
            this.f26027a = charSequence;
        }

        @Override // p296pd.InterfaceC10659g
        public Iterator iterator() {
            return new C10801h(this.f26027a);
        }
    }

    /* renamed from: A0 */
    public static final String m23083A0(String str, String delimiter, String replacement, String missingDelimiterValue) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(delimiter, "delimiter");
        AbstractC9979u.m20294g(replacement, "replacement");
        AbstractC9979u.m20294g(missingDelimiterValue, "missingDelimiterValue");
        int iM23136l0 = m23136l0(str, delimiter, 0, false, 6, null);
        return iM23136l0 == -1 ? missingDelimiterValue : m23085C0(str, iM23136l0 + delimiter.length(), str.length(), replacement).toString();
    }

    /* renamed from: B0 */
    public static /* synthetic */ String m23084B0(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return m23083A0(str, str2, str3, str4);
    }

    /* renamed from: C0 */
    public static CharSequence m23085C0(CharSequence charSequence, int i10, int i11, CharSequence replacement) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        AbstractC9979u.m20294g(replacement, "replacement");
        if (i11 >= i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i10);
            AbstractC9979u.m20293f(sb2, "append(...)");
            sb2.append(replacement);
            sb2.append(charSequence, i11, charSequence.length());
            AbstractC9979u.m20293f(sb2, "append(...)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    /* renamed from: D0 */
    public static final void m23086D0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    /* renamed from: E0 */
    public static final List m23087E0(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        AbstractC9979u.m20294g(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return m23089G0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableM22576n = AbstractC10669q.m22576n(m23144t0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(iterableM22576n, 10));
        Iterator it = iterableM22576n.iterator();
        while (it.hasNext()) {
            arrayList.add(m23096N0(charSequence, (C10405j) it.next()));
        }
        return arrayList;
    }

    /* renamed from: F0 */
    public static final List m23088F0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        AbstractC9979u.m20294g(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return m23089G0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableM22576n = AbstractC10669q.m22576n(m23145u0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(iterableM22576n, 10));
        Iterator it = iterableM22576n.iterator();
        while (it.hasNext()) {
            arrayList.add(m23096N0(charSequence, (C10405j) it.next()));
        }
        return arrayList;
    }

    /* renamed from: G0 */
    public static final List m23089G0(CharSequence charSequence, String str, boolean z10, int i10) {
        m23086D0(i10);
        int length = 0;
        int iM23122b0 = m23122b0(charSequence, str, 0, z10);
        if (iM23122b0 == -1 || i10 == 1) {
            return AbstractC10976v.m24126e(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? AbstractC10410o.m21756i(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iM23122b0).toString());
            length = str.length() + iM23122b0;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iM23122b0 = m23122b0(charSequence, str, length, z10);
        } while (iM23122b0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: H0 */
    public static /* synthetic */ List m23090H0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m23087E0(charSequence, cArr, z10, i10);
    }

    /* renamed from: I0 */
    public static /* synthetic */ List m23091I0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m23088F0(charSequence, strArr, z10, i10);
    }

    /* renamed from: J0 */
    public static final boolean m23092J0(CharSequence charSequence, char c10, boolean z10) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        return charSequence.length() > 0 && AbstractC10790b.m23080h(charSequence.charAt(0), c10, z10);
    }

    /* renamed from: K0 */
    public static final boolean m23093K0(CharSequence charSequence, CharSequence prefix, boolean z10) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        AbstractC9979u.m20294g(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? AbstractC10819z.m23242O((String) charSequence, (String) prefix, false, 2, null) : m23148x0(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    /* renamed from: L0 */
    public static /* synthetic */ boolean m23094L0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m23092J0(charSequence, c10, z10);
    }

    /* renamed from: M0 */
    public static /* synthetic */ boolean m23095M0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m23093K0(charSequence, charSequence2, z10);
    }

    /* renamed from: N0 */
    public static final String m23096N0(CharSequence charSequence, C10405j range) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        AbstractC9979u.m20294g(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    /* renamed from: O0 */
    public static String m23097O0(String str, C10405j range) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(range, "range");
        String strSubstring = str.substring(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: P0 */
    public static final String m23099P0(String str, char c10, String missingDelimiterValue) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(missingDelimiterValue, "missingDelimiterValue");
        int iM23128e0 = m23128e0(str, c10, 0, false, 6, null);
        if (iM23128e0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM23128e0 + 1, str.length());
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: Q0 */
    public static final String m23101Q0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(delimiter, "delimiter");
        AbstractC9979u.m20294g(missingDelimiterValue, "missingDelimiterValue");
        int iM23130f0 = m23130f0(str, delimiter, 0, false, 6, null);
        if (iM23130f0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM23130f0 + delimiter.length(), str.length());
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: R */
    public static final boolean m23102R(CharSequence charSequence, char c10, boolean z10) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        return m23128e0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    /* renamed from: R0 */
    public static /* synthetic */ String m23103R0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m23099P0(str, c10, str2);
    }

    /* renamed from: S */
    public static boolean m23104S(CharSequence charSequence, CharSequence other, boolean z10) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        AbstractC9979u.m20294g(other, "other");
        return other instanceof String ? m23130f0(charSequence, (String) other, 0, z10, 2, null) >= 0 : m23126d0(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0;
    }

    /* renamed from: S0 */
    public static /* synthetic */ String m23105S0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m23101Q0(str, str2, str3);
    }

    /* renamed from: T */
    public static /* synthetic */ boolean m23106T(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m23102R(charSequence, c10, z10);
    }

    /* renamed from: T0 */
    public static String m23107T0(String str, char c10, String missingDelimiterValue) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(missingDelimiterValue, "missingDelimiterValue");
        int iM23135k0 = m23135k0(str, c10, 0, false, 6, null);
        if (iM23135k0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM23135k0 + 1, str.length());
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: U */
    public static /* synthetic */ boolean m23108U(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m23104S(charSequence, charSequence2, z10);
    }

    /* renamed from: U0 */
    public static final String m23109U0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(delimiter, "delimiter");
        AbstractC9979u.m20294g(missingDelimiterValue, "missingDelimiterValue");
        int iM23136l0 = m23136l0(str, delimiter, 0, false, 6, null);
        if (iM23136l0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM23136l0 + delimiter.length(), str.length());
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: V */
    public static final boolean m23110V(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return AbstractC9979u.m20289b(charSequence, charSequence2);
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

    /* renamed from: V0 */
    public static /* synthetic */ String m23111V0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m23107T0(str, c10, str2);
    }

    /* renamed from: W */
    public static final boolean m23112W(CharSequence charSequence, CharSequence suffix, boolean z10) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        AbstractC9979u.m20294g(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? AbstractC10819z.m23229B((String) charSequence, (String) suffix, false, 2, null) : m23148x0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    /* renamed from: W0 */
    public static /* synthetic */ String m23113W0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m23109U0(str, str2, str3);
    }

    /* renamed from: X */
    public static /* synthetic */ boolean m23114X(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m23112W(charSequence, charSequence2, z10);
    }

    /* renamed from: X0 */
    public static final String m23115X0(String str, char c10, String missingDelimiterValue) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(missingDelimiterValue, "missingDelimiterValue");
        int iM23128e0 = m23128e0(str, c10, 0, false, 6, null);
        if (iM23128e0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM23128e0);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: Y */
    public static final Pair m23116Y(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        CharSequence charSequence2;
        Object next;
        boolean z12;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) AbstractC10947g0.m23909K0(collection);
            int iM23130f0 = !z11 ? m23130f0(charSequence, str, i10, false, 4, null) : m23136l0(charSequence, str, i10, false, 4, null);
            if (iM23130f0 < 0) {
                return null;
            }
            return AbstractC10776g.m22975a(Integer.valueOf(iM23130f0), str);
        }
        CharSequence charSequence3 = charSequence;
        C10403h c10405j = !z11 ? new C10405j(AbstractC10410o.m21752e(i10, 0), charSequence3.length()) : AbstractC10410o.m21765r(AbstractC10410o.m21756i(i10, m23118Z(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iM21733b = c10405j.m21733b();
            int iM21734c = c10405j.m21734c();
            int iM21735d = c10405j.m21735d();
            if ((iM21735d > 0 && iM21733b <= iM21734c) || (iM21735d < 0 && iM21734c <= iM21733b)) {
                int i11 = iM21733b;
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
                        if (AbstractC10819z.m23233F(str2, 0, (String) charSequence3, i11, str2.length(), z12)) {
                            break;
                        }
                        z10 = z12;
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i11 == iM21734c) {
                            break;
                        }
                        i11 += iM21735d;
                        z10 = z12;
                    } else {
                        return AbstractC10776g.m22975a(Integer.valueOf(i11), str3);
                    }
                }
            }
        } else {
            boolean z13 = z10;
            int iM21733b2 = c10405j.m21733b();
            int iM21734c2 = c10405j.m21734c();
            int iM21735d2 = c10405j.m21735d();
            if ((iM21735d2 > 0 && iM21733b2 <= iM21734c2) || (iM21735d2 < 0 && iM21734c2 <= iM21733b2)) {
                int i12 = iM21733b2;
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
                        if (m23148x0(str4, 0, charSequence2, i12, str4.length(), z14)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i12 == iM21734c2) {
                            break;
                        }
                        i12 += iM21735d2;
                        charSequence3 = charSequence2;
                    } else {
                        return AbstractC10776g.m22975a(Integer.valueOf(i12), str5);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: Y0 */
    public static String m23117Y0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(delimiter, "delimiter");
        AbstractC9979u.m20294g(missingDelimiterValue, "missingDelimiterValue");
        int iM23130f0 = m23130f0(str, delimiter, 0, false, 6, null);
        if (iM23130f0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM23130f0);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: Z */
    public static final int m23118Z(CharSequence charSequence) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: Z0 */
    public static /* synthetic */ String m23119Z0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m23115X0(str, c10, str2);
    }

    /* renamed from: a0 */
    public static final int m23120a0(CharSequence charSequence, char c10, int i10, boolean z10) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? m23131g0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    /* renamed from: a1 */
    public static final String m23121a1(String str, char c10, String missingDelimiterValue) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(missingDelimiterValue, "missingDelimiterValue");
        int iM23135k0 = m23135k0(str, c10, 0, false, 6, null);
        if (iM23135k0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM23135k0);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: b0 */
    public static final int m23122b0(CharSequence charSequence, String string, int i10, boolean z10) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        AbstractC9979u.m20294g(string, "string");
        return (z10 || !(charSequence instanceof String)) ? m23126d0(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    /* renamed from: b1 */
    public static final String m23123b1(String str, String delimiter, String missingDelimiterValue) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(delimiter, "delimiter");
        AbstractC9979u.m20294g(missingDelimiterValue, "missingDelimiterValue");
        int iM23136l0 = m23136l0(str, delimiter, 0, false, 6, null);
        if (iM23136l0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM23136l0);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: c0 */
    public static final int m23124c0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        C10403h c10405j = !z11 ? new C10405j(AbstractC10410o.m21752e(i10, 0), AbstractC10410o.m21756i(i11, charSequence.length())) : AbstractC10410o.m21765r(AbstractC10410o.m21756i(i10, m23118Z(charSequence)), AbstractC10410o.m21752e(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iM21733b = c10405j.m21733b();
            int iM21734c = c10405j.m21734c();
            int iM21735d = c10405j.m21735d();
            if ((iM21735d <= 0 || iM21733b > iM21734c) && (iM21735d >= 0 || iM21734c > iM21733b)) {
                return -1;
            }
            int i12 = iM21733b;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z10;
                if (AbstractC10819z.m23233F(str, 0, (String) charSequence, i12, str.length(), z12)) {
                    return i12;
                }
                if (i12 == iM21734c) {
                    return -1;
                }
                i12 += iM21735d;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int iM21733b2 = c10405j.m21733b();
            int iM21734c2 = c10405j.m21734c();
            int iM21735d2 = c10405j.m21735d();
            if ((iM21735d2 <= 0 || iM21733b2 > iM21734c2) && (iM21735d2 >= 0 || iM21734c2 > iM21733b2)) {
                return -1;
            }
            int i13 = iM21733b2;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (m23148x0(charSequence4, 0, charSequence3, i13, charSequence2.length(), z14)) {
                    return i13;
                }
                if (i13 == iM21734c2) {
                    return -1;
                }
                i13 += iM21735d2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    /* renamed from: c1 */
    public static /* synthetic */ String m23125c1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m23121a1(str, c10, str2);
    }

    /* renamed from: d0 */
    public static /* synthetic */ int m23126d0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return m23124c0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    /* renamed from: d1 */
    public static /* synthetic */ String m23127d1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m23123b1(str, str2, str3);
    }

    /* renamed from: e0 */
    public static /* synthetic */ int m23128e0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m23120a0(charSequence, c10, i10, z10);
    }

    /* renamed from: e1 */
    public static CharSequence m23129e1(CharSequence charSequence) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zM23075c = AbstractC10788a.m23075c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zM23075c) {
                    break;
                }
                length--;
            } else if (zM23075c) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    /* renamed from: f0 */
    public static /* synthetic */ int m23130f0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m23122b0(charSequence, str, i10, z10);
    }

    /* renamed from: g0 */
    public static final int m23131g0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        AbstractC9979u.m20294g(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC10968r.m24066Y0(chars), i10);
        }
        int iM21752e = AbstractC10410o.m21752e(i10, 0);
        int iM23118Z = m23118Z(charSequence);
        if (iM21752e > iM23118Z) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iM21752e);
            for (char c10 : chars) {
                if (AbstractC10790b.m23080h(c10, cCharAt, z10)) {
                    return iM21752e;
                }
            }
            if (iM21752e == iM23118Z) {
                return -1;
            }
            iM21752e++;
        }
    }

    /* renamed from: h0 */
    public static boolean m23132h0(CharSequence charSequence) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!AbstractC10788a.m23075c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i0 */
    public static final int m23133i0(CharSequence charSequence, char c10, int i10, boolean z10) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? m23137m0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    /* renamed from: j0 */
    public static final int m23134j0(CharSequence charSequence, String string, int i10, boolean z10) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        AbstractC9979u.m20294g(string, "string");
        return (z10 || !(charSequence instanceof String)) ? m23124c0(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    /* renamed from: k0 */
    public static /* synthetic */ int m23135k0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m23118Z(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m23133i0(charSequence, c10, i10, z10);
    }

    /* renamed from: l0 */
    public static /* synthetic */ int m23136l0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m23118Z(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m23134j0(charSequence, str, i10, z10);
    }

    /* renamed from: m0 */
    public static final int m23137m0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        AbstractC9979u.m20294g(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC10968r.m24066Y0(chars), i10);
        }
        for (int iM21756i = AbstractC10410o.m21756i(i10, m23118Z(charSequence)); -1 < iM21756i; iM21756i--) {
            char cCharAt = charSequence.charAt(iM21756i);
            for (char c10 : chars) {
                if (AbstractC10790b.m23080h(c10, cCharAt, z10)) {
                    return iM21756i;
                }
            }
        }
        return -1;
    }

    /* renamed from: n0 */
    public static final InterfaceC10659g m23138n0(CharSequence charSequence) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        return new a(charSequence);
    }

    /* renamed from: o0 */
    public static List m23139o0(CharSequence charSequence) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        return AbstractC10669q.m22574F(m23138n0(charSequence));
    }

    /* renamed from: p0 */
    public static final CharSequence m23140p0(CharSequence charSequence, int i10, char c10) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    /* renamed from: q0 */
    public static String m23141q0(String str, int i10, char c10) {
        AbstractC9979u.m20294g(str, "<this>");
        return m23140p0(str, i10, c10).toString();
    }

    /* renamed from: r0 */
    public static final InterfaceC10659g m23142r0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        m23086D0(i11);
        return new C10794d(charSequence, i10, i11, new InterfaceC9544p() { // from class: qd.a0
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC10793c0.m23146v0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* renamed from: s0 */
    public static final InterfaceC10659g m23143s0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        m23086D0(i11);
        final List listM24014g = AbstractC10964p.m24014g(strArr);
        return new C10794d(charSequence, i10, i11, new InterfaceC9544p() { // from class: qd.b0
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC10793c0.m23147w0(listM24014g, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* renamed from: t0 */
    public static /* synthetic */ InterfaceC10659g m23144t0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m23142r0(charSequence, cArr, i10, z10, i11);
    }

    /* renamed from: u0 */
    public static /* synthetic */ InterfaceC10659g m23145u0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m23143s0(charSequence, strArr, i10, z10, i11);
    }

    /* renamed from: v0 */
    public static final Pair m23146v0(char[] cArr, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        AbstractC9979u.m20294g(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iM23131g0 = m23131g0(DelimitedRangesSequence, cArr, i10, z10);
        if (iM23131g0 < 0) {
            return null;
        }
        return AbstractC10776g.m22975a(Integer.valueOf(iM23131g0), 1);
    }

    /* renamed from: w0 */
    public static final Pair m23147w0(List list, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        AbstractC9979u.m20294g(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair pairM23116Y = m23116Y(DelimitedRangesSequence, list, i10, z10, false);
        if (pairM23116Y != null) {
            return AbstractC10776g.m22975a(pairM23116Y.m20051f(), Integer.valueOf(((String) pairM23116Y.m20052g()).length()));
        }
        return null;
    }

    /* renamed from: x0 */
    public static final boolean m23148x0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        AbstractC9979u.m20294g(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!AbstractC10790b.m23080h(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y0 */
    public static String m23149y0(String str, CharSequence prefix) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(prefix, "prefix");
        if (!m23095M0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: z0 */
    public static String m23150z0(String str, CharSequence suffix) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(suffix, "suffix");
        if (!m23114X(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        return strSubstring;
    }
}
