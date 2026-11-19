package com.zykj.evaluation.p057ui.detail.toCorrect;

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
import com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailPageKt;
import com.zykj.evaluation.p057ui.guide.normal.toCorrect.ToCorrectGuideViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import p101g7.AbstractC7586b;

/* loaded from: classes4.dex */
public abstract class ToCorrectDetailPageKt {
    /* renamed from: j */
    public static final void m9635j(final long j10, final DetailBundle detailBundle, final NavController navController, final Function7 onClickOpenBoard, final Function1 onClickToAsk, final Function1 requestPermission, ToCorrectDetailViewModel toCorrectDetailViewModel, ToCorrectGuideViewModel toCorrectGuideViewModel, Composer composer, final int i10, final int i11) {
        int i12;
        final ToCorrectDetailViewModel toCorrectDetailViewModel2;
        ToCorrectGuideViewModel toCorrectGuideViewModel2;
        final ToCorrectGuideViewModel toCorrectGuideViewModel3;
        final ToCorrectDetailViewModel toCorrectDetailViewModel3;
        int i13;
        String str;
        int i14;
        ToCorrectDetailViewModel toCorrectDetailViewModel4;
        boolean z9;
        final ToCorrectGuideViewModel toCorrectGuideViewModel4;
        int i15;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(onClickOpenBoard, "onClickOpenBoard");
        Intrinsics.checkNotNullParameter(onClickToAsk, "onClickToAsk");
        Intrinsics.checkNotNullParameter(requestPermission, "requestPermission");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1662848635);
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
                toCorrectDetailViewModel2 = toCorrectDetailViewModel;
                int i16 = composerStartRestartGroup.changedInstance(toCorrectDetailViewModel2) ? 1048576 : 524288;
                i12 |= i16;
            } else {
                toCorrectDetailViewModel2 = toCorrectDetailViewModel;
            }
            i12 |= i16;
        } else {
            toCorrectDetailViewModel2 = toCorrectDetailViewModel;
        }
        if ((i10 & 12582912) == 0) {
            if ((i11 & 128) == 0) {
                toCorrectGuideViewModel2 = toCorrectGuideViewModel;
                int i17 = composerStartRestartGroup.changedInstance(toCorrectGuideViewModel2) ? 8388608 : 4194304;
                i12 |= i17;
            } else {
                toCorrectGuideViewModel2 = toCorrectGuideViewModel;
            }
            i12 |= i17;
        } else {
            toCorrectGuideViewModel2 = toCorrectGuideViewModel;
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
                    ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) ToCorrectDetailViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    i14 = i18 & (-3670017);
                    toCorrectDetailViewModel4 = (ToCorrectDetailViewModel) viewModel;
                } else {
                    i13 = 1890788296;
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    i14 = i18;
                    toCorrectDetailViewModel4 = toCorrectDetailViewModel2;
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
                    ViewModel viewModel2 = ViewModelKt.viewModel((Class<ViewModel>) ToCorrectGuideViewModel.class, current2, (String) null, factoryCreateHiltViewModelFactory2, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    i15 = i14 & (-29360129);
                    toCorrectGuideViewModel4 = (ToCorrectGuideViewModel) viewModel2;
                    toCorrectDetailViewModel2 = toCorrectDetailViewModel4;
                } else {
                    z9 = false;
                    toCorrectGuideViewModel4 = toCorrectGuideViewModel;
                    toCorrectDetailViewModel2 = toCorrectDetailViewModel4;
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
                toCorrectGuideViewModel4 = toCorrectGuideViewModel2;
                i15 = i18;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1662848635, i15, -1, "com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailPage (ToCorrectDetailPage.kt:34)");
            }
            Unit unit = Unit.INSTANCE;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navController) | composerStartRestartGroup.changedInstance(toCorrectDetailViewModel2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: c6.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ToCorrectDetailPageKt.m9641p(navController, toCorrectDetailViewModel2, (DisposableEffectScope) obj);
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
            boolean zChangedInstance2 = ((i15 & 7168) == 2048 ? true : z9) | composerStartRestartGroup.changedInstance(toCorrectDetailViewModel2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function4() { // from class: c6.b
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        return ToCorrectDetailPageKt.m9645t(onClickOpenBoard, toCorrectDetailViewModel2, mutableState, (String) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (String) obj4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function4 function4 = (Function4) objRememberedValue3;
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(toCorrectDetailViewModel2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function2() { // from class: c6.c
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ToCorrectDetailPageKt.m9636k(toCorrectDetailViewModel2, (String) obj, (List) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function2 function2 = (Function2) objRememberedValue4;
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(toCorrectDetailViewModel2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: c6.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ToCorrectDetailPageKt.m9637l(toCorrectDetailViewModel2, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function1 function1 = (Function1) objRememberedValue5;
            boolean zChangedInstance5 = ((i15 & 14) == 4) | composerStartRestartGroup.changedInstance(toCorrectGuideViewModel4) | composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function2() { // from class: c6.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ToCorrectDetailPageKt.m9638m(j10, toCorrectGuideViewModel4, navController, (String) obj, (String) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Function2 function22 = (Function2) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function1() { // from class: c6.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ToCorrectDetailPageKt.m9639n(mutableState, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            int i19 = i15 >> 9;
            int i20 = i15 >> 12;
            ToCorrectDetailViewModel toCorrectDetailViewModel5 = toCorrectDetailViewModel2;
            TaskDetailPageKt.m9398m0(j10, detailBundle, navController, toCorrectDetailViewModel5, toCorrectGuideViewModel4, function4, function2, function1, null, function22, onClickToAsk, requestPermission, (Function1) objRememberedValue7, composerStartRestartGroup, (i19 & 7168) | (i15 & 1022) | (57344 & i19), (i20 & 14) | 384 | (i20 & 112), 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            toCorrectDetailViewModel3 = toCorrectDetailViewModel5;
            toCorrectGuideViewModel3 = toCorrectGuideViewModel4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            toCorrectGuideViewModel3 = toCorrectGuideViewModel;
            toCorrectDetailViewModel3 = toCorrectDetailViewModel2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: c6.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ToCorrectDetailPageKt.m9640o(j10, detailBundle, navController, onClickOpenBoard, onClickToAsk, requestPermission, toCorrectDetailViewModel3, toCorrectGuideViewModel3, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: k */
    public static final Unit m9636k(ToCorrectDetailViewModel toCorrectDetailViewModel, String uuid, List localAnswer) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(localAnswer, "localAnswer");
        toCorrectDetailViewModel.m9669V0(uuid, localAnswer);
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m9637l(ToCorrectDetailViewModel toCorrectDetailViewModel, boolean z9) {
        toCorrectDetailViewModel.m9660M0(z9);
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m9638m(long j10, ToCorrectGuideViewModel toCorrectGuideViewModel, NavController navController, String uuid, String path) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(path, "path");
        AbstractC7586b.m12450a().putString("ANSWER_SHEET_KEY_BUNDLE", new Gson().toJson(new AnswerSheetBundle(j10, toCorrectGuideViewModel.m9777r(), null, 0L, 0, false, uuid, path + "/" + System.currentTimeMillis() + ".webp", 60, null)));
        NavController.navigate$default(navController, "ANSWER_SHEET_COMPOSITION", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m9639n(MutableState mutableState, boolean z9) {
        m9644s(mutableState, z9);
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final Unit m9640o(long j10, DetailBundle detailBundle, NavController navController, Function7 function7, Function1 function1, Function1 function12, ToCorrectDetailViewModel toCorrectDetailViewModel, ToCorrectGuideViewModel toCorrectGuideViewModel, int i10, int i11, Composer composer, int i12) {
        m9635j(j10, detailBundle, navController, function7, function1, function12, toCorrectDetailViewModel, toCorrectGuideViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final DisposableEffectResult m9641p(NavController navController, final ToCorrectDetailViewModel toCorrectDetailViewModel, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        NavBackStackEntry currentBackStackEntry = navController.getCurrentBackStackEntry();
        final SavedStateHandle savedStateHandle = currentBackStackEntry != null ? currentBackStackEntry.getSavedStateHandle() : null;
        final Observer observer = new Observer() { // from class: c6.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ToCorrectDetailPageKt.m9642q(toCorrectDetailViewModel, savedStateHandle, (String) obj);
            }
        };
        final MutableLiveData liveData = savedStateHandle != null ? savedStateHandle.getLiveData("ANSWER_SHEET_RESULT_ANSWER_DATA") : null;
        if (liveData != null) {
            NavBackStackEntry currentBackStackEntry2 = navController.getCurrentBackStackEntry();
            Intrinsics.checkNotNull(currentBackStackEntry2);
            liveData.observe(currentBackStackEntry2, observer);
        }
        return new DisposableEffectResult() { // from class: com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailPageKt$ToCorrectDetailPage$lambda$3$lambda$2$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MutableLiveData mutableLiveData = liveData;
                if (mutableLiveData != null) {
                    mutableLiveData.removeObserver(observer);
                }
            }
        };
    }

    /* renamed from: q */
    public static final void m9642q(ToCorrectDetailViewModel toCorrectDetailViewModel, SavedStateHandle savedStateHandle, String str) {
        if (str != null) {
            AnswerData answerData = (AnswerData) new Gson().fromJson(str, AnswerData.class);
            toCorrectDetailViewModel.m9669V0(answerData.getUuid(), CollectionsKt.listOf(answerData.getAnswerPath()));
            if (savedStateHandle != null) {
                savedStateHandle.set("ANSWER_SHEET_RESULT_ANSWER_DATA", null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public static final boolean m9643r(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: s */
    public static final void m9644s(MutableState mutableState, boolean z9) {
        mutableState.setValue(Boolean.valueOf(z9));
    }

    /* renamed from: t */
    public static final Unit m9645t(Function7 function7, final ToCorrectDetailViewModel toCorrectDetailViewModel, MutableState mutableState, final String uuid, String path, boolean z9, String stemSketchPath) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(stemSketchPath, "stemSketchPath");
        function7.invoke(uuid, path, Boolean.valueOf(z9), stemSketchPath, new Function1() { // from class: c6.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToCorrectDetailPageKt.m9646u(toCorrectDetailViewModel, uuid, (String) obj);
            }
        }, new ToCorrectDetailPageKt$ToCorrectDetailPage$2$1$2(toCorrectDetailViewModel, uuid, null), Boolean.valueOf(m9643r(mutableState)));
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final Unit m9646u(ToCorrectDetailViewModel toCorrectDetailViewModel, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        toCorrectDetailViewModel.m9669V0(str, CollectionsKt.listOf(str2));
        return Unit.INSTANCE;
    }
}
