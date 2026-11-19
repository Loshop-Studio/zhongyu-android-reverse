package com.zykj.mistake.feature.collection.list;

import android.support.v4.media.AbstractC0037f;
import android.view.compose.C2756g;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
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
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zykj.mistake.R;
import com.zykj.mistake.feature.ask.C4527i0;
import com.zykj.mistake.feature.collection.component.AbstractC4560f;
import com.zykj.mistake.feature.collection.detail.C4577a1;
import com.zykj.mistake.feature.collection.filter.C4680u0;
import com.zykj.mistake.utils.C5100e;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p205y4.AbstractC6775g;

/* renamed from: com.zykj.mistake.feature.collection.list.c0 */
/* loaded from: classes3.dex */
public abstract class AbstractC4704c0 {
    /* renamed from: a */
    public static final void m4093a(boolean z8, Modifier modifier, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(164303435);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(z8) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        int i9 = i8 | 48;
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(164303435, i9, -1, "com.zykj.mistake.feature.collection.list.CollectionSelectionIndicator (MistakeCollectionScreen.kt:324)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(z8 ? R.drawable.ic_mistake_selected : R.drawable.ic_mistake_unselected, composerStartRestartGroup, 0), z8 ? "已选择" : "未选择", SizeKt.m7309size3ABfNKs(modifier, C2331Dp.m13305constructorimpl(18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, MenuKt.InTransitionDuration);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4527i0(z8, modifier, i, 1));
        }
    }

