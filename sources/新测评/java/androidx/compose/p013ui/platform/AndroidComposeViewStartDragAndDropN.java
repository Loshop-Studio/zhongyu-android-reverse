package androidx.compose.p013ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.p013ui.draganddrop.DragAndDropTransferData;
import kotlin.Metadata;

@RequiresApi(24)
@Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m13558d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewStartDragAndDropN;", "", "()V", "startDragAndDrop", "", "view", "Landroid/view/View;", "transferData", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "dragShadowBuilder", "Landroidx/compose/ui/draganddrop/ComposeDragShadowBuilder;", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
final class AndroidComposeViewStartDragAndDropN {
    public static final AndroidComposeViewStartDragAndDropN INSTANCE = new AndroidComposeViewStartDragAndDropN();

    private AndroidComposeViewStartDragAndDropN() {
    }

    @DoNotInline
    @RequiresApi(24)
    public final boolean startDragAndDrop(View view, DragAndDropTransferData transferData, ComposeDragShadowBuilder dragShadowBuilder) {
        return view.startDragAndDrop(transferData.getClipData(), dragShadowBuilder, transferData.getLocalState(), transferData.getFlags());
    }
}
