package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.DpKt;
import androidx.compose.p014ui.unit.DpSize;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.p014ui.unit.TextUnitKt;
import androidx.compose.p014ui.unit.TextUnitType;
import androidx.compose.runtime.Stable;
import java.util.List;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface LazyLayoutMeasureScope extends MeasureScope {
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    List<Placeable> mo27634measure0kLqBqw(int i10, long j10);

    @Override // androidx.compose.p014ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    default float mo27094toDpGaN1DYA(long j10) {
        if (!TextUnitType.m33723equalsimpl0(TextUnit.m33694getTypeUIouoOA(j10), TextUnitType.Companion.m33728getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return C3186Dp.m33501constructorimpl(TextUnit.m33695getValueimpl(j10) * getFontScale());
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo27096toDpu2uoSUM(int i10) {
        return C3186Dp.m33501constructorimpl(i10 / getDensity());
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    default long mo27097toDpSizekrfVVM(long j10) {
        return j10 != androidx.compose.p014ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m33523DpSizeYgX7TsA(mo27095toDpu2uoSUM(Float.intBitsToFloat((int) (j10 >> 32))), mo27095toDpu2uoSUM(Float.intBitsToFloat((int) (j10 & 4294967295L)))) : DpSize.Companion.m33608getUnspecifiedMYxV2XQ();
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    default long mo27100toSizeXkaWNTQ(long j10) {
        if (j10 == androidx.compose.p014ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return Size.Companion.m30714getUnspecifiedNHjbRc();
        }
        float fMo27099toPx0680j_4 = mo27099toPx0680j_4(DpSize.m33599getWidthD9Ej5fM(j10));
        float fMo27099toPx0680j_42 = mo27099toPx0680j_4(DpSize.m33597getHeightD9Ej5fM(j10));
        return Size.m30697constructorimpl((Float.floatToRawIntBits(fMo27099toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(fMo27099toPx0680j_4) << 32));
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    default long mo27101toSp0xMU5do(float f10) {
        return TextUnitKt.getSp(f10 / getFontScale());
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo27102toSpkPz2Gy4(float f10) {
        return TextUnitKt.getSp(f10 / (getFontScale() * getDensity()));
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo27103toSpkPz2Gy4(int i10) {
        return TextUnitKt.getSp(i10 / (getFontScale() * getDensity()));
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo27095toDpu2uoSUM(float f10) {
        return C3186Dp.m33501constructorimpl(f10 / getDensity());
    }
}
