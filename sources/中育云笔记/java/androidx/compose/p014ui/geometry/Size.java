package androidx.compose.p014ui.geometry;

import androidx.collection.SieveCacheKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class Size {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m30697constructorimpl(0);
    private static final long Unspecified = m30697constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m30712getUnspecifiedNHjbRc$annotations() {
        }

        @Stable
        /* renamed from: getZero-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m30713getZeroNHjbRc$annotations() {
        }

        /* renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m30714getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }

        /* renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m30715getZeroNHjbRc() {
            return Size.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Size(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Size m30694boximpl(long j10) {
        return new Size(j10);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m30695component1impl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m30696component2impl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m30697constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m30698copyxjbvk4A(long j10, float f10, float f11) {
        return m30697constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m30699copyxjbvk4A$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (4294967295L & j10));
        }
        return m30698copyxjbvk4A(j10, f10, f11);
    }

    @Stable
    /* renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m30700div7Ah8Wj8(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) / f10;
        return m30697constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30701equalsimpl(long j10, Object obj) {
        return (obj instanceof Size) && j10 == ((Size) obj).m30711unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30702equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final float m30703getHeightimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    @Stable
    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    /* renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m30704getMaxDimensionimpl(long j10) {
        return Math.max(Float.intBitsToFloat((int) ((j10 >> 32) & SieveCacheKt.NodeLinkMask)), Float.intBitsToFloat((int) (j10 & SieveCacheKt.NodeLinkMask)));
    }

    @Stable
    public static /* synthetic */ void getMinDimension$annotations() {
    }

    /* renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m30705getMinDimensionimpl(long j10) {
        return Math.min(Float.intBitsToFloat((int) ((j10 >> 32) & SieveCacheKt.NodeLinkMask)), Float.intBitsToFloat((int) (j10 & SieveCacheKt.NodeLinkMask)));
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final float m30706getWidthimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30707hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m30708isEmptyimpl(long j10) {
        long j11 = (~((((-9223372034707292160L) & j10) >>> 31) * (-1))) & j10;
        return (((j11 & 4294967295L) & (j11 >>> 32)) == 0) | (j10 == InlineClassHelperKt.UnspecifiedPackedFloats);
    }

    @Stable
    /* renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m30709times7Ah8Wj8(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10;
        return m30697constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30710toStringimpl(long j10) {
        if (j10 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "Size.Unspecified";
        }
        return "Size(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j10 >> 32)), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j10 & 4294967295L)), 1) + ')';
    }

    public boolean equals(Object obj) {
        return m30701equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m30707hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m30710toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m30711unboximpl() {
        return this.packedValue;
    }
}
