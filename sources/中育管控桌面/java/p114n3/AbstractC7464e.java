package p114n3;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DynamicTonalPaletteKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.p009ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p009ui.platform.CompositionLocalsKt;
import androidx.compose.p009ui.unit.DensityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n3.e */
/* loaded from: classes4.dex */
public abstract class AbstractC7464e {

    /* renamed from: a */
    public static final ColorScheme f9553a = ColorSchemeKt.m11591darkColorSchemeCXl9yA$default(AbstractC7460a.m8515l(), 0, 0, 0, 0, AbstractC7460a.m8517n(), 0, 0, 0, AbstractC7460a.m8513j(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15, null);

    /* renamed from: b */
    public static final ColorScheme f9554b = ColorSchemeKt.m11595lightColorSchemeCXl9yA$default(AbstractC7460a.m8514k(), 0, 0, 0, 0, AbstractC7460a.m8516m(), 0, 0, 0, AbstractC7460a.m8512i(), 0, 0, 0, AbstractC7460a.m8511h(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8738, 15, null);

    /* renamed from: c */
    public static final void m8521c(boolean z6, boolean z7, final Function2 content, Composer composer, final int i6, final int i7) {
        int i8;
        final ColorScheme colorSchemeDynamicDarkColorScheme;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-799677681);
        if ((i6 & 6) == 0) {
            i8 = (((i7 & 1) == 0 && composerStartRestartGroup.changed(z6)) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        int i9 = i7 & 2;
        if (i9 != 0) {
            i8 |= 48;
        } else if ((i6 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(z7) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i6 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i7 & 1) != 0) {
                    z6 = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    i8 &= -15;
                }
                if (i9 != 0) {
                    z7 = false;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i7 & 1) != 0) {
                    i8 &= -15;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-799677681, i8, -1, "com.zykj.gallery.ui.theme.EzyAndroidHuiweiLauncherTheme (Theme.kt:44)");
            }
            if (z7 && Build.VERSION.SDK_INT >= 31) {
                composerStartRestartGroup.startReplaceGroup(986120472);
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                colorSchemeDynamicDarkColorScheme = z6 ? DynamicTonalPaletteKt.dynamicDarkColorScheme(context) : DynamicTonalPaletteKt.dynamicLightColorScheme(context);
                composerStartRestartGroup.endReplaceGroup();
            } else if (z6) {
                composerStartRestartGroup.startReplaceGroup(308910558);
                composerStartRestartGroup.endReplaceGroup();
                colorSchemeDynamicDarkColorScheme = f9553a;
            } else {
                composerStartRestartGroup.startReplaceGroup(308911583);
                composerStartRestartGroup.endReplaceGroup();
                colorSchemeDynamicDarkColorScheme = f9554b;
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalDensity().provides(DensityKt.Density(((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getDisplayMetrics().density, C7461b.f9544a.m8518a())), ComposableLambdaKt.rememberComposableLambda(1847010895, true, new Function2() { // from class: n3.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7464e.m8522d(colorSchemeDynamicDarkColorScheme, content, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final boolean z8 = z6;
        final boolean z9 = z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: n3.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7464e.m8523e(z8, z9, content, i6, i7, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: d */
    public static final Unit m8522d(ColorScheme colorScheme, Function2 function2, Composer composer, int i6) {
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1847010895, i6, -1, "com.zykj.gallery.ui.theme.EzyAndroidHuiweiLauncherTheme.<anonymous> (Theme.kt:67)");
            }
            MaterialThemeKt.MaterialTheme(colorScheme, null, AbstractC7465f.m8524a(), function2, composer, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public static final Unit m8523e(boolean z6, boolean z7, Function2 function2, int i6, int i7, Composer composer, int i8) {
        m8521c(z6, z7, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1), i7);
        return Unit.INSTANCE;
    }
}
