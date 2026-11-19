package androidx.compose.p006ui.graphics;

import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m5175d2 = {"lerp", "Landroidx/compose/ui/graphics/Shadow;", "start", "stop", "fraction", "", "ui-graphics_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ShadowKt {
    @Stable
    public static final Shadow lerp(Shadow start, Shadow stop, float f4) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new Shadow(ColorKt.m9229lerpjxsXWHM(start.getColor(), stop.getColor(), f4), OffsetKt.m8968lerpWko1d7g(start.getOffset(), stop.getOffset(), f4), MathHelpersKt.lerp(start.getBlurRadius(), stop.getBlurRadius(), f4), null);
    }
}
