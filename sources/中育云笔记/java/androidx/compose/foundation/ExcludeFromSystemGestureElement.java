package androidx.compose.foundation;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import p181hd.InterfaceC9540l;

@RequiresApi(29)
/* loaded from: classes.dex */
final class ExcludeFromSystemGestureElement extends ModifierNodeElement<ExcludeFromSystemGestureNode> {
    private final InterfaceC9540l exclusion;

    public ExcludeFromSystemGestureElement(InterfaceC9540l interfaceC9540l) {
        this.exclusion = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return (obj instanceof ExcludeFromSystemGestureElement) && this.exclusion == ((ExcludeFromSystemGestureElement) obj).exclusion;
    }

    public final InterfaceC9540l getExclusion() {
        return this.exclusion;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        InterfaceC9540l interfaceC9540l = this.exclusion;
        if (interfaceC9540l != null) {
            return interfaceC9540l.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("systemGestureExclusion");
        if (this.exclusion != null) {
            inspectorInfo.getProperties().set("exclusion", this.exclusion);
        }
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    @SuppressLint({"NewApi"})
    public ExcludeFromSystemGestureNode create() {
        return new ExcludeFromSystemGestureNode(this.exclusion);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(ExcludeFromSystemGestureNode excludeFromSystemGestureNode) {
        excludeFromSystemGestureNode.setRect(this.exclusion);
    }
}
