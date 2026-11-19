package com.zykj.mistake.feature.collection.filter;

import android.view.compose.C2752c;
import androidx.collection.AbstractC0584a;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
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
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.p011ui.draw.AlphaKt;
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
import androidx.navigation.serialization.C2873c;
import com.zykj.mistake.R;
import com.zykj.mistake.feature.ask.C4525h0;
import com.zykj.mistake.feature.collection.component.AbstractC4569o;
import com.zykj.mistake.feature.collection.component.C4564j;
import com.zykj.mistake.feature.collection.detail.C4577a1;
import com.zykj.mistake.feature.collection.detail.C4589e1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import p137p4.C6383b;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p205y4.AbstractC6775g;

/* renamed from: com.zykj.mistake.feature.collection.filter.y0 */
/* loaded from: classes3.dex */
public abstract class AbstractC4688y0 {
    /* renamed from: a */
    public static final void m4083a(C4676s0 c4676s0, InterfaceC6471c interfaceC6471c, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-586653684);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c4676s0) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-586653684, i8, -1, "com.zykj.mistake.feature.collection.filter.FilterResultActionBar (MistakeCollectionFilterResultScreen.kt:288)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2331Dp.m13305constructorimpl(54)), ColorKt.Color(4294309882L), null, 2, null), C2331Dp.m13305constructorimpl(24), 0.0f, C2331Dp.m13305constructorimpl(18), 0.0f, 10, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7266paddingqDBjuR0$default);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Painter painterPainterResource = PainterResources_androidKt.painterResource(c4676s0.m4082c() ? R.drawable.ic_mistake_selected : R.drawable.ic_mistake_unselected, composerStartRestartGroup, 0);
            String str = c4676s0.m4082c() ? "取消全选" : "全选";
            Modifier modifierM7309size3ABfNKs = SizeKt.m7309size3ABfNKs(companion, C2331Dp.m13305constructorimpl(20));
            int i9 = i8 & 112;
            boolean z8 = i9 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4680u0(interfaceC6471c, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ImageKt.Image(painterPainterResource, str, ClickableKt.m6790clickableXHw0xAI$default(modifierM7309size3ABfNKs, false, null, null, (InterfaceC6469a) objRememberedValue, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, MenuKt.InTransitionDuration);
            long jColor = ColorKt.Color(4279572250L);
            long sp = TextUnitKt.getSp(13);
            Modifier modifierM7266paddingqDBjuR0$default2 = PaddingKt.m7266paddingqDBjuR0$default(companion, C2331Dp.m13305constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null);
            boolean z9 = i9 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new C4680u0(interfaceC6471c, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            TextKt.m9105Text4IGK_g("全选", ClickableKt.m6790clickableXHw0xAI$default(modifierM7266paddingqDBjuR0$default2, false, null, null, (InterfaceC6469a) objRememberedValue2, 7, null), jColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131056);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(" 共筛选出 ");
            long jColor2 = ColorKt.Color(4279572250L);
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            int iPushStyle = builder.pushStyle(new SpanStyle(jColor2, 0L, companion3.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC5824e) null));
            try {
                builder.append(String.valueOf(c4676s0.f6690h));
                builder.pop(iPushStyle);
                builder.append(" 道错题，已选 ");
                iPushStyle = builder.pushStyle(new SpanStyle(ColorKt.Color(4279572250L), 0L, companion3.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC5824e) null));
                try {
                    builder.append(String.valueOf(c4676s0.f6692j.size()));
                    builder.pop(iPushStyle);
                    builder.append(" 道");
                    TextKt.m9106TextIbK3jfQ(builder.toAnnotatedString(), PaddingKt.m7266paddingqDBjuR0$default(companion, C2331Dp.m13305constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4284900966L), TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 3504, 0, 262128);
                    composerStartRestartGroup = composerStartRestartGroup;
                    SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    int i10 = R.drawable.ic_sort_by_time;
                    String str2 = c4676s0.f6693k == MistakeCollectionFilterResultContract$SortType.TIME ? "按加入时间排序" : "按科目排序";
                    boolean z10 = i9 == 32;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z10 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new C4680u0(interfaceC6471c, 7);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    m4085c(i10, str2, (InterfaceC6469a) objRememberedValue3, composerStartRestartGroup, 0);
                    AbstractC1923c.m1055s(28, companion, composerStartRestartGroup, 6);
                    int i11 = R.drawable.ic_filter;
                    boolean z11 = i9 == 32;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z11 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new C4680u0(interfaceC6471c, 8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    m4085c(i11, "筛选", (InterfaceC6469a) objRememberedValue4, composerStartRestartGroup, 48);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } finally {
                }
            } finally {
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4682v0(c4676s0, interfaceC6471c, i, 2));
        }
    }

    /* renamed from: b */
    public static final void m4084b(Modifier modifier, Composer composer, int i) {
        int i8;
        Composer composer2;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(305639980);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(305639980, i8, -1, "com.zykj.mistake.feature.collection.filter.FilterResultEmptyContent (MistakeCollectionFilterResultScreen.kt:191)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            InterfaceC6469a constructor2 = companion2.getConstructor();
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
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl2, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_no_data, composerStartRestartGroup, 0), "暂无符合条件的错题", SizeKt.m7309size3ABfNKs(companion3, C2331Dp.m13305constructorimpl(100)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, MenuKt.InTransitionDuration);
            composer2 = composerStartRestartGroup;
            i9 = 0;
            TextKt.m9105Text4IGK_g("暂无符合条件的错题", PaddingKt.m7266paddingqDBjuR0$default(companion3, 0.0f, C2331Dp.m13305constructorimpl(18), 0.0f, 0.0f, 13, null), ColorKt.Color(4284900966L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3510, 0, 131056);
            if (AbstractC0584a.m899D(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i9 = 0;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4684w0(modifier, i, i9));
        }
    }

    /* renamed from: c */
    public static final void m4085c(int i, String str, InterfaceC6469a interfaceC6469a, Composer composer, int i8) {
        int i9;
        Composer composer2;
        String str2 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2139484436);
        if ((i8 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 256 : 128;
        }
        int i10 = i9;
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2139484436, i10, -1, "com.zykj.mistake.feature.collection.filter.FilterResultIconAction (MistakeCollectionFilterResultScreen.kt:503)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(companion, false, null, null, interfaceC6469a, 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM6790clickableXHw0xAI$default);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i10 & 14), str2, SizeKt.m7309size3ABfNKs(companion, C2331Dp.m13305constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, (i10 & 112) | 384, MenuKt.InTransitionDuration);
            str2 = str;
            TextKt.m9105Text4IGK_g(str2, PaddingKt.m7266paddingqDBjuR0$default(companion, C2331Dp.m13305constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4284900966L), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, ((i10 >> 3) & 14) | 3504, 0, 131056);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C2752c(i, str2, interfaceC6469a, i8));
        }
    }

    /* renamed from: d */
    public static final void m4086d(int i, int i8, MistakeCollectionFilterResultContract$SourceType mistakeCollectionFilterResultContract$SourceType, InterfaceC6469a interfaceC6469a, Composer composer, int i9) {
        int i10;
        InterfaceC6469a interfaceC6469a2;
        Composer composerStartRestartGroup = composer.startRestartGroup(806706963);
        if ((i9 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= composerStartRestartGroup.changed(i8) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= composerStartRestartGroup.changed(mistakeCollectionFilterResultContract$SourceType.ordinal()) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            interfaceC6469a2 = interfaceC6469a;
            i10 |= composerStartRestartGroup.changedInstance(interfaceC6469a2) ? 2048 : 1024;
        } else {
            interfaceC6469a2 = interfaceC6469a;
        }
        int i11 = i10;
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(806706963, i11, -1, "com.zykj.mistake.feature.collection.filter.FilterResultOverLimitDialog (MistakeCollectionFilterResultScreen.kt:424)");
            }
            int i12 = i - i8;
            AndroidDialog_androidKt.Dialog(interfaceC6469a, null, ComposableLambdaKt.rememberComposableLambda(1243919772, true, new C4678t0(interfaceC6469a2, mistakeCollectionFilterResultContract$SourceType, i, i8, i12 < 0 ? 0 : i12), composerStartRestartGroup, 54), composerStartRestartGroup, ((i11 >> 9) & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4678t0(i, i8, mistakeCollectionFilterResultContract$SourceType, interfaceC6469a, i9));
        }
    }

    /* renamed from: e */
    public static final void m4087e(C4676s0 c4676s0, InterfaceC6471c interfaceC6471c, Composer composer, int i) {
        int i8;
        int i9;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-527091376);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c4676s0) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-527091376, i8, -1, "com.zykj.mistake.feature.collection.filter.FilterResultTitleBar (MistakeCollectionFilterResultScreen.kt:216)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 16;
            Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2331Dp.m13305constructorimpl(48)), Color.INSTANCE.m10719getWhite0d7_KjU(), null, 2, null), C2331Dp.m13305constructorimpl(f), 0.0f, C2331Dp.m13305constructorimpl(f), 0.0f, 10, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7266paddingqDBjuR0$default);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion3, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM7309size3ABfNKs = SizeKt.m7309size3ABfNKs(companion, C2331Dp.m13305constructorimpl(28));
            int i10 = i8 & 112;
            boolean z8 = i10 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4525h0(interfaceC6471c, 29);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(modifierM7309size3ABfNKs, false, null, null, (InterfaceC6469a) objRememberedValue, 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM6790clickableXHw0xAI$default);
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
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_black_back, composerStartRestartGroup, 0), "返回", SizeKt.m7309size3ABfNKs(companion, C2331Dp.m13305constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, MenuKt.InTransitionDuration);
            composerStartRestartGroup.endNode();
            String str = c4676s0.f6684b;
            Set set = c4676s0.f6692j;
            int i11 = c4676s0.f6685c;
            int i12 = c4676s0.f6686d;
            i9 = 0;
            TextKt.m9105Text4IGK_g(str, (Modifier) null, ColorKt.Color(4279572250L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, new TextStyle(0L, TextUnitKt.getSp(16), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, 0, 0, (TextMotion) null, 16252925, (AbstractC5824e) null), composerStartRestartGroup, 384, 3072, 57338);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append("（ ");
            int iPushStyle = builder.pushStyle(new SpanStyle(set.size() + i11 > i12 ? ColorKt.Color(4294916912L) : ColorKt.Color(4279572250L), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (AbstractC5824e) null));
            try {
                builder.append(String.valueOf(set.size() + i11));
                builder.pop(iPushStyle);
                builder.append("/");
                builder.append(String.valueOf(i12));
                builder.append("）");
                TextKt.m9106TextIbK3jfQ(builder.toAnnotatedString(), PaddingKt.m7266paddingqDBjuR0$default(companion, C2331Dp.m13305constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4279572250L), TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 3504, 0, 262128);
                SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                Modifier modifierAlpha = AlphaKt.alpha(SizeKt.m7314width3ABfNKs(companion, C2331Dp.m13305constructorimpl(58)), c4676s0.m4081b() ? 1.0f : 0.35f);
                boolean zM4081b = c4676s0.m4081b();
                boolean z9 = i10 == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z9 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new C4680u0(interfaceC6471c, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierM6790clickableXHw0xAI$default2 = ClickableKt.m6790clickableXHw0xAI$default(modifierAlpha, zM4081b, null, null, (InterfaceC6469a) objRememberedValue2, 6, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM6790clickableXHw0xAI$default2);
                InterfaceC6469a constructor3 = companion3.getConstructor();
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
                InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl3, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl3, currentCompositionLocalMap3);
                if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
                }
                Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_add_mistake_collection, composerStartRestartGroup, 0), "加入错题集", SizeKt.m7309size3ABfNKs(companion, C2331Dp.m13305constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, MenuKt.InTransitionDuration);
                composer2 = composerStartRestartGroup;
                TextKt.m9105Text4IGK_g("加入错题集", (Modifier) null, ColorKt.Color(4279572250L), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3462, 3072, 122866);
                if (AbstractC0584a.m899D(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        } else {
            i9 = 0;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4682v0(c4676s0, interfaceC6471c, i, i9));
        }
    }

    /* renamed from: f */
    public static final void m4088f(C4676s0 state, InterfaceC6471c onIntent, Composer composer, int i) {
        List list;
        int i8;
        BoxScopeInstance boxScopeInstance;
        Easing easing;
        int i9;
        AbstractC5830k.m5330g(state, "state");
        List list2 = state.f6689g;
        AbstractC5830k.m5330g(onIntent, "onIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1901916929);
        int i10 = (i & 6) == 0 ? i | (composerStartRestartGroup.changedInstance(state) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onIntent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 19) != 18, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1901916929, i10, -1, "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultScreen (MistakeCollectionFilterResultScreen.kt:58)");
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
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i11 = i10 & 112;
            int i12 = i10 & 126;
            m4087e(state, onIntent, composerStartRestartGroup, i12);
            AbstractC6775g.m6461a(null, composerStartRestartGroup, 0);
            m4083a(state, onIntent, composerStartRestartGroup, i12);
            if (!list2.isEmpty() || state.f6699q || state.f6696n) {
                composerStartRestartGroup.startReplaceGroup(84872750);
                boolean z8 = state.f6696n;
                boolean z9 = state.f6697o;
                boolean z10 = state.f6698p;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    C6383b c6383b = (C6383b) obj;
                    if (state.f6692j.contains(Integer.valueOf(c6383b.f10448c)) || c6383b.f10459n) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(arrayList, 10));
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj2 = arrayList.get(i13);
                    i13++;
                    arrayList2.add(((C6383b) obj2).f10446a);
                }
                Set setM5221H0 = AbstractC5805t.m5221H0(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((C6383b) obj3).f10459n) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(AbstractC5806u.m5277p(arrayList3, 10));
                int size2 = arrayList3.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj4 = arrayList3.get(i14);
                    i14++;
                    arrayList4.add(((C6383b) obj4).f10446a);
                }
                Set setM5221H02 = AbstractC5805t.m5221H0(arrayList4);
                float f = 16;
                PaddingValues paddingValuesM7258PaddingValuesa9UjIt4 = PaddingKt.m7258PaddingValuesa9UjIt4(C2331Dp.m13305constructorimpl(f), C2331Dp.m13305constructorimpl(0), C2331Dp.m13305constructorimpl(f), C2331Dp.m13305constructorimpl(f));
                Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                boolean z11 = i11 == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z11 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new C4680u0(onIntent, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                InterfaceC6469a interfaceC6469a = (InterfaceC6469a) objRememberedValue;
                boolean z12 = i11 == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z12 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new C4680u0(onIntent, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                InterfaceC6469a interfaceC6469a2 = (InterfaceC6469a) objRememberedValue2;
                boolean z13 = i11 == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z13) {
                    list = list2;
                } else {
                    list = list2;
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    }
                    InterfaceC6471c interfaceC6471c = (InterfaceC6471c) objRememberedValue3;
                    i8 = i11;
                    boxScopeInstance = boxScopeInstance2;
                    easing = null;
                    i9 = 0;
                    AbstractC4569o.m4022b(list, z8, z9, z10, modifierWeight$default, true, setM5221H0, setM5221H02, paddingValuesM7258PaddingValuesa9UjIt4, interfaceC6469a, interfaceC6469a2, interfaceC6471c, null, composerStartRestartGroup, 100859904, 0, 4096);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
                objRememberedValue3 = new C4577a1(onIntent, 16);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                InterfaceC6471c interfaceC6471c2 = (InterfaceC6471c) objRememberedValue3;
                i8 = i11;
                boxScopeInstance = boxScopeInstance2;
                easing = null;
                i9 = 0;
                AbstractC4569o.m4022b(list, z8, z9, z10, modifierWeight$default, true, setM5221H0, setM5221H02, paddingValuesM7258PaddingValuesa9UjIt4, interfaceC6469a, interfaceC6469a2, interfaceC6471c2, null, composerStartRestartGroup, 100859904, 0, 4096);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(84638886);
                m4084b(ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                boxScopeInstance = boxScopeInstance2;
                i8 = i11;
                easing = null;
                i9 = 0;
            }
            composerStartRestartGroup.endNode();
            AnimatedVisibilityKt.AnimatedVisibility(state.f6694l, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(180, i9, easing, 6, easing), 0.0f, 2, easing), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(180, i9, easing, 6, easing), 0.0f, 2, easing), (String) null, ComposableLambdaKt.rememberComposableLambda(254280287, true, new C4589e1(onIntent, 1), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 18);
            boolean z14 = state.f6694l;
            Modifier modifierAlign = boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd());
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(220, i9, easing, 6, easing);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue4 == companion4.getEmpty()) {
                objRememberedValue4 = new C4564j(1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EnterTransition enterTransitionSlideInHorizontally = EnterExitTransitionKt.slideInHorizontally(tweenSpecTween$default, (InterfaceC6471c) objRememberedValue4);
            TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(220, i9, easing, 6, easing);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion4.getEmpty()) {
                objRememberedValue5 = new C4564j(1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            AnimatedVisibilityKt.AnimatedVisibility(z14, modifierAlign, enterTransitionSlideInHorizontally, EnterExitTransitionKt.slideOutHorizontally(tweenSpecTween$default2, (InterfaceC6471c) objRememberedValue5), (String) null, ComposableLambdaKt.rememberComposableLambda(363302550, true, new C2873c(2, state, onIntent), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
            composerStartRestartGroup.endNode();
            if (state.f6681G) {
                composerStartRestartGroup.startReplaceGroup(804949344);
                int i15 = state.f6686d;
                int i16 = state.f6685c;
                MistakeCollectionFilterResultContract$SourceType mistakeCollectionFilterResultContract$SourceType = state.f6682H;
                int i17 = i8 == 32 ? 1 : i9;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (i17 != 0 || objRememberedValue6 == companion4.getEmpty()) {
                    objRememberedValue6 = new C4680u0(onIntent, 4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                m4086d(i15, i16, mistakeCollectionFilterResultContract$SourceType, (InterfaceC6469a) objRememberedValue6, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(796232609);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4682v0(state, onIntent, i, 1));
        }
    }
}
