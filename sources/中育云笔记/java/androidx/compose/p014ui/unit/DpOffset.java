package androidx.compose.p014ui.unit;

import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class DpOffset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m33557constructorimpl(0);
    private static final long Unspecified = m33557constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m33571getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        /* renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m33572getZeroRKDOV3M() {
            return DpOffset.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DpOffset(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m33556boximpl(long j10) {
        return new DpOffset(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m33557constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m33558copytPigGR8(long j10, float f10, float f11) {
        return m33557constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m33559copytPigGR8$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m33562getXD9Ej5fM(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m33564getYD9Ej5fM(j10);
        }
        return m33558copytPigGR8(j10, f10, f11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33560equalsimpl(long j10, Object obj) {
        return (obj instanceof DpOffset) && j10 == ((DpOffset) obj).m33570unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33561equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m33562getXD9Ej5fM(long j10) {
        return C3186Dp.m33501constructorimpl(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    @Stable
    /* renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m33563getXD9Ej5fM$annotations() {
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m33564getYD9Ej5fM(long j10) {
        return C3186Dp.m33501constructorimpl(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    @Stable
    /* renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m33565getYD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33566hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    /* renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m33567minusCBMgk4(long j10, long j11) {
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(m33562getXD9Ej5fM(j10) - m33562getXD9Ej5fM(j11));
        float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(m33564getYD9Ej5fM(j10) - m33564getYD9Ej5fM(j11));
        return m33557constructorimpl((Float.floatToRawIntBits(fM33501constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM33501constructorimpl2)));
    }

    @Stable
    /* renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m33568plusCBMgk4(long j10, long j11) {
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(m33562getXD9Ej5fM(j10) + m33562getXD9Ej5fM(j11));
        float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(m33564getYD9Ej5fM(j10) + m33564getYD9Ej5fM(j11));
        return m33557constructorimpl((Float.floatToRawIntBits(fM33501constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM33501constructorimpl2)));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33569toStringimpl(long j10) {
        if (j10 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) C3186Dp.m33512toStringimpl(m33562getXD9Ej5fM(j10))) + ", " + ((Object) C3186Dp.m33512toStringimpl(m33564getYD9Ej5fM(j10))) + ')';
    }

    public boolean equals(Object obj) {
        return m33560equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m33566hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m33569toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m33570unboximpl() {
        return this.packedValue;
    }
}
