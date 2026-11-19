package androidx.compose.p014ui.unit;

import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class DpSize {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m33590constructorimpl(0);
    private static final long Unspecified = m33590constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m33608getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m33609getZeroMYxV2XQ() {
            return DpSize.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DpSize(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m33587boximpl(long j10) {
        return new DpSize(j10);
    }

    @Stable
    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m33588component1D9Ej5fM(long j10) {
        return m33599getWidthD9Ej5fM(j10);
    }

    @Stable
    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m33589component2D9Ej5fM(long j10) {
        return m33597getHeightD9Ej5fM(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m33590constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m33591copyDwJknco(long j10, float f10, float f11) {
        return m33590constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m33592copyDwJknco$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m33599getWidthD9Ej5fM(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m33597getHeightD9Ej5fM(j10);
        }
        return m33591copyDwJknco(j10, f10, f11);
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m33594divGh9hcWk(long j10, int i10) {
        float f10 = i10;
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(m33599getWidthD9Ej5fM(j10) / f10);
        float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(m33597getHeightD9Ej5fM(j10) / f10);
        return m33590constructorimpl((Float.floatToRawIntBits(fM33501constructorimpl) << 32) | (Float.floatToRawIntBits(fM33501constructorimpl2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33595equalsimpl(long j10, Object obj) {
        return (obj instanceof DpSize) && j10 == ((DpSize) obj).m33607unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33596equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m33597getHeightD9Ej5fM(long j10) {
        return C3186Dp.m33501constructorimpl(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    @Stable
    /* renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m33598getHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m33599getWidthD9Ej5fM(long j10) {
        return C3186Dp.m33501constructorimpl(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    @Stable
    /* renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m33600getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33601hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    /* renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m33602minuse_xh8Ic(long j10, long j11) {
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(m33599getWidthD9Ej5fM(j10) - m33599getWidthD9Ej5fM(j11));
        float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(m33597getHeightD9Ej5fM(j10) - m33597getHeightD9Ej5fM(j11));
        return m33590constructorimpl((Float.floatToRawIntBits(fM33501constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM33501constructorimpl2)));
    }

    @Stable
    /* renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m33603pluse_xh8Ic(long j10, long j11) {
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(m33599getWidthD9Ej5fM(j10) + m33599getWidthD9Ej5fM(j11));
        float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(m33597getHeightD9Ej5fM(j10) + m33597getHeightD9Ej5fM(j11));
        return m33590constructorimpl((Float.floatToRawIntBits(fM33501constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM33501constructorimpl2)));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m33605timesGh9hcWk(long j10, int i10) {
        float f10 = i10;
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(m33599getWidthD9Ej5fM(j10) * f10);
        float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(m33597getHeightD9Ej5fM(j10) * f10);
        return m33590constructorimpl((Float.floatToRawIntBits(fM33501constructorimpl) << 32) | (Float.floatToRawIntBits(fM33501constructorimpl2) & 4294967295L));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33606toStringimpl(long j10) {
        if (j10 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "DpSize.Unspecified";
        }
        return ((Object) C3186Dp.m33512toStringimpl(m33599getWidthD9Ej5fM(j10))) + " x " + ((Object) C3186Dp.m33512toStringimpl(m33597getHeightD9Ej5fM(j10)));
    }

    public boolean equals(Object obj) {
        return m33595equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m33601hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m33606toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m33607unboximpl() {
        return this.packedValue;
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m33593divGh9hcWk(long j10, float f10) {
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(m33599getWidthD9Ej5fM(j10) / f10);
        float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(m33597getHeightD9Ej5fM(j10) / f10);
        return m33590constructorimpl((Float.floatToRawIntBits(fM33501constructorimpl) << 32) | (Float.floatToRawIntBits(fM33501constructorimpl2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m33604timesGh9hcWk(long j10, float f10) {
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(m33599getWidthD9Ej5fM(j10) * f10);
        float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(m33597getHeightD9Ej5fM(j10) * f10);
        return m33590constructorimpl((Float.floatToRawIntBits(fM33501constructorimpl) << 32) | (Float.floatToRawIntBits(fM33501constructorimpl2) & 4294967295L));
    }
}
