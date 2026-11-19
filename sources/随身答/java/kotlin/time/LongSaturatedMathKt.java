package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;

@Metadata(m13412d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001a\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, m13413d2 = {"saturatingAdd", "", "value", "unit", "Lkotlin/time/DurationUnit;", TypedValues.TransitionType.S_DURATION, "Lkotlin/time/Duration;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "checkInfiniteSumDefined", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "infinityOfSign", "(J)J", "saturatingDiff", "valueNs", OSSHeaders.ORIGIN, "(JJLkotlin/time/DurationUnit;)J", "saturatingOriginsDiff", "origin1", "origin2", "saturatingFiniteDiff", "value1", "value2", "isSaturated", "", "kotlin-stdlib"}, m13414k = 2, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
/* loaded from: classes5.dex */
public final class LongSaturatedMathKt {
    /* renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m26183checkInfiniteSumDefinedPjuGub4(long j9, long j10, long j11) {
        if (!Duration.m26107isInfiniteimpl(j10) || (j9 ^ j11) >= 0) {
            return j9;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long infinityOfSign(long j9) {
        return j9 < 0 ? Duration.INSTANCE.m26172getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.INSTANCE.m26171getINFINITEUwyO8pc();
    }

    public static final boolean isSaturated(long j9) {
        return ((j9 - 1) | 1) == Long.MAX_VALUE;
    }

    /* renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m26184saturatingAddNuflL3o(long j9, DurationUnit unit, long j10) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long jM26121toLongimpl = Duration.m26121toLongimpl(j10, unit);
        if (((j9 - 1) | 1) == Long.MAX_VALUE) {
            return m26183checkInfiniteSumDefinedPjuGub4(j9, j10, jM26121toLongimpl);
        }
        if (((jM26121toLongimpl - 1) | 1) == Long.MAX_VALUE) {
            return m26185saturatingAddInHalvesNuflL3o(j9, unit, j10);
        }
        long j11 = j9 + jM26121toLongimpl;
        return ((j9 ^ j11) & (jM26121toLongimpl ^ j11)) < 0 ? j9 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j11;
    }

    /* renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m26185saturatingAddInHalvesNuflL3o(long j9, DurationUnit durationUnit, long j10) {
        long jM26085divUwyO8pc = Duration.m26085divUwyO8pc(j10, 2);
        long jM26121toLongimpl = Duration.m26121toLongimpl(jM26085divUwyO8pc, durationUnit);
        return (1 | (jM26121toLongimpl - 1)) == Long.MAX_VALUE ? jM26121toLongimpl : m26184saturatingAddNuflL3o(m26184saturatingAddNuflL3o(j9, durationUnit, jM26085divUwyO8pc), durationUnit, Duration.m26110minusLRDsOJo(j10, jM26085divUwyO8pc));
    }

    public static final long saturatingDiff(long j9, long j10, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (1 | (j10 - 1)) == Long.MAX_VALUE ? Duration.m26126unaryMinusUwyO8pc(infinityOfSign(j10)) : saturatingFiniteDiff(j9, j10, unit);
    }

    private static final long saturatingFiniteDiff(long j9, long j10, DurationUnit durationUnit) {
        long j11 = j9 - j10;
        if (((j11 ^ j9) & (~(j11 ^ j10))) >= 0) {
            return DurationKt.toDuration(j11, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m26126unaryMinusUwyO8pc(infinityOfSign(j11));
        }
        long jConvertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit2, durationUnit);
        long j12 = (j9 / jConvertDurationUnit) - (j10 / jConvertDurationUnit);
        long j13 = (j9 % jConvertDurationUnit) - (j10 % jConvertDurationUnit);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m26111plusLRDsOJo(DurationKt.toDuration(j12, durationUnit2), DurationKt.toDuration(j13, durationUnit));
    }

    public static final long saturatingOriginsDiff(long j9, long j10, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return ((j10 - 1) | 1) == Long.MAX_VALUE ? j9 == j10 ? Duration.INSTANCE.m26173getZEROUwyO8pc() : Duration.m26126unaryMinusUwyO8pc(infinityOfSign(j10)) : (1 | (j9 - 1)) == Long.MAX_VALUE ? infinityOfSign(j9) : saturatingFiniteDiff(j9, j10, unit);
    }
}
