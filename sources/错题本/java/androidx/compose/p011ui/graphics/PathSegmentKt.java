package androidx.compose.p011ui.graphics;

import androidx.compose.p011ui.graphics.PathSegment;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m5110d2 = {"CloseSegment", "Landroidx/compose/ui/graphics/PathSegment;", "getCloseSegment", "()Landroidx/compose/ui/graphics/PathSegment;", "DoneSegment", "getDoneSegment", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PathSegmentKt {

    @NotNull
    private static final PathSegment DoneSegment = new PathSegment(PathSegment.Type.Done, new float[0], 0.0f);

    @NotNull
    private static final PathSegment CloseSegment = new PathSegment(PathSegment.Type.Close, new float[0], 0.0f);

    @NotNull
    public static final PathSegment getCloseSegment() {
        return CloseSegment;
    }

    @NotNull
    public static final PathSegment getDoneSegment() {
        return DoneSegment;
    }
}
