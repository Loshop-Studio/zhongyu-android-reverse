package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p009ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p009ui.input.pointer.PointerInputScope;
import kotlin.Deprecated;
import kotlin.Metadata;

@Deprecated(message = "Replaced by a callback for obtain a transfer data,start detection is performed by Compose itself")
@ExperimentalFoundationApi
@Metadata(m7879d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m7880d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "startTransfer", "", "transferData", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public interface DragAndDropSourceScope extends PointerInputScope {
    void startTransfer(DragAndDropTransferData transferData);
}
