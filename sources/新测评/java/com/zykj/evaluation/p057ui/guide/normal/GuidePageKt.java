package com.zykj.evaluation.p057ui.guide.normal;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
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
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.zykj.evaluation.p057ui.guide.normal.GuidePageKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p101g7.AbstractC7586b;
import p133j6.AbstractC7811o;
import p133j6.AbstractC7813q;
import p133j6.C7799c;
import p133j6.C7812p;
import p189o5.AbstractC8709e;

/* loaded from: classes4.dex */
public abstract class GuidePageKt {
    /* renamed from: e */
    public static final void m9841e(Modifier modifier, final List questionStateList, final List groups, final Function1 onClickQuestionDescription, final Function1 function1, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Modifier modifier3;
        int i13;
        int i14;
        Function1 onClickToDetail = function1;
        Intrinsics.checkNotNullParameter(questionStateList, "questionStateList");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(onClickQuestionDescription, "onClickQuestionDescription");
        Intrinsics.checkNotNullParameter(onClickToDetail, "onClickToDetail");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1528216730);
        int i15 = i11 & 1;
        if (i15 != 0) {
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
            i12 |= composerStartRestartGroup.changedInstance(questionStateList) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(groups) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickQuestionDescription) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickToDetail) ? 16384 : 8192;
        }
        int i16 = i12;
        if (composerStartRestartGroup.shouldExecute((i16 & 9363) != 9362, i16 & 1)) {
            Modifier modifier4 = i15 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1528216730, i16, -1, "com.zykj.evaluation.ui.guide.normal.GuideContentView (GuidePage.kt:84)");
            }
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            float f10 = 600;
            float f11 = 9 / f10;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifier5 = modifier4;
            Modifier modifierM17190backgroundbw27NRU$default = BackgroundKt.m17190backgroundbw27NRU$default(PaddingKt.m17685paddingqDBjuR0$default(modifier4, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11), 0.0f, 0.0f, 0.0f, 14, null), Color.INSTANCE.m21013getWhite0d7_KjU(), null, 2, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17190backgroundbw27NRU$default);
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Modifier.INSTANCE, scrollStateRememberScrollState, false, null, false, 14, null);
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17681padding3ABfNKs = PaddingKt.m17681padding3ABfNKs(modifierVerticalScroll$default, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17681padding3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl2 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(2026781804);
            Iterator it = groups.iterator();
            while (true) {
                i13 = 5;
                i14 = 6;
                if (!it.hasNext()) {
                    break;
                }
                C7799c c7799c = (C7799c) it.next();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
                SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion3, C3127Dp.m23561constructorimpl((5 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                int i17 = i16 >> 3;
                AbstractC7811o.m13223g(modifierFillMaxWidth$default, c7799c, onClickQuestionDescription, onClickToDetail, composerStartRestartGroup, 6 | (i17 & 896) | (i17 & 7168), 0);
                onClickToDetail = function1;
                f10 = f10;
            }
            float f12 = f10;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Alignment.Companion companion5 = Alignment.INSTANCE;
            Modifier modifierAlign = boxScopeInstance.align(companion4, companion5.getTopEnd());
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl((14 / f12) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17685paddingqDBjuR0$default = PaddingKt.m17685paddingqDBjuR0$default(modifierAlign, 0.0f, fM23561constructorimpl, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 9, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion5.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17685paddingqDBjuR0$default);
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl3 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
            if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1056036249);
            Iterator it2 = questionStateList.iterator();
            while (it2.hasNext()) {
                AbstractC7813q abstractC7813q = (AbstractC7813q) it2.next();
                Modifier.Companion companion7 = Modifier.INSTANCE;
                DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
                SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion7, C3127Dp.m23561constructorimpl((i13 / f12) * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, i14);
                DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl((11 / f12) * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
                DisplayMetrics displayMetrics8 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17730sizeVpY3zN4 = SizeKt.m17730sizeVpY3zN4(companion7, fM23561constructorimpl2, C3127Dp.m23561constructorimpl((7 / f12) * (RangesKt.coerceAtLeast(displayMetrics8.widthPixels, displayMetrics8.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
                long jM13236a = abstractC7813q.m13236a();
                float f13 = 4 / f12;
                DisplayMetrics displayMetrics9 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17189backgroundbw27NRU = BackgroundKt.m17189backgroundbw27NRU(modifierM17730sizeVpY3zN4, jM13236a, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics9.widthPixels, displayMetrics9.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f13)));
                float fM23561constructorimpl3 = C3127Dp.m23561constructorimpl(1);
                long jM13238c = abstractC7813q.m13238c();
                DisplayMetrics displayMetrics10 = Resources.getSystem().getDisplayMetrics();
                BoxKt.Box(BorderKt.m17201borderxT4_qwU(modifierM17189backgroundbw27NRU, fM23561constructorimpl3, jM13238c, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f13 * (RangesKt.coerceAtLeast(displayMetrics10.widthPixels, displayMetrics10.heightPixels) / Resources.getSystem().getDisplayMetrics().density)))), composerStartRestartGroup, 0);
                DisplayMetrics displayMetrics11 = Resources.getSystem().getDisplayMetrics();
                SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion7, C3127Dp.m23561constructorimpl((2 / f12) * (RangesKt.coerceAtLeast(displayMetrics11.widthPixels, displayMetrics11.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
                Composer composer2 = composerStartRestartGroup;
                TextKt.m19430Text4IGK_g(abstractC7813q.m13237b(), (Modifier) null, ColorKt.Color(4283782485L), AbstractC8709e.m14344k(6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3456, 0, 131058);
                composerStartRestartGroup = composer2;
                i13 = 5;
                i14 = 6;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: j6.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GuidePageKt.m9842f(modifier3, questionStateList, groups, onClickQuestionDescription, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: f */
    public static final Unit m9842f(Modifier modifier, List list, List list2, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        m9841e(modifier, list, list2, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9843g(final androidx.navigation.NavController r16, final long r17, final com.zykj.evaluation.p057ui.guide.normal.GuideViewModel r19, kotlin.jvm.functions.Function0 r20, final kotlin.jvm.functions.Function1 r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.guide.normal.GuidePageKt.m9843g(androidx.navigation.NavController, long, com.zykj.evaluation.ui.guide.normal.GuideViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/guide/normal/GuidePageKt.smali:2823
    }

    /* renamed from: h */
    public static final Unit m9844h(C7812p c7812p, List list, final NavController navController, Function1 function1, RowScope GuideView, Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(GuideView, "$this$GuideView");
        if ((i10 & 6) == 0) {
            i11 = (composer.changed(GuideView) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-889150773, i11, -1, "com.zykj.evaluation.ui.guide.normal.GuidePage.<anonymous> (GuidePage.kt:55)");
            }
            Modifier modifierWeight$default = RowScope.weight$default(GuideView, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
            List listM13233c = c7812p.m13233c();
            boolean zChangedInstance = composer.changedInstance(navController);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: j6.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GuidePageKt.m9845i(navController, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            m9841e(modifierWeight$default, list, listM13233c, (Function1) objRememberedValue, function1, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Unit m9845i(NavController navController, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AbstractC7586b.m12450a().putString("DESCRIPTION_KEY_CONTENT", it);
        NavController.navigate$default(navController, "DESCRIPTION/大题说明", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m9846j(NavController navController, long j10, GuideViewModel guideViewModel, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m9843g(navController, j10, guideViewModel, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
