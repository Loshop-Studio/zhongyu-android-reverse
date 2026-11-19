package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0005"}, m13558d2 = {"scale", "Landroidx/compose/ui/Modifier;", "", "scaleX", "scaleY", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class ScaleKt {
    @Stable
    public static final Modifier scale(Modifier modifier, float f10, float f11) {
        return (f10 == 1.0f && f11 == 1.0f) ? modifier : GraphicsLayerModifierKt.m21136graphicsLayerAp8cVGQ$default(modifier, f10, f11, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131068, null);
    }

    @Stable
    public static final Modifier scale(Modifier modifier, float f10) {
        return scale(modifier, f10, f10);
    }
}
