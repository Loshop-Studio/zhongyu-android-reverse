package p124h8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.time.DurationUnit;
import p124h8.C8738a;

/* renamed from: h8.f */
/* loaded from: classes5.dex */
public abstract class AbstractC8743f {
    /* renamed from: a */
    public static final long m14395a(long j10) {
        return j10 < 0 ? C8738a.f16369b.m14365b() : C8738a.f16369b.m14364a();
    }

    /* renamed from: b */
    public static final long m14396b(long j10, long j11, DurationUnit durationUnit) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return AbstractC8740c.m14388t(j12, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.f17529d;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return C8738a.m14336I(m14395a(j12));
        }
        long jM14390b = AbstractC8741d.m14390b(1L, durationUnit2, durationUnit);
        long j13 = (j10 / jM14390b) - (j11 / jM14390b);
        long j14 = (j10 % jM14390b) - (j11 % jM14390b);
        C8738a.a aVar = C8738a.f16369b;
        return C8738a.m14332E(AbstractC8740c.m14388t(j13, durationUnit2), AbstractC8740c.m14388t(j14, durationUnit));
    }

    /* renamed from: c */
    public static final long m14397c(long j10, long j11, DurationUnit unit) {
        AbstractC9133u.m16133g(unit, "unit");
        return ((j11 - 1) | 1) == Long.MAX_VALUE ? j10 == j11 ? C8738a.f16369b.m14366c() : C8738a.m14336I(m14395a(j11)) : (1 | (j10 - 1)) == Long.MAX_VALUE ? m14395a(j10) : m14396b(j10, j11, unit);
    }
}
