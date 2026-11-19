package androidx.compose.p013ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.RoundRectKt;
import androidx.compose.p013ui.graphics.AndroidPath;
import androidx.compose.p013ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.Outline;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.PathEffect;
import androidx.compose.p013ui.graphics.ShaderBrush;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.graphics.drawscope.Fill;
import androidx.compose.p013ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a>\u0010\f\u001a\u00020\u0001*\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, m13558d2 = {"draw", "", "Landroidx/compose/ui/graphics/Outline;", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "xStart", "", "yCenter", "dir", "", "setBrushAndDraw", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "size", "Landroidx/compose/ui/geometry/Size;", "Lkotlin/Function0;", "setBrushAndDraw-yzxVdVo", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/Brush;FJLkotlin/jvm/functions/Function0;)V", "setDrawStyle", "value", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nBulletSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulletSpan.android.kt\nandroidx/compose/ui/text/platform/style/BulletSpan_androidKt\n+ 2 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 3 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,206:1\n61#2:207\n61#2:222\n56#2:223\n61#2:224\n36#3,5:208\n36#3,5:214\n1#4:213\n48#5:219\n60#6:220\n22#7:221\n*S KotlinDebug\n*F\n+ 1 BulletSpan.android.kt\nandroidx/compose/ui/text/platform/style/BulletSpan_androidKt\n*L\n135#1:207\n163#1:222\n164#1:223\n165#1:224\n136#1:208,5\n144#1:214,5\n148#1:219\n148#1:220\n148#1:221\n*E\n"})
/* loaded from: classes2.dex */
public final class BulletSpan_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void draw(Outline outline, Canvas canvas, Paint paint, float f10, float f11, int i10) {
        if (outline instanceof Outline.Generic) {
            canvas.save();
            Rect rect = outline.getRect();
            canvas.translate(f10, f11 - ((rect.getBottom() - rect.getTop()) / 2.0f));
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
                Rect rect2 = rectangle.getRect();
                float bottom = f11 - ((rect2.getBottom() - rect2.getTop()) / 2.0f);
                Rect rect3 = rectangle.getRect();
                float right = f10 + (i10 * (rect3.getRight() - rect3.getLeft()));
                Rect rect4 = rectangle.getRect();
                canvas.drawRect(f10, bottom, right, f11 + ((rect4.getBottom() - rect4.getTop()) / 2.0f), paint);
                return;
            }
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (rounded.getRoundRect().m20785getTopLeftCornerRadiuskKHJgLs() >> 32));
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
    public static final void m23312setBrushAndDrawyzxVdVo(Paint paint, Brush brush, float f10, long j10, Function0<Unit> function0) {
        Integer numValueOf = null;
        if (brush == null) {
            if (!Float.isNaN(f10)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f10 * 255.0f));
            }
            function0.invoke();
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
            paint.setColor(ColorKt.m21030toArgb8_81llA(((SolidColor) brush).getValue()));
            function0.invoke();
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
            paint.setShader(((ShaderBrush) brush).mo20945createShaderuvyYCjk(j10));
            function0.invoke();
            paint.setShader(shader);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDrawStyle(Paint paint, DrawStyle drawStyle) {
        if (Intrinsics.areEqual(drawStyle, Fill.INSTANCE)) {
            paint.setStyle(Paint.Style.FILL);
            return;
        }
        if (drawStyle instanceof Stroke) {
            paint.setStyle(Paint.Style.STROKE);
            Stroke stroke = (Stroke) drawStyle;
            paint.setStrokeWidth(stroke.getWidth());
            paint.setStrokeMiter(stroke.getMiter());
            paint.setStrokeCap(DrawStyleSpan_androidKt.m23313toAndroidCapBeK7IIE(stroke.getCap()));
            paint.setStrokeJoin(DrawStyleSpan_androidKt.m23314toAndroidJoinWw9F2mQ(stroke.getJoin()));
            PathEffect pathEffect = stroke.getPathEffect();
            paint.setPathEffect(pathEffect != null ? AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
        }
    }
}
