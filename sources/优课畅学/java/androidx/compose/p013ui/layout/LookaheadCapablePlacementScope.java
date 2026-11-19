package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LookaheadCapablePlaceable;
import androidx.compose.p013ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
final class LookaheadCapablePlacementScope extends Placeable.PlacementScope {
    private final LookaheadCapablePlaceable within;

    public LookaheadCapablePlacementScope(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.within = lookaheadCapablePlaceable;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public float current(Ruler ruler, float f10) {
        return this.within.findRulerValue(ruler, f10);
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public LayoutCoordinates getCoordinates() {
        LayoutCoordinates coordinates = this.within.isPlacingForAlignment$ui_release() ? null : this.within.getCoordinates();
        if (coordinates == null) {
            this.within.getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
        }
        return coordinates;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public LayoutDirection getParentLayoutDirection() {
        return this.within.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public int getParentWidth() {
        return this.within.getMeasuredWidth();
    }
}
