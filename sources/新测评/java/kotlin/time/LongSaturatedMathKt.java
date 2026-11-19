package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;

@Metadata(m13557d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001a\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, m13558d2 = {"saturatingAdd", "", "value", "unit", "Lkotlin/time/DurationUnit;", TypedValues.TransitionType.S_DURATION, "Lkotlin/time/Duration;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "checkInfiniteSumDefined", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "infinityOfSign", "(J)J", "saturatingDiff", "valueNs", OSSHeaders.ORIGIN, "(JJLkotlin/time/DurationUnit;)J", "saturatingOriginsDiff", "origin1", "origin2", "saturatingFiniteDiff", "value1", "value2", "isSaturated", "", "kotlin-stdlib"}, m13559k = 2, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
/* loaded from: classes5.dex */
public final class LongSaturatedMathKt {
    /* renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m25724checkInfiniteSumDefinedPjuGub4(long j10, long j11, long j12) {
        if (!Duration.m25648isInfiniteimpl(j11) || (j10 ^ j12) >= 0) {
            return j10;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long infinityOfSign(long j10) {
        return j10 < 0 ? Duration.INSTANCE.m25713getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.INSTANCE.m25712getINFINITEUwyO8pc();
    }

    public static final boolean isSaturated(long j10) {
        return ((j10 - 1) | 1) == Long.MAX_VALUE;
    }

    /* renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m25725saturatingAddNuflL3o(long j10, DurationUnit unit, long j11) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long jM25662toLongimpl = Duration.m25662toLongimpl(j11, unit);
        if (((j10 - 1) | 1) == Long.MAX_VALUE) {
            return m25724checkInfiniteSumDefinedPjuGub4(j10, j11, jM25662toLongimpl);
        }
        if (((jM25662toLongimpl - 1) | 1) == Long.MAX_VALUE) {
            return m25726saturatingAddInHalvesNuflL3o(j10, unit, j11);
        }
        long j12 = j10 + jM25662toLongimpl;
        return ((j10 ^ j12) & (jM25662toLongimpl ^ j12)) < 0 ? j10 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j12;
    }

    /* renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m25726saturatingAddInHalvesNuflL3o(long j10, DurationUnit durationUnit, long j11) {
        long jM25626divUwyO8pc = Duration.m25626divUwyO8pc(j11, 2);
        long jM25662toLongimpl = Duration.m25662toLongimpl(jM25626divUwyO8pc, durationUnit);
        return (1 | (jM25662toLongimpl - 1)) == Long.MAX_VALUE ? jM25662toLongimpl : m25725saturatingAddNuflL3o(m25725saturatingAddNuflL3o(j10, durationUnit, jM25626divUwyO8pc), durationUnit, Duration.m25651minusLRDsOJo(j11, jM25626divUwyO8pc));
    }

    public static final long saturatingDiff(long j10, long j11, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (1 | (j11 - 1)) == Long.MAX_VALUE ? Duration.m25667unaryMinusUwyO8pc(infinityOfSign(j11)) : saturatingFiniteDiff(j10, j11, unit);
    }

    private static final long saturatingFiniteDiff(long j10, long j11, DurationUnit durationUnit) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return DurationKt.toDuration(j12, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m25667unaryMinusUwyO8pc(infinityOfSign(j12));
        }
        long jConvertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit2, durationUnit);
        long j13 = (j10 / jConvertDurationUnit) - (j11 / jConvertDurationUnit);
        long j14 = (j10 % jConvertDurationUnit) - (j11 % jConvertDurationUnit);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m25652plusLRDsOJo(DurationKt.toDuration(j13, durationUnit2), DurationKt.toDuration(j14, durationUnit));
    }

    public static final long saturatingOriginsDiff(long j10, long j11, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return ((j11 - 1) | 1) == Long.MAX_VALUE ? j10 == j11 ? Duration.INSTANCE.m25714getZEROUwyO8pc() : Duration.m25667unaryMinusUwyO8pc(infinityOfSign(j11)) : (1 | (j10 - 1)) == Long.MAX_VALUE ? infinityOfSign(j10) : saturatingFiniteDiff(j10, j11, unit);
    }
}