    /* renamed from: b */
    public static final void m4094b(C4701b c4701b, boolean z8, boolean z9, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, Composer composer, int i) {
        int i8;
        InterfaceC6469a interfaceC6469a3;
        InterfaceC6469a interfaceC6469a4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-308467799);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(c4701b) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(z9) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            interfaceC6469a3 = interfaceC6469a;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a3) ? 2048 : 1024;
        } else {
            interfaceC6469a3 = interfaceC6469a;
        }
        if ((i & 24576) == 0) {
            interfaceC6469a4 = interfaceC6469a2;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a4) ? 16384 : 8192;
        } else {
            interfaceC6469a4 = interfaceC6469a2;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-308467799, i8, -1, "com.zykj.mistake.feature.collection.list.MistakeCollectionCard (MistakeCollectionScreen.kt:264)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Color.Companion companion2 = Color.INSTANCE;
            float f = 4;
            float f7 = 20;
            Modifier modifierM7265paddingqDBjuR0 = PaddingKt.m7265paddingqDBjuR0(ClickableKt.m6798combinedClickablef5TDLPQ$default(BorderKt.m6767borderxT4_qwU(AbstractC1923c.m1042f(f, modifierFillMaxWidth$default, companion2.m10719getWhite0d7_KjU()), C2331Dp.m13305constructorimpl(z9 ? 1 : 0), z9 ? ColorKt.Color(4279596799L) : companion2.m10717getTransparent0d7_KjU(), RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(f))), false, null, null, null, interfaceC6469a4, null, false, interfaceC6469a3, 111, null), C2331Dp.m13305constructorimpl(22), C2331Dp.m13305constructorimpl(f7), C2331Dp.m13305constructorimpl(16), C2331Dp.m13305constructorimpl(f7));
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7265paddingqDBjuR0);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion4.getConstructor();
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion4, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            InterfaceC6469a constructor2 = companion4.getConstructor();
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
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion4, composerM10109constructorimpl2, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i9 = i8;
            TextKt.m9105Text4IGK_g(c4701b.f6747b, (Modifier) null, ColorKt.Color(4279572250L), TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), TextOverflow.INSTANCE.m13241getEllipsisgIe3tQ8(), false, 2, 2, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, 3456, 27702, 103410);
            SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion, C2331Dp.m13305constructorimpl(8)), composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            InterfaceC6469a constructor3 = companion4.getConstructor();
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
            InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion4, composerM10109constructorimpl3, measurePolicyRowMeasurePolicy, composerM10109constructorimpl3, currentCompositionLocalMap3);
            if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
            }
            Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m9105Text4IGK_g(AbstractC0037f.m81f(c4701b.f6748c, "已有错题数："), PaddingKt.m7263paddingVpY3zN4(BackgroundKt.m6753backgroundbw27NRU(companion, ColorKt.Color(4294309365L), RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(3))), C2331Dp.m13305constructorimpl(10), C2331Dp.m13305constructorimpl(2)), ColorKt.Color(4284900966L), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, 3456, 3072, 122864);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            if (z8) {
                composerStartRestartGroup.startReplaceGroup(518228158);
                m4093a(z9, null, composerStartRestartGroup, (i9 >> 6) & 14);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(518328970);
                composer2 = composerStartRestartGroup;
                TextKt.m9105Text4IGK_g(c4701b.f6749d, (Modifier) null, ColorKt.Color(4290953922L), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3456, 3072, 122866);
                composer2.endReplaceGroup();
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4724w(c4701b, z8, z9, interfaceC6469a, interfaceC6469a2, i, 0));
        }
    }

    /* renamed from: c */
    public static final void m4095c(InterfaceC6469a interfaceC6469a, Modifier modifier, Composer composer, int i) {
        int i8;
        Composer composer2;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(887607120);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(interfaceC6469a) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(887607120, i8, -1, "com.zykj.mistake.feature.collection.list.MistakeCollectionEmptyContent (MistakeCollectionScreen.kt:342)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(companion3, false, null, null, interfaceC6469a, 7, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM6790clickableXHw0xAI$default);
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
            i9 = 0;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_no_data, composerStartRestartGroup, 0), "暂无错题集", SizeKt.m7309size3ABfNKs(companion3, C2331Dp.m13305constructorimpl(100)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, MenuKt.InTransitionDuration);
            composer2 = composerStartRestartGroup;
            float f = 18;
            TextKt.m9105Text4IGK_g("点击新增", PaddingKt.m7266paddingqDBjuR0$default(companion3, 0.0f, C2331Dp.m13305constructorimpl(f), 0.0f, 0.0f, 13, null), ColorKt.Color(4279596799L), TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3510, 0, 131056);
            TextKt.m9105Text4IGK_g("当前无任何错题集", PaddingKt.m7266paddingqDBjuR0$default(companion3, 0.0f, C2331Dp.m13305constructorimpl(f), 0.0f, 0.0f, 13, null), ColorKt.Color(4284900966L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3510, 0, 131056);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4727z(interfaceC6469a, modifier, i, i9));
        }
    }

    /* renamed from: d */
    public static final void m4096d(C4723v c4723v, InterfaceC6471c interfaceC6471c, Modifier modifier, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(832221815);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c4723v) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(832221815, i8, -1, "com.zykj.mistake.feature.collection.list.MistakeCollectionListContent (MistakeCollectionScreen.kt:207)");
            }
            LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
            int i9 = i8 & 112;
            boolean z8 = i9 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4577a1(interfaceC6471c, 20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            InterfaceC6471c interfaceC6471cM4460d = C5100e.m4460d(composerStartRestartGroup, (InterfaceC6471c) objRememberedValue);
            boolean z9 = c4723v.f6777d;
            boolean z10 = i9 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new C4680u0(interfaceC6471c, 15);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            PullToRefreshKt.PullToRefreshBox(z9, (InterfaceC6469a) objRememberedValue2, SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, null, null, ComposableLambdaKt.rememberComposableLambda(56582481, true, new C4726y(lazyGridStateRememberLazyGridState, c4723v, interfaceC6471c, interfaceC6471cM4460d, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2756g(c4723v, interfaceC6471c, modifier, i, 7));
        }
    }

    /* renamed from: e */
    public static final void m4097e(C4723v state, InterfaceC6471c onIntent, Composer composer, int i) {
        int i8;
        Composer composer2;
        AbstractC5830k.m5330g(state, "state");
        List list = state.f6776c;
        AbstractC5830k.m5330g(onIntent, "onIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2072916409);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onIntent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2072916409, i8, -1, "com.zykj.mistake.feature.collection.list.MistakeCollectionScreen (MistakeCollectionScreen.kt:58)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM6754backgroundbw27NRU$default = BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ColorKt.Color(4294309882L), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM6754backgroundbw27NRU$default);
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
            int i9 = i8 & 112;
            int i10 = i8 & 126;
            m4098f(state, onIntent, composerStartRestartGroup, i10);
            AbstractC6775g.m6461a(null, composerStartRestartGroup, 0);
            if (!list.isEmpty() || state.f6777d) {
                composerStartRestartGroup.startReplaceGroup(-572452977);
                m4096d(state, onIntent, ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, i10);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-572659654);
                boolean z8 = i9 == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new C4680u0(onIntent, 10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                m4095c((InterfaceC6469a) objRememberedValue, ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (state.f6780g) {
                composerStartRestartGroup.startReplaceGroup(-1212074571);
                String str = !list.isEmpty() ? "创建新错题集" : "还没有创建过任何错题集，先创建一个吧";
                String str2 = state.f6781h;
                String str3 = state.f6782i;
                boolean z9 = state.f6783j;
                boolean z10 = i9 == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z10 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new C4577a1(onIntent, 19);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                InterfaceC6471c interfaceC6471c = (InterfaceC6471c) objRememberedValue2;
                boolean z11 = i9 == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z11 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new C4680u0(onIntent, 11);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                InterfaceC6469a interfaceC6469a = (InterfaceC6469a) objRememberedValue3;
                boolean z12 = i9 == 32;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z12 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new C4680u0(onIntent, 12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                AbstractC4560f.m4019b(str, str2, str3, "创建", "创建中...", z9, null, null, null, false, interfaceC6471c, interfaceC6469a, (InterfaceC6469a) objRememberedValue4, composerStartRestartGroup, 27648, 0, 960);
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(-1215493189);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4725x(state, onIntent, i, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x038d  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4098f(com.zykj.mistake.feature.collection.list.C4723v r65, p152r6.InterfaceC6471c r66, androidx.compose.runtime.Composer r67, int r68) {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.collection.list.AbstractC4704c0.m4098f(com.zykj.mistake.feature.collection.list.v, r6.c, androidx.compose.runtime.Composer, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/collection/list/c0.smali:4841
    }
}
