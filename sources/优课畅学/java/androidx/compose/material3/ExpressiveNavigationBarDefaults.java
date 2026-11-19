package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class ExpressiveNavigationBarDefaults {
    public static final int $stable = 0;
    public static final ExpressiveNavigationBarDefaults INSTANCE = new ExpressiveNavigationBarDefaults();

    private ExpressiveNavigationBarDefaults() {
    }

    /* renamed from: getArrangement-Ebr7WPU, reason: not valid java name */
    public final int m22088getArrangementEbr7WPU() {
        return NavigationBarArrangement.Companion.m22254getEqualWeightEbr7WPU();
    }

    @Composable
    public final long getContainerColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1666471887, i10, -1, "androidx.compose.material3.ExpressiveNavigationBarDefaults.<get-containerColor> (ExpressiveNavigationBar.kt:244)");
        }
        long value = ColorSchemeKt.getValue(ColorSchemeKeyTokens.SurfaceContainer, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final long getContentColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(190518351, i10, -1, "androidx.compose.material3.ExpressiveNavigationBarDefaults.<get-contentColor> (ExpressiveNavigationBar.kt:249)");
        }
        long value = ColorSchemeKt.getValue(ColorSchemeKeyTokens.OnSurfaceVariant, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final WindowInsets getWindowInsets(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1317880490, i10, -1, "androidx.compose.material3.ExpressiveNavigationBarDefaults.<get-windowInsets> (ExpressiveNavigationBar.kt:259)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets windowInsetsM20929onlybOOhFvg = WindowInsetsKt.m20929onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m20941plusgK_yJZ4(companion.m20951getHorizontalJoeWqyM(), companion.m20949getBottomJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsetsM20929onlybOOhFvg;
    }
}
