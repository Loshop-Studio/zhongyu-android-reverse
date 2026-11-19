package androidx.compose.p013ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
/* loaded from: classes2.dex */
final class CanvasCompatO {
    public static final CanvasCompatO INSTANCE = new CanvasCompatO();

    private CanvasCompatO() {
    }

    public final boolean clipOutPath(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public final boolean clipOutRect(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public final boolean clipOutRect(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public final boolean clipOutRect(Canvas canvas, float f10, float f11, float f12, float f13) {
        return canvas.clipOutRect(f10, f11, f12, f13);
    }

    public final boolean clipOutRect(Canvas canvas, int i10, int i11, int i12, int i13) {
        return canvas.clipOutRect(i10, i11, i12, i13);
    }
}
