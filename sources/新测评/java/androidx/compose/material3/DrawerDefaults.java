package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R \u0010\u000e\u001a\u00020\u000f8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u000f8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u000f8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u000f8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u001d\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, m13558d2 = {"Landroidx/compose/material3/DrawerDefaults;", "", "()V", "DismissibleDrawerElevation", "Landroidx/compose/ui/unit/Dp;", "getDismissibleDrawerElevation-D9Ej5fM", "()F", "F", "MaximumDrawerWidth", "getMaximumDrawerWidth-D9Ej5fM", "ModalDrawerElevation", "getModalDrawerElevation-D9Ej5fM", "PermanentDrawerElevation", "getPermanentDrawerElevation-D9Ej5fM", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor$annotations", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "modalContainerColor", "getModalContainerColor", "scrimColor", "getScrimColor", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "standardContainerColor", "getStandardContainerColor", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class DrawerDefaults {
    public static final int $stable = 0;
    private static final float DismissibleDrawerElevation;
    private static final float MaximumDrawerWidth;
    private static final float PermanentDrawerElevation;
    public static final DrawerDefaults INSTANCE = new DrawerDefaults();
    private static final float ModalDrawerElevation = ElevationTokens.INSTANCE.m19909getLevel0D9Ej5fM();

    static {
        NavigationDrawerTokens navigationDrawerTokens = NavigationDrawerTokens.INSTANCE;
        PermanentDrawerElevation = navigationDrawerTokens.m20064getStandardContainerElevationD9Ej5fM();
        DismissibleDrawerElevation = navigationDrawerTokens.m20064getStandardContainerElevationD9Ej5fM();
        MaximumDrawerWidth = navigationDrawerTokens.m20061getContainerWidthD9Ej5fM();
    }

    private DrawerDefaults() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use standardContainerColor or modalContainerColor instead.", replaceWith = @ReplaceWith(expression = "standardContainerColor", imports = {}))
    public static /* synthetic */ void getContainerColor$annotations() {
    }

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1797317261, i10, -1, "androidx.compose.material3.DrawerDefaults.<get-containerColor> (NavigationDrawer.kt:878)");
        }
        long value = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getStandardContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getDismissibleDrawerElevation-D9Ej5fM, reason: not valid java name */
    public final float m18811getDismissibleDrawerElevationD9Ej5fM() {
        return DismissibleDrawerElevation;
    }

    /* renamed from: getMaximumDrawerWidth-D9Ej5fM, reason: not valid java name */
    public final float m18812getMaximumDrawerWidthD9Ej5fM() {
        return MaximumDrawerWidth;
    }

    @Composable
    @JvmName(name = "getModalContainerColor")
    public final long getModalContainerColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(706424321, i10, -1, "androidx.compose.material3.DrawerDefaults.<get-modalContainerColor> (NavigationDrawer.kt:888)");
        }
        long value = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getModalContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getModalDrawerElevation-D9Ej5fM, reason: not valid java name */
    public final float m18813getModalDrawerElevationD9Ej5fM() {
        return ModalDrawerElevation;
    }

    /* renamed from: getPermanentDrawerElevation-D9Ej5fM, reason: not valid java name */
    public final float m18814getPermanentDrawerElevationD9Ej5fM() {
        return PermanentDrawerElevation;
    }

    @Composable
    @JvmName(name = "getScrimColor")
    public final long getScrimColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1055074989, i10, -1, "androidx.compose.material3.DrawerDefaults.<get-scrimColor> (NavigationDrawer.kt:869)");
        }
        long jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM20975copywmQWz5c$default;
    }

    @Composable
    @JvmName(name = "getShape")
    public final Shape getShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(928378975, i10, -1, "androidx.compose.material3.DrawerDefaults.<get-shape> (NavigationDrawer.kt:865)");
        }
        Shape value = ShapesKt.getValue(NavigationDrawerTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    @JvmName(name = "getStandardContainerColor")
    public final long getStandardContainerColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-125949421, i10, -1, "androidx.compose.material3.DrawerDefaults.<get-standardContainerColor> (NavigationDrawer.kt:884)");
        }
        long value = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getStandardContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    @JvmName(name = "getWindowInsets")
    public final WindowInsets getWindowInsets(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-909973510, i10, -1, "androidx.compose.material3.DrawerDefaults.<get-windowInsets> (NavigationDrawer.kt:897)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.INSTANCE, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.INSTANCE;
        WindowInsets windowInsetsM17754onlybOOhFvg = WindowInsetsKt.m17754onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m17766plusgK_yJZ4(companion.m17781getVerticalJoeWqyM(), companion.m17779getStartJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsetsM17754onlybOOhFvg;
    }
}
