package com.zykj.mistake.main.drawer;

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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.core.location.LocationRequestCompat;
import com.zykj.mistake.feature.collection.filter.C4653h;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.main.drawer.g */
/* loaded from: classes3.dex */
public abstract class AbstractC5036g {
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b6  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4364a(com.zykj.mistake.main.C5066p r49, p152r6.InterfaceC6469a r50, p152r6.InterfaceC6469a r51, p152r6.InterfaceC6471c r52, p152r6.InterfaceC6469a r53, p152r6.InterfaceC6469a r54, p152r6.InterfaceC6471c r55, p152r6.InterfaceC6471c r56, p152r6.InterfaceC6471c r57, p152r6.InterfaceC6471c r58, p152r6.InterfaceC6469a r59, p152r6.InterfaceC6469a r60, p152r6.InterfaceC6471c r61, androidx.compose.runtime.Composer r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 1818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.main.drawer.AbstractC5036g.m4364a(com.zykj.mistake.main.p, r6.a, r6.a, r6.c, r6.a, r6.a, r6.c, r6.c, r6.c, r6.c, r6.a, r6.a, r6.c, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/main/drawer/g.smali:7
    }

    /* renamed from: b */
    public static final void m4365b(String str, long j7, long j8, InterfaceC6469a interfaceC6469a, Composer composer, int i) {
        int i8;
        InterfaceC6469a interfaceC6469a2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-639658345);
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
                ComposerKt.traceEventStart(-639658345, i8, -1, "com.zykj.mistake.main.drawer.NotebookFilterBottomButton (MistakeNotebookFilterPanel.kt:310)");
            }
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(AbstractC1923c.m1042f(4, SizeKt.m7295height3ABfNKs(SizeKt.m7314width3ABfNKs(Modifier.INSTANCE, C2331Dp.m13305constructorimpl(LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY)), C2331Dp.m13305constructorimpl(42)), j7), false, null, null, interfaceC6469a2, 7, null);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4653h(str, j7, j8, interfaceC6469a, i, 1));
        }
    }

    /* renamed from: c */
    public static final void m4366c(final String str, final boolean z8, final boolean z9, final boolean z10, final boolean z11, final InterfaceC6469a interfaceC6469a, Composer composer, final int i) {
        int i8;
        Composer composer2;
        Modifier modifierM7264paddingVpY3zN4$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(-780549980);
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
            i8 |= composerStartRestartGroup.changed(z11) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i8) != 74898, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-780549980, i8, -1, "com.zykj.mistake.main.drawer.NotebookFilterChip (MistakeNotebookFilterPanel.kt:269)");
            }
            if (z10 || z11) {
                Modifier.Companion companion = Modifier.INSTANCE;
                modifierM7264paddingVpY3zN4$default = PaddingKt.m7264paddingVpY3zN4$default(ClickableKt.m6790clickableXHw0xAI$default(AbstractC1923c.m1042f(3, SizeKt.m7295height3ABfNKs(companion.then(z11 ? SizeKt.m7316widthInVpY3zN4$default(companion, C2331Dp.m13305constructorimpl(74), 0.0f, 2, null) : companion), C2331Dp.m13305constructorimpl(34)), z8 ? ColorKt.Color(4293916415L) : ColorKt.Color(4294309365L)), false, null, null, interfaceC6469a, 7, null), C2331Dp.m13305constructorimpl(13), 0.0f, 2, null);
            } else {
                modifierM7264paddingVpY3zN4$default = AbstractC1923c.m1042f(3, ClickableKt.m6790clickableXHw0xAI$default(SizeKt.m7295height3ABfNKs(SizeKt.m7314width3ABfNKs(Modifier.INSTANCE, C2331Dp.m13305constructorimpl((z9 || AbstractC5855p.m5372F(str, " - ", false)) ? 188 : 74)), C2331Dp.m13305constructorimpl(34)), false, null, null, interfaceC6469a, 7, null), z8 ? ColorKt.Color(4293916415L) : ColorKt.Color(4294309365L));
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
            TextKt.m9105Text4IGK_g(str, (Modifier) null, ColorKt.Color(z8 ? 4279596799L : 4284900966L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, (z10 || z11) ? TextOverflow.INSTANCE.m13240getClipgIe3tQ8() : TextOverflow.INSTANCE.m13241getEllipsisgIe3tQ8(), false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, (i8 & 14) | 3072, 3072, 120818);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: com.zykj.mistake.main.drawer.f
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC5036g.m4366c(str, z8, z9, z10, z11, interfaceC6469a, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return C5443s.f8405a;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4367d(java.lang.String r34, java.util.List r35, java.lang.String r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.main.drawer.AbstractC5036g.m4367d(java.lang.String, java.util.List, java.lang.String, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/main/drawer/g.smali:4051
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList m4368e(java.util.ArrayList r13, java.lang.Integer r14, p152r6.InterfaceC6471c r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.AbstractC5806u.m5277p(r13, r1)
            r0.<init>(r1)
            int r1 = r13.size()
            r2 = 0
            r3 = r2
            r4 = r3
        L12:
            if (r4 >= r1) goto L5a
            java.lang.Object r5 = r13.get(r4)
            int r4 = r4 + 1
            int r6 = r3 + 1
            if (r3 < 0) goto L55
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            com.zykj.mistake.main.drawer.m r7 = new com.zykj.mistake.main.drawer.m
            r5 = 1
            if (r3 == 0) goto L41
            if (r3 == r5) goto L37
            int r9 = r3 + (-1)
            if (r14 != 0) goto L2d
            goto L35
        L2d:
            int r10 = r14.intValue()
            if (r10 != r9) goto L35
        L33:
            r9 = r5
            goto L44
        L35:
            r9 = r2
            goto L44
        L37:
            if (r14 != 0) goto L3a
            goto L35
        L3a:
            int r9 = r14.intValue()
            if (r9 != 0) goto L35
            goto L33
        L41:
            if (r14 != 0) goto L35
            goto L33
        L44:
            com.zykj.mistake.feature.collection.filter.d r11 = new com.zykj.mistake.feature.collection.filter.d
            r5 = 4
            r11.<init>(r3, r5, r15)
            r12 = 28
            r10 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r0.add(r7)
            r3 = r6
            goto L12
        L55:
            kotlin.collections.AbstractC5806u.m5258L()
            r13 = 0
            throw r13
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.main.drawer.AbstractC5036g.m4368e(java.util.ArrayList, java.lang.Integer, r6.c):java.util.ArrayList"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/main/drawer/g.smali:5221
    }
}
