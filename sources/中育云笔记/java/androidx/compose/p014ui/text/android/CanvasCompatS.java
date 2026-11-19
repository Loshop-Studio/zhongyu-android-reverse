package androidx.compose.p014ui.text.android;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
/* loaded from: classes2.dex */
final class CanvasCompatS {
    public static final CanvasCompatS INSTANCE = new CanvasCompatS();

    private CanvasCompatS() {
    }

    public final void drawGlyphs(Canvas canvas, int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i10, fArr, i11, i12, font, paint);
    }

    public final void drawPatch(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public final void drawPatch(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
