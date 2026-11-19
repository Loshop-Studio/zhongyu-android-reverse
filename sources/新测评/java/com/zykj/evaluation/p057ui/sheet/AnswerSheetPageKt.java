package com.zykj.evaluation.p057ui.sheet;

import android.content.res.Resources;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.window.DialogProperties;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavGraphBuilderKt;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.evaluation.p057ui.sheet.AnswerSheetPageKt;
import com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel;
import com.zykj.evaluation.p057ui.sheet.preview.PreviewPageKt;
import com.zykj.evaluation.p057ui.sheet.widget.AnswerSheetViewKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import p026b7.C4997c1;
import p079e7.AbstractC7384h;
import p101g7.AbstractC7586b;
import p156l5.C8508c;
import p267v6.AbstractC9690j0;
import p267v6.AbstractC9706w;
import p267v6.C9705v;
import p307z6.AbstractC10053b0;
import p307z6.AbstractC10065n;
import p307z6.AbstractC10070s;
import p307z6.AbstractC10074w;

/* loaded from: classes4.dex */
public abstract class AnswerSheetPageKt {
    /* renamed from: A */
    public static final Unit m10126A(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final Unit m10127B(NavHostController navHostController, AnswerSheetViewModel answerSheetViewModel, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1223839188, i10, -1, "com.zykj.evaluation.ui.sheet.AnswerSheetPage.<anonymous>.<anonymous>.<anonymous> (AnswerSheetPage.kt:111)");
        }
        AbstractC9690j0.m16194l(navHostController, answerSheetViewModel, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public static final Unit m10128C(NavHostController navHostController, AnswerSheetViewModel answerSheetViewModel, NavBackStackEntry it, Composer composer, int i10) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(322714007, i10, -1, "com.zykj.evaluation.ui.sheet.AnswerSheetPage.<anonymous>.<anonymous>.<anonymous> (AnswerSheetPage.kt:119)");
        }
        AbstractC10074w.m16946d(navHostController, answerSheetViewModel, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: D */
    public static final Unit m10129D(NavHostController navHostController, AnswerSheetViewModel answerSheetViewModel, NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1805318962, i10, -1, "com.zykj.evaluation.ui.sheet.AnswerSheetPage.<anonymous>.<anonymous>.<anonymous> (AnswerSheetPage.kt:127)");
        }
        AbstractC10053b0.m16902e(navHostController, answerSheetViewModel, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: E */
    public static final Unit m10130E(NavHostController navHostController, AnswerSheetViewModel answerSheetViewModel, NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1682415025, i10, -1, "com.zykj.evaluation.ui.sheet.AnswerSheetPage.<anonymous>.<anonymous>.<anonymous> (AnswerSheetPage.kt:135)");
        }
        AbstractC10070s.m16938e(navHostController, answerSheetViewModel, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final Unit m10131F(AnswerSheetViewModel answerSheetViewModel, NavHostController navHostController, NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1559511088, i10, -1, "com.zykj.evaluation.ui.sheet.AnswerSheetPage.<anonymous>.<anonymous>.<anonymous> (AnswerSheetPage.kt:143)");
        }
        if (answerSheetViewModel instanceof NormalViewModel) {
            composer.startReplaceGroup(-733529012);
            AbstractC10065n.m16923j(navHostController, (NormalViewModel) answerSheetViewModel, composer, 0);
        } else {
            composer.startReplaceGroup(-738185646);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: G */
    public static final Unit m10132G(Function1 function1, NavHostController navHostController, AnswerSheetViewModel answerSheetViewModel, Function0 function0, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1267868492, i10, -1, "com.zykj.evaluation.ui.sheet.AnswerSheetPage.<anonymous>.<anonymous>.<anonymous> (AnswerSheetPage.kt:89)");
        }
        m10166w(function1, navHostController, answerSheetViewModel, function0, composer, 3072);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: H */
    public static final Unit m10133H(String str, NavController navController, Function1 function1, AnswerSheetViewModel answerSheetViewModel, Function1 function12, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m10165v(str, navController, function1, answerSheetViewModel, function12, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: I */
    public static final Unit m10134I(AnswerSheetViewModel answerSheetViewModel, Function0 function0, NavController navController) {
        if (answerSheetViewModel.m10183K()) {
            function0.invoke();
        } else {
            answerSheetViewModel.m10197n();
            navController.popBackStack();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: J */
    public static final Unit m10135J(AnswerSheetViewModel answerSheetViewModel) {
        answerSheetViewModel.m8646c();
        return Unit.INSTANCE;
    }

    /* renamed from: K */
    public static final Unit m10136K(C9705v c9705v, Function1 function1, final AnswerSheetViewModel answerSheetViewModel, final NavController navController, BoxScope BoxWithLoadState, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(BoxWithLoadState, "$this$BoxWithLoadState");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1587831788, i10, -1, "com.zykj.evaluation.ui.sheet.AnswerSheetPage.<anonymous> (AnswerSheetPage.kt:182)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            AbstractC9706w abstractC9706wM16212c = c9705v.m16212c();
            int iM16213d = c9705v.m16213d();
            boolean zChangedInstance = composer.changedInstance(answerSheetViewModel) | composer.changedInstance(navController);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: v6.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AnswerSheetPageKt.m10137L(answerSheetViewModel, navController, (C4997c1) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function12 = (Function1) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(answerSheetViewModel) | composer.changedInstance(navController);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: v6.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AnswerSheetPageKt.m10139N(answerSheetViewModel, navController, (C4997c1) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            AnswerSheetViewKt.m10340C(modifierFillMaxSize$default, abstractC9706wM16212c, iM16213d, function1, function12, (Function1) objRememberedValue2, null, composer, 6, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: L */
    public static final Unit m10137L(AnswerSheetViewModel answerSheetViewModel, final NavController navController, C4997c1 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        answerSheetViewModel.mo10179G(result, new Function0() { // from class: v6.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnswerSheetPageKt.m10138M(navController);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: M */
    public static final Unit m10138M(NavController navController) {
        LogUtils.m3239i("扫描成功返回");
        NavBackStackEntry previousBackStackEntry = navController.getPreviousBackStackEntry();
        SavedStateHandle savedStateHandle = previousBackStackEntry != null ? previousBackStackEntry.getSavedStateHandle() : null;
        navController.popBackStack();
        if (savedStateHandle != null) {
            savedStateHandle.set("ANSWER_SHEET_KEY_BACK", "ANSWER_SHEET_KEY_BACK_TAKE_PHOTO_RESULT");
        }
        return Unit.INSTANCE;
    }

    /* renamed from: N */
    public static final Unit m10139N(AnswerSheetViewModel answerSheetViewModel, final NavController navController, C4997c1 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        answerSheetViewModel.m10178F(result, new Function0() { // from class: v6.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnswerSheetPageKt.m10140O(navController);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: O */
    public static final Unit m10140O(NavController navController) {
        LogUtils.m3239i("扫描失败返回");
        NavBackStackEntry previousBackStackEntry = navController.getPreviousBackStackEntry();
        SavedStateHandle savedStateHandle = previousBackStackEntry != null ? previousBackStackEntry.getSavedStateHandle() : null;
        navController.popBackStack();
        if (savedStateHandle != null) {
            savedStateHandle.set("ANSWER_SHEET_KEY_BACK", "ANSWER_SHEET_KEY_BACK_TAKE_PHOTO_RESULT");
        }
        return Unit.INSTANCE;
    }

    /* renamed from: P */
    public static final Unit m10141P(Function1 function1, NavController navController, AnswerSheetViewModel answerSheetViewModel, Function0 function0, int i10, Composer composer, int i11) {
        m10166w(function1, navController, answerSheetViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: Q */
    public static final boolean m10142Q(State state) {
        NavDestination destination;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) state.getValue();
        return Intrinsics.areEqual((navBackStackEntry == null || (destination = navBackStackEntry.getDestination()) == null) ? null : destination.getRoute(), "ANSWER_SHEET_PREVIEW");
    }

    /* renamed from: R */
    public static final Unit m10143R(Function1 function1, NavController navController) {
        function1.invoke(0);
        navController.navigateUp();
        AbstractC7586b.m12450a().putString("ANSWER_SHEET_KEY_BUNDLE", "");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10165v(final java.lang.String r21, final androidx.navigation.NavController r22, final kotlin.jvm.functions.Function1 r23, final com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel r24, final kotlin.jvm.functions.Function1 r25, kotlin.jvm.functions.Function0 r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.AnswerSheetPageKt.m10165v(java.lang.String, androidx.navigation.NavController, kotlin.jvm.functions.Function1, com.zykj.evaluation.ui.sheet.AnswerSheetViewModel, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/AnswerSheetPageKt.smali:1584
    }

    /* renamed from: w */
    public static final void m10166w(final Function1 function1, final NavController navController, final AnswerSheetViewModel answerSheetViewModel, final Function0 function0, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1379779957);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(navController) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(answerSheetViewModel) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1379779957, i11, -1, "com.zykj.evaluation.ui.sheet.AnswerSheetPage (AnswerSheetPage.kt:162)");
            }
            C8508c c8508cM8645b = answerSheetViewModel.m8645b();
            final C9705v c9705vM10202u = answerSheetViewModel.m10202u();
            boolean zChangedInstance = ((i11 & 7168) == 2048) | composerStartRestartGroup.changedInstance(answerSheetViewModel) | composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: v6.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnswerSheetPageKt.m10134I(answerSheetViewModel, function0, navController);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
            boolean zM13985c = c8508cM8645b.m13985c();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(answerSheetViewModel);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: v6.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnswerSheetPageKt.m10135J(answerSheetViewModel);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AbstractC7384h.m11841d(zM13985c, null, (Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(-1587831788, true, new Function3() { // from class: v6.o
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AnswerSheetPageKt.m10136K(c9705vM10202u, function1, answerSheetViewModel, navController, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: v6.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnswerSheetPageKt.m10141P(function1, navController, answerSheetViewModel, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: x */
    public static final Unit m10167x() {
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final Unit m10168y(final Function1 function1, final NavHostController navHostController, final AnswerSheetViewModel answerSheetViewModel, final Function0 function0, final Function0 function02, NavGraphBuilder NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        NavGraphBuilderKt.composable$default(NavHost, "ANSWER_SHEET", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1267868492, true, new Function4() { // from class: v6.f
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return AnswerSheetPageKt.m10132G(function1, navHostController, answerSheetViewModel, function0, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "ANSWER_SHEET_PREVIEW", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1346743125, true, new Function4() { // from class: v6.g
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return AnswerSheetPageKt.m10169z(navHostController, answerSheetViewModel, function02, function0, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "ANSWER_SHEET_MANUAL_POINT", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1223839188, true, new Function4() { // from class: v6.h
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return AnswerSheetPageKt.m10127B(navHostController, answerSheetViewModel, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, (Object) null);
        NavGraphBuilderKt.dialog$default(NavHost, "ANSWER_SHEET_SCAN_FAILED", (List) null, (List) null, (DialogProperties) null, ComposableLambdaKt.composableLambdaInstance(322714007, true, new Function3() { // from class: v6.i
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnswerSheetPageKt.m10128C(navHostController, answerSheetViewModel, (NavBackStackEntry) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 14, (Object) null);
        NavGraphBuilderKt.dialog$default(NavHost, "ANSWER_SHEET_SERIAL_NUM_ERROR", (List) null, (List) null, (DialogProperties) null, ComposableLambdaKt.composableLambdaInstance(-1805318962, true, new Function3() { // from class: v6.j
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnswerSheetPageKt.m10129D(navHostController, answerSheetViewModel, (NavBackStackEntry) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 14, (Object) null);
        NavGraphBuilderKt.dialog$default(NavHost, "ANSWER_SHEET_PAGE_ERROR", (List) null, (List) null, (DialogProperties) null, ComposableLambdaKt.composableLambdaInstance(-1682415025, true, new Function3() { // from class: v6.k
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnswerSheetPageKt.m10130E(navHostController, answerSheetViewModel, (NavBackStackEntry) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 14, (Object) null);
        NavGraphBuilderKt.dialog$default(NavHost, "ANSWER_SHEET_CORRECT_DATA", (List) null, (List) null, (DialogProperties) null, ComposableLambdaKt.composableLambdaInstance(-1559511088, true, new Function3() { // from class: v6.m
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnswerSheetPageKt.m10131F(answerSheetViewModel, navHostController, (NavBackStackEntry) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 14, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final Unit m10169z(NavHostController navHostController, AnswerSheetViewModel answerSheetViewModel, final Function0 function0, final Function0 function02, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1346743125, i10, -1, "com.zykj.evaluation.ui.sheet.AnswerSheetPage.<anonymous>.<anonymous>.<anonymous> (AnswerSheetPage.kt:99)");
        }
        boolean zChanged = composer.changed(function0);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: v6.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AnswerSheetPageKt.m10126A(function0, function02);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        PreviewPageKt.m10324w(navHostController, answerSheetViewModel, (Function0) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
