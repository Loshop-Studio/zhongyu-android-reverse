package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.ConstraintsKt;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {
    private PaddingValues paddingValues;

    public PaddingValuesModifier(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        float fMo20806calculateLeftPaddingu2uoSUM = this.paddingValues.mo20806calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection());
        float fMo20808calculateTopPaddingD9Ej5fM = this.paddingValues.mo20808calculateTopPaddingD9Ej5fM();
        float fMo20807calculateRightPaddingu2uoSUM = this.paddingValues.mo20807calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection());
        float fMo20805calculateBottomPaddingD9Ej5fM = this.paddingValues.mo20805calculateBottomPaddingD9Ej5fM();
        float f10 = 0;
        if (!((C3156Dp.m26898compareTo0680j_4(fMo20805calculateBottomPaddingD9Ej5fM, C3156Dp.m26899constructorimpl(f10)) >= 0) & (C3156Dp.m26898compareTo0680j_4(fMo20806calculateLeftPaddingu2uoSUM, C3156Dp.m26899constructorimpl(f10)) >= 0) & (C3156Dp.m26898compareTo0680j_4(fMo20808calculateTopPaddingD9Ej5fM, C3156Dp.m26899constructorimpl(f10)) >= 0) & (C3156Dp.m26898compareTo0680j_4(fMo20807calculateRightPaddingu2uoSUM, C3156Dp.m26899constructorimpl(f10)) >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
        final int iMo20491roundToPx0680j_4 = measureScope.mo20491roundToPx0680j_4(fMo20806calculateLeftPaddingu2uoSUM);
        int iMo20491roundToPx0680j_42 = measureScope.mo20491roundToPx0680j_4(fMo20807calculateRightPaddingu2uoSUM) + iMo20491roundToPx0680j_4;
        final int iMo20491roundToPx0680j_43 = measureScope.mo20491roundToPx0680j_4(fMo20808calculateTopPaddingD9Ej5fM);
        int iMo20491roundToPx0680j_44 = measureScope.mo20491roundToPx0680j_4(fMo20805calculateBottomPaddingD9Ej5fM) + iMo20491roundToPx0680j_43;
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(ConstraintsKt.m26871offsetNN6EwU(j10, -iMo20491roundToPx0680j_42, -iMo20491roundToPx0680j_44));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m26869constrainWidthK40F9xA(j10, placeableMo25627measureBRTryo0.getWidth() + iMo20491roundToPx0680j_42), ConstraintsKt.m26868constrainHeightK40F9xA(j10, placeableMo25627measureBRTryo0.getHeight() + iMo20491roundToPx0680j_44), null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo25627measureBRTryo0, iMo20491roundToPx0680j_4, iMo20491roundToPx0680j_43, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void setPaddingValues(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }
}
