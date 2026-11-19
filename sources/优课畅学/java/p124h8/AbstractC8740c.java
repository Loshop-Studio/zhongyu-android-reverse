package p124h8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.time.DurationUnit;
import org.slf4j.Marker;
import p077d8.AbstractC8323h;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8665e0;
import p113g8.AbstractC8687z;
import p124h8.C8738a;
import p322z7.AbstractC10729c;

/* renamed from: h8.c */
/* loaded from: classes5.dex */
public abstract class AbstractC8740c {
    /* renamed from: i */
    public static final long m14377i(long j10, int i10) {
        return C8738a.m14344i((j10 << 1) + i10);
    }

    /* renamed from: j */
    public static final long m14378j(long j10) {
        return C8738a.m14344i((j10 << 1) + 1);
    }

    /* renamed from: k */
    public static final long m14379k(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? m14378j(AbstractC8323h.m13520o(j10, -4611686018427387903L, 4611686018427387903L)) : m14380l(m14382n(j10));
    }

    /* renamed from: l */
    public static final long m14380l(long j10) {
        return C8738a.m14344i(j10 << 1);
    }

    /* renamed from: m */
    public static final long m14381m(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? m14378j(m14383o(j10)) : m14380l(j10);
    }

    /* renamed from: n */
    public static final long m14382n(long j10) {
        return j10 * 1000000;
    }

    /* renamed from: o */
    public static final long m14383o(long j10) {
        return j10 / 1000000;
    }

