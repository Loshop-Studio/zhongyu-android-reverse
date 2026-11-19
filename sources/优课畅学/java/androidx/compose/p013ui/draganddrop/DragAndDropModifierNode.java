package androidx.compose.p013ui.draganddrop;

import androidx.compose.p013ui.node.DelegatableNode;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

@InterfaceC8721a
/* loaded from: classes2.dex */
public interface DragAndDropModifierNode extends DelegatableNode, DragAndDropTarget {
    boolean acceptDragAndDropTransfer(DragAndDropEvent dragAndDropEvent);

    @InterfaceC8721a
    /* renamed from: drag-12SF9DM, reason: not valid java name */
    void mo23865drag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j10, InterfaceC10570l interfaceC10570l);
}
