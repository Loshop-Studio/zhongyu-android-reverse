package androidx.compose.animation;

import androidx.compose.p014ui.graphics.drawscope.DrawScope;

/* loaded from: classes.dex */
public interface LayerRenderer {
    void drawInOverlay(DrawScope drawScope);

    SharedElementInternalState getParentState();

    float getZIndex();
}
