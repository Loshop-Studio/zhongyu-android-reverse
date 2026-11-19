package androidx.compose.foundation;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import p300x7.InterfaceC10570l;

@RequiresApi(29)
/* loaded from: classes.dex */
final class ExcludeFromSystemGestureElement extends ModifierNodeElement<ExcludeFromSystemGestureNode> {
    private final InterfaceC10570l exclusion;

    public ExcludeFromSystemGestureElement(InterfaceC10570l interfaceC10570l) {
        this.exclusion = interfaceC10570l;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return (obj instanceof ExcludeFromSystemGestureElement) && this.exclusion == ((ExcludeFromSystemGestureElement) obj).exclusion;
    }

    public final InterfaceC10570l getExclusion() {
        return this.exclusion;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        InterfaceC10570l interfaceC10570l = this.exclusion;
        if (interfaceC10570l != null) {
            return interfaceC10570l.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("systemGestureExclusion");
        if (this.exclusion != null) {
            inspectorInfo.getProperties().set("exclusion", this.exclusion);
        }
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    @SuppressLint({"NewApi"})
    public ExcludeFromSystemGestureNode create() {
        return new ExcludeFromSystemGestureNode(this.exclusion);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(ExcludeFromSystemGestureNode excludeFromSystemGestureNode) {
        excludeFromSystemGestureNode.setRect(this.exclusion);
    }
}
