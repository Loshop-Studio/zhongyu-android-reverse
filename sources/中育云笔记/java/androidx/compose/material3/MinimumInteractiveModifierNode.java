package androidx.compose.material3;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p211jd.AbstractC9719c;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class MinimumInteractiveModifierNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    public static final int $stable = 0;

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        float f10 = 0;
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(AbstractC10410o.m21751d(((C3186Dp) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m33515unboximpl(), C3186Dp.m33501constructorimpl(f10)));
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j10);
        boolean z10 = isAttached() && !Float.isNaN(fM33501constructorimpl) && C3186Dp.m33500compareTo0680j_4(fM33501constructorimpl, C3186Dp.m33501constructorimpl(f10)) > 0;
        int iMo27093roundToPx0680j_4 = Float.isNaN(fM33501constructorimpl) ? 0 : measureScope.mo27093roundToPx0680j_4(fM33501constructorimpl);
        final int iMax = z10 ? Math.max(placeableMo32229measureBRTryo0.getWidth(), iMo27093roundToPx0680j_4) : placeableMo32229measureBRTryo0.getWidth();
        final int iMax2 = z10 ? Math.max(placeableMo32229measureBRTryo0.getHeight(), iMo27093roundToPx0680j_4) : placeableMo32229measureBRTryo0.getHeight();
        return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new InterfaceC9540l() { // from class: androidx.compose.material3.MinimumInteractiveModifierNode$measure$1
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
                Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, AbstractC9719c.m19282d((iMax - placeableMo32229measureBRTryo0.getWidth()) / 2.0f), AbstractC9719c.m19282d((iMax2 - placeableMo32229measureBRTryo0.getHeight()) / 2.0f), 0.0f, 4, null);
            }
        }, 4, null);
    }
}
