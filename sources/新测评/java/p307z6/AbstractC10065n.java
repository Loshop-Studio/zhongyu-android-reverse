package p307z6;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
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
import androidx.compose.p013ui.draw.ClipKt;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.p013ui.text.PlatformTextStyle;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavController;
import com.zykj.base.utils.XToastUtils;
import com.zykj.evaluation.R;
import com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p101g7.AbstractC7593i;
import p189o5.AbstractC8709e;
import p267v6.AbstractC9694l0;
import p287x6.C9859b;
import p287x6.C9860c;
import p287x6.C9861d;

/* renamed from: z6.n */
/* loaded from: classes4.dex */
public abstract class AbstractC10065n {
    /* renamed from: j */
    public static final void m16923j(final NavController navController, final NormalViewModel viewModel, Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1956062928);
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
                ComposerKt.traceEventStart(1956062928, i11, -1, "com.zykj.evaluation.ui.sheet.preview.dialog.CorrectChoicePage (CorrectChoicePage.kt:52)");
            }
            final C9859b c9859bM10267J0 = viewModel.m10267J0();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: z6.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC10065n.m16924k(navController);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(1268586137, true, new Function2() { // from class: z6.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10065n.m16925l(c9859bM10267J0, viewModel, navController, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z6.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10065n.m16929p(navController, viewModel, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: k */
    public static final Unit m16924k(NavController navController) {
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m16925l(final C9859b c9859b, final NormalViewModel normalViewModel, final NavController navController, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1268586137, i10, -1, "com.zykj.evaluation.ui.sheet.preview.dialog.CorrectChoicePage.<anonymous> (CorrectChoicePage.kt:59)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17733width3ABfNKs = SizeKt.m17733width3ABfNKs(companion, C3127Dp.m23561constructorimpl((252 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierClip = ClipKt.clip(modifierM17733width3ABfNKs, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((3 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))));
            Color.Companion companion2 = Color.INSTANCE;
            Modifier modifierM17190backgroundbw27NRU$default = BackgroundKt.m17190backgroundbw27NRU$default(modifierClip, companion2.m21013getWhite0d7_KjU(), null, 2, null);
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17681padding3ABfNKs = PaddingKt.m17681padding3ABfNKs(modifierM17190backgroundbw27NRU$default, C3127Dp.m23561constructorimpl((18 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM17681padding3ABfNKs);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.correct_choice_title, composer, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4283389281L), AbstractC8709e.m14344k(8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composer, 0, 1572864, 65534);
            float f11 = 10 / f10;
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11)), composer, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl((0 / f10) * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m17715heightInVpY3zN4(modifierFillMaxWidth$default, fM23561constructorimpl, C3127Dp.m23561constructorimpl((400 / f10) * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            List listM16523b = c9859b.m16523b();
            boolean zChangedInstance = composer.changedInstance(normalViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: z6.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC10065n.m16928o(normalViewModel, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            m16930q(modifierVerticalScroll$default, listM16523b, (Function2) objRememberedValue, composer, 0, 0);
            DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM20418constructorimpl2 = Updater.m20418constructorimpl(composer);
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f12 = 45 / f10;
            DisplayMetrics displayMetrics8 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics8.widthPixels, displayMetrics8.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12);
            float f13 = 20 / f10;
            DisplayMetrics displayMetrics9 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN4 = SizeKt.m17730sizeVpY3zN4(companion, fM23561constructorimpl2, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics9.widthPixels, displayMetrics9.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f13));
            float fM23561constructorimpl3 = C3127Dp.m23561constructorimpl(1);
            long jColor = ColorKt.Color(4282949880L);
            float f14 = 2 / f10;
            DisplayMetrics displayMetrics10 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17201borderxT4_qwU = BorderKt.m17201borderxT4_qwU(modifierM17730sizeVpY3zN4, fM23561constructorimpl3, jColor, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics10.widthPixels, displayMetrics10.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f14)));
            boolean zChangedInstance2 = composer.changedInstance(navController);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: z6.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC10065n.m16926m(navController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierM12480g = AbstractC7593i.m12480g(modifierM17201borderxT4_qwU, false, (Function0) objRememberedValue2, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM12480g);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM20418constructorimpl3 = Updater.m20418constructorimpl(composer);
            Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m19430Text4IGK_g("返回", boxScopeInstance.align(companion, companion3.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4282949880L), AbstractC8709e.m14344k(6), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composer, 6, 1572864, 65532);
            composer.endNode();
            DisplayMetrics displayMetrics11 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics11.widthPixels, displayMetrics11.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f13)), composer, 6);
            DisplayMetrics displayMetrics12 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl4 = C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics12.widthPixels, displayMetrics12.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics13 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN42 = SizeKt.m17730sizeVpY3zN4(companion, fM23561constructorimpl4, C3127Dp.m23561constructorimpl(f13 * (RangesKt.coerceAtLeast(displayMetrics13.widthPixels, displayMetrics13.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            long jColor2 = ColorKt.Color(4282949880L);
            DisplayMetrics displayMetrics14 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17189backgroundbw27NRU = BackgroundKt.m17189backgroundbw27NRU(modifierM17730sizeVpY3zN42, jColor2, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f14 * (RangesKt.coerceAtLeast(displayMetrics14.widthPixels, displayMetrics14.heightPixels) / Resources.getSystem().getDisplayMetrics().density))));
            boolean zChangedInstance3 = composer.changedInstance(c9859b) | composer.changedInstance(normalViewModel) | composer.changedInstance(navController);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: z6.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC10065n.m16927n(c9859b, normalViewModel, navController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierM12480g2 = AbstractC7593i.m12480g(modifierM17189backgroundbw27NRU, false, (Function0) objRememberedValue3, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM12480g2);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM20418constructorimpl4 = Updater.m20418constructorimpl(composer);
            Updater.m20425setimpl(composerM20418constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM20418constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM20418constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m20425setimpl(composerM20418constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
            TextKt.m19430Text4IGK_g("确认", boxScopeInstance.align(companion, companion3.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(companion2.m21013getWhite0d7_KjU(), AbstractC8709e.m14344k(6), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composer, 6, 1572864, 65532);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m16926m(NavController navController) {
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m16927n(C9859b c9859b, NormalViewModel normalViewModel, NavController navController) {
        if (c9859b.m16524c()) {
            XToastUtils.INSTANCE.error(R.string.correct_multi_answer_for_single);
        } else {
            NormalViewModel.m10243h1(normalViewModel, null, 1, null);
            navController.popBackStack();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final Unit m16928o(NormalViewModel normalViewModel, int i10, int i11) {
        normalViewModel.m10265G0(i10, i11);
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final Unit m16929p(NavController navController, NormalViewModel normalViewModel, int i10, Composer composer, int i11) {
        m16923j(navController, normalViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final void m16930q(Modifier modifier, final List list, final Function2 function2, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        List list2;
        Composer composer2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-694993180);
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
            list2 = list;
            i12 |= composerStartRestartGroup.changedInstance(list2) ? 32 : 16;
        } else {
            list2 = list;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i14 = 0;
        int i15 = 1;
        if (composerStartRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-694993180, i12, -1, "com.zykj.evaluation.ui.sheet.preview.dialog.CorrectQuestionView (CorrectChoicePage.kt:160)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
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
            composerStartRestartGroup.startReplaceGroup(-1528397789);
            Iterator it = list2.iterator();
            int i16 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i17 = i16 + 1;
                if (i16 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final C9861d c9861d = (C9861d) next;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierM17202borderxT4_qwU$default = BorderKt.m17202borderxT4_qwU$default(BackgroundKt.m17190backgroundbw27NRU$default(companion2, c9861d.m16531c().m16214a(), null, 2, null), C3127Dp.m23561constructorimpl(i15), c9861d.m16531c().m16215b(), null, 4, null);
                float f10 = 600;
                float f11 = 5 / f10;
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17683paddingVpY3zN4$default = PaddingKt.m17683paddingVpY3zN4$default(modifierM17202borderxT4_qwU$default, 0.0f, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11), i15, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i14);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17683paddingVpY3zN4$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Iterator it2 = it;
                Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17733width3ABfNKs = SizeKt.m17733width3ABfNKs(companion2, C3127Dp.m23561constructorimpl((45 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
                DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17685paddingqDBjuR0$default = PaddingKt.m17685paddingqDBjuR0$default(modifierM17733width3ABfNKs, C3127Dp.m23561constructorimpl((13 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 0.0f, 14, null);
                final int i18 = i16;
                Composer composer3 = composerStartRestartGroup;
                TextKt.m19430Text4IGK_g(c9861d.m16532d(), modifierM17685paddingqDBjuR0$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4284900966L), AbstractC8709e.m14344k(7), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composer3, 48, 1572864, 65532);
                composerStartRestartGroup = composer3;
                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null);
                DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17683paddingVpY3zN4$default2 = PaddingKt.m17683paddingVpY3zN4$default(modifierWeight$default, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null);
                DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM17562spacedBy0680j_4 = arrangement.m17562spacedBy0680j_4(C3127Dp.m23561constructorimpl((9 / f10) * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
                DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
                FlowLayoutKt.FlowRow(modifierM17683paddingVpY3zN4$default2, horizontalOrVerticalM17562spacedBy0680j_4, arrangement.m17562spacedBy0680j_4(C3127Dp.m23561constructorimpl((10 / f10) * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(1142318912, true, new Function3() { // from class: z6.k
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return AbstractC10065n.m16931r(c9861d, function2, i18, (FlowRowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573296, 56);
                composer3.endNode();
                i15 = 1;
                i16 = i17;
                it = it2;
                modifier4 = modifier4;
                i14 = 0;
            }
            Modifier modifier5 = modifier4;
            composer2 = composerStartRestartGroup;
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z6.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10065n.m16933t(modifier3, list, function2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* renamed from: r */
    public static final Unit m16931r(C9861d c9861d, final Function2 function2, final int i10, FlowRowScope FlowRow, Composer composer, int i11) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        boolean z9 = 0;
        int i12 = 16;
        if (composer2.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1142318912, i11, -1, "com.zykj.evaluation.ui.sheet.preview.dialog.CorrectQuestionView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CorrectChoicePage.kt:193)");
            }
            final int i13 = 0;
            for (Object obj : c9861d.m16533e()) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                C9860c c9860c = (C9860c) obj;
                Modifier.Companion companion = Modifier.INSTANCE;
                float f10 = 600;
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl = C3127Dp.m23561constructorimpl((31 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17730sizeVpY3zN4 = SizeKt.m17730sizeVpY3zN4(companion, fM23561constructorimpl, C3127Dp.m23561constructorimpl((i12 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
                long jColor = (c9861d.m16536h() && (c9860c.m16528d() instanceof AbstractC9694l0.b)) ? ColorKt.Color(4294910208L) : c9860c.m16528d().m16207a();
                float f11 = 2 / f10;
                DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17189backgroundbw27NRU = BackgroundKt.m17189backgroundbw27NRU(modifierM17730sizeVpY3zN4, jColor, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))));
                boolean zChanged = composer2.changed(function2) | composer2.changed(i10) | composer2.changed(i13);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: z6.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC10065n.m16932s(function2, i10, i13);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierM17224clickableXHw0xAI$default = ClickableKt.m17224clickableXHw0xAI$default(modifierM17189backgroundbw27NRU, false, null, null, (Function0) objRememberedValue, 7, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), z9);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, z9);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM17224clickableXHw0xAI$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                TextKt.m19430Text4IGK_g(c9860c.m16527c(), BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(c9860c.m16528d().m16208b(), AbstractC8709e.m14344k(9), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composer, 0, 0, 65532);
                composer.endNode();
                composer2 = composer;
                i13 = i14;
                z9 = z9;
                i12 = i12;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public static final Unit m16932s(Function2 function2, int i10, int i11) {
        function2.invoke(Integer.valueOf(i10), Integer.valueOf(i11));
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final Unit m16933t(Modifier modifier, List list, Function2 function2, int i10, int i11, Composer composer, int i12) {
        m16930q(modifier, list, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
