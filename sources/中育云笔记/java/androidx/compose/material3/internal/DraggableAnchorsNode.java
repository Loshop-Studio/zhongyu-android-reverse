package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.IntSizeKt;
import kotlin.Pair;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p211jd.AbstractC9719c;
import p309qc.C10786q;

/* loaded from: classes2.dex */
final class DraggableAnchorsNode<T> extends Modifier.Node implements LayoutModifierNode {
    private InterfaceC9544p anchors;
    private boolean didLookahead;
    private Orientation orientation;
    private AnchoredDraggableState<T> state;

    public DraggableAnchorsNode(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC9544p interfaceC9544p, Orientation orientation) {
        this.state = anchoredDraggableState;
        this.anchors = interfaceC9544p;
        this.orientation = orientation;
    }

    public final InterfaceC9544p getAnchors() {
        return this.anchors;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final AnchoredDraggableState<T> getState() {
        return this.state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j10);
        if (!measureScope.isLookingAhead() || !this.didLookahead) {
            Pair pair = (Pair) this.anchors.invoke(IntSize.m33664boximpl(IntSizeKt.IntSize(placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight())), Constraints.m33441boximpl(j10));
            this.state.updateAnchors((DraggableAnchors) pair.m20051f(), pair.m20052g());
        }
        this.didLookahead = measureScope.isLookingAhead() || this.didLookahead;
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.material3.internal.DraggableAnchorsNode$measure$1
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
                float fPositionOf = measureScope.isLookingAhead() ? this.getState().getAnchors().positionOf(this.getState().getTargetValue()) : this.getState().requireOffset();
                float f10 = this.getOrientation() == Orientation.Horizontal ? fPositionOf : 0.0f;
                if (this.getOrientation() != Orientation.Vertical) {
                    fPositionOf = 0.0f;
                }
                Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, AbstractC9719c.m19282d(f10), AbstractC9719c.m19282d(fPositionOf), 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.didLookahead = false;
    }

    public final void setAnchors(InterfaceC9544p interfaceC9544p) {
        this.anchors = interfaceC9544p;
    }

    public final void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public final void setState(AnchoredDraggableState<T> anchoredDraggableState) {
        this.state = anchoredDraggableState;
    }
}
