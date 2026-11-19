package com.zykj.mistake.feature.notebook.detail;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.InspectionModeKt;
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
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.navigation.C2861i;
import androidx.navigation.compose.C2840b;
import com.zykj.mistake.R;
import com.zykj.mistake.feature.ask.C4523g0;
import com.zykj.mistake.feature.collection.component.C4564j;
import com.zykj.mistake.feature.collection.filter.C4680u0;
import com.zykj.mistake.feature.collection.filter.C4684w0;
import com.zykj.mistake.utils.AbstractC5101f;
import com.zykj.view.C5280R;
import com.zykj.view.simpleBoard.SimpleBoardView;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import p045d6.C5443s;
import p137p4.C6390i;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.g0 */
/* loaded from: classes3.dex */
public abstract class AbstractC4798g0 {
    /* renamed from: a */
    public static final void m4187a(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-133211085);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-133211085, i, -1, "com.zykj.mistake.feature.notebook.detail.DetailEmptyTagChip (MistakeDetailDraftPanel.kt:1031)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g("暂无标签", PaddingKt.m7263paddingVpY3zN4(BackgroundKt.m6753backgroundbw27NRU(Modifier.INSTANCE, ColorKt.Color(4294309365L), RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(2))), C2331Dp.m13305constructorimpl(6), C2331Dp.m13305constructorimpl(4)), ColorKt.Color(4284900966L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, new TextStyle(0L, TextUnitKt.getSp(11), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(11), (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, 0, 0, (TextMotion) null, 16121853, (AbstractC5824e) null), composer2, 390, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4899x(i, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4188b(com.zykj.mistake.feature.notebook.detail.C4837m3 r35, com.zykj.mistake.feature.notebook.detail.C4764a5 r36, p152r6.InterfaceC6471c r37, androidx.compose.p011ui.Modifier r38, androidx.compose.runtime.Composer r39, int r40) {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.AbstractC4798g0.m4188b(com.zykj.mistake.feature.notebook.detail.m3, com.zykj.mistake.feature.notebook.detail.a5, r6.c, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/g0.smali:457
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ff  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4189c(final boolean r22, final com.zykj.mistake.feature.notebook.detail.C4764a5 r23, final com.zykj.mistake.feature.notebook.detail.DraftActionMode r24, final boolean r25, final p152r6.InterfaceC6469a r26, final p152r6.InterfaceC6469a r27, final p152r6.InterfaceC6471c r28, final p152r6.InterfaceC6469a r29, final p152r6.InterfaceC6469a r30, final p152r6.InterfaceC6469a r31, androidx.compose.runtime.Composer r32, final int r33) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.AbstractC4798g0.m4189c(boolean, com.zykj.mistake.feature.notebook.detail.a5, com.zykj.mistake.feature.notebook.detail.DraftActionMode, boolean, r6.a, r6.a, r6.c, r6.a, r6.a, r6.a, androidx.compose.runtime.Composer, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/g0.smali:3010
    }

