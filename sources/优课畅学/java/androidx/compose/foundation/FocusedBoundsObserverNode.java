package androidx.compose.foundation;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.node.TraversableNode;
import androidx.compose.p013ui.node.TraversableNodeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FocusedBoundsObserverNode extends Modifier.Node implements TraversableNode {
    private InterfaceC10570l onPositioned;
    private final Object traverseKey = TraverseKey;
    public static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(AbstractC9126n abstractC9126n) {
            this();
        }

        private TraverseKey() {
        }
    }

    public FocusedBoundsObserverNode(InterfaceC10570l interfaceC10570l) {
        this.onPositioned = interfaceC10570l;
    }

    public final InterfaceC10570l getOnPositioned() {
        return this.onPositioned;
    }

    @Override // androidx.compose.p013ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public final void onFocusBoundsChanged(LayoutCoordinates layoutCoordinates) {
        this.onPositioned.invoke(layoutCoordinates);
        FocusedBoundsObserverNode focusedBoundsObserverNode = (FocusedBoundsObserverNode) TraversableNodeKt.findNearestAncestor(this);
        if (focusedBoundsObserverNode != null) {
            focusedBoundsObserverNode.onFocusBoundsChanged(layoutCoordinates);
        }
    }

    public final void setOnPositioned(InterfaceC10570l interfaceC10570l) {
        this.onPositioned = interfaceC10570l;
    }
}
