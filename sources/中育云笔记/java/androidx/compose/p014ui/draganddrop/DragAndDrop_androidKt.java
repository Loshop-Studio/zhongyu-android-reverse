package androidx.compose.p014ui.draganddrop;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.p014ui.geometry.Offset;
import java.util.Set;
import p325rc.AbstractC10981x0;
import p325rc.AbstractC10983y0;

/* loaded from: classes2.dex */
public final class DragAndDrop_androidKt {
    public static final long getPositionInRoot(DragAndDropEvent dragAndDropEvent) {
        float x10 = dragAndDropEvent.getDragEvent$ui_release().getX();
        float y10 = dragAndDropEvent.getDragEvent$ui_release().getY();
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L));
    }

    public static final Set<String> mimeTypes(DragAndDropEvent dragAndDropEvent) {
        ClipDescription clipDescription = dragAndDropEvent.getDragEvent$ui_release().getClipDescription();
        if (clipDescription == null) {
            return AbstractC10983y0.m24160f();
        }
        Set setM24157c = AbstractC10981x0.m24157c(clipDescription.getMimeTypeCount());
        int mimeTypeCount = clipDescription.getMimeTypeCount();
        for (int i10 = 0; i10 < mimeTypeCount; i10++) {
            setM24157c.add(clipDescription.getMimeType(i10));
        }
        return AbstractC10981x0.m24155a(setM24157c);
    }

    public static final DragEvent toAndroidDragEvent(DragAndDropEvent dragAndDropEvent) {
        return dragAndDropEvent.getDragEvent$ui_release();
    }
}
