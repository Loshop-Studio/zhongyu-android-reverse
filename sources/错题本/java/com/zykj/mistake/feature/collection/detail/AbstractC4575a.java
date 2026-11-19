package com.zykj.mistake.feature.collection.detail;

import android.view.compose.C2756g;
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
import p212z4.C6816c;

/* renamed from: com.zykj.mistake.feature.collection.detail.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4575a {
    /* renamed from: a */
    public static final void m4034a(MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel, C6816c environment, MainShellViewModel shellViewModel, Composer composer, int i) {
        int i8;
        MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel2;
        C6816c c6816c;
        MainShellViewModel mainShellViewModel;
        AbstractC5830k.m5330g(environment, "environment");
        AbstractC5830k.m5330g(shellViewModel, "shellViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1579216784);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(mistakeCollectionDetailViewModel) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(environment) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(shellViewModel) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1579216784, i8, -1, "com.zykj.mistake.feature.collection.detail.CollectionDetailEffectHandler (CollectionDetailEffectHandler.kt:18)");
            }
            InterfaceC6718c interfaceC6718c = (InterfaceC6718c) composerStartRestartGroup.consume(AbstractC6719d.f11339a);
            C6592e c6592e = (C6592e) composerStartRestartGroup.consume(AbstractC6591d.f11002a);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(mistakeCollectionDetailViewModel) | composerStartRestartGroup.changedInstance(c6592e) | composerStartRestartGroup.changedInstance(shellViewModel) | composerStartRestartGroup.changedInstance(interfaceC6718c) | composerStartRestartGroup.changedInstance(environment);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mistakeCollectionDetailViewModel2 = mistakeCollectionDetailViewModel;
                c6816c = environment;
                mainShellViewModel = shellViewModel;
                objRememberedValue = new C4570x23633b93(mistakeCollectionDetailViewModel2, c6592e, mainShellViewModel, interfaceC6718c, c6816c, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                mistakeCollectionDetailViewModel2 = mistakeCollectionDetailViewModel;
                c6816c = environment;
                mainShellViewModel = shellViewModel;
            }
            EffectsKt.LaunchedEffect(mistakeCollectionDetailViewModel2, (InterfaceC6473e) objRememberedValue, composerStartRestartGroup, i8 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            mistakeCollectionDetailViewModel2 = mistakeCollectionDetailViewModel;
            c6816c = environment;
            mainShellViewModel = shellViewModel;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2756g(i, 4, mistakeCollectionDetailViewModel2, c6816c, mainShellViewModel));
        }
    }

    /* renamed from: b */
    public static final void m4035b(MainShellViewModel shellViewModel, MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel, Composer composer, int i) {
        int i8;
        AbstractC5830k.m5330g(shellViewModel, "shellViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(2140645200);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(shellViewModel) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(mistakeCollectionDetailViewModel) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2140645200, i8, -1, "com.zykj.mistake.feature.collection.detail.CollectionDetailShellEffectHandler (CollectionDetailShellEffectHandler.kt:12)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(shellViewModel) | composerStartRestartGroup.changedInstance(mistakeCollectionDetailViewModel);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4571x39e8c055(shellViewModel, mistakeCollectionDetailViewModel, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(shellViewModel, mistakeCollectionDetailViewModel, (InterfaceC6473e) objRememberedValue, composerStartRestartGroup, i8 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2840b(i, 3, shellViewModel, mistakeCollectionDetailViewModel));
        }
    }
}
