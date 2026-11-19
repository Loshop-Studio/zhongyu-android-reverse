package p245t6;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.res.PainterResources_androidKt;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.paging.compose.LazyPagingItems;
import com.google.gson.Gson;
import com.zykj.evaluation.R;
import com.zykj.evaluation.bean.TaskState;
import com.zykj.evaluation.bean.bundle.AnswerSheetBundle;
import com.zykj.evaluation.p057ui.home.HomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p068d7.AbstractC7305a;
import p101g7.AbstractC7586b;
import p189o5.AbstractC8709e;

/* renamed from: t6.m0 */
/* loaded from: classes4.dex */
public abstract class AbstractC9446m0 {
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0234  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m15716m(final androidx.navigation.NavController r22, final androidx.paging.compose.LazyPagingItems r23, final kotlin.jvm.functions.Function0 r24, com.zykj.evaluation.p057ui.home.HomeViewModel r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p245t6.AbstractC9446m0.m15716m(androidx.navigation.NavController, androidx.paging.compose.LazyPagingItems, kotlin.jvm.functions.Function0, com.zykj.evaluation.ui.home.HomeViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: n */
    public static final Unit m15717n(final LazyPagingItems lazyPagingItems, final HomeViewModel homeViewModel, final Function0 function0, final NavController navController, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyGridScope.items$default(LazyVerticalGrid, lazyPagingItems.getItemCount(), new Function1() { // from class: t6.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC9446m0.m15718o(lazyPagingItems, ((Integer) obj).intValue());
            }
        }, null, null, ComposableLambdaKt.composableLambdaInstance(1879857853, true, new Function4() { // from class: t6.g0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return AbstractC9446m0.m15719p(lazyPagingItems, homeViewModel, function0, navController, (LazyGridItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 12, null);
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final Object m15718o(LazyPagingItems lazyPagingItems, int i10) {
        C9450o0 c9450o0 = (C9450o0) lazyPagingItems.peek(i10);
        if (c9450o0 != null) {
            String str = c9450o0.m15738f() + "_" + i10;
            if (str != null) {
                return str;
            }
        }
        return Integer.valueOf(i10);
    }

    /* renamed from: p */
    public static final Unit m15719p(LazyPagingItems lazyPagingItems, final HomeViewModel homeViewModel, final Function0 function0, final NavController navController, LazyGridItemScope items, int i10, Composer composer, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i11 & 48) == 0) {
            i12 = i11 | (composer.changed(i10) ? 32 : 16);
        } else {
            i12 = i11;
        }
        if (composer.shouldExecute((i12 & 145) != 144, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1879857853, i12, -1, "com.zykj.evaluation.ui.home.data.DataPage.<anonymous>.<anonymous>.<anonymous> (DataPage.kt:60)");
            }
            final C9450o0 c9450o0 = (C9450o0) lazyPagingItems.get(i10);
            if (c9450o0 == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            boolean zChangedInstance = composer.changedInstance(homeViewModel) | composer.changed(c9450o0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: t6.h0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9446m0.m15724u(homeViewModel, c9450o0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function02 = (Function0) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(homeViewModel) | composer.changed(c9450o0) | composer.changed(function0);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: t6.i0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9446m0.m15725v(homeViewModel, c9450o0, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function03 = (Function0) objRememberedValue2;
            boolean zChanged = composer.changed(c9450o0) | composer.changedInstance(navController);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: t6.j0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9446m0.m15726w(c9450o0, navController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function04 = (Function0) objRememberedValue3;
            boolean zChanged2 = composer.changed(c9450o0) | composer.changedInstance(navController);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: t6.k0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9446m0.m15720q(c9450o0, navController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function0 function05 = (Function0) objRememberedValue4;
            boolean zChanged3 = composer.changed(c9450o0) | composer.changedInstance(navController);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: t6.l0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9446m0.m15721r(c9450o0, navController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            Function0 function06 = (Function0) objRememberedValue5;
            boolean zChanged4 = composer.changed(c9450o0) | composer.changedInstance(navController);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: t6.b0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9446m0.m15722s(c9450o0, navController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            Function0 function07 = (Function0) objRememberedValue6;
            boolean zChanged5 = composer.changed(c9450o0) | composer.changedInstance(homeViewModel) | composer.changedInstance(navController);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: t6.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9446m0.m15723t(c9450o0, homeViewModel, navController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            AbstractC9463z.m15773F(c9450o0, function02, function03, function04, function05, function06, function07, (Function0) objRememberedValue7, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final Unit m15720q(C9450o0 c9450o0, NavController navController) {
        AbstractC7586b.m12450a().putString("ANSWER_SHEET_KEY_BUNDLE", new Gson().toJson(new AnswerSheetBundle(c9450o0.m15738f(), c9450o0.m15739g(), c9450o0.m15735c(), c9450o0.m15740h(), c9450o0.m15736d(), c9450o0.m15750r(), null, null, 192, null)));
        NavController.navigate$default(navController, c9450o0.m15745m() ? "ANSWER_SHEET_TREBLE" : "ANSWER_SHEET_NORMAL", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: r */
    public static final Unit m15721r(C9450o0 c9450o0, NavController navController) {
        NavController.navigate$default(navController, "GUIDE_TO_CORRECT_SELF/" + c9450o0.m15738f(), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public static final Unit m15722s(C9450o0 c9450o0, NavController navController) {
        String str = c9450o0.m15751s() ? "GUIDE_TO_CORRECT" : "DETAIL_TO_CORRECT";
        NavController.navigate$default(navController, str + "/" + c9450o0.m15738f(), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final Unit m15723t(C9450o0 c9450o0, HomeViewModel homeViewModel, NavController navController) {
        String str;
        int iM15739g = c9450o0.m15739g();
        if (iM15739g == TaskState.ToDo.INSTANCE.getState() || iM15739g == TaskState.WaitCorrect.INSTANCE.getState() || iM15739g == TaskState.Correcting.INSTANCE.getState()) {
            String str2 = c9450o0.m15751s() ? "GUIDE_CORRECTING" : "DETAIL_CORRECTING";
            str = str2 + "/" + c9450o0.m15738f();
        } else if (iM15739g == TaskState.WaitRevise.INSTANCE.getState() || iM15739g == TaskState.Revising.INSTANCE.getState()) {
            String str3 = c9450o0.m15751s() ? "GUIDE_REVISING" : "DETAIL_REVISING";
            str = str3 + "/" + c9450o0.m15738f();
        } else if (iM15739g == TaskState.Done.INSTANCE.getState()) {
            HomeViewModel.m10031T(homeViewModel, c9450o0.m15738f(), false, 2, null);
            String str4 = c9450o0.m15751s() ? "GUIDE_DONE" : "DETAIL_DONE";
            str = str4 + "/" + c9450o0.m15738f() + "/" + c9450o0.m15748p();
        } else {
            str = null;
        }
        String str5 = str;
        if (str5 != null) {
            NavController.navigate$default(navController, str5, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final Unit m15724u(HomeViewModel homeViewModel, C9450o0 c9450o0) {
        homeViewModel.m10061R(c9450o0.m15738f(), !c9450o0.m15747o());
        return Unit.INSTANCE;
    }

    /* renamed from: v */
    public static final Unit m15725v(HomeViewModel homeViewModel, C9450o0 c9450o0, Function0 function0) {
        homeViewModel.m10060Q(c9450o0.m15738f(), c9450o0.m15739g(), function0);
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final Unit m15726w(C9450o0 c9450o0, NavController navController) {
        String str = c9450o0.m15751s() ? c9450o0.m15750r() ? "GUIDE_NO_STEM" : "GUIDE_TO_DO" : "DETAIL_TO_DO";
        NavController.navigate$default(navController, str + "/" + c9450o0.m15738f(), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m15727x(NavController navController, LazyPagingItems lazyPagingItems, Function0 function0, HomeViewModel homeViewModel, int i10, int i11, Composer composer, int i12) {
        m15716m(navController, lazyPagingItems, function0, homeViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final void m15728y(Composer composer, final int i10) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(926005213);
        if (composerStartRestartGroup.shouldExecute(i10 != 0, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(926005213, i10, -1, "com.zykj.evaluation.ui.home.data.EmptyContent (DataPage.kt:178)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(BackgroundKt.m17190backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), AbstractC7305a.m11584h(), null, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.pic_empty_content, composerStartRestartGroup, 6), (String) null, SizeKt.m17728size3ABfNKs(companion, C3127Dp.m23561constructorimpl((66 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            composer2 = composerStartRestartGroup;
            TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_empty_content, composerStartRestartGroup, 6), PaddingKt.m17685paddingqDBjuR0$default(companion, 0.0f, C3127Dp.m23561constructorimpl((7 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 13, null), ColorKt.Color(4284769638L), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3504, 0, 131056);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: t6.e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC9446m0.m15729z(i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: z */
    public static final Unit m15729z(int i10, Composer composer, int i11) {
        m15728y(composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }
}
