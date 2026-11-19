package com.zykj.evaluation.p057ui.home;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavController;
import com.zykj.evaluation.p057ui.home.AbstractC6930c;
import com.zykj.evaluation.p057ui.home.HomePageKt;
import com.zykj.evaluation.version.VersionResult;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p189o5.AbstractC8709e;
import p234s6.C9272d1;

/* loaded from: classes4.dex */
public abstract class HomePageKt {
    /* renamed from: A */
    public static final Unit m9988A(final HomeViewModel homeViewModel, final Function3 function3, final CoroutineScope coroutineScope, final DrawerState drawerState, State state, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(131330350, i10, -1, "com.zykj.evaluation.ui.home.HomePage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomePage.kt:59)");
            }
            HomeFilterState homeFilterStateM10024v = m10024v(state);
            boolean zChangedInstance = composer.changedInstance(homeViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: s6.r0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomePageKt.m9993F(homeViewModel, (AbstractC6930c) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            boolean zChanged = composer.changed(function3) | composer.changedInstance(homeViewModel);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function2() { // from class: s6.s0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HomePageKt.m9989B(function3, homeViewModel, (String) obj, (String) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function2 function2 = (Function2) objRememberedValue2;
            boolean zChangedInstance2 = composer.changedInstance(homeViewModel);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: s6.t0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomePageKt.m9991D(homeViewModel);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            boolean zChangedInstance3 = composer.changedInstance(coroutineScope) | composer.changed(drawerState) | composer.changedInstance(homeViewModel);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: s6.u0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomePageKt.m9992E(coroutineScope, homeViewModel, drawerState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            AbstractC6931d.m10097o(null, homeFilterStateM10024v, function1, function2, function0, (Function0) objRememberedValue4, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final Unit m9989B(Function3 function3, final HomeViewModel homeViewModel, String originStart, String originEnd) {
        Intrinsics.checkNotNullParameter(originStart, "originStart");
        Intrinsics.checkNotNullParameter(originEnd, "originEnd");
        function3.invoke(originStart, originEnd, new Function2() { // from class: s6.h0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HomePageKt.m9990C(homeViewModel, (String) obj, (String) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public static final Unit m9990C(HomeViewModel homeViewModel, String str, String str2) {
        homeViewModel.m10065W(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: D */
    public static final Unit m9991D(HomeViewModel homeViewModel) {
        homeViewModel.m10055L();
        return Unit.INSTANCE;
    }

    /* renamed from: E */
    public static final Unit m9992E(CoroutineScope coroutineScope, HomeViewModel homeViewModel, DrawerState drawerState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new HomePageKt$HomePage$4$1$1$1$4$1$1(drawerState, null), 3, null);
        homeViewModel.m10054K();
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final Unit m9993F(HomeViewModel homeViewModel, AbstractC6930c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        homeViewModel.m10049F(it);
        return Unit.INSTANCE;
    }

    /* renamed from: G */
    public static final Unit m9994G(final HomeViewModel homeViewModel, final CoroutineScope coroutineScope, final DrawerState drawerState, final NavController navController, final State state, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-404830817, i10, -1, "com.zykj.evaluation.ui.home.HomePage.<anonymous>.<anonymous>.<anonymous> (HomePage.kt:77)");
            }
            AbstractC8709e.m14338e(ComposableLambdaKt.rememberComposableLambda(-413506999, true, new Function2() { // from class: s6.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomePageKt.m9995H(homeViewModel, coroutineScope, drawerState, navController, state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: H */
    public static final Unit m9995H(final HomeViewModel homeViewModel, final CoroutineScope coroutineScope, final DrawerState drawerState, NavController navController, State state, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-413506999, i10, -1, "com.zykj.evaluation.ui.home.HomePage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomePage.kt:78)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            C9272d1 studentInfo = m10023u(state).getStudentInfo();
            List<Pair<String, AbstractC6930c>> checkedFilterList = m10023u(state).getCheckedFilterList();
            boolean zChangedInstance = composer.changedInstance(homeViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: s6.v0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomePageKt.m9996I(homeViewModel, (AbstractC6930c) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            String searchText = m10023u(state).getSearchText();
            boolean zChangedInstance2 = composer.changedInstance(homeViewModel);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: s6.w0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomePageKt.m9997J(homeViewModel, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            boolean zChangedInstance3 = composer.changedInstance(homeViewModel);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: s6.x0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomePageKt.m9998K(homeViewModel, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function13 = (Function1) objRememberedValue3;
            boolean zChangedInstance4 = composer.changedInstance(coroutineScope) | composer.changed(drawerState);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: s6.y0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomePageKt.m9999L(coroutineScope, drawerState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            HomeMainKt.m9951O(studentInfo, checkedFilterList, function1, searchText, function12, function13, (Function0) objRememberedValue4, composer, 0);
            HomeMainKt.m9983v(navController, m10023u(state).getPageTitleList(), null, composer, 0, 4);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: I */
    public static final Unit m9996I(HomeViewModel homeViewModel, AbstractC6930c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        homeViewModel.m10052I(it);
        return Unit.INSTANCE;
    }

    /* renamed from: J */
    public static final Unit m9997J(HomeViewModel homeViewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        homeViewModel.m10048E(it);
        return Unit.INSTANCE;
    }

    /* renamed from: K */
    public static final Unit m9998K(HomeViewModel homeViewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        homeViewModel.m10053J(it);
        return Unit.INSTANCE;
    }

    /* renamed from: L */
    public static final Unit m9999L(CoroutineScope coroutineScope, DrawerState drawerState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new HomePageKt$HomePage$4$1$2$1$1$4$1$1(drawerState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* renamed from: M */
    public static final Unit m10000M(NavController navController, Function3 function3, Function1 function1, HomeViewModel homeViewModel, int i10, int i11, Composer composer, int i12) {
        m10022t(navController, function3, function1, homeViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: N */
    public static final Unit m10001N(Function1 function1, VersionResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    /* renamed from: O */
    public static final Unit m10002O(HomeViewModel homeViewModel) {
        homeViewModel.m8646c();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cb  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10022t(final androidx.navigation.NavController r21, final kotlin.jvm.functions.Function3 r22, final kotlin.jvm.functions.Function1 r23, com.zykj.evaluation.p057ui.home.HomeViewModel r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.home.HomePageKt.m10022t(androidx.navigation.NavController, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function1, com.zykj.evaluation.ui.home.HomeViewModel, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/home/HomePageKt.smali:1845
    }

    /* renamed from: u */
    public static final HomeViewState m10023u(State state) {
        return (HomeViewState) state.getValue();
    }

    /* renamed from: v */
    public static final HomeFilterState m10024v(State state) {
        return (HomeFilterState) state.getValue();
    }

    /* renamed from: w */
    public static final Unit m10025w(CoroutineScope coroutineScope, DrawerState drawerState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new HomePageKt$HomePage$1$1$1(drawerState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m10026x(final DrawerState drawerState, final HomeViewModel homeViewModel, final Function3 function3, final CoroutineScope coroutineScope, final State state, final NavController navController, final State state2, BoxScope BoxWithLoadState, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(BoxWithLoadState, "$this$BoxWithLoadState");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(599405159, i10, -1, "com.zykj.evaluation.ui.home.HomePage.<anonymous> (HomePage.kt:53)");
            }
            AbstractC8709e.m14341h(ComposableLambdaKt.rememberComposableLambda(2091000957, true, new Function2() { // from class: s6.n0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomePageKt.m10027y(drawerState, homeViewModel, function3, coroutineScope, state, navController, state2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final Unit m10027y(final DrawerState drawerState, final HomeViewModel homeViewModel, final Function3 function3, final CoroutineScope coroutineScope, final State state, final NavController navController, final State state2, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2091000957, i10, -1, "com.zykj.evaluation.ui.home.HomePage.<anonymous>.<anonymous> (HomePage.kt:54)");
            }
            NavigationDrawerKt.m19022ModalNavigationDrawerFHprtrg(ComposableLambdaKt.rememberComposableLambda(140006532, true, new Function2() { // from class: s6.o0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomePageKt.m10028z(homeViewModel, function3, coroutineScope, drawerState, state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), null, drawerState, drawerState.isOpen(), 0L, ComposableLambdaKt.rememberComposableLambda(-404830817, true, new Function2() { // from class: s6.p0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomePageKt.m9994G(homeViewModel, coroutineScope, drawerState, navController, state2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 196614, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final Unit m10028z(final HomeViewModel homeViewModel, final Function3 function3, final CoroutineScope coroutineScope, final DrawerState drawerState, final State state, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(140006532, i10, -1, "com.zykj.evaluation.ui.home.HomePage.<anonymous>.<anonymous>.<anonymous> (HomePage.kt:58)");
            }
            AbstractC8709e.m14338e(ComposableLambdaKt.rememberComposableLambda(131330350, true, new Function2() { // from class: s6.q0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomePageKt.m9988A(homeViewModel, function3, coroutineScope, drawerState, state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
