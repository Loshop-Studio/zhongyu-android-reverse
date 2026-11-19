package p077d8;

import kotlin.jvm.internal.AbstractC9133u;
import p077d8.C8319d;

/* renamed from: d8.h */
/* loaded from: classes5.dex */
public abstract class AbstractC8323h extends AbstractC8322g {
    /* renamed from: c */
    public static double m13508c(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    /* renamed from: d */
    public static float m13509d(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    /* renamed from: e */
    public static int m13510e(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    /* renamed from: f */
    public static long m13511f(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    /* renamed from: g */
    public static float m13512g(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    /* renamed from: h */
    public static int m13513h(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    /* renamed from: i */
    public static long m13514i(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    /* renamed from: j */
    public static Comparable m13515j(Comparable comparable, Comparable maximumValue) {
        AbstractC9133u.m16133g(comparable, "<this>");
        AbstractC9133u.m16133g(maximumValue, "maximumValue");
        return comparable.compareTo(maximumValue) > 0 ? maximumValue : comparable;
    }

    /* renamed from: k */
    public static double m13516k(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    /* renamed from: l */
    public static float m13517l(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    /* renamed from: m */
    public static int m13518m(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    /* renamed from: n */
    public static int m13519n(int i10, InterfaceC8318c range) {
        AbstractC9133u.m16133g(range, "range");
        if (range instanceof InterfaceC8317b) {
            return ((Number) m13521p(Integer.valueOf(i10), (InterfaceC8317b) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i10 < ((Number) range.getStart()).intValue() ? ((Number) range.getStart()).intValue() : i10 > ((Number) range.getEndInclusive()).intValue() ? ((Number) range.getEndInclusive()).intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    /* renamed from: o */
    public static long m13520o(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    /* renamed from: p */
    public static Comparable m13521p(Comparable comparable, InterfaceC8317b range) {
        AbstractC9133u.m16133g(comparable, "<this>");
        AbstractC9133u.m16133g(range, "range");
        if (!range.isEmpty()) {
            return (!range.mo13489a(comparable, range.getStart()) || range.mo13489a(range.getStart(), comparable)) ? (!range.mo13489a(range.getEndInclusive(), comparable) || range.mo13489a(comparable, range.getEndInclusive())) ? comparable : range.getEndInclusive() : range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    /* renamed from: q */
    public static C8319d m13522q(int i10, int i11) {
        return C8319d.f15776d.m13500a(i10, i11, -1);
    }

    /* renamed from: r */
    public static C8319d m13523r(C8319d c8319d) {
        AbstractC9133u.m16133g(c8319d, "<this>");
        return C8319d.f15776d.m13500a(c8319d.m13497c(), c8319d.m13496b(), -c8319d.m13498d());
    }

    /* renamed from: s */
    public static C8319d m13524s(C8319d c8319d, int i10) {
        AbstractC9133u.m16133g(c8319d, "<this>");
        AbstractC8322g.m13506a(i10 > 0, Integer.valueOf(i10));
        C8319d.a aVar = C8319d.f15776d;
        int iM13496b = c8319d.m13496b();
        int iM13497c = c8319d.m13497c();
        if (c8319d.m13498d() <= 0) {
            i10 = -i10;
        }
        return aVar.m13500a(iM13496b, iM13497c, i10);
    }

    /* renamed from: t */
    public static C8321f m13525t(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? C8321f.f15784e.m13505a() : new C8321f(i10, i11 - 1);
    }
}
