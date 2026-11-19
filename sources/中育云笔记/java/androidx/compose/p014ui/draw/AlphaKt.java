package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class AlphaKt {
    @Stable
    public static final Modifier alpha(Modifier modifier, float f10) {
        return f10 == 1.0f ? modifier : GraphicsLayerModifierKt.m31038graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 0, 126971, null);
    }
}
