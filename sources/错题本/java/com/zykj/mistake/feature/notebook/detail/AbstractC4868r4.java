package com.zykj.mistake.feature.notebook.detail;

import android.content.Context;
import android.view.C2764i;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.ViewModelProvider;
import android.view.compose.FlowExtKt;
import android.view.viewmodel.compose.ViewModelKt;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryKt;
import coil3.C3333r;
import coil3.request.CachePolicy;
import com.zykj.mistake.feature.collection.detail.C4578b;
import com.zykj.mistake.main.MainShellViewModel;
import com.zykj.mistake.utils.C5100e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import p016b0.C3071g;
import p075h6.InterfaceC5636h;
import p140q.C6401e;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p154s.C6530d;
import p175u4.C6620g;
import p207y6.InterfaceC6781e;
import p212z4.AbstractC6819f;
import p212z4.C6818e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.r4 */
/* loaded from: classes3.dex */
public abstract class AbstractC4868r4 {
    /* renamed from: a */
    public static final void m4237a(NavBackStackEntry backStackEntry, MainShellViewModel shellViewModel, Composer composer, int i) {
        int i8;
        NavBackStackEntry navBackStackEntry;
        boolean z8;
        C6401e c6401eM2277d;
        Object mistakeDetailRouteKt$MistakeDetailRoute$1$1;
        C6818e c6818e;
        int i9;
        MistakeDetailNewViewModel mistakeDetailNewViewModel;
        Object obj;
        AbstractC5830k.m5330g(backStackEntry, "backStackEntry");
        AbstractC5830k.m5330g(shellViewModel, "shellViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1035064634);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(backStackEntry) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(shellViewModel) ? 32 : 16;
        }
        int i10 = i8;
        if (composerStartRestartGroup.shouldExecute((i10 & 19) != 18, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1035064634, i10, -1, "com.zykj.mistake.feature.notebook.detail.MistakeDetailRoute (MistakeDetailRoute.kt:25)");
            }
            C6620g c6620g = (C6620g) NavBackStackEntryKt.toRoute(backStackEntry, AbstractC5832m.m5340a(C6620g.class));
            int i11 = i10 & 14;
            MistakeDetailNewViewModel mistakeDetailNewViewModel2 = (MistakeDetailNewViewModel) ViewModelKt.viewModel(AbstractC5832m.m5340a(MistakeDetailNewViewModel.class), backStackEntry, (String) null, (ViewModelProvider.Factory) null, backStackEntry.getDefaultViewModelCreationExtras(), composerStartRestartGroup, (i11 << 3) & 112, 0);
            C6818e c6818e2 = (C6818e) composerStartRestartGroup.consume(AbstractC6819f.f11552a);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            String ownerId = backStackEntry.getId();
            boolean zChanged = composerStartRestartGroup.changed(ownerId);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                synchronized (C5100e.f8035a) {
                    AbstractC5830k.m5330g(context, "context");
                    AbstractC5830k.m5330g(ownerId, "ownerId");
                    if (!AbstractC5830k.m5325b(C5100e.f8036b, ownerId) || C5100e.f8037c == null) {
                        C3333r c3333r = C5100e.f8037c;
                        if (c3333r != null && (c6401eM2277d = c3333r.m2277d()) != null) {
                            c6401eM2277d.m6067a();
                        }
                        Context applicationContext = context.getApplicationContext();
                        AbstractC5830k.m5329f(applicationContext, "getApplicationContext(...)");
                        C3071g c3071g = new C3071g(applicationContext);
                        c3071g.f1421c = C6530d.m6183a((C6530d) c3071g.f1421c, CachePolicy.DISABLED, null, 16351);
                        C3333r c3333rM2018b = c3071g.m2018b();
                        C5100e.f8036b = ownerId;
                        C5100e.f8037c = c3333rM2018b;
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                }
                objRememberedValue = Boolean.valueOf(z8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Boolean bool = (Boolean) objRememberedValue;
            boolean zBooleanValue = bool.booleanValue();
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(mistakeDetailNewViewModel2.f6877f, (LifecycleOwner) null, (Lifecycle.State) null, (InterfaceC5636h) null, composerStartRestartGroup, 0, 7);
            boolean zChanged2 = composerStartRestartGroup.changed(zBooleanValue) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(mistakeDetailNewViewModel2) | composerStartRestartGroup.changedInstance(c6620g);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                c6818e = c6818e2;
                i9 = i11;
                navBackStackEntry = backStackEntry;
                mistakeDetailRouteKt$MistakeDetailRoute$1$1 = new MistakeDetailRouteKt$MistakeDetailRoute$1$1(zBooleanValue, context, mistakeDetailNewViewModel2, c6620g, null);
                mistakeDetailNewViewModel = mistakeDetailNewViewModel2;
                obj = c6620g;
                composerStartRestartGroup.updateRememberedValue(mistakeDetailRouteKt$MistakeDetailRoute$1$1);
            } else {
                mistakeDetailNewViewModel = mistakeDetailNewViewModel2;
                obj = c6620g;
                i9 = i11;
                navBackStackEntry = backStackEntry;
                mistakeDetailRouteKt$MistakeDetailRoute$1$1 = objRememberedValue2;
                c6818e = c6818e2;
            }
            EffectsKt.LaunchedEffect(ownerId, bool, (InterfaceC6473e) mistakeDetailRouteKt$MistakeDetailRoute$1$1, composerStartRestartGroup, 0);
            boolean zChanged3 = composerStartRestartGroup.changed(ownerId) | composerStartRestartGroup.changedInstance(obj) | composerStartRestartGroup.changedInstance(navBackStackEntry);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new C2764i(navBackStackEntry, ownerId, 11, obj);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.DisposableEffect(navBackStackEntry, ownerId, (InterfaceC6471c) objRememberedValue3, composerStartRestartGroup, i9);
            AbstractC4785e.m4181a(shellViewModel, mistakeDetailNewViewModel, composerStartRestartGroup, (i10 >> 3) & 14);
            AbstractC4822k0.m4198a(mistakeDetailNewViewModel, shellViewModel, c6818e, composerStartRestartGroup, i10 & 112);
            C4837m3 c4837m3 = (C4837m3) stateCollectAsStateWithLifecycle.getValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(mistakeDetailNewViewModel);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new MistakeDetailRouteKt$MistakeDetailRoute$3$1(mistakeDetailNewViewModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            AbstractC4903x3.m4271a(c4837m3, (InterfaceC6471c) ((InterfaceC6781e) objRememberedValue4), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            navBackStackEntry = backStackEntry;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4578b(navBackStackEntry, shellViewModel, i, 2));
        }
    }
}
