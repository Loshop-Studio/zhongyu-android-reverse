package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;

@Immutable
/* loaded from: classes2.dex */
public interface Density extends FontScaling {

    public static final class DefaultImpls {
        @Stable
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m26885roundToPxR2X_6o(Density density, long j10) {
            return Density.super.mo20490roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m26886roundToPx0680j_4(Density density, float f10) {
            return Density.super.mo20491roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m26887toDpGaN1DYA(Density density, long j10) {
            return Density.super.mo20492toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m26889toDpu2uoSUM(Density density, int i10) {
            return Density.super.mo20494toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m26890toDpSizekrfVVM(Density density, long j10) {
            return Density.super.mo20495toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m26891toPxR2X_6o(Density density, long j10) {
            return Density.super.mo20496toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m26892toPx0680j_4(Density density, float f10) {
            return Density.super.mo20497toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(Density density, DpRect dpRect) {
            return Density.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m26893toSizeXkaWNTQ(Density density, long j10) {
            return Density.super.mo20498toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m26894toSp0xMU5do(Density density, float f10) {
            return Density.super.mo20499toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m26896toSpkPz2Gy4(Density density, int i10) {
            return Density.super.mo20501toSpkPz2Gy4(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m26888toDpu2uoSUM(Density density, float f10) {
            return Density.super.mo20493toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m26895toSpkPz2Gy4(Density density, float f10) {
            return Density.super.mo20500toSpkPz2Gy4(f10);
        }
    }

    float getDensity();

    @Stable
    /* renamed from: roundToPx--R2X_6o */
    default int mo20490roundToPxR2X_6o(long j10) {
        return Math.round(mo20496toPxR2X_6o(j10));
    }

    @Stable
    /* renamed from: roundToPx-0680j_4 */
    default int mo20491roundToPx0680j_4(float f10) {
        float fMo20497toPx0680j_4 = mo20497toPx0680j_4(f10);
        if (Float.isInfinite(fMo20497toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo20497toPx0680j_4);
    }

    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo20494toDpu2uoSUM(int i10) {
        return C3156Dp.m26899constructorimpl(i10 / getDensity());
    }

    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    default long mo20495toDpSizekrfVVM(long j10) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m26921DpSizeYgX7TsA(mo20493toDpu2uoSUM(Float.intBitsToFloat((int) (j10 >> 32))), mo20493toDpu2uoSUM(Float.intBitsToFloat((int) (j10 & 4294967295L)))) : DpSize.Companion.m27006getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* renamed from: toPx--R2X_6o */
    default float mo20496toPxR2X_6o(long j10) {
        if (!TextUnitType.m27121equalsimpl0(TextUnit.m27092getTypeUIouoOA(j10), TextUnitType.Companion.m27126getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return mo20497toPx0680j_4(mo20492toDpGaN1DYA(j10));
    }

    @Stable
    /* renamed from: toPx-0680j_4 */
    default float mo20497toPx0680j_4(float f10) {
        return f10 * getDensity();
    }

    @Stable
    default Rect toRect(DpRect dpRect) {
        return new Rect(mo20497toPx0680j_4(dpRect.m26982getLeftD9Ej5fM()), mo20497toPx0680j_4(dpRect.m26984getTopD9Ej5fM()), mo20497toPx0680j_4(dpRect.m26983getRightD9Ej5fM()), mo20497toPx0680j_4(dpRect.m26981getBottomD9Ej5fM()));
    }

    @Stable
    /* renamed from: toSize-XkaWNTQ */
    default long mo20498toSizeXkaWNTQ(long j10) {
        if (j10 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return Size.Companion.m24112getUnspecifiedNHjbRc();
        }
        float fMo20497toPx0680j_4 = mo20497toPx0680j_4(DpSize.m26997getWidthD9Ej5fM(j10));
        float fMo20497toPx0680j_42 = mo20497toPx0680j_4(DpSize.m26995getHeightD9Ej5fM(j10));
        return Size.m24095constructorimpl((Float.floatToRawIntBits(fMo20497toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(fMo20497toPx0680j_4) << 32));
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo20501toSpkPz2Gy4(int i10) {
        return mo20499toSp0xMU5do(mo20494toDpu2uoSUM(i10));
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo20500toSpkPz2Gy4(float f10) {
        return mo20499toSp0xMU5do(mo20493toDpu2uoSUM(f10));
    }

    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo20493toDpu2uoSUM(float f10) {
        return C3156Dp.m26899constructorimpl(f10 / getDensity());
    }
}
