package com.zykj.mistake.feature.notebook.list;

import android.view.compose.C2756g;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.zykj.mistake.main.MainShellViewModel;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6473e;
import p167t4.AbstractC6591d;
import p167t4.C6592e;
import p191w4.AbstractC6719d;
import p191w4.InterfaceC6718c;
import p212z4.C6820g;

/* renamed from: com.zykj.mistake.feature.notebook.list.m1 */
/* loaded from: classes3.dex */
public abstract class AbstractC4965m1 {
    /* renamed from: a */
    public static final void m4318a(MistakeNotebookViewModel mistakeNotebookViewModel, MainShellViewModel shellViewModel, C6820g environment, Composer composer, int i) {
        int i8;
        MistakeNotebookViewModel mistakeNotebookViewModel2;
        MainShellViewModel mainShellViewModel;
        C6820g c6820g;
        AbstractC5830k.m5330g(shellViewModel, "shellViewModel");
        AbstractC5830k.m5330g(environment, "environment");
        Composer composerStartRestartGroup = composer.startRestartGroup(-787849021);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(mistakeNotebookViewModel) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(shellViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(environment) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-787849021, i8, -1, "com.zykj.mistake.feature.notebook.list.NotebookEffectHandler (NotebookEffectHandler.kt:20)");
            }
            InterfaceC6718c interfaceC6718c = (InterfaceC6718c) composerStartRestartGroup.consume(AbstractC6719d.f11339a);
            C6592e c6592e = (C6592e) composerStartRestartGroup.consume(AbstractC6591d.f11002a);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(mistakeNotebookViewModel) | composerStartRestartGroup.changedInstance(environment) | composerStartRestartGroup.changedInstance(shellViewModel) | composerStartRestartGroup.changedInstance(c6592e) | composerStartRestartGroup.changedInstance(interfaceC6718c);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mistakeNotebookViewModel2 = mistakeNotebookViewModel;
                mainShellViewModel = shellViewModel;
                c6820g = environment;
                objRememberedValue = new NotebookEffectHandlerKt$NotebookEffectHandler$1$1(mistakeNotebookViewModel2, c6820g, mainShellViewModel, c6592e, interfaceC6718c, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                mistakeNotebookViewModel2 = mistakeNotebookViewModel;
                mainShellViewModel = shellViewModel;
                c6820g = environment;
            }
            EffectsKt.LaunchedEffect(mistakeNotebookViewModel2, (InterfaceC6473e) objRememberedValue, composerStartRestartGroup, i8 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            mistakeNotebookViewModel2 = mistakeNotebookViewModel;
            mainShellViewModel = shellViewModel;
            c6820g = environment;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2756g(i, 16, mistakeNotebookViewModel2, mainShellViewModel, c6820g));
        }
    }
}
