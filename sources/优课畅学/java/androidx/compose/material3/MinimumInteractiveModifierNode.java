package androidx.compose.material3;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p322z7.AbstractC10729c;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class MinimumInteractiveModifierNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    public static final int $stable = 0;

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        float f10 = 0;
        float fM26899constructorimpl = C3156Dp.m26899constructorimpl(AbstractC8323h.m13509d(((C3156Dp) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m26913unboximpl(), C3156Dp.m26899constructorimpl(f10)));
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(j10);
        boolean z10 = isAttached() && !Float.isNaN(fM26899constructorimpl) && C3156Dp.m26898compareTo0680j_4(fM26899constructorimpl, C3156Dp.m26899constructorimpl(f10)) > 0;
        int iMo20491roundToPx0680j_4 = Float.isNaN(fM26899constructorimpl) ? 0 : measureScope.mo20491roundToPx0680j_4(fM26899constructorimpl);
        final int iMax = z10 ? Math.max(placeableMo25627measureBRTryo0.getWidth(), iMo20491roundToPx0680j_4) : placeableMo25627measureBRTryo0.getWidth();
        final int iMax2 = z10 ? Math.max(placeableMo25627measureBRTryo0.getHeight(), iMo20491roundToPx0680j_4) : placeableMo25627measureBRTryo0.getHeight();
        return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new InterfaceC10570l() { // from class: androidx.compose.material3.MinimumInteractiveModifierNode$measure$1
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
                Placeable.PlacementScope.place$default(placementScope, placeableMo25627measureBRTryo0, AbstractC10729c.m20035d((iMax - placeableMo25627measureBRTryo0.getWidth()) / 2.0f), AbstractC10729c.m20035d((iMax2 - placeableMo25627measureBRTryo0.getHeight()) / 2.0f), 0.0f, 4, null);
            }
        }, 4, null);
    }
}
