package androidx.compose.p013ui.draganddrop;

import androidx.compose.p013ui.Modifier;

/* loaded from: classes2.dex */
public interface DragAndDropManager {
    Modifier getModifier();

    boolean isInterestedTarget(DragAndDropTarget dragAndDropTarget);

    boolean isRequestDragAndDropTransferRequired();

    void registerTargetInterest(DragAndDropTarget dragAndDropTarget);

    /* renamed from: requestDragAndDropTransfer-Uv8p0NA */
    void mo23863requestDragAndDropTransferUv8p0NA(DragAndDropNode dragAndDropNode, long j10);
}
