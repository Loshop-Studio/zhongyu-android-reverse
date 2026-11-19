package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.Owner;
import androidx.compose.p014ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
final class OuterPlacementScope extends Placeable.PlacementScope {
    private final Owner owner;

    public OuterPlacementScope(Owner owner) {
        this.owner = owner;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public LayoutCoordinates getCoordinates() {
        return this.owner.getRoot().getOuterCoordinator$ui_release();
    }

    public final Owner getOwner() {
        return this.owner;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public LayoutDirection getParentLayoutDirection() {
        return this.owner.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public int getParentWidth() {
        return this.owner.getRoot().getWidth();
    }
}
