package androidx.compose.p014ui.unit;

import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.Size;
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
        public static int m33487roundToPxR2X_6o(Density density, long j10) {
            return Density.super.mo27092roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m33488roundToPx0680j_4(Density density, float f10) {
            return Density.super.mo27093roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m33489toDpGaN1DYA(Density density, long j10) {
            return Density.super.mo27094toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m33491toDpu2uoSUM(Density density, int i10) {
            return Density.super.mo27096toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m33492toDpSizekrfVVM(Density density, long j10) {
            return Density.super.mo27097toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m33493toPxR2X_6o(Density density, long j10) {
            return Density.super.mo27098toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m33494toPx0680j_4(Density density, float f10) {
            return Density.super.mo27099toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(Density density, DpRect dpRect) {
            return Density.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m33495toSizeXkaWNTQ(Density density, long j10) {
            return Density.super.mo27100toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m33496toSp0xMU5do(Density density, float f10) {
            return Density.super.mo27101toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m33498toSpkPz2Gy4(Density density, int i10) {
            return Density.super.mo27103toSpkPz2Gy4(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m33490toDpu2uoSUM(Density density, float f10) {
            return Density.super.mo27095toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m33497toSpkPz2Gy4(Density density, float f10) {
            return Density.super.mo27102toSpkPz2Gy4(f10);
        }
    }

    float getDensity();

    @Stable
    /* renamed from: roundToPx--R2X_6o */
    default int mo27092roundToPxR2X_6o(long j10) {
        return Math.round(mo27098toPxR2X_6o(j10));
    }

    @Stable
    /* renamed from: roundToPx-0680j_4 */
    default int mo27093roundToPx0680j_4(float f10) {
        float fMo27099toPx0680j_4 = mo27099toPx0680j_4(f10);
        if (Float.isInfinite(fMo27099toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo27099toPx0680j_4);
    }

    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo27096toDpu2uoSUM(int i10) {
        return C3186Dp.m33501constructorimpl(i10 / getDensity());
    }

    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    default long mo27097toDpSizekrfVVM(long j10) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m33523DpSizeYgX7TsA(mo27095toDpu2uoSUM(Float.intBitsToFloat((int) (j10 >> 32))), mo27095toDpu2uoSUM(Float.intBitsToFloat((int) (j10 & 4294967295L)))) : DpSize.Companion.m33608getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* renamed from: toPx--R2X_6o */
    default float mo27098toPxR2X_6o(long j10) {
        if (!TextUnitType.m33723equalsimpl0(TextUnit.m33694getTypeUIouoOA(j10), TextUnitType.Companion.m33728getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return mo27099toPx0680j_4(mo27094toDpGaN1DYA(j10));
    }

    @Stable
    /* renamed from: toPx-0680j_4 */
    default float mo27099toPx0680j_4(float f10) {
        return f10 * getDensity();
    }

    @Stable
    default Rect toRect(DpRect dpRect) {
        return new Rect(mo27099toPx0680j_4(dpRect.m33584getLeftD9Ej5fM()), mo27099toPx0680j_4(dpRect.m33586getTopD9Ej5fM()), mo27099toPx0680j_4(dpRect.m33585getRightD9Ej5fM()), mo27099toPx0680j_4(dpRect.m33583getBottomD9Ej5fM()));
    }

    @Stable
    /* renamed from: toSize-XkaWNTQ */
    default long mo27100toSizeXkaWNTQ(long j10) {
        if (j10 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return Size.Companion.m30714getUnspecifiedNHjbRc();
        }
        float fMo27099toPx0680j_4 = mo27099toPx0680j_4(DpSize.m33599getWidthD9Ej5fM(j10));
        float fMo27099toPx0680j_42 = mo27099toPx0680j_4(DpSize.m33597getHeightD9Ej5fM(j10));
        return Size.m30697constructorimpl((Float.floatToRawIntBits(fMo27099toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(fMo27099toPx0680j_4) << 32));
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo27103toSpkPz2Gy4(int i10) {
        return mo27101toSp0xMU5do(mo27096toDpu2uoSUM(i10));
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo27102toSpkPz2Gy4(float f10) {
        return mo27101toSp0xMU5do(mo27095toDpu2uoSUM(f10));
    }

    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo27095toDpu2uoSUM(float f10) {
        return C3186Dp.m33501constructorimpl(f10 / getDensity());
    }
}
