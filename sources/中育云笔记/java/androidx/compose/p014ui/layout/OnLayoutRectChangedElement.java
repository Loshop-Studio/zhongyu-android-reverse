package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class OnLayoutRectChangedElement extends ModifierNodeElement<OnLayoutRectChangedNode> {
    private final InterfaceC9540l callback;
    private final long debounceMillis;
    private final long throttleMillis;

    public OnLayoutRectChangedElement(long j10, long j11, InterfaceC9540l interfaceC9540l) {
        this.throttleMillis = j10;
        this.debounceMillis = j11;
        this.callback = interfaceC9540l;
    }

    public static /* synthetic */ OnLayoutRectChangedElement copy$default(OnLayoutRectChangedElement onLayoutRectChangedElement, long j10, long j11, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = onLayoutRectChangedElement.throttleMillis;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = onLayoutRectChangedElement.debounceMillis;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            interfaceC9540l = onLayoutRectChangedElement.callback;
        }
        return onLayoutRectChangedElement.copy(j12, j13, interfaceC9540l);
    }

    public final long component1() {
        return this.throttleMillis;
    }

    public final long component2() {
        return this.debounceMillis;
    }

    public final InterfaceC9540l component3() {
        return this.callback;
    }

    public final OnLayoutRectChangedElement copy(long j10, long j11, InterfaceC9540l interfaceC9540l) {
        return new OnLayoutRectChangedElement(j10, j11, interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnLayoutRectChangedElement)) {
            return false;
        }
        OnLayoutRectChangedElement onLayoutRectChangedElement = (OnLayoutRectChangedElement) obj;
        return this.throttleMillis == onLayoutRectChangedElement.throttleMillis && this.debounceMillis == onLayoutRectChangedElement.debounceMillis && AbstractC9979u.m20289b(this.callback, onLayoutRectChangedElement.callback);
    }

    public final InterfaceC9540l getCallback() {
        return this.callback;
    }

    public final long getDebounceMillis() {
        return this.debounceMillis;
    }

    public final long getThrottleMillis() {
        return this.throttleMillis;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((Long.hashCode(this.throttleMillis) * 31) + Long.hashCode(this.debounceMillis)) * 31) + this.callback.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onRectChanged");
        inspectorInfo.getProperties().set("throttleMillis", Long.valueOf(this.throttleMillis));
        inspectorInfo.getProperties().set("debounceMillis", Long.valueOf(this.debounceMillis));
        inspectorInfo.getProperties().set("callback", this.callback);
    }

    public String toString() {
        return "OnLayoutRectChangedElement(throttleMillis=" + this.throttleMillis + ", debounceMillis=" + this.debounceMillis + ", callback=" + this.callback + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public OnLayoutRectChangedNode create() {
        return new OnLayoutRectChangedNode(this.throttleMillis, this.debounceMillis, this.callback);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(OnLayoutRectChangedNode onLayoutRectChangedNode) {
        onLayoutRectChangedNode.setThrottleMillis(this.throttleMillis);
        onLayoutRectChangedNode.setDebounceMillis(this.debounceMillis);
        onLayoutRectChangedNode.setCallback(this.callback);
        onLayoutRectChangedNode.disposeAndRegister();
    }
}
