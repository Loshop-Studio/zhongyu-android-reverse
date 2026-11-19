package com.zykj.mistake.feature.notebook.list;

import android.view.viewmodel.compose.C2779a;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
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
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.navigation.C2857e;
import com.zykj.mistake.feature.ask.C4519e0;
import com.zykj.mistake.feature.collection.detail.C4580b1;
import com.zykj.mistake.feature.notebook.detail.C4832l4;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.list.j */
/* loaded from: classes3.dex */
public abstract class AbstractC4954j {
    /* renamed from: a */
    public static final void m4313a(Modifier modifier, InterfaceC6469a interfaceC6469a, boolean z8, Composer composer, int i) {
        int i8;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1885349121);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(z8) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1885349121, i8, -1, "com.zykj.mistake.feature.notebook.list.CreateCollectionEntry (MistakeJoinCollectionDialog.kt:180)");
            }
            Modifier modifierM7295height3ABfNKs = SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), C2331Dp.m13305constructorimpl(46));
            long jColor = ColorKt.Color(4293322987L);
            RoundedCornerShape roundedCornerShapeM7559RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(3));
            Color.Companion companion = Color.INSTANCE;
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(DrawModifierKt.drawBehind(BorderKt.m6767borderxT4_qwU(BackgroundKt.m6753backgroundbw27NRU(modifierM7295height3ABfNKs, companion.m10719getWhite0d7_KjU(), roundedCornerShapeM7559RoundedCornerShape0680j_4), C2331Dp.m13305constructorimpl(0), companion.m10717getTransparent0d7_KjU(), roundedCornerShapeM7559RoundedCornerShape0680j_4), new C4948h(jColor, 0)), z8, null, null, interfaceC6469a, 6, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM6790clickableXHw0xAI$default);
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
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
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
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g("+", (Modifier) null, ColorKt.Color(4288256409L), TextUnitKt.getSp(22), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3462, 0, 131058);
            TextKt.m9105Text4IGK_g("创建新错题集", PaddingKt.m7266paddingqDBjuR0$default(companion4, C2331Dp.m13305constructorimpl(10), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4290098613L), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3510, 0, 131056);
            if (AbstractC0584a.m899D(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4580b1(modifier, interfaceC6469a, z8, i));
        }
    }

    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* renamed from: b */
    public static final void m4314b(int i, long j7, long j8, Composer composer, String str, InterfaceC6469a interfaceC6469a, boolean z8) {
        int i8;
        Composer composer2;
        ?? r10;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(1237738469);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        long jM10681copywmQWz5c$default = j7;
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(jM10681copywmQWz5c$default) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(j8) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1237738469, i8, -1, "com.zykj.mistake.feature.notebook.list.JoinCollectionActionButton (MistakeJoinCollectionDialog.kt:208)");
            }
            Modifier modifierM7295height3ABfNKs = SizeKt.m7295height3ABfNKs(SizeKt.m7314width3ABfNKs(Modifier.INSTANCE, C2331Dp.m13305constructorimpl(LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY)), C2331Dp.m13305constructorimpl(42));
            if (z8) {
                r10 = 0;
                i9 = 16;
            } else {
                r10 = 0;
                i9 = 16;
                jM10681copywmQWz5c$default = Color.m10681copywmQWz5c$default(jM10681copywmQWz5c$default, 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            int i10 = i8;
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(AbstractC1923c.m1042f(4, modifierM7295height3ABfNKs, jM10681copywmQWz5c$default), z8, null, null, interfaceC6469a, 6, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), r10);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r10);
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
            TextKt.m9105Text4IGK_g(str, (Modifier) null, j8, TextUnitKt.getSp(i9), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, (i10 & 14) | 3072 | (i10 & 896), 0, 131058);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4519e0(str, j7, j8, z8, interfaceC6469a, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4315c(com.zykj.mistake.feature.notebook.list.C4927a r31, boolean r32, com.zykj.mistake.feature.notebook.list.JoinCollectionDialogMode r33, p152r6.InterfaceC6469a r34, androidx.compose.runtime.Composer r35, int r36) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.list.AbstractC4954j.m4315c(com.zykj.mistake.feature.notebook.list.a, boolean, com.zykj.mistake.feature.notebook.list.JoinCollectionDialogMode, r6.a, androidx.compose.runtime.Composer, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/list/j.smali:1908
    }

    /* renamed from: d */
    public static final void m4316d(final List collections, final Set selectedCollectionIds, final boolean z8, final boolean z9, final JoinCollectionDialogMode joinCollectionDialogMode, final InterfaceC6471c onSelect, final InterfaceC6469a onCreateClick, final InterfaceC6469a onDismiss, final InterfaceC6469a onConfirm, Composer composer, final int i) {
        int i8;
        boolean z10;
        boolean z11;
        Composer composer2;
        AbstractC5830k.m5330g(collections, "collections");
        AbstractC5830k.m5330g(selectedCollectionIds, "selectedCollectionIds");
        AbstractC5830k.m5330g(onSelect, "onSelect");
        AbstractC5830k.m5330g(onCreateClick, "onCreateClick");
        AbstractC5830k.m5330g(onDismiss, "onDismiss");
        AbstractC5830k.m5330g(onConfirm, "onConfirm");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1671322640);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(collections) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(selectedCollectionIds) ? 32 : 16;
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
            i8 |= composerStartRestartGroup.changed(joinCollectionDialogMode == null ? -1 : joinCollectionDialogMode.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onSelect) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onCreateClick) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onDismiss) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onConfirm) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i9 = i8;
        if (composerStartRestartGroup.shouldExecute((38347923 & i9) != 38347922, i9 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1671322640, i9, -1, "com.zykj.mistake.feature.notebook.list.MistakeJoinCollectionDialog (MistakeJoinCollectionDialog.kt:69)");
            }
            final boolean z12 = z10;
            final boolean z13 = z11;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(onDismiss, null, ComposableLambdaKt.rememberComposableLambda(-808782713, true, new InterfaceC6473e() { // from class: com.zykj.mistake.feature.notebook.list.f
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-808782713, iIntValue, -1, "com.zykj.mistake.feature.notebook.list.MistakeJoinCollectionDialog.<anonymous> (MistakeJoinCollectionDialog.kt:71)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        float f = 28;
                        float f7 = 26;
                        Modifier modifierM7265paddingqDBjuR0 = PaddingKt.m7265paddingqDBjuR0(AbstractC1923c.m1042f(4, SizeKt.m7314width3ABfNKs(companion, C2331Dp.m13305constructorimpl(540)), Color.INSTANCE.m10719getWhite0d7_KjU()), C2331Dp.m13305constructorimpl(f), C2331Dp.m13305constructorimpl(f), C2331Dp.m13305constructorimpl(f), C2331Dp.m13305constructorimpl(f7));
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM7265paddingqDBjuR0);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        InterfaceC6469a constructor = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer3);
                        InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion3, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                        if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        TextKt.m9105Text4IGK_g("加入错题集", (Modifier) null, ColorKt.Color(4279572250L), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer3, 200070, 0, 131026);
                        Composer composer4 = composer3;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m7266paddingqDBjuR0$default(SizeKt.m7296heightInVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2331Dp.m13305constructorimpl(330), C2331Dp.m13305constructorimpl(390)), 0.0f, C2331Dp.m13305constructorimpl(20), 0.0f, 0.0f, 13, null), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer4, 0);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierVerticalScroll$default);
                        InterfaceC6469a constructor2 = companion3.getConstructor();
                        if (composer4.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor2);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composer4);
                        InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM10109constructorimpl2, currentCompositionLocalMap2);
                        if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        composer4.startReplaceGroup(-67833160);
                        for (C4927a c4927a : collections) {
                            boolean zContains = selectedCollectionIds.contains(c4927a.f7456a);
                            InterfaceC6471c interfaceC6471c = onSelect;
                            boolean zChanged = composer4.changed(interfaceC6471c) | composer4.changed(c4927a);
                            Object objRememberedValue = composer4.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new C2857e(12, interfaceC6471c, c4927a);
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            Composer composer5 = composer4;
                            AbstractC4954j.m4315c(c4927a, zContains, joinCollectionDialogMode, (InterfaceC6469a) objRememberedValue, composer5, 0);
                            composer4 = composer5;
                        }
                        composer4.endReplaceGroup();
                        composer4.endNode();
                        boolean z14 = z12;
                        boolean z15 = !z14;
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        AbstractC4954j.m4313a(PaddingKt.m7266paddingqDBjuR0$default(companion4, 0.0f, C2331Dp.m13305constructorimpl(16), 0.0f, 0.0f, 13, null), onCreateClick, z15, composer4, 384);
                        Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(companion4, 0.0f, C2331Dp.m13305constructorimpl(f7), 0.0f, 0.0f, 13, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getTop(), composer4, 6);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifierM7266paddingqDBjuR0$default);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        InterfaceC6469a constructor3 = companion5.getConstructor();
                        if (composer4.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor3);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM10109constructorimpl3 = Updater.m10109constructorimpl(composer4);
                        InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion5, composerM10109constructorimpl3, measurePolicyRowMeasurePolicy, composerM10109constructorimpl3, currentCompositionLocalMap3);
                        if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        AbstractC4954j.m4314b(438, ColorKt.Color(4293456383L), ColorKt.Color(4279596799L), composer4, "取消", onDismiss, z15);
                        AbstractC1923c.m1055s(40, companion4, composer4, 6);
                        AbstractC4954j.m4314b(432, ColorKt.Color(4279596799L), Color.INSTANCE.m10719getWhite0d7_KjU(), composer4, z14 ? "加入中..." : "确认", onConfirm, !z14 && z13);
                        if (AbstractC0584a.m899D(composer4)) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return C5443s.f8405a;
                }
            }, composerStartRestartGroup, 54), composer2, ((i9 >> 21) & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: com.zykj.mistake.feature.notebook.list.g
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC4954j.m4316d(collections, selectedCollectionIds, z8, z9, joinCollectionDialogMode, onSelect, onCreateClick, onDismiss, onConfirm, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return C5443s.f8405a;
                }
            });
        }
    }

    /* renamed from: e */
    public static final void m4317e(InterfaceC6469a onConfirm, Composer composer, int i) {
        int i8;
        InterfaceC6469a interfaceC6469a;
        AbstractC5830k.m5330g(onConfirm, "onConfirm");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1176881184);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(onConfirm) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1176881184, i8, -1, "com.zykj.mistake.feature.notebook.list.NotebookCollectionLimitDialog (MistakeJoinCollectionDialog.kt:227)");
            }
            interfaceC6469a = onConfirm;
            AndroidDialog_androidKt.Dialog(interfaceC6469a, null, ComposableLambdaKt.rememberComposableLambda(1019380919, true, new C2779a(onConfirm, 1), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            interfaceC6469a = onConfirm;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4832l4(i, 1, interfaceC6469a));
        }
    }
}
