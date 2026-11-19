package androidx.compose.p013ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

@RequiresApi(23)
@Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m13558d2 = {"Landroidx/compose/ui/graphics/layer/SurfaceVerificationHelper;", "", "()V", "lockHardwareCanvas", "Landroid/graphics/Canvas;", "surface", "Landroid/view/Surface;", "ui-graphics_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
final class SurfaceVerificationHelper {
    public static final SurfaceVerificationHelper INSTANCE = new SurfaceVerificationHelper();

    private SurfaceVerificationHelper() {
    }

    public final Canvas lockHardwareCanvas(Surface surface) {
        return surface.lockHardwareCanvas();
    }
}
