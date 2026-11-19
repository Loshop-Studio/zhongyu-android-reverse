package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.geometry.OffsetKt;
import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class ShadowKt {
    @Stable
    public static final Shadow lerp(Shadow shadow, Shadow shadow2, float f10) {
        return new Shadow(ColorKt.m24327lerpjxsXWHM(shadow.m24601getColor0d7_KjU(), shadow2.m24601getColor0d7_KjU(), f10), OffsetKt.m24058lerpWko1d7g(shadow.m24602getOffsetF1C5BW0(), shadow2.m24602getOffsetF1C5BW0(), f10), MathHelpersKt.lerp(shadow.getBlurRadius(), shadow2.getBlurRadius(), f10), null);
    }
}