    /* renamed from: p */
    public static final long m14384p(String str, boolean z10) {
        int i10;
        char cCharAt;
        char cCharAt2;
        int i11;
        boolean z11;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        C8738a.a aVar = C8738a.f16369b;
        long jM14366c = aVar.m14366c();
        char cCharAt3 = str.charAt(0);
        int length2 = (cCharAt3 == '+' || cCharAt3 == '-') ? 1 : 0;
        boolean z12 = length2 > 0;
        boolean z13 = z12 && AbstractC8661c0.m13961L0(str, '-', false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c10 = ':';
        char c11 = '0';
        if (str.charAt(length2) == 'P') {
            int i12 = length2 + 1;
            if (i12 == length) {
                throw new IllegalArgumentException();
            }
            boolean z14 = false;
            DurationUnit durationUnit = null;
            while (i12 < length) {
                if (str.charAt(i12) != 'T') {
                    int i13 = i12;
                    while (true) {
                        if (i13 >= str.length()) {
                            i11 = length;
                            break;
                        }
                        char cCharAt4 = str.charAt(i13);
                        if (c11 > cCharAt4 || cCharAt4 >= c10) {
                            i11 = length;
                            if (!AbstractC8661c0.m13971R("+-.", cCharAt4, false, 2, null)) {
                                break;
                            }
                        } else {
                            i11 = length;
                        }
                        i13++;
                        length = i11;
                        c11 = '0';
                        c10 = ':';
                    }
                    AbstractC9133u.m16131e(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i12, i13);
                    AbstractC9133u.m16132f(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i12 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    i12 = length3 + 1;
                    DurationUnit durationUnitM14393e = AbstractC8742e.m14393e(cCharAt5, z14);
                    if (durationUnit != null && durationUnit.compareTo(durationUnitM14393e) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iM13990e0 = AbstractC8661c0.m13990e0(strSubstring, '.', 0, false, 6, null);
                    if (durationUnitM14393e != DurationUnit.f17530e || iM13990e0 <= 0) {
                        z11 = z14;
                        jM14366c = C8738a.m14332E(jM14366c, m14388t(m14385q(strSubstring), durationUnitM14393e));
                    } else {
                        AbstractC9133u.m16131e(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iM13990e0);
                        AbstractC9133u.m16132f(strSubstring2, "substring(...)");
                        z11 = z14;
                        long jM14332E = C8738a.m14332E(jM14366c, m14388t(m14385q(strSubstring2), durationUnitM14393e));
                        AbstractC9133u.m16131e(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iM13990e0);
                        AbstractC9133u.m16132f(strSubstring3, "substring(...)");
                        jM14366c = C8738a.m14332E(jM14332E, m14386r(Double.parseDouble(strSubstring3), durationUnitM14393e));
                    }
                    z14 = z11;
                    durationUnit = durationUnitM14393e;
                    length = i11;
                    c11 = '0';
                    c10 = ':';
                } else {
                    if (z14 || (i12 = i12 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z14 = true;
                }
            }
        } else {
            if (z10) {
                throw new IllegalArgumentException();
            }
            char c12 = '0';
            if (AbstractC8687z.m14096D(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jM14366c = aVar.m14364a();
            } else {
                boolean z15 = !z12;
                if (z12 && str.charAt(length2) == '(' && AbstractC8665e0.m14032Z0(str) == ')') {
                    length2++;
                    int i14 = length - 1;
                    if (length2 == i14) {
                        throw new IllegalArgumentException("No components");
                    }
                    i10 = i14;
                    z15 = true;
                } else {
                    i10 = length;
                }
                boolean z16 = false;
                DurationUnit durationUnit2 = null;
                while (length2 < i10) {
                    if (z16 && z15) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i15 = length2;
                    while (i15 < str.length() && ((c12 <= (cCharAt2 = str.charAt(i15)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i15++;
                    }
                    AbstractC9133u.m16131e(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i15);
                    AbstractC9133u.m16132f(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i16 = length4;
                    while (i16 < str.length() && 'a' <= (cCharAt = str.charAt(i16)) && cCharAt < '{') {
                        i16++;
                    }
                    AbstractC9133u.m16131e(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i16);
                    AbstractC9133u.m16132f(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    DurationUnit durationUnitM14394f = AbstractC8742e.m14394f(strSubstring5);
                    if (durationUnit2 != null && durationUnit2.compareTo(durationUnitM14394f) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iM13990e02 = AbstractC8661c0.m13990e0(strSubstring4, '.', 0, false, 6, null);
                    if (iM13990e02 > 0) {
                        AbstractC9133u.m16131e(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iM13990e02);
                        AbstractC9133u.m16132f(strSubstring6, "substring(...)");
                        long jM14332E2 = C8738a.m14332E(jM14366c, m14388t(Long.parseLong(strSubstring6), durationUnitM14394f));
                        AbstractC9133u.m16131e(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iM13990e02);
                        AbstractC9133u.m16132f(strSubstring7, "substring(...)");
                        jM14366c = C8738a.m14332E(jM14332E2, m14386r(Double.parseDouble(strSubstring7), durationUnitM14394f));
                        if (length2 < i10) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jM14366c = C8738a.m14332E(jM14366c, m14388t(Long.parseLong(strSubstring4), durationUnitM14394f));
                    }
                    durationUnit2 = durationUnitM14394f;
                    z16 = true;
                    c12 = '0';
                }
            }
        }
        return z13 ? C8738a.m14336I(jM14366c) : jM14366c;
    }

    /* renamed from: q */
    public static final long m14385q(String str) {
        char cCharAt;
        int length = str.length();
        int i10 = (length <= 0 || !AbstractC8661c0.m13971R("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i10 > 16) {
            int i11 = i10;
            while (true) {
                if (i10 < length) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 == '0') {
                        if (i11 == i10) {
                            i11++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i10++;
                } else if (length - i11 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!AbstractC8687z.m14105M(str, Marker.ANY_NON_NULL_MARKER, false, 2, null) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(AbstractC8665e0.m14030X0(str, 1));
    }

    /* renamed from: r */
    public static final long m14386r(double d10, DurationUnit unit) {
        AbstractC9133u.m16133g(unit, "unit");
        double dM14389a = AbstractC8741d.m14389a(d10, unit, DurationUnit.f17527b);
        if (Double.isNaN(dM14389a)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jM20036e = AbstractC10729c.m20036e(dM14389a);
        return (-4611686018426999999L > jM20036e || jM20036e >= 4611686018427000000L) ? m14379k(AbstractC10729c.m20036e(AbstractC8741d.m14389a(d10, unit, DurationUnit.f17529d))) : m14380l(jM20036e);
    }

    /* renamed from: s */
    public static final long m14387s(int i10, DurationUnit unit) {
        AbstractC9133u.m16133g(unit, "unit");
        return unit.compareTo(DurationUnit.f17530e) <= 0 ? m14380l(AbstractC8741d.m14391c(i10, unit, DurationUnit.f17527b)) : m14388t(i10, unit);
    }

    /* renamed from: t */
    public static final long m14388t(long j10, DurationUnit unit) {
        AbstractC9133u.m16133g(unit, "unit");
        DurationUnit durationUnit = DurationUnit.f17527b;
        long jM14391c = AbstractC8741d.m14391c(4611686018426999999L, durationUnit, unit);
        return ((-jM14391c) > j10 || j10 > jM14391c) ? m14378j(AbstractC8323h.m13520o(AbstractC8741d.m14390b(j10, unit, DurationUnit.f17529d), -4611686018427387903L, 4611686018427387903L)) : m14380l(AbstractC8741d.m14391c(j10, unit, durationUnit));
    }
}
