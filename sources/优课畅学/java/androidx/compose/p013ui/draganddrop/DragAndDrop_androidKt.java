package androidx.compose.p013ui.draganddrop;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.p013ui.geometry.Offset;
import java.util.Set;
import p134i7.AbstractC8810v0;
import p134i7.AbstractC8812w0;

/* loaded from: classes2.dex */
public final class DragAndDrop_androidKt {
    public static final long getPositionInRoot(DragAndDropEvent dragAndDropEvent) {
        float x10 = dragAndDropEvent.getDragEvent$ui_release().getX();
        float y10 = dragAndDropEvent.getDragEvent$ui_release().getY();
        return Offset.m24027constructorimpl((Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L));
    }

    public static final Set<String> mimeTypes(DragAndDropEvent dragAndDropEvent) {
        ClipDescription clipDescription = dragAndDropEvent.getDragEvent$ui_release().getClipDescription();
        if (clipDescription == null) {
            return AbstractC8812w0.m14788f();
        }
        Set setM14783c = AbstractC8810v0.m14783c(clipDescription.getMimeTypeCount());
        int mimeTypeCount = clipDescription.getMimeTypeCount();
        for (int i10 = 0; i10 < mimeTypeCount; i10++) {
            setM14783c.add(clipDescription.getMimeType(i10));
        }
        return AbstractC8810v0.m14781a(setM14783c);
    }

    public static final DragEvent toAndroidDragEvent(DragAndDropEvent dragAndDropEvent) {
        return dragAndDropEvent.getDragEvent$ui_release();
    }
}
