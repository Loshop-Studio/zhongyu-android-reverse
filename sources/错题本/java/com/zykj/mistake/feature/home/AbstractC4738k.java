package com.zykj.mistake.feature.home;

import android.view.compose.C2756g;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel;
import com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel;
import com.zykj.mistake.main.MainShellViewModel;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.home.k */
/* loaded from: classes3.dex */
public abstract class AbstractC4738k {
    /* renamed from: a */
    public static final void m4104a(MainShellViewModel shellViewModel, MistakeNotebookViewModel mistakeNotebookViewModel, MistakeCollectionViewModel mistakeCollectionViewModel, Composer composer, int i) {
        int i8;
        AbstractC5830k.m5330g(shellViewModel, "shellViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1562216514);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(shellViewModel) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(mistakeNotebookViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(mistakeCollectionViewModel) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1562216514, i8, -1, "com.zykj.mistake.feature.home.HomeShellEffectHandler (HomeShellEffectHandler.kt:17)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(shellViewModel) | composerStartRestartGroup.changedInstance(mistakeNotebookViewModel) | composerStartRestartGroup.changedInstance(mistakeCollectionViewModel);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new HomeShellEffectHandlerKt$HomeShellEffectHandler$1$1(shellViewModel, mistakeNotebookViewModel, mistakeCollectionViewModel, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(shellViewModel, mistakeNotebookViewModel, mistakeCollectionViewModel, (InterfaceC6473e) objRememberedValue, composerStartRestartGroup, i8 & 1022);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2756g(i, 8, shellViewModel, mistakeNotebookViewModel, mistakeCollectionViewModel));
        }
    }
}
