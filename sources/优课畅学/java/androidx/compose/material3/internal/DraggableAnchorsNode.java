package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.IntSizeKt;
import kotlin.Pair;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p322z7.AbstractC10729c;

/* loaded from: classes2.dex */
final class DraggableAnchorsNode<T> extends Modifier.Node implements LayoutModifierNode {
    private InterfaceC10574p anchors;
    private boolean didLookahead;
    private Orientation orientation;
    private AnchoredDraggableState<T> state;

    public DraggableAnchorsNode(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC10574p interfaceC10574p, Orientation orientation) {
        this.state = anchoredDraggableState;
        this.anchors = interfaceC10574p;
        this.orientation = orientation;
    }

    public final InterfaceC10574p getAnchors() {
        return this.anchors;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final AnchoredDraggableState<T> getState() {
        return this.state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(j10);
        if (!measureScope.isLookingAhead() || !this.didLookahead) {
            Pair pair = (Pair) this.anchors.invoke(IntSize.m27062boximpl(IntSizeKt.IntSize(placeableMo25627measureBRTryo0.getWidth(), placeableMo25627measureBRTryo0.getHeight())), Constraints.m26839boximpl(j10));
            this.state.updateAnchors((DraggableAnchors) pair.m15906e(), pair.m15907g());
        }
        this.didLookahead = measureScope.isLookingAhead() || this.didLookahead;
        return MeasureScope.layout$default(measureScope, placeableMo25627measureBRTryo0.getWidth(), placeableMo25627measureBRTryo0.getHeight(), null, new InterfaceC10570l() { // from class: androidx.compose.material3.internal.DraggableAnchorsNode$measure$1
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
                float fPositionOf = measureScope.isLookingAhead() ? this.getState().getAnchors().positionOf(this.getState().getTargetValue()) : this.getState().requireOffset();
                float f10 = this.getOrientation() == Orientation.Horizontal ? fPositionOf : 0.0f;
                if (this.getOrientation() != Orientation.Vertical) {
                    fPositionOf = 0.0f;
                }
                Placeable.PlacementScope.place$default(placementScope, placeableMo25627measureBRTryo0, AbstractC10729c.m20035d(f10), AbstractC10729c.m20035d(fPositionOf), 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.didLookahead = false;
    }

    public final void setAnchors(InterfaceC10574p interfaceC10574p) {
        this.anchors = interfaceC10574p;
    }

    public final void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public final void setState(AnchoredDraggableState<T> anchoredDraggableState) {
        this.state = anchoredDraggableState;
    }
}
