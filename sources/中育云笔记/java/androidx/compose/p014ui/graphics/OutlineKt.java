package androidx.compose.p014ui.graphics;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p014ui.geometry.CornerRadius;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.RoundRect;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.Outline;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.graphics.drawscope.Fill;
import com.google.android.material.color.utilities.Contrast;
import kotlin.NoWhenBranchMatchedException;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public final class OutlineKt {
    public static final void addOutline(Path path, Outline outline) {
        if (outline instanceof Outline.Rectangle) {
            Path.addRect$default(path, ((Outline.Rectangle) outline).getRect(), null, 2, null);
        } else if (outline instanceof Outline.Rounded) {
            Path.addRoundRect$default(path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
        } else {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            Path.m31148addPathUv8p0NA$default(path, ((Outline.Generic) outline).getPath(), 0L, 2, null);
        }
    }

    public static final void drawOutline(Canvas canvas, Outline outline, Paint paint) {
        if (outline instanceof Outline.Rectangle) {
            canvas.drawRect(((Outline.Rectangle) outline).getRect(), paint);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            canvas.drawPath(((Outline.Generic) outline).getPath(), paint);
        } else {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
            if (roundRectPath$ui_graphics_release != null) {
                canvas.drawPath(roundRectPath$ui_graphics_release, paint);
            } else {
                canvas.drawRoundRect(rounded.getRoundRect().getLeft(), rounded.getRoundRect().getTop(), rounded.getRoundRect().getRight(), rounded.getRoundRect().getBottom(), Float.intBitsToFloat((int) (rounded.getRoundRect().m30685getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m30685getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)), paint);
            }
        }
    }

    /* renamed from: drawOutline-hn5TExg, reason: not valid java name */
    public static final void m31134drawOutlinehn5TExg(DrawScope drawScope, Outline outline, Brush brush, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo31341drawRectAsUm42w(brush, topLeft(rect), size(rect), f10, drawStyle, colorFilter, i10);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            drawScope.mo31337drawPathGBMwjPU(((Outline.Generic) outline).getPath(), brush, f10, drawStyle, colorFilter, i10);
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
        if (roundRectPath$ui_graphics_release != null) {
            drawScope.mo31337drawPathGBMwjPU(roundRectPath$ui_graphics_release, brush, f10, drawStyle, colorFilter, i10);
            return;
        }
        RoundRect roundRect = rounded.getRoundRect();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.m30685getBottomLeftCornerRadiuskKHJgLs() >> 32));
        drawScope.mo31343drawRoundRectZuiqVtQ(brush, topLeft(roundRect), size(roundRect), CornerRadius.m30591constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), f10, drawStyle, colorFilter, i10);
    }

    /* renamed from: drawOutline-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m31135drawOutlinehn5TExg$default(DrawScope drawScope, Outline outline, Brush brush, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i11 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i11 & 32) != 0) {
            i10 = DrawScope.Companion.m31431getDefaultBlendMode0nO6VwU();
        }
        m31134drawOutlinehn5TExg(drawScope, outline, brush, f11, drawStyle2, colorFilter2, i10);
    }

    /* renamed from: drawOutline-wDX37Ww, reason: not valid java name */
    public static final void m31136drawOutlinewDX37Ww(DrawScope drawScope, Outline outline, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo31342drawRectnJ9OG0(j10, topLeft(rect), size(rect), f10, drawStyle, colorFilter, i10);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            drawScope.mo31338drawPathLG529CI(((Outline.Generic) outline).getPath(), j10, f10, drawStyle, colorFilter, i10);
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
        if (roundRectPath$ui_graphics_release != null) {
            drawScope.mo31338drawPathLG529CI(roundRectPath$ui_graphics_release, j10, f10, drawStyle, colorFilter, i10);
            return;
        }
        RoundRect roundRect = rounded.getRoundRect();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.m30685getBottomLeftCornerRadiuskKHJgLs() >> 32));
        drawScope.mo31344drawRoundRectuAw5IA(j10, topLeft(roundRect), size(roundRect), CornerRadius.m30591constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), drawStyle, f10, colorFilter, i10);
    }

    /* renamed from: drawOutline-wDX37Ww$default, reason: not valid java name */
    public static /* synthetic */ void m31137drawOutlinewDX37Ww$default(DrawScope drawScope, Outline outline, long j10, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i11 & 16) != 0) {
            colorFilter = null;
        }
        m31136drawOutlinewDX37Ww(drawScope, outline, j10, f11, drawStyle2, colorFilter, (i11 & 32) != 0 ? DrawScope.Companion.m31431getDefaultBlendMode0nO6VwU() : i10);
    }

    private static final void drawOutlineHelper(DrawScope drawScope, Outline outline, InterfaceC9544p interfaceC9544p, InterfaceC9544p interfaceC9544p2, InterfaceC9544p interfaceC9544p3) {
        if (outline instanceof Outline.Rectangle) {
            interfaceC9544p.invoke(drawScope, ((Outline.Rectangle) outline).getRect());
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC9544p3.invoke(drawScope, ((Outline.Generic) outline).getPath());
        } else {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
            if (roundRectPath$ui_graphics_release != null) {
                interfaceC9544p3.invoke(drawScope, roundRectPath$ui_graphics_release);
            } else {
                interfaceC9544p2.invoke(drawScope, rounded.getRoundRect());
            }
        }
    }

    private static final boolean hasSameCornerRadius(RoundRect roundRect) {
        return ((Float.intBitsToFloat((int) (roundRect.m30685getBottomLeftCornerRadiuskKHJgLs() >> 32)) > Float.intBitsToFloat((int) (roundRect.m30686getBottomRightCornerRadiuskKHJgLs() >> 32)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m30685getBottomLeftCornerRadiuskKHJgLs() >> 32)) == Float.intBitsToFloat((int) (roundRect.m30686getBottomRightCornerRadiuskKHJgLs() >> 32)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m30686getBottomRightCornerRadiuskKHJgLs() >> 32)) > Float.intBitsToFloat((int) (roundRect.m30688getTopRightCornerRadiuskKHJgLs() >> 32)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m30686getBottomRightCornerRadiuskKHJgLs() >> 32)) == Float.intBitsToFloat((int) (roundRect.m30688getTopRightCornerRadiuskKHJgLs() >> 32)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m30688getTopRightCornerRadiuskKHJgLs() >> 32)) > Float.intBitsToFloat((int) (roundRect.m30687getTopLeftCornerRadiuskKHJgLs() >> 32)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m30688getTopRightCornerRadiuskKHJgLs() >> 32)) == Float.intBitsToFloat((int) (roundRect.m30687getTopLeftCornerRadiuskKHJgLs() >> 32)) ? 0 : -1)) == 0) && ((Float.intBitsToFloat((int) (roundRect.m30685getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)) > Float.intBitsToFloat((int) (roundRect.m30686getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m30685getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)) == Float.intBitsToFloat((int) (roundRect.m30686getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m30686getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) > Float.intBitsToFloat((int) (roundRect.m30688getTopRightCornerRadiuskKHJgLs() & 4294967295L)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m30686getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) == Float.intBitsToFloat((int) (roundRect.m30688getTopRightCornerRadiuskKHJgLs() & 4294967295L)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m30688getTopRightCornerRadiuskKHJgLs() & 4294967295L)) > Float.intBitsToFloat((int) (roundRect.m30687getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m30688getTopRightCornerRadiuskKHJgLs() & 4294967295L)) == Float.intBitsToFloat((int) (roundRect.m30687getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) ? 0 : -1)) == 0);
    }

    private static final long size(RoundRect roundRect) {
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        return Size.m30697constructorimpl((Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L));
    }

    private static final long topLeft(Rect rect) {
        float left = rect.getLeft();
        float top2 = rect.getTop();
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top2) & 4294967295L));
    }

    private static final long size(Rect rect) {
        float right = rect.getRight() - rect.getLeft();
        float bottom = rect.getBottom() - rect.getTop();
        return Size.m30697constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    private static final long topLeft(RoundRect roundRect) {
        float left = roundRect.getLeft();
        float top2 = roundRect.getTop();
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top2) & 4294967295L));
    }
}
