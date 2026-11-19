package com.zykj.evaluation.p057ui.detail.done;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavController;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.p057ui.detail.TaskDetailPageKt;
import com.zykj.evaluation.p057ui.detail.done.DoneDetailPageKt;
import com.zykj.evaluation.p057ui.guide.normal.done.DoneGuideViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class DoneDetailPageKt {
    /* renamed from: b */
    public static final void m9471b(final long j10, final boolean z9, final DetailBundle detailBundle, final NavController navController, final Function1 onClickToAsk, final Function1 requestPermission, DoneDetailViewModel doneDetailViewModel, DoneGuideViewModel doneGuideViewModel, Composer composer, final int i10, final int i11) {
        int i12;
        DoneDetailViewModel doneDetailViewModel2;
        DoneGuideViewModel doneGuideViewModel2;
        final DoneGuideViewModel doneGuideViewModel3;
        final DoneDetailViewModel doneDetailViewModel3;
        int i13;
        String str;
        int i14;
        DoneDetailViewModel doneDetailViewModel4;
        boolean z10;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(onClickToAsk, "onClickToAsk");
        Intrinsics.checkNotNullParameter(requestPermission, "requestPermission");
        Composer composerStartRestartGroup = composer.startRestartGroup(-256510809);
        if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(z9) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(detailBundle) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(navController) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickToAsk) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(requestPermission) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                doneDetailViewModel2 = doneDetailViewModel;
                int i15 = composerStartRestartGroup.changedInstance(doneDetailViewModel2) ? 1048576 : 524288;
                i12 |= i15;
            } else {
                doneDetailViewModel2 = doneDetailViewModel;
            }
            i12 |= i15;
        } else {
            doneDetailViewModel2 = doneDetailViewModel;
        }
        if ((12582912 & i10) == 0) {
            if ((i11 & 128) == 0) {
                doneGuideViewModel2 = doneGuideViewModel;
                int i16 = composerStartRestartGroup.changedInstance(doneGuideViewModel2) ? 8388608 : 4194304;
                i12 |= i16;
            } else {
                doneGuideViewModel2 = doneGuideViewModel;
            }
            i12 |= i16;
        } else {
            doneGuideViewModel2 = doneGuideViewModel;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i12) != 4793490, i12 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i11 & 64) != 0) {
                    composerStartRestartGroup.startReplaceableGroup(1890788296);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    i13 = 1890788296;
                    ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) DoneDetailViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    i14 = i12 & (-3670017);
                    doneDetailViewModel4 = (DoneDetailViewModel) viewModel;
                } else {
                    i13 = 1890788296;
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    i14 = i12;
                    doneDetailViewModel4 = doneDetailViewModel2;
                }
                if ((i11 & 128) != 0) {
                    composerStartRestartGroup.startReplaceableGroup(i13);
                    ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current2 == null) {
                        throw new IllegalStateException(str);
                    }
                    z10 = false;
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory2 = HiltViewModelKt.createHiltViewModelFactory(current2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel2 = ViewModelKt.viewModel((Class<ViewModel>) DoneGuideViewModel.class, current2, (String) null, factoryCreateHiltViewModelFactory2, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    doneDetailViewModel3 = doneDetailViewModel4;
                    i12 = i14 & (-29360129);
                    doneGuideViewModel3 = (DoneGuideViewModel) viewModel2;
                } else {
                    z10 = false;
                    doneGuideViewModel3 = doneGuideViewModel;
                    doneDetailViewModel3 = doneDetailViewModel4;
                    i12 = i14;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                }
                z10 = false;
                doneDetailViewModel3 = doneDetailViewModel2;
                doneGuideViewModel3 = doneGuideViewModel2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-256510809, i12, -1, "com.zykj.evaluation.ui.detail.done.DoneDetailPage (DoneDetailPage.kt:23)");
            }
            Unit unit = Unit.INSTANCE;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(doneGuideViewModel3);
            if ((i12 & 112) == 32) {
                z10 = true;
            }
            boolean z11 = z10 | zChangedInstance;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new DoneDetailPageKt$DoneDetailPage$1$1(doneGuideViewModel3, z9, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            int i17 = i12 >> 3;
            int i18 = (i12 & 14) | (i17 & 112) | (i17 & 896);
            int i19 = i12 >> 9;
            TaskDetailPageKt.m9398m0(j10, detailBundle, navController, doneDetailViewModel3, doneGuideViewModel3, null, null, null, null, null, onClickToAsk, requestPermission, null, composerStartRestartGroup, i18 | (i19 & 7168) | (i19 & 57344), (i12 >> 12) & 126, 5088);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            doneGuideViewModel3 = doneGuideViewModel;
            doneDetailViewModel3 = doneDetailViewModel2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: y5.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DoneDetailPageKt.m9472c(j10, z9, detailBundle, navController, onClickToAsk, requestPermission, doneDetailViewModel3, doneGuideViewModel3, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: c */
    public static final Unit m9472c(long j10, boolean z9, DetailBundle detailBundle, NavController navController, Function1 function1, Function1 function12, DoneDetailViewModel doneDetailViewModel, DoneGuideViewModel doneGuideViewModel, int i10, int i11, Composer composer, int i12) {
        m9471b(j10, z9, detailBundle, navController, function1, function12, doneDetailViewModel, doneGuideViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
