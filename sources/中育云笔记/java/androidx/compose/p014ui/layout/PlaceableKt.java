package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.graphics.GraphicsLayerScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LookaheadCapablePlaceable;
import androidx.compose.p014ui.node.Owner;
import androidx.compose.p014ui.unit.ConstraintsKt;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class PlaceableKt {
    private static final InterfaceC9540l DefaultLayerBlock = new InterfaceC9540l() { // from class: androidx.compose.ui.layout.PlaceableKt$DefaultLayerBlock$1
        public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GraphicsLayerScope) obj);
            return C10786q.f26013a;
        }
    };
    private static final long DefaultConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    public static final Placeable.PlacementScope PlacementScope(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        return new LookaheadCapablePlacementScope(lookaheadCapablePlaceable);
    }

    public static final Placeable.PlacementScope PlacementScope(Owner owner) {
        return new OuterPlacementScope(owner);
    }
}
