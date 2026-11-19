package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class DpSize {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m26988constructorimpl(0);
    private static final long Unspecified = m26988constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m27006getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m27007getZeroMYxV2XQ() {
            return DpSize.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DpSize(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m26985boximpl(long j10) {
        return new DpSize(j10);
    }

    @Stable
    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m26986component1D9Ej5fM(long j10) {
        return m26997getWidthD9Ej5fM(j10);
    }

    @Stable
    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m26987component2D9Ej5fM(long j10) {
        return m26995getHeightD9Ej5fM(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m26988constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m26989copyDwJknco(long j10, float f10, float f11) {
        return m26988constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m26990copyDwJknco$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m26997getWidthD9Ej5fM(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m26995getHeightD9Ej5fM(j10);
        }
        return m26989copyDwJknco(j10, f10, f11);
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m26992divGh9hcWk(long j10, int i10) {
        float f10 = i10;
        float fM26899constructorimpl = C3156Dp.m26899constructorimpl(m26997getWidthD9Ej5fM(j10) / f10);
        float fM26899constructorimpl2 = C3156Dp.m26899constructorimpl(m26995getHeightD9Ej5fM(j10) / f10);
        return m26988constructorimpl((Float.floatToRawIntBits(fM26899constructorimpl) << 32) | (Float.floatToRawIntBits(fM26899constructorimpl2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26993equalsimpl(long j10, Object obj) {
        return (obj instanceof DpSize) && j10 == ((DpSize) obj).m27005unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26994equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m26995getHeightD9Ej5fM(long j10) {
        return C3156Dp.m26899constructorimpl(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    @Stable
    /* renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m26996getHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m26997getWidthD9Ej5fM(long j10) {
        return C3156Dp.m26899constructorimpl(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    @Stable
    /* renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m26998getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26999hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    /* renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m27000minuse_xh8Ic(long j10, long j11) {
        float fM26899constructorimpl = C3156Dp.m26899constructorimpl(m26997getWidthD9Ej5fM(j10) - m26997getWidthD9Ej5fM(j11));
        float fM26899constructorimpl2 = C3156Dp.m26899constructorimpl(m26995getHeightD9Ej5fM(j10) - m26995getHeightD9Ej5fM(j11));
        return m26988constructorimpl((Float.floatToRawIntBits(fM26899constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM26899constructorimpl2)));
    }

    @Stable
    /* renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m27001pluse_xh8Ic(long j10, long j11) {
        float fM26899constructorimpl = C3156Dp.m26899constructorimpl(m26997getWidthD9Ej5fM(j10) + m26997getWidthD9Ej5fM(j11));
        float fM26899constructorimpl2 = C3156Dp.m26899constructorimpl(m26995getHeightD9Ej5fM(j10) + m26995getHeightD9Ej5fM(j11));
        return m26988constructorimpl((Float.floatToRawIntBits(fM26899constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM26899constructorimpl2)));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m27003timesGh9hcWk(long j10, int i10) {
        float f10 = i10;
        float fM26899constructorimpl = C3156Dp.m26899constructorimpl(m26997getWidthD9Ej5fM(j10) * f10);
        float fM26899constructorimpl2 = C3156Dp.m26899constructorimpl(m26995getHeightD9Ej5fM(j10) * f10);
        return m26988constructorimpl((Float.floatToRawIntBits(fM26899constructorimpl) << 32) | (Float.floatToRawIntBits(fM26899constructorimpl2) & 4294967295L));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27004toStringimpl(long j10) {
        if (j10 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "DpSize.Unspecified";
        }
        return ((Object) C3156Dp.m26910toStringimpl(m26997getWidthD9Ej5fM(j10))) + " x " + ((Object) C3156Dp.m26910toStringimpl(m26995getHeightD9Ej5fM(j10)));
    }

    public boolean equals(Object obj) {
        return m26993equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m26999hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m27004toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m27005unboximpl() {
        return this.packedValue;
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m26991divGh9hcWk(long j10, float f10) {
        float fM26899constructorimpl = C3156Dp.m26899constructorimpl(m26997getWidthD9Ej5fM(j10) / f10);
        float fM26899constructorimpl2 = C3156Dp.m26899constructorimpl(m26995getHeightD9Ej5fM(j10) / f10);
        return m26988constructorimpl((Float.floatToRawIntBits(fM26899constructorimpl) << 32) | (Float.floatToRawIntBits(fM26899constructorimpl2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m27002timesGh9hcWk(long j10, float f10) {
        float fM26899constructorimpl = C3156Dp.m26899constructorimpl(m26997getWidthD9Ej5fM(j10) * f10);
        float fM26899constructorimpl2 = C3156Dp.m26899constructorimpl(m26995getHeightD9Ej5fM(j10) * f10);
        return m26988constructorimpl((Float.floatToRawIntBits(fM26899constructorimpl) << 32) | (Float.floatToRawIntBits(fM26899constructorimpl2) & 4294967295L));
    }
}
