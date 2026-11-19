package com.zykj.mistake.feature.notebook.detail;

import android.view.compose.C2756g;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.ClipKt;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.zykj.mistake.R;
import com.zykj.mistake.feature.collection.component.C4564j;
import com.zykj.mistake.feature.collection.component.C4567m;
import com.zykj.mistake.utils.C5100e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.q4 */
/* loaded from: classes3.dex */
public abstract class AbstractC4862q4 {

    /* renamed from: a */
    public static final long f7272a = ColorKt.Color(4292401368L);

    /* renamed from: b */
    public static final /* synthetic */ int f7273b = 0;

    /* renamed from: a */
    public static final void m4227a(InterfaceC6469a onClick, Composer composer, int i) {
        int i8;
        InterfaceC6469a interfaceC6469a;
        AbstractC5830k.m5330g(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-609342890);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-609342890, i8, -1, "com.zykj.mistake.feature.notebook.detail.AddPictureNoteItem (MistakeDetailNotePanel.kt:293)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM7309size3ABfNKs = SizeKt.m7309size3ABfNKs(companion, AbstractC4880t4.f7314f);
            float f = AbstractC4880t4.f7313e;
            Modifier dashedNoteBorder = ClipKt.clip(modifierM7309size3ABfNKs, RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(f));
            AbstractC5830k.m5330g(dashedNoteBorder, "$this$dashedNoteBorder");
            interfaceC6469a = onClick;
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(DrawModifierKt.drawBehind(dashedNoteBorder, new C4826k4(f)), false, null, null, interfaceC6469a, 7, null);
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
            int i9 = 22;
            Modifier modifierM7309size3ABfNKs2 = SizeKt.m7309size3ABfNKs(companion, C2331Dp.m13305constructorimpl(22));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4564j(i9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CanvasKt.Canvas(modifierM7309size3ABfNKs2, (InterfaceC6471c) objRememberedValue, composerStartRestartGroup, 54);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            interfaceC6469a = onClick;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4832l4(i, 0, interfaceC6469a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0227  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4228b(java.util.List r28, boolean r29, p152r6.InterfaceC6469a r30, p152r6.InterfaceC6471c r31, p152r6.InterfaceC6471c r32, androidx.compose.runtime.Composer r33, int r34) {
        /*
            Method dump skipped, instructions count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.AbstractC4862q4.m4228b(java.util.List, boolean, r6.a, r6.c, r6.c, androidx.compose.runtime.Composer, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/q4.smali:588
    }

    /* renamed from: c */
    public static final void m4229c(final String str, final long j7, final InterfaceC6469a onClick, final Modifier modifier, Composer composer, final int i) {
        int i8;
        AbstractC5830k.m5330g(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1685194285);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(j7) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 1171) != 1170, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1685194285, i8, -1, "com.zykj.mistake.feature.notebook.detail.NoteBoardSection (MistakeDetailNotePanel.kt:104)");
            }
            InterfaceC6469a interfaceC6469aM4459c = C5100e.m4459c(onClick, composerStartRestartGroup, ((i8 >> 3) & 112) | 384, 1);
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion.getStart(), composerStartRestartGroup, 0);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            m4234h(StringResources_androidKt.stringResource(R.string.board_note, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion3, C2331Dp.m13305constructorimpl(12)), composerStartRestartGroup, 6);
            Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null);
            float f = AbstractC4880t4.f7313e;
            Modifier dashedNoteBorder = ClipKt.clip(modifierWeight$default, RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(f));
            AbstractC5830k.m5330g(dashedNoteBorder, "$this$dashedNoteBorder");
            Modifier modifierM7262padding3ABfNKs = PaddingKt.m7262padding3ABfNKs(ClickableKt.m6790clickableXHw0xAI$default(DrawModifierKt.drawBehind(dashedNoteBorder, new C4826k4(f)), false, null, null, interfaceC6469aM4459c, 7, null), C2331Dp.m13305constructorimpl(1));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7262padding3ABfNKs);
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
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (str == null || AbstractC5855p.m5382P(str)) {
                composerStartRestartGroup.startReplaceGroup(378200063);
                TextKt.m9105Text4IGK_g("点击添加画板笔记", (Modifier) null, ColorKt.Color(4291611852L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(377852243);
                composerStartRestartGroup.startMovableGroup(1120567983, composerStartRestartGroup.joinKey(str, Long.valueOf(j7)));
                int i9 = i8;
                m4231e(str, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), Long.valueOf(j7), true, composerStartRestartGroup, (i9 & 14) | 3120 | ((i9 << 3) & 896), 0);
                composerStartRestartGroup.endMovableGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (AbstractC0584a.m899D(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: com.zykj.mistake.feature.notebook.detail.n4
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC4862q4.m4229c(str, j7, onClick, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return C5443s.f8405a;
                }
            });
        }
    }

    /* renamed from: d */
    public static final void m4230d(C4825k3 c4825k3, InterfaceC6471c interfaceC6471c, Modifier modifier, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1599382396);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c4825k3) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(1599382396, i8, -1, "com.zykj.mistake.feature.notebook.detail.NoteContent (MistakeDetailNotePanel.kt:68)");
            }
            Modifier modifierM7262padding3ABfNKs = PaddingKt.m7262padding3ABfNKs(BackgroundKt.m6754backgroundbw27NRU$default(modifier, ColorKt.Color(4294309882L), null, 2, null), C2331Dp.m13305constructorimpl(16));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7262padding3ABfNKs);
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
            float f = 22;
            Modifier modifierM7263paddingVpY3zN4 = PaddingKt.m7263paddingVpY3zN4(AbstractC1923c.m1042f(6, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), Color.INSTANCE.m10719getWhite0d7_KjU()), C2331Dp.m13305constructorimpl(f), C2331Dp.m13305constructorimpl(f));
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7263paddingVpY3zN4);
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
            String str = c4825k3.f7079c;
            long j7 = c4825k3.f7080d;
            int i9 = i8 & 112;
            boolean z8 = i9 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4873s3(interfaceC6471c, 15);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, companion3, 1.0f, false, 2, null);
            boolean z9 = false;
            m4229c(str, j7, (InterfaceC6469a) objRememberedValue, modifierWeight$default, composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion3, C2331Dp.m13305constructorimpl(f)), composerStartRestartGroup, 6);
            List list = c4825k3.f7081e;
            boolean z10 = list.size() < c4825k3.f7083g;
            boolean z11 = i9 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new C4873s3(interfaceC6471c, 16);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            InterfaceC6469a interfaceC6469a = (InterfaceC6469a) objRememberedValue2;
            boolean z12 = i9 == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z12 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new C4838m4(interfaceC6471c, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            InterfaceC6471c interfaceC6471c2 = (InterfaceC6471c) objRememberedValue3;
            if (i9 == 32) {
                z9 = true;
            }
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new C4838m4(interfaceC6471c, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            m4233g(list, z10, interfaceC6469a, interfaceC6471c2, (InterfaceC6471c) objRememberedValue4, composerStartRestartGroup, 0);
            if (AbstractC0584a.m899D(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2756g(c4825k3, interfaceC6471c, modifier, i, 12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4231e(java.lang.String r13, androidx.compose.p011ui.Modifier r14, java.lang.Object r15, boolean r16, androidx.compose.runtime.Composer r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.AbstractC4862q4.m4231e(java.lang.String, androidx.compose.ui.Modifier, java.lang.Object, boolean, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/q4.smali:4580
    }

    /* renamed from: f */
    public static final void m4232f(String url, Modifier modifier, Modifier modifier2, Modifier modifier3, Composer composer, int i) {
        int i8;
        AbstractC5830k.m5330g(url, "url");
        Composer composerStartRestartGroup = composer.startRestartGroup(822326875);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(url) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier3) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 1171) != 1170, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(822326875, i8, -1, "com.zykj.mistake.feature.notebook.detail.NotePictureItem (MistakeDetailNotePanel.kt:326)");
            }
            Modifier modifierM7309size3ABfNKs = SizeKt.m7309size3ABfNKs(modifier, AbstractC4880t4.f7314f);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7309size3ABfNKs);
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
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
            float f = AbstractC4880t4.f7313e;
            float f7 = 1;
            Modifier modifierM7262padding3ABfNKs = PaddingKt.m7262padding3ABfNKs(BorderKt.m6767borderxT4_qwU(BackgroundKt.m6754backgroundbw27NRU$default(ClipKt.clip(modifierFillMaxSize$default, RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(f)), ColorKt.Color(4294244088L), null, 2, null), C2331Dp.m13305constructorimpl(f7), f7272a, RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(f)), C2331Dp.m13305constructorimpl(f7));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7262padding3ABfNKs);
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
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            m4231e(url, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, composerStartRestartGroup, (i8 & 14) | 48, 12);
            composerStartRestartGroup.endNode();
            BoxKt.Box(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4780d0(url, modifier, modifier2, modifier3, i));
        }
    }

    /* renamed from: g */
    public static final void m4233g(List pictureNotes, boolean z8, InterfaceC6469a onAddClick, InterfaceC6471c onImageClick, InterfaceC6471c onReorder, Composer composer, int i) {
        int i8;
        Composer composer2;
        AbstractC5830k.m5330g(pictureNotes, "pictureNotes");
        AbstractC5830k.m5330g(onAddClick, "onAddClick");
        AbstractC5830k.m5330g(onImageClick, "onImageClick");
        AbstractC5830k.m5330g(onReorder, "onReorder");
        Composer composerStartRestartGroup = composer.startRestartGroup(-394359019);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(pictureNotes) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onAddClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onImageClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onReorder) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-394359019, i8, -1, "com.zykj.mistake.feature.notebook.detail.NotePictureSection (MistakeDetailNotePanel.kt:146)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            m4234h(StringResources_androidKt.stringResource(R.string.image_note, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
            AbstractC1923c.m1055s(8, companion, composerStartRestartGroup, 6);
            TextKt.m9105Text4IGK_g("按住拖动可调整图片顺序", (Modifier) null, ColorKt.Color(4290493371L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, 3462, 3072, 122866);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion, C2331Dp.m13305constructorimpl(12)), composerStartRestartGroup, 6);
            m4228b(pictureNotes, z8, onAddClick, onImageClick, onReorder, composerStartRestartGroup, i8 & 65534);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4820j4(pictureNotes, z8, onAddClick, onImageClick, onReorder, i, 1));
        }
    }

    /* renamed from: h */
    public static final void m4234h(String title, Composer composer, int i) {
        int i8;
        Composer composer2;
        AbstractC5830k.m5330g(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(-423529777);
        if ((i & 6) == 0) {
            i8 = i | (composerStartRestartGroup.changed(title) ? 4 : 2);
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-423529777, i8, -1, "com.zykj.mistake.feature.notebook.detail.NoteSectionHeader (MistakeDetailNotePanel.kt:278)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            AbstractC4798g0.m4196j(null, composerStartRestartGroup, 0);
            AbstractC1923c.m1055s(7, companion, composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g(title, (Modifier) null, ColorKt.Color(4279572250L), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, (i8 & 14) | 200064, 3072, 122834);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4567m(title, i, 2));
        }
    }

    /* renamed from: i */
    public static final ArrayList m4235i(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int iIntValue = ((Number) linkedHashMap.getOrDefault(str, 0)).intValue();
            linkedHashMap.put(str, Integer.valueOf(iIntValue + 1));
            arrayList.add(new C4771b5(str + "#" + iIntValue, str));
        }
        return arrayList;
    }
}
