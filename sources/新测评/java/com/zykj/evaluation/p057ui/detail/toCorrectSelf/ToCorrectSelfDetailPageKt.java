package com.zykj.evaluation.p057ui.detail.toCorrectSelf;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.google.gson.Gson;
import com.zykj.evaluation.bean.bundle.AnswerData;
import com.zykj.evaluation.bean.bundle.AnswerSheetBundle;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.p057ui.detail.TaskDetailPageKt;
import com.zykj.evaluation.p057ui.detail.toCorrectSelf.ToCorrectSelfDetailPageKt;
import com.zykj.evaluation.p057ui.guide.normal.toCorrectSelf.ToCorrectSelfGuideViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import p101g7.AbstractC7586b;

/* loaded from: classes4.dex */
public abstract class ToCorrectSelfDetailPageKt {
    /* renamed from: k */
    public static final void m9680k(final long j10, final DetailBundle detailBundle, final NavController navController, final Function6 onClickOpenBoard, final Function1 onClickToAsk, final Function1 requestPermission, ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel, ToCorrectSelfGuideViewModel toCorrectSelfGuideViewModel, Composer composer, final int i10, final int i11) {
        int i12;
        final ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel2;
        ToCorrectSelfGuideViewModel toCorrectSelfGuideViewModel2;
        final ToCorrectSelfGuideViewModel toCorrectSelfGuideViewModel3;
        final ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel3;
        int i13;
        String str;
        int i14;
        ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel4;
        boolean z9;
        final ToCorrectSelfGuideViewModel toCorrectSelfGuideViewModel4;
        int i15;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(onClickOpenBoard, "onClickOpenBoard");
        Intrinsics.checkNotNullParameter(onClickToAsk, "onClickToAsk");
        Intrinsics.checkNotNullParameter(requestPermission, "requestPermission");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1058559184);
        if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(detailBundle) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(navController) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickOpenBoard) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickToAsk) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(requestPermission) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                toCorrectSelfDetailViewModel2 = toCorrectSelfDetailViewModel;
                int i16 = composerStartRestartGroup.changedInstance(toCorrectSelfDetailViewModel2) ? 1048576 : 524288;
                i12 |= i16;
            } else {
                toCorrectSelfDetailViewModel2 = toCorrectSelfDetailViewModel;
            }
            i12 |= i16;
        } else {
            toCorrectSelfDetailViewModel2 = toCorrectSelfDetailViewModel;
        }
        if ((i10 & 12582912) == 0) {
            if ((i11 & 128) == 0) {
                toCorrectSelfGuideViewModel2 = toCorrectSelfGuideViewModel;
                int i17 = composerStartRestartGroup.changedInstance(toCorrectSelfGuideViewModel2) ? 8388608 : 4194304;
                i12 |= i17;
            } else {
                toCorrectSelfGuideViewModel2 = toCorrectSelfGuideViewModel;
            }
            i12 |= i17;
        } else {
            toCorrectSelfGuideViewModel2 = toCorrectSelfGuideViewModel;
        }
        int i18 = i12;
        if (composerStartRestartGroup.shouldExecute((i18 & 4793491) != 4793490, i18 & 1)) {
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
                    ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) ToCorrectSelfDetailViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    i14 = i18 & (-3670017);
                    toCorrectSelfDetailViewModel4 = (ToCorrectSelfDetailViewModel) viewModel;
                } else {
                    i13 = 1890788296;
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    i14 = i18;
                    toCorrectSelfDetailViewModel4 = toCorrectSelfDetailViewModel2;
                }
                if ((i11 & 128) != 0) {
                    composerStartRestartGroup.startReplaceableGroup(i13);
                    ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current2 == null) {
                        throw new IllegalStateException(str);
                    }
                    z9 = false;
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory2 = HiltViewModelKt.createHiltViewModelFactory(current2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel2 = ViewModelKt.viewModel((Class<ViewModel>) ToCorrectSelfGuideViewModel.class, current2, (String) null, factoryCreateHiltViewModelFactory2, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    i15 = i14 & (-29360129);
                    toCorrectSelfGuideViewModel4 = (ToCorrectSelfGuideViewModel) viewModel2;
                    toCorrectSelfDetailViewModel2 = toCorrectSelfDetailViewModel4;
                } else {
                    z9 = false;
                    toCorrectSelfGuideViewModel4 = toCorrectSelfGuideViewModel;
                    toCorrectSelfDetailViewModel2 = toCorrectSelfDetailViewModel4;
                    i15 = i14;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 64) != 0) {
                    i18 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    i18 &= -29360129;
                }
                z9 = false;
                toCorrectSelfGuideViewModel4 = toCorrectSelfGuideViewModel2;
                i15 = i18;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1058559184, i15, -1, "com.zykj.evaluation.ui.detail.toCorrectSelf.ToCorrectSelfDetailPage (ToCorrectSelfDetailPage.kt:33)");
            }
            Unit unit = Unit.INSTANCE;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navController) | composerStartRestartGroup.changedInstance(toCorrectSelfDetailViewModel2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: d6.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ToCorrectSelfDetailPageKt.m9687r(navController, toCorrectSelfDetailViewModel2, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState = (MutableState) objRememberedValue2;
            boolean zChangedInstance2 = ((i15 & 7168) == 2048 ? true : z9) | composerStartRestartGroup.changedInstance(toCorrectSelfDetailViewModel2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function4() { // from class: d6.b
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        return ToCorrectSelfDetailPageKt.m9691v(onClickOpenBoard, toCorrectSelfDetailViewModel2, mutableState, (String) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (String) obj4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function4 function4 = (Function4) objRememberedValue3;
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(toCorrectSelfDetailViewModel2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function2() { // from class: d6.c
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ToCorrectSelfDetailPageKt.m9681l(toCorrectSelfDetailViewModel2, (String) obj, (List) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function2 function2 = (Function2) objRememberedValue4;
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(toCorrectSelfDetailViewModel2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: d6.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ToCorrectSelfDetailPageKt.m9682m(toCorrectSelfDetailViewModel2, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function1 function1 = (Function1) objRememberedValue5;
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(toCorrectSelfDetailViewModel2);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function2() { // from class: d6.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ToCorrectSelfDetailPageKt.m9683n(toCorrectSelfDetailViewModel2, (String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Function2 function22 = (Function2) objRememberedValue6;
            boolean zChangedInstance6 = ((i15 & 14) == 4) | composerStartRestartGroup.changedInstance(toCorrectSelfGuideViewModel4) | composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance6 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function2() { // from class: d6.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ToCorrectSelfDetailPageKt.m9684o(j10, toCorrectSelfGuideViewModel4, navController, (String) obj, (String) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            Function2 function23 = (Function2) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function1() { // from class: d6.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ToCorrectSelfDetailPageKt.m9685p(mutableState, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            int i19 = i15 >> 9;
            int i20 = i15 >> 12;
            ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel5 = toCorrectSelfDetailViewModel2;
            TaskDetailPageKt.m9398m0(j10, detailBundle, navController, toCorrectSelfDetailViewModel5, toCorrectSelfGuideViewModel4, function4, function2, function1, function22, function23, onClickToAsk, requestPermission, (Function1) objRememberedValue8, composerStartRestartGroup, (i19 & 7168) | (i15 & 1022) | (57344 & i19), (i20 & 14) | 384 | (i20 & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            toCorrectSelfDetailViewModel3 = toCorrectSelfDetailViewModel5;
            toCorrectSelfGuideViewModel3 = toCorrectSelfGuideViewModel4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            toCorrectSelfGuideViewModel3 = toCorrectSelfGuideViewModel;
            toCorrectSelfDetailViewModel3 = toCorrectSelfDetailViewModel2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: d6.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ToCorrectSelfDetailPageKt.m9686q(j10, detailBundle, navController, onClickOpenBoard, onClickToAsk, requestPermission, toCorrectSelfDetailViewModel3, toCorrectSelfGuideViewModel3, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: l */
    public static final Unit m9681l(ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel, String uuid, List localAnswer) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(localAnswer, "localAnswer");
        toCorrectSelfDetailViewModel.m9712S0(uuid, localAnswer);
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m9682m(ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel, boolean z9) {
        toCorrectSelfDetailViewModel.m9706M0(z9);
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m9683n(ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel, String uuid, boolean z9) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        toCorrectSelfDetailViewModel.m9711R0(uuid, z9);
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final Unit m9684o(long j10, ToCorrectSelfGuideViewModel toCorrectSelfGuideViewModel, NavController navController, String uuid, String path) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(path, "path");
        AbstractC7586b.m12450a().putString("ANSWER_SHEET_KEY_BUNDLE", new Gson().toJson(new AnswerSheetBundle(j10, toCorrectSelfGuideViewModel.m9777r(), null, 0L, 0, false, uuid, path + "/" + System.currentTimeMillis() + ".webp", 60, null)));
        NavController.navigate$default(navController, "ANSWER_SHEET_COMPOSITION", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final Unit m9685p(MutableState mutableState, boolean z9) {
        m9690u(mutableState, z9);
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final Unit m9686q(long j10, DetailBundle detailBundle, NavController navController, Function6 function6, Function1 function1, Function1 function12, ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel, ToCorrectSelfGuideViewModel toCorrectSelfGuideViewModel, int i10, int i11, Composer composer, int i12) {
        m9680k(j10, detailBundle, navController, function6, function1, function12, toCorrectSelfDetailViewModel, toCorrectSelfGuideViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: r */
    public static final DisposableEffectResult m9687r(NavController navController, final ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        NavBackStackEntry currentBackStackEntry = navController.getCurrentBackStackEntry();
        final SavedStateHandle savedStateHandle = currentBackStackEntry != null ? currentBackStackEntry.getSavedStateHandle() : null;
        final Observer observer = new Observer() { // from class: d6.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ToCorrectSelfDetailPageKt.m9688s(toCorrectSelfDetailViewModel, savedStateHandle, (String) obj);
            }
        };
        final MutableLiveData liveData = savedStateHandle != null ? savedStateHandle.getLiveData("ANSWER_SHEET_RESULT_ANSWER_DATA") : null;
        if (liveData != null) {
            NavBackStackEntry currentBackStackEntry2 = navController.getCurrentBackStackEntry();
            Intrinsics.checkNotNull(currentBackStackEntry2);
            liveData.observe(currentBackStackEntry2, observer);
        }
        return new DisposableEffectResult() { // from class: com.zykj.evaluation.ui.detail.toCorrectSelf.ToCorrectSelfDetailPageKt$ToCorrectSelfDetailPage$lambda$3$lambda$2$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MutableLiveData mutableLiveData = liveData;
                if (mutableLiveData != null) {
                    mutableLiveData.removeObserver(observer);
                }
            }
        };
    }

    /* renamed from: s */
    public static final void m9688s(ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel, SavedStateHandle savedStateHandle, String str) {
        if (str != null) {
            AnswerData answerData = (AnswerData) new Gson().fromJson(str, AnswerData.class);
            toCorrectSelfDetailViewModel.m9712S0(answerData.getUuid(), CollectionsKt.listOf(answerData.getAnswerPath()));
            if (savedStateHandle != null) {
                savedStateHandle.set("ANSWER_SHEET_RESULT_ANSWER_DATA", null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public static final boolean m9689t(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: u */
    public static final void m9690u(MutableState mutableState, boolean z9) {
        mutableState.setValue(Boolean.valueOf(z9));
    }

    /* renamed from: v */
    public static final Unit m9691v(Function6 function6, final ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel, MutableState mutableState, final String uuid, String path, boolean z9, String stemSketchPath) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(stemSketchPath, "stemSketchPath");
        function6.invoke(uuid, path, Boolean.valueOf(z9), stemSketchPath, new Function1() { // from class: d6.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToCorrectSelfDetailPageKt.m9692w(toCorrectSelfDetailViewModel, uuid, (String) obj);
            }
        }, Boolean.valueOf(m9689t(mutableState)));
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final Unit m9692w(ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        toCorrectSelfDetailViewModel.m9712S0(str, CollectionsKt.listOf(str2));
        return Unit.INSTANCE;
    }
}
