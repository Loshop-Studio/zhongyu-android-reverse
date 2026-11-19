package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.navigation.compose.C2840b;
import com.zykj.mistake.main.MainShellViewModel;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.e */
/* loaded from: classes3.dex */
public abstract class AbstractC4785e {
    /* renamed from: a */
    public static final void m4181a(MainShellViewModel shellViewModel, MistakeDetailNewViewModel mistakeDetailNewViewModel, Composer composer, int i) {
        int i8;
        AbstractC5830k.m5330g(shellViewModel, "shellViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1334341291);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(shellViewModel) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(mistakeDetailNewViewModel) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1334341291, i8, -1, "com.zykj.mistake.feature.notebook.detail.DetailShellEffectHandler (DetailShellEffectHandler.kt:12)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(shellViewModel) | composerStartRestartGroup.changedInstance(mistakeDetailNewViewModel);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new DetailShellEffectHandlerKt$DetailShellEffectHandler$1$1(shellViewModel, mistakeDetailNewViewModel, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(shellViewModel, mistakeDetailNewViewModel, (InterfaceC6473e) objRememberedValue, composerStartRestartGroup, i8 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2840b(i, 6, shellViewModel, mistakeDetailNewViewModel));
        }
    }
}
