package p124h8;

import androidx.collection.SieveCacheKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.time.DurationUnit;
import p077d8.AbstractC8323h;
import p113g8.AbstractC8661c0;

/* renamed from: h8.a */
/* loaded from: classes5.dex */
public final class C8738a implements Comparable {

    /* renamed from: b */
    public static final a f16369b = new a(null);

    /* renamed from: c */
    public static final long f16370c = m14344i(0);

    /* renamed from: d */
    public static final long f16371d = AbstractC8740c.m14378j(4611686018427387903L);

    /* renamed from: e */
    public static final long f16372e = AbstractC8740c.m14378j(-4611686018427387903L);

    /* renamed from: a */
    public final long f16373a;

    /* renamed from: h8.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final long m14364a() {
            return C8738a.f16371d;
        }

        /* renamed from: b */
        public final long m14365b() {
            return C8738a.f16372e;
        }

        /* renamed from: c */
        public final long m14366c() {
            return C8738a.f16370c;
        }

        /* renamed from: d */
        public final long m14367d(String value) {
            AbstractC9133u.m16133g(value, "value");
            try {
                return AbstractC8740c.m14384p(value, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e10);
            }
        }

        public a() {
        }
    }

    public /* synthetic */ C8738a(long j10) {
        this.f16373a = j10;
    }

    /* renamed from: A */
    public static final boolean m14328A(long j10) {
        return (((int) j10) & 1) == 0;
    }

    /* renamed from: B */
    public static final boolean m14329B(long j10) {
        return j10 == f16371d || j10 == f16372e;
    }

    /* renamed from: C */
    public static final boolean m14330C(long j10) {
        return j10 < 0;
    }

    /* renamed from: D */
    public static final boolean m14331D(long j10) {
        return j10 > 0;
    }

    /* renamed from: E */
    public static final long m14332E(long j10, long j11) {
        if (m14329B(j10)) {
            if (m14360y(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m14329B(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return m14361z(j10) ? m14340d(j10, m14358w(j10), m14358w(j11)) : m14340d(j10, m14358w(j11), m14358w(j10));
        }
        long jM14358w = m14358w(j10) + m14358w(j11);
        return m14328A(j10) ? AbstractC8740c.m14381m(jM14358w) : AbstractC8740c.m14379k(jM14358w);
    }

    /* renamed from: F */
    public static final String m14333F(long j10) {
        StringBuilder sb = new StringBuilder();
        if (m14330C(j10)) {
            sb.append('-');
        }
        sb.append("PT");
        long jM14346k = m14346k(j10);
        long jM14349n = m14349n(jM14346k);
        int iM14354s = m14354s(jM14346k);
        int iM14356u = m14356u(jM14346k);
        int iM14355t = m14355t(jM14346k);
        long j11 = m14329B(j10) ? 9999999999999L : jM14349n;
        boolean z10 = false;
        boolean z11 = j11 != 0;
        boolean z12 = (iM14356u == 0 && iM14355t == 0) ? false : true;
        if (iM14354s != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb.append(j11);
            sb.append('H');
        }
        if (z10) {
            sb.append(iM14354s);
            sb.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            m14341e(j10, sb, iM14356u, iM14355t, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb.toString();
    }

    /* renamed from: G */
    public static final long m14334G(long j10, DurationUnit unit) {
        AbstractC9133u.m16133g(unit, "unit");
        if (j10 == f16371d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f16372e) {
            return Long.MIN_VALUE;
        }
        return AbstractC8741d.m14390b(m14358w(j10), m14357v(j10), unit);
    }

    /* renamed from: H */
    public static String m14335H(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f16371d) {
            return "Infinity";
        }
        if (j10 == f16372e) {
            return "-Infinity";
        }
        boolean zM14330C = m14330C(j10);
        StringBuilder sb = new StringBuilder();
        if (zM14330C) {
            sb.append('-');
        }
        long jM14346k = m14346k(j10);
        long jM14348m = m14348m(jM14346k);
        int iM14347l = m14347l(jM14346k);
        int iM14354s = m14354s(jM14346k);
        int iM14356u = m14356u(jM14346k);
        int iM14355t = m14355t(jM14346k);
        int i10 = 0;
        boolean z10 = jM14348m != 0;
        boolean z11 = iM14347l != 0;
        boolean z12 = iM14354s != 0;
        boolean z13 = (iM14356u == 0 && iM14355t == 0) ? false : true;
        if (z10) {
            sb.append(jM14348m);
            sb.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(iM14347l);
            sb.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(iM14354s);
            sb.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            if (iM14356u != 0 || z10 || z11 || z12) {
                m14341e(j10, sb, iM14356u, iM14355t, 9, "s", false);
            } else if (iM14355t >= 1000000) {
                m14341e(j10, sb, iM14355t / 1000000, iM14355t % 1000000, 6, "ms", false);
            } else if (iM14355t >= 1000) {
                m14341e(j10, sb, iM14355t / 1000, iM14355t % 1000, 3, "us", false);
            } else {
                sb.append(iM14355t);
                sb.append("ns");
            }
            i10 = i13;
        }
        if (zM14330C && i10 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* renamed from: I */
    public static final long m14336I(long j10) {
        return AbstractC8740c.m14377i(-m14358w(j10), ((int) j10) & 1);
    }

    /* renamed from: d */
    public static final long m14340d(long j10, long j11, long j12) {
        long jM14383o = AbstractC8740c.m14383o(j12);
        long j13 = j11 + jM14383o;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return AbstractC8740c.m14378j(AbstractC8323h.m13520o(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return AbstractC8740c.m14380l(AbstractC8740c.m14382n(j13) + (j12 - AbstractC8740c.m14382n(jM14383o)));
    }

    /* renamed from: e */
    public static final void m14341e(long j10, StringBuilder sb, int i10, int i11, int i12, String str, boolean z10) {
        sb.append(i10);
        if (i11 != 0) {
            sb.append('.');
            String strM14002q0 = AbstractC8661c0.m14002q0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strM14002q0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strM14002q0.charAt(length) != '0') {
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
                sb.append((CharSequence) strM14002q0, 0, ((i13 + 3) / 3) * 3);
                AbstractC9133u.m16132f(sb, "append(...)");
            } else {
                sb.append((CharSequence) strM14002q0, 0, i15);
                AbstractC9133u.m16132f(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    /* renamed from: f */
    public static final /* synthetic */ C8738a m14342f(long j10) {
        return new C8738a(j10);
    }

    /* renamed from: h */
    public static int m14343h(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return AbstractC9133u.m16136j(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return m14330C(j10) ? -i10 : i10;
    }

    /* renamed from: i */
    public static long m14344i(long j10) {
        if (!AbstractC8739b.m14368a()) {
            return j10;
        }
        if (m14328A(j10)) {
            long jM14358w = m14358w(j10);
            if (-4611686018426999999L <= jM14358w && jM14358w < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(m14358w(j10) + " ns is out of nanoseconds range");
        }
        long jM14358w2 = m14358w(j10);
        if (-4611686018427387903L > jM14358w2 || jM14358w2 >= SieveCacheKt.NodeVisitedBit) {
            throw new AssertionError(m14358w(j10) + " ms is out of milliseconds range");
        }
        long jM14358w3 = m14358w(j10);
        if (-4611686018426L > jM14358w3 || jM14358w3 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(m14358w(j10) + " ms is denormalized");
    }

    /* renamed from: j */
    public static boolean m14345j(long j10, Object obj) {
        return (obj instanceof C8738a) && j10 == ((C8738a) obj).m14362J();
    }

    /* renamed from: k */
    public static final long m14346k(long j10) {
        return m14330C(j10) ? m14336I(j10) : j10;
    }

    /* renamed from: l */
    public static final int m14347l(long j10) {
        if (m14329B(j10)) {
            return 0;
        }
        return (int) (m14349n(j10) % 24);
    }

    /* renamed from: m */
    public static final long m14348m(long j10) {
        return m14334G(j10, DurationUnit.f17533h);
    }

    /* renamed from: n */
    public static final long m14349n(long j10) {
        return m14334G(j10, DurationUnit.f17532g);
    }

    /* renamed from: o */
    public static final long m14350o(long j10) {
        return (m14361z(j10) && m14360y(j10)) ? m14358w(j10) : m14334G(j10, DurationUnit.f17529d);
    }

    /* renamed from: p */
    public static final long m14351p(long j10) {
        return m14334G(j10, DurationUnit.f17531f);
    }

    /* renamed from: q */
    public static final long m14352q(long j10) {
        long jM14358w = m14358w(j10);
        if (m14328A(j10)) {
            return jM14358w;
        }
        if (jM14358w > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jM14358w < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return AbstractC8740c.m14382n(jM14358w);
    }

    /* renamed from: r */
    public static final long m14353r(long j10) {
        return m14334G(j10, DurationUnit.f17530e);
    }

    /* renamed from: s */
    public static final int m14354s(long j10) {
        if (m14329B(j10)) {
            return 0;
        }
        return (int) (m14351p(j10) % 60);
    }

    /* renamed from: t */
    public static final int m14355t(long j10) {
        if (m14329B(j10)) {
            return 0;
        }
        return (int) (m14361z(j10) ? AbstractC8740c.m14382n(m14358w(j10) % 1000) : m14358w(j10) % 1000000000);
    }

    /* renamed from: u */
    public static final int m14356u(long j10) {
        if (m14329B(j10)) {
            return 0;
        }
        return (int) (m14353r(j10) % 60);
    }

    /* renamed from: v */
    public static final DurationUnit m14357v(long j10) {
        return m14328A(j10) ? DurationUnit.f17527b : DurationUnit.f17529d;
    }

    /* renamed from: w */
    public static final long m14358w(long j10) {
        return j10 >> 1;
    }

    /* renamed from: x */
    public static int m14359x(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: y */
    public static final boolean m14360y(long j10) {
        return !m14329B(j10);
    }

    /* renamed from: z */
    public static final boolean m14361z(long j10) {
        return (((int) j10) & 1) == 1;
    }

    /* renamed from: J */
    public final /* synthetic */ long m14362J() {
        return this.f16373a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m14363g(((C8738a) obj).m14362J());
    }

    public boolean equals(Object obj) {
        return m14345j(this.f16373a, obj);
    }

    /* renamed from: g */
    public int m14363g(long j10) {
        return m14343h(this.f16373a, j10);
    }

    public int hashCode() {
        return m14359x(this.f16373a);
    }

    public String toString() {
        return m14335H(this.f16373a);
    }
}
