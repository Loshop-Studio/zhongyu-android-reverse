package androidx.compose.p014ui.draganddrop;

import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.TraversableNode;
import androidx.compose.p014ui.node.TraversableNodeKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class DragAndDropNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC10770a
    public static final DragAndDropModifierNode DragAndDropModifierNode() {
        return new DragAndDropNode(null, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DragAndDropSourceModifierNode DragAndDropSourceModifierNode(InterfaceC9544p interfaceC9544p) {
        return new DragAndDropNode(interfaceC9544p, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DragAndDropTargetModifierNode DragAndDropTargetModifierNode(final InterfaceC9540l interfaceC9540l, final DragAndDropTarget dragAndDropTarget) {
        return new DragAndDropNode(null, new InterfaceC9540l() { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt.DragAndDropTargetModifierNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final DragAndDropTarget invoke(DragAndDropEvent dragAndDropEvent) {
                if (((Boolean) interfaceC9540l.invoke(dragAndDropEvent)).booleanValue()) {
                    return dragAndDropTarget;
                }
                return null;
            }
        }, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: contains-Uv8p0NA, reason: not valid java name */
    public static final boolean m30474containsUv8p0NA(DragAndDropNode dragAndDropNode, long j10) {
        if (!dragAndDropNode.getNode().isAttached()) {
            return false;
        }
        LayoutCoordinates coordinates = DelegatableNodeKt.requireLayoutNode(dragAndDropNode).getCoordinates();
        if (!coordinates.isAttached()) {
            return false;
        }
        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jPositionInRoot >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jPositionInRoot & 4294967295L));
        float fM30468getSizeYbymL2g$ui_release = ((int) (dragAndDropNode.m30468getSizeYbymL2g$ui_release() >> 32)) + fIntBitsToFloat;
        float fM30468getSizeYbymL2g$ui_release2 = ((int) (dragAndDropNode.m30468getSizeYbymL2g$ui_release() & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32));
        if (fIntBitsToFloat <= fIntBitsToFloat3 && fIntBitsToFloat3 <= fM30468getSizeYbymL2g$ui_release) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j10 & 4294967295L));
            if (fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= fM30468getSizeYbymL2g$ui_release2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchEntered(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        dragAndDropTarget.onEntered(dragAndDropEvent);
        dragAndDropTarget.onMoved(dragAndDropEvent);
    }

    private static final <T extends TraversableNode> T firstDescendantOrNull(T t10, final InterfaceC9540l interfaceC9540l) {
        if (!t10.getNode().isAttached()) {
            return null;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        TraversableNodeKt.traverseDescendants(t10, new InterfaceC9540l() { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt.firstDescendantOrNull.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction; */
            @Override // p181hd.InterfaceC9540l
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
                if (!((Boolean) interfaceC9540l.invoke(traversableNode)).booleanValue()) {
                    return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
                ref$ObjectRef.f23402c = traversableNode;
                return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
            }
        });
        return (T) ref$ObjectRef.f23402c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends TraversableNode> void traverseSelfAndDescendants(T t10, InterfaceC9540l interfaceC9540l) {
        if (interfaceC9540l.invoke(t10) != TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal) {
            return;
        }
        TraversableNodeKt.traverseDescendants(t10, interfaceC9540l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC10770a
    public static final DragAndDropModifierNode DragAndDropModifierNode(final InterfaceC9540l interfaceC9540l, final DragAndDropTarget dragAndDropTarget) {
        return new DragAndDropNode(null, new InterfaceC9540l() { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt.DragAndDropModifierNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final DragAndDropTarget invoke(DragAndDropEvent dragAndDropEvent) {
                if (((Boolean) interfaceC9540l.invoke(dragAndDropEvent)).booleanValue()) {
                    return dragAndDropTarget;
                }
                return null;
            }
        }, 1, 0 == true ? 1 : 0);
    }
}
