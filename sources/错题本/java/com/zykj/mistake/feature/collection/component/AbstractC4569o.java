package com.zykj.mistake.feature.collection.component;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.PlatformTextStyle;
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
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import coil3.compose.AbstractC3258o;
import coil3.compose.AsyncImagePainter;
import coil3.compose.C3249f;
import coil3.compose.InterfaceC3252i;
import com.zykj.mistake.R;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import p045d6.C5443s;
import p137p4.C6383b;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p205y4.AbstractC6773e;

/* renamed from: com.zykj.mistake.feature.collection.component.o */
/* loaded from: classes3.dex */
public abstract class AbstractC4569o {

    /* renamed from: a */
    public static final float f6428a = C2331Dp.m13305constructorimpl(70);

    /* renamed from: b */
    public static final long f6429b = ColorKt.Color(4279596799L);

    /* renamed from: c */
    public static final TextStyle f6430c = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(12), (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, 0, 0, (TextMotion) null, 16121855, (AbstractC5824e) null);

    /* renamed from: a */
    public static final void m4021a(final C6383b c6383b, final boolean z8, final boolean z9, final boolean z10, final InterfaceC6469a interfaceC6469a, final InterfaceC6469a interfaceC6469a2, Composer composer, final int i) {
        int i8;
        InterfaceC6469a interfaceC6469a3;
        InterfaceC6469a interfaceC6469a4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1739446474);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c6383b) ? 4 : 2) | i;
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
            i8 |= composerStartRestartGroup.changed(z10) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            interfaceC6469a3 = interfaceC6469a;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a3) ? 16384 : 8192;
        } else {
            interfaceC6469a3 = interfaceC6469a;
        }
        if ((196608 & i) == 0) {
            interfaceC6469a4 = interfaceC6469a2;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a4) ? 131072 : 65536;
        } else {
            interfaceC6469a4 = interfaceC6469a2;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i8) != 74898, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1739446474, i8, -1, "com.zykj.mistake.feature.collection.component.MistakeQuestionCard (MistakeQuestionGrid.kt:144)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Color.Companion companion2 = Color.INSTANCE;
            float f = 4;
            Modifier modifierAlpha = AlphaKt.alpha(AbstractC1923c.m1042f(f, modifierFillMaxWidth$default, companion2.m10719getWhite0d7_KjU()), z10 ? 0.35f : 1.0f);
            float f7 = 10;
            Modifier modifierM7263paddingVpY3zN4 = PaddingKt.m7263paddingVpY3zN4(ClickableKt.m6798combinedClickablef5TDLPQ$default(BorderKt.m6767borderxT4_qwU(modifierAlpha, z9 ? C2331Dp.m13305constructorimpl(1) : C2331Dp.m13305constructorimpl(0), z9 ? f6429b : companion2.m10717getTransparent0d7_KjU(), RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(f))), !z10, null, null, null, interfaceC6469a4, null, false, interfaceC6469a3, 110, null), C2331Dp.m13305constructorimpl(12), C2331Dp.m13305constructorimpl(f7));
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7263paddingVpY3zN4);
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
            m4023c(c6383b.f10454i, composerStartRestartGroup, 0);
            float f8 = 8;
            Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, C2331Dp.m13305constructorimpl(f8), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7266paddingqDBjuR0$default);
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
            String str = c6383b.f10451f;
            long sp = TextUnitKt.getSp(12);
            FontWeight.Companion companion5 = FontWeight.INSTANCE;
            TextKt.m9105Text4IGK_g(str, (Modifier) null, f6429b, sp, (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, 200064, 0, 131026);
            float f9 = 6;
            AbstractC1923c.m1055s(f9, companion, composerStartRestartGroup, 6);
            BoxKt.Box(BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.m7295height3ABfNKs(SizeKt.m7314width3ABfNKs(companion, C2331Dp.m13305constructorimpl(1)), C2331Dp.m13305constructorimpl(f7)), ColorKt.Color(4292928229L), null, 2, null), composerStartRestartGroup, 6);
            SpacerKt.Spacer(SizeKt.m7314width3ABfNKs(companion, C2331Dp.m13305constructorimpl(f9)), composerStartRestartGroup, 6);
            TextKt.m9105Text4IGK_g(c6383b.f10452g, (Modifier) null, ColorKt.Color(4284900966L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m13241getEllipsisgIe3tQ8(), false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, 3456, 3120, 120818);
            composerStartRestartGroup.endNode();
            AbstractC6773e.m6458b(c6383b.f10461p, PaddingKt.m7266paddingqDBjuR0$default(companion, 0.0f, C2331Dp.m13305constructorimpl(f8), 0.0f, 0.0f, 13, null), composerStartRestartGroup, 48);
            Modifier modifierM7266paddingqDBjuR0$default2 = PaddingKt.m7266paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, C2331Dp.m13305constructorimpl(f8), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7266paddingqDBjuR0$default2);
            InterfaceC6469a constructor4 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl4 = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r4 = AbstractC0584a.m917r(companion4, composerM10109constructorimpl4, measurePolicyRowMeasurePolicy2, composerM10109constructorimpl4, currentCompositionLocalMap4);
            if (composerM10109constructorimpl4.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                AbstractC0584a.m918s(currentCompositeKeyHash4, composerM10109constructorimpl4, currentCompositeKeyHash4, interfaceC6473eM917r4);
            }
            Updater.m10116setimpl(composerM10109constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
            String strM81f = AbstractC0037f.m81f(c6383b.f10462q, "✓ ");
            long jColor = ColorKt.Color(4281322394L);
            long sp2 = TextUnitKt.getSp(10);
            FontWeight bold = companion5.getBold();
            float f10 = (float) 0.5d;
            Modifier modifierM7222offsetVpY3zN4$default = OffsetKt.m7222offsetVpY3zN4$default(companion, 0.0f, C2331Dp.m13305constructorimpl(f10), 1, null);
            TextStyle textStyle = f6430c;
            TextKt.m9105Text4IGK_g(strM81f, modifierM7222offsetVpY3zN4$default, jColor, sp2, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, textStyle, composerStartRestartGroup, 200112, 1572864, 65488);
            AbstractC1923c.m1055s(14, companion, composerStartRestartGroup, 6);
            TextKt.m9105Text4IGK_g(AbstractC0037f.m81f(c6383b.f10463r, "× "), OffsetKt.m7222offsetVpY3zN4$default(companion, 0.0f, C2331Dp.m13305constructorimpl(f10), 1, null), ColorKt.Color(4294925918L), TextUnitKt.getSp(10), (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, textStyle, composerStartRestartGroup, 200112, 1572864, 65488);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            if (z8) {
                composerStartRestartGroup.startReplaceGroup(-171856415);
            } else {
                composerStartRestartGroup.startReplaceGroup(-163304011);
                TextKt.m9105Text4IGK_g(c6383b.f10464s, (Modifier) null, ColorKt.Color(4290098613L), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, 3456, 0, 131058);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (z8) {
                composerStartRestartGroup.startReplaceGroup(903355518);
                ImageKt.Image(PainterResources_androidKt.painterResource(z9 ? R.drawable.ic_mistake_selected : R.drawable.ic_mistake_unselected, composerStartRestartGroup, 0), z9 ? "已选择" : "未选择", SizeKt.m7309size3ABfNKs(boxScopeInstance.align(companion, companion3.getBottomEnd()), C2331Dp.m13305constructorimpl(18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, MenuKt.InTransitionDuration);
            } else {
                composerStartRestartGroup.startReplaceGroup(894538002);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: com.zykj.mistake.feature.collection.component.l
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    AbstractC4569o.m4021a(c6383b, z8, z9, z10, interfaceC6469a, interfaceC6469a2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return C5443s.f8405a;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0128  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4022b(final java.util.List r28, final boolean r29, final boolean r30, final boolean r31, final androidx.compose.p011ui.Modifier r32, final boolean r33, final java.util.Set r34, java.util.Set r35, androidx.compose.foundation.layout.PaddingValues r36, final p152r6.InterfaceC6469a r37, final p152r6.InterfaceC6469a r38, final p152r6.InterfaceC6471c r39, p152r6.InterfaceC6471c r40, androidx.compose.runtime.Composer r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.collection.component.AbstractC4569o.m4022b(java.util.List, boolean, boolean, boolean, androidx.compose.ui.Modifier, boolean, java.util.Set, java.util.Set, androidx.compose.foundation.layout.PaddingValues, r6.a, r6.a, r6.c, r6.c, androidx.compose.runtime.Composer, int, int, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/collection/component/o.smali:2900
    }

    /* renamed from: c */
    public static final void m4023c(String str, Composer composer, int i) {
        int i8;
        int i9;
        boolean z8;
        int i10;
        Composer composerStartRestartGroup = composer.startRestartGroup(-839748283);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-839748283, i8, -1, "com.zykj.mistake.feature.collection.component.MistakeQuestionStemContent (MistakeQuestionGrid.kt:248)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM1042f = AbstractC1923c.m1042f(3, SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f6428a), Color.INSTANCE.m10719getWhite0d7_KjU());
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1042f);
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
            if (AbstractC5855p.m5382P(str)) {
                composerStartRestartGroup.startReplaceGroup(1135681005);
                i9 = 0;
                TextKt.m9105Text4IGK_g("暂无题干", (Modifier) null, ColorKt.Color(4290098613L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1135867687);
                AsyncImagePainter asyncImagePainterM2189a = AbstractC3258o.m2189a(str, composerStartRestartGroup, i8 & 14);
                boolean z9 = ((InterfaceC3252i) SnapshotStateKt.collectAsState(asyncImagePainterM2189a.f1834p, null, composerStartRestartGroup, 0, 1).getValue()) instanceof C3249f;
                if (z9) {
                    z8 = z9;
                    i10 = 1126039075;
                    composerStartRestartGroup.startReplaceGroup(1126039075);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1136081711);
                    z8 = z9;
                    i10 = 1126039075;
                    ImageKt.Image(asyncImagePainterM2189a, (String) null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), companion2.getTopCenter(), ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 28080, 96);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (z8) {
                    composerStartRestartGroup.startReplaceGroup(1136425718);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
                    InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl2, measurePolicyRowMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
                    if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_answer_load_error, composerStartRestartGroup, 0), "加载失败", SizeKt.m7309size3ABfNKs(companion, C2331Dp.m13305constructorimpl(40)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, MenuKt.InTransitionDuration);
                    AbstractC1923c.m1055s(8, companion, composerStartRestartGroup, 6);
                    i9 = 0;
                    TextKt.m9105Text4IGK_g("加载失败", (Modifier) null, ColorKt.Color(4288256409L), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                } else {
                    i9 = 0;
                    composerStartRestartGroup.startReplaceGroup(i10);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i9 = 0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4567m(str, i, i9));
        }
    }
}
