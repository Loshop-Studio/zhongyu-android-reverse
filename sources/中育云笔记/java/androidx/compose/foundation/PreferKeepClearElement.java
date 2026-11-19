package androidx.compose.foundation;

import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import p181hd.InterfaceC9540l;

@RequiresApi(33)
/* loaded from: classes.dex */
final class PreferKeepClearElement extends ModifierNodeElement<PreferKeepClearNode> {
    private final InterfaceC9540l clearRect;

    public PreferKeepClearElement(InterfaceC9540l interfaceC9540l) {
        this.clearRect = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return (obj instanceof PreferKeepClearNode) && this.clearRect == ((PreferKeepClearNode) obj).getRect();
    }

    public final InterfaceC9540l getClearRect() {
        return this.clearRect;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        InterfaceC9540l interfaceC9540l = this.clearRect;
        if (interfaceC9540l != null) {
            return interfaceC9540l.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("preferKeepClearBounds");
        if (this.clearRect != null) {
            inspectorInfo.getProperties().set("clearRect", this.clearRect);
        }
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public PreferKeepClearNode create() {
        return new PreferKeepClearNode(this.clearRect);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(PreferKeepClearNode preferKeepClearNode) {
        preferKeepClearNode.setRect(this.clearRect);
    }
}
