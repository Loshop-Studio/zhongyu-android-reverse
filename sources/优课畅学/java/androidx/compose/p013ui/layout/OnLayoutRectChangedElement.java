package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class OnLayoutRectChangedElement extends ModifierNodeElement<OnLayoutRectChangedNode> {
    private final InterfaceC10570l callback;
    private final long debounceMillis;
    private final long throttleMillis;

    public OnLayoutRectChangedElement(long j10, long j11, InterfaceC10570l interfaceC10570l) {
        this.throttleMillis = j10;
        this.debounceMillis = j11;
        this.callback = interfaceC10570l;
    }

    public static /* synthetic */ OnLayoutRectChangedElement copy$default(OnLayoutRectChangedElement onLayoutRectChangedElement, long j10, long j11, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = onLayoutRectChangedElement.throttleMillis;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = onLayoutRectChangedElement.debounceMillis;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            interfaceC10570l = onLayoutRectChangedElement.callback;
        }
        return onLayoutRectChangedElement.copy(j12, j13, interfaceC10570l);
    }

    public final long component1() {
        return this.throttleMillis;
    }

    public final long component2() {
        return this.debounceMillis;
    }

    public final InterfaceC10570l component3() {
        return this.callback;
    }

    public final OnLayoutRectChangedElement copy(long j10, long j11, InterfaceC10570l interfaceC10570l) {
        return new OnLayoutRectChangedElement(j10, j11, interfaceC10570l);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnLayoutRectChangedElement)) {
            return false;
        }
        OnLayoutRectChangedElement onLayoutRectChangedElement = (OnLayoutRectChangedElement) obj;
        return this.throttleMillis == onLayoutRectChangedElement.throttleMillis && this.debounceMillis == onLayoutRectChangedElement.debounceMillis && AbstractC9133u.m16128b(this.callback, onLayoutRectChangedElement.callback);
    }

    public final InterfaceC10570l getCallback() {
        return this.callback;
    }

    public final long getDebounceMillis() {
        return this.debounceMillis;
    }

    public final long getThrottleMillis() {
        return this.throttleMillis;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((Long.hashCode(this.throttleMillis) * 31) + Long.hashCode(this.debounceMillis)) * 31) + this.callback.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onRectChanged");
        inspectorInfo.getProperties().set("throttleMillis", Long.valueOf(this.throttleMillis));
        inspectorInfo.getProperties().set("debounceMillis", Long.valueOf(this.debounceMillis));
        inspectorInfo.getProperties().set("callback", this.callback);
    }

    public String toString() {
        return "OnLayoutRectChangedElement(throttleMillis=" + this.throttleMillis + ", debounceMillis=" + this.debounceMillis + ", callback=" + this.callback + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public OnLayoutRectChangedNode create() {
        return new OnLayoutRectChangedNode(this.throttleMillis, this.debounceMillis, this.callback);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(OnLayoutRectChangedNode onLayoutRectChangedNode) {
        onLayoutRectChangedNode.setThrottleMillis(this.throttleMillis);
        onLayoutRectChangedNode.setDebounceMillis(this.debounceMillis);
        onLayoutRectChangedNode.setCallback(this.callback);
        onLayoutRectChangedNode.disposeAndRegister();
    }
}
