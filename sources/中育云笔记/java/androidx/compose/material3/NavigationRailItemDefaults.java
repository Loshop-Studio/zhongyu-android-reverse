package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class NavigationRailItemDefaults {
    public static final int $stable = 0;
    public static final NavigationRailItemDefaults INSTANCE = new NavigationRailItemDefaults();

    private NavigationRailItemDefaults() {
    }

    @Composable
    public final NavigationRailItemColors colors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2014332261, i10, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:308)");
        }
        NavigationRailItemColors defaultNavigationRailItemColors$material3_release = getDefaultNavigationRailItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultNavigationRailItemColors$material3_release;
    }

    @Composable
    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationRailItemColors m28935colors69fazGs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, Composer composer, int i10, int i11) {
        long j17;
        long jM30877copywmQWz5c$default;
        long j18;
        long jM30877copywmQWz5c$default2;
        long j19;
        long value = (i11 & 1) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIconColor(), composer, 6) : j10;
        long value2 = (i11 & 2) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveLabelTextColor(), composer, 6) : j11;
        long value3 = (i11 & 4) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j12;
        long value4 = (i11 & 8) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveIconColor(), composer, 6) : j13;
        long value5 = (i11 & 16) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6) : j14;
        if ((i11 & 32) != 0) {
            long j20 = value4;
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(j20, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j17 = j20;
        } else {
            j17 = value4;
            jM30877copywmQWz5c$default = j15;
        }
        if ((i11 & 64) != 0) {
            long j21 = value5;
            jM30877copywmQWz5c$default2 = Color.m30877copywmQWz5c$default(j21, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j18 = j21;
        } else {
            j18 = value5;
            jM30877copywmQWz5c$default2 = j16;
        }
        if (ComposerKt.isTraceInProgress()) {
            j19 = value;
            ComposerKt.traceEventStart(-2104358508, i10, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:333)");
        } else {
            j19 = value;
        }
        NavigationRailItemColors navigationRailItemColorsM28924copy4JmcsL4 = getDefaultNavigationRailItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m28924copy4JmcsL4(j19, value2, value3, j17, j18, jM30877copywmQWz5c$default, jM30877copywmQWz5c$default2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationRailItemColorsM28924copy4JmcsL4;
    }

    @Composable
    @InterfaceC10770a
    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ NavigationRailItemColors m28936colorszjMxDiM(long j10, long j11, long j12, long j13, long j14, Composer composer, int i10, int i11) {
        long value = (i11 & 1) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIconColor(), composer, 6) : j10;
        long value2 = (i11 & 2) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveLabelTextColor(), composer, 6) : j11;
        long value3 = (i11 & 4) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j12;
        long value4 = (i11 & 8) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveIconColor(), composer, 6) : j13;
        long value5 = (i11 & 16) != 0 ? ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6) : j14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1621601574, i10, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:376)");
        }
        NavigationRailItemColors navigationRailItemColors = new NavigationRailItemColors(value, value2, value3, value4, value5, Color.m30877copywmQWz5c$default(value4, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(value5, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationRailItemColors;
    }

    public final NavigationRailItemColors getDefaultNavigationRailItemColors$material3_release(ColorScheme colorScheme) {
        NavigationRailItemColors defaultNavigationRailItemColorsCached$material3_release = colorScheme.getDefaultNavigationRailItemColorsCached$material3_release();
        if (defaultNavigationRailItemColorsCached$material3_release != null) {
            return defaultNavigationRailItemColorsCached$material3_release;
        }
        NavigationRailTokens navigationRailTokens = NavigationRailTokens.INSTANCE;
        NavigationRailItemColors navigationRailItemColors = new NavigationRailItemColors(ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getActiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getActiveLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getInactiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getInactiveLabelTextColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultNavigationRailItemColorsCached$material3_release(navigationRailItemColors);
        return navigationRailItemColors;
    }
}
