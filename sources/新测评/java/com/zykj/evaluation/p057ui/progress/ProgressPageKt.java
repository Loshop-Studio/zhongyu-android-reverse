package com.zykj.evaluation.p057ui.progress;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TabKt;
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
import com.zykj.evaluation.R;
import com.zykj.evaluation.p057ui.progress.ProgressPageKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p189o5.AbstractC8709e;
import p256u6.C9576p;

/* loaded from: classes4.dex */
public abstract class ProgressPageKt {
    /* renamed from: k */
    public static final void m10110k(final List list, Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(list, "list");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1362969290);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1362969290, i11, -1, "com.zykj.evaluation.ui.progress.ProgressDataPage (ProgressPage.kt:113)");
            }
            if (list.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(403238636);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
                Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                float f10 = 60 / 600;
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f10);
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_empty_content, composerStartRestartGroup, 6), (String) null, boxScopeInstance.align(SizeKt.m17730sizeVpY3zN4(companion, fM23561constructorimpl, C3127Dp.m23561constructorimpl(f10 * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), companion2.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(402798963);
                ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                float f11 = 600;
                DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(SizeKt.m17733width3ABfNKs(companion4, C3127Dp.m23561constructorimpl((278 / f11) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM17562spacedBy0680j_4 = arrangement.m17562spacedBy0680j_4(C3127Dp.m23561constructorimpl((8 / f11) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
                float f12 = 5 / f11;
                DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
                FlowLayoutKt.FlowRow(modifierVerticalScroll$default, horizontalOrVerticalM17562spacedBy0680j_4, arrangement.m17562spacedBy0680j_4(C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-671388746, true, new Function3() { // from class: u6.h
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return ProgressPageKt.m10111l(list, (FlowRowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573296, 56);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: u6.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProgressPageKt.m10112m(list, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: l */
    public static final Unit m10111l(List list, FlowRowScope FlowRow, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-671388746, i10, -1, "com.zykj.evaluation.ui.progress.ProgressDataPage.<anonymous> (ProgressPage.kt:125)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m10121v((String) it.next(), composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m10112m(List list, int i10, Composer composer, int i11) {
        m10110k(list, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x037c  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10113n(final java.util.List r32, final java.util.List r33, com.zykj.evaluation.p057ui.progress.ProgressViewModel r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 1205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.progress.ProgressPageKt.m10113n(java.util.List, java.util.List, com.zykj.evaluation.ui.progress.ProgressViewModel, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/progress/ProgressPageKt.smali:1391
    }

    /* renamed from: o */
    public static final Object m10114o(C9576p c9576p, int i10) {
        return c9576p.m15983c().get(i10);
    }

    /* renamed from: p */
    public static final Unit m10115p(C9576p c9576p, PagerScope HorizontalPager, int i10, Composer composer, int i11) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-579527386, i11, -1, "com.zykj.evaluation.ui.progress.ProgressPage.<anonymous>.<anonymous> (ProgressPage.kt:102)");
        }
        if (i10 != 0) {
            if (i10 != 1) {
                composer.startReplaceGroup(1064739292);
            } else {
                composer.startReplaceGroup(1419934329);
                m10110k(c9576p.m15982b(), composer, 0);
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1419932086);
            m10110k(c9576p.m15984d(), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final Unit m10116q(C9576p c9576p, final PagerState pagerState, float f10, float f11, final CoroutineScope coroutineScope, Composer composer, int i10) {
        Composer composer2 = composer;
        boolean z9 = true;
        if (composer2.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(542427873, i10, -1, "com.zykj.evaluation.ui.progress.ProgressPage.<anonymous>.<anonymous>.<anonymous> (ProgressPage.kt:70)");
            }
            final int i11 = 0;
            for (Object obj : c9576p.m15983c()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final String str = (String) obj;
                final boolean z10 = i11 == pagerState.getCurrentPage() ? z9 : false;
                Modifier modifierM17730sizeVpY3zN4 = SizeKt.m17730sizeVpY3zN4(Modifier.INSTANCE, f10, f11);
                boolean zChangedInstance = composer2.changedInstance(coroutineScope) | composer2.changed(pagerState) | composer2.changed(i11);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: u6.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProgressPageKt.m10117r(coroutineScope, pagerState, i11);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                TabKt.m19315TabbogVsAg(z10, (Function0) objRememberedValue, modifierM17730sizeVpY3zN4, false, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(2078567400, z9, new Function3() { // from class: u6.k
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        return ProgressPageKt.m10118s(z10, str, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, composer2, 54), composer2, 12583296, 120);
                composer2 = composer;
                i11 = i12;
                z9 = z9;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: r */
    public static final Unit m10117r(CoroutineScope coroutineScope, PagerState pagerState, int i10) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ProgressPageKt$ProgressPage$2$1$1$1$1$1$1(pagerState, i10, null), 3, null);
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public static final Unit m10118s(boolean z9, String str, ColumnScope Tab, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2078567400, i10, -1, "com.zykj.evaluation.ui.progress.ProgressPage.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressPage.kt:81)");
            }
            TextKt.m19430Text4IGK_g(str, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(z9 ? 4283015417L : 4284900966L), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m23438boximpl(TextAlign.INSTANCE.m23445getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3120, 0, 130544);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final Unit m10119t(List list, List list2, ProgressViewModel progressViewModel, int i10, int i11, Composer composer, int i12) {
        m10113n(list, list2, progressViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final int m10120u(C9576p c9576p) {
        return c9576p.m15983c().size();
    }

    /* renamed from: v */
    public static final void m10121v(final String name, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.checkNotNullParameter(name, "name");
        Composer composerStartRestartGroup = composer.startRestartGroup(467193528);
        if ((i10 & 6) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(name) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(467193528, i11, -1, "com.zykj.evaluation.ui.progress.ProgressStudentView (ProgressPage.kt:143)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl((49 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN4 = SizeKt.m17730sizeVpY3zN4(companion, fM23561constructorimpl, C3127Dp.m23561constructorimpl((17 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(1);
            long jColor = ColorKt.Color(4292665056L);
            float f11 = 2 / f10;
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17201borderxT4_qwU = BorderKt.m17201borderxT4_qwU(modifierM17730sizeVpY3zN4, fM23561constructorimpl2, jColor, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17201borderxT4_qwU);
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            composer2 = composerStartRestartGroup;
            TextKt.m19430Text4IGK_g(name, BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter()), ColorKt.Color(4281479730L), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11 & 14) | 3456, 0, 131056);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: u6.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProgressPageKt.m10122w(name, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: w */
    public static final Unit m10122w(String str, int i10, Composer composer, int i11) {
        m10121v(str, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }
}
