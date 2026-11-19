package androidx.compose.material3;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class ExpressiveNavigationBarItemDefaults {
    public static final int $stable = 0;
    public static final ExpressiveNavigationBarItemDefaults INSTANCE = new ExpressiveNavigationBarItemDefaults();

    private ExpressiveNavigationBarItemDefaults() {
    }

    @Composable
    public final NavigationItemColors colors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1959617551, i10, -1, "androidx.compose.material3.ExpressiveNavigationBarItemDefaults.colors (ExpressiveNavigationBar.kt:272)");
        }
        NavigationItemColors defaultExpressiveNavigationBarItemColors$material3_release = getDefaultExpressiveNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultExpressiveNavigationBarItemColors$material3_release;
    }

    public final NavigationItemColors getDefaultExpressiveNavigationBarItemColors$material3_release(ColorScheme colorScheme) {
        NavigationItemColors navigationItemColorsM925x3d63aaa1 = colorScheme.m925x3d63aaa1();
        if (navigationItemColorsM925x3d63aaa1 != null) {
            return navigationItemColorsM925x3d63aaa1;
        }
        NavigationItemColors navigationItemColors = new NavigationItemColors(ColorSchemeKt.fromToken(colorScheme, ExpressiveNavigationBarKt.ActiveIconColor), ColorSchemeKt.fromToken(colorScheme, ExpressiveNavigationBarKt.ActiveLabelTextColor), ColorSchemeKt.fromToken(colorScheme, ExpressiveNavigationBarKt.ActiveIndicatorColor), ColorSchemeKt.fromToken(colorScheme, ExpressiveNavigationBarKt.InactiveIconColor), ColorSchemeKt.fromToken(colorScheme, ExpressiveNavigationBarKt.InactiveLabelTextColor), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ExpressiveNavigationBarKt.InactiveIconColor), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ExpressiveNavigationBarKt.InactiveLabelTextColor), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.m927x8a7577ad(navigationItemColors);
        return navigationItemColors;
    }
}
