package androidx.compose.p014ui.graphics;

import android.graphics.Canvas;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* loaded from: classes2.dex */
final class CanvasZHelper {
    public static final CanvasZHelper INSTANCE = new CanvasZHelper();

    private CanvasZHelper() {
    }

    public final void enableZ(Canvas canvas, boolean z10) {
        if (z10) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
