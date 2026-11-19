package androidx.compose.p012ui.graphics;

import androidx.compose.p012ui.geometry.OffsetKt;
import androidx.compose.p012ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m13413d2 = {"lerp", "Landroidx/compose/ui/graphics/Shadow;", "start", "stop", "fraction", "", "ui-graphics_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ShadowKt {
    @Stable
    public static final Shadow lerp(Shadow shadow, Shadow shadow2, float f10) {
        return new Shadow(ColorKt.m21460lerpjxsXWHM(shadow.getColor(), shadow2.getColor(), f10), OffsetKt.m21191lerpWko1d7g(shadow.getOffset(), shadow2.getOffset(), f10), MathHelpersKt.lerp(shadow.getBlurRadius(), shadow2.getBlurRadius(), f10), null);
    }
}
