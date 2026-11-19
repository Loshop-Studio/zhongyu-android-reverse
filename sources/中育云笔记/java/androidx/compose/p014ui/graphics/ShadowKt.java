package androidx.compose.p014ui.graphics;

import androidx.compose.p014ui.geometry.OffsetKt;
import androidx.compose.p014ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class ShadowKt {
    @Stable
    public static final Shadow lerp(Shadow shadow, Shadow shadow2, float f10) {
        return new Shadow(ColorKt.m30929lerpjxsXWHM(shadow.m31203getColor0d7_KjU(), shadow2.m31203getColor0d7_KjU(), f10), OffsetKt.m30660lerpWko1d7g(shadow.m31204getOffsetF1C5BW0(), shadow2.m31204getOffsetF1C5BW0(), f10), MathHelpersKt.lerp(shadow.getBlurRadius(), shadow2.getBlurRadius(), f10), null);
    }
}
