package androidx.compose.p006ui.draw;

import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002H\u0007¨\u0006\u0003"}, m5175d2 = {"alpha", "Landroidx/compose/ui/Modifier;", "", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AlphaKt {
    @Stable
    public static final Modifier alpha(Modifier modifier, float f4) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return !((f4 > 1.0f ? 1 : (f4 == 1.0f ? 0 : -1)) == 0) ? GraphicsLayerModifierKt.m9324graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, f4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 0, 126971, null) : modifier;
    }
}
