package com.zykj.mistake.feature.ask;

import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.ViewModel;
import android.view.ViewModelProvider;
import android.view.compose.FlowExtKt;
import android.view.viewmodel.compose.ViewModelKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryKt;
import androidx.navigation.compose.C2842d;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p207y6.InterfaceC6781e;
import p212z4.AbstractC6815b;
import p212z4.C6814a;

/* renamed from: com.zykj.mistake.feature.ask.c */
/* loaded from: classes3.dex */
public abstract class AbstractC4514c {
    /* renamed from: a */
    public static final void m4001a(NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i8;
        NavBackStackEntry navBackStackEntry;
        Composer composer2;
        AbstractC5830k.m5330g(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(1438160216);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(backStackEntry) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1438160216, i8, -1, "com.zykj.mistake.feature.ask.AskMaterialRoute (AskMaterialRoute.kt:18)");
            }
            boolean zChanged = composerStartRestartGroup.changed(backStackEntry.getId());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (C4520f) NavBackStackEntryKt.toRoute(backStackEntry, AbstractC5832m.m5340a(C4520f.class));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            C4520f c4520f = (C4520f) objRememberedValue;
            ViewModel viewModel = ViewModelKt.viewModel(AbstractC5832m.m5340a(MistakeAskMaterialViewModel.class), backStackEntry, (String) null, (ViewModelProvider.Factory) null, backStackEntry.getDefaultViewModelCreationExtras(), composerStartRestartGroup, ((i8 & 14) << 3) & 112, 0);
            navBackStackEntry = backStackEntry;
            MistakeAskMaterialViewModel mistakeAskMaterialViewModel = (MistakeAskMaterialViewModel) viewModel;
            C6814a c6814a = (C6814a) composerStartRestartGroup.consume(AbstractC6815b.f11543a);
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(mistakeAskMaterialViewModel.f6211b, (LifecycleOwner) null, (Lifecycle.State) null, (InterfaceC5636h) null, composerStartRestartGroup, 0, 7);
            composer2 = composerStartRestartGroup;
            boolean zChangedInstance = composer2.changedInstance(mistakeAskMaterialViewModel) | composer2.changedInstance(c4520f);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new AskMaterialRouteKt$AskMaterialRoute$1$1(mistakeAskMaterialViewModel, c4520f, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(c4520f, (InterfaceC6473e) objRememberedValue2, composer2, 0);
            AbstractC4510a.m3997a(mistakeAskMaterialViewModel, c4520f, c6814a, composer2, 0);
            C4550z c4550z = (C4550z) stateCollectAsStateWithLifecycle.getValue();
            boolean zChangedInstance2 = composer2.changedInstance(mistakeAskMaterialViewModel);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new AskMaterialRouteKt$AskMaterialRoute$2$1(mistakeAskMaterialViewModel);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            AbstractC4539o0.m4012j(c4550z, (InterfaceC6471c) ((InterfaceC6781e) objRememberedValue3), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            navBackStackEntry = backStackEntry;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2842d(navBackStackEntry, i, 1));
        }
    }
}
