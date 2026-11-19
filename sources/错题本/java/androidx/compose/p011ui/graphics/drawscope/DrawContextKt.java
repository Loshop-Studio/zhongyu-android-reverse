package androidx.compose.p011ui.graphics.drawscope;

import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.DensityKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"DefaultDensity", "Landroidx/compose/ui/unit/Density;", "getDefaultDensity", "()Landroidx/compose/ui/unit/Density;", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class DrawContextKt {

    @NotNull
    private static final Density DefaultDensity = DensityKt.Density(1.0f, 1.0f);

    @NotNull
    public static final Density getDefaultDensity() {
        return DefaultDensity;
    }
}
