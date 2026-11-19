package p326rd;

import androidx.collection.SieveCacheKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.time.DurationUnit;
import p265nd.AbstractC10410o;
import p310qd.AbstractC10793c0;

/* renamed from: rd.a */
/* loaded from: classes6.dex */
public final class C10986a implements Comparable {

    /* renamed from: d */
    public static final a f26491d = new a(null);

    /* renamed from: e */
    public static final long f26492e = m24185i(0);

    /* renamed from: f */
    public static final long f26493f = AbstractC10988c.m24219j(4611686018427387903L);

    /* renamed from: g */
    public static final long f26494g = AbstractC10988c.m24219j(-4611686018427387903L);

    /* renamed from: c */
    public final long f26495c;

    /* renamed from: rd.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final long m24205a() {
            return C10986a.f26493f;
        }

        /* renamed from: b */
        public final long m24206b() {
            return C10986a.f26494g;
        }

        /* renamed from: c */
        public final long m24207c() {
            return C10986a.f26492e;
        }

        /* renamed from: d */
        public final long m24208d(String value) {
            AbstractC9979u.m20294g(value, "value");
            try {
                return AbstractC10988c.m24225p(value, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e10);
            }
        }

        public a() {
        }
    }

    public /* synthetic */ C10986a(long j10) {
        this.f26495c = j10;
    }

    /* renamed from: A */
    public static final boolean m24169A(long j10) {
        return (((int) j10) & 1) == 0;
    }

    /* renamed from: B */
    public static final boolean m24170B(long j10) {
        return j10 == f26493f || j10 == f26494g;
    }

    /* renamed from: C */
    public static final boolean m24171C(long j10) {
        return j10 < 0;
    }

    /* renamed from: D */
    public static final boolean m24172D(long j10) {
        return j10 > 0;
    }

    /* renamed from: E */
    public static final long m24173E(long j10, long j11) {
        if (m24170B(j10)) {
            if (m24201y(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m24170B(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return m24202z(j10) ? m24181d(j10, m24199w(j10), m24199w(j11)) : m24181d(j10, m24199w(j11), m24199w(j10));
        }
        long jM24199w = m24199w(j10) + m24199w(j11);
        return m24169A(j10) ? AbstractC10988c.m24222m(jM24199w) : AbstractC10988c.m24220k(jM24199w);
    }

    /* renamed from: F */
    public static final String m24174F(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (m24171C(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jM24187k = m24187k(j10);
        long jM24190n = m24190n(jM24187k);
        int iM24195s = m24195s(jM24187k);
        int iM24197u = m24197u(jM24187k);
        int iM24196t = m24196t(jM24187k);
        long j11 = m24170B(j10) ? 9999999999999L : jM24190n;
        boolean z10 = false;
        boolean z11 = j11 != 0;
        boolean z12 = (iM24197u == 0 && iM24196t == 0) ? false : true;
        if (iM24195s != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iM24195s);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            m24182e(j10, sb2, iM24197u, iM24196t, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb2.toString();
    }

    /* renamed from: G */
    public static final long m24175G(long j10, DurationUnit unit) {
        AbstractC9979u.m20294g(unit, "unit");
        if (j10 == f26493f) {
            return Long.MAX_VALUE;
        }
        if (j10 == f26494g) {
            return Long.MIN_VALUE;
        }
        return AbstractC10989d.m24231b(m24199w(j10), m24198v(j10), unit);
    }

    /* renamed from: H */
    public static String m24176H(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f26493f) {
            return "Infinity";
        }
        if (j10 == f26494g) {
            return "-Infinity";
        }
        boolean zM24171C = m24171C(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zM24171C) {
            sb2.append('-');
        }
        long jM24187k = m24187k(j10);
        long jM24189m = m24189m(jM24187k);
        int iM24188l = m24188l(jM24187k);
        int iM24195s = m24195s(jM24187k);
        int iM24197u = m24197u(jM24187k);
        int iM24196t = m24196t(jM24187k);
        int i10 = 0;
        boolean z10 = jM24189m != 0;
        boolean z11 = iM24188l != 0;
        boolean z12 = iM24195s != 0;
        boolean z13 = (iM24197u == 0 && iM24196t == 0) ? false : true;
        if (z10) {
            sb2.append(jM24189m);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM24188l);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM24195s);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iM24197u != 0 || z10 || z11 || z12) {
                m24182e(j10, sb2, iM24197u, iM24196t, 9, "s", false);
            } else if (iM24196t >= 1000000) {
                m24182e(j10, sb2, iM24196t / 1000000, iM24196t % 1000000, 6, "ms", false);
            } else if (iM24196t >= 1000) {
                m24182e(j10, sb2, iM24196t / 1000, iM24196t % 1000, 3, "us", false);
            } else {
                sb2.append(iM24196t);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zM24171C && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    /* renamed from: I */
    public static final long m24177I(long j10) {
        return AbstractC10988c.m24218i(-m24199w(j10), ((int) j10) & 1);
    }

    /* renamed from: d */
    public static final long m24181d(long j10, long j11, long j12) {
        long jM24224o = AbstractC10988c.m24224o(j12);
        long j13 = j11 + jM24224o;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return AbstractC10988c.m24219j(AbstractC10410o.m21763p(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return AbstractC10988c.m24221l(AbstractC10988c.m24223n(j13) + (j12 - AbstractC10988c.m24223n(jM24224o)));
    }

    /* renamed from: e */
    public static final void m24182e(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strM23141q0 = AbstractC10793c0.m23141q0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strM23141q0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strM23141q0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strM23141q0, 0, ((i13 + 3) / 3) * 3);
                AbstractC9979u.m20293f(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strM23141q0, 0, i15);
                AbstractC9979u.m20293f(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    /* renamed from: f */
    public static final /* synthetic */ C10986a m24183f(long j10) {
        return new C10986a(j10);
    }

    /* renamed from: h */
    public static int m24184h(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return AbstractC9979u.m20297j(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return m24171C(j10) ? -i10 : i10;
    }

    /* renamed from: i */
    public static long m24185i(long j10) {
        if (!AbstractC10987b.m24209a()) {
            return j10;
        }
        if (m24169A(j10)) {
            long jM24199w = m24199w(j10);
            if (-4611686018426999999L <= jM24199w && jM24199w < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(m24199w(j10) + " ns is out of nanoseconds range");
        }
        long jM24199w2 = m24199w(j10);
        if (-4611686018427387903L > jM24199w2 || jM24199w2 >= SieveCacheKt.NodeVisitedBit) {
            throw new AssertionError(m24199w(j10) + " ms is out of milliseconds range");
        }
        long jM24199w3 = m24199w(j10);
        if (-4611686018426L > jM24199w3 || jM24199w3 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(m24199w(j10) + " ms is denormalized");
    }

    /* renamed from: j */
    public static boolean m24186j(long j10, Object obj) {
        return (obj instanceof C10986a) && j10 == ((C10986a) obj).m24203J();
    }

    /* renamed from: k */
    public static final long m24187k(long j10) {
        return m24171C(j10) ? m24177I(j10) : j10;
    }

    /* renamed from: l */
    public static final int m24188l(long j10) {
        if (m24170B(j10)) {
            return 0;
        }
        return (int) (m24190n(j10) % 24);
    }

    /* renamed from: m */
    public static final long m24189m(long j10) {
        return m24175G(j10, DurationUnit.f23462j);
    }

    /* renamed from: n */
    public static final long m24190n(long j10) {
        return m24175G(j10, DurationUnit.f23461i);
    }

    /* renamed from: o */
    public static final long m24191o(long j10) {
        return (m24202z(j10) && m24201y(j10)) ? m24199w(j10) : m24175G(j10, DurationUnit.f23458f);
    }

    /* renamed from: p */
    public static final long m24192p(long j10) {
        return m24175G(j10, DurationUnit.f23460h);
    }

    /* renamed from: q */
    public static final long m24193q(long j10) {
        long jM24199w = m24199w(j10);
        if (m24169A(j10)) {
            return jM24199w;
        }
        if (jM24199w > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jM24199w < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return AbstractC10988c.m24223n(jM24199w);
    }

    /* renamed from: r */
    public static final long m24194r(long j10) {
        return m24175G(j10, DurationUnit.f23459g);
    }

    /* renamed from: s */
    public static final int m24195s(long j10) {
        if (m24170B(j10)) {
            return 0;
        }
        return (int) (m24192p(j10) % 60);
    }

    /* renamed from: t */
    public static final int m24196t(long j10) {
        if (m24170B(j10)) {
            return 0;
        }
        return (int) (m24202z(j10) ? AbstractC10988c.m24223n(m24199w(j10) % 1000) : m24199w(j10) % 1000000000);
    }

    /* renamed from: u */
    public static final int m24197u(long j10) {
        if (m24170B(j10)) {
            return 0;
        }
        return (int) (m24194r(j10) % 60);
    }

    /* renamed from: v */
    public static final DurationUnit m24198v(long j10) {
        return m24169A(j10) ? DurationUnit.f23456d : DurationUnit.f23458f;
    }

    /* renamed from: w */
    public static final long m24199w(long j10) {
        return j10 >> 1;
    }

    /* renamed from: x */
    public static int m24200x(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: y */
    public static final boolean m24201y(long j10) {
        return !m24170B(j10);
    }

    /* renamed from: z */
    public static final boolean m24202z(long j10) {
        return (((int) j10) & 1) == 1;
    }

    /* renamed from: J */
    public final /* synthetic */ long m24203J() {
        return this.f26495c;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m24204g(((C10986a) obj).m24203J());
    }

    public boolean equals(Object obj) {
        return m24186j(this.f26495c, obj);
    }

    /* renamed from: g */
    public int m24204g(long j10) {
        return m24184h(this.f26495c, j10);
    }

    public int hashCode() {
        return m24200x(this.f26495c);
    }

    public String toString() {
        return m24176H(this.f26495c);
    }
}
