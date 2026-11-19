package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
final class ScrollingContainerElement extends ModifierNodeElement<ScrollingContainerNode> {
    private final BringIntoViewSpec bringIntoViewSpec;
    private final boolean enabled;
    private final FlingBehavior flingBehavior;
    private final MutableInteractionSource interactionSource;
    private final Orientation orientation;
    private final OverscrollEffect overscrollEffect;
    private final boolean reverseScrolling;
    private final ScrollableState state;
    private final boolean useLocalOverscrollFactory;

    public ScrollingContainerElement(ScrollableState scrollableState, Orientation orientation, boolean z10, boolean z11, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, boolean z12, OverscrollEffect overscrollEffect) {
        this.state = scrollableState;
        this.orientation = orientation;
        this.enabled = z10;
        this.reverseScrolling = z11;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.useLocalOverscrollFactory = z12;
        this.overscrollEffect = overscrollEffect;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return AbstractC9133u.m16128b(this.state, scrollingContainerElement.state) && this.orientation == scrollingContainerElement.orientation && this.enabled == scrollingContainerElement.enabled && this.reverseScrolling == scrollingContainerElement.reverseScrolling && AbstractC9133u.m16128b(this.flingBehavior, scrollingContainerElement.flingBehavior) && AbstractC9133u.m16128b(this.interactionSource, scrollingContainerElement.interactionSource) && AbstractC9133u.m16128b(this.bringIntoViewSpec, scrollingContainerElement.bringIntoViewSpec) && this.useLocalOverscrollFactory == scrollingContainerElement.useLocalOverscrollFactory && AbstractC9133u.m16128b(this.overscrollEffect, scrollingContainerElement.overscrollEffect);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.reverseScrolling)) * 31;
        FlingBehavior flingBehavior = this.flingBehavior;
        int iHashCode2 = (iHashCode + (flingBehavior != null ? flingBehavior.hashCode() : 0)) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int iHashCode3 = (iHashCode2 + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        int iHashCode4 = (((iHashCode3 + (bringIntoViewSpec != null ? bringIntoViewSpec.hashCode() : 0)) * 31) + Boolean.hashCode(this.useLocalOverscrollFactory)) * 31;
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return iHashCode4 + (overscrollEffect != null ? overscrollEffect.hashCode() : 0);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scrollingContainer");
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("orientation", this.orientation);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("reverseScrolling", Boolean.valueOf(this.reverseScrolling));
        inspectorInfo.getProperties().set("flingBehavior", this.flingBehavior);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("bringIntoViewSpec", this.bringIntoViewSpec);
        inspectorInfo.getProperties().set("useLocalOverscrollFactory", Boolean.valueOf(this.useLocalOverscrollFactory));
        inspectorInfo.getProperties().set("overscrollEffect", this.overscrollEffect);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public ScrollingContainerNode create() {
        return new ScrollingContainerNode(this.state, this.orientation, this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec, this.useLocalOverscrollFactory, this.overscrollEffect);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(ScrollingContainerNode scrollingContainerNode) {
        scrollingContainerNode.update(this.state, this.orientation, this.useLocalOverscrollFactory, this.overscrollEffect, this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }
}
