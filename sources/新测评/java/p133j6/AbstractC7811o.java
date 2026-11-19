package p133j6;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.ClipKt;
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
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zykj.evaluation.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p068d7.AbstractC7305a;
import p101g7.AbstractC7593i;
import p189o5.AbstractC8709e;

/* renamed from: j6.o */
/* loaded from: classes4.dex */
public abstract class AbstractC7811o {
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* renamed from: g */
    public static final void m13223g(Modifier modifier, final C7799c groupState, final Function1 onClickQuestionDescription, Function1 onClickToDetail, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Function1 function1;
        Composer composer2;
        Object obj;
        ?? r42;
        Intrinsics.checkNotNullParameter(groupState, "groupState");
        Intrinsics.checkNotNullParameter(onClickQuestionDescription, "onClickQuestionDescription");
        Intrinsics.checkNotNullParameter(onClickToDetail, "onClickToDetail");
        Composer composerStartRestartGroup = composer.startRestartGroup(1954430413);
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
            i12 |= composerStartRestartGroup.changedInstance(groupState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickQuestionDescription) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickToDetail) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            Modifier modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1954430413, i12, -1, "com.zykj.evaluation.ui.guide.normal.GuideGroupView (GuideQuestionViews.kt:31)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
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
            Alignment.Vertical bottom = companion.getBottom();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), bottom, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17735widthInVpY3zN4$default = SizeKt.m17735widthInVpY3zN4$default(companion3, 0.0f, C3127Dp.m23561constructorimpl((275 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 1, null);
            String strM13209d = groupState.m13209d();
            int i14 = i12;
            long jM11577a = AbstractC7305a.m11577a();
            long jM14344k = AbstractC8709e.m14344k(8);
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            FontWeight medium = companion4.getMedium();
            TextOverflow.Companion companion5 = TextOverflow.INSTANCE;
            Modifier modifier4 = modifier3;
            TextKt.m19430Text4IGK_g(strM13209d, modifierM17735widthInVpY3zN4$default, jM11577a, jM14344k, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion5.m23497getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 200112, 3120, 120784);
            TextKt.m19430Text4IGK_g(groupState.m13207b(), (Modifier) null, AbstractC7305a.m11577a(), AbstractC8709e.m14344k(7), (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion5.m23497getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 200064, 3120, 120786);
            Composer composer3 = composerStartRestartGroup;
            if (groupState.m13206a().length() > 0) {
                composer3.startReplaceGroup(-662611731);
                boolean zChangedInstance = composer3.changedInstance(groupState) | ((i14 & 896) == 256);
                Object objRememberedValue = composer3.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: j6.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC7811o.m13224h(onClickQuestionDescription, groupState);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue);
                }
                obj = null;
                Modifier modifierM12480g = AbstractC7593i.m12480g(companion3, false, (Function0) objRememberedValue, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierM12480g);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor3);
                } else {
                    composer3.useNode();
                }
                Composer composerM20418constructorimpl3 = Updater.m20418constructorimpl(composer3);
                Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                r42 = 1;
                TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.question_description, composer3, 6), (Modifier) null, AbstractC7305a.m11585i(), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3456, 0, 131058);
                composer3 = composer3;
                composer3.endNode();
            } else {
                obj = null;
                r42 = 1;
                composer3.startReplaceGroup(-664539621);
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion3, 0.0f, r42, obj);
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17683paddingVpY3zN4$default = PaddingKt.m17683paddingVpY3zN4$default(modifierFillMaxHeight$default, C3127Dp.m23561constructorimpl((9 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, obj);
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM17562spacedBy0680j_4 = arrangement.m17562spacedBy0680j_4(C3127Dp.m23561constructorimpl((14 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            function1 = onClickToDetail;
            FlowLayoutKt.FlowRow(modifierM17683paddingVpY3zN4$default, horizontalOrVerticalM17562spacedBy0680j_4, arrangement.m17562spacedBy0680j_4(C3127Dp.m23561constructorimpl((((float) r42) / f10) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-1782281880, r42, new Function3() { // from class: j6.j
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return AbstractC7811o.m13225i(groupState, function1, (FlowRowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, composer3, 54), composer3, 1573302, 56);
            composer2 = composer3;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            function1 = onClickToDetail;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function1 function12 = function1;
            final Modifier modifier5 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: j6.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AbstractC7811o.m13227k(modifier5, groupState, onClickQuestionDescription, function12, i10, i11, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* renamed from: h */
    public static final Unit m13224h(Function1 function1, C7799c c7799c) {
        function1.invoke(c7799c.m13206a());
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Unit m13225i(C7799c c7799c, final Function1 function1, FlowRowScope FlowRow, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1782281880, i10, -1, "com.zykj.evaluation.ui.guide.normal.GuideGroupView.<anonymous>.<anonymous> (GuideQuestionViews.kt:74)");
            }
            for (final C7804h c7804h : c7799c.m13208c()) {
                boolean zChanged = composer.changed(function1) | composer.changed(c7804h);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: j6.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC7811o.m13226j(function1, c7804h);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                m13228l(null, c7804h, (Function0) objRememberedValue, composer, 0, 1);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m13226j(Function1 function1, C7804h c7804h) {
        function1.invoke(Long.valueOf(c7804h.m13214e()));
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m13227k(Modifier modifier, C7799c c7799c, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        m13223g(modifier, c7799c, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final void m13228l(Modifier modifier, final C7804h guideQuestionState, final Function0 onClickToDetail, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Modifier modifier3;
        int i13;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(guideQuestionState, "guideQuestionState");
        Intrinsics.checkNotNullParameter(onClickToDetail, "onClickToDetail");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1363561367);
        int i16 = i11 & 1;
        if (i16 != 0) {
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
            i12 |= composerStartRestartGroup.changed(guideQuestionState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickToDetail) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            Modifier modifier4 = i16 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1363561367, i12, -1, "com.zykj.evaluation.ui.guide.normal.GuideQuestionView (GuideQuestionViews.kt:90)");
            }
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17733width3ABfNKs = SizeKt.m17733width3ABfNKs(modifier4, C3127Dp.m23561constructorimpl((38 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17733width3ABfNKs);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            float f11 = 36 / f10;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11);
            float f12 = 20 / f10;
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN4 = SizeKt.m17730sizeVpY3zN4(companion3, fM23561constructorimpl, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12));
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17685paddingqDBjuR0$default = PaddingKt.m17685paddingqDBjuR0$default(modifierM17730sizeVpY3zN4, 0.0f, C3127Dp.m23561constructorimpl((4 / f10) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 13, null);
            float f13 = 8 / f10;
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierClip = ClipKt.clip(modifierM17685paddingqDBjuR0$default, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f13)));
            long jM13236a = guideQuestionState.m13215f().m13236a();
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17189backgroundbw27NRU = BackgroundKt.m17189backgroundbw27NRU(modifierClip, jM13236a, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f13)));
            float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(1);
            long jM13238c = guideQuestionState.m13215f().m13238c();
            DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17201borderxT4_qwU = BorderKt.m17201borderxT4_qwU(modifierM17189backgroundbw27NRU, fM23561constructorimpl2, jM13238c, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f13 * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density))));
            boolean z9 = (i12 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: j6.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC7811o.m13229m(onClickToDetail);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM12480g = AbstractC7593i.m12480g(modifierM17201borderxT4_qwU, false, (Function0) objRememberedValue, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM12480g);
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
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Modifier modifier5 = modifier4;
            TextKt.m19430Text4IGK_g(guideQuestionState.m13212c(), boxScopeInstance.align(companion3, companion.getCenter()), guideQuestionState.m13215f().m13239d(), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m23497getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 3120, 120816);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (guideQuestionState.m13210a()) {
                composerStartRestartGroup.startReplaceGroup(605001612);
                float f14 = 9 / f10;
                DisplayMetrics displayMetrics8 = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl3 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics8.widthPixels, displayMetrics8.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f14);
                DisplayMetrics displayMetrics9 = Resources.getSystem().getDisplayMetrics();
                i14 = 6;
                i13 = 600917331;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_guide_item_ask_for_help, composerStartRestartGroup, 6), (String) null, boxScopeInstance.align(SizeKt.m17730sizeVpY3zN4(companion3, fM23561constructorimpl3, C3127Dp.m23561constructorimpl(f14 * (RangesKt.coerceAtLeast(displayMetrics9.widthPixels, displayMetrics9.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), companion.getTopEnd()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
            } else {
                i13 = 600917331;
                i14 = 6;
                composerStartRestartGroup.startReplaceGroup(600917331);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (guideQuestionState.m13216g().length() > 0) {
                composerStartRestartGroup.startReplaceGroup(605359879);
                DisplayMetrics displayMetrics10 = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl4 = C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics10.widthPixels, displayMetrics10.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
                DisplayMetrics displayMetrics11 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17730sizeVpY3zN42 = SizeKt.m17730sizeVpY3zN4(companion3, fM23561constructorimpl4, C3127Dp.m23561constructorimpl((39 / f10) * (RangesKt.coerceAtLeast(displayMetrics11.widthPixels, displayMetrics11.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
                DisplayMetrics displayMetrics12 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17685paddingqDBjuR0$default2 = PaddingKt.m17685paddingqDBjuR0$default(modifierM17730sizeVpY3zN42, 0.0f, C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics12.widthPixels, displayMetrics12.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17685paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
                Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (guideQuestionState.m13213d().getText().length() > 0) {
                    composerStartRestartGroup.startReplaceGroup(2063821614);
                    i15 = i13;
                    TextKt.m19431TextIbK3jfQ(guideQuestionState.m13213d(), null, ColorKt.Color(4291348940L), AbstractC8709e.m14344k(i14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 3456, 0, 262130);
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    i15 = i13;
                    composerStartRestartGroup.startReplaceGroup(2059102763);
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer2 = composerStartRestartGroup;
                TextKt.m19430Text4IGK_g(guideQuestionState.m13216g(), (Modifier) null, ColorKt.Color(4284769638L), AbstractC8709e.m14344k(i14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3456, 0, 131058);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endNode();
            } else {
                i15 = i13;
                composerStartRestartGroup.startReplaceGroup(i15);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (guideQuestionState.m13211b()) {
                composerStartRestartGroup.startReplaceGroup(606103042);
                DisplayMetrics displayMetrics13 = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl5 = C3127Dp.m23561constructorimpl((9 / f10) * (RangesKt.coerceAtLeast(displayMetrics13.widthPixels, displayMetrics13.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
                float f15 = 24 / f10;
                DisplayMetrics displayMetrics14 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierAlign = boxScopeInstance.align(SizeKt.m17730sizeVpY3zN4(companion3, fM23561constructorimpl5, C3127Dp.m23561constructorimpl(f15 * (RangesKt.coerceAtLeast(displayMetrics14.widthPixels, displayMetrics14.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), companion.getTopEnd());
                DisplayMetrics displayMetrics15 = Resources.getSystem().getDisplayMetrics();
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_guide_item_micro_class, composerStartRestartGroup, i14), (String) null, PaddingKt.m17685paddingqDBjuR0$default(modifierAlign, 0.0f, C3127Dp.m23561constructorimpl((15 / f10) * (RangesKt.coerceAtLeast(displayMetrics15.widthPixels, displayMetrics15.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
            } else {
                composerStartRestartGroup.startReplaceGroup(i15);
            }
            composerStartRestartGroup.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: j6.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7811o.m13230n(modifier3, guideQuestionState, onClickToDetail, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: m */
    public static final Unit m13229m(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m13230n(Modifier modifier, C7804h c7804h, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m13228l(modifier, c7804h, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
