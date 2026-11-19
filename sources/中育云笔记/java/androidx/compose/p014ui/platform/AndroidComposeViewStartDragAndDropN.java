package androidx.compose.p014ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.p014ui.draganddrop.DragAndDropTransferData;

@RequiresApi(24)
/* loaded from: classes2.dex */
final class AndroidComposeViewStartDragAndDropN {
    public static final AndroidComposeViewStartDragAndDropN INSTANCE = new AndroidComposeViewStartDragAndDropN();

    private AndroidComposeViewStartDragAndDropN() {
    }

    @DoNotInline
    @RequiresApi(24)
    public final boolean startDragAndDrop(View view, DragAndDropTransferData dragAndDropTransferData, ComposeDragShadowBuilder composeDragShadowBuilder) {
        return view.startDragAndDrop(dragAndDropTransferData.getClipData(), composeDragShadowBuilder, dragAndDropTransferData.getLocalState(), dragAndDropTransferData.getFlags());
    }
}
