package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class ScaleKt {
    @Stable
    public static final Modifier scale(Modifier modifier, float f10, float f11) {
        return (f10 == 1.0f && f11 == 1.0f) ? modifier : GraphicsLayerModifierKt.m24436graphicsLayerAp8cVGQ$default(modifier, f10, f11, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131068, null);
    }

    @Stable
    public static final Modifier scale(Modifier modifier, float f10) {
        return scale(modifier, f10, f10);
    }
}
