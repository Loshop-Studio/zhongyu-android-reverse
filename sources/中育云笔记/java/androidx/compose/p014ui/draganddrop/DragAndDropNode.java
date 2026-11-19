package androidx.compose.p014ui.draganddrop;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.TraversableNode;
import androidx.compose.p014ui.node.TraversableNodeKt;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropModifierNode, DragAndDropSourceModifierNode, DragAndDropTargetModifierNode, DragAndDropTarget {
    private DragAndDropNode lastChildDragAndDropModifierNode;
    private final InterfaceC9540l onDropTargetValidate;
    private InterfaceC9544p onStartTransfer;
    private long size;
    private DragAndDropTarget thisDragAndDropTarget;
    private final Object traverseKey;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {

        public static final class DragAndDropTraversableKey {
            public static final DragAndDropTraversableKey INSTANCE = new DragAndDropTraversableKey();

            private DragAndDropTraversableKey() {
            }
        }

        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DragAndDropManager getDragAndDropManager() {
        return DelegatableNodeKt.requireOwner(this).getDragAndDropManager();
    }

    @Override // androidx.compose.p014ui.draganddrop.DragAndDropModifierNode
    public boolean acceptDragAndDropTransfer(final DragAndDropEvent dragAndDropEvent) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new InterfaceC9540l() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode.acceptDragAndDropTransfer.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                if (!dragAndDropNode.isAttached()) {
                    return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
                if (!(dragAndDropNode.thisDragAndDropTarget == null)) {
                    InlineClassHelperKt.throwIllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                InterfaceC9540l interfaceC9540l = dragAndDropNode.onDropTargetValidate;
                dragAndDropNode.thisDragAndDropTarget = interfaceC9540l != null ? (DragAndDropTarget) interfaceC9540l.invoke(dragAndDropEvent) : null;
                boolean z10 = dragAndDropNode.thisDragAndDropTarget != null;
                if (z10) {
                    this.getDragAndDropManager().registerTargetInterest(dragAndDropNode);
                }
                Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                ref$BooleanRef2.f23398c = ref$BooleanRef2.f23398c || z10;
                return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            }
        });
        return ref$BooleanRef.f23398c;
    }

    @Override // androidx.compose.p014ui.draganddrop.DragAndDropModifierNode
    @InterfaceC10770a
    /* renamed from: drag-12SF9DM */
    public void mo30467drag12SF9DM(final DragAndDropTransferData dragAndDropTransferData, final long j10, final InterfaceC9540l interfaceC9540l) {
        if (!(this.onStartTransfer == null)) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        this.onStartTransfer = new InterfaceC9544p() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$drag$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m30472invokeUv8p0NA((DragAndDropStartTransferScope) obj, ((Offset) obj2).m30647unboximpl());
                return C10786q.f26013a;
            }

            /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
            public final void m30472invokeUv8p0NA(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j11) {
                dragAndDropStartTransferScope.mo30466startDragAndDropTransfer12SF9DM(dragAndDropTransferData, j10, interfaceC9540l);
            }
        };
        getDragAndDropManager().mo30465requestDragAndDropTransferUv8p0NA(this, Offset.Companion.m30652getUnspecifiedF1C5BW0());
        this.onStartTransfer = null;
    }

    /* renamed from: getSize-YbymL2g$ui_release, reason: not valid java name */
    public final long m30468getSizeYbymL2g$ui_release() {
        return this.size;
    }

    @Override // androidx.compose.p014ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public final boolean hasEligibleDropTarget() {
        return (this.lastChildDragAndDropModifierNode == null && this.thisDragAndDropTarget == null) ? false : true;
    }

    @Override // androidx.compose.p014ui.draganddrop.DragAndDropSourceModifierNode
    public boolean isRequestDragAndDropTransferRequired() {
        return getDragAndDropManager().isRequestDragAndDropTransferRequired();
    }

    @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
    public void onChanged(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onChanged(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onChanged(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
    public boolean onDrop(DragAndDropEvent dragAndDropEvent) {
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            return dragAndDropNode.onDrop(dragAndDropEvent);
        }
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            return dragAndDropTarget.onDrop(dragAndDropEvent);
        }
        return false;
    }

    @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
    public void onEnded(final DragAndDropEvent dragAndDropEvent) {
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new InterfaceC9540l() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode.onEnded.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                if (!dragAndDropNode.getNode().isAttached()) {
                    return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
                DragAndDropTarget dragAndDropTarget = dragAndDropNode.thisDragAndDropTarget;
                if (dragAndDropTarget != null) {
                    dragAndDropTarget.onEnded(dragAndDropEvent);
                }
                dragAndDropNode.thisDragAndDropTarget = null;
                dragAndDropNode.lastChildDragAndDropModifierNode = null;
                return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            }
        });
    }

    @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
    public void onEntered(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onEntered(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onEntered(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
    public void onExited(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onExited(dragAndDropEvent);
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onExited(dragAndDropEvent);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
    public void onMoved(final DragAndDropEvent dragAndDropEvent) {
        TraversableNode traversableNode;
        DragAndDropNode dragAndDropNode;
        DragAndDropNode dragAndDropNode2 = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode2 == null || !DragAndDropNodeKt.m30474containsUv8p0NA(dragAndDropNode2, DragAndDrop_androidKt.getPositionInRoot(dragAndDropEvent))) {
            if (getNode().isAttached()) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                TraversableNodeKt.traverseDescendants(this, new InterfaceC9540l() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode3) {
                        DragAndDropNode dragAndDropNode4 = dragAndDropNode3;
                        if (!this.getDragAndDropManager().isInterestedTarget(dragAndDropNode4) || !DragAndDropNodeKt.m30474containsUv8p0NA(dragAndDropNode4, DragAndDrop_androidKt.getPositionInRoot(dragAndDropEvent))) {
                            return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                        }
                        ref$ObjectRef.f23402c = dragAndDropNode3;
                        return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
                    }
                });
                traversableNode = (TraversableNode) ref$ObjectRef.f23402c;
            } else {
                traversableNode = null;
            }
            dragAndDropNode = (DragAndDropNode) traversableNode;
        } else {
            dragAndDropNode = dragAndDropNode2;
        }
        if (dragAndDropNode != null && dragAndDropNode2 == null) {
            DragAndDropNodeKt.dispatchEntered(dragAndDropNode, dragAndDropEvent);
            DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
            if (dragAndDropTarget != null) {
                dragAndDropTarget.onExited(dragAndDropEvent);
            }
        } else if (dragAndDropNode == null && dragAndDropNode2 != null) {
            DragAndDropTarget dragAndDropTarget2 = this.thisDragAndDropTarget;
            if (dragAndDropTarget2 != null) {
                DragAndDropNodeKt.dispatchEntered(dragAndDropTarget2, dragAndDropEvent);
            }
            dragAndDropNode2.onExited(dragAndDropEvent);
        } else if (!AbstractC9979u.m20289b(dragAndDropNode, dragAndDropNode2)) {
            if (dragAndDropNode != null) {
                DragAndDropNodeKt.dispatchEntered(dragAndDropNode, dragAndDropEvent);
            }
            if (dragAndDropNode2 != null) {
                dragAndDropNode2.onExited(dragAndDropEvent);
            }
        } else if (dragAndDropNode != null) {
            dragAndDropNode.onMoved(dragAndDropEvent);
        } else {
            DragAndDropTarget dragAndDropTarget3 = this.thisDragAndDropTarget;
            if (dragAndDropTarget3 != null) {
                dragAndDropTarget3.onMoved(dragAndDropEvent);
            }
        }
        this.lastChildDragAndDropModifierNode = dragAndDropNode;
    }

    @Override // androidx.compose.p014ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo27087onRemeasuredozmzZPI(long j10) {
        this.size = j10;
    }

    @Override // androidx.compose.p014ui.draganddrop.DragAndDropTarget
    public void onStarted(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onStarted(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onStarted(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.p014ui.draganddrop.DragAndDropSourceModifierNode
    /* renamed from: requestDragAndDropTransfer-k-4lQ0M, reason: not valid java name */
    public void mo30469requestDragAndDropTransferk4lQ0M(long j10) {
        if (!(this.onStartTransfer != null)) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        getDragAndDropManager().mo30465requestDragAndDropTransferUv8p0NA(this, j10);
    }

    /* renamed from: setSize-ozmzZPI$ui_release, reason: not valid java name */
    public final void m30470setSizeozmzZPI$ui_release(long j10) {
        this.size = j10;
    }

    /* renamed from: startDragAndDropTransfer-d-4ec7I, reason: not valid java name */
    public final void m30471startDragAndDropTransferd4ec7I(final DragAndDropStartTransferScope dragAndDropStartTransferScope, final long j10, final InterfaceC9529a interfaceC9529a) {
        final LayoutCoordinates coordinates = DelegatableNodeKt.requireLayoutNode(this).getCoordinates();
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new InterfaceC9540l() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$startDragAndDropTransfer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                if (!dragAndDropNode.isAttached()) {
                    return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
                InterfaceC9544p interfaceC9544p = dragAndDropNode.onStartTransfer;
                if (interfaceC9544p == null) {
                    return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
                long j11 = j10;
                Offset.Companion companion = Offset.Companion;
                if (Offset.m30634equalsimpl0(j11, companion.m30652getUnspecifiedF1C5BW0())) {
                    interfaceC9544p.invoke(dragAndDropStartTransferScope, Offset.m30626boximpl(companion.m30652getUnspecifiedF1C5BW0()));
                } else {
                    long jMo32238localPositionOfR5De75A = DelegatableNodeKt.requireLayoutNode(dragAndDropNode).getCoordinates().mo32238localPositionOfR5De75A(coordinates, j10);
                    if (!SizeKt.m30727toRectuvyYCjk(IntSizeKt.m33684toSizeozmzZPI(dragAndDropNode.m30468getSizeYbymL2g$ui_release())).m30663containsk4lQ0M(jMo32238localPositionOfR5De75A)) {
                        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                    }
                    interfaceC9544p.invoke(dragAndDropStartTransferScope, Offset.m30626boximpl(jMo32238localPositionOfR5De75A));
                }
                return ((Boolean) interfaceC9529a.invoke()).booleanValue() ? TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal : TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            }
        });
    }

    public /* synthetic */ DragAndDropNode(InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : interfaceC9544p, (i10 & 2) != 0 ? null : interfaceC9540l);
    }

    public DragAndDropNode(InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l) {
        this.onStartTransfer = interfaceC9544p;
        this.onDropTargetValidate = interfaceC9540l;
        this.traverseKey = Companion.DragAndDropTraversableKey.INSTANCE;
        this.size = IntSize.Companion.m33677getZeroYbymL2g();
    }
}
