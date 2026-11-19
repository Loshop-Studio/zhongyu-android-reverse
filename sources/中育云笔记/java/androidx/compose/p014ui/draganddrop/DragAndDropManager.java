package androidx.compose.p014ui.draganddrop;

import androidx.compose.p014ui.Modifier;

/* loaded from: classes2.dex */
public interface DragAndDropManager {
    Modifier getModifier();

    boolean isInterestedTarget(DragAndDropTarget dragAndDropTarget);

    boolean isRequestDragAndDropTransferRequired();

    void registerTargetInterest(DragAndDropTarget dragAndDropTarget);

    /* renamed from: requestDragAndDropTransfer-Uv8p0NA */
    void mo30465requestDragAndDropTransferUv8p0NA(DragAndDropNode dragAndDropNode, long j10);
}
