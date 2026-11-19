package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class NavigationBarItemDefaults {
    public static final int $stable = 0;
    public static final NavigationBarItemDefaults INSTANCE = new NavigationBarItemDefaults();

    private NavigationBarItemDefaults() {
    }

    @Composable
    public final NavigationBarItemColors colors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1018883954, i10, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:310)");
        }
        NavigationBarItemColors defaultNavigationBarItemColors$material3_release = getDefaultNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultNavigationBarItemColors$material3_release;
    }

    @Composable
    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationBarItemColors m28870colors69fazGs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, Composer composer, int i10, int i11) {
        long j17;
        long jM30914getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM30914getUnspecified0d7_KjU2 = (i11 & 2) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j11;
        long jM30914getUnspecified0d7_KjU3 = (i11 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        long jM30914getUnspecified0d7_KjU4 = (i11 & 8) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j13;
        long jM30914getUnspecified0d7_KjU5 = (i11 & 16) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j14;
        long jM30914getUnspecified0d7_KjU6 = (i11 & 32) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j15;
        long jM30914getUnspecified0d7_KjU7 = (i11 & 64) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j16;
        if (ComposerKt.isTraceInProgress()) {
            j17 = jM30914getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(-1618564327, i10, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:335)");
        } else {
            j17 = jM30914getUnspecified0d7_KjU;
        }
        NavigationBarItemColors navigationBarItemColorsM28859copy4JmcsL4 = getDefaultNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m28859copy4JmcsL4(j17, jM30914getUnspecified0d7_KjU2, jM30914getUnspecified0d7_KjU3, jM30914getUnspecified0d7_KjU4, jM30914getUnspecified0d7_KjU5, jM30914getUnspecified0d7_KjU6, jM30914getUnspecified0d7_KjU7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBarItemColorsM28859copy4JmcsL4;
    }

    @Composable
    @InterfaceC10770a
    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ NavigationBarItemColors m28871colorszjMxDiM(long j10, long j11, long j12, long j13, long j14, Composer composer, int i10, int i11) {
        long value = (i11 & 1) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveIconColor(), composer, 6) : j10;
        long value2 = (i11 & 2) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveLabelTextColor(), composer, 6) : j11;
        long value3 = (i11 & 4) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j12;
        long value4 = (i11 & 8) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getInactiveIconColor(), composer, 6) : j13;
        long value5 = (i11 & 16) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6) : j14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-213647161, i10, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:377)");
        }
        NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(value, value2, value3, value4, value5, Color.m30877copywmQWz5c$default(value4, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(value5, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBarItemColors;
    }

    public final NavigationBarItemColors getDefaultNavigationBarItemColors$material3_release(ColorScheme colorScheme) {
        NavigationBarItemColors defaultNavigationBarItemColorsCached$material3_release = colorScheme.getDefaultNavigationBarItemColorsCached$material3_release();
        if (defaultNavigationBarItemColorsCached$material3_release != null) {
            return defaultNavigationBarItemColorsCached$material3_release;
        }
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
        NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getActiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getActiveLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getInactiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getInactiveLabelTextColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultNavigationBarItemColorsCached$material3_release(navigationBarItemColors);
        return navigationBarItemColors;
    }
}
