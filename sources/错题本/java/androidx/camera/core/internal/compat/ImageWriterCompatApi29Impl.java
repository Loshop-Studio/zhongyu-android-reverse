package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.selection.SingleSelectionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

@RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
/* loaded from: classes.dex */
final class ImageWriterCompatApi29Impl {
    private ImageWriterCompatApi29Impl() {
    }

    @NonNull
    public static ImageWriter newInstance(@NonNull Surface surface, @IntRange(from = SingleSelectionLayout.DEFAULT_SELECTABLE_ID) int i, int i8) {
        return ImageWriter.newInstance(surface, i, i8);
    }
}
