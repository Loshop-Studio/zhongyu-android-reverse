package com.zykj.insight.p044ui.theme;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DynamicTonalPaletteKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.p006ui.graphics.ColorKt;
import androidx.compose.p006ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.view.WindowCompat;
import com.umeng.commonsdk.statistics.UMErrorCode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p136w1.AbstractC4639a;
import p136w1.AbstractC4640b;

/* loaded from: classes2.dex */
public abstract class ThemeKt {

    /* renamed from: a */
    public static final ColorScheme f4198a = ColorSchemeKt.m7917darkColorSchemeG1PFcw$default(AbstractC4639a.m6466d(), 0, 0, 0, 0, AbstractC4639a.m6468f(), 0, 0, 0, AbstractC4639a.m6464b(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 536870366, null);

    /* renamed from: b */
    public static final ColorScheme f4199b = ColorSchemeKt.m7919lightColorSchemeG1PFcw$default(AbstractC4639a.m6465c(), 0, 0, 0, 0, AbstractC4639a.m6467e(), 0, 0, 0, AbstractC4639a.m6463a(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 536870366, null);

    /* renamed from: a */
    public static final void m4624a(final boolean z3, boolean z4, final Function2 content, Composer composer, final int i4, final int i5) {
        int i6;
        final ColorScheme colorSchemeDynamicDarkColorScheme;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(670377987);
        if ((i4 & 14) == 0) {
            i6 = (((i5 & 1) == 0 && composerStartRestartGroup.changed(z3)) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i7 = i5 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i6 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i4 & 896) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i6 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i4 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i5 & 1) != 0) {
                    z3 = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    i6 &= -15;
                }
                if (i7 != 0) {
                    z4 = true;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i5 & 1) != 0) {
                    i6 &= -15;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(670377987, i6, -1, "com.zykj.insight.ui.theme.EzyAndroidInsightTheme (Theme.kt:40)");
            }
            composerStartRestartGroup.startReplaceableGroup(-350413093);
            if (!z4 || Build.VERSION.SDK_INT < 31) {
                colorSchemeDynamicDarkColorScheme = z3 ? f4198a : f4199b;
            } else {
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                colorSchemeDynamicDarkColorScheme = z3 ? DynamicTonalPaletteKt.dynamicDarkColorScheme(context) : DynamicTonalPaletteKt.dynamicLightColorScheme(context);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            composerStartRestartGroup.startReplaceableGroup(-350412742);
            if (!view.isInEditMode()) {
                EffectsKt.SideEffect(new Function0<Unit>() { // from class: com.zykj.insight.ui.theme.ThemeKt$EzyAndroidInsightTheme$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Context context2 = view.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
                        Window window = ((Activity) context2).getWindow();
                        window.setStatusBarColor(ColorKt.m9232toArgb8_81llA(colorSchemeDynamicDarkColorScheme.m7874getPrimary0d7_KjU()));
                        WindowCompat.getInsetsController(window, view).setAppearanceLightStatusBars(z3);
                    }
                }, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MaterialThemeKt.MaterialTheme(colorSchemeDynamicDarkColorScheme, null, AbstractC4640b.m6469a(), content, composerStartRestartGroup, ((i6 << 3) & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final boolean z5 = z3;
        final boolean z6 = z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zykj.insight.ui.theme.ThemeKt$EzyAndroidInsightTheme$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i8) {
                ThemeKt.m4624a(z5, z6, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
            }
        });
    }
}
