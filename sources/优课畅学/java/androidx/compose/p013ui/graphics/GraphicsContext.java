package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.graphics.layer.GraphicsLayer;

/* loaded from: classes2.dex */
public interface GraphicsContext {
    GraphicsLayer createGraphicsLayer();

    void releaseGraphicsLayer(GraphicsLayer graphicsLayer);
}
