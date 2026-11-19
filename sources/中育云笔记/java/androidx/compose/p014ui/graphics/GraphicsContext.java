package androidx.compose.p014ui.graphics;

import androidx.compose.p014ui.graphics.layer.GraphicsLayer;

/* loaded from: classes2.dex */
public interface GraphicsContext {
    GraphicsLayer createGraphicsLayer();

    void releaseGraphicsLayer(GraphicsLayer graphicsLayer);
}
