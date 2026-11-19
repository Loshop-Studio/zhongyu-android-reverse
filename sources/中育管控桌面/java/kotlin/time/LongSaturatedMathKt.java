package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;

@Metadata(m7879d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001a\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, m7880d2 = {"saturatingAdd", "", "value", "unit", "Lkotlin/time/DurationUnit;", TypedValues.TransitionType.S_DURATION, "Lkotlin/time/Duration;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "checkInfiniteSumDefined", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "infinityOfSign", "(J)J", "saturatingDiff", "valueNs", OSSHeaders.ORIGIN, "(JJLkotlin/time/DurationUnit;)J", "saturatingOriginsDiff", "origin1", "origin2", "saturatingFiniteDiff", "value1", "value2", "isSaturated", "", "kotlin-stdlib"}, m7881k = 2, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
/* loaded from: classes4.dex */
public final class LongSaturatedMathKt {
    /* renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m18608checkInfiniteSumDefinedPjuGub4(long j6, long j7, long j8) {
        if (!Duration.m18532isInfiniteimpl(j7) || (j6 ^ j8) >= 0) {
            return j6;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long infinityOfSign(long j6) {
        return j6 < 0 ? Duration.INSTANCE.m18597getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.INSTANCE.m18596getINFINITEUwyO8pc();
    }

    public static final boolean isSaturated(long j6) {
        return ((j6 - 1) | 1) == Long.MAX_VALUE;
    }

    /* renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m18609saturatingAddNuflL3o(long j6, DurationUnit unit, long j7) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long jM18546toLongimpl = Duration.m18546toLongimpl(j7, unit);
        if (((j6 - 1) | 1) == Long.MAX_VALUE) {
            return m18608checkInfiniteSumDefinedPjuGub4(j6, j7, jM18546toLongimpl);
        }
        if (((jM18546toLongimpl - 1) | 1) == Long.MAX_VALUE) {
            return m18610saturatingAddInHalvesNuflL3o(j6, unit, j7);
        }
        long j8 = j6 + jM18546toLongimpl;
        return ((j6 ^ j8) & (jM18546toLongimpl ^ j8)) < 0 ? j6 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j8;
    }

    /* renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m18610saturatingAddInHalvesNuflL3o(long j6, DurationUnit durationUnit, long j7) {
        long jM18510divUwyO8pc = Duration.m18510divUwyO8pc(j7, 2);
        long jM18546toLongimpl = Duration.m18546toLongimpl(jM18510divUwyO8pc, durationUnit);
        return (1 | (jM18546toLongimpl - 1)) == Long.MAX_VALUE ? jM18546toLongimpl : m18609saturatingAddNuflL3o(m18609saturatingAddNuflL3o(j6, durationUnit, jM18510divUwyO8pc), durationUnit, Duration.m18535minusLRDsOJo(j7, jM18510divUwyO8pc));
    }

    public static final long saturatingDiff(long j6, long j7, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (1 | (j7 - 1)) == Long.MAX_VALUE ? Duration.m18551unaryMinusUwyO8pc(infinityOfSign(j7)) : saturatingFiniteDiff(j6, j7, unit);
    }

    private static final long saturatingFiniteDiff(long j6, long j7, DurationUnit durationUnit) {
        long j8 = j6 - j7;
        if (((j8 ^ j6) & (~(j8 ^ j7))) >= 0) {
            return DurationKt.toDuration(j8, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m18551unaryMinusUwyO8pc(infinityOfSign(j8));
        }
        long jConvertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit2, durationUnit);
        long j9 = (j6 / jConvertDurationUnit) - (j7 / jConvertDurationUnit);
        long j10 = (j6 % jConvertDurationUnit) - (j7 % jConvertDurationUnit);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m18536plusLRDsOJo(DurationKt.toDuration(j9, durationUnit2), DurationKt.toDuration(j10, durationUnit));
    }

    public static final long saturatingOriginsDiff(long j6, long j7, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return ((j7 - 1) | 1) == Long.MAX_VALUE ? j6 == j7 ? Duration.INSTANCE.m18598getZEROUwyO8pc() : Duration.m18551unaryMinusUwyO8pc(infinityOfSign(j7)) : (1 | (j6 - 1)) == Long.MAX_VALUE ? infinityOfSign(j6) : saturatingFiniteDiff(j6, j7, unit);
    }
}
