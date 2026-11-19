package androidx.compose.p014ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class Offset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m30629constructorimpl(0);
    private static final long Infinite = m30629constructorimpl(InlineClassHelperKt.DualFloatInfinityBase);
    private static final long Unspecified = m30629constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        /* renamed from: getInfinite-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m30648getInfiniteF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m30649getUnspecifiedF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getZero-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m30650getZeroF1C5BW0$annotations() {
        }

        /* renamed from: getInfinite-F1C5BW0, reason: not valid java name */
        public final long m30651getInfiniteF1C5BW0() {
            return Offset.Infinite;
        }

        /* renamed from: getUnspecified-F1C5BW0, reason: not valid java name */
        public final long m30652getUnspecifiedF1C5BW0() {
            return Offset.Unspecified;
        }

        /* renamed from: getZero-F1C5BW0, reason: not valid java name */
        public final long m30653getZeroF1C5BW0() {
            return Offset.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Offset(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Offset m30626boximpl(long j10) {
        return new Offset(j10);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m30627component1impl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m30628component2impl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m30629constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-dBAh8RU, reason: not valid java name */
    public static final long m30630copydBAh8RU(long j10, float f10, float f11) {
        return m30629constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: copy-dBAh8RU$default, reason: not valid java name */
    public static /* synthetic */ long m30631copydBAh8RU$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (4294967295L & j10));
        }
        return m30630copydBAh8RU(j10, f10, f11);
    }

    @Stable
    /* renamed from: div-tuRUvjQ, reason: not valid java name */
    public static final long m30632divtuRUvjQ(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) / f10;
        return m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30633equalsimpl(long j10, Object obj) {
        return (obj instanceof Offset) && j10 == ((Offset) obj).m30647unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30634equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m30635getDistanceimpl(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
    }

    @Stable
    /* renamed from: getDistanceSquared-impl, reason: not valid java name */
    public static final float m30636getDistanceSquaredimpl(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2);
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m30637getXimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m30638getYimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30639hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    /* renamed from: isValid-impl, reason: not valid java name */
    public static final boolean m30640isValidimpl(long j10) {
        return (((j10 & 9223372034707292159L) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0;
    }

    @Stable
    /* renamed from: minus-MK-Hz9U, reason: not valid java name */
    public static final long m30641minusMKHz9U(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: plus-MK-Hz9U, reason: not valid java name */
    public static final long m30642plusMKHz9U(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j11 & 4294967295L));
        return m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: rem-tuRUvjQ, reason: not valid java name */
    public static final long m30643remtuRUvjQ(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) % f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) % f10;
        return m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-tuRUvjQ, reason: not valid java name */
    public static final long m30644timestuRUvjQ(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10;
        return m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30645toStringimpl(long j10) {
        if ((9223372034707292159L & j10) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "Offset.Unspecified";
        }
        return "Offset(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j10 >> 32)), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j10 & 4294967295L)), 1) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-F1C5BW0, reason: not valid java name */
    public static final long m30646unaryMinusF1C5BW0(long j10) {
        return m30629constructorimpl(j10 ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return m30633equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m30639hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m30645toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m30647unboximpl() {
        return this.packedValue;
    }
}
