package androidx.compose.p013ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* loaded from: classes2.dex */
final class LockHardwareCanvasHelper {
    public static final LockHardwareCanvasHelper INSTANCE = new LockHardwareCanvasHelper();

    private LockHardwareCanvasHelper() {
    }

    public final Canvas lockHardwareCanvas(Surface surface) {
        return surface.lockHardwareCanvas();
    }
}
