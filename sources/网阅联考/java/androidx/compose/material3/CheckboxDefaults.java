package androidx.compose.material3;

import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JQ\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, m5175d2 = {"Landroidx/compose/material3/CheckboxDefaults;", "", "()V", "colors", "Landroidx/compose/material3/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledCheckedColor", "disabledUncheckedColor", "disabledIndeterminateColor", "colors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CheckboxColors;", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    @Composable
    /* renamed from: colors-5tl4gsc, reason: not valid java name */
    public final CheckboxColors m7841colors5tl4gsc(long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(-89536160);
        long jFromToken = (i5 & 1) != 0 ? ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), CheckboxTokens.INSTANCE.getSelectedContainerColor()) : j4;
        long jFromToken2 = (i5 & 2) != 0 ? ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), CheckboxTokens.INSTANCE.getUnselectedOutlineColor()) : j5;
        long jFromToken3 = (i5 & 4) != 0 ? ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), CheckboxTokens.INSTANCE.getSelectedIconColor()) : j6;
        long jM9177copywmQWz5c$default = (i5 & 8) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long jM9177copywmQWz5c$default2 = (i5 & 16) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), CheckboxTokens.INSTANCE.getUnselectedDisabledOutlineColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long j10 = (i5 & 32) != 0 ? jM9177copywmQWz5c$default : j9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-89536160, i4, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:195)");
        }
        CheckboxColors checkboxColors = new CheckboxColors(jFromToken3, Color.m9177copywmQWz5c$default(jFromToken3, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jFromToken, Color.m9177copywmQWz5c$default(jFromToken, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jM9177copywmQWz5c$default, Color.m9177copywmQWz5c$default(jM9177copywmQWz5c$default2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j10, jFromToken, jFromToken2, jM9177copywmQWz5c$default, j10, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return checkboxColors;
    }
}
