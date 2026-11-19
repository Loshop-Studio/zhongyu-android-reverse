package androidx.compose.foundation;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends ModifierNodeElement<ScrollNode> {
    public static final int $stable = 0;
    private final boolean isVertical;
    private final boolean reverseScrolling;
    private final ScrollState scrollState;

    public ScrollingLayoutElement(ScrollState scrollState, boolean z10, boolean z11) {
        this.scrollState = scrollState;
        this.reverseScrolling = z10;
        this.isVertical = z11;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return AbstractC9979u.m20289b(this.scrollState, scrollingLayoutElement.scrollState) && this.reverseScrolling == scrollingLayoutElement.reverseScrolling && this.isVertical == scrollingLayoutElement.isVertical;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final ScrollState getScrollState() {
        return this.scrollState;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.scrollState.hashCode() * 31) + Boolean.hashCode(this.reverseScrolling)) * 31) + Boolean.hashCode(this.isVertical);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scroll");
        inspectorInfo.getProperties().set("state", this.scrollState);
        inspectorInfo.getProperties().set("reverseScrolling", Boolean.valueOf(this.reverseScrolling));
        inspectorInfo.getProperties().set("isVertical", Boolean.valueOf(this.isVertical));
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public ScrollNode create() {
        return new ScrollNode(this.scrollState, this.reverseScrolling, this.isVertical);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(ScrollNode scrollNode) {
        scrollNode.setState(this.scrollState);
        scrollNode.setReverseScrolling(this.reverseScrolling);
        scrollNode.setVertical(this.isVertical);
    }
}
