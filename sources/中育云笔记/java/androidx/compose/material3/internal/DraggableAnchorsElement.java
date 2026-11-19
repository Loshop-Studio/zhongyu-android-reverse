package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
final class DraggableAnchorsElement<T> extends ModifierNodeElement<DraggableAnchorsNode<T>> {
    private final InterfaceC9544p anchors;
    private final Orientation orientation;
    private final AnchoredDraggableState<T> state;

    public DraggableAnchorsElement(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC9544p interfaceC9544p, Orientation orientation) {
        this.state = anchoredDraggableState;
        this.anchors = interfaceC9544p;
        this.orientation = orientation;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return AbstractC9979u.m20289b(this.state, draggableAnchorsElement.state) && this.anchors == draggableAnchorsElement.anchors && this.orientation == draggableAnchorsElement.orientation;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.state.hashCode() * 31) + this.anchors.hashCode()) * 31) + this.orientation.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            new InterfaceC9540l() { // from class: androidx.compose.material3.internal.DraggableAnchorsElement$inspectableProperties$$inlined$debugInspectorInfo$1
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InspectorInfo) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(InspectorInfo inspectorInfo2) {
                    inspectorInfo2.getProperties().set("state", this.this$0.state);
                    inspectorInfo2.getProperties().set("anchors", this.this$0.anchors);
                    inspectorInfo2.getProperties().set("orientation", this.this$0.orientation);
                }
            };
        } else {
            InspectableValueKt.getNoInspectorInfo();
        }
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public DraggableAnchorsNode<T> create() {
        return new DraggableAnchorsNode<>(this.state, this.anchors, this.orientation);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(DraggableAnchorsNode<T> draggableAnchorsNode) {
        draggableAnchorsNode.setState(this.state);
        draggableAnchorsNode.setAnchors(this.anchors);
        draggableAnchorsNode.setOrientation(this.orientation);
    }
}
