package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class Draggable2DElement extends ModifierNodeElement<Draggable2DNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final MutableInteractionSource interactionSource;
    private final InterfaceC9540l onDragStarted;
    private final InterfaceC9540l onDragStopped;
    private final boolean reverseDirection;
    private final boolean startDragImmediately;
    private final Draggable2DState state;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC9540l CanDrag = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.Draggable2DElement$Companion$CanDrag$1
        @Override // p181hd.InterfaceC9540l
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.TRUE;
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final InterfaceC9540l getCanDrag() {
            return Draggable2DElement.CanDrag;
        }

        private Companion() {
        }
    }

    public Draggable2DElement(Draggable2DState draggable2DState, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, boolean z12) {
        this.state = draggable2DState;
        this.enabled = z10;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = z11;
        this.onDragStarted = interfaceC9540l;
        this.onDragStopped = interfaceC9540l2;
        this.reverseDirection = z12;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Draggable2DElement.class != obj.getClass()) {
            return false;
        }
        Draggable2DElement draggable2DElement = (Draggable2DElement) obj;
        return AbstractC9979u.m20289b(this.state, draggable2DElement.state) && this.enabled == draggable2DElement.enabled && AbstractC9979u.m20289b(this.interactionSource, draggable2DElement.interactionSource) && this.startDragImmediately == draggable2DElement.startDragImmediately && this.onDragStarted == draggable2DElement.onDragStarted && this.onDragStopped == draggable2DElement.onDragStopped && this.reverseDirection == draggable2DElement.reverseDirection;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((this.state.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return ((((((((iHashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31) + Boolean.hashCode(this.startDragImmediately)) * 31) + this.onDragStarted.hashCode()) * 31) + this.onDragStopped.hashCode()) * 31) + Boolean.hashCode(this.reverseDirection);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("draggable2D");
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("startDragImmediately", Boolean.valueOf(this.startDragImmediately));
        inspectorInfo.getProperties().set("onDragStarted", this.onDragStarted);
        inspectorInfo.getProperties().set("onDragStopped", this.onDragStopped);
        inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(this.reverseDirection));
        inspectorInfo.getProperties().set("state", this.state);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public Draggable2DNode create() {
        return new Draggable2DNode(this.state, CanDrag, this.enabled, this.interactionSource, this.startDragImmediately, this.reverseDirection, this.onDragStarted, this.onDragStopped);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(Draggable2DNode draggable2DNode) {
        draggable2DNode.update(this.state, CanDrag, this.enabled, this.interactionSource, this.startDragImmediately, this.reverseDirection, this.onDragStarted, this.onDragStopped);
    }
}
