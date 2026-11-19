package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
final class FocusableElement extends ModifierNodeElement<FocusableNode> {
    private final MutableInteractionSource interactionSource;

    public FocusableElement(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusableElement) && AbstractC9133u.m16128b(this.interactionSource, ((FocusableElement) obj).interactionSource);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            return mutableInteractionSource.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusable");
        inspectorInfo.getProperties().set("enabled", Boolean.TRUE);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public FocusableNode create() {
        return new FocusableNode(this.interactionSource, 0, null, 6, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(FocusableNode focusableNode) {
        focusableNode.update(this.interactionSource);
    }
}
