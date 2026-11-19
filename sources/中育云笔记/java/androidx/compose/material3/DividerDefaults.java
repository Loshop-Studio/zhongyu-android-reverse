package androidx.compose.material3;

import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class DividerDefaults {
    public static final int $stable = 0;
    public static final DividerDefaults INSTANCE = new DividerDefaults();
    private static final float Thickness = DividerTokens.INSTANCE.m29772getThicknessD9Ej5fM();

    private DividerDefaults() {
    }

    @Composable
    public final long getColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(77461041, i10, -1, "androidx.compose.material3.DividerDefaults.<get-color> (Divider.kt:118)");
        }
        long value = ColorSchemeKt.getValue(DividerTokens.INSTANCE.getColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getThickness-D9Ej5fM, reason: not valid java name */
    public final float m28661getThicknessD9Ej5fM() {
        return Thickness;
    }
}
