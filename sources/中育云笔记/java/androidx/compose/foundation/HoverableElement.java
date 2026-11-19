package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final class HoverableElement extends ModifierNodeElement<HoverableNode> {
    private final MutableInteractionSource interactionSource;

    public HoverableElement(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && AbstractC9979u.m20289b(((HoverableElement) obj).interactionSource, this.interactionSource);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.interactionSource.hashCode() * 31;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("hoverable");
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("enabled", Boolean.TRUE);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public HoverableNode create() {
        return new HoverableNode(this.interactionSource);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(HoverableNode hoverableNode) {
        hoverableNode.updateInteractionSource(this.interactionSource);
    }
}
