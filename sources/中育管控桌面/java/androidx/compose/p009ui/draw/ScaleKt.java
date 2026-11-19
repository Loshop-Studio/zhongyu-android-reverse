package androidx.compose.p009ui.draw;

import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0005"}, m7880d2 = {"scale", "Landroidx/compose/ui/Modifier;", "", "scaleX", "scaleY", "ui_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class ScaleKt {
    @Stable
    public static final Modifier scale(Modifier modifier, float f6, float f7) {
        return (f6 == 1.0f && f7 == 1.0f) ? modifier : GraphicsLayerModifierKt.m14059graphicsLayerAp8cVGQ$default(modifier, f6, f7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131068, null);
    }

    @Stable
    public static final Modifier scale(Modifier modifier, float f6) {
        return scale(modifier, f6, f6);
    }
}
