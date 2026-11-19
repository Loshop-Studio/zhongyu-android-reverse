package p326rd;

import kotlin.jvm.internal.AbstractC9979u;
import kotlin.time.DurationUnit;
import p326rd.C10986a;

/* renamed from: rd.f */
/* loaded from: classes6.dex */
public abstract class AbstractC10991f {
    /* renamed from: a */
    public static final long m24236a(long j10) {
        return j10 < 0 ? C10986a.f26491d.m24206b() : C10986a.f26491d.m24205a();
    }

    /* renamed from: b */
    public static final long m24237b(long j10, long j11, DurationUnit durationUnit) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return AbstractC10988c.m24229t(j12, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.f23458f;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return C10986a.m24177I(m24236a(j12));
        }
        long jM24231b = AbstractC10989d.m24231b(1L, durationUnit2, durationUnit);
        long j13 = (j10 / jM24231b) - (j11 / jM24231b);
        long j14 = (j10 % jM24231b) - (j11 % jM24231b);
        C10986a.a aVar = C10986a.f26491d;
        return C10986a.m24173E(AbstractC10988c.m24229t(j13, durationUnit2), AbstractC10988c.m24229t(j14, durationUnit));
    }

    /* renamed from: c */
    public static final long m24238c(long j10, long j11, DurationUnit unit) {
        AbstractC9979u.m20294g(unit, "unit");
        return ((j11 - 1) | 1) == Long.MAX_VALUE ? j10 == j11 ? C10986a.f26491d.m24207c() : C10986a.m24177I(m24236a(j11)) : (1 | (j10 - 1)) == Long.MAX_VALUE ? m24236a(j10) : m24237b(j10, j11, unit);
    }
}
