package p326rd;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.time.DurationUnit;

/* renamed from: rd.d */
/* loaded from: classes6.dex */
public abstract class AbstractC10989d {
    /* renamed from: a */
    public static final double m24230a(double d10, DurationUnit sourceUnit, DurationUnit targetUnit) {
        AbstractC9979u.m20294g(sourceUnit, "sourceUnit");
        AbstractC9979u.m20294g(targetUnit, "targetUnit");
        long jConvert = targetUnit.m20352c().convert(1L, sourceUnit.m20352c());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.m20352c().convert(1L, targetUnit.m20352c());
    }

    /* renamed from: b */
    public static final long m24231b(long j10, DurationUnit sourceUnit, DurationUnit targetUnit) {
        AbstractC9979u.m20294g(sourceUnit, "sourceUnit");
        AbstractC9979u.m20294g(targetUnit, "targetUnit");
        return targetUnit.m20352c().convert(j10, sourceUnit.m20352c());
    }

    /* renamed from: c */
    public static final long m24232c(long j10, DurationUnit sourceUnit, DurationUnit targetUnit) {
        AbstractC9979u.m20294g(sourceUnit, "sourceUnit");
        AbstractC9979u.m20294g(targetUnit, "targetUnit");
        return targetUnit.m20352c().convert(j10, sourceUnit.m20352c());
    }

    /* renamed from: d */
    public static TimeUnit m24233d(DurationUnit durationUnit) {
        AbstractC9979u.m20294g(durationUnit, "<this>");
        return durationUnit.m20352c();
    }
}
