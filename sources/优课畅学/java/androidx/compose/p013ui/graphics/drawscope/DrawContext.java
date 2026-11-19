package androidx.compose.p013ui.graphics.drawscope;

import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
public interface DrawContext {
    default Canvas getCanvas() {
        return EmptyCanvas.INSTANCE;
    }

    default Density getDensity() {
        return DrawContextKt.getDefaultDensity();
    }

    default GraphicsLayer getGraphicsLayer() {
        return null;
    }

    default LayoutDirection getLayoutDirection() {
        return LayoutDirection.Ltr;
    }

    /* renamed from: getSize-NH-jbRc */
    long mo24748getSizeNHjbRc();

    DrawTransform getTransform();

    default void setCanvas(Canvas canvas) {
    }

    default void setDensity(Density density) {
    }

    default void setGraphicsLayer(GraphicsLayer graphicsLayer) {
    }

    default void setLayoutDirection(LayoutDirection layoutDirection) {
    }

    /* renamed from: setSize-uvyYCjk */
    void mo24749setSizeuvyYCjk(long j10);
}
