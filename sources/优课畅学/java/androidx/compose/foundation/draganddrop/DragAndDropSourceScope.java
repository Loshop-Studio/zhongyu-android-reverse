package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p013ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import p123h7.InterfaceC8721a;

@InterfaceC8721a
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface DragAndDropSourceScope extends PointerInputScope {
    void startTransfer(DragAndDropTransferData dragAndDropTransferData);
}
