package androidx.compose.foundation.content.internal;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.view.View;
import androidx.compose.p012ui.draganddrop.DragAndDropEvent;
import androidx.compose.p012ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.p012ui.node.DelegatableNode;
import androidx.compose.p012ui.node.DelegatableNode_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.DragAndDropPermissionsCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¨\u0006\f"}, m13413d2 = {"tryGetActivity", "Landroid/app/Activity;", "view", "Landroid/view/View;", "containsContentUri", "", "Landroid/content/ClipData;", "dragAndDropRequestPermission", "", "Landroidx/compose/ui/node/DelegatableNode;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class DragAndDropRequestPermission_androidKt {
    private static final boolean containsContentUri(ClipData clipData) {
        int itemCount = clipData.getItemCount();
        for (int i9 = 0; i9 < itemCount; i9++) {
            Uri uri = clipData.getItemAt(i9).getUri();
            if (uri != null && Intrinsics.areEqual(uri.getScheme(), "content")) {
                return true;
            }
        }
        return false;
    }

    public static final void dragAndDropRequestPermission(DelegatableNode delegatableNode, DragAndDropEvent dragAndDropEvent) {
        Activity activityTryGetActivity;
        if (containsContentUri(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipData()) && delegatableNode.getNode().getIsAttached() && (activityTryGetActivity = tryGetActivity(DelegatableNode_androidKt.requireView(delegatableNode))) != null) {
            DragAndDropPermissionsCompat.request(activityTryGetActivity, DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent));
        }
    }

    private static final Activity tryGetActivity(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
