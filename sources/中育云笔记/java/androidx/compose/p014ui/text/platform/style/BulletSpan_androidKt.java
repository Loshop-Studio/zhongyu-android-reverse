package androidx.compose.p014ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.RoundRectKt;
import androidx.compose.p014ui.graphics.AndroidPath;
import androidx.compose.p014ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.p014ui.graphics.AndroidPath_androidKt;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.Outline;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.PathEffect;
import androidx.compose.p014ui.graphics.ShaderBrush;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.graphics.drawscope.Fill;
import androidx.compose.p014ui.graphics.drawscope.Stroke;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class BulletSpan_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void draw(Outline outline, Canvas canvas, Paint paint, float f10, float f11, int i10) {
        if (outline instanceof Outline.Generic) {
            canvas.save();
            Rect bounds = outline.getBounds();
            canvas.translate(f10, f11 - ((bounds.getBottom() - bounds.getTop()) / 2.0f));
            Path path = ((Outline.Generic) outline).getPath();
            if (!(path instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            canvas.drawPath(((AndroidPath) path).getInternalPath(), paint);
            canvas.restore();
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (outline instanceof Outline.Rectangle) {
                Outline.Rectangle rectangle = (Outline.Rectangle) outline;
                Rect rect = rectangle.getRect();
                float bottom = f11 - ((rect.getBottom() - rect.getTop()) / 2.0f);
                Rect rect2 = rectangle.getRect();
                float right = f10 + (i10 * (rect2.getRight() - rect2.getLeft()));
                Rect rect3 = rectangle.getRect();
                canvas.drawRect(f10, bottom, right, f11 + ((rect3.getBottom() - rect3.getTop()) / 2.0f), paint);
                return;
            }
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (rounded.getRoundRect().m30687getTopLeftCornerRadiuskKHJgLs() >> 32));
            canvas.drawRoundRect(f10, f11 - (rounded.getRoundRect().getHeight() / 2.0f), (i10 * rounded.getRoundRect().getWidth()) + f10, (rounded.getRoundRect().getHeight() / 2.0f) + f11, fIntBitsToFloat, fIntBitsToFloat, paint);
            return;
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.addRoundRect$default(Path, rounded.getRoundRect(), null, 2, null);
        canvas.save();
        canvas.translate(f10, f11 - (rounded.getRoundRect().getHeight() / 2.0f));
        if (!(Path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) Path).getInternalPath(), paint);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBrushAndDraw-yzxVdVo, reason: not valid java name */
    public static final void m33251setBrushAndDrawyzxVdVo(Paint paint, Brush brush, float f10, long j10, InterfaceC9529a interfaceC9529a) {
        Integer numValueOf = null;
        if (brush == null) {
            if (!Float.isNaN(f10)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f10 * 255.0f));
            }
            interfaceC9529a.invoke();
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (brush instanceof SolidColor) {
            int color = paint.getColor();
            if (!Float.isNaN(f10)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f10 * 255.0f));
            }
            paint.setColor(ColorKt.m30932toArgb8_81llA(((SolidColor) brush).m31213getValue0d7_KjU()));
            interfaceC9529a.invoke();
            paint.setColor(color);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (brush instanceof ShaderBrush) {
            Shader shader = paint.getShader();
            if (!Float.isNaN(f10)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f10 * 255.0f));
            }
            paint.setShader(((ShaderBrush) brush).mo30847createShaderuvyYCjk(j10));
            interfaceC9529a.invoke();
            paint.setShader(shader);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDrawStyle(Paint paint, DrawStyle drawStyle) {
        if (AbstractC9979u.m20289b(drawStyle, Fill.INSTANCE)) {
            paint.setStyle(Paint.Style.FILL);
            return;
        }
        if (drawStyle instanceof Stroke) {
            paint.setStyle(Paint.Style.STROKE);
            Stroke stroke = (Stroke) drawStyle;
            paint.setStrokeWidth(stroke.getWidth());
            paint.setStrokeMiter(stroke.getMiter());
            paint.setStrokeCap(DrawStyleSpan_androidKt.m33253toAndroidCapBeK7IIE(stroke.m31498getCapKaPHkGw()));
            paint.setStrokeJoin(DrawStyleSpan_androidKt.m33254toAndroidJoinWw9F2mQ(stroke.m31499getJoinLxFBmk8()));
            PathEffect pathEffect = stroke.getPathEffect();
            paint.setPathEffect(pathEffect != null ? AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
        }
    }
}
