package androidx.compose.p014ui.input.key;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class SoftKeyboardInterceptionElement extends ModifierNodeElement<InterceptedKeyInputNode> {
    private final InterfaceC9540l onKeyEvent;
    private final InterfaceC9540l onPreKeyEvent;

    public SoftKeyboardInterceptionElement(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        this.onKeyEvent = interfaceC9540l;
        this.onPreKeyEvent = interfaceC9540l2;
    }

    public static /* synthetic */ SoftKeyboardInterceptionElement copy$default(SoftKeyboardInterceptionElement softKeyboardInterceptionElement, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = softKeyboardInterceptionElement.onKeyEvent;
        }
        if ((i10 & 2) != 0) {
            interfaceC9540l2 = softKeyboardInterceptionElement.onPreKeyEvent;
        }
        return softKeyboardInterceptionElement.copy(interfaceC9540l, interfaceC9540l2);
    }

    public final InterfaceC9540l component1() {
        return this.onKeyEvent;
    }

    public final InterfaceC9540l component2() {
        return this.onPreKeyEvent;
    }

    public final SoftKeyboardInterceptionElement copy(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        return new SoftKeyboardInterceptionElement(interfaceC9540l, interfaceC9540l2);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoftKeyboardInterceptionElement)) {
            return false;
        }
        SoftKeyboardInterceptionElement softKeyboardInterceptionElement = (SoftKeyboardInterceptionElement) obj;
        return AbstractC9979u.m20289b(this.onKeyEvent, softKeyboardInterceptionElement.onKeyEvent) && AbstractC9979u.m20289b(this.onPreKeyEvent, softKeyboardInterceptionElement.onPreKeyEvent);
    }

    public final InterfaceC9540l getOnKeyEvent() {
        return this.onKeyEvent;
    }

    public final InterfaceC9540l getOnPreKeyEvent() {
        return this.onPreKeyEvent;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        InterfaceC9540l interfaceC9540l = this.onKeyEvent;
        int iHashCode = (interfaceC9540l == null ? 0 : interfaceC9540l.hashCode()) * 31;
        InterfaceC9540l interfaceC9540l2 = this.onPreKeyEvent;
        return iHashCode + (interfaceC9540l2 != null ? interfaceC9540l2.hashCode() : 0);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        InterfaceC9540l interfaceC9540l = this.onKeyEvent;
        if (interfaceC9540l != null) {
            inspectorInfo.setName("onKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onKeyToSoftKeyboardInterceptedEvent", interfaceC9540l);
        }
        InterfaceC9540l interfaceC9540l2 = this.onPreKeyEvent;
        if (interfaceC9540l2 != null) {
            inspectorInfo.setName("onPreKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onPreKeyToSoftKeyboardInterceptedEvent", interfaceC9540l2);
        }
    }

    public String toString() {
        return "SoftKeyboardInterceptionElement(onKeyEvent=" + this.onKeyEvent + ", onPreKeyEvent=" + this.onPreKeyEvent + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public InterceptedKeyInputNode create() {
        return new InterceptedKeyInputNode(this.onKeyEvent, this.onPreKeyEvent);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(InterceptedKeyInputNode interceptedKeyInputNode) {
        interceptedKeyInputNode.setOnEvent(this.onKeyEvent);
        interceptedKeyInputNode.setOnPreEvent(this.onPreKeyEvent);
    }
}
