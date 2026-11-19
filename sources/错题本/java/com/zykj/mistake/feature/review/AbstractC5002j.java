package com.zykj.mistake.feature.review;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.navigation.compose.C2842d;
import p152r6.InterfaceC6473e;
import p167t4.AbstractC6591d;
import p167t4.C6592e;
import p191w4.AbstractC6719d;
import p191w4.InterfaceC6718c;

/* renamed from: com.zykj.mistake.feature.review.j */
/* loaded from: classes3.dex */
public abstract class AbstractC5002j {
    /* renamed from: a */
    public static final void m4322a(ReviewViewModel reviewViewModel, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1647026881);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(reviewViewModel) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1647026881, i8, -1, "com.zykj.mistake.feature.review.ReviewEffectHandler (ReviewEffectHandler.kt:11)");
            }
            C6592e c6592e = (C6592e) composerStartRestartGroup.consume(AbstractC6591d.f11002a);
            InterfaceC6718c interfaceC6718c = (InterfaceC6718c) composerStartRestartGroup.consume(AbstractC6719d.f11339a);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(reviewViewModel) | composerStartRestartGroup.changedInstance(c6592e) | composerStartRestartGroup.changedInstance(interfaceC6718c);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ReviewEffectHandlerKt$ReviewEffectHandler$1$1(reviewViewModel, c6592e, interfaceC6718c, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(reviewViewModel, (InterfaceC6473e) objRememberedValue, composerStartRestartGroup, i8 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2842d(reviewViewModel, i, 4));
        }
    }
}
