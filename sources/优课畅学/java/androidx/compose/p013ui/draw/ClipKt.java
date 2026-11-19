package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class ClipKt {
    @Stable
    public static final Modifier clip(Modifier modifier, Shape shape) {
        return GraphicsLayerModifierKt.m24436graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape, true, null, 0L, 0L, 0, 124927, null);
    }

    @Stable
    public static final Modifier clipToBounds(Modifier modifier) {
        return GraphicsLayerModifierKt.m24436graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 0, 126975, null);
    }
}
