package androidx.compose.foundation.text.handwriting;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
final class StylusHandwritingElement extends ModifierNodeElement<StylusHandwritingNode> {
    private final InterfaceC10559a onHandwritingSlopExceeded;

    public StylusHandwritingElement(InterfaceC10559a interfaceC10559a) {
        this.onHandwritingSlopExceeded = interfaceC10559a;
    }

    public static /* synthetic */ StylusHandwritingElement copy$default(StylusHandwritingElement stylusHandwritingElement, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10559a = stylusHandwritingElement.onHandwritingSlopExceeded;
        }
        return stylusHandwritingElement.copy(interfaceC10559a);
    }

    public final InterfaceC10559a component1() {
        return this.onHandwritingSlopExceeded;
    }

    public final StylusHandwritingElement copy(InterfaceC10559a interfaceC10559a) {
        return new StylusHandwritingElement(interfaceC10559a);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && AbstractC9133u.m16128b(this.onHandwritingSlopExceeded, ((StylusHandwritingElement) obj).onHandwritingSlopExceeded);
    }

    public final InterfaceC10559a getOnHandwritingSlopExceeded() {
        return this.onHandwritingSlopExceeded;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onHandwritingSlopExceeded.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("stylusHandwriting");
        inspectorInfo.getProperties().set("onHandwritingSlopExceeded", this.onHandwritingSlopExceeded);
    }

    public String toString() {
        return "StylusHandwritingElement(onHandwritingSlopExceeded=" + this.onHandwritingSlopExceeded + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public StylusHandwritingNode create() {
        return new StylusHandwritingNode(this.onHandwritingSlopExceeded);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(StylusHandwritingNode stylusHandwritingNode) {
        stylusHandwritingNode.setOnHandwritingSlopExceeded(this.onHandwritingSlopExceeded);
    }
}
