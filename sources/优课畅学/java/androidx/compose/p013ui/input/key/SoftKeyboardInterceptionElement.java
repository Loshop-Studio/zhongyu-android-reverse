package androidx.compose.p013ui.input.key;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class SoftKeyboardInterceptionElement extends ModifierNodeElement<InterceptedKeyInputNode> {
    private final InterfaceC10570l onKeyEvent;
    private final InterfaceC10570l onPreKeyEvent;

    public SoftKeyboardInterceptionElement(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        this.onKeyEvent = interfaceC10570l;
        this.onPreKeyEvent = interfaceC10570l2;
    }

    public static /* synthetic */ SoftKeyboardInterceptionElement copy$default(SoftKeyboardInterceptionElement softKeyboardInterceptionElement, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = softKeyboardInterceptionElement.onKeyEvent;
        }
        if ((i10 & 2) != 0) {
            interfaceC10570l2 = softKeyboardInterceptionElement.onPreKeyEvent;
        }
        return softKeyboardInterceptionElement.copy(interfaceC10570l, interfaceC10570l2);
    }

    public final InterfaceC10570l component1() {
        return this.onKeyEvent;
    }

    public final InterfaceC10570l component2() {
        return this.onPreKeyEvent;
    }

    public final SoftKeyboardInterceptionElement copy(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        return new SoftKeyboardInterceptionElement(interfaceC10570l, interfaceC10570l2);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoftKeyboardInterceptionElement)) {
            return false;
        }
        SoftKeyboardInterceptionElement softKeyboardInterceptionElement = (SoftKeyboardInterceptionElement) obj;
        return AbstractC9133u.m16128b(this.onKeyEvent, softKeyboardInterceptionElement.onKeyEvent) && AbstractC9133u.m16128b(this.onPreKeyEvent, softKeyboardInterceptionElement.onPreKeyEvent);
    }

    public final InterfaceC10570l getOnKeyEvent() {
        return this.onKeyEvent;
    }

    public final InterfaceC10570l getOnPreKeyEvent() {
        return this.onPreKeyEvent;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        InterfaceC10570l interfaceC10570l = this.onKeyEvent;
        int iHashCode = (interfaceC10570l == null ? 0 : interfaceC10570l.hashCode()) * 31;
        InterfaceC10570l interfaceC10570l2 = this.onPreKeyEvent;
        return iHashCode + (interfaceC10570l2 != null ? interfaceC10570l2.hashCode() : 0);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        InterfaceC10570l interfaceC10570l = this.onKeyEvent;
        if (interfaceC10570l != null) {
            inspectorInfo.setName("onKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onKeyToSoftKeyboardInterceptedEvent", interfaceC10570l);
        }
        InterfaceC10570l interfaceC10570l2 = this.onPreKeyEvent;
        if (interfaceC10570l2 != null) {
            inspectorInfo.setName("onPreKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onPreKeyToSoftKeyboardInterceptedEvent", interfaceC10570l2);
        }
    }

    public String toString() {
        return "SoftKeyboardInterceptionElement(onKeyEvent=" + this.onKeyEvent + ", onPreKeyEvent=" + this.onPreKeyEvent + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public InterceptedKeyInputNode create() {
        return new InterceptedKeyInputNode(this.onKeyEvent, this.onPreKeyEvent);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(InterceptedKeyInputNode interceptedKeyInputNode) {
        interceptedKeyInputNode.setOnEvent(this.onKeyEvent);
        interceptedKeyInputNode.setOnPreEvent(this.onPreKeyEvent);
    }
}
