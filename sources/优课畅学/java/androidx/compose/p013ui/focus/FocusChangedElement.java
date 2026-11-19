package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class FocusChangedElement extends ModifierNodeElement<FocusChangedNode> {
    private final InterfaceC10570l onFocusChanged;

    public FocusChangedElement(InterfaceC10570l interfaceC10570l) {
        this.onFocusChanged = interfaceC10570l;
    }

    public static /* synthetic */ FocusChangedElement copy$default(FocusChangedElement focusChangedElement, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = focusChangedElement.onFocusChanged;
        }
        return focusChangedElement.copy(interfaceC10570l);
    }

    public final InterfaceC10570l component1() {
        return this.onFocusChanged;
    }

    public final FocusChangedElement copy(InterfaceC10570l interfaceC10570l) {
        return new FocusChangedElement(interfaceC10570l);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && AbstractC9133u.m16128b(this.onFocusChanged, ((FocusChangedElement) obj).onFocusChanged);
    }

    public final InterfaceC10570l getOnFocusChanged() {
        return this.onFocusChanged;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onFocusChanged.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFocusChanged");
        inspectorInfo.getProperties().set("onFocusChanged", this.onFocusChanged);
    }

    public String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.onFocusChanged + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public FocusChangedNode create() {
        return new FocusChangedNode(this.onFocusChanged);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(FocusChangedNode focusChangedNode) {
        focusChangedNode.setOnFocusChanged(this.onFocusChanged);
    }
}
