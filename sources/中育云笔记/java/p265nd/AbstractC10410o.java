package p265nd;

import kotlin.jvm.internal.AbstractC9979u;
import p265nd.C10403h;

/* renamed from: nd.o */
/* loaded from: classes6.dex */
public abstract class AbstractC10410o extends AbstractC10409n {
    /* renamed from: c */
    public static double m21750c(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    /* renamed from: d */
    public static float m21751d(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    /* renamed from: e */
    public static int m21752e(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    /* renamed from: f */
    public static long m21753f(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    /* renamed from: g */
    public static double m21754g(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    /* renamed from: h */
    public static float m21755h(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    /* renamed from: i */
    public static int m21756i(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    /* renamed from: j */
    public static long m21757j(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    /* renamed from: k */
    public static Comparable m21758k(Comparable comparable, Comparable maximumValue) {
        AbstractC9979u.m20294g(comparable, "<this>");
        AbstractC9979u.m20294g(maximumValue, "maximumValue");
        return comparable.compareTo(maximumValue) > 0 ? maximumValue : comparable;
    }

    /* renamed from: l */
    public static double m21759l(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    /* renamed from: m */
    public static float m21760m(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    /* renamed from: n */
    public static int m21761n(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    /* renamed from: o */
    public static int m21762o(int i10, InterfaceC10402g range) {
        AbstractC9979u.m20294g(range, "range");
        if (range instanceof InterfaceC10401f) {
            return ((Number) m21764q(Integer.valueOf(i10), (InterfaceC10401f) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i10 < ((Number) range.getStart()).intValue() ? ((Number) range.getStart()).intValue() : i10 > ((Number) range.getEndInclusive()).intValue() ? ((Number) range.getEndInclusive()).intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    /* renamed from: p */
    public static long m21763p(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    /* renamed from: q */
    public static Comparable m21764q(Comparable comparable, InterfaceC10401f range) {
        AbstractC9979u.m20294g(comparable, "<this>");
        AbstractC9979u.m20294g(range, "range");
        if (!range.isEmpty()) {
            return (!range.mo21726a(comparable, range.getStart()) || range.mo21726a(range.getStart(), comparable)) ? (!range.mo21726a(range.getEndInclusive(), comparable) || range.mo21726a(comparable, range.getEndInclusive())) ? comparable : range.getEndInclusive() : range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    /* renamed from: r */
    public static C10403h m21765r(int i10, int i11) {
        return C10403h.f24752f.m21737a(i10, i11, -1);
    }

    /* renamed from: s */
    public static C10403h m21766s(C10403h c10403h) {
        AbstractC9979u.m20294g(c10403h, "<this>");
        return C10403h.f24752f.m21737a(c10403h.m21734c(), c10403h.m21733b(), -c10403h.m21735d());
    }

    /* renamed from: t */
    public static C10403h m21767t(C10403h c10403h, int i10) {
        AbstractC9979u.m20294g(c10403h, "<this>");
        AbstractC10409n.m21748a(i10 > 0, Integer.valueOf(i10));
        C10403h.a aVar = C10403h.f24752f;
        int iM21733b = c10403h.m21733b();
        int iM21734c = c10403h.m21734c();
        if (c10403h.m21735d() <= 0) {
            i10 = -i10;
        }
        return aVar.m21737a(iM21733b, iM21734c, i10);
    }

    /* renamed from: u */
    public static C10405j m21768u(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? C10405j.f24760g.m21742a() : new C10405j(i10, i11 - 1);
    }
}
