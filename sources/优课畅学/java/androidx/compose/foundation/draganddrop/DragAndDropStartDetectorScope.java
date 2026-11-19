package androidx.compose.foundation.draganddrop;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerInputScope;

/* loaded from: classes.dex */
public interface DragAndDropStartDetectorScope extends PointerInputScope {
    /* renamed from: requestDragAndDropTransfer-k-4lQ0M$default, reason: not valid java name */
    static /* synthetic */ void m20502requestDragAndDropTransferk4lQ0M$default(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestDragAndDropTransfer-k-4lQ0M");
        }
        if ((i10 & 1) != 0) {
            j10 = Offset.Companion.m24050getUnspecifiedF1C5BW0();
        }
        dragAndDropStartDetectorScope.mo20489requestDragAndDropTransferk4lQ0M(j10);
    }

    /* renamed from: requestDragAndDropTransfer-k-4lQ0M */
    void mo20489requestDragAndDropTransferk4lQ0M(long j10);
}
