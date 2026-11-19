package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectableValueKt;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
final class DraggableAnchorsElement<T> extends ModifierNodeElement<DraggableAnchorsNode<T>> {
    private final InterfaceC10574p anchors;
    private final Orientation orientation;
    private final AnchoredDraggableState<T> state;

    public DraggableAnchorsElement(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC10574p interfaceC10574p, Orientation orientation) {
        this.state = anchoredDraggableState;
        this.anchors = interfaceC10574p;
        this.orientation = orientation;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return AbstractC9133u.m16128b(this.state, draggableAnchorsElement.state) && this.anchors == draggableAnchorsElement.anchors && this.orientation == draggableAnchorsElement.orientation;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.state.hashCode() * 31) + this.anchors.hashCode()) * 31) + this.orientation.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            new InterfaceC10570l() { // from class: androidx.compose.material3.internal.DraggableAnchorsElement$inspectableProperties$$inlined$debugInspectorInfo$1
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InspectorInfo) obj);
                    return C8736p.f16368a;
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

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public DraggableAnchorsNode<T> create() {
        return new DraggableAnchorsNode<>(this.state, this.anchors, this.orientation);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(DraggableAnchorsNode<T> draggableAnchorsNode) {
        draggableAnchorsNode.setState(this.state);
        draggableAnchorsNode.setAnchors(this.anchors);
        draggableAnchorsNode.setOrientation(this.orientation);
    }
}
