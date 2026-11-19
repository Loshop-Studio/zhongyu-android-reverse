package androidx.compose.p014ui.graphics.layer;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.RoundRect;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.Outline;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;

/* loaded from: classes2.dex */
public final class GraphicsLayerKt {
    public static final float DefaultCameraDistance = 8.0f;

    public static final void drawLayer(DrawScope drawScope, GraphicsLayer graphicsLayer) {
        graphicsLayer.draw$ui_graphics_release(drawScope.getDrawContext().getCanvas(), drawScope.getDrawContext().getGraphicsLayer());
    }

    public static final void setOutline(GraphicsLayer graphicsLayer, Outline outline) {
        if (outline instanceof Outline.Rectangle) {
            Outline.Rectangle rectangle = (Outline.Rectangle) outline;
            float left = rectangle.getRect().getLeft();
            float top2 = rectangle.getRect().getTop();
            long jM30629constructorimpl = Offset.m30629constructorimpl((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top2) & 4294967295L));
            Rect rect = rectangle.getRect();
            float right = rect.getRight() - rect.getLeft();
            Rect rect2 = rectangle.getRect();
            float bottom = rect2.getBottom() - rect2.getTop();
            graphicsLayer.m31528setRectOutlinetz77jQw(jM30629constructorimpl, Size.m30697constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32)));
            return;
        }
        if (outline instanceof Outline.Generic) {
            graphicsLayer.setPathOutline(((Outline.Generic) outline).getPath());
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            if (rounded.getRoundRectPath$ui_graphics_release() != null) {
                graphicsLayer.setPathOutline(rounded.getRoundRectPath$ui_graphics_release());
                return;
            }
            RoundRect roundRect = rounded.getRoundRect();
            float left2 = roundRect.getLeft();
            float top3 = roundRect.getTop();
            long jM30629constructorimpl2 = Offset.m30629constructorimpl((Float.floatToRawIntBits(left2) << 32) | (Float.floatToRawIntBits(top3) & 4294967295L));
            float width = roundRect.getWidth();
            float height = roundRect.getHeight();
            graphicsLayer.m31529setRoundRectOutlineTNW_H78(jM30629constructorimpl2, Size.m30697constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), Float.intBitsToFloat((int) (roundRect.m30685getBottomLeftCornerRadiuskKHJgLs() >> 32)));
        }
    }
}
