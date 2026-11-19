package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p014ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface DragAndDropSourceScope extends PointerInputScope {
    void startTransfer(DragAndDropTransferData dragAndDropTransferData);
}
