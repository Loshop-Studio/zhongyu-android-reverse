package kotlin.time;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.time.Duration;

@Metadata(m5174d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u001a \u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\r\u0010\u0016\u001a\u00020\u0017*\u00020\u0001H\u0082\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m5175d2 = {"checkInfiniteSumDefined", "", "longNs", "duration", "Lkotlin/time/Duration;", "durationNs", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAdd", "saturatingAdd-pTJri5U", "(JJ)J", "saturatingAddInHalves", "saturatingAddInHalves-pTJri5U", "saturatingDiff", "valueNs", "originNs", "saturatingFiniteDiff", "value1Ns", "value2Ns", "saturatingOriginsDiff", "origin1Ns", "origin2Ns", "isSaturated", "", "kotlin-stdlib"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class LongSaturatedMathKt {
    /* renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m13254checkInfiniteSumDefinedPjuGub4(long j4, long j5, long j6) {
        if (!Duration.m13159isInfiniteimpl(j5) || (j4 ^ j6) >= 0) {
            return j4;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final boolean isSaturated(long j4) {
        return ((j4 - 1) | 1) == Long.MAX_VALUE;
    }

    /* renamed from: saturatingAdd-pTJri5U, reason: not valid java name */
    public static final long m13255saturatingAddpTJri5U(long j4, long j5) {
        long jM13147getInWholeNanosecondsimpl = Duration.m13147getInWholeNanosecondsimpl(j5);
        if (((j4 - 1) | 1) == Long.MAX_VALUE) {
            return m13254checkInfiniteSumDefinedPjuGub4(j4, j5, jM13147getInWholeNanosecondsimpl);
        }
        if ((1 | (jM13147getInWholeNanosecondsimpl - 1)) == Long.MAX_VALUE) {
            return m13256saturatingAddInHalvespTJri5U(j4, j5);
        }
        long j6 = j4 + jM13147getInWholeNanosecondsimpl;
        return ((j4 ^ j6) & (jM13147getInWholeNanosecondsimpl ^ j6)) < 0 ? j4 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j6;
    }

    /* renamed from: saturatingAddInHalves-pTJri5U, reason: not valid java name */
    private static final long m13256saturatingAddInHalvespTJri5U(long j4, long j5) {
        long jM13130divUwyO8pc = Duration.m13130divUwyO8pc(j5, 2);
        return (((Duration.m13147getInWholeNanosecondsimpl(jM13130divUwyO8pc) - 1) | 1) > Long.MAX_VALUE ? 1 : (((Duration.m13147getInWholeNanosecondsimpl(jM13130divUwyO8pc) - 1) | 1) == Long.MAX_VALUE ? 0 : -1)) == 0 ? (long) (j4 + Duration.m13170toDoubleimpl(j5, DurationUnit.NANOSECONDS)) : m13255saturatingAddpTJri5U(m13255saturatingAddpTJri5U(j4, jM13130divUwyO8pc), Duration.m13162minusLRDsOJo(j5, jM13130divUwyO8pc));
    }

    public static final long saturatingDiff(long j4, long j5) {
        return ((1 | (j5 - 1)) > Long.MAX_VALUE ? 1 : ((1 | (j5 - 1)) == Long.MAX_VALUE ? 0 : -1)) == 0 ? Duration.m13179unaryMinusUwyO8pc(DurationKt.toDuration(j5, DurationUnit.DAYS)) : saturatingFiniteDiff(j4, j5);
    }

    private static final long saturatingFiniteDiff(long j4, long j5) {
        long j6 = j4 - j5;
        if (((j6 ^ j4) & (~(j6 ^ j5))) >= 0) {
            Duration.Companion companion = Duration.INSTANCE;
            return DurationKt.toDuration(j6, DurationUnit.NANOSECONDS);
        }
        long j7 = DurationKt.NANOS_IN_MILLIS;
        long j8 = (j4 / j7) - (j5 / j7);
        long j9 = (j4 % j7) - (j5 % j7);
        Duration.Companion companion2 = Duration.INSTANCE;
        return Duration.m13163plusLRDsOJo(DurationKt.toDuration(j8, DurationUnit.MILLISECONDS), DurationKt.toDuration(j9, DurationUnit.NANOSECONDS));
    }

    public static final long saturatingOriginsDiff(long j4, long j5) {
        if (((j5 - 1) | 1) == Long.MAX_VALUE) {
            return j4 == j5 ? Duration.INSTANCE.m13229getZEROUwyO8pc() : Duration.m13179unaryMinusUwyO8pc(DurationKt.toDuration(j5, DurationUnit.DAYS));
        }
        return (1 | (j4 - 1)) == Long.MAX_VALUE ? DurationKt.toDuration(j4, DurationUnit.DAYS) : saturatingFiniteDiff(j4, j5);
    }
}
