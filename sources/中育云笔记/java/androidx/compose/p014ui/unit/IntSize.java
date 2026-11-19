package androidx.compose.p014ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class IntSize {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m33667constructorimpl(0);
    private final long packedValue;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getZero-YbymL2g, reason: not valid java name */
        public final long m33677getZeroYbymL2g() {
            return IntSize.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ IntSize(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntSize m33664boximpl(long j10) {
        return new IntSize(j10);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m33665component1impl(long j10) {
        return (int) (j10 >> 32);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m33666component2impl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m33667constructorimpl(long j10) {
        return j10;
    }

    @Stable
    /* renamed from: div-YEO4UFw, reason: not valid java name */
    public static final long m33668divYEO4UFw(long j10, int i10) {
        return m33667constructorimpl(((((int) (j10 >> 32)) / i10) << 32) | ((((int) (j10 & 4294967295L)) / i10) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33669equalsimpl(long j10, Object obj) {
        return (obj instanceof IntSize) && j10 == ((IntSize) obj).m33676unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33670equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final int m33671getHeightimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final int m33672getWidthimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33673hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    /* renamed from: times-YEO4UFw, reason: not valid java name */
    public static final long m33674timesYEO4UFw(long j10, int i10) {
        return m33667constructorimpl(((((int) (j10 >> 32)) * i10) << 32) | ((((int) (j10 & 4294967295L)) * i10) & 4294967295L));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33675toStringimpl(long j10) {
        return ((int) (j10 >> 32)) + " x " + ((int) (j10 & 4294967295L));
    }

    public boolean equals(Object obj) {
        return m33669equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m33673hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m33675toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m33676unboximpl() {
        return this.packedValue;
    }
}
