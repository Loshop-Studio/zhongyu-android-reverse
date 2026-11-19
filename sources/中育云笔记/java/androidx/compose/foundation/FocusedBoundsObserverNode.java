package androidx.compose.foundation;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.node.TraversableNode;
import androidx.compose.p014ui.node.TraversableNodeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FocusedBoundsObserverNode extends Modifier.Node implements TraversableNode {
    private InterfaceC9540l onPositioned;
    private final Object traverseKey = TraverseKey;
    public static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(AbstractC9972n abstractC9972n) {
            this();
        }

        private TraverseKey() {
        }
    }

    public FocusedBoundsObserverNode(InterfaceC9540l interfaceC9540l) {
        this.onPositioned = interfaceC9540l;
    }

    public final InterfaceC9540l getOnPositioned() {
        return this.onPositioned;
    }

    @Override // androidx.compose.p014ui.node.TraversableNode
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

    public final void setOnPositioned(InterfaceC9540l interfaceC9540l) {
        this.onPositioned = interfaceC9540l;
    }
}
