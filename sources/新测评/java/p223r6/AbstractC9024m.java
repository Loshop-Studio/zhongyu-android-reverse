package p223r6;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
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
import androidx.compose.runtime.Updater;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.google.gson.Gson;
import com.zykj.evaluation.p057ui.guide.BaseGuideViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p068d7.AbstractC7305a;
import p079e7.AbstractC7407s0;
import p101g7.AbstractC7586b;
import p101g7.AbstractC7593i;
import p111h6.C7630a;
import p133j6.AbstractC7797a;
import p189o5.AbstractC8709e;

/* renamed from: r6.m */
/* loaded from: classes4.dex */
public abstract class AbstractC9024m {
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m15179i(final androidx.navigation.NavController r14, final com.zykj.evaluation.p057ui.guide.BaseGuideViewModel r15, kotlin.jvm.functions.Function0 r16, final kotlin.jvm.functions.Function3 r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p223r6.AbstractC9024m.m15179i(androidx.navigation.NavController, com.zykj.evaluation.ui.guide.BaseGuideViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: j */
    public static final Unit m15180j(BaseGuideViewModel baseGuideViewModel) {
        baseGuideViewModel.m8646c();
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m15181k(final C7630a c7630a, final NavController navController, final BaseGuideViewModel baseGuideViewModel, Function0 function0, Function3 function3, BoxScope BoxWithLoadState, Composer composer, int i10) {
        int i11;
        Modifier.Companion companion;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(BoxWithLoadState, "$this$BoxWithLoadState");
        if (composer2.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1025057520, i10, -1, "com.zykj.evaluation.ui.guide.widget.GuideView.<anonymous> (GuideView.kt:46)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM17190backgroundbw27NRU$default = BackgroundKt.m17190backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), AbstractC7305a.m11584h(), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion3.getStart(), composer2, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM17190backgroundbw27NRU$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer2);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM20418constructorimpl2 = Updater.m20418constructorimpl(composer2);
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String strM12612m = c7630a.m12612m();
            boolean zChangedInstance = composer2.changedInstance(navController);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: r6.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9024m.m15185o(navController);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            AbstractC7407s0.m11898c(strM12612m, 0, (Function0) objRememberedValue, composer2, 0, 2);
            if (Intrinsics.areEqual(c7630a.m12602c(), AbstractC7797a.a.f13459c)) {
                i11 = 0;
                companion = companion2;
                composer2.startReplaceGroup(-33187730);
            } else {
                composer2.startReplaceGroup(-31042995);
                Modifier modifierAlign = boxScopeInstance.align(companion2, companion3.getCenterEnd());
                float f10 = 600;
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17685paddingqDBjuR0$default = PaddingKt.m17685paddingqDBjuR0$default(modifierAlign, 0.0f, 0.0f, C3127Dp.m23561constructorimpl((10 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 11, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM17685paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM20418constructorimpl3 = Updater.m20418constructorimpl(composer2);
                Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                float fM23561constructorimpl = C3127Dp.m23561constructorimpl(1.5f);
                long jM13203a = c7630a.m12602c().m13203a();
                float f11 = 2 / f10;
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17201borderxT4_qwU = BorderKt.m17201borderxT4_qwU(companion2, fM23561constructorimpl, jM13203a, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11)));
                boolean zChangedInstance2 = composer2.changedInstance(baseGuideViewModel);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: r6.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC9024m.m15186p(baseGuideViewModel);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierM12480g = AbstractC7593i.m12480g(modifierM17201borderxT4_qwU, false, (Function0) objRememberedValue2, 1, null);
                DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
                float f12 = 4 / f10;
                DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17682paddingVpY3zN4 = PaddingKt.m17682paddingVpY3zN4(modifierM12480g, C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), fM23561constructorimpl2);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM17682paddingVpY3zN4);
                Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                Composer composerM20418constructorimpl4 = Updater.m20418constructorimpl(composer2);
                Updater.m20425setimpl(composerM20418constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                if (composerM20418constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM20418constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM20418constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m20425setimpl(composerM20418constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
                companion = companion2;
                i11 = 0;
                TextKt.m19430Text4IGK_g(c7630a.m12602c().m13204b(), (Modifier) null, c7630a.m12602c().m13203a(), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131058);
                composer2 = composer;
                composer2.endNode();
                composer2.endNode();
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer2, i11);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, i11);
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, companion);
            Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            Composer composerM20418constructorimpl5 = Updater.m20418constructorimpl(composer2);
            Updater.m20425setimpl(composerM20418constructorimpl5, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM20418constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM20418constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m20425setimpl(composerM20418constructorimpl5, modifierMaterializeModifier5, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m17733width3ABfNKs(companion, C3127Dp.m23561constructorimpl((188 / 600) * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), 0.0f, 1, null);
            String strM12605f = c7630a.m12605f();
            String strM12613n = c7630a.m12613n();
            boolean zM12603d = c7630a.m12603d();
            String strM12611l = c7630a.m12611l();
            String strM12614o = c7630a.m12614o();
            String strM12610k = c7630a.m12610k();
            boolean zM12615p = c7630a.m12615p();
            String strM12608i = c7630a.m12608i();
            String strM12606g = c7630a.m12606g();
            String strM12604e = c7630a.m12604e();
            boolean zChangedInstance3 = composer2.changedInstance(baseGuideViewModel);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: r6.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9024m.m15182l(baseGuideViewModel);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue3);
            }
            Function0 function02 = (Function0) objRememberedValue3;
            boolean zChangedInstance4 = composer2.changedInstance(c7630a) | composer2.changedInstance(navController);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: r6.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9024m.m15183m(c7630a, navController);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue4);
            }
            Function0 function03 = (Function0) objRememberedValue4;
            boolean zChangedInstance5 = composer2.changedInstance(c7630a) | composer2.changedInstance(navController);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: r6.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9024m.m15184n(c7630a, navController);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue5);
            }
            AbstractC9029r.m15192e(modifierFillMaxHeight$default, strM12605f, strM12613n, strM12611l, zM12603d, strM12614o, strM12610k, zM12615p, strM12608i, strM12606g, function02, function03, strM12604e, (Function0) objRememberedValue5, function0, composer2, 6, 0, 0);
            function3.invoke(rowScopeInstance, composer2, 6);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m15182l(BaseGuideViewModel baseGuideViewModel) {
        baseGuideViewModel.m9779t();
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m15183m(C7630a c7630a, NavController navController) {
        Gson gson = new Gson();
        NavController.navigate$default(navController, "PROGRESS/" + gson.toJson(c7630a.m12609j()) + "/" + gson.toJson(c7630a.m12607h()), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m15184n(C7630a c7630a, NavController navController) {
        AbstractC7586b.m12450a().putString("DESCRIPTION_KEY_CONTENT", c7630a.m12604e());
        NavController.navigate$default(navController, "DESCRIPTION/试卷说明", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final Unit m15185o(NavController navController) {
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final Unit m15186p(BaseGuideViewModel baseGuideViewModel) {
        baseGuideViewModel.m9785z();
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final Unit m15187q(NavController navController, BaseGuideViewModel baseGuideViewModel, Function0 function0, Function3 function3, int i10, int i11, Composer composer, int i12) {
        m15179i(navController, baseGuideViewModel, function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
