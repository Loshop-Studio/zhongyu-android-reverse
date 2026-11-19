package p267v6;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import com.blankj.utilcode.util.Utils;
import com.zykj.base.utils.XToastUtils;
import com.zykj.evaluation.R;
import com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p026b7.AbstractC4994b1;
import p026b7.AbstractC5029s0;
import p026b7.C4997c1;
import p026b7.C5037w0;
import p079e7.AbstractC7384h;
import p156l5.C8508c;

/* renamed from: v6.j0 */
/* loaded from: classes4.dex */
public abstract class AbstractC9690j0 {
    /* renamed from: j */
    public static final void m16192j(Modifier modifier, final Function0 function0, final Function0 function02, final Function0 function03, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-259623122);
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
            i12 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-259623122, i12, -1, "com.zykj.evaluation.ui.sheet.ManualPointBottomView (ManualPointPage.kt:113)");
            }
            Modifier modifierM17190backgroundbw27NRU$default = BackgroundKt.m17190backgroundbw27NRU$default(modifier3, Color.INSTANCE.m21013getWhite0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getEnd(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17190backgroundbw27NRU$default);
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            AbstractC5029s0.m2504e(StringResources_androidKt.stringResource(R.string.report_error, composerStartRestartGroup, 6), function0, composerStartRestartGroup, i12 & 112);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f10 = 5 / 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion2, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f10)), composerStartRestartGroup, 6);
            AbstractC5029s0.m2504e(StringResources_androidKt.stringResource(R.string.re_take_photo, composerStartRestartGroup, 6), function02, composerStartRestartGroup, (i12 >> 3) & 112);
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion2, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f10)), composerStartRestartGroup, 6);
            AbstractC5029s0.m2507h(StringResources_androidKt.stringResource(R.string.confirm, composerStartRestartGroup, 6), function03, composerStartRestartGroup, (i12 >> 6) & 112);
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion2, C3127Dp.m23561constructorimpl(f10 * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: v6.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC9690j0.m16193k(modifier4, function0, function02, function03, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: k */
    public static final Unit m16193k(Modifier modifier, Function0 function0, Function0 function02, Function0 function03, int i10, int i11, Composer composer, int i12) {
        m16192j(modifier, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final void m16194l(final NavController navController, final AnswerSheetViewModel viewModel, Composer composer, final int i10) {
        int i11;
        final NavController navController2;
        final AnswerSheetViewModel answerSheetViewModel;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1547401156);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(navController) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(viewModel) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1547401156, i11, -1, "com.zykj.evaluation.ui.sheet.ManualPointPage (ManualPointPage.kt:38)");
            }
            C8508c c8508cM8645b = viewModel.m8645b();
            final C9692k0 c9692k0M10175C = viewModel.m10175C();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: v6.a0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9690j0.m16195m(navController);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Function0 function0 = (Function0) objRememberedValue;
            BackHandlerKt.BackHandler(false, function0, composerStartRestartGroup, 0, 1);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new C5037w0(null, 1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final C5037w0 c5037w0 = (C5037w0) objRememberedValue2;
            boolean zM13985c = c8508cM8645b.m13985c();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(viewModel);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: v6.b0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9690j0.m16202t(viewModel);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            navController2 = navController;
            answerSheetViewModel = viewModel;
            AbstractC7384h.m11841d(zM13985c, null, (Function0) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(888771555, true, new Function3() { // from class: v6.c0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC9690j0.m16196n(c5037w0, c9692k0M10175C, answerSheetViewModel, function0, navController2, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            navController2 = navController;
            answerSheetViewModel = viewModel;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: v6.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC9690j0.m16201s(navController2, answerSheetViewModel, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: m */
    public static final Unit m16195m(NavController navController) {
        NavBackStackEntry previousBackStackEntry = navController.getPreviousBackStackEntry();
        SavedStateHandle savedStateHandle = previousBackStackEntry != null ? previousBackStackEntry.getSavedStateHandle() : null;
        navController.popBackStack();
        if (savedStateHandle != null) {
            savedStateHandle.set("ANSWER_SHEET_KEY_BACK", "ANSWER_SHEET_KEY_BACK_RE_TAKE_PHOTO");
        }
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m16196n(final C5037w0 c5037w0, final C9692k0 c9692k0, final AnswerSheetViewModel answerSheetViewModel, final Function0 function0, final NavController navController, BoxScope BoxWithLoadState, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(BoxWithLoadState, "$this$BoxWithLoadState");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(888771555, i10, -1, "com.zykj.evaluation.ui.sheet.ManualPointPage.<anonymous> (ManualPointPage.kt:63)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            AbstractC4994b1.m2467e(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), c5037w0, c9692k0.m16205c(), c9692k0.m16206d(), composer, 0, 0);
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17714height3ABfNKs = SizeKt.m17714height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3127Dp.m23561constructorimpl((30 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            boolean zChangedInstance = composer.changedInstance(answerSheetViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: v6.e0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9690j0.m16199q(answerSheetViewModel);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function02 = (Function0) objRememberedValue;
            boolean zChanged = composer.changed(function0);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: v6.f0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9690j0.m16200r(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function03 = (Function0) objRememberedValue2;
            boolean zChangedInstance2 = composer.changedInstance(answerSheetViewModel) | composer.changedInstance(c9692k0) | composer.changedInstance(c5037w0) | composer.changedInstance(navController);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: v6.g0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9690j0.m16197o(answerSheetViewModel, c9692k0, c5037w0, navController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            m16192j(modifierM17714height3ABfNKs, function02, function03, (Function0) objRememberedValue3, composer, 6, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final Unit m16197o(AnswerSheetViewModel answerSheetViewModel, C9692k0 c9692k0, C5037w0 c5037w0, final NavController navController) {
        answerSheetViewModel.mo10179G(new C4997c1(true, c9692k0.m16205c(), (List) c5037w0.m2518c().invoke()), new Function0() { // from class: v6.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC9690j0.m16198p(navController);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final Unit m16198p(NavController navController) {
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final Unit m16199q(AnswerSheetViewModel answerSheetViewModel) throws Resources.NotFoundException {
        answerSheetViewModel.m10187O();
        XToastUtils xToastUtils = XToastUtils.INSTANCE;
        String string = Utils.getApp().getResources().getString(R.string.fail_scan_tip);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        xToastUtils.info(string);
        return Unit.INSTANCE;
    }

    /* renamed from: r */
    public static final Unit m16200r(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public static final Unit m16201s(NavController navController, AnswerSheetViewModel answerSheetViewModel, int i10, Composer composer, int i11) {
        m16194l(navController, answerSheetViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final Unit m16202t(AnswerSheetViewModel answerSheetViewModel) {
        answerSheetViewModel.m8646c();
        return Unit.INSTANCE;
    }
}
