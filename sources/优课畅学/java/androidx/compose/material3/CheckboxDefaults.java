package androidx.compose.material3;

import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    @Composable
    public final CheckboxColors colors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-9530498, i10, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:193)");
        }
        CheckboxColors defaultCheckboxColors$material3_release = getDefaultCheckboxColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultCheckboxColors$material3_release;
    }

    @Composable
    /* renamed from: colors-5tl4gsc, reason: not valid java name */
    public final CheckboxColors m21827colors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i10, int i11) {
        long jM24312getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j10;
        long jM24312getUnspecified0d7_KjU2 = (i11 & 2) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j11;
        long jM24312getUnspecified0d7_KjU3 = (i11 & 4) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j12;
        long jM24312getUnspecified0d7_KjU4 = (i11 & 8) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j13;
        long jM24312getUnspecified0d7_KjU5 = (i11 & 16) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j14;
        long jM24312getUnspecified0d7_KjU6 = (i11 & 32) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j15;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-89536160, i10, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:219)");
        }
        CheckboxColors defaultCheckboxColors$material3_release = getDefaultCheckboxColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        Color.Companion companion = Color.Companion;
        CheckboxColors checkboxColorsM21814copy2qZNXz8 = defaultCheckboxColors$material3_release.m21814copy2qZNXz8(jM24312getUnspecified0d7_KjU3, companion.m24311getTransparent0d7_KjU(), jM24312getUnspecified0d7_KjU, companion.m24311getTransparent0d7_KjU(), jM24312getUnspecified0d7_KjU4, companion.m24311getTransparent0d7_KjU(), jM24312getUnspecified0d7_KjU6, jM24312getUnspecified0d7_KjU, jM24312getUnspecified0d7_KjU2, jM24312getUnspecified0d7_KjU4, jM24312getUnspecified0d7_KjU5, jM24312getUnspecified0d7_KjU6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return checkboxColorsM21814copy2qZNXz8;
    }

    public final CheckboxColors getDefaultCheckboxColors$material3_release(ColorScheme colorScheme) {
        CheckboxColors defaultCheckboxColorsCached$material3_release = colorScheme.getDefaultCheckboxColorsCached$material3_release();
        if (defaultCheckboxColorsCached$material3_release != null) {
            return defaultCheckboxColorsCached$material3_release;
        }
        CheckboxTokens checkboxTokens = CheckboxTokens.INSTANCE;
        long jFromToken = ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedIconColor());
        Color.Companion companion = Color.Companion;
        CheckboxColors checkboxColors = new CheckboxColors(jFromToken, companion.m24311getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedContainerColor()), companion.m24311getTransparent0d7_KjU(), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), companion.m24311getTransparent0d7_KjU(), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getUnselectedOutlineColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getUnselectedDisabledOutlineColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultCheckboxColorsCached$material3_release(checkboxColors);
        return checkboxColors;
    }
}
