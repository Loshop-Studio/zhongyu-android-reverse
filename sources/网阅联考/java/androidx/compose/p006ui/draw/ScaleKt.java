package androidx.compose.p006ui.draw;

import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0005"}, m5175d2 = {"scale", "Landroidx/compose/ui/Modifier;", "", "scaleX", "scaleY", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ScaleKt {
    @Stable
    public static final Modifier scale(Modifier modifier, float f4, float f5) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (f4 == 1.0f) {
            if (f5 == 1.0f) {
                return modifier;
            }
        }
        return GraphicsLayerModifierKt.m9324graphicsLayerAp8cVGQ$default(modifier, f4, f5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131068, null);
    }

    @Stable
    public static final Modifier scale(Modifier modifier, float f4) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return scale(modifier, f4, f4);
    }
}
