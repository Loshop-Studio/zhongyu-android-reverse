package com.zykj.mistake.main;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.zykj.mistake.feature.home.C4731d;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6473e;
import p212z4.AbstractC6821h;
import p212z4.C6820g;

/* renamed from: com.zykj.mistake.main.l */
/* loaded from: classes3.dex */
public abstract class AbstractC5057l {
    /* renamed from: a */
    public static final void m4377a(MainShellViewModel shellViewModel, Composer composer, int i) {
        int i8;
        AbstractC5830k.m5330g(shellViewModel, "shellViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1176525039);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(shellViewModel) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1176525039, i8, -1, "com.zykj.mistake.main.MainShellEffectHandler (MainShellEffectHandler.kt:9)");
            }
            C6820g c6820g = (C6820g) composerStartRestartGroup.consume(AbstractC6821h.f11556a);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(shellViewModel) | composerStartRestartGroup.changedInstance(c6820g);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MainShellEffectHandlerKt$MainShellEffectHandler$1$1(shellViewModel, c6820g, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(shellViewModel, (InterfaceC6473e) objRememberedValue, composerStartRestartGroup, i8 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4731d(shellViewModel, i, 1));
        }
    }
}