    /* renamed from: d */
    public static final void m4190d(C6390i tag, Composer composer, int i) {
        int i8;
        Composer composer2;
        Pair pair;
        AbstractC5830k.m5330g(tag, "tag");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1932589565);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(tag) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1932589565, i8, -1, "com.zykj.mistake.feature.notebook.detail.DetailTagChip (MistakeDetailDraftPanel.kt:1007)");
            }
            int i9 = AbstractC4792f0.f6985a[tag.f10481b.ordinal()];
            if (i9 == 1) {
                pair = new Pair(Color.m10672boximpl(ColorKt.Color(4294963440L)), Color.m10672boximpl(ColorKt.Color(4294925918L)));
            } else if (i9 == 2) {
                pair = new Pair(Color.m10672boximpl(ColorKt.Color(4293918713L)), Color.m10672boximpl(ColorKt.Color(4280333446L)));
            } else if (i9 == 3) {
                pair = new Pair(Color.m10672boximpl(ColorKt.Color(4294964971L)), Color.m10672boximpl(ColorKt.Color(4294941227L)));
            } else {
                if (i9 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(Color.m10672boximpl(ColorKt.Color(4293916415L)), Color.m10672boximpl(ColorKt.Color(4279596799L)));
            }
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g(tag.f10480a, PaddingKt.m7263paddingVpY3zN4(BackgroundKt.m6753backgroundbw27NRU(Modifier.INSTANCE, ((Color) pair.getFirst()).m10692unboximpl(), RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(2))), C2331Dp.m13305constructorimpl(6), C2331Dp.m13305constructorimpl(4)), ((Color) pair.getSecond()).m10692unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m13241getEllipsisgIe3tQ8(), false, 1, 0, (InterfaceC6471c) null, new TextStyle(0L, TextUnitKt.getSp(11), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(11), (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, 0, 0, (TextMotion) null, 16121853, (AbstractC5824e) null), composer2, 0, 3120, 55288);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4905y(tag, i, 0));
        }
    }

    /* renamed from: e */
    public static final void m4191e(boolean z8, InterfaceC6469a onClick, Composer composer, int i) {
        int i8;
        Composer composer2;
        int i9;
        AbstractC5830k.m5330g(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-954953976);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(z8) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-954953976, i8, -1, "com.zykj.mistake.feature.notebook.detail.DraftToggleButton (MistakeDetailDraftPanel.kt:303)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 30;
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(SizeKt.m7311sizeVpY3zN4(companion, C2331Dp.m13305constructorimpl(f), C2331Dp.m13305constructorimpl(28)), false, null, null, onClick, 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            i9 = 0;
            ImageKt.Image(PainterResources_androidKt.painterResource(z8 ? R.drawable.ic_collapse_board : R.drawable.ic_expand_board, composerStartRestartGroup, 0), z8 ? "收起画板" : "展开画板", SizeKt.m7309size3ABfNKs(companion, C2331Dp.m13305constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 384, MenuKt.InTransitionDuration);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i9 = 0;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4911z(z8, onClick, i, i9));
        }
    }

    /* renamed from: f */
    public static final void m4192f(DraftActionMode selectedMode, boolean z8, InterfaceC6469a onTouchToggle, InterfaceC6471c onModeSelect, InterfaceC6469a onClean, Composer composer, int i) {
        int i8;
        boolean z9;
        Composer composer2;
        AbstractC5830k.m5330g(selectedMode, "selectedMode");
        AbstractC5830k.m5330g(onTouchToggle, "onTouchToggle");
        AbstractC5830k.m5330g(onModeSelect, "onModeSelect");
        AbstractC5830k.m5330g(onClean, "onClean");
        Composer composerStartRestartGroup = composer.startRestartGroup(-248992214);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(selectedMode.ordinal()) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            z9 = z8;
            i8 |= composerStartRestartGroup.changed(z9) ? 32 : 16;
        } else {
            z9 = z8;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onTouchToggle) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onModeSelect) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onClean) ? 16384 : 8192;
        }
        int i9 = i8;
        if (composerStartRestartGroup.shouldExecute((i9 & 9363) != 9362, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-248992214, i9, -1, "com.zykj.mistake.feature.notebook.detail.DraftToolGroup (MistakeDetailDraftPanel.kt:233)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = AbstractC4880t4.f7325q;
            Modifier modifierM1042f = AbstractC1923c.m1042f(4, SizeKt.m7295height3ABfNKs(companion, f), Color.INSTANCE.m10719getWhite0d7_KjU());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new C4564j(13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM7264paddingVpY3zN4$default = PaddingKt.m7264paddingVpY3zN4$default(DrawModifierKt.drawBehind(modifierM1042f, (InterfaceC6471c) objRememberedValue), C2331Dp.m13305constructorimpl(2), 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7264paddingVpY3zN4$default);
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
            int i10 = i9 << 6;
            m4194h(C5280R.drawable.view_selector_icon_evaluation_touch, "手写开关", SizeKt.m7309size3ABfNKs(companion, f), z9, onTouchToggle, composerStartRestartGroup, (i10 & 57344) | (i10 & 7168) | 432, 0);
            int i11 = C5280R.drawable.view_selector_draw_select;
            boolean z10 = selectedMode == DraftActionMode.SELECT;
            Modifier modifierM7309size3ABfNKs = SizeKt.m7309size3ABfNKs(companion, f);
            int i12 = i9 & 7168;
            boolean z11 = i12 == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new C4680u0(onModeSelect, 21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            m4194h(i11, "选择", modifierM7309size3ABfNKs, z10, (InterfaceC6469a) objRememberedValue2, composerStartRestartGroup, 432, 0);
            int i13 = C5280R.drawable.view_selector_icon_evaluation_pen;
            boolean z12 = selectedMode == DraftActionMode.PEN;
            Modifier modifierM7309size3ABfNKs2 = SizeKt.m7309size3ABfNKs(companion, f);
            boolean z13 = i12 == 2048;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z13 || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new C4680u0(onModeSelect, 22);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            m4194h(i13, "笔", modifierM7309size3ABfNKs2, z12, (InterfaceC6469a) objRememberedValue3, composerStartRestartGroup, 432, 0);
            int i14 = C5280R.drawable.view_selector_icon_evaluation_line;
            boolean z14 = selectedMode == DraftActionMode.LINE;
            Modifier modifierM7309size3ABfNKs3 = SizeKt.m7309size3ABfNKs(companion, f);
            boolean z15 = i12 == 2048;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z15 || objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new C4680u0(onModeSelect, 23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            m4194h(i14, "直线", modifierM7309size3ABfNKs3, z14, (InterfaceC6469a) objRememberedValue4, composerStartRestartGroup, 432, 0);
            int i15 = C5280R.drawable.view_selector_icon_evaluation_dotline;
            boolean z16 = selectedMode == DraftActionMode.DOTTED_LINE;
            Modifier modifierM7309size3ABfNKs4 = SizeKt.m7309size3ABfNKs(companion, f);
            boolean z17 = i12 == 2048;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z17 || objRememberedValue5 == companion2.getEmpty()) {
                objRememberedValue5 = new C4680u0(onModeSelect, 24);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            m4194h(i15, "虚线", modifierM7309size3ABfNKs4, z16, (InterfaceC6469a) objRememberedValue5, composerStartRestartGroup, 432, 0);
            int i16 = C5280R.drawable.view_selector_icon_evaluation_eraser;
            boolean z18 = selectedMode == DraftActionMode.ERASER;
            Modifier modifierM7309size3ABfNKs5 = SizeKt.m7309size3ABfNKs(companion, f);
            boolean z19 = i12 == 2048;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z19 || objRememberedValue6 == companion2.getEmpty()) {
                objRememberedValue6 = new C4680u0(onModeSelect, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composer2 = composerStartRestartGroup;
            m4194h(i16, "橡皮", modifierM7309size3ABfNKs5, z18, (InterfaceC6469a) objRememberedValue6, composer2, 432, 0);
            m4194h(C5280R.drawable.view_selector_icon_evaluation_delete, "清空", SizeKt.m7309size3ABfNKs(companion, f), false, onClean, composer2, (i9 & 57344) | 432, 8);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4523g0(selectedMode, z8, onTouchToggle, onModeSelect, onClean, i));
        }
    }

    /* renamed from: g */
    public static final void m4193g(InterfaceC6469a onZoomIn, InterfaceC6469a onZoomOut, Composer composer, int i) {
        int i8;
        InterfaceC6469a interfaceC6469a;
        InterfaceC6469a interfaceC6469a2;
        AbstractC5830k.m5330g(onZoomIn, "onZoomIn");
        AbstractC5830k.m5330g(onZoomOut, "onZoomOut");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1826421530);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(onZoomIn) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onZoomOut) ? 32 : 16;
        }
        int i9 = i8;
        int i10 = 12;
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1826421530, i9, -1, "com.zykj.mistake.feature.notebook.detail.DraftZoomButtonGroup (MistakeDetailDraftPanel.kt:324)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = AbstractC4880t4.f7325q;
            Modifier modifierM1042f = AbstractC1923c.m1042f(4, SizeKt.m7295height3ABfNKs(companion, f), Color.INSTANCE.m10719getWhite0d7_KjU());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4564j(i10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(modifierM1042f, (InterfaceC6471c) objRememberedValue);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierDrawBehind);
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
            Modifier modifierM7311sizeVpY3zN4 = SizeKt.m7311sizeVpY3zN4(companion, f, f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7311sizeVpY3zN4);
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
            m4194h(C5280R.drawable.view_selector_draw_enlarge, "放大", SizeKt.m7311sizeVpY3zN4(companion, f, f), false, onZoomIn, composerStartRestartGroup, ((i9 << 12) & 57344) | 432, 8);
            composerStartRestartGroup.endNode();
            Modifier modifierM7311sizeVpY3zN42 = SizeKt.m7311sizeVpY3zN4(companion, f, f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7311sizeVpY3zN42);
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
            InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM10109constructorimpl3, currentCompositionLocalMap3);
            if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
            }
            Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            interfaceC6469a2 = onZoomOut;
            interfaceC6469a = onZoomIn;
            m4194h(C5280R.drawable.view_selector_draw_reduce, "缩小", SizeKt.m7311sizeVpY3zN4(companion, f, f), false, interfaceC6469a2, composerStartRestartGroup, ((i9 << 9) & 57344) | 432, 8);
            if (AbstractC0584a.m899D(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            interfaceC6469a = onZoomIn;
            interfaceC6469a2 = onZoomOut;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2840b(i, 12, interfaceC6469a, interfaceC6469a2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4194h(final int r18, final java.lang.String r19, androidx.compose.p011ui.Modifier r20, boolean r21, final p152r6.InterfaceC6469a r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.AbstractC4798g0.m4194h(int, java.lang.String, androidx.compose.ui.Modifier, boolean, r6.a, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/g0.smali:7686
    }

    /* renamed from: i */
    public static final void m4195i(final C4837m3 state, C4764a5 c4764a5, final boolean z8, final boolean z9, final InterfaceC6473e onStemSnapshotReady, final Modifier modifier, Composer composer, final int i) {
        int i8;
        boolean z10;
        boolean z11;
        String strM4464b;
        final C4764a5 controller = c4764a5;
        AbstractC5830k.m5330g(state, "state");
        String str = state.f7155e;
        int i9 = state.f7149b;
        AbstractC5830k.m5330g(controller, "controller");
        AbstractC5830k.m5330g(onStemSnapshotReady, "onStemSnapshotReady");
        Composer composerStartRestartGroup = composer.startRestartGroup(159310688);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(controller) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z10 = z8;
            i8 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        } else {
            z10 = z8;
        }
        if ((i & 3072) == 0) {
            z11 = z9;
            i8 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
        } else {
            z11 = z9;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onStemSnapshotReady) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i8) != 74898, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(159310688, i8, -1, "com.zykj.mistake.feature.notebook.detail.MistakeDraftSketchView (MistakeDetailDraftPanel.kt:407)");
            }
            if (((Boolean) composerStartRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(86190803);
                BoxKt.Box(BackgroundKt.m6754backgroundbw27NRU$default(modifier, Color.INSTANCE.m10719getWhite0d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i10 = 0;
                    final boolean z12 = z10;
                    final boolean z13 = z11;
                    scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: com.zykj.mistake.feature.notebook.detail.u
                        @Override // p152r6.InterfaceC6473e
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i10) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    AbstractC4798g0.m4195i(state, controller, z12, z13, onStemSnapshotReady, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    AbstractC4798g0.m4195i(state, controller, z12, z13, onStemSnapshotReady, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return C5443s.f8405a;
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.startReplaceGroup(71235938);
            composerStartRestartGroup.endReplaceGroup();
            final C4858q0 c4858q0 = state.f7130J;
            boolean zChanged = composerStartRestartGroup.changed(m4197k(state)) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(i9);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                if (m4197k(state)) {
                    if (AbstractC5855p.m5382P(str)) {
                        str = "default";
                    }
                    String str2 = AbstractC5101f.f8039a;
                    strM4464b = AbstractC5101f.m4464b("DrawBoardDraftData/practice_temp/" + str + "/" + i9);
                } else {
                    String str3 = AbstractC5101f.f8039a;
                    strM4464b = AbstractC5101f.m4464b("DrawBoardDraftData/" + i9);
                }
                objRememberedValue = strM4464b;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final String str4 = (String) objRememberedValue;
            boolean zM4197k = m4197k(state);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(controller) | composerStartRestartGroup.changed(zM4197k);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new C4887v(controller, zM4197k, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.DisposableEffect(str4, (InterfaceC6471c) objRememberedValue2, composerStartRestartGroup, 0);
            Modifier modifierM6754backgroundbw27NRU$default = BackgroundKt.m6754backgroundbw27NRU$default(modifier, Color.INSTANCE.m10719getWhite0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            composerStartRestartGroup.startMovableGroup(-385563325, str4);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = new C4564j(10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            InterfaceC6471c interfaceC6471c = (InterfaceC6471c) objRememberedValue3;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(controller) | composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changed(str4) | composerStartRestartGroup.changedInstance(c4858q0) | ((i8 & 896) == 256) | ((i8 & 7168) == 2048) | ((57344 & i8) == 16384);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion3.getEmpty()) {
                InterfaceC6471c interfaceC6471c2 = new InterfaceC6471c() { // from class: com.zykj.mistake.feature.notebook.detail.w
                    @Override // p152r6.InterfaceC6471c
                    public final Object invoke(Object obj) {
                        SimpleBoardView simpleBoardView;
                        C4764a5 c4764a52 = controller;
                        C4837m3 c4837m3 = state;
                        String path = str4;
                        C4858q0 c4858q02 = c4858q0;
                        boolean z14 = z8;
                        boolean z15 = z9;
                        InterfaceC6473e onStemSnapshotReady2 = onStemSnapshotReady;
                        SimpleBoardView board = (SimpleBoardView) obj;
                        AbstractC5830k.m5330g(board, "board");
                        c4764a52.getClass();
                        SimpleBoardView simpleBoardView2 = c4764a52.f6894a;
                        if (simpleBoardView2 != board) {
                            if (simpleBoardView2 != null) {
                                simpleBoardView2.setOnActionListener(null);
                            }
                            c4764a52.f6894a = board;
                            c4764a52.f6906m = null;
                            c4764a52.f6907n = null;
                        }
                        board.setOnActionListener(new C4773c0(c4764a52, 3));
                        board.getSimpleBoardConfig().setEnableControl(false);
                        board.getSimpleBoardConfig().setMinScaleTime(1.0f);
                        board.getSimpleBoardConfig().setMaxScaleTime(1.5f);
                        board.setEnabled(true);
                        c4764a52.m4167c();
                        int i11 = c4837m3.f7149b;
                        String str5 = c4858q02.f7261a;
                        List paths = c4858q02.f7262b;
                        int i12 = c4837m3.f7137Q;
                        AbstractC5830k.m5330g(path, "path");
                        AbstractC5830k.m5330g(paths, "paths");
                        AbstractC5830k.m5330g(onStemSnapshotReady2, "onStemSnapshotReady");
                        C4791f c4791f = new C4791f(path, str5, paths, i12);
                        boolean z16 = (AbstractC5830k.m5325b(c4764a52.f6900g, path) && AbstractC5830k.m5325b(c4764a52.f6901h, str5) && AbstractC5830k.m5325b(c4764a52.f6902i, paths) && c4764a52.f6903j == i12) ? false : true;
                        boolean z17 = c4764a52.f6905l != z14;
                        c4764a52.f6896c = z15;
                        c4764a52.f6905l = z14;
                        c4764a52.f6899f = i11;
                        c4764a52.f6904k = onStemSnapshotReady2;
                        c4764a52.m4167c();
                        if (z16 || z17 || !AbstractC5830k.m5325b(c4764a52.f6906m, c4791f)) {
                            c4764a52.f6900g = path;
                            c4764a52.f6901h = str5;
                            c4764a52.f6902i = paths;
                            c4764a52.f6903j = i12;
                            new File(c4764a52.f6900g).mkdirs();
                            if (z16 || !AbstractC5830k.m5325b(c4764a52.f6906m, c4791f)) {
                                c4764a52.f6908o = false;
                                boolean z18 = c4764a52.f6909p;
                                c4764a52.f6909p = true;
                                try {
                                    SimpleBoardView simpleBoardView3 = c4764a52.f6894a;
                                    if (simpleBoardView3 != null) {
                                        simpleBoardView3.clean();
                                    }
                                    c4764a52.f6909p = z18;
                                    c4764a52.f6898e = 1.0f;
                                    c4764a52.f6906m = null;
                                    c4764a52.f6907n = null;
                                    c4764a52.m4169e();
                                    c4764a52.m4173i();
                                } catch (Throwable th) {
                                    c4764a52.f6909p = z18;
                                    throw th;
                                }
                            } else if (z17 && (simpleBoardView = c4764a52.f6894a) != null) {
                                c4764a52.m4168d(simpleBoardView);
                            }
                        }
                        return C5443s.f8405a;
                    }
                };
                controller = controller;
                composerStartRestartGroup.updateRememberedValue(interfaceC6471c2);
                objRememberedValue4 = interfaceC6471c2;
            }
            AndroidView_androidKt.AndroidView(interfaceC6471c, modifierMatchParentSize, (InterfaceC6471c) objRememberedValue4, composerStartRestartGroup, 6, 0);
            Modifier modifierMatchParentSize2 = boxScopeInstance.matchParentSize(companion2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion3.getEmpty()) {
                objRememberedValue5 = new C4564j(11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            InterfaceC6471c interfaceC6471c3 = (InterfaceC6471c) objRememberedValue5;
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(controller);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue6 == companion3.getEmpty()) {
                objRememberedValue6 = new C2861i(controller, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            AndroidView_androidKt.AndroidView(interfaceC6471c3, modifierMatchParentSize2, (InterfaceC6471c) objRememberedValue6, composerStartRestartGroup, 6, 0);
            composerStartRestartGroup.endMovableGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i11 = 1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new InterfaceC6473e() { // from class: com.zykj.mistake.feature.notebook.detail.u
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) {
                    switch (i11) {
                        case 0:
                            ((Integer) obj2).getClass();
                            AbstractC4798g0.m4195i(state, controller, z8, z9, onStemSnapshotReady, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            AbstractC4798g0.m4195i(state, controller, z8, z9, onStemSnapshotReady, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return C5443s.f8405a;
                }
            });
        }
    }

    /* renamed from: j */
    public static final void m4196j(Modifier modifier, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1019004897);
        int i8 = i | 6;
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1019004897, i8, -1, "com.zykj.mistake.feature.notebook.detail.SectionDoubleDot (MistakeDetailDraftPanel.kt:1046)");
            }
            Modifier modifierM7311sizeVpY3zN4 = SizeKt.m7311sizeVpY3zN4(modifier, C2331Dp.m13305constructorimpl(12), C2331Dp.m13305constructorimpl(8));
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7311sizeVpY3zN4);
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
            float f = 7;
            float f7 = (float) 3.5d;
            BoxKt.Box(AbstractC1923c.m1042f(f7, SizeKt.m7309size3ABfNKs(boxScopeInstance.align(modifier, companion.getCenterEnd()), C2331Dp.m13305constructorimpl(f)), AbstractC4880t4.f7310b), composerStartRestartGroup, 0);
            BoxKt.Box(AbstractC1923c.m1042f(f7, SizeKt.m7309size3ABfNKs(boxScopeInstance.align(modifier, companion.getCenterStart()), C2331Dp.m13305constructorimpl(f)), AbstractC4880t4.f7309a), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4684w0(modifier, i, 2));
        }
    }

    /* renamed from: k */
    public static final boolean m4197k(C4837m3 c4837m3) {
        return c4837m3.f7185z || c4837m3.f7153d == MistakeDetailNewContract$EntryMode.REVIEW_RECOMMEND;
    }
}
