package p124h8;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.time.DurationUnit;

/* renamed from: h8.d */
/* loaded from: classes5.dex */
public abstract class AbstractC8741d {
    /* renamed from: a */
    public static final double m14389a(double d10, DurationUnit sourceUnit, DurationUnit targetUnit) {
        AbstractC9133u.m16133g(sourceUnit, "sourceUnit");
        AbstractC9133u.m16133g(targetUnit, "targetUnit");
        long jConvert = targetUnit.m16192b().convert(1L, sourceUnit.m16192b());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.m16192b().convert(1L, targetUnit.m16192b());
    }

    /* renamed from: b */
    public static final long m14390b(long j10, DurationUnit sourceUnit, DurationUnit targetUnit) {
        AbstractC9133u.m16133g(sourceUnit, "sourceUnit");
        AbstractC9133u.m16133g(targetUnit, "targetUnit");
        return targetUnit.m16192b().convert(j10, sourceUnit.m16192b());
    }

    /* renamed from: c */
    public static final long m14391c(long j10, DurationUnit sourceUnit, DurationUnit targetUnit) {
        AbstractC9133u.m16133g(sourceUnit, "sourceUnit");
        AbstractC9133u.m16133g(targetUnit, "targetUnit");
        return targetUnit.m16192b().convert(j10, sourceUnit.m16192b());
    }

    /* renamed from: d */
    public static TimeUnit m14392d(DurationUnit durationUnit) {
        AbstractC9133u.m16133g(durationUnit, "<this>");
        return durationUnit.m16192b();
    }
}
