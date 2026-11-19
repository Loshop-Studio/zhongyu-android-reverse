package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
final class SimplePlacementScope extends Placeable.PlacementScope {
    private final LayoutDirection parentLayoutDirection;
    private final int parentWidth;

    public SimplePlacementScope(int i10, LayoutDirection layoutDirection) {
        this.parentWidth = i10;
        this.parentLayoutDirection = layoutDirection;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public int getParentWidth() {
        return this.parentWidth;
    }
}
