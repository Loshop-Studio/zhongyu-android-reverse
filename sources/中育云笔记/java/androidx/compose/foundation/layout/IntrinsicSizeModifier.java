package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.IntOffset;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
abstract class IntrinsicSizeModifier extends Modifier.Node implements LayoutModifierNode {
    /* renamed from: calculateContentConstraints-l58MMJ0 */
    public abstract long mo27411calculateContentConstraintsl58MMJ0(MeasureScope measureScope, Measurable measurable, long j10);

    public abstract boolean getEnforceIncoming();

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return intrinsicMeasurable.maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return intrinsicMeasurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        long jMo27411calculateContentConstraintsl58MMJ0 = mo27411calculateContentConstraintsl58MMJ0(measureScope, measurable, j10);
        if (getEnforceIncoming()) {
            jMo27411calculateContentConstraintsl58MMJ0 = ConstraintsKt.m33469constrainN9IONVI(j10, jMo27411calculateContentConstraintsl58MMJ0);
        }
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(jMo27411calculateContentConstraintsl58MMJ0);
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.IntrinsicSizeModifier$measure$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.m32294placeRelative70tqf50$default(placementScope, placeableMo32229measureBRTryo0, IntOffset.Companion.m33640getZeronOccac(), 0.0f, 2, null);
            }
        }, 4, null);
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return intrinsicMeasurable.minIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return intrinsicMeasurable.minIntrinsicWidth(i10);
    }
}
