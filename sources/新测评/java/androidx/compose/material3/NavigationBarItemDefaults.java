package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\tJD\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JX\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, m13558d2 = {"Landroidx/compose/material3/NavigationBarItemDefaults;", "", "()V", "defaultNavigationBarItemColors", "Landroidx/compose/material3/NavigationBarItemColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultNavigationBarItemColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationBarItemColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationBarItemColors;", "selectedIconColor", "Landroidx/compose/ui/graphics/Color;", "selectedTextColor", "indicatorColor", "unselectedIconColor", "unselectedTextColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationBarItemColors;", "disabledIconColor", "disabledTextColor", "colors-69fazGs", "(JJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationBarItemColors;", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarItemDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,717:1\n1#2:718\n*E\n"})
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
    public final NavigationBarItemColors m19008colors69fazGs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, Composer composer, int i10, int i11) {
        long j17;
        long jM21012getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM21012getUnspecified0d7_KjU2 = (i11 & 2) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j11;
        long jM21012getUnspecified0d7_KjU3 = (i11 & 4) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12;
        long jM21012getUnspecified0d7_KjU4 = (i11 & 8) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j13;
        long jM21012getUnspecified0d7_KjU5 = (i11 & 16) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j14;
        long jM21012getUnspecified0d7_KjU6 = (i11 & 32) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j15;
        long jM21012getUnspecified0d7_KjU7 = (i11 & 64) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j16;
        if (ComposerKt.isTraceInProgress()) {
            j17 = jM21012getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(-1618564327, i10, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:335)");
        } else {
            j17 = jM21012getUnspecified0d7_KjU;
        }
        NavigationBarItemColors navigationBarItemColorsM18997copy4JmcsL4 = getDefaultNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m18997copy4JmcsL4(j17, jM21012getUnspecified0d7_KjU2, jM21012getUnspecified0d7_KjU3, jM21012getUnspecified0d7_KjU4, jM21012getUnspecified0d7_KjU5, jM21012getUnspecified0d7_KjU6, jM21012getUnspecified0d7_KjU7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBarItemColorsM18997copy4JmcsL4;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with disabledIconColor and disabledTextColor")
    @Composable
    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ NavigationBarItemColors m19009colorszjMxDiM(long j10, long j11, long j12, long j13, long j14, Composer composer, int i10, int i11) {
        long value = (i11 & 1) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveIconColor(), composer, 6) : j10;
        long value2 = (i11 & 2) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveLabelTextColor(), composer, 6) : j11;
        long value3 = (i11 & 4) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j12;
        long value4 = (i11 & 8) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getInactiveIconColor(), composer, 6) : j13;
        long value5 = (i11 & 16) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6) : j14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-213647161, i10, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:377)");
        }
        NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(value, value2, value3, value4, value5, Color.m20975copywmQWz5c$default(value4, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(value5, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBarItemColors;
    }

    public final NavigationBarItemColors getDefaultNavigationBarItemColors$material3_release(ColorScheme colorScheme) {
        NavigationBarItemColors defaultNavigationBarItemColorsCached = colorScheme.getDefaultNavigationBarItemColorsCached();
        if (defaultNavigationBarItemColorsCached != null) {
            return defaultNavigationBarItemColorsCached;
        }
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
        NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getActiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getActiveLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getInactiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getInactiveLabelTextColor()), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultNavigationBarItemColorsCached$material3_release(navigationBarItemColors);
        return navigationBarItemColors;
    }
}
