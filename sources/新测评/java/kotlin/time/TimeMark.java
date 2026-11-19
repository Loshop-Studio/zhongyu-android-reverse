package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;

@SinceKotlin(version = "1.9")
@Metadata(m13557d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u000f"}, m13558d2 = {"Lkotlin/time/TimeMark;", "", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "plus", TypedValues.TransitionType.S_DURATION, "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "minus", "minus-LRDsOJo", "hasPassedNow", "", "hasNotPassedNow", "kotlin-stdlib"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
/* loaded from: classes5.dex */
public interface TimeMark {

    @Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class DefaultImpls {
        public static boolean hasNotPassedNow(TimeMark timeMark) {
            return Duration.m25649isNegativeimpl(timeMark.mo25613elapsedNowUwyO8pc());
        }

        public static boolean hasPassedNow(TimeMark timeMark) {
            return !Duration.m25649isNegativeimpl(timeMark.mo25613elapsedNowUwyO8pc());
        }

        /* renamed from: minus-LRDsOJo, reason: not valid java name */
        public static TimeMark m25733minusLRDsOJo(TimeMark timeMark, long j10) {
            return timeMark.mo25616plusLRDsOJo(Duration.m25667unaryMinusUwyO8pc(j10));
        }

        /* renamed from: plus-LRDsOJo, reason: not valid java name */
        public static TimeMark m25734plusLRDsOJo(TimeMark timeMark, long j10) {
            return new AdjustedTimeMark(timeMark, j10, null);
        }
    }

    /* renamed from: elapsedNow-UwyO8pc */
    long mo25613elapsedNowUwyO8pc();

    boolean hasNotPassedNow();

    boolean hasPassedNow();

    /* renamed from: minus-LRDsOJo */
    TimeMark mo25614minusLRDsOJo(long duration);

    /* renamed from: plus-LRDsOJo */
    TimeMark mo25616plusLRDsOJo(long duration);
}
