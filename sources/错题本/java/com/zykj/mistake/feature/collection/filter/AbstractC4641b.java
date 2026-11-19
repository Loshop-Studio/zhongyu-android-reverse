package com.zykj.mistake.feature.collection.filter;

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
import com.zykj.mistake.feature.collection.detail.C4578b;
import com.zykj.mistake.main.MainShellViewModel;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p207y6.InterfaceC6781e;
import p212z4.AbstractC6817d;
import p212z4.C6816c;

/* renamed from: com.zykj.mistake.feature.collection.filter.b */
/* loaded from: classes3.dex */
public abstract class AbstractC4641b {
    /* renamed from: a */
    public static final void m4074a(NavBackStackEntry backStackEntry, MainShellViewModel shellViewModel, Composer composer, int i) {
        int i8;
        NavBackStackEntry navBackStackEntry;
        Composer composer2;
        AbstractC5830k.m5330g(backStackEntry, "backStackEntry");
        AbstractC5830k.m5330g(shellViewModel, "shellViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1648837944);
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
                ComposerKt.traceEventStart(-1648837944, i8, -1, "com.zykj.mistake.feature.collection.filter.CollectionFilterResultRoute (CollectionFilterResultRoute.kt:17)");
            }
            boolean zChanged = composerStartRestartGroup.changed(backStackEntry.getId());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (C4661l) NavBackStackEntryKt.toRoute(backStackEntry, AbstractC5832m.m5340a(C4661l.class));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            C4661l c4661l = (C4661l) objRememberedValue;
            navBackStackEntry = backStackEntry;
            MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel = (MistakeCollectionFilterResultViewModel) ViewModelKt.viewModel(AbstractC5832m.m5340a(MistakeCollectionFilterResultViewModel.class), backStackEntry, (String) null, (ViewModelProvider.Factory) null, backStackEntry.getDefaultViewModelCreationExtras(), composerStartRestartGroup, ((i8 & 14) << 3) & 112, 0);
            C6816c c6816c = (C6816c) composerStartRestartGroup.consume(AbstractC6817d.f11545a);
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(mistakeCollectionFilterResultViewModel.f6579d, (LifecycleOwner) null, (Lifecycle.State) null, (InterfaceC5636h) null, composerStartRestartGroup, 0, 7);
            composer2 = composerStartRestartGroup;
            boolean zChangedInstance = composer2.changedInstance(mistakeCollectionFilterResultViewModel) | composer2.changedInstance(c4661l);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1(mistakeCollectionFilterResultViewModel, c4661l, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(mistakeCollectionFilterResultViewModel, (InterfaceC6473e) objRememberedValue2, composer2, 0);
            AbstractC4639a.m4073b(shellViewModel, mistakeCollectionFilterResultViewModel, composer2, (i8 >> 3) & 14);
            AbstractC4639a.m4072a(mistakeCollectionFilterResultViewModel, c6816c, shellViewModel, composer2, (i8 << 3) & 896);
            C4676s0 c4676s0 = (C4676s0) stateCollectAsStateWithLifecycle.getValue();
            boolean zChangedInstance2 = composer2.changedInstance(mistakeCollectionFilterResultViewModel);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new CollectionFilterResultRouteKt$CollectionFilterResultRoute$2$1(mistakeCollectionFilterResultViewModel);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            AbstractC4688y0.m4088f(c4676s0, (InterfaceC6471c) ((InterfaceC6781e) objRememberedValue3), composer2, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4578b(navBackStackEntry, shellViewModel, i, 1));
        }
    }
}
