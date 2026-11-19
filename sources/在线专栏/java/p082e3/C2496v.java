package p082e3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C2723g;
import kotlin.collections.C2725h;
import kotlin.collections.C2729k;
import kotlin.collections.C2731m;
import kotlin.collections.C2738t;
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014b3.C1032a;
import p014b3.C1034c;
import p014b3.C1037f;
import p077d3.C2463j;
import p077d3.InterfaceC2457d;
import p128o2.C2918k;
import p128o2.C2922o;
import p171x2.InterfaceC3470l;
import p171x2.InterfaceC3474p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e3.v */
/* loaded from: classes.dex */
public class C2496v extends C2495u {

    /* renamed from: e3.v$a */
    static final class a extends AbstractC2770m implements InterfaceC3474p<CharSequence, Integer, C2918k<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ char[] f10111a;

        /* renamed from: b */
        final /* synthetic */ boolean f10112b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z3) {
            super(2);
            this.f10111a = cArr;
            this.f10112b = z3;
        }

        @Nullable
        /* renamed from: a */
        public final C2918k<Integer, Integer> m8413a(@NotNull CharSequence $receiver, int i4) {
            C2769l.m9241e($receiver, "$this$$receiver");
            int iM8382V = C2496v.m8382V($receiver, this.f10111a, i4, this.f10112b);
            if (iM8382V < 0) {
                return null;
            }
            return C2922o.m9996a(Integer.valueOf(iM8382V), 1);
        }

        @Override // p171x2.InterfaceC3474p
        /* renamed from: d */
        public /* bridge */ /* synthetic */ C2918k<? extends Integer, ? extends Integer> mo2812d(CharSequence charSequence, Integer num) {
            return m8413a(charSequence, num.intValue());
        }
    }

    /* renamed from: e3.v$b */
    static final class b extends AbstractC2770m implements InterfaceC3474p<CharSequence, Integer, C2918k<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ List<String> f10113a;

        /* renamed from: b */
        final /* synthetic */ boolean f10114b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z3) {
            super(2);
            this.f10113a = list;
            this.f10114b = z3;
        }

        @Nullable
        /* renamed from: a */
        public final C2918k<Integer, Integer> m8414a(@NotNull CharSequence $receiver, int i4) {
            C2769l.m9241e($receiver, "$this$$receiver");
            C2918k c2918kM8373M = C2496v.m8373M($receiver, this.f10113a, i4, this.f10114b, false);
            if (c2918kM8373M == null) {
                return null;
            }
            return C2922o.m9996a(c2918kM8373M.m9987c(), Integer.valueOf(((String) c2918kM8373M.m9988d()).length()));
        }

        @Override // p171x2.InterfaceC3474p
        /* renamed from: d */
        public /* bridge */ /* synthetic */ C2918k<? extends Integer, ? extends Integer> mo2812d(CharSequence charSequence, Integer num) {
            return m8414a(charSequence, num.intValue());
        }
    }

    /* renamed from: e3.v$c */
    static final class c extends AbstractC2770m implements InterfaceC3470l<C1034c, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f10115a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f10115a = charSequence;
        }

        @Override // p171x2.InterfaceC3470l
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull C1034c it) {
            C2769l.m9241e(it, "it");
            return C2496v.m8409w0(this.f10115a, it);
        }
    }

    @NotNull
    /* renamed from: A0 */
    public static final String m8355A0(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(delimiter, "delimiter");
        C2769l.m9241e(missingDelimiterValue, "missingDelimiterValue");
        int iM8386Z = m8386Z(str, delimiter, 0, false, 6, null);
        if (iM8386Z == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM8386Z + delimiter.length(), str.length());
        C2769l.m9240d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: B0 */
    public static /* synthetic */ String m8356B0(String str, char c4, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return m8412z0(str, c4, str2);
    }

    /* renamed from: C0 */
    public static /* synthetic */ String m8357C0(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return m8355A0(str, str2, str3);
    }

    @NotNull
    /* renamed from: D0 */
    public static final String m8359D0(@NotNull String str, char c4, @NotNull String missingDelimiterValue) {
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(missingDelimiterValue, "missingDelimiterValue");
        int iM8380T = m8380T(str, c4, 0, false, 6, null);
        if (iM8380T == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM8380T);
        C2769l.m9240d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: E */
    public static final boolean m8360E(@NotNull CharSequence charSequence, char c4, boolean z3) {
        C2769l.m9241e(charSequence, "<this>");
        return m8380T(charSequence, c4, 0, z3, 2, null) >= 0;
    }

    @NotNull
    /* renamed from: E0 */
    public static final String m8361E0(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(delimiter, "delimiter");
        C2769l.m9241e(missingDelimiterValue, "missingDelimiterValue");
        int iM8381U = m8381U(str, delimiter, 0, false, 6, null);
        if (iM8381U == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM8381U);
        C2769l.m9240d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: F */
    public static final boolean m8362F(@NotNull CharSequence charSequence, @NotNull CharSequence other, boolean z3) {
        C2769l.m9241e(charSequence, "<this>");
        C2769l.m9241e(other, "other");
        if (other instanceof String) {
            if (m8381U(charSequence, (String) other, 0, z3, 2, null) >= 0) {
                return true;
            }
        } else if (m8379S(charSequence, other, 0, charSequence.length(), z3, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F0 */
    public static /* synthetic */ String m8363F0(String str, char c4, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return m8359D0(str, c4, str2);
    }

    /* renamed from: G */
    public static /* synthetic */ boolean m8364G(CharSequence charSequence, char c4, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return m8360E(charSequence, c4, z3);
    }

    /* renamed from: G0 */
    public static /* synthetic */ String m8365G0(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return m8361E0(str, str2, str3);
    }

    /* renamed from: H */
    public static /* synthetic */ boolean m8366H(CharSequence charSequence, CharSequence charSequence2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return m8362F(charSequence, charSequence2, z3);
    }

    @NotNull
    /* renamed from: H0 */
    public static CharSequence m8367H0(@NotNull CharSequence charSequence) {
        C2769l.m9241e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i4 = 0;
        boolean z3 = false;
        while (i4 <= length) {
            boolean zM8262c = C2476b.m8262c(charSequence.charAt(!z3 ? i4 : length));
            if (z3) {
                if (!zM8262c) {
                    break;
                }
                length--;
            } else if (zM8262c) {
                i4++;
            } else {
                z3 = true;
            }
        }
        return charSequence.subSequence(i4, length + 1);
    }

    /* renamed from: I */
    public static final boolean m8368I(@NotNull CharSequence charSequence, char c4, boolean z3) {
        C2769l.m9241e(charSequence, "<this>");
        return charSequence.length() > 0 && C2477c.m8263d(charSequence.charAt(m8375O(charSequence)), c4, z3);
    }

    @NotNull
    /* renamed from: I0 */
    public static String m8369I0(@NotNull String str, @NotNull char... chars) {
        CharSequence charSequenceSubSequence;
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (!C2725h.m9093m(chars, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    /* renamed from: J */
    public static final boolean m8370J(@NotNull CharSequence charSequence, @NotNull CharSequence suffix, boolean z3) {
        C2769l.m9241e(charSequence, "<this>");
        C2769l.m9241e(suffix, "suffix");
        return (!z3 && (charSequence instanceof String) && (suffix instanceof String)) ? C2495u.m8342n((String) charSequence, (String) suffix, false, 2, null) : m8394h0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z3);
    }

    /* renamed from: K */
    public static /* synthetic */ boolean m8371K(CharSequence charSequence, char c4, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return m8368I(charSequence, c4, z3);
    }

    /* renamed from: L */
    public static /* synthetic */ boolean m8372L(CharSequence charSequence, CharSequence charSequence2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return m8370J(charSequence, charSequence2, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final C2918k<Integer, String> m8373M(CharSequence charSequence, Collection<String> collection, int i4, boolean z3, boolean z4) {
        Object next;
        Object next2;
        if (!z3 && collection.size() == 1) {
            String str = (String) C2738t.m9159G(collection);
            int iM8381U = !z4 ? m8381U(charSequence, str, i4, false, 4, null) : m8386Z(charSequence, str, i4, false, 4, null);
            if (iM8381U < 0) {
                return null;
            }
            return C2922o.m9996a(Integer.valueOf(iM8381U), str);
        }
        C1032a c1034c = !z4 ? new C1034c(C1037f.m4821b(i4, 0), charSequence.length()) : C1037f.m4826g(C1037f.m4823d(i4, m8375O(charSequence)), 0);
        if (charSequence instanceof String) {
            int iM4802a = c1034c.m4802a();
            int iM4803b = c1034c.m4803b();
            int iM4804c = c1034c.m4804c();
            if ((iM4804c > 0 && iM4802a <= iM4803b) || (iM4804c < 0 && iM4803b <= iM4802a)) {
                while (true) {
                    int i5 = iM4802a + iM4804c;
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        if (C2495u.m8347s(str2, 0, (String) charSequence, iM4802a, str2.length(), z3)) {
                            break;
                        }
                    }
                    String str3 = (String) next2;
                    if (str3 != null) {
                        return C2922o.m9996a(Integer.valueOf(iM4802a), str3);
                    }
                    if (iM4802a == iM4803b) {
                        break;
                    }
                    iM4802a = i5;
                }
            }
        } else {
            int iM4802a2 = c1034c.m4802a();
            int iM4803b2 = c1034c.m4803b();
            int iM4804c2 = c1034c.m4804c();
            if ((iM4804c2 > 0 && iM4802a2 <= iM4803b2) || (iM4804c2 < 0 && iM4803b2 <= iM4802a2)) {
                while (true) {
                    int i6 = iM4802a2 + iM4804c2;
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        if (m8394h0(str4, 0, charSequence, iM4802a2, str4.length(), z3)) {
                            break;
                        }
                    }
                    String str5 = (String) next;
                    if (str5 != null) {
                        return C2922o.m9996a(Integer.valueOf(iM4802a2), str5);
                    }
                    if (iM4802a2 == iM4803b2) {
                        break;
                    }
                    iM4802a2 = i6;
                }
            }
        }
        return null;
    }

    @NotNull
    /* renamed from: N */
    public static final C1034c m8374N(@NotNull CharSequence charSequence) {
        C2769l.m9241e(charSequence, "<this>");
        return new C1034c(0, charSequence.length() - 1);
    }

    /* renamed from: O */
    public static final int m8375O(@NotNull CharSequence charSequence) {
        C2769l.m9241e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: P */
    public static final int m8376P(@NotNull CharSequence charSequence, char c4, int i4, boolean z3) {
        C2769l.m9241e(charSequence, "<this>");
        return (z3 || !(charSequence instanceof String)) ? m8382V(charSequence, new char[]{c4}, i4, z3) : ((String) charSequence).indexOf(c4, i4);
    }

    /* renamed from: Q */
    public static final int m8377Q(@NotNull CharSequence charSequence, @NotNull String string, int i4, boolean z3) {
        C2769l.m9241e(charSequence, "<this>");
        C2769l.m9241e(string, "string");
        return (z3 || !(charSequence instanceof String)) ? m8379S(charSequence, string, i4, charSequence.length(), z3, false, 16, null) : ((String) charSequence).indexOf(string, i4);
    }

    /* renamed from: R */
    private static final int m8378R(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z3, boolean z4) {
        C1032a c1034c = !z4 ? new C1034c(C1037f.m4821b(i4, 0), C1037f.m4823d(i5, charSequence.length())) : C1037f.m4826g(C1037f.m4823d(i4, m8375O(charSequence)), C1037f.m4821b(i5, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iM4802a = c1034c.m4802a();
            int iM4803b = c1034c.m4803b();
            int iM4804c = c1034c.m4804c();
            if ((iM4804c <= 0 || iM4802a > iM4803b) && (iM4804c >= 0 || iM4803b > iM4802a)) {
                return -1;
            }
            while (true) {
                int i6 = iM4802a + iM4804c;
                if (C2495u.m8347s((String) charSequence2, 0, (String) charSequence, iM4802a, charSequence2.length(), z3)) {
                    return iM4802a;
                }
                if (iM4802a == iM4803b) {
                    return -1;
                }
                iM4802a = i6;
            }
        } else {
            int iM4802a2 = c1034c.m4802a();
            int iM4803b2 = c1034c.m4803b();
            int iM4804c2 = c1034c.m4804c();
            if ((iM4804c2 <= 0 || iM4802a2 > iM4803b2) && (iM4804c2 >= 0 || iM4803b2 > iM4802a2)) {
                return -1;
            }
            while (true) {
                int i7 = iM4802a2 + iM4804c2;
                if (m8394h0(charSequence2, 0, charSequence, iM4802a2, charSequence2.length(), z3)) {
                    return iM4802a2;
                }
                if (iM4802a2 == iM4803b2) {
                    return -1;
                }
                iM4802a2 = i7;
            }
        }
    }

    /* renamed from: S */
    static /* synthetic */ int m8379S(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z3, boolean z4, int i6, Object obj) {
        return m8378R(charSequence, charSequence2, i4, i5, z3, (i6 & 16) != 0 ? false : z4);
    }

    /* renamed from: T */
    public static /* synthetic */ int m8380T(CharSequence charSequence, char c4, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return m8376P(charSequence, c4, i4, z3);
    }

    /* renamed from: U */
    public static /* synthetic */ int m8381U(CharSequence charSequence, String str, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return m8377Q(charSequence, str, i4, z3);
    }

    /* renamed from: V */
    public static final int m8382V(@NotNull CharSequence charSequence, @NotNull char[] chars, int i4, boolean z3) {
        boolean z4;
        C2769l.m9241e(charSequence, "<this>");
        C2769l.m9241e(chars, "chars");
        if (!z3 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C2725h.m9101u(chars), i4);
        }
        int iM4821b = C1037f.m4821b(i4, 0);
        int iM8375O = m8375O(charSequence);
        if (iM4821b > iM8375O) {
            return -1;
        }
        while (true) {
            int i5 = iM4821b + 1;
            char cCharAt = charSequence.charAt(iM4821b);
            int length = chars.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    z4 = false;
                    break;
                }
                char c4 = chars[i6];
                i6++;
                if (C2477c.m8263d(c4, cCharAt, z3)) {
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                return iM4821b;
            }
            if (iM4821b == iM8375O) {
                return -1;
            }
            iM4821b = i5;
        }
    }

    /* renamed from: W */
    public static final int m8383W(@NotNull CharSequence charSequence, char c4, int i4, boolean z3) {
        C2769l.m9241e(charSequence, "<this>");
        return (z3 || !(charSequence instanceof String)) ? m8387a0(charSequence, new char[]{c4}, i4, z3) : ((String) charSequence).lastIndexOf(c4, i4);
    }

    /* renamed from: X */
    public static final int m8384X(@NotNull CharSequence charSequence, @NotNull String string, int i4, boolean z3) {
        C2769l.m9241e(charSequence, "<this>");
        C2769l.m9241e(string, "string");
        return (z3 || !(charSequence instanceof String)) ? m8378R(charSequence, string, i4, 0, z3, true) : ((String) charSequence).lastIndexOf(string, i4);
    }

    /* renamed from: Y */
    public static /* synthetic */ int m8385Y(CharSequence charSequence, char c4, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = m8375O(charSequence);
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return m8383W(charSequence, c4, i4, z3);
    }

    /* renamed from: Z */
    public static /* synthetic */ int m8386Z(CharSequence charSequence, String str, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = m8375O(charSequence);
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return m8384X(charSequence, str, i4, z3);
    }

    /* renamed from: a0 */
    public static final int m8387a0(@NotNull CharSequence charSequence, @NotNull char[] chars, int i4, boolean z3) {
        C2769l.m9241e(charSequence, "<this>");
        C2769l.m9241e(chars, "chars");
        if (!z3 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(C2725h.m9101u(chars), i4);
        }
        int iM4823d = C1037f.m4823d(i4, m8375O(charSequence));
        if (iM4823d < 0) {
            return -1;
        }
        while (true) {
            int i5 = iM4823d - 1;
            char cCharAt = charSequence.charAt(iM4823d);
            int length = chars.length;
            boolean z4 = false;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                char c4 = chars[i6];
                i6++;
                if (C2477c.m8263d(c4, cCharAt, z3)) {
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                return iM4823d;
            }
            if (i5 < 0) {
                return -1;
            }
            iM4823d = i5;
        }
    }

    @NotNull
    /* renamed from: b0 */
    public static final InterfaceC2457d<String> m8388b0(@NotNull CharSequence charSequence) {
        C2769l.m9241e(charSequence, "<this>");
        return m8406t0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    @NotNull
    /* renamed from: c0 */
    public static final List<String> m8389c0(@NotNull CharSequence charSequence) {
        C2769l.m9241e(charSequence, "<this>");
        return C2463j.m8219j(m8388b0(charSequence));
    }

    /* renamed from: d0 */
    private static final InterfaceC2457d<C1034c> m8390d0(CharSequence charSequence, char[] cArr, int i4, boolean z3, int i5) {
        m8399m0(i5);
        return new C2479e(charSequence, i4, i5, new a(cArr, z3));
    }

    /* renamed from: e0 */
    private static final InterfaceC2457d<C1034c> m8391e0(CharSequence charSequence, String[] strArr, int i4, boolean z3, int i5) {
        m8399m0(i5);
        return new C2479e(charSequence, i4, i5, new b(C2723g.m9080b(strArr), z3));
    }

    /* renamed from: f0 */
    static /* synthetic */ InterfaceC2457d m8392f0(CharSequence charSequence, char[] cArr, int i4, boolean z3, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        return m8390d0(charSequence, cArr, i4, z3, i5);
    }

    /* renamed from: g0 */
    static /* synthetic */ InterfaceC2457d m8393g0(CharSequence charSequence, String[] strArr, int i4, boolean z3, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        return m8391e0(charSequence, strArr, i4, z3, i5);
    }

    /* renamed from: h0 */
    public static final boolean m8394h0(@NotNull CharSequence charSequence, int i4, @NotNull CharSequence other, int i5, int i6, boolean z3) {
        C2769l.m9241e(charSequence, "<this>");
        C2769l.m9241e(other, "other");
        if (i5 < 0 || i4 < 0 || i4 > charSequence.length() - i6 || i5 > other.length() - i6) {
            return false;
        }
        int i7 = 0;
        while (i7 < i6) {
            int i8 = i7 + 1;
            if (!C2477c.m8263d(charSequence.charAt(i4 + i7), other.charAt(i7 + i5), z3)) {
                return false;
            }
            i7 = i8;
        }
        return true;
    }

    @NotNull
    /* renamed from: i0 */
    public static String m8395i0(@NotNull String str, @NotNull CharSequence prefix) {
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(prefix, "prefix");
        if (!m8408v0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        C2769l.m9240d(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @NotNull
    /* renamed from: j0 */
    public static String m8396j0(@NotNull String str, @NotNull CharSequence suffix) {
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(suffix, "suffix");
        if (!m8372L(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        C2769l.m9240d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @NotNull
    /* renamed from: k0 */
    public static String m8397k0(@NotNull String str, @NotNull CharSequence delimiter) {
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(delimiter, "delimiter");
        return m8398l0(str, delimiter, delimiter);
    }

    @NotNull
    /* renamed from: l0 */
    public static final String m8398l0(@NotNull String str, @NotNull CharSequence prefix, @NotNull CharSequence suffix) {
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(prefix, "prefix");
        C2769l.m9241e(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !m8408v0(str, prefix, false, 2, null) || !m8372L(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        C2769l.m9240d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: m0 */
    public static final void m8399m0(int i4) {
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(C2769l.m9248l("Limit must be non-negative, but was ", Integer.valueOf(i4)).toString());
        }
    }

    @NotNull
    /* renamed from: n0 */
    public static final List<String> m8400n0(@NotNull CharSequence charSequence, @NotNull char[] delimiters, boolean z3, int i4) {
        C2769l.m9241e(charSequence, "<this>");
        C2769l.m9241e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return m8402p0(charSequence, String.valueOf(delimiters[0]), z3, i4);
        }
        Iterable iterableM8212c = C2463j.m8212c(m8392f0(charSequence, delimiters, 0, z3, i4, 2, null));
        ArrayList arrayList = new ArrayList(C2731m.m9149p(iterableM8212c, 10));
        Iterator it = iterableM8212c.iterator();
        while (it.hasNext()) {
            arrayList.add(m8409w0(charSequence, (C1034c) it.next()));
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: o0 */
    public static final List<String> m8401o0(@NotNull CharSequence charSequence, @NotNull String[] delimiters, boolean z3, int i4) {
        C2769l.m9241e(charSequence, "<this>");
        C2769l.m9241e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (!(str.length() == 0)) {
                return m8402p0(charSequence, str, z3, i4);
            }
        }
        Iterable iterableM8212c = C2463j.m8212c(m8393g0(charSequence, delimiters, 0, z3, i4, 2, null));
        ArrayList arrayList = new ArrayList(C2731m.m9149p(iterableM8212c, 10));
        Iterator it = iterableM8212c.iterator();
        while (it.hasNext()) {
            arrayList.add(m8409w0(charSequence, (C1034c) it.next()));
        }
        return arrayList;
    }

    /* renamed from: p0 */
    private static final List<String> m8402p0(CharSequence charSequence, String str, boolean z3, int i4) {
        m8399m0(i4);
        int length = 0;
        int iM8377Q = m8377Q(charSequence, str, 0, z3);
        if (iM8377Q == -1 || i4 == 1) {
            return C2729k.m9135b(charSequence.toString());
        }
        boolean z4 = i4 > 0;
        ArrayList arrayList = new ArrayList(z4 ? C1037f.m4823d(i4, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iM8377Q).toString());
            length = str.length() + iM8377Q;
            if (z4 && arrayList.size() == i4 - 1) {
                break;
            }
            iM8377Q = m8377Q(charSequence, str, length, z3);
        } while (iM8377Q != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: q0 */
    public static /* synthetic */ List m8403q0(CharSequence charSequence, char[] cArr, boolean z3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z3 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return m8400n0(charSequence, cArr, z3, i4);
    }

    /* renamed from: r0 */
    public static /* synthetic */ List m8404r0(CharSequence charSequence, String[] strArr, boolean z3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z3 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return m8401o0(charSequence, strArr, z3, i4);
    }

    @NotNull
    /* renamed from: s0 */
    public static final InterfaceC2457d<String> m8405s0(@NotNull CharSequence charSequence, @NotNull String[] delimiters, boolean z3, int i4) {
        C2769l.m9241e(charSequence, "<this>");
        C2769l.m9241e(delimiters, "delimiters");
        return C2463j.m8217h(m8393g0(charSequence, delimiters, 0, z3, i4, 2, null), new c(charSequence));
    }

    /* renamed from: t0 */
    public static /* synthetic */ InterfaceC2457d m8406t0(CharSequence charSequence, String[] strArr, boolean z3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z3 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return m8405s0(charSequence, strArr, z3, i4);
    }

    /* renamed from: u0 */
    public static final boolean m8407u0(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, boolean z3) {
        C2769l.m9241e(charSequence, "<this>");
        C2769l.m9241e(prefix, "prefix");
        return (!z3 && (charSequence instanceof String) && (prefix instanceof String)) ? C2495u.m8340C((String) charSequence, (String) prefix, false, 2, null) : m8394h0(charSequence, 0, prefix, 0, prefix.length(), z3);
    }

    /* renamed from: v0 */
    public static /* synthetic */ boolean m8408v0(CharSequence charSequence, CharSequence charSequence2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return m8407u0(charSequence, charSequence2, z3);
    }

    @NotNull
    /* renamed from: w0 */
    public static final String m8409w0(@NotNull CharSequence charSequence, @NotNull C1034c range) {
        C2769l.m9241e(charSequence, "<this>");
        C2769l.m9241e(range, "range");
        return charSequence.subSequence(range.m4810g().intValue(), range.m4809f().intValue() + 1).toString();
    }

    @NotNull
    /* renamed from: x0 */
    public static final String m8410x0(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(delimiter, "delimiter");
        C2769l.m9241e(missingDelimiterValue, "missingDelimiterValue");
        int iM8381U = m8381U(str, delimiter, 0, false, 6, null);
        if (iM8381U == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM8381U + delimiter.length(), str.length());
        C2769l.m9240d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: y0 */
    public static /* synthetic */ String m8411y0(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return m8410x0(str, str2, str3);
    }

    @NotNull
    /* renamed from: z0 */
    public static final String m8412z0(@NotNull String str, char c4, @NotNull String missingDelimiterValue) {
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(missingDelimiterValue, "missingDelimiterValue");
        int iM8385Y = m8385Y(str, c4, 0, false, 6, null);
        if (iM8385Y == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM8385Y + 1, str.length());
        C2769l.m9240d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
