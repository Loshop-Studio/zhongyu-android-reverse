package p068d7;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DynamicTonalPaletteKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.p013ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d7.c */
/* loaded from: classes4.dex */
public abstract class AbstractC7307c {

    /* renamed from: a */
    public static final ColorScheme f11817a = ColorSchemeKt.m18668darkColorSchemeCXl9yA$default(AbstractC7305a.m11588l(), 0, 0, 0, 0, AbstractC7305a.m11590n(), 0, 0, 0, AbstractC7305a.m11587k(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15, null);

    /* renamed from: b */
    public static final ColorScheme f11818b = ColorSchemeKt.m18672lightColorSchemeCXl9yA$default(AbstractC7305a.m11585i(), 0, 0, 0, 0, AbstractC7305a.m11589m(), 0, 0, 0, AbstractC7305a.m11586j(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15, null);

    /* renamed from: b */
    public static final void m11592b(boolean z9, boolean z10, final Function2 content, Composer composer, final int i10, final int i11) {
        int i12;
        ColorScheme colorSchemeDynamicDarkColorScheme;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(275948679);
        if ((i10 & 6) == 0) {
            i12 = (((i11 & 1) == 0 && composerStartRestartGroup.changed(z9)) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i11 & 1) != 0) {
                    z9 = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    i12 &= -15;
                }
                if (i13 != 0) {
                    z10 = true;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 1) != 0) {
                    i12 &= -15;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(275948679, i12, -1, "com.zykj.evaluation.ui.theme.NewEvaluationTheme (Theme.kt:40)");
            }
            if (z10 && Build.VERSION.SDK_INT >= 31) {
                composerStartRestartGroup.startReplaceGroup(220003872);
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                colorSchemeDynamicDarkColorScheme = z9 ? DynamicTonalPaletteKt.dynamicDarkColorScheme(context) : DynamicTonalPaletteKt.dynamicLightColorScheme(context);
                composerStartRestartGroup.endReplaceGroup();
            } else if (z9) {
                composerStartRestartGroup.startReplaceGroup(-1101276234);
                composerStartRestartGroup.endReplaceGroup();
                colorSchemeDynamicDarkColorScheme = f11817a;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1101275209);
                composerStartRestartGroup.endReplaceGroup();
                colorSchemeDynamicDarkColorScheme = f11818b;
            }
            MaterialThemeKt.MaterialTheme(colorSchemeDynamicDarkColorScheme, null, AbstractC7308d.m11594a(), content, composerStartRestartGroup, ((i12 << 3) & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final boolean z11 = z9;
        final boolean z12 = z10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: d7.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7307c.m11593c(z11, z12, content, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: c */
    public static final Unit m11593c(boolean z9, boolean z10, Function2 function2, int i10, int i11, Composer composer, int i12) {
        m11592b(z9, z10, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
