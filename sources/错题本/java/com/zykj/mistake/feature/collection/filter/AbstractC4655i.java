package com.zykj.mistake.feature.collection.filter;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import androidx.navigation.C2857e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.collection.filter.i */
/* loaded from: classes3.dex */
public abstract class AbstractC4655i {
    /* renamed from: a */
    public static final void m4075a(String str, long j7, long j8, InterfaceC6469a interfaceC6469a, Composer composer, int i) {
        int i8;
        InterfaceC6469a interfaceC6469a2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1623600853);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(j7) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(j8) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            interfaceC6469a2 = interfaceC6469a;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a2) ? 2048 : 1024;
        } else {
            interfaceC6469a2 = interfaceC6469a;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 1171) != 1170, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1623600853, i8, -1, "com.zykj.mistake.feature.collection.filter.FilterBottomButton (MistakeCollectionFilterPanel.kt:331)");
            }
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(AbstractC1923c.m1042f(4, SizeKt.m7295height3ABfNKs(SizeKt.m7314width3ABfNKs(Modifier.INSTANCE, C2331Dp.m13305constructorimpl(110)), C2331Dp.m13305constructorimpl(44)), j7), false, null, null, interfaceC6469a2, 7, null);
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
            TextKt.m9105Text4IGK_g(str, (Modifier) null, j8, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, (i8 & 14) | 199680 | (i8 & 896), 0, 131026);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4653h(str, j7, j8, interfaceC6469a, i, 0));
        }
    }

    /* renamed from: b */
    public static final void m4076b(String str, boolean z8, boolean z9, boolean z10, InterfaceC6469a interfaceC6469a, Composer composer, int i) {
        int i8;
        Composer composer2;
        Modifier modifierM7264paddingVpY3zN4$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(-298783682);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
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
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-298783682, i8, -1, "com.zykj.mistake.feature.collection.filter.FilterChip (MistakeCollectionFilterPanel.kt:290)");
            }
            if (z9 || z10) {
                Modifier.Companion companion = Modifier.INSTANCE;
                modifierM7264paddingVpY3zN4$default = PaddingKt.m7264paddingVpY3zN4$default(ClickableKt.m6790clickableXHw0xAI$default(AbstractC1923c.m1042f(3, SizeKt.m7295height3ABfNKs(companion.then(z10 ? SizeKt.m7316widthInVpY3zN4$default(companion, C2331Dp.m13305constructorimpl(74), 0.0f, 2, null) : companion), C2331Dp.m13305constructorimpl(34)), z8 ? ColorKt.Color(4293916415L) : ColorKt.Color(4294309365L)), false, null, null, interfaceC6469a, 7, null), C2331Dp.m13305constructorimpl(13), 0.0f, 2, null);
            } else {
                modifierM7264paddingVpY3zN4$default = AbstractC1923c.m1042f(3, ClickableKt.m6790clickableXHw0xAI$default(SizeKt.m7295height3ABfNKs(SizeKt.m7314width3ABfNKs(Modifier.INSTANCE, C2331Dp.m13305constructorimpl(AbstractC5855p.m5372F(str, " - ", false) ? 188 : 74)), C2331Dp.m13305constructorimpl(34)), false, null, null, interfaceC6469a, 7, null), z8 ? ColorKt.Color(4293916415L) : ColorKt.Color(4294309365L));
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7264paddingVpY3zN4$default);
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
            TextKt.m9105Text4IGK_g(str, (Modifier) null, ColorKt.Color(z8 ? 4279596799L : 4284900966L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, (z9 || z10) ? TextOverflow.INSTANCE.m13240getClipgIe3tQ8() : TextOverflow.INSTANCE.m13241getEllipsisgIe3tQ8(), false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, (i8 & 14) | 3072, 3072, 120818);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4647e(str, z8, z9, z10, interfaceC6469a, i, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4077c(java.lang.String r35, java.util.ArrayList r36, java.lang.String r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.collection.filter.AbstractC4655i.m4077c(java.lang.String, java.util.ArrayList, java.lang.String, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/collection/filter/i.smali:1855
    }

    /* JADX WARN: Removed duplicated region for block: B:243:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0544 A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4078d(final int r48, final java.lang.String r49, final java.lang.String r50, final boolean r51, final java.util.List r52, final java.util.List r53, final java.util.Set r54, final java.lang.Integer r55, java.lang.Integer r56, final java.lang.Integer r57, int r58, final boolean r59, final java.util.Set r60, final androidx.compose.p011ui.Modifier r61, final boolean r62, final boolean r63, final int r64, final p152r6.InterfaceC6471c r65, final p152r6.InterfaceC6469a r66, final p152r6.InterfaceC6471c r67, final p152r6.InterfaceC6471c r68, final p152r6.InterfaceC6471c r69, final p152r6.InterfaceC6471c r70, final p152r6.InterfaceC6471c r71, final p152r6.InterfaceC6471c r72, final p152r6.InterfaceC6469a r73, p152r6.InterfaceC6469a r74, p152r6.InterfaceC6471c r75, final p152r6.InterfaceC6469a r76, final p152r6.InterfaceC6469a r77, androidx.compose.runtime.Composer r78, final int r79, final int r80, final int r81) {
        /*
            Method dump skipped, instructions count: 2398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.collection.filter.AbstractC4655i.m4078d(int, java.lang.String, java.lang.String, boolean, java.util.List, java.util.List, java.util.Set, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, boolean, java.util.Set, androidx.compose.ui.Modifier, boolean, boolean, int, r6.c, r6.a, r6.c, r6.c, r6.c, r6.c, r6.c, r6.c, r6.a, r6.a, r6.c, r6.a, r6.a, androidx.compose.runtime.Composer, int, int, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/collection/filter/i.smali:3013
    }

    /* renamed from: e */
    public static final ArrayList m4079e(List list, Integer num, InterfaceC6471c interfaceC6471c) {
        ArrayList arrayListM5240t0 = AbstractC5805t.m5240t0(AbstractC5806u.m5287z("全部", "未打标签"), list);
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(arrayListM5240t0, 10));
        int size = arrayListM5240t0.size();
        int i = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayListM5240t0.get(i8);
            i8++;
            int i9 = i + 1;
            Integer numValueOf = null;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            String str = (String) obj;
            if (i != 0) {
                numValueOf = i != 1 ? Integer.valueOf(i - 1) : 0;
            }
            arrayList.add(new C4643c(12, str, new C2857e(6, interfaceC6471c, numValueOf), AbstractC5830k.m5325b(num, numValueOf)));
            i = i9;
        }
        return arrayList;
    }
}
