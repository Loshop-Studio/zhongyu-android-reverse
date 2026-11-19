package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class DpOffset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m26955constructorimpl(0);
    private static final long Unspecified = m26955constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m26969getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        /* renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m26970getZeroRKDOV3M() {
            return DpOffset.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DpOffset(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m26954boximpl(long j10) {
        return new DpOffset(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m26955constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m26956copytPigGR8(long j10, float f10, float f11) {
        return m26955constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m26957copytPigGR8$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m26960getXD9Ej5fM(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m26962getYD9Ej5fM(j10);
        }
        return m26956copytPigGR8(j10, f10, f11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26958equalsimpl(long j10, Object obj) {
        return (obj instanceof DpOffset) && j10 == ((DpOffset) obj).m26968unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26959equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m26960getXD9Ej5fM(long j10) {
        return C3156Dp.m26899constructorimpl(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    @Stable
    /* renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m26961getXD9Ej5fM$annotations() {
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m26962getYD9Ej5fM(long j10) {
        return C3156Dp.m26899constructorimpl(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    @Stable
    /* renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m26963getYD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26964hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    /* renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m26965minusCBMgk4(long j10, long j11) {
        float fM26899constructorimpl = C3156Dp.m26899constructorimpl(m26960getXD9Ej5fM(j10) - m26960getXD9Ej5fM(j11));
        float fM26899constructorimpl2 = C3156Dp.m26899constructorimpl(m26962getYD9Ej5fM(j10) - m26962getYD9Ej5fM(j11));
        return m26955constructorimpl((Float.floatToRawIntBits(fM26899constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM26899constructorimpl2)));
    }

    @Stable
    /* renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m26966plusCBMgk4(long j10, long j11) {
        float fM26899constructorimpl = C3156Dp.m26899constructorimpl(m26960getXD9Ej5fM(j10) + m26960getXD9Ej5fM(j11));
        float fM26899constructorimpl2 = C3156Dp.m26899constructorimpl(m26962getYD9Ej5fM(j10) + m26962getYD9Ej5fM(j11));
        return m26955constructorimpl((Float.floatToRawIntBits(fM26899constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM26899constructorimpl2)));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26967toStringimpl(long j10) {
        if (j10 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) C3156Dp.m26910toStringimpl(m26960getXD9Ej5fM(j10))) + ", " + ((Object) C3156Dp.m26910toStringimpl(m26962getYD9Ej5fM(j10))) + ')';
    }

    public boolean equals(Object obj) {
        return m26958equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m26964hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m26967toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m26968unboximpl() {
        return this.packedValue;
    }
}
