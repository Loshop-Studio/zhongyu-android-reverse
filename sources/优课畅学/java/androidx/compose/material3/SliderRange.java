package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class SliderRange {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = SliderKt.SliderRange(Float.NaN, Float.NaN);
    private final long packedValue;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-FYbKRX4$annotations, reason: not valid java name */
        public static /* synthetic */ void m22524getUnspecifiedFYbKRX4$annotations() {
        }

        /* renamed from: getUnspecified-FYbKRX4, reason: not valid java name */
        public final long m22525getUnspecifiedFYbKRX4() {
            return SliderRange.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ SliderRange(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SliderRange m22515boximpl(long j10) {
        return new SliderRange(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m22516constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m22517equalsimpl(long j10, Object obj) {
        return (obj instanceof SliderRange) && j10 == ((SliderRange) obj).m22523unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m22518equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    public static /* synthetic */ void getEndInclusive$annotations() {
    }

    /* renamed from: getEndInclusive-impl, reason: not valid java name */
    public static final float m22519getEndInclusiveimpl(long j10) {
        if (j10 != Unspecified) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    @Stable
    public static /* synthetic */ void getStart$annotations() {
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final float m22520getStartimpl(long j10) {
        if (j10 != Unspecified) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m22521hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m22522toStringimpl(long j10) {
        if (!SliderKt.m22506isSpecifiedIf1S1O4(j10)) {
            return "FloatRange.Unspecified";
        }
        return m22520getStartimpl(j10) + ".." + m22519getEndInclusiveimpl(j10);
    }

    public boolean equals(Object obj) {
        return m22517equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m22521hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m22522toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m22523unboximpl() {
        return this.packedValue;
    }
}
