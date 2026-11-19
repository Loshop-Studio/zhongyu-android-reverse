package androidx.compose.animation;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SharedBoundsNodeElement extends ModifierNodeElement<SharedBoundsNode> {
    public static final int $stable = 0;
    private final SharedElementInternalState sharedElementState;

    public SharedBoundsNodeElement(SharedElementInternalState sharedElementInternalState) {
        this.sharedElementState = sharedElementInternalState;
    }

    public static /* synthetic */ SharedBoundsNodeElement copy$default(SharedBoundsNodeElement sharedBoundsNodeElement, SharedElementInternalState sharedElementInternalState, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sharedElementInternalState = sharedBoundsNodeElement.sharedElementState;
        }
        return sharedBoundsNodeElement.copy(sharedElementInternalState);
    }

    public final SharedElementInternalState component1() {
        return this.sharedElementState;
    }

    public final SharedBoundsNodeElement copy(SharedElementInternalState sharedElementInternalState) {
        return new SharedBoundsNodeElement(sharedElementInternalState);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedBoundsNodeElement) && AbstractC9133u.m16128b(this.sharedElementState, ((SharedBoundsNodeElement) obj).sharedElementState);
    }

    public final SharedElementInternalState getSharedElementState() {
        return this.sharedElementState;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return this.sharedElementState.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("sharedBounds");
        inspectorInfo.getProperties().set("sharedElementState", this.sharedElementState);
    }

    public String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.sharedElementState + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public SharedBoundsNode create() {
        return new SharedBoundsNode(this.sharedElementState);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(SharedBoundsNode sharedBoundsNode) {
        sharedBoundsNode.setState$animation_release(this.sharedElementState);
    }
}
