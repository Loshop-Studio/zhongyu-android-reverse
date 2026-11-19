package p089f6;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.p013ui.text.AnnotatedString;
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
import com.zykj.evaluation.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import p068d7.AbstractC7305a;
import p189o5.AbstractC8709e;
import p276w5.C9770f;

/* renamed from: f6.g0 */
/* loaded from: classes4.dex */
public abstract class AbstractC7454g0 {
    /* renamed from: d */
    public static final void m12044d(String str, final AnnotatedString annotatedString, final String str2, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Modifier.Companion companion;
        Composer composer3;
        int i12;
        BoxScopeInstance boxScopeInstance;
        final String str3 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(1421785371);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(annotatedString) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1421785371, i11, -1, "com.zykj.evaluation.ui.detail.widget.AnswerScoreItem (ScoreView.kt:58)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f10 = 600;
            float f11 = 17 / f10;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17714height3ABfNKs = SizeKt.m17714height3ABfNKs(companion2, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11));
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17714height3ABfNKs);
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17714height3ABfNKs2 = SizeKt.m17714height3ABfNKs(companion2, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11));
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17713defaultMinSizeVpY3zN4$default = SizeKt.m17713defaultMinSizeVpY3zN4$default(modifierM17714height3ABfNKs2, C3127Dp.m23561constructorimpl((47 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null);
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl(1.0f);
            long jM11583g = AbstractC7305a.m11583g();
            float f12 = 2 / f10;
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17201borderxT4_qwU = BorderKt.m17201borderxT4_qwU(modifierM17713defaultMinSizeVpY3zN4$default, fM23561constructorimpl, jM11583g, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12)));
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl((22 / f10) * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            float f13 = 5 / f10;
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17685paddingqDBjuR0$default = PaddingKt.m17685paddingqDBjuR0$default(modifierM17201borderxT4_qwU, fM23561constructorimpl2, 0.0f, C3127Dp.m23561constructorimpl(f13 * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 10, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
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
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            Modifier modifierAlign = boxScopeInstance2.align(companion2, companion3.getCenterStart());
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
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
            Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (StringsKt.isBlank(annotatedString)) {
                companion = companion2;
                composer3 = composerStartRestartGroup;
                i12 = i11;
                boxScopeInstance = boxScopeInstance2;
                composer3.startReplaceGroup(1521697925);
            } else {
                composerStartRestartGroup.startReplaceGroup(1524140508);
                int i13 = i11;
                i12 = i13;
                boxScopeInstance = boxScopeInstance2;
                companion = companion2;
                TextKt.m19431TextIbK3jfQ(annotatedString, null, AbstractC7305a.m11582f(), AbstractC8709e.m14344k(6), null, null, null, 0L, TextDecoration.INSTANCE.getLineThrough(), null, 0L, 0, false, 0, 0, null, null, null, composerStartRestartGroup, ((i13 >> 3) & 14) | 100666752, 0, 261874);
                composer3 = composerStartRestartGroup;
            }
            composer3.endReplaceGroup();
            Composer composer4 = composer3;
            TextKt.m19430Text4IGK_g(str2, (Modifier) null, AbstractC7305a.m11578b(), AbstractC8709e.m14344k(6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, ((i12 >> 6) & 14) | 3456, 0, 131058);
            composer4.endNode();
            composer4.endNode();
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
            DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17713defaultMinSizeVpY3zN4$default2 = SizeKt.m17713defaultMinSizeVpY3zN4$default(modifierFillMaxHeight$default, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null);
            long jM11579c = AbstractC7305a.m11579c();
            DisplayMetrics displayMetrics8 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl3 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics8.widthPixels, displayMetrics8.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12);
            DisplayMetrics displayMetrics9 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17189backgroundbw27NRU = BackgroundKt.m17189backgroundbw27NRU(modifierM17713defaultMinSizeVpY3zN4$default2, jM11579c, RoundedCornerShapeKt.m17976RoundedCornerShapea9UjIt4$default(fM23561constructorimpl3, 0.0f, 0.0f, C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics9.widthPixels, displayMetrics9.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 6, null));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierM17189backgroundbw27NRU);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            if (composer4.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor4);
            } else {
                composer4.useNode();
            }
            Composer composerM20418constructorimpl4 = Updater.m20418constructorimpl(composer4);
            Updater.m20425setimpl(composerM20418constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM20418constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM20418constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m20425setimpl(composerM20418constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
            str3 = str;
            TextKt.m19430Text4IGK_g(str3, boxScopeInstance.align(companion, companion3.getCenter()), Color.INSTANCE.m21013getWhite0d7_KjU(), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, (i12 & 14) | 3456, 0, 131056);
            composer2 = composer4;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: f6.f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7454g0.m12045e(str3, annotatedString, str2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: e */
    public static final Unit m12045e(String str, AnnotatedString annotatedString, String str2, int i10, Composer composer, int i11) {
        m12044d(str, annotatedString, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: f */
    public static final void m12046f(final List handScoreInfoList, Composer composer, final int i10) throws Resources.NotFoundException {
        int i11;
        Intrinsics.checkNotNullParameter(handScoreInfoList, "handScoreInfoList");
        Composer composerStartRestartGroup = composer.startRestartGroup(1652374471);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(handScoreInfoList) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1652374471, i11, -1, "com.zykj.evaluation.ui.detail.widget.HandScoreView (ScoreView.kt:30)");
            }
            if (handScoreInfoList.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: f6.d0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC7454g0.m12047g(handScoreInfoList, i10, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(R.string.score_title, composerStartRestartGroup, 6);
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            TextKt.m19430Text4IGK_g(strStringResource, SizeKt.m17733width3ABfNKs(companion2, C3127Dp.m23561constructorimpl((21 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), AbstractC7305a.m11577a(), AbstractC8709e.m14344k(8), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 200112, 0, 131024);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(companion2, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHorizontalScroll$default);
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
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            composerStartRestartGroup.startReplaceGroup(1827999808);
            Iterator it = handScoreInfoList.iterator();
            while (it.hasNext()) {
                C9770f c9770f = (C9770f) it.next();
                m12044d(c9770f.m16378a(), c9770f.m16379b(), c9770f.m16380c(), composerStartRestartGroup, 0);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion4, C3127Dp.m23561constructorimpl((5 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: f6.e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7454g0.m12048h(handScoreInfoList, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: g */
    public static final Unit m12047g(List list, int i10, Composer composer, int i11) throws Resources.NotFoundException {
        m12046f(list, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: h */
    public static final Unit m12048h(List list, int i10, Composer composer, int i11) throws Resources.NotFoundException {
        m12046f(list, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }
}
