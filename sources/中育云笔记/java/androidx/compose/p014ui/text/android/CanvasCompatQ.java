package androidx.compose.p014ui.text.android;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* loaded from: classes2.dex */
final class CanvasCompatQ {
    public static final CanvasCompatQ INSTANCE = new CanvasCompatQ();

    private CanvasCompatQ() {
    }

    public final void disableZ(Canvas canvas) {
        canvas.disableZ();
    }

    public final void drawColor(Canvas canvas, long j10) {
        canvas.drawColor(j10);
    }

    public final void drawDoubleRoundRect(Canvas canvas, RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f10, f11, rectF2, f12, f13, paint);
    }

    public final void drawRenderNode(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public final void drawTextRun(Canvas canvas, MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        canvas.drawTextRun(measuredText, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    public final void enableZ(Canvas canvas) {
        canvas.enableZ();
    }

    public final void drawColor(Canvas canvas, int i10, BlendMode blendMode) {
        canvas.drawColor(i10, blendMode);
    }

    public final void drawDoubleRoundRect(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public final void drawColor(Canvas canvas, long j10, BlendMode blendMode) {
        canvas.drawColor(j10, blendMode);
    }
}
