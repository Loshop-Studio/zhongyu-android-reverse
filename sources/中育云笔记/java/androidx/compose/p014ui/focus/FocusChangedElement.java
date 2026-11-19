package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class FocusChangedElement extends ModifierNodeElement<FocusChangedNode> {
    private final InterfaceC9540l onFocusChanged;

    public FocusChangedElement(InterfaceC9540l interfaceC9540l) {
        this.onFocusChanged = interfaceC9540l;
    }

    public static /* synthetic */ FocusChangedElement copy$default(FocusChangedElement focusChangedElement, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = focusChangedElement.onFocusChanged;
        }
        return focusChangedElement.copy(interfaceC9540l);
    }

    public final InterfaceC9540l component1() {
        return this.onFocusChanged;
    }

    public final FocusChangedElement copy(InterfaceC9540l interfaceC9540l) {
        return new FocusChangedElement(interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && AbstractC9979u.m20289b(this.onFocusChanged, ((FocusChangedElement) obj).onFocusChanged);
    }

    public final InterfaceC9540l getOnFocusChanged() {
        return this.onFocusChanged;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onFocusChanged.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFocusChanged");
        inspectorInfo.getProperties().set("onFocusChanged", this.onFocusChanged);
    }

    public String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.onFocusChanged + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public FocusChangedNode create() {
        return new FocusChangedNode(this.onFocusChanged);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(FocusChangedNode focusChangedNode) {
        focusChangedNode.setOnFocusChanged(this.onFocusChanged);
    }
}
