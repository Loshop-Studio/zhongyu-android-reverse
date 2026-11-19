package com.zykj.mistake.feature.collection.detail;

import android.view.C2764i;
import android.view.compose.C2756g;
import androidx.collection.AbstractC0584a;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.C2856d;
import androidx.navigation.compose.C2842d;
import androidx.navigation.serialization.C2873c;
import com.zykj.mistake.R;
import com.zykj.mistake.feature.ask.C4525h0;
import com.zykj.mistake.feature.collection.component.AbstractC4560f;
import com.zykj.mistake.feature.collection.component.AbstractC4569o;
import com.zykj.mistake.feature.collection.component.C4564j;
import com.zykj.mistake.utils.C5100e;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p205y4.AbstractC6774f;
import p205y4.AbstractC6775g;

/* renamed from: com.zykj.mistake.feature.collection.detail.f1 */
/* loaded from: classes3.dex */
public abstract class AbstractC4592f1 {
    /* renamed from: a */
    public static final void m4038a(C4632z0 c4632z0, Modifier modifier, InterfaceC6471c interfaceC6471c, Composer composer, int i) {
        int i8;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1967794106);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c4632z0) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1967794106, i8, -1, "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailContent (MistakeCollectionDetailScreen.kt:405)");
            }
            int i9 = i8 & 896;
            boolean z8 = i9 == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4577a1(interfaceC6471c, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            InterfaceC6471c interfaceC6471cM4460d = C5100e.m4460d(composerStartRestartGroup, (InterfaceC6471c) objRememberedValue);
            Modifier modifierM6754backgroundbw27NRU$default = BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), ColorKt.Color(4294309882L), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM6754backgroundbw27NRU$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (!c4632z0.f6552g.isEmpty() || c4632z0.f6555j) {
                if (c4632z0.f6552g.isEmpty()) {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-1921617258);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1903574297);
                    List list = c4632z0.f6552g;
                    boolean z9 = c4632z0.f6555j;
                    boolean z10 = c4632z0.f6556k;
                    boolean z11 = c4632z0.f6557l;
                    boolean z12 = c4632z0.f6542G;
                    Set set = c4632z0.f6543H;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    boolean z13 = i9 == 256;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z13 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new C4525h0(interfaceC6471c, 7);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    InterfaceC6469a interfaceC6469a = (InterfaceC6469a) objRememberedValue2;
                    boolean z14 = i9 == 256;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z14 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new C4525h0(interfaceC6471c, 16);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    InterfaceC6469a interfaceC6469a2 = (InterfaceC6469a) objRememberedValue3;
                    boolean zChangedInstance = (i9 == 256) | composerStartRestartGroup.changedInstance(c4632z0) | composerStartRestartGroup.changed(interfaceC6471cM4460d);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new C2764i(c4632z0, interfaceC6471c, interfaceC6471cM4460d, 6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    InterfaceC6471c interfaceC6471c2 = (InterfaceC6471c) objRememberedValue4;
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(c4632z0) | (i9 == 256);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new C2856d(6, c4632z0, interfaceC6471c);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    AbstractC4569o.m4022b(list, z9, z10, z11, modifierFillMaxSize$default, z12, set, null, null, interfaceC6469a, interfaceC6469a2, interfaceC6471c2, (InterfaceC6471c) objRememberedValue5, composerStartRestartGroup, 24576, 0, 384);
                    composer2 = composerStartRestartGroup;
                }
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1903718292);
                m4039b(c4632z0, composerStartRestartGroup, i8 & 14);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C2756g(i, 5, c4632z0, modifier, interfaceC6471c));
        }
    }

    /* renamed from: b */
    public static final void m4039b(C4632z0 c4632z0, Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-652208947);
        int i8 = i & 1;
        if (composerStartRestartGroup.shouldExecute(i8 != 0, i8)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-652208947, i, -1, "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailEmptyContent (MistakeCollectionDetailScreen.kt:449)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_no_data, composerStartRestartGroup, 0), "暂无符合条件的错题", SizeKt.m7309size3ABfNKs(companion, C2331Dp.m13305constructorimpl(100)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, MenuKt.InTransitionDuration);
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g("暂无任何错题", PaddingKt.m7266paddingqDBjuR0$default(companion, 0.0f, C2331Dp.m13305constructorimpl(18), 0.0f, 0.0f, 13, null), ColorKt.Color(4284900966L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3510, 0, 131056);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C2842d(c4632z0, i, 3));
        }
    }

    /* renamed from: c */
    public static final void m4040c(C4632z0 state, InterfaceC6471c onIntent, Composer composer, int i) {
        int i8;
        int i9;
        boolean z8;
        boolean z9;
        int i10;
        boolean z10;
        AbstractC5830k.m5330g(state, "state");
        AbstractC5830k.m5330g(onIntent, "onIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1687589722);
        if ((i & 6) == 0) {
            i8 = i | (composerStartRestartGroup.changedInstance(state) ? 4 : 2);
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onIntent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1687589722, i8, -1, "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailScreen (MistakeCollectionDetailScreen.kt:64)");
            }
            if (!state.f6550e || state.f6546a.length() <= 0) {
                i9 = i8;
                z8 = false;
            } else {
                i9 = i8;
                z8 = true;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM6754backgroundbw27NRU$default = BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ColorKt.Color(4294309882L), null, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM6754backgroundbw27NRU$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion3, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            InterfaceC6469a constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl2, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            int i11 = i9 & 112;
            m4041d(state, onIntent, composerStartRestartGroup, i9 & 126);
            AbstractC6775g.m6461a(null, composerStartRestartGroup, 0);
            m4038a(state, ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), onIntent, composerStartRestartGroup, ((i9 << 3) & 896) | (i9 & 14));
            composerStartRestartGroup.endNode();
            AnimatedVisibilityKt.AnimatedVisibility(z8, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(180, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(180, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-572047432, true, new C4589e1(onIntent, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 18);
            Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getCenterEnd());
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(220, 0, null, 6, null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new C4564j(1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EnterTransition enterTransitionSlideInHorizontally = EnterExitTransitionKt.slideInHorizontally(tweenSpecTween$default, (InterfaceC6471c) objRememberedValue);
            TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(220, 0, null, 6, null);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new C4564j(1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AnimatedVisibilityKt.AnimatedVisibility(z8, modifierAlign, enterTransitionSlideInHorizontally, EnterExitTransitionKt.slideOutHorizontally(tweenSpecTween$default2, (InterfaceC6471c) objRememberedValue2), (String) null, ComposableLambdaKt.rememberComposableLambda(-1176099217, true, new C2873c(1, state, onIntent), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
            composerStartRestartGroup.endNode();
            if (state.f6538C) {
                composerStartRestartGroup.startReplaceGroup(-1896551957);
                String str = state.f6539D;
                String str2 = state.f6540E;
                boolean z11 = state.f6541F;
                boolean z12 = i11 == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z12 || objRememberedValue3 == companion4.getEmpty()) {
                    objRememberedValue3 = new C4577a1(onIntent, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                InterfaceC6471c interfaceC6471c = (InterfaceC6471c) objRememberedValue3;
                boolean z13 = i11 == 32;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z13 || objRememberedValue4 == companion4.getEmpty()) {
                    objRememberedValue4 = new C4525h0(onIntent, 18);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                InterfaceC6469a interfaceC6469a = (InterfaceC6469a) objRememberedValue4;
                boolean z14 = i11 == 32;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z14 || objRememberedValue5 == companion4.getEmpty()) {
                    objRememberedValue5 = new C4525h0(onIntent, 19);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                z10 = true;
                z9 = false;
                i10 = i11;
                AbstractC4560f.m4019b("编辑错题集名称", str, str2, "确认", "确认中...", z11, null, null, null, false, interfaceC6471c, interfaceC6469a, (InterfaceC6469a) objRememberedValue5, composerStartRestartGroup, 27654, 0, 960);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                z9 = false;
                i10 = i11;
                z10 = true;
                composerStartRestartGroup.startReplaceGroup(-1904565240);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (state.f6545J) {
                composerStartRestartGroup.startReplaceGroup(-1895950867);
                int size = state.f6543H.size();
                boolean z15 = state.f6544I;
                boolean z16 = i10 == 32 ? z10 : z9;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z16 || objRememberedValue6 == companion4.getEmpty()) {
                    objRememberedValue6 = new C4525h0(onIntent, 20);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                InterfaceC6469a interfaceC6469a2 = (InterfaceC6469a) objRememberedValue6;
                boolean z17 = i10 == 32 ? z10 : z9;
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (z17 || objRememberedValue7 == companion4.getEmpty()) {
                    objRememberedValue7 = new C4525h0(onIntent, 21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                m4042e(size, z15, interfaceC6469a2, (InterfaceC6469a) objRememberedValue7, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1904565240);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4586d1(state, onIntent, i, 1));
        }
    }

    /* renamed from: d */
    public static final void m4041d(C4632z0 c4632z0, InterfaceC6471c interfaceC6471c, Composer composer, int i) {
        int i8;
        C4632z0 c4632z02;
        Modifier.Companion companion;
        boolean z8;
        Modifier.Companion companion2;
        int i9;
        boolean z9;
        AnnotatedString annotatedString;
        Composer composerStartRestartGroup = composer.startRestartGroup(-256090359);
        if ((i & 6) == 0) {
            i8 = i | (composerStartRestartGroup.changedInstance(c4632z0) ? 4 : 2);
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-256090359, i8, -1, "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailTitleBar (MistakeCollectionDetailScreen.kt:195)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            float f = 44;
            float f7 = 16;
            Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), C2331Dp.m13305constructorimpl(f)), Color.INSTANCE.m10719getWhite0d7_KjU(), null, 2, null), C2331Dp.m13305constructorimpl(f7), 0.0f, C2331Dp.m13305constructorimpl(f7), 0.0f, 10, null);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion4.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7266paddingqDBjuR0$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion5, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM7309size3ABfNKs = SizeKt.m7309size3ABfNKs(companion3, C2331Dp.m13305constructorimpl(28));
            int i10 = i8 & 112;
            boolean z10 = i10 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4525h0(interfaceC6471c, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(modifierM7309size3ABfNKs, false, null, null, (InterfaceC6469a) objRememberedValue, 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM6790clickableXHw0xAI$default);
            InterfaceC6469a constructor2 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion5, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_black_back, composerStartRestartGroup, 0), "返回", SizeKt.m7309size3ABfNKs(companion3, C2331Dp.m13305constructorimpl(f7)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, MenuKt.InTransitionDuration);
            composerStartRestartGroup.endNode();
            TextStyle textStyle = new TextStyle(0L, TextUnitKt.getSp(16), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, 0, 0, (TextMotion) null, 16252925, (AbstractC5824e) null);
            TextStyle textStyle2 = new TextStyle(0L, TextUnitKt.getSp(13), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, 0, 0, (TextMotion) null, 16252925, (AbstractC5824e) null);
            Modifier modifierM7295height3ABfNKs = SizeKt.m7295height3ABfNKs(companion3, C2331Dp.m13305constructorimpl(f));
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7295height3ABfNKs);
            InterfaceC6469a constructor3 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl3 = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion5, composerM10109constructorimpl3, measurePolicyRowMeasurePolicy2, composerM10109constructorimpl3, currentCompositionLocalMap3);
            if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
            }
            Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
            String str = c4632z0.f6547b;
            Set set = c4632z0.f6543H;
            MistakeCollectionDetailContract$EntryMode mistakeCollectionDetailContract$EntryMode = c4632z0.f6549d;
            int i11 = c4632z0.f6548c;
            boolean z11 = c4632z0.f6544I;
            boolean z12 = c4632z0.f6542G;
            TextKt.m9105Text4IGK_g(str, (Modifier) null, ColorKt.Color(4279572250L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, textStyle, composerStartRestartGroup, 384, 3072, 57338);
            if (z12) {
                composerStartRestartGroup.startReplaceGroup(-1761502909);
                if (set.isEmpty()) {
                    z9 = true;
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    builder.append(" 未选择");
                    annotatedString = builder.toAnnotatedString();
                } else {
                    z9 = true;
                    AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                    builder2.append(" 已选择 ");
                    int iPushStyle = builder2.pushStyle(new SpanStyle(ColorKt.Color(4279572250L), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (AbstractC5824e) null));
                    try {
                        builder2.append(String.valueOf(set.size()));
                        builder2.pop(iPushStyle);
                        builder2.append(" 道");
                        annotatedString = builder2.toAnnotatedString();
                    } catch (Throwable th) {
                        builder2.pop(iPushStyle);
                        throw th;
                    }
                }
                companion = companion3;
                z8 = z9;
                TextKt.m9106TextIbK3jfQ(annotatedString, PaddingKt.m7266paddingqDBjuR0$default(companion3, C2331Dp.m13305constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4288256409L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, textStyle2, composerStartRestartGroup, 432, 0, 131064);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                companion = companion3;
                z8 = true;
                composerStartRestartGroup.startReplaceGroup(-1760798248);
                TextKt.m9105Text4IGK_g("（ " + i11 + "/100）", PaddingKt.m7266paddingqDBjuR0$default(companion, C2331Dp.m13305constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4279572250L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, textStyle2, composerStartRestartGroup, 432, 0, 65528);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            MistakeCollectionDetailContract$EntryMode mistakeCollectionDetailContract$EntryMode2 = MistakeCollectionDetailContract$EntryMode.EXISTING;
            if (mistakeCollectionDetailContract$EntryMode != mistakeCollectionDetailContract$EntryMode2 || z12) {
                companion2 = companion;
                i9 = i10;
                composerStartRestartGroup.startReplaceGroup(-1617046731);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1605483421);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_black_edit, composerStartRestartGroup, 0);
                companion2 = companion;
                Modifier modifierM7309size3ABfNKs2 = SizeKt.m7309size3ABfNKs(PaddingKt.m7266paddingqDBjuR0$default(companion2, C2331Dp.m13305constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null), C2331Dp.m13305constructorimpl(18));
                boolean z13 = i10 == 32 ? z8 : false;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z13 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new C4525h0(interfaceC6471c, 9);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Composer composer2 = composerStartRestartGroup;
                i9 = i10;
                ImageKt.Image(painterPainterResource, "编辑错题集", ClickableKt.m6790clickableXHw0xAI$default(modifierM7309size3ABfNKs2, false, null, null, (InterfaceC6469a) objRememberedValue2, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, MenuKt.InTransitionDuration);
                composerStartRestartGroup = composer2;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion6 = companion2;
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion6, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            if (mistakeCollectionDetailContract$EntryMode == MistakeCollectionDetailContract$EntryMode.CREATED) {
                composerStartRestartGroup.startReplaceGroup(-1604991978);
                int i12 = R.drawable.ic_new_mistake;
                boolean z14 = i9 == 32 ? z8 : false;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z14 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new C4525h0(interfaceC6471c, 10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                AbstractC6774f.m6460a(i12, "加题", 0.0f, false, (InterfaceC6469a) objRememberedValue3, composerStartRestartGroup, 48, 12);
                composerStartRestartGroup.endReplaceGroup();
                c4632z02 = c4632z0;
            } else {
                if (mistakeCollectionDetailContract$EntryMode == mistakeCollectionDetailContract$EntryMode2) {
                    composerStartRestartGroup.startReplaceGroup(-1604634021);
                    if (z12) {
                        composerStartRestartGroup.startReplaceGroup(-1604636067);
                        int i13 = R.drawable.ic_black_delete;
                        String str2 = z11 ? "删除中..." : "删除";
                        float f8 = (set.isEmpty() || z11) ? 0.35f : 1.0f;
                        boolean z15 = (set.isEmpty() || z11) ? false : z8;
                        boolean z16 = i9 == 32 ? z8 : false;
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (z16 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new C4525h0(interfaceC6471c, 11);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        AbstractC6774f.m6460a(i13, str2, f8, z15, (InterfaceC6469a) objRememberedValue4, composerStartRestartGroup, 0, 0);
                        AbstractC1923c.m1055s(12, companion6, composerStartRestartGroup, 6);
                        int i14 = R.drawable.ic_mistake_cancel;
                        boolean z17 = i9 == 32 ? z8 : false;
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (z17 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new C4525h0(interfaceC6471c, 12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        AbstractC6774f.m6460a(i14, "取消", 0.0f, false, (InterfaceC6469a) objRememberedValue5, composerStartRestartGroup, 48, 12);
                        composerStartRestartGroup.endReplaceGroup();
                        c4632z02 = c4632z0;
                    } else {
                        if (i11 <= 0) {
                            c4632z02 = c4632z0;
                            if (c4632z02.f6552g.isEmpty()) {
                                composerStartRestartGroup.startReplaceGroup(-1603868290);
                                int i15 = R.drawable.ic_new_mistake;
                                boolean z18 = i9 == 32 ? z8 : false;
                                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (z18 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new C4525h0(interfaceC6471c, 13);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                }
                                AbstractC6774f.m6460a(i15, "加题", 0.0f, false, (InterfaceC6469a) objRememberedValue6, composerStartRestartGroup, 48, 12);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                        } else {
                            c4632z02 = c4632z0;
                        }
                        composerStartRestartGroup.startReplaceGroup(-1603595490);
                        int i16 = R.drawable.ic_practice_switch;
                        boolean z19 = c4632z02.f6553h;
                        String str3 = z19 ? "练习: 开" : "练习: 关";
                        float f9 = z19 ? 1.0f : 0.5f;
                        boolean z20 = i9 == 32 ? z8 : false;
                        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (z20 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new C4525h0(interfaceC6471c, 14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        AbstractC6774f.m6460a(i16, str3, f9, false, (InterfaceC6469a) objRememberedValue7, composerStartRestartGroup, 0, 8);
                        float f10 = 12;
                        AbstractC1923c.m1055s(f10, companion6, composerStartRestartGroup, 6);
                        int i17 = R.drawable.ic_new_mistake;
                        boolean z21 = i9 == 32 ? z8 : false;
                        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (z21 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new C4525h0(interfaceC6471c, 15);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        AbstractC6774f.m6460a(i17, "加题", 0.0f, false, (InterfaceC6469a) objRememberedValue8, composerStartRestartGroup, 48, 12);
                        AbstractC1923c.m1055s(f10, companion6, composerStartRestartGroup, 6);
                        int i18 = R.drawable.ic_black_delete;
                        boolean z22 = i9 == 32 ? z8 : false;
                        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (z22 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = new C4525h0(interfaceC6471c, 17);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                        }
                        AbstractC6774f.m6460a(i18, "删题", 0.0f, false, (InterfaceC6469a) objRememberedValue9, composerStartRestartGroup, 48, 12);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                } else {
                    c4632z02 = c4632z0;
                    composerStartRestartGroup.startReplaceGroup(-1617046731);
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            c4632z02 = c4632z0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4586d1(c4632z02, interfaceC6471c, i, 0));
        }
    }

    /* renamed from: e */
    public static final void m4042e(int i, boolean z8, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, Composer composer, int i8) {
        int i9;
        InterfaceC6469a interfaceC6469a3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2114357808);
        if ((i8 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= composerStartRestartGroup.changed(z8) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6469a2) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 1171) != 1170, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2114357808, i9, -1, "com.zykj.mistake.feature.collection.detail.RemoveMistakeConfirmDialog (MistakeCollectionDetailScreen.kt:328)");
            }
            interfaceC6469a3 = interfaceC6469a;
            AndroidDialog_androidKt.Dialog(interfaceC6469a3, null, ComposableLambdaKt.rememberComposableLambda(-1571779271, true, new C4580b1(i, z8, interfaceC6469a, interfaceC6469a2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i9 >> 6) & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            interfaceC6469a3 = interfaceC6469a;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4583c1(i, z8, interfaceC6469a3, interfaceC6469a2, i8));
        }
    }
}
