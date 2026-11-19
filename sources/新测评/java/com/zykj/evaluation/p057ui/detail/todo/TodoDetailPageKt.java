package com.zykj.evaluation.p057ui.detail.todo;

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
import com.zykj.evaluation.p057ui.detail.todo.TodoDetailPageKt;
import com.zykj.evaluation.p057ui.guide.normal.toDo.TodoGuideViewModel;
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
public abstract class TodoDetailPageKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* renamed from: i */
    public static final void m9722i(final long j10, final DetailBundle detailBundle, final NavController navController, final Function6 onClickOpenBoard, TodoDetailViewModel todoDetailViewModel, TodoGuideViewModel todoGuideViewModel, Composer composer, final int i10, final int i11) {
        int i12;
        final TodoDetailViewModel todoDetailViewModel2;
        TodoGuideViewModel todoGuideViewModel2;
        final TodoGuideViewModel todoGuideViewModel3;
        final TodoDetailViewModel todoDetailViewModel3;
        ?? r52;
        int i13;
        TodoDetailViewModel todoDetailViewModel4;
        boolean z9;
        int i14;
        final TodoGuideViewModel todoGuideViewModel4;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(onClickOpenBoard, "onClickOpenBoard");
        Composer composerStartRestartGroup = composer.startRestartGroup(-6683025);
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
            if ((i11 & 16) == 0) {
                todoDetailViewModel2 = todoDetailViewModel;
                int i15 = composerStartRestartGroup.changedInstance(todoDetailViewModel2) ? 16384 : 8192;
                i12 |= i15;
            } else {
                todoDetailViewModel2 = todoDetailViewModel;
            }
            i12 |= i15;
        } else {
            todoDetailViewModel2 = todoDetailViewModel;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                todoGuideViewModel2 = todoGuideViewModel;
                int i16 = composerStartRestartGroup.changedInstance(todoGuideViewModel2) ? 131072 : 65536;
                i12 |= i16;
            } else {
                todoGuideViewModel2 = todoGuideViewModel;
            }
            i12 |= i16;
        } else {
            todoGuideViewModel2 = todoGuideViewModel;
        }
        int i17 = i12;
        if (composerStartRestartGroup.shouldExecute((i17 & 74899) != 74898, i17 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i11 & 16) != 0) {
                    composerStartRestartGroup.startReplaceableGroup(1890788296);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    r52 = 0;
                    ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) TodoDetailViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    i13 = i17 & (-57345);
                    todoDetailViewModel4 = (TodoDetailViewModel) viewModel;
                } else {
                    r52 = 0;
                    i13 = i17;
                    todoDetailViewModel4 = todoDetailViewModel2;
                }
                if ((i11 & 32) != 0) {
                    composerStartRestartGroup.startReplaceableGroup(1890788296);
                    ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current2 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory2 = HiltViewModelKt.createHiltViewModelFactory(current2, composerStartRestartGroup, r52);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel2 = ViewModelKt.viewModel((Class<ViewModel>) TodoGuideViewModel.class, current2, (String) null, factoryCreateHiltViewModelFactory2, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    i14 = i13 & (-458753);
                    z9 = r52;
                    todoGuideViewModel4 = (TodoGuideViewModel) viewModel2;
                    todoDetailViewModel2 = todoDetailViewModel4;
                } else {
                    z9 = r52;
                    todoDetailViewModel2 = todoDetailViewModel4;
                    i14 = i13;
                    todoGuideViewModel4 = todoGuideViewModel;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 16) != 0) {
                    i17 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i17 &= -458753;
                }
                todoGuideViewModel4 = todoGuideViewModel2;
                z9 = false;
                i14 = i17;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-6683025, i14, -1, "com.zykj.evaluation.ui.detail.todo.TodoDetailPage (TodoDetailPage.kt:31)");
            }
            Unit unit = Unit.INSTANCE;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navController) | composerStartRestartGroup.changedInstance(todoDetailViewModel2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: e6.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TodoDetailPageKt.m9727n(navController, todoDetailViewModel2, (DisposableEffectScope) obj);
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
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(todoDetailViewModel2) | ((i14 & 7168) == 2048 ? true : z9);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function4() { // from class: e6.b
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        return TodoDetailPageKt.m9731r(onClickOpenBoard, todoDetailViewModel2, mutableState, (String) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (String) obj4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function4 function4 = (Function4) objRememberedValue3;
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(todoDetailViewModel2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function2() { // from class: e6.c
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TodoDetailPageKt.m9723j(todoDetailViewModel2, (String) obj, (List) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function2 function2 = (Function2) objRememberedValue4;
            if ((i14 & 14) == 4) {
                z9 = true;
            }
            boolean zChangedInstance4 = z9 | composerStartRestartGroup.changedInstance(todoGuideViewModel4) | composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function2() { // from class: e6.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TodoDetailPageKt.m9724k(j10, todoGuideViewModel4, navController, (String) obj, (String) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function2 function22 = (Function2) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: e6.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TodoDetailPageKt.m9725l(mutableState, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            int i18 = i14 & 1022;
            int i19 = i14 >> 3;
            TodoDetailViewModel todoDetailViewModel5 = todoDetailViewModel2;
            TaskDetailPageKt.m9398m0(j10, detailBundle, navController, todoDetailViewModel5, todoGuideViewModel4, function4, function2, null, null, function22, null, null, (Function1) objRememberedValue6, composerStartRestartGroup, i18 | (i19 & 7168) | (i19 & 57344), 384, 3456);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            todoDetailViewModel3 = todoDetailViewModel5;
            todoGuideViewModel3 = todoGuideViewModel4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            todoGuideViewModel3 = todoGuideViewModel;
            todoDetailViewModel3 = todoDetailViewModel2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: e6.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TodoDetailPageKt.m9726m(j10, detailBundle, navController, onClickOpenBoard, todoDetailViewModel3, todoGuideViewModel3, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: j */
    public static final Unit m9723j(TodoDetailViewModel todoDetailViewModel, String uuid, List localAnswer) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(localAnswer, "localAnswer");
        todoDetailViewModel.m9747N0(uuid, localAnswer);
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m9724k(long j10, TodoGuideViewModel todoGuideViewModel, NavController navController, String uuid, String path) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(path, "path");
        AbstractC7586b.m12450a().putString("ANSWER_SHEET_KEY_BUNDLE", new Gson().toJson(new AnswerSheetBundle(j10, todoGuideViewModel.m9777r(), null, 0L, 0, false, uuid, path + "/" + System.currentTimeMillis() + ".webp", 60, null)));
        NavController.navigate$default(navController, "ANSWER_SHEET_COMPOSITION", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m9725l(MutableState mutableState, boolean z9) {
        m9730q(mutableState, z9);
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m9726m(long j10, DetailBundle detailBundle, NavController navController, Function6 function6, TodoDetailViewModel todoDetailViewModel, TodoGuideViewModel todoGuideViewModel, int i10, int i11, Composer composer, int i12) {
        m9722i(j10, detailBundle, navController, function6, todoDetailViewModel, todoGuideViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final DisposableEffectResult m9727n(NavController navController, final TodoDetailViewModel todoDetailViewModel, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        NavBackStackEntry currentBackStackEntry = navController.getCurrentBackStackEntry();
        final SavedStateHandle savedStateHandle = currentBackStackEntry != null ? currentBackStackEntry.getSavedStateHandle() : null;
        final Observer observer = new Observer() { // from class: e6.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TodoDetailPageKt.m9728o(todoDetailViewModel, savedStateHandle, (String) obj);
            }
        };
        final MutableLiveData liveData = savedStateHandle != null ? savedStateHandle.getLiveData("ANSWER_SHEET_RESULT_ANSWER_DATA") : null;
        if (liveData != null) {
            NavBackStackEntry currentBackStackEntry2 = navController.getCurrentBackStackEntry();
            Intrinsics.checkNotNull(currentBackStackEntry2);
            liveData.observe(currentBackStackEntry2, observer);
        }
        return new DisposableEffectResult() { // from class: com.zykj.evaluation.ui.detail.todo.TodoDetailPageKt$TodoDetailPage$lambda$3$lambda$2$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MutableLiveData mutableLiveData = liveData;
                if (mutableLiveData != null) {
                    mutableLiveData.removeObserver(observer);
                }
            }
        };
    }

    /* renamed from: o */
    public static final void m9728o(TodoDetailViewModel todoDetailViewModel, SavedStateHandle savedStateHandle, String str) {
        if (str != null) {
            AnswerData answerData = (AnswerData) new Gson().fromJson(str, AnswerData.class);
            todoDetailViewModel.m9747N0(answerData.getUuid(), CollectionsKt.listOf(answerData.getAnswerPath()));
            if (savedStateHandle != null) {
                savedStateHandle.set("ANSWER_SHEET_RESULT_ANSWER_DATA", null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static final boolean m9729p(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: q */
    public static final void m9730q(MutableState mutableState, boolean z9) {
        mutableState.setValue(Boolean.valueOf(z9));
    }

    /* renamed from: r */
    public static final Unit m9731r(Function6 function6, final TodoDetailViewModel todoDetailViewModel, MutableState mutableState, final String uuid, String path, boolean z9, String stemSketchPath) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(stemSketchPath, "stemSketchPath");
        function6.invoke(uuid, path, Boolean.valueOf(z9), stemSketchPath, new Function1() { // from class: e6.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TodoDetailPageKt.m9732s(todoDetailViewModel, uuid, (String) obj);
            }
        }, Boolean.valueOf(m9729p(mutableState)));
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public static final Unit m9732s(TodoDetailViewModel todoDetailViewModel, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        todoDetailViewModel.m9747N0(str, CollectionsKt.listOf(str2));
        return Unit.INSTANCE;
    }
}
