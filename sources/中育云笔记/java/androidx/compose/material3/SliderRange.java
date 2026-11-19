package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class SliderRange {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = SliderKt.SliderRange(Float.NaN, Float.NaN);
    private final long packedValue;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-FYbKRX4$annotations, reason: not valid java name */
        public static /* synthetic */ void m29126getUnspecifiedFYbKRX4$annotations() {
        }

        /* renamed from: getUnspecified-FYbKRX4, reason: not valid java name */
        public final long m29127getUnspecifiedFYbKRX4() {
            return SliderRange.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ SliderRange(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SliderRange m29117boximpl(long j10) {
        return new SliderRange(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m29118constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m29119equalsimpl(long j10, Object obj) {
        return (obj instanceof SliderRange) && j10 == ((SliderRange) obj).m29125unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m29120equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    public static /* synthetic */ void getEndInclusive$annotations() {
    }

    /* renamed from: getEndInclusive-impl, reason: not valid java name */
    public static final float m29121getEndInclusiveimpl(long j10) {
        if (j10 != Unspecified) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    @Stable
    public static /* synthetic */ void getStart$annotations() {
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final float m29122getStartimpl(long j10) {
        if (j10 != Unspecified) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m29123hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m29124toStringimpl(long j10) {
        if (!SliderKt.m29108isSpecifiedIf1S1O4(j10)) {
            return "FloatRange.Unspecified";
        }
        return m29122getStartimpl(j10) + ".." + m29121getEndInclusiveimpl(j10);
    }

    public boolean equals(Object obj) {
        return m29119equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m29123hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m29124toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m29125unboximpl() {
        return this.packedValue;
    }
}
