package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;

@SinceKotlin(version = "1.9")
@Metadata(m13557d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0007"}, m13558d2 = {"Lkotlin/time/TimeSource;", "", "markNow", "Lkotlin/time/TimeMark;", "WithComparableMarks", "Monotonic", "Companion", "kotlin-stdlib"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
/* loaded from: classes5.dex */
public interface TimeSource {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lkotlin/time/TimeSource$Companion;", "", "<init>", "()V", "kotlin-stdlib"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(m13557d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, m13558d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "<init>", "()V", "markNow", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "toString", "", "ValueTimeMark", "kotlin-stdlib"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class Monotonic implements WithComparableMarks {
        public static final Monotonic INSTANCE = new Monotonic();

        @SinceKotlin(version = "1.9")
        @Metadata(m13557d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u000eJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\u0004\n\u0002\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006$"}, m13558d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "constructor-impl", "(J)J", "J", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "plus", TypedValues.TransitionType.S_DURATION, "plus-LRDsOJo", "(JJ)J", "minus", "minus-LRDsOJo", "hasPassedNow", "", "hasPassedNow-impl", "(J)Z", "hasNotPassedNow", "hasNotPassedNow-impl", "other", "minus-UwyO8pc", "(JLkotlin/time/ComparableTimeMark;)J", "minus-6eNON_k", "compareTo", "", "compareTo-6eNON_k", "(JJ)I", "equals", "", "hashCode", "toString", "", "kotlin-stdlib"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
        @JvmInline
        @WasExperimental(markerClass = {ExperimentalTime.class})
        public static final class ValueTimeMark implements ComparableTimeMark {
            private final long reading;

            private /* synthetic */ ValueTimeMark(long j10) {
                this.reading = j10;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ ValueTimeMark m25736boximpl(long j10) {
                return new ValueTimeMark(j10);
            }

            /* renamed from: compareTo-6eNON_k, reason: not valid java name */
            public static final int m25737compareTo6eNON_k(long j10, long j11) {
                return Duration.m25622compareToLRDsOJo(m25746minus6eNON_k(j10, j11), Duration.INSTANCE.m25714getZEROUwyO8pc());
            }

            /* renamed from: compareTo-impl, reason: not valid java name */
            public static int m25738compareToimpl(long j10, ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m25736boximpl(j10).compareTo(other);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static long m25739constructorimpl(long j10) {
                return j10;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m25741equalsimpl(long j10, Object obj) {
                return (obj instanceof ValueTimeMark) && j10 == ((ValueTimeMark) obj).getReading();
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m25742equalsimpl0(long j10, long j11) {
                return j10 == j11;
            }

            /* renamed from: hasNotPassedNow-impl, reason: not valid java name */
            public static boolean m25743hasNotPassedNowimpl(long j10) {
                return Duration.m25649isNegativeimpl(m25740elapsedNowUwyO8pc(j10));
            }

            /* renamed from: hasPassedNow-impl, reason: not valid java name */
            public static boolean m25744hasPassedNowimpl(long j10) {
                return !Duration.m25649isNegativeimpl(m25740elapsedNowUwyO8pc(j10));
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m25745hashCodeimpl(long j10) {
                return Long.hashCode(j10);
            }

            /* renamed from: minus-6eNON_k, reason: not valid java name */
            public static final long m25746minus6eNON_k(long j10, long j11) {
                return MonotonicTimeSource.INSTANCE.m25728differenceBetweenfRLX17w(j10, j11);
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m25750toStringimpl(long j10) {
                return "ValueTimeMark(reading=" + j10 + ')';
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: elapsedNow-UwyO8pc */
            public long mo25613elapsedNowUwyO8pc() {
                return m25740elapsedNowUwyO8pc(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark
            public boolean equals(Object other) {
                return m25741equalsimpl(this.reading, other);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                return m25743hasNotPassedNowimpl(this.reading);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasPassedNow() {
                return m25744hasPassedNowimpl(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark
            public int hashCode() {
                return m25745hashCodeimpl(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo25614minusLRDsOJo(long j10) {
                return m25736boximpl(m25751minusLRDsOJo(j10));
            }

            @Override // kotlin.time.ComparableTimeMark
            /* renamed from: minus-UwyO8pc */
            public long mo25615minusUwyO8pc(ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m25748minusUwyO8pc(this.reading, other);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo25616plusLRDsOJo(long j10) {
                return m25736boximpl(m25752plusLRDsOJo(j10));
            }

            public String toString() {
                return m25750toStringimpl(this.reading);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ long getReading() {
                return this.reading;
            }

            /* renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
            public static long m25740elapsedNowUwyO8pc(long j10) {
                return MonotonicTimeSource.INSTANCE.m25729elapsedFrom6eNON_k(j10);
            }

            /* renamed from: minus-UwyO8pc, reason: not valid java name */
            public static long m25748minusUwyO8pc(long j10, ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                if (other instanceof ValueTimeMark) {
                    return m25746minus6eNON_k(j10, ((ValueTimeMark) other).getReading());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m25750toStringimpl(j10)) + " and " + other);
            }

            @Override // java.lang.Comparable
            public int compareTo(ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo25614minusLRDsOJo(long j10) {
                return m25736boximpl(m25751minusLRDsOJo(j10));
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo25616plusLRDsOJo(long j10) {
                return m25736boximpl(m25752plusLRDsOJo(j10));
            }

            /* renamed from: minus-LRDsOJo, reason: not valid java name */
            public long m25751minusLRDsOJo(long j10) {
                return m25747minusLRDsOJo(this.reading, j10);
            }

            /* renamed from: plus-LRDsOJo, reason: not valid java name */
            public long m25752plusLRDsOJo(long j10) {
                return m25749plusLRDsOJo(this.reading, j10);
            }

            /* renamed from: minus-LRDsOJo, reason: not valid java name */
            public static long m25747minusLRDsOJo(long j10, long j11) {
                return MonotonicTimeSource.INSTANCE.m25727adjustReading6QKq23U(j10, Duration.m25667unaryMinusUwyO8pc(j11));
            }

            /* renamed from: plus-LRDsOJo, reason: not valid java name */
            public static long m25749plusLRDsOJo(long j10, long j11) {
                return MonotonicTimeSource.INSTANCE.m25727adjustReading6QKq23U(j10, j11);
            }
        }

        private Monotonic() {
        }

        @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
            return ValueTimeMark.m25736boximpl(m25735markNowz9LOYto());
        }

        /* renamed from: markNow-z9LOYto, reason: not valid java name */
        public long m25735markNowz9LOYto() {
            return MonotonicTimeSource.INSTANCE.m25730markNowz9LOYto();
        }

        public String toString() {
            return MonotonicTimeSource.INSTANCE.toString();
        }

        @Override // kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ TimeMark markNow() {
            return ValueTimeMark.m25736boximpl(m25735markNowz9LOYto());
        }
    }

    @SinceKotlin(version = "1.9")
    @Metadata(m13557d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m13558d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "markNow", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public interface WithComparableMarks extends TimeSource {
        @Override // kotlin.time.TimeSource
        ComparableTimeMark markNow();
    }

    TimeMark markNow();
}
