package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class NavigationRailDefaults {
    public static final int $stable = 0;
    public static final NavigationRailDefaults INSTANCE = new NavigationRailDefaults();

    private NavigationRailDefaults() {
    }

    @Composable
    public final long getContainerColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1949394041, i10, -1, "androidx.compose.material3.NavigationRailDefaults.<get-ContainerColor> (NavigationRail.kt:291)");
        }
        long value = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final WindowInsets getWindowInsets(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1546379058, i10, -1, "androidx.compose.material3.NavigationRailDefaults.<get-windowInsets> (NavigationRail.kt:297)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets windowInsetsM27531onlybOOhFvg = WindowInsetsKt.m27531onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m27543plusgK_yJZ4(companion.m27558getVerticalJoeWqyM(), companion.m27556getStartJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsetsM27531onlybOOhFvg;
    }
}
