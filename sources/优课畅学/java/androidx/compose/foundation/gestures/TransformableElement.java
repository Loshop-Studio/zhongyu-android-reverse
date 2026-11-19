package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class TransformableElement extends ModifierNodeElement<TransformableNode> {
    private final InterfaceC10570l canPan;
    private final boolean enabled;
    private final boolean lockRotationOnZoomPan;
    private final TransformableState state;

    public TransformableElement(TransformableState transformableState, InterfaceC10570l interfaceC10570l, boolean z10, boolean z11) {
        this.state = transformableState;
        this.canPan = interfaceC10570l;
        this.lockRotationOnZoomPan = z10;
        this.enabled = z11;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransformableElement.class != obj.getClass()) {
            return false;
        }
        TransformableElement transformableElement = (TransformableElement) obj;
        return AbstractC9133u.m16128b(this.state, transformableElement.state) && this.canPan == transformableElement.canPan && this.lockRotationOnZoomPan == transformableElement.lockRotationOnZoomPan && this.enabled == transformableElement.enabled;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((this.state.hashCode() * 31) + this.canPan.hashCode()) * 31) + Boolean.hashCode(this.lockRotationOnZoomPan)) * 31) + Boolean.hashCode(this.enabled);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("transformable");
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("canPan", this.canPan);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("lockRotationOnZoomPan", Boolean.valueOf(this.lockRotationOnZoomPan));
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public TransformableNode create() {
        return new TransformableNode(this.state, this.canPan, this.lockRotationOnZoomPan, this.enabled);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(TransformableNode transformableNode) {
        transformableNode.update(this.state, this.canPan, this.lockRotationOnZoomPan, this.enabled);
    }
}
