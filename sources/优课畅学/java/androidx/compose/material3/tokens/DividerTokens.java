package androidx.compose.material3.tokens;

import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class DividerTokens {
    public static final int $stable = 0;
    public static final DividerTokens INSTANCE = new DividerTokens();
    private static final ColorSchemeKeyTokens Color = ColorSchemeKeyTokens.OutlineVariant;
    private static final float Thickness = C3156Dp.m26899constructorimpl((float) 1.0d);

    private DividerTokens() {
    }

    public final ColorSchemeKeyTokens getColor() {
        return Color;
    }

    /* renamed from: getThickness-D9Ej5fM, reason: not valid java name */
    public final float m23170getThicknessD9Ej5fM() {
        return Thickness;
    }
}
