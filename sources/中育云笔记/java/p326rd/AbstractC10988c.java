package p326rd;

import kotlin.jvm.internal.AbstractC9979u;
import kotlin.time.DurationUnit;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p211jd.AbstractC9719c;
import p265nd.AbstractC10410o;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10797e0;
import p310qd.AbstractC10819z;
import p326rd.C10986a;

/* renamed from: rd.c */
/* loaded from: classes6.dex */
public abstract class AbstractC10988c {
    /* renamed from: i */
    public static final long m24218i(long j10, int i10) {
        return C10986a.m24185i((j10 << 1) + i10);
    }

    /* renamed from: j */
    public static final long m24219j(long j10) {
        return C10986a.m24185i((j10 << 1) + 1);
    }

    /* renamed from: k */
    public static final long m24220k(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? m24219j(AbstractC10410o.m21763p(j10, -4611686018427387903L, 4611686018427387903L)) : m24221l(m24223n(j10));
    }

    /* renamed from: l */
    public static final long m24221l(long j10) {
        return C10986a.m24185i(j10 << 1);
    }

    /* renamed from: m */
    public static final long m24222m(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? m24219j(m24224o(j10)) : m24221l(j10);
    }

    /* renamed from: n */
    public static final long m24223n(long j10) {
        return j10 * 1000000;
    }

    /* renamed from: o */
    public static final long m24224o(long j10) {
        return j10 / 1000000;
    }

    /* renamed from: p */
    public static final long m24225p(String str, boolean z10) {
        int i10;
        char cCharAt;
        char cCharAt2;
        int i11;
        boolean z11;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        C10986a.a aVar = C10986a.f26491d;
        long jM24207c = aVar.m24207c();
        char cCharAt3 = str.charAt(0);
        int length2 = (cCharAt3 == '+' || cCharAt3 == '-') ? 1 : 0;
        boolean z12 = length2 > 0;
        boolean z13 = z12 && AbstractC10793c0.m23094L0(str, '-', false, 2, null);
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
                            if (!AbstractC10793c0.m23106T("+-.", cCharAt4, false, 2, null)) {
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
                    AbstractC9979u.m20292e(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i12, i13);
                    AbstractC9979u.m20293f(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i12 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    i12 = length3 + 1;
                    DurationUnit durationUnitM24234e = AbstractC10990e.m24234e(cCharAt5, z14);
                    if (durationUnit != null && durationUnit.compareTo(durationUnitM24234e) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iM23128e0 = AbstractC10793c0.m23128e0(strSubstring, '.', 0, false, 6, null);
                    if (durationUnitM24234e != DurationUnit.f23459g || iM23128e0 <= 0) {
                        z11 = z14;
                        jM24207c = C10986a.m24173E(jM24207c, m24229t(m24226q(strSubstring), durationUnitM24234e));
                    } else {
                        AbstractC9979u.m20292e(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iM23128e0);
                        AbstractC9979u.m20293f(strSubstring2, "substring(...)");
                        z11 = z14;
                        long jM24173E = C10986a.m24173E(jM24207c, m24229t(m24226q(strSubstring2), durationUnitM24234e));
                        AbstractC9979u.m20292e(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iM23128e0);
                        AbstractC9979u.m20293f(strSubstring3, "substring(...)");
                        jM24207c = C10986a.m24173E(jM24173E, m24227r(Double.parseDouble(strSubstring3), durationUnitM24234e));
                    }
                    z14 = z11;
                    durationUnit = durationUnitM24234e;
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
            if (AbstractC10819z.m23233F(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jM24207c = aVar.m24205a();
            } else {
                boolean z15 = !z12;
                if (z12 && str.charAt(length2) == '(' && AbstractC10797e0.m23171h1(str) == ')') {
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
                    AbstractC9979u.m20292e(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i15);
                    AbstractC9979u.m20293f(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i16 = length4;
                    while (i16 < str.length() && 'a' <= (cCharAt = str.charAt(i16)) && cCharAt < '{') {
                        i16++;
                    }
                    AbstractC9979u.m20292e(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i16);
                    AbstractC9979u.m20293f(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    DurationUnit durationUnitM24235f = AbstractC10990e.m24235f(strSubstring5);
                    if (durationUnit2 != null && durationUnit2.compareTo(durationUnitM24235f) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iM23128e02 = AbstractC10793c0.m23128e0(strSubstring4, '.', 0, false, 6, null);
                    if (iM23128e02 > 0) {
                        AbstractC9979u.m20292e(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iM23128e02);
                        AbstractC9979u.m20293f(strSubstring6, "substring(...)");
                        long jM24173E2 = C10986a.m24173E(jM24207c, m24229t(Long.parseLong(strSubstring6), durationUnitM24235f));
                        AbstractC9979u.m20292e(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iM23128e02);
                        AbstractC9979u.m20293f(strSubstring7, "substring(...)");
                        jM24207c = C10986a.m24173E(jM24173E2, m24227r(Double.parseDouble(strSubstring7), durationUnitM24235f));
                        if (length2 < i10) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jM24207c = C10986a.m24173E(jM24207c, m24229t(Long.parseLong(strSubstring4), durationUnitM24235f));
                    }
                    durationUnit2 = durationUnitM24235f;
                    z16 = true;
                    c12 = '0';
                }
            }
        }
        return z13 ? C10986a.m24177I(jM24207c) : jM24207c;
    }

    /* renamed from: q */
    public static final long m24226q(String str) {
        char cCharAt;
        int length = str.length();
        int i10 = (length <= 0 || !AbstractC10793c0.m23106T("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
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
        return (!AbstractC10819z.m23242O(str, MqttTopic.SINGLE_LEVEL_WILDCARD, false, 2, null) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(AbstractC10797e0.m23169f1(str, 1));
    }

    /* renamed from: r */
    public static final long m24227r(double d10, DurationUnit unit) {
        AbstractC9979u.m20294g(unit, "unit");
        double dM24230a = AbstractC10989d.m24230a(d10, unit, DurationUnit.f23456d);
        if (Double.isNaN(dM24230a)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jM19283e = AbstractC9719c.m19283e(dM24230a);
        return (-4611686018426999999L > jM19283e || jM19283e >= 4611686018427000000L) ? m24220k(AbstractC9719c.m19283e(AbstractC10989d.m24230a(d10, unit, DurationUnit.f23458f))) : m24221l(jM19283e);
    }

    /* renamed from: s */
    public static final long m24228s(int i10, DurationUnit unit) {
        AbstractC9979u.m20294g(unit, "unit");
        return unit.compareTo(DurationUnit.f23459g) <= 0 ? m24221l(AbstractC10989d.m24232c(i10, unit, DurationUnit.f23456d)) : m24229t(i10, unit);
    }

    /* renamed from: t */
    public static final long m24229t(long j10, DurationUnit unit) {
        AbstractC9979u.m20294g(unit, "unit");
        DurationUnit durationUnit = DurationUnit.f23456d;
        long jM24232c = AbstractC10989d.m24232c(4611686018426999999L, durationUnit, unit);
        return ((-jM24232c) > j10 || j10 > jM24232c) ? m24219j(AbstractC10410o.m21763p(AbstractC10989d.m24231b(j10, unit, DurationUnit.f23458f), -4611686018427387903L, 4611686018427387903L)) : m24221l(AbstractC10989d.m24232c(j10, unit, durationUnit));
    }
}
