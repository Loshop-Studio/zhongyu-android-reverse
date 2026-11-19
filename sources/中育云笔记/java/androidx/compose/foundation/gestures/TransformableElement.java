package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class TransformableElement extends ModifierNodeElement<TransformableNode> {
    private final InterfaceC9540l canPan;
    private final boolean enabled;
    private final boolean lockRotationOnZoomPan;
    private final TransformableState state;

    public TransformableElement(TransformableState transformableState, InterfaceC9540l interfaceC9540l, boolean z10, boolean z11) {
        this.state = transformableState;
        this.canPan = interfaceC9540l;
        this.lockRotationOnZoomPan = z10;
        this.enabled = z11;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransformableElement.class != obj.getClass()) {
            return false;
        }
        TransformableElement transformableElement = (TransformableElement) obj;
        return AbstractC9979u.m20289b(this.state, transformableElement.state) && this.canPan == transformableElement.canPan && this.lockRotationOnZoomPan == transformableElement.lockRotationOnZoomPan && this.enabled == transformableElement.enabled;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((this.state.hashCode() * 31) + this.canPan.hashCode()) * 31) + Boolean.hashCode(this.lockRotationOnZoomPan)) * 31) + Boolean.hashCode(this.enabled);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("transformable");
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("canPan", this.canPan);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("lockRotationOnZoomPan", Boolean.valueOf(this.lockRotationOnZoomPan));
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public TransformableNode create() {
        return new TransformableNode(this.state, this.canPan, this.lockRotationOnZoomPan, this.enabled);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(TransformableNode transformableNode) {
        transformableNode.update(this.state, this.canPan, this.lockRotationOnZoomPan, this.enabled);
    }
}
