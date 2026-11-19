package com.zykj.mistake.feature.notebook.detail;

import android.view.compose.C2756g;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.ShadowKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.navigation.compose.C2840b;
import com.zykj.mistake.feature.collection.component.C4564j;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.s4 */
/* loaded from: classes3.dex */
public abstract class AbstractC4874s4 {

    /* renamed from: a */
    public static final float f7299a = C2331Dp.m13305constructorimpl(128);

    /* renamed from: b */
    public static final float f7300b = C2331Dp.m13305constructorimpl(38);

    /* renamed from: c */
    public static final long f7301c = ColorKt.Color(4279596799L);

    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4241a(int r33, java.lang.String r34, androidx.compose.p011ui.Modifier r35, boolean r36, p152r6.InterfaceC6469a r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.AbstractC4874s4.m4241a(int, java.lang.String, androidx.compose.ui.Modifier, boolean, r6.a, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/s4.smali:79
    }

    /* renamed from: b */
    public static final void m4242b(Modifier modifier, InterfaceC6469a onEditClick, InterfaceC6469a onRemoveClick, Composer composer, int i) {
        int i8;
        AbstractC5830k.m5330g(onEditClick, "onEditClick");
        AbstractC5830k.m5330g(onRemoveClick, "onRemoveClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1830285357);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onEditClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onRemoveClick) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1830285357, i8, -1, "com.zykj.mistake.feature.notebook.detail.MistakeDetailMoreMenu (MistakeDetailTitleBar.kt:137)");
            }
            Modifier modifierM7314width3ABfNKs = SizeKt.m7314width3ABfNKs(modifier, f7299a);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal end = companion.getEnd();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), end, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7314width3ABfNKs);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM7311sizeVpY3zN4 = SizeKt.m7311sizeVpY3zN4(PaddingKt.m7266paddingqDBjuR0$default(companion3, 0.0f, 0.0f, C2331Dp.m13305constructorimpl(24), 0.0f, 11, null), C2331Dp.m13305constructorimpl(14), C2331Dp.m13305constructorimpl(7));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4564j(23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CanvasKt.Canvas(modifierM7311sizeVpY3zN4, (InterfaceC6471c) objRememberedValue, composerStartRestartGroup, 54);
            float f = 3;
            Modifier modifierM1042f = AbstractC1923c.m1042f(f, ShadowKt.m10310shadows4CzXII$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), C2331Dp.m13305constructorimpl(f), RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(f)), false, 0L, 0L, 24, null), Color.INSTANCE.m10719getWhite0d7_KjU());
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1042f);
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
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            m4244d("编辑错题", onEditClick, composerStartRestartGroup, (i8 & 112) | 6);
            BoxKt.Box(BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), C2331Dp.m13305constructorimpl((float) 0.5d)), ColorKt.Color(4292928229L), null, 2, null), composerStartRestartGroup, 6);
            m4244d("移除错题", onRemoveClick, composerStartRestartGroup, ((i8 >> 3) & 112) | 6);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2756g(i, 14, modifier, onEditClick, onRemoveClick));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0369  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4243c(com.zykj.mistake.feature.notebook.detail.C4837m3 r43, p152r6.InterfaceC6471c r44, p152r6.InterfaceC6471c r45, androidx.compose.runtime.Composer r46, int r47) {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.AbstractC4874s4.m4243c(com.zykj.mistake.feature.notebook.detail.m3, r6.c, r6.c, androidx.compose.runtime.Composer, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/s4.smali:2124
    }

    /* renamed from: d */
    public static final void m4244d(String str, InterfaceC6469a interfaceC6469a, Composer composer, int i) {
        int i8;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1843452357);
        if ((i & 6) == 0) {
            i8 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 32 : 16;
        }
        int i9 = i8;
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1843452357, i9, -1, "com.zykj.mistake.feature.notebook.detail.MoreMenuItem (MistakeDetailTitleBar.kt:214)");
            }
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f7300b), false, null, null, interfaceC6469a, 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM6790clickableXHw0xAI$default);
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
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g(str, (Modifier) null, ColorKt.Color(4279572250L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, (i9 & 14) | 3456, 3072, 122866);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C2840b(i, 14, str, interfaceC6469a));
        }
    }
}
