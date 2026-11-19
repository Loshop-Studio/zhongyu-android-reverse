package androidx.compose.p014ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class CornerRadius {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m30591constructorimpl(0);
    private final long packedValue;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        /* renamed from: getZero-kKHJgLs$annotations, reason: not valid java name */
        public static /* synthetic */ void m30608getZerokKHJgLs$annotations() {
        }

        /* renamed from: getZero-kKHJgLs, reason: not valid java name */
        public final long m30609getZerokKHJgLs() {
            return CornerRadius.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ CornerRadius(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CornerRadius m30588boximpl(long j10) {
        return new CornerRadius(j10);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m30589component1impl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m30590component2impl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m30591constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-OHQCggk, reason: not valid java name */
    public static final long m30592copyOHQCggk(long j10, float f10, float f11) {
        return m30591constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: copy-OHQCggk$default, reason: not valid java name */
    public static /* synthetic */ long m30593copyOHQCggk$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (4294967295L & j10));
        }
        return m30592copyOHQCggk(j10, f10, f11);
    }

    @Stable
    /* renamed from: div-Bz7bX_o, reason: not valid java name */
    public static final long m30594divBz7bX_o(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) / f10;
        return m30591constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30595equalsimpl(long j10, Object obj) {
        return (obj instanceof CornerRadius) && j10 == ((CornerRadius) obj).m30607unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30596equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m30597getXimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m30598getYimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30599hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    /* renamed from: isCircular-impl, reason: not valid java name */
    public static final boolean m30600isCircularimpl(long j10) {
        return (j10 >>> 32) == (j10 & 4294967295L);
    }

    @Stable
    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m30601isZeroimpl(long j10) {
        long j11 = j10 & 9223372034707292159L;
        return (((~j11) & (j11 - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) != 0;
    }

    @Stable
    /* renamed from: minus-vF7b-mM, reason: not valid java name */
    public static final long m30602minusvF7bmM(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return m30591constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: plus-vF7b-mM, reason: not valid java name */
    public static final long m30603plusvF7bmM(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j11 & 4294967295L));
        return m30591constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-Bz7bX_o, reason: not valid java name */
    public static final long m30604timesBz7bX_o(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10;
        return m30591constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30605toStringimpl(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "CornerRadius.circular(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i10), 1) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i10), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i11), 1) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-kKHJgLs, reason: not valid java name */
    public static final long m30606unaryMinuskKHJgLs(long j10) {
        return m30591constructorimpl(j10 ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return m30595equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m30599hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m30605toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m30607unboximpl() {
        return this.packedValue;
    }
}
