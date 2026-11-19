package p008a7;

import coil3.network.AbstractC3315g;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlin.time.DurationUnit;
import p073h4.AbstractC5625a;

/* renamed from: a7.a */
/* loaded from: classes4.dex */
public final class C0019a implements Comparable {

    /* renamed from: b */
    public static final long f55b;

    /* renamed from: c */
    public static final long f56c;

    /* renamed from: d */
    public static final /* synthetic */ int f57d = 0;

    /* renamed from: a */
    public final long f58a;

    static {
        int i = AbstractC0020b.f59a;
        f55b = AbstractC3315g.m2239g(4611686018427387903L);
        f56c = AbstractC3315g.m2239g(-4611686018427387903L);
    }

    /* renamed from: a */
    public static final long m62a(long j7, long j8) {
        long j9 = 1000000;
        long j10 = j8 / j9;
        long j11 = j7 + j10;
        if (-4611686018426L > j11 || j11 >= 4611686018427L) {
            return AbstractC3315g.m2239g(AbstractC5806u.m5275n(j11, -4611686018427387903L, 4611686018427387903L));
        }
        return AbstractC3315g.m2241i((j11 * j9) + (j8 - (j10 * j9)));
    }

    /* renamed from: b */
    public static final void m63b(StringBuilder sb, int i, int i8, int i9, String str, boolean z8) {
        sb.append(i);
        if (i8 != 0) {
            sb.append('.');
            String strM5386T = AbstractC5855p.m5386T(i9, String.valueOf(i8));
            int i10 = -1;
            int length = strM5386T.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (strM5386T.charAt(length) != '0') {
                        i10 = length;
                        break;
                    } else if (i11 < 0) {
                        break;
                    } else {
                        length = i11;
                    }
                }
            }
            int i12 = i10 + 1;
            if (z8 || i12 >= 3) {
                sb.append((CharSequence) strM5386T, 0, ((i10 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strM5386T, 0, i12);
            }
        }
        sb.append(str);
    }

    /* renamed from: c */
    public static final long m64c(long j7) {
        long j8 = j7 >> 1;
        if ((((int) j7) & 1) == 0) {
            return j8;
        }
        if (j8 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j8 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return j8 * 1000000;
    }

    /* renamed from: d */
    public static final int m65d(long j7) {
        if (m66e(j7)) {
            return 0;
        }
        return (int) ((((int) j7) & 1) == 1 ? ((j7 >> 1) % 1000) * 1000000 : (j7 >> 1) % 1000000000);
    }

    /* renamed from: e */
    public static final boolean m66e(long j7) {
        return j7 == f55b || j7 == f56c;
    }

    /* renamed from: f */
    public static final long m67f(long j7, long j8) {
        if (m66e(j7)) {
            if (!m66e(j8) || (j8 ^ j7) >= 0) {
                return j7;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m66e(j8)) {
            return j8;
        }
        int i = ((int) j7) & 1;
        if (i != (((int) j8) & 1)) {
            return i == 1 ? m62a(j7 >> 1, j8 >> 1) : m62a(j8 >> 1, j7 >> 1);
        }
        long j9 = (j7 >> 1) + (j8 >> 1);
        return i == 0 ? (-4611686018426999999L > j9 || j9 >= 4611686018427000000L) ? AbstractC3315g.m2239g(j9 / 1000000) : AbstractC3315g.m2241i(j9) : AbstractC3315g.m2240h(j9);
    }

    /* renamed from: g */
    public static final long m68g(long j7, DurationUnit unit) {
        AbstractC5830k.m5330g(unit, "unit");
        if (j7 == f55b) {
            return Long.MAX_VALUE;
        }
        if (j7 == f56c) {
            return Long.MIN_VALUE;
        }
        return AbstractC5625a.m4945e(j7 >> 1, (((int) j7) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS, unit);
    }

    /* renamed from: h */
    public static final long m69h(long j7) {
        long j8 = ((-(j7 >> 1)) << 1) + (((int) j7) & 1);
        int i = AbstractC0020b.f59a;
        return j8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j7 = ((C0019a) obj).f58a;
        long j8 = this.f58a;
        long j9 = j8 ^ j7;
        if (j9 < 0 || (((int) j9) & 1) == 0) {
            return AbstractC5830k.m5333j(j8, j7);
        }
        int i = (((int) j8) & 1) - (((int) j7) & 1);
        return j8 < 0 ? -i : i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0019a) {
            return this.f58a == ((C0019a) obj).f58a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f58a);
    }

    public final String toString() {
        long j7;
        int iM68g;
        long jM69h = this.f58a;
        if (jM69h == 0) {
            return "0s";
        }
        if (jM69h == f55b) {
            return "Infinity";
        }
        if (jM69h == f56c) {
            return "-Infinity";
        }
        int i = 0;
        boolean z8 = jM69h < 0;
        StringBuilder sb = new StringBuilder();
        if (z8) {
            sb.append('-');
        }
        if (jM69h < 0) {
            jM69h = m69h(jM69h);
        }
        long jM68g = m68g(jM69h, DurationUnit.DAYS);
        int iM68g2 = m66e(jM69h) ? 0 : (int) (m68g(jM69h, DurationUnit.HOURS) % 24);
        if (m66e(jM69h)) {
            j7 = 0;
            iM68g = 0;
        } else {
            j7 = 0;
            iM68g = (int) (m68g(jM69h, DurationUnit.MINUTES) % 60);
        }
        int iM68g3 = m66e(jM69h) ? 0 : (int) (m68g(jM69h, DurationUnit.SECONDS) % 60);
        int iM65d = m65d(jM69h);
        boolean z9 = jM68g != j7;
        boolean z10 = iM68g2 != 0;
        boolean z11 = iM68g != 0;
        boolean z12 = (iM68g3 == 0 && iM65d == 0) ? false : true;
        if (z9) {
            sb.append(jM68g);
            sb.append('d');
            i = 1;
        }
        if (z10 || (z9 && (z11 || z12))) {
            int i8 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM68g2);
            sb.append('h');
            i = i8;
        }
        if (z11 || (z12 && (z10 || z9))) {
            int i9 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM68g);
            sb.append('m');
            i = i9;
        }
        if (z12) {
            int i10 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM68g3 != 0 || z9 || z10 || z11) {
                m63b(sb, iM68g3, iM65d, 9, "s", false);
            } else if (iM65d >= 1000000) {
                m63b(sb, iM65d / 1000000, iM65d % 1000000, 6, "ms", false);
            } else if (iM65d >= 1000) {
                m63b(sb, iM65d / 1000, iM65d % 1000, 3, "us", false);
            } else {
                sb.append(iM65d);
                sb.append("ns");
            }
            i = i10;
        }
        if (z8 && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
