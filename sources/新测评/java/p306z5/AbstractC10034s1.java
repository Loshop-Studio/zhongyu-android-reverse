package p306z5;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
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
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import com.zykj.evaluation.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p068d7.AbstractC7305a;
import p101g7.AbstractC7593i;
import p189o5.AbstractC8709e;

/* renamed from: z5.s1 */
/* loaded from: classes4.dex */
public abstract class AbstractC10034s1 {
    /* renamed from: d */
    public static final void m16892d(final NavController navController, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Composer composerStartRestartGroup = composer.startRestartGroup(2076935);
        if ((i10 & 6) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(navController) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2076935, i11, -1, "com.zykj.evaluation.ui.detail.mistake.RemoveMistakePage (RemoveMistakePage.kt:33)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl((200 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN4 = SizeKt.m17730sizeVpY3zN4(companion, fM23561constructorimpl, C3127Dp.m23561constructorimpl((120 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            float f11 = 3 / f10;
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierClip = ClipKt.clip(modifierM17730sizeVpY3zN4, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11)));
            Color.Companion companion2 = Color.INSTANCE;
            Modifier modifierM17190backgroundbw27NRU$default = BackgroundKt.m17190backgroundbw27NRU$default(modifierClip, companion2.m21013getWhite0d7_KjU(), null, 2, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17190backgroundbw27NRU$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f12 = 20 / f10;
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17685paddingqDBjuR0$default = PaddingKt.m17685paddingqDBjuR0$default(companion, 0.0f, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17685paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f13 = 11 / f10;
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f13);
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_warning, composerStartRestartGroup, 6), (String) null, SizeKt.m17730sizeVpY3zN4(companion, fM23561constructorimpl2, C3127Dp.m23561constructorimpl(f13 * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
            DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.remove_dialog_title, composerStartRestartGroup, 6), (Modifier) null, ColorKt.Color(4281479730L), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3456, 0, 131058);
            composerStartRestartGroup.endNode();
            DisplayMetrics displayMetrics8 = Resources.getSystem().getDisplayMetrics();
            TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.remove_dialog_content, composerStartRestartGroup, 6), PaddingKt.m17681padding3ABfNKs(companion, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics8.widthPixels, displayMetrics8.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12)), ColorKt.Color(4281545523L), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3504, 0, 131056);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            DisplayMetrics displayMetrics9 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17685paddingqDBjuR0$default2 = PaddingKt.m17685paddingqDBjuR0$default(modifierFillMaxSize$default, 0.0f, 0.0f, 0.0f, C3127Dp.m23561constructorimpl((15 / f10) * (RangesKt.coerceAtLeast(displayMetrics9.widthPixels, displayMetrics9.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getBottomCenter(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17685paddingqDBjuR0$default2);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl4 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl4, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM20418constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM20418constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m20425setimpl(composerM20418constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
            float f14 = 60 / f10;
            DisplayMetrics displayMetrics10 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl3 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics10.widthPixels, displayMetrics10.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f14);
            DisplayMetrics displayMetrics11 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN42 = SizeKt.m17730sizeVpY3zN4(companion, fM23561constructorimpl3, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics11.widthPixels, displayMetrics11.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12));
            long jM11585i = AbstractC7305a.m11585i();
            float f15 = 12 / f10;
            DisplayMetrics displayMetrics12 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17189backgroundbw27NRU = BackgroundKt.m17189backgroundbw27NRU(modifierM17730sizeVpY3zN42, jM11585i, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics12.widthPixels, displayMetrics12.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f15)));
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: z5.p1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC10034s1.m16894f(navController);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM12480g = AbstractC7593i.m12480g(modifierM17189backgroundbw27NRU, false, (Function0) objRememberedValue, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM12480g);
            Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl5 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM20418constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM20418constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m20425setimpl(composerM20418constructorimpl5, modifierMaterializeModifier5, companion4.getSetModifier());
            TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.confirm, composerStartRestartGroup, 6), boxScopeInstance.align(companion, companion3.getCenter()), companion2.m21013getWhite0d7_KjU(), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3456, 0, 131056);
            composerStartRestartGroup.endNode();
            DisplayMetrics displayMetrics13 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics13.widthPixels, displayMetrics13.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12)), composerStartRestartGroup, 6);
            DisplayMetrics displayMetrics14 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl4 = C3127Dp.m23561constructorimpl(f14 * (RangesKt.coerceAtLeast(displayMetrics14.widthPixels, displayMetrics14.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics15 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN43 = SizeKt.m17730sizeVpY3zN4(companion, fM23561constructorimpl4, C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics15.widthPixels, displayMetrics15.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            long jColor = ColorKt.Color(4291611852L);
            DisplayMetrics displayMetrics16 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17189backgroundbw27NRU2 = BackgroundKt.m17189backgroundbw27NRU(modifierM17730sizeVpY3zN43, jColor, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f15 * (RangesKt.coerceAtLeast(displayMetrics16.widthPixels, displayMetrics16.heightPixels) / Resources.getSystem().getDisplayMetrics().density))));
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: z5.q1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC10034s1.m16895g(navController);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierM12480g2 = AbstractC7593i.m12480g(modifierM17189backgroundbw27NRU2, false, (Function0) objRememberedValue2, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM12480g2);
            Function0<ComposeUiNode> constructor6 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor6);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl6 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl6, currentCompositionLocalMap6, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composerM20418constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composerM20418constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.m20425setimpl(composerM20418constructorimpl6, modifierMaterializeModifier6, companion4.getSetModifier());
            composer2 = composerStartRestartGroup;
            TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.cancel, composerStartRestartGroup, 6), boxScopeInstance.align(companion, companion3.getCenter()), ColorKt.Color(4294967295L), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3456, 0, 131056);
            composer2.endNode();
            composer2.endNode();
            composer2.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z5.r1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10034s1.m16893e(navController, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: e */
    public static final Unit m16893e(NavController navController, int i10, Composer composer, int i11) {
        m16892d(navController, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: f */
    public static final Unit m16894f(NavController navController) {
        SavedStateHandle savedStateHandle;
        NavBackStackEntry previousBackStackEntry = navController.getPreviousBackStackEntry();
        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
            savedStateHandle.set("REMOVE_MISTAKE_RESULT_REMOVE_MISTAKE", "");
        }
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* renamed from: g */
    public static final Unit m16895g(NavController navController) {
        navController.navigateUp();
        return Unit.INSTANCE;
    }
}
