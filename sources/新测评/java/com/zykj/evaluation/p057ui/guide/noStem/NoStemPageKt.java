package com.zykj.evaluation.p057ui.guide.noStem;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.zykj.evaluation.p057ui.guide.noStem.NoStemPageKt;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p101g7.AbstractC7586b;
import p122i6.AbstractC7689k0;
import p122i6.C7670b;
import p122i6.C7697o0;

/* loaded from: classes4.dex */
public abstract class NoStemPageKt {
    /* renamed from: j */
    public static final void m9795j(Modifier modifier, final List groups, final Set set, final Function3 function3, final Function1 function1, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Modifier modifier3;
        Set failedUuidsSet = set;
        Function3 onClickOpenBoard = function3;
        Function1 onClickQuestionDescription = function1;
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(failedUuidsSet, "failedUuidsSet");
        Intrinsics.checkNotNullParameter(onClickOpenBoard, "onClickOpenBoard");
        Intrinsics.checkNotNullParameter(onClickQuestionDescription, "onClickQuestionDescription");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1621900522);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(groups) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(failedUuidsSet) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickOpenBoard) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickQuestionDescription) ? 16384 : 8192;
        }
        int i14 = i12;
        if (composerStartRestartGroup.shouldExecute((i14 & 9363) != 9362, i14 & 1)) {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1621900522, i14, -1, "com.zykj.evaluation.ui.guide.noStem.NoStemContent (NoStemPage.kt:117)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17681padding3ABfNKs = PaddingKt.m17681padding3ABfNKs(modifierVerticalScroll$default, C3127Dp.m23561constructorimpl((9 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17681padding3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-513176934);
            Iterator it = groups.iterator();
            while (it.hasNext()) {
                C7670b c7670b = (C7670b) it.next();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Function1 function12 = onClickQuestionDescription;
                AbstractC7689k0.m12814B(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), c7670b, onClickOpenBoard, failedUuidsSet, function12, null, composerStartRestartGroup, (57344 & i14) | ((i14 >> 3) & 896) | 6 | ((i14 << 3) & 7168), 32);
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion2, C3127Dp.m23561constructorimpl((5 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
                failedUuidsSet = set;
                onClickOpenBoard = function3;
                onClickQuestionDescription = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: i6.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NoStemPageKt.m9796k(modifier3, groups, set, function3, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: k */
    public static final Unit m9796k(Modifier modifier, List list, Set set, Function3 function3, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m9795j(modifier, list, set, function3, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ba  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9797l(final androidx.navigation.NavController r19, final long r20, final kotlin.jvm.functions.Function4 r22, com.zykj.evaluation.p057ui.guide.noStem.NoStemViewModel r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.guide.noStem.NoStemPageKt.m9797l(androidx.navigation.NavController, long, kotlin.jvm.functions.Function4, com.zykj.evaluation.ui.guide.noStem.NoStemViewModel, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/guide/noStem/NoStemPageKt.smali:1250
    }

    /* renamed from: m */
    public static final Set m9798m(State state) {
        return (Set) state.getValue();
    }

    /* renamed from: n */
    public static final Unit m9799n(C7697o0 c7697o0, final Function4 function4, final NoStemViewModel noStemViewModel, final NavController navController, State state, RowScope GuideView, Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(GuideView, "$this$GuideView");
        if ((i10 & 6) == 0) {
            i11 = i10 | (composer.changed(GuideView) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(955703915, i11, -1, "com.zykj.evaluation.ui.guide.noStem.NoStemPage.<anonymous> (NoStemPage.kt:81)");
            }
            Modifier modifierWeight$default = RowScope.weight$default(GuideView, Modifier.INSTANCE, 1.0f, false, 2, null);
            List listM12880b = c7697o0.m12880b();
            Set setM9798m = m9798m(state);
            boolean zChanged = composer.changed(function4) | composer.changedInstance(noStemViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function3() { // from class: i6.g
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return NoStemPageKt.m9800o(function4, noStemViewModel, (String) obj, (String) obj2, ((Boolean) obj3).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function3 function3 = (Function3) objRememberedValue;
            boolean zChangedInstance = composer.changedInstance(navController);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: i6.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NoStemPageKt.m9802q(navController, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            m9795j(modifierWeight$default, listM12880b, setM9798m, function3, (Function1) objRememberedValue2, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final Unit m9800o(Function4 function4, final NoStemViewModel noStemViewModel, final String uuid, String path, boolean z9) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(path, "path");
        function4.invoke(uuid, path, Boolean.valueOf(z9), new Function1() { // from class: i6.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NoStemPageKt.m9801p(noStemViewModel, uuid, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final Unit m9801p(NoStemViewModel noStemViewModel, String str, String str2) {
        noStemViewModel.m9834c0(str, CollectionsKt.listOf(str2 == null ? "" : str2));
        if (str2 != null) {
            noStemViewModel.m9836f0(str, str2);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final Unit m9802q(NavController navController, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AbstractC7586b.m12450a().putString("DESCRIPTION_KEY_CONTENT", it);
        NavController.navigate$default(navController, "DESCRIPTION/大题说明", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: r */
    public static final Unit m9803r(NavController navController, long j10, Function4 function4, NoStemViewModel noStemViewModel, int i10, int i11, Composer composer, int i12) {
        m9797l(navController, j10, function4, noStemViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public static final DisposableEffectResult m9804s(final NavController navController, final NoStemViewModel noStemViewModel, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        NavBackStackEntry currentBackStackEntry = navController.getCurrentBackStackEntry();
        final SavedStateHandle savedStateHandle = currentBackStackEntry != null ? currentBackStackEntry.getSavedStateHandle() : null;
        final Observer observer = new Observer() { // from class: i6.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NoStemPageKt.m9805t(noStemViewModel, navController, savedStateHandle, (String) obj);
            }
        };
        final MutableLiveData liveData = savedStateHandle != null ? savedStateHandle.getLiveData("SUBMIT_RESULT") : null;
        if (liveData != null) {
            NavBackStackEntry currentBackStackEntry2 = navController.getCurrentBackStackEntry();
            Intrinsics.checkNotNull(currentBackStackEntry2);
            liveData.observe(currentBackStackEntry2, observer);
        }
        return new DisposableEffectResult() { // from class: com.zykj.evaluation.ui.guide.noStem.NoStemPageKt$NoStemPage$lambda$5$lambda$4$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MutableLiveData mutableLiveData = liveData;
                if (mutableLiveData != null) {
                    mutableLiveData.removeObserver(observer);
                }
            }
        };
    }

    /* renamed from: t */
    public static final void m9805t(NoStemViewModel noStemViewModel, NavController navController, SavedStateHandle savedStateHandle, String str) {
        if (str != null) {
            noStemViewModel.m9832a0();
            navController.navigateUp();
            if (savedStateHandle != null) {
                savedStateHandle.set("SUBMIT_RESULT", null);
            }
        }
    }

    /* renamed from: u */
    public static final Unit m9806u(NoStemViewModel noStemViewModel, NavController navController, State state) {
        NavController.navigate$default(navController, "SUBMIT/" + noStemViewModel.m9828W() + "/true?SUBMIT_KEY_COMMIT_FAILED=" + (!m9798m(state).isEmpty()), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }
}
