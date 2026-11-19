package androidx.compose.p014ui.graphics.drawscope;

import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;

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
    long mo31350getSizeNHjbRc();

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
    void mo31351setSizeuvyYCjk(long j10);
}
