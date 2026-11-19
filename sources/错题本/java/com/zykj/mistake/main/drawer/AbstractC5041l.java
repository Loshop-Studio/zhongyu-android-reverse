package com.zykj.mistake.main.drawer;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zykj.mistake.R;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.feature.collection.filter.C4653h;
import com.zykj.mistake.feature.notebook.detail.C4780d0;
import com.zykj.mistake.feature.notebook.detail.C4832l4;
import com.zykj.mistake.feature.notebook.list.C4959k1;
import com.zykj.mistake.feature.review.C5016x;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.main.drawer.l */
/* loaded from: classes3.dex */
public abstract class AbstractC5041l {
    /* renamed from: a */
    public static final void m4369a(String str, long j7, long j8, InterfaceC6469a interfaceC6469a, Composer composer, int i) {
        int i8;
        InterfaceC6469a interfaceC6469a2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-477070837);
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
                ComposerKt.traceEventStart(-477070837, i8, -1, "com.zykj.mistake.main.drawer.DrawerBottomButton (MistakeTagEditorPanel.kt:316)");
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4653h(str, j7, j8, interfaceC6469a, i, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0358 A[LOOP:0: B:151:0x0356->B:152:0x0358, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03b3 A[LOOP:1: B:159:0x03b1->B:160:0x03b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0407 A[LOOP:2: B:167:0x0405->B:168:0x0407, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0107  */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4370b(com.zykj.mistake.main.C5021a1 r42, final p152r6.InterfaceC6469a r43, final p152r6.InterfaceC6471c r44, final p152r6.InterfaceC6469a r45, final p152r6.InterfaceC6473e r46, final p152r6.InterfaceC6471c r47, final p152r6.InterfaceC6469a r48, final p152r6.InterfaceC6469a r49, androidx.compose.runtime.Composer r50, final int r51) {
        /*
            Method dump skipped, instructions count: 1819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.main.drawer.AbstractC5041l.m4370b(com.zykj.mistake.main.a1, r6.a, r6.c, r6.a, r6.e, r6.c, r6.a, r6.a, androidx.compose.runtime.Composer, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/main/drawer/l.smali:752
    }

    /* renamed from: c */
    public static final void m4371c(InterfaceC6469a interfaceC6469a, Composer composer, int i) {
        int i8;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-775068027);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(interfaceC6469a) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-775068027, i8, -1, "com.zykj.mistake.main.drawer.TagAddChip (MistakeTagEditorPanel.kt:278)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM7295height3ABfNKs = SizeKt.m7295height3ABfNKs(SizeKt.m7314width3ABfNKs(companion, C2331Dp.m13305constructorimpl(66)), C2331Dp.m13305constructorimpl(36));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4959k1(13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(DrawModifierKt.drawBehind(modifierM7295height3ABfNKs, (InterfaceC6471c) objRememberedValue), false, null, null, interfaceC6469a, 7, null);
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
            i9 = 2;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_add, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(R.string.add_mistake_tag, composerStartRestartGroup, 0), SizeKt.m7309size3ABfNKs(companion, C2331Dp.m13305constructorimpl(22)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 384, MenuKt.InTransitionDuration);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i9 = 2;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4832l4(i, i9, interfaceC6469a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4372d(java.lang.String r64, boolean r65, p152r6.InterfaceC6469a r66, p152r6.InterfaceC6469a r67, androidx.compose.runtime.Composer r68, int r69, int r70) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.main.drawer.AbstractC5041l.m4372d(java.lang.String, boolean, r6.a, r6.a, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/main/drawer/l.smali:3517
    }

    /* renamed from: e */
    public static final void m4373e(String str, ArrayList arrayList, List list, InterfaceC6473e interfaceC6473e, Composer composer, int i) {
        String str2;
        int i8;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1197685858);
        if ((i & 6) == 0) {
            str2 = str;
            i8 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(arrayList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 1171) != 1170, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1197685858, i8, -1, "com.zykj.mistake.main.drawer.TagSection (MistakeTagEditorPanel.kt:220)");
            }
            float f = 10;
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g(str2, PaddingKt.m7266paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C2331Dp.m13305constructorimpl(16), 0.0f, C2331Dp.m13305constructorimpl(f), 5, null), ColorKt.Color(4279572250L), TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, (i8 & 14) | 3504, 0, 131056);
            Arrangement arrangement = Arrangement.INSTANCE;
            FlowLayoutKt.FlowRow(null, arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f)), arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f)), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(1180932551, true, new C5016x(1, arrayList, list, interfaceC6473e), composer2, 54), composer2, 1573296, 57);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4780d0(str, arrayList, list, interfaceC6473e, i, 3));
        }
    }

    /* renamed from: f */
    public static final CustomTagInfo m4374f(String[] strArr, String str, int i) {
        if (AbstractC5802q.m5196W(strArr, str) == -1) {
            return null;
        }
        return new CustomTagInfo(str, r8 + 1, 0, i, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[RETURN] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4375g(java.util.List r6, com.zykj.mistake.entity.resp.CustomTagInfo r7, boolean r8) {
        /*
            if (r6 == 0) goto L9
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L9
            goto L39
        L9:
            java.util.Iterator r0 = r6.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            com.zykj.mistake.entity.resp.CustomTagInfo r1 = (com.zykj.mistake.entity.resp.CustomTagInfo) r1
            long r2 = r1.getId()
            long r4 = r7.getId()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Ld
            int r1 = r1.getLocalType()
            int r2 = r7.getLocalType()
            if (r1 != r2) goto Ld
            com.zykj.mistake.main.drawer.c r8 = new com.zykj.mistake.main.drawer.c
            r0 = 2
            r8.<init>(r7, r0)
            kotlin.collections.AbstractC5810y.m5298Z(r6, r8)
            return
        L39:
            if (r8 == 0) goto L5f
            if (r6 == 0) goto L44
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L44
            goto L5f
        L44:
            java.util.Iterator r0 = r6.iterator()
        L48:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r0.next()
            com.zykj.mistake.entity.resp.CustomTagInfo r1 = (com.zykj.mistake.entity.resp.CustomTagInfo) r1
            int r1 = r1.getLocalType()
            int r2 = r7.getLocalType()
            if (r1 != r2) goto L48
            goto L67
        L5f:
            int r0 = r6.size()
            r1 = 6
            if (r0 < r1) goto L67
            return
        L67:
            if (r8 == 0) goto L72
            com.zykj.mistake.main.drawer.c r8 = new com.zykj.mistake.main.drawer.c
            r0 = 3
            r8.<init>(r7, r0)
            kotlin.collections.AbstractC5810y.m5298Z(r6, r8)
        L72:
            r6.add(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.main.drawer.AbstractC5041l.m4375g(java.util.List, com.zykj.mistake.entity.resp.CustomTagInfo, boolean):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/main/drawer/l.smali:5285
    }
}
