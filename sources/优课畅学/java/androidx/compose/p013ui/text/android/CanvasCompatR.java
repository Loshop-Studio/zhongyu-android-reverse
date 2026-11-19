package androidx.compose.p013ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;

@RequiresApi(30)
/* loaded from: classes2.dex */
final class CanvasCompatR {
    public static final CanvasCompatR INSTANCE = new CanvasCompatR();

    private CanvasCompatR() {
    }

    public final boolean quickReject(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    public final boolean quickReject(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public final boolean quickReject(Canvas canvas, float f10, float f11, float f12, float f13) {
        return canvas.quickReject(f10, f11, f12, f13);
    }
}
