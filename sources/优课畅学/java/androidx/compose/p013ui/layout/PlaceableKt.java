package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LookaheadCapablePlaceable;
import androidx.compose.p013ui.node.Owner;
import androidx.compose.p013ui.unit.ConstraintsKt;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class PlaceableKt {
    private static final InterfaceC10570l DefaultLayerBlock = new InterfaceC10570l() { // from class: androidx.compose.ui.layout.PlaceableKt$DefaultLayerBlock$1
        public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GraphicsLayerScope) obj);
            return C8736p.f16368a;
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
