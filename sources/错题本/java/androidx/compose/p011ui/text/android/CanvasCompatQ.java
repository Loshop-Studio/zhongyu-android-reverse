package androidx.compose.p011ui.text.android;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
@Metadata(m5109d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010\u0011J%\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010\u0012JM\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\"J]\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00152\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102¨\u00063"}, m5110d2 = {"Landroidx/compose/ui/text/android/CanvasCompatQ;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "Ld6/s;", "enableZ", "(Landroid/graphics/Canvas;)V", "disableZ", "", TypedValues.Custom.S_COLOR, "drawColor", "(Landroid/graphics/Canvas;J)V", "", "Landroid/graphics/BlendMode;", "mode", "(Landroid/graphics/Canvas;ILandroid/graphics/BlendMode;)V", "(Landroid/graphics/Canvas;JLandroid/graphics/BlendMode;)V", "Landroid/graphics/RectF;", "outer", "", "outerRx", "outerRy", "inner", "innerRx", "innerRy", "Landroid/graphics/Paint;", "paint", "drawDoubleRoundRect", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "", "outerRadii", "innerRadii", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V", "Landroid/graphics/text/MeasuredText;", "text", "start", "end", "contextStart", "contextEnd", "x", "y", "", "isRtl", "drawTextRun", "(Landroid/graphics/Canvas;Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/RenderNode;", "renderNode", "drawRenderNode", "(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final class CanvasCompatQ {

    @NotNull
    public static final CanvasCompatQ INSTANCE = new CanvasCompatQ();

    private CanvasCompatQ() {
    }

    public final void disableZ(@NotNull Canvas canvas) {
        canvas.disableZ();
    }

    public final void drawColor(@NotNull Canvas canvas, long color) {
        canvas.drawColor(color);
    }

    public final void drawDoubleRoundRect(@NotNull Canvas canvas, @NotNull RectF outer, float outerRx, float outerRy, @NotNull RectF inner, float innerRx, float innerRy, @NotNull Paint paint) {
        canvas.drawDoubleRoundRect(outer, outerRx, outerRy, inner, innerRx, innerRy, paint);
    }

    public final void drawRenderNode(@NotNull Canvas canvas, @NotNull RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public final void drawTextRun(@NotNull Canvas canvas, @NotNull MeasuredText text, int start, int end, int contextStart, int contextEnd, float x3, float y2, boolean isRtl, @NotNull Paint paint) {
        canvas.drawTextRun(text, start, end, contextStart, contextEnd, x3, y2, isRtl, paint);
    }

    public final void enableZ(@NotNull Canvas canvas) {
        canvas.enableZ();
    }

    public final void drawColor(@NotNull Canvas canvas, int color, @NotNull BlendMode mode) {
        canvas.drawColor(color, mode);
    }

    public final void drawDoubleRoundRect(@NotNull Canvas canvas, @NotNull RectF outer, @NotNull float[] outerRadii, @NotNull RectF inner, @NotNull float[] innerRadii, @NotNull Paint paint) {
        canvas.drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
    }

    public final void drawColor(@NotNull Canvas canvas, long color, @NotNull BlendMode mode) {
        canvas.drawColor(color, mode);
    }
}
