package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.ConstraintsKt;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {
    private PaddingValues paddingValues;

    public PaddingValuesModifier(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        float fMo27408calculateLeftPaddingu2uoSUM = this.paddingValues.mo27408calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection());
        float fMo27410calculateTopPaddingD9Ej5fM = this.paddingValues.mo27410calculateTopPaddingD9Ej5fM();
        float fMo27409calculateRightPaddingu2uoSUM = this.paddingValues.mo27409calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection());
        float fMo27407calculateBottomPaddingD9Ej5fM = this.paddingValues.mo27407calculateBottomPaddingD9Ej5fM();
        float f10 = 0;
        if (!((C3186Dp.m33500compareTo0680j_4(fMo27407calculateBottomPaddingD9Ej5fM, C3186Dp.m33501constructorimpl(f10)) >= 0) & (C3186Dp.m33500compareTo0680j_4(fMo27408calculateLeftPaddingu2uoSUM, C3186Dp.m33501constructorimpl(f10)) >= 0) & (C3186Dp.m33500compareTo0680j_4(fMo27410calculateTopPaddingD9Ej5fM, C3186Dp.m33501constructorimpl(f10)) >= 0) & (C3186Dp.m33500compareTo0680j_4(fMo27409calculateRightPaddingu2uoSUM, C3186Dp.m33501constructorimpl(f10)) >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
        final int iMo27093roundToPx0680j_4 = measureScope.mo27093roundToPx0680j_4(fMo27408calculateLeftPaddingu2uoSUM);
        int iMo27093roundToPx0680j_42 = measureScope.mo27093roundToPx0680j_4(fMo27409calculateRightPaddingu2uoSUM) + iMo27093roundToPx0680j_4;
        final int iMo27093roundToPx0680j_43 = measureScope.mo27093roundToPx0680j_4(fMo27410calculateTopPaddingD9Ej5fM);
        int iMo27093roundToPx0680j_44 = measureScope.mo27093roundToPx0680j_4(fMo27407calculateBottomPaddingD9Ej5fM) + iMo27093roundToPx0680j_43;
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(ConstraintsKt.m33473offsetNN6EwU(j10, -iMo27093roundToPx0680j_42, -iMo27093roundToPx0680j_44));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m33471constrainWidthK40F9xA(j10, placeableMo32229measureBRTryo0.getWidth() + iMo27093roundToPx0680j_42), ConstraintsKt.m33470constrainHeightK40F9xA(j10, placeableMo32229measureBRTryo0.getHeight() + iMo27093roundToPx0680j_44), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, iMo27093roundToPx0680j_4, iMo27093roundToPx0680j_43, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void setPaddingValues(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }
}
