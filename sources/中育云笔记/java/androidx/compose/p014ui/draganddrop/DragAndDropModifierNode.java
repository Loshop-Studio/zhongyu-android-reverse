package androidx.compose.p014ui.draganddrop;

import androidx.compose.p014ui.node.DelegatableNode;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
/* loaded from: classes2.dex */
public interface DragAndDropModifierNode extends DelegatableNode, DragAndDropTarget {
    boolean acceptDragAndDropTransfer(DragAndDropEvent dragAndDropEvent);

    @InterfaceC10770a
    /* renamed from: drag-12SF9DM, reason: not valid java name */
    void mo30467drag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j10, InterfaceC9540l interfaceC9540l);
}
