package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.DpKt;
import androidx.compose.p013ui.unit.DpSize;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.compose.p013ui.unit.TextUnitType;
import androidx.compose.runtime.Stable;
import java.util.List;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface LazyLayoutMeasureScope extends MeasureScope {
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    List<Placeable> mo21032measure0kLqBqw(int i10, long j10);

    @Override // androidx.compose.p013ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    default float mo20492toDpGaN1DYA(long j10) {
        if (!TextUnitType.m27121equalsimpl0(TextUnit.m27092getTypeUIouoOA(j10), TextUnitType.Companion.m27126getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return C3156Dp.m26899constructorimpl(TextUnit.m27093getValueimpl(j10) * getFontScale());
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo20494toDpu2uoSUM(int i10) {
        return C3156Dp.m26899constructorimpl(i10 / getDensity());
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    default long mo20495toDpSizekrfVVM(long j10) {
        return j10 != androidx.compose.p013ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m26921DpSizeYgX7TsA(mo20493toDpu2uoSUM(Float.intBitsToFloat((int) (j10 >> 32))), mo20493toDpu2uoSUM(Float.intBitsToFloat((int) (j10 & 4294967295L)))) : DpSize.Companion.m27006getUnspecifiedMYxV2XQ();
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    default long mo20498toSizeXkaWNTQ(long j10) {
        if (j10 == androidx.compose.p013ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return Size.Companion.m24112getUnspecifiedNHjbRc();
        }
        float fMo20497toPx0680j_4 = mo20497toPx0680j_4(DpSize.m26997getWidthD9Ej5fM(j10));
        float fMo20497toPx0680j_42 = mo20497toPx0680j_4(DpSize.m26995getHeightD9Ej5fM(j10));
        return Size.m24095constructorimpl((Float.floatToRawIntBits(fMo20497toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(fMo20497toPx0680j_4) << 32));
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    default long mo20499toSp0xMU5do(float f10) {
        return TextUnitKt.getSp(f10 / getFontScale());
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo20500toSpkPz2Gy4(float f10) {
        return TextUnitKt.getSp(f10 / (getFontScale() * getDensity()));
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo20501toSpkPz2Gy4(int i10) {
        return TextUnitKt.getSp(i10 / (getFontScale() * getDensity()));
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo20493toDpu2uoSUM(float f10) {
        return C3156Dp.m26899constructorimpl(f10 / getDensity());
    }
}
