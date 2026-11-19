package com.zykj.mistake.feature.collection.list;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.navigation.compose.C2840b;
import com.zykj.mistake.main.MainShellViewModel;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6473e;
import p167t4.AbstractC6591d;
import p167t4.C6592e;
import p191w4.AbstractC6719d;
import p191w4.InterfaceC6718c;

/* renamed from: com.zykj.mistake.feature.collection.list.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4699a {
    /* renamed from: a */
    public static final void m4092a(MistakeCollectionViewModel mistakeCollectionViewModel, MainShellViewModel shellViewModel, Composer composer, int i) {
        int i8;
        MistakeCollectionViewModel mistakeCollectionViewModel2;
        MainShellViewModel mainShellViewModel;
        AbstractC5830k.m5330g(shellViewModel, "shellViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1020122714);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(mistakeCollectionViewModel) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(shellViewModel) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1020122714, i8, -1, "com.zykj.mistake.feature.collection.list.CollectionListEffectHandler (CollectionListEffectHandler.kt:16)");
            }
            InterfaceC6718c interfaceC6718c = (InterfaceC6718c) composerStartRestartGroup.consume(AbstractC6719d.f11339a);
            C6592e c6592e = (C6592e) composerStartRestartGroup.consume(AbstractC6591d.f11002a);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(mistakeCollectionViewModel) | composerStartRestartGroup.changedInstance(interfaceC6718c) | composerStartRestartGroup.changedInstance(shellViewModel) | composerStartRestartGroup.changedInstance(c6592e);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mistakeCollectionViewModel2 = mistakeCollectionViewModel;
                mainShellViewModel = shellViewModel;
                objRememberedValue = new CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1(mistakeCollectionViewModel2, interfaceC6718c, mainShellViewModel, c6592e, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                mistakeCollectionViewModel2 = mistakeCollectionViewModel;
                mainShellViewModel = shellViewModel;
            }
            EffectsKt.LaunchedEffect(mistakeCollectionViewModel2, (InterfaceC6473e) objRememberedValue, composerStartRestartGroup, i8 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            mistakeCollectionViewModel2 = mistakeCollectionViewModel;
            mainShellViewModel = shellViewModel;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2840b(i, 5, mistakeCollectionViewModel2, mainShellViewModel));
        }
    }
}
