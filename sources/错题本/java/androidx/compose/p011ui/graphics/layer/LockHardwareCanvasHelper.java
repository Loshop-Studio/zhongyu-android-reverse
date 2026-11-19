package androidx.compose.p011ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi(23)
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m5110d2 = {"Landroidx/compose/ui/graphics/layer/LockHardwareCanvasHelper;", "", "()V", "lockHardwareCanvas", "Landroid/graphics/Canvas;", "surface", "Landroid/view/Surface;", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class LockHardwareCanvasHelper {

    @NotNull
    public static final LockHardwareCanvasHelper INSTANCE = new LockHardwareCanvasHelper();

    private LockHardwareCanvasHelper() {
    }

    @NotNull
    public final Canvas lockHardwareCanvas(@NotNull Surface surface) {
        return surface.lockHardwareCanvas();
    }
}
