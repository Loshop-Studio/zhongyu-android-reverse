package androidx.compose.foundation.text.handwriting;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
final class StylusHandwritingElement extends ModifierNodeElement<StylusHandwritingNode> {
    private final InterfaceC9529a onHandwritingSlopExceeded;

    public StylusHandwritingElement(InterfaceC9529a interfaceC9529a) {
        this.onHandwritingSlopExceeded = interfaceC9529a;
    }

    public static /* synthetic */ StylusHandwritingElement copy$default(StylusHandwritingElement stylusHandwritingElement, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9529a = stylusHandwritingElement.onHandwritingSlopExceeded;
        }
        return stylusHandwritingElement.copy(interfaceC9529a);
    }

    public final InterfaceC9529a component1() {
        return this.onHandwritingSlopExceeded;
    }

    public final StylusHandwritingElement copy(InterfaceC9529a interfaceC9529a) {
        return new StylusHandwritingElement(interfaceC9529a);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && AbstractC9979u.m20289b(this.onHandwritingSlopExceeded, ((StylusHandwritingElement) obj).onHandwritingSlopExceeded);
    }

    public final InterfaceC9529a getOnHandwritingSlopExceeded() {
        return this.onHandwritingSlopExceeded;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onHandwritingSlopExceeded.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("stylusHandwriting");
        inspectorInfo.getProperties().set("onHandwritingSlopExceeded", this.onHandwritingSlopExceeded);
    }

    public String toString() {
        return "StylusHandwritingElement(onHandwritingSlopExceeded=" + this.onHandwritingSlopExceeded + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public StylusHandwritingNode create() {
        return new StylusHandwritingNode(this.onHandwritingSlopExceeded);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(StylusHandwritingNode stylusHandwritingNode) {
        stylusHandwritingNode.setOnHandwritingSlopExceeded(this.onHandwritingSlopExceeded);
    }
}
