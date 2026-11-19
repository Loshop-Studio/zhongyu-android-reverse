package androidx.compose.foundation.content.internal;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.view.View;
import androidx.compose.p013ui.draganddrop.DragAndDropEvent;
import androidx.compose.p013ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatableNode_androidKt;
import androidx.core.view.DragAndDropPermissionsCompat;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class DragAndDropRequestPermission_androidKt {
    private static final boolean containsContentUri(ClipData clipData) {
        int itemCount = clipData.getItemCount();
        for (int i10 = 0; i10 < itemCount; i10++) {
            Uri uri = clipData.getItemAt(i10).getUri();
            if (uri != null && AbstractC9133u.m16128b(uri.getScheme(), "content")) {
                return true;
            }
        }
        return false;
    }

    public static final void dragAndDropRequestPermission(DelegatableNode delegatableNode, DragAndDropEvent dragAndDropEvent) {
        Activity activityTryGetActivity;
        if (containsContentUri(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipData()) && delegatableNode.getNode().isAttached() && (activityTryGetActivity = tryGetActivity(DelegatableNode_androidKt.requireView(delegatableNode))) != null) {
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
