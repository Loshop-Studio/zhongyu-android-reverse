package com.zykj.mistake.feature.collection.detail;

import android.view.Lifecycle;
import android.view.LifecycleOwner;
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
import com.zykj.mistake.main.MainShellViewModel;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p167t4.AbstractC6591d;
import p167t4.C6592e;
import p175u4.C6616c;
import p207y6.InterfaceC6781e;
import p212z4.AbstractC6817d;
import p212z4.C6816c;

/* renamed from: com.zykj.mistake.feature.collection.detail.e */
/* loaded from: classes3.dex */
public abstract class AbstractC4587e {
    /* renamed from: a */
    public static final void m4036a(NavBackStackEntry backStackEntry, MainShellViewModel shellViewModel, Composer composer, int i) {
        int i8;
        NavBackStackEntry navBackStackEntry;
        Composer composer2;
        AbstractC5830k.m5330g(backStackEntry, "backStackEntry");
        AbstractC5830k.m5330g(shellViewModel, "shellViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-32991783);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(backStackEntry) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(shellViewModel) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-32991783, i8, -1, "com.zykj.mistake.feature.collection.detail.CollectionDetailRoute (CollectionDetailRoute.kt:19)");
            }
            C6616c c6616c = (C6616c) NavBackStackEntryKt.toRoute(backStackEntry, AbstractC5832m.m5340a(C6616c.class));
            navBackStackEntry = backStackEntry;
            MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel = (MistakeCollectionDetailViewModel) ViewModelKt.viewModel(AbstractC5832m.m5340a(MistakeCollectionDetailViewModel.class), backStackEntry, (String) null, (ViewModelProvider.Factory) null, backStackEntry.getDefaultViewModelCreationExtras(), composerStartRestartGroup, ((i8 & 14) << 3) & 112, 0);
            C6816c c6816c = (C6816c) composerStartRestartGroup.consume(AbstractC6817d.f11545a);
            C6592e c6592e = (C6592e) composerStartRestartGroup.consume(AbstractC6591d.f11002a);
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(mistakeCollectionDetailViewModel.f6438d, (LifecycleOwner) null, (Lifecycle.State) null, (InterfaceC5636h) null, composerStartRestartGroup, 0, 7);
            composer2 = composerStartRestartGroup;
            boolean zChangedInstance = composer2.changedInstance(mistakeCollectionDetailViewModel) | composer2.changed(c6616c);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new CollectionDetailRouteKt$CollectionDetailRoute$1$1(mistakeCollectionDetailViewModel, c6616c, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(c6616c, (InterfaceC6473e) objRememberedValue, composer2, 0);
            boolean zChangedInstance2 = composer2.changedInstance(navBackStackEntry) | composer2.changedInstance(mistakeCollectionDetailViewModel);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new CollectionDetailRouteKt$CollectionDetailRoute$2$1(navBackStackEntry, mistakeCollectionDetailViewModel, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            int i9 = i8 << 3;
            int i10 = i9 & 112;
            EffectsKt.LaunchedEffect(mistakeCollectionDetailViewModel, navBackStackEntry, (InterfaceC6473e) objRememberedValue2, composer2, i10);
            boolean zChangedInstance3 = composer2.changedInstance(navBackStackEntry) | composer2.changedInstance(mistakeCollectionDetailViewModel) | composer2.changedInstance(c6592e);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new CollectionDetailRouteKt$CollectionDetailRoute$3$1(navBackStackEntry, mistakeCollectionDetailViewModel, c6592e, null);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(mistakeCollectionDetailViewModel, navBackStackEntry, (InterfaceC6473e) objRememberedValue3, composer2, i10);
            boolean zChangedInstance4 = composer2.changedInstance(navBackStackEntry) | composer2.changedInstance(mistakeCollectionDetailViewModel);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new CollectionDetailRouteKt$CollectionDetailRoute$4$1(navBackStackEntry, mistakeCollectionDetailViewModel, null);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(mistakeCollectionDetailViewModel, navBackStackEntry, (InterfaceC6473e) objRememberedValue4, composer2, i10);
            boolean zChangedInstance5 = composer2.changedInstance(navBackStackEntry) | composer2.changedInstance(mistakeCollectionDetailViewModel);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new CollectionDetailRouteKt$CollectionDetailRoute$5$1(navBackStackEntry, mistakeCollectionDetailViewModel, null);
                composer2.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(mistakeCollectionDetailViewModel, navBackStackEntry, (InterfaceC6473e) objRememberedValue5, composer2, i10);
            AbstractC4575a.m4035b(shellViewModel, mistakeCollectionDetailViewModel, composer2, (i8 >> 3) & 14);
            AbstractC4575a.m4034a(mistakeCollectionDetailViewModel, c6816c, shellViewModel, composer2, i9 & 896);
            C4632z0 c4632z0 = (C4632z0) stateCollectAsStateWithLifecycle.getValue();
            boolean zChangedInstance6 = composer2.changedInstance(mistakeCollectionDetailViewModel);
            Object objRememberedValue6 = composer2.rememberedValue();
            if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new CollectionDetailRouteKt$CollectionDetailRoute$6$1(mistakeCollectionDetailViewModel);
                composer2.updateRememberedValue(objRememberedValue6);
            }
            AbstractC4592f1.m4040c(c4632z0, (InterfaceC6471c) ((InterfaceC6781e) objRememberedValue6), composer2, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4578b(navBackStackEntry, shellViewModel, i, 0));
        }
    }
}
