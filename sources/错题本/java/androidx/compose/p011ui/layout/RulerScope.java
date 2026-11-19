package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@MeasureScopeMarker
@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\t\u001a\u00020\u0005*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/layout/RulerScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/layout/Ruler;", "", "value", "Ld6/s;", "provides", "(Landroidx/compose/ui/layout/Ruler;F)V", "Landroidx/compose/ui/layout/VerticalRuler;", "providesRelative", "(Landroidx/compose/ui/layout/VerticalRuler;F)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface RulerScope extends Density {
    @NotNull
    LayoutCoordinates getCoordinates();

    void provides(@NotNull Ruler ruler, float f);

    void providesRelative(@NotNull VerticalRuler verticalRuler, float f);
}
