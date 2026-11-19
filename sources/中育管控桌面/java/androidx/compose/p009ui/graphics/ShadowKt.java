package androidx.compose.p009ui.graphics;

import androidx.compose.p009ui.geometry.OffsetKt;
import androidx.compose.p009ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m7880d2 = {"lerp", "Landroidx/compose/ui/graphics/Shadow;", "start", "stop", "fraction", "", "ui-graphics_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class ShadowKt {
    @Stable
    public static final Shadow lerp(Shadow shadow, Shadow shadow2, float f6) {
        return new Shadow(ColorKt.m13950lerpjxsXWHM(shadow.getColor(), shadow2.getColor(), f6), OffsetKt.m13681lerpWko1d7g(shadow.getOffset(), shadow2.getOffset(), f6), MathHelpersKt.lerp(shadow.getBlurRadius(), shadow2.getBlurRadius(), f6), null);
    }
}
