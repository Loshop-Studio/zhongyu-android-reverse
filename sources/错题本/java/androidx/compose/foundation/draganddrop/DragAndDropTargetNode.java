package androidx.compose.foundation.draganddrop;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.draganddrop.DragAndDropEvent;
import androidx.compose.p011ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.p011ui.draganddrop.DragAndDropTarget;
import androidx.compose.p011ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B2\u0012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ8\u0010\u0011\u001a\u00020\r2!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u000fR1\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m5110d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, NotificationCompat.CATEGORY_EVENT, "", "shouldStartDragAndDrop", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", TypedValues.AttributesType.S_TARGET, "<init>", "(Lr6/c;Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V", "Ld6/s;", "createAndAttachDragAndDropModifierNode", "()V", "onAttach", "update", "onDetach", "Lr6/c;", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "dragAndDropNode", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDragAndDropTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropTarget.kt\nandroidx/compose/foundation/draganddrop/DragAndDropTargetNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
/* loaded from: classes.dex */
final class DragAndDropTargetNode extends DelegatingNode {

    @Nullable
    private DragAndDropTargetModifierNode dragAndDropNode;

    @NotNull
    private InterfaceC6471c shouldStartDragAndDrop;

    @NotNull
    private DragAndDropTarget target;

    public DragAndDropTargetNode(@NotNull InterfaceC6471c interfaceC6471c, @NotNull DragAndDropTarget dragAndDropTarget) {
        this.shouldStartDragAndDrop = interfaceC6471c;
        this.target = dragAndDropTarget;
    }

    private final void createAndAttachDragAndDropModifierNode() {
        this.dragAndDropNode = (DragAndDropTargetModifierNode) delegate(DragAndDropNodeKt.DragAndDropTargetModifierNode(new InterfaceC6471c() { // from class: androidx.compose.foundation.draganddrop.DragAndDropTargetNode.createAndAttachDragAndDropModifierNode.1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(DragAndDropEvent dragAndDropEvent) {
                return (Boolean) DragAndDropTargetNode.this.shouldStartDragAndDrop.invoke(dragAndDropEvent);
            }
        }, this.target));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        createAndAttachDragAndDropModifierNode();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.dragAndDropNode;
        AbstractC5830k.m5327d(dragAndDropTargetModifierNode);
        undelegate(dragAndDropTargetModifierNode);
    }

    public final void update(@NotNull InterfaceC6471c shouldStartDragAndDrop, @NotNull DragAndDropTarget target) {
        this.shouldStartDragAndDrop = shouldStartDragAndDrop;
        if (AbstractC5830k.m5325b(target, this.target)) {
            return;
        }
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.dragAndDropNode;
        if (dragAndDropTargetModifierNode != null) {
            undelegate(dragAndDropTargetModifierNode);
        }
        this.target = target;
        createAndAttachDragAndDropModifierNode();
    }
}
