package androidx.compose.foundation;

import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import p300x7.InterfaceC10570l;

@RequiresApi(33)
/* loaded from: classes.dex */
final class PreferKeepClearElement extends ModifierNodeElement<PreferKeepClearNode> {
    private final InterfaceC10570l clearRect;

    public PreferKeepClearElement(InterfaceC10570l interfaceC10570l) {
        this.clearRect = interfaceC10570l;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return (obj instanceof PreferKeepClearNode) && this.clearRect == ((PreferKeepClearNode) obj).getRect();
    }

    public final InterfaceC10570l getClearRect() {
        return this.clearRect;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        InterfaceC10570l interfaceC10570l = this.clearRect;
        if (interfaceC10570l != null) {
            return interfaceC10570l.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("preferKeepClearBounds");
        if (this.clearRect != null) {
            inspectorInfo.getProperties().set("clearRect", this.clearRect);
        }
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public PreferKeepClearNode create() {
        return new PreferKeepClearNode(this.clearRect);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(PreferKeepClearNode preferKeepClearNode) {
        preferKeepClearNode.setRect(this.clearRect);
    }
}
