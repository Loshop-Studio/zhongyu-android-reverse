package com.zykj.mistake.feature.notebook.detail;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.n0 */
/* loaded from: classes3.dex */
public abstract class AbstractC4840n0 {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e9  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4217a(final boolean r35, final long r36, final int r38, final int r39, final java.lang.String r40, float r41, final p152r6.InterfaceC6469a r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.AbstractC4840n0.m4217a(boolean, long, int, int, java.lang.String, float, r6.a, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/n0.smali:7
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b3  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4218b(com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$AnswerResult r30, boolean r31, boolean r32, boolean r33, p152r6.InterfaceC6471c r34, androidx.compose.runtime.Composer r35, int r36) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.AbstractC4840n0.m4218b(com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$AnswerResult, boolean, boolean, boolean, r6.c, androidx.compose.runtime.Composer, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/n0.smali:655
    }

    /* renamed from: c */
    public static final void m4219c(String str, long j7, long j8, RoundedCornerShape shape, InterfaceC6469a onClick, Composer composer, int i) {
        String str2;
        int i8;
        Composer composer2;
        AbstractC5830k.m5330g(shape, "shape");
        AbstractC5830k.m5330g(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(724256223);
        if ((i & 6) == 0) {
            str2 = str;
            i8 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(j7) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(j8) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(shape) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onClick) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(724256223, i8, -1, "com.zykj.mistake.feature.notebook.detail.NavButton (MistakeDetailNavButtons.kt:134)");
            }
            int i9 = i8;
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(BackgroundKt.m6753backgroundbw27NRU(SizeKt.m7311sizeVpY3zN4(Modifier.INSTANCE, C2331Dp.m13305constructorimpl(TypedValues.TYPE_TARGET), C2331Dp.m13305constructorimpl(36)), j7, shape), false, null, null, onClick, 7, null);
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
            TextKt.m9105Text4IGK_g(str2, (Modifier) null, j8, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, (i9 & 14) | 3072 | (i9 & 896), 3072, 122866);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4828l0(str, j7, j8, shape, onClick, i));
        }
    }
}
