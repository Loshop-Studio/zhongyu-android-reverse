package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.runtime.RememberObserver;

/* loaded from: classes2.dex */
final class GraphicsContextObserver implements RememberObserver {
    private final GraphicsContext graphicsContext;
    private final GraphicsLayer graphicsLayer;

    public GraphicsContextObserver(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
        this.graphicsLayer = graphicsContext.createGraphicsLayer();
    }

    public final GraphicsLayer getGraphicsLayer() {
        return this.graphicsLayer;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        this.graphicsContext.releaseGraphicsLayer(this.graphicsLayer);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.graphicsContext.releaseGraphicsLayer(this.graphicsLayer);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
