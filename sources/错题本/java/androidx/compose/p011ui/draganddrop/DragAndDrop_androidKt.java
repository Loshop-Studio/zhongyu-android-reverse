package androidx.compose.p011ui.draganddrop;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.p011ui.geometry.Offset;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m5110d2 = {"positionInRoot", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "getPositionInRoot", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)J", "mimeTypes", "", "", "toAndroidDragEvent", "Landroid/view/DragEvent;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDragAndDrop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDrop.android.kt\nandroidx/compose/ui/draganddrop/DragAndDrop_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,66:1\n30#2:67\n53#3,3:68\n*S KotlinDebug\n*F\n+ 1 DragAndDrop.android.kt\nandroidx/compose/ui/draganddrop/DragAndDrop_androidKt\n*L\n65#1:67\n65#1:68,3\n*E\n"})
/* loaded from: classes.dex */
public final class DragAndDrop_androidKt {
    public static final long getPositionInRoot(@NotNull DragAndDropEvent dragAndDropEvent) {
        float x3 = dragAndDropEvent.getDragEvent().getX();
        float y2 = dragAndDropEvent.getDragEvent().getY();
        return Offset.m10433constructorimpl((Float.floatToRawIntBits(x3) << 32) | (Float.floatToRawIntBits(y2) & 4294967295L));
    }

    @NotNull
    public static final Set<String> mimeTypes(@NotNull DragAndDropEvent dragAndDropEvent) {
        ClipDescription clipDescription = dragAndDropEvent.getDragEvent().getClipDescription();
        if (clipDescription == null) {
            return EmptySet.INSTANCE;
        }
        SetBuilder setBuilder = new SetBuilder(clipDescription.getMimeTypeCount());
        int mimeTypeCount = clipDescription.getMimeTypeCount();
        for (int i = 0; i < mimeTypeCount; i++) {
            setBuilder.add(clipDescription.getMimeType(i));
        }
        return setBuilder.build();
    }

    @NotNull
    public static final DragEvent toAndroidDragEvent(@NotNull DragAndDropEvent dragAndDropEvent) {
        return dragAndDropEvent.getDragEvent();
    }
}
