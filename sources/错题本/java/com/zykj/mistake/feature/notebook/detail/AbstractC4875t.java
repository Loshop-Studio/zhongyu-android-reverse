package com.zykj.mistake.feature.notebook.detail;

import android.content.Context;
import android.content.res.Resources;
import android.view.C2764i;
import android.view.compose.C2750a;
import android.view.compose.C2756g;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.ClipKt;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.PointerIconCompat;
import androidx.navigation.C2857e;
import androidx.navigation.compose.C2840b;
import coil3.compose.AbstractC3245b;
import com.zykj.mistake.R;
import com.zykj.mistake.feature.ask.C4529j0;
import com.zykj.mistake.feature.collection.component.C4564j;
import com.zykj.mistake.feature.collection.component.C4567m;
import com.zykj.mistake.feature.collection.detail.C4577a1;
import com.zykj.mistake.feature.collection.detail.C4580b1;
import com.zykj.mistake.feature.collection.filter.C4680u0;
import com.zykj.mistake.feature.collection.filter.C4684w0;
import com.zykj.mistake.feature.collection.list.C4727z;
import com.zykj.mistake.utils.C5100e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p207y6.InterfaceC6781e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.t */
/* loaded from: classes3.dex */
public abstract class AbstractC4875t {
    /* renamed from: a */
    public static final void m4245a(InterfaceC6469a onShowAnswer, Modifier modifier, Composer composer, int i) {
        int i8;
        Composer composer2;
        int i9;
        AbstractC5830k.m5330g(onShowAnswer, "onShowAnswer");
        Composer composerStartRestartGroup = composer.startRestartGroup(518751866);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(onShowAnswer) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(518751866, i8, -1, "com.zykj.mistake.feature.notebook.detail.AnswerCover (MistakeDetailAnswerPanel.kt:107)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_show_answer, composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ImageKt.Image(painterPainterResource, "查看答案", SizeKt.m7309size3ABfNKs(companion2, C2331Dp.m13305constructorimpl(100)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, MenuKt.InTransitionDuration);
            float f = 18;
            SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion2, C2331Dp.m13305constructorimpl(f)), composerStartRestartGroup, 6);
            i9 = 1;
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g("点击查看答案", ClickableKt.m6790clickableXHw0xAI$default(companion2, false, null, null, onShowAnswer, 7, null), AbstractC4880t4.f7309a, TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 200070, 3072, 122832);
            SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion2, C2331Dp.m13305constructorimpl(f)), composer2, 6);
            TextKt.m9105Text4IGK_g("练习模式可在上一页关闭", (Modifier) null, ColorKt.Color(4288256409L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3462, 3072, 122866);
            TextKt.m9105Text4IGK_g("练习模式下不保存草稿，仅临时使用", (Modifier) null, ColorKt.Color(4288256409L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3462, 3072, 122866);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i9 = 1;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4727z(onShowAnswer, modifier, i, i9));
        }
    }

    /* renamed from: b */
    public static final void m4246b(final String index, final MistakeDetailNewContract$AnswerDisplayType displayType, final List answers, final List comments, MistakeDetailNewContract$AnswerVisualState mistakeDetailNewContract$AnswerVisualState, InterfaceC6471c interfaceC6471c, final boolean z8, final boolean z9, Composer composer, final int i) {
        int i8;
        InterfaceC6471c interfaceC6471c2;
        Composer composer2;
        ComposeUiNode.Companion companion;
        Modifier.Companion companion2;
        int i9;
        MistakeDetailNewContract$AnswerVisualState visualState = mistakeDetailNewContract$AnswerVisualState;
        AbstractC5830k.m5330g(index, "index");
        AbstractC5830k.m5330g(displayType, "displayType");
        AbstractC5830k.m5330g(answers, "answers");
        AbstractC5830k.m5330g(comments, "comments");
        AbstractC5830k.m5330g(visualState, "visualState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-508788449);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(index) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(displayType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(answers) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(comments) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changed(visualState.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(z9) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i8) != 4793490, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-508788449, i8, -1, "com.zykj.mistake.feature.notebook.detail.AnswerEntryRow (MistakeDetailAnswerPanel.kt:645)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion5.getConstructor();
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion5, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (z9) {
                composerStartRestartGroup.startReplaceGroup(-1395418697);
                i9 = i8;
                companion = companion5;
                TextKt.m9105Text4IGK_g(index, SizeKt.m7314width3ABfNKs(companion3, C2331Dp.m13305constructorimpl(52)), ColorKt.Color(4284900966L), TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 3504, 0, 131056);
                composer2 = composerStartRestartGroup;
                companion2 = companion3;
                SpacerKt.Spacer(SizeKt.m7314width3ABfNKs(companion2, C2331Dp.m13305constructorimpl(8)), composer2, 6);
            } else {
                companion = companion5;
                companion2 = companion3;
                composer2 = composerStartRestartGroup;
                i9 = i8;
                composer2.startReplaceGroup(-1416800761);
            }
            composer2.endReplaceGroup();
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
            InterfaceC6469a constructor2 = companion.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composer2);
            ComposeUiNode.Companion companion6 = companion;
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion6, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i10 = AbstractC4869s.f7290b[displayType.ordinal()];
            if (i10 == 1) {
                interfaceC6471c2 = interfaceC6471c;
                composer2.startReplaceGroup(-855275472);
                visualState = mistakeDetailNewContract$AnswerVisualState;
                m4266v(answers, z8 ? "未作答" : "未订正", visualState, composer2, (i9 >> 6) & 910);
                composer2.endReplaceGroup();
            } else {
                if (i10 != 2) {
                    composer2.startReplaceGroup(-855277755);
                    composer2.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer2.startReplaceGroup(-855267105);
                boolean z10 = (i9 & 458752) == 131072;
                Object objRememberedValue = composer2.rememberedValue();
                if (z10 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    interfaceC6471c2 = interfaceC6471c;
                    objRememberedValue = new C4833m(interfaceC6471c2, 0);
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    interfaceC6471c2 = interfaceC6471c;
                }
                m4254j(answers, comments, (InterfaceC6473e) objRememberedValue, z8 ? "未作答" : "无订正内容", composer2, (i9 >> 6) & 126);
                composer2.endReplaceGroup();
                visualState = mistakeDetailNewContract$AnswerVisualState;
            }
            if (AbstractC0584a.m899D(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            interfaceC6471c2 = interfaceC6471c;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final MistakeDetailNewContract$AnswerVisualState mistakeDetailNewContract$AnswerVisualState2 = visualState;
            final InterfaceC6471c interfaceC6471c3 = interfaceC6471c2;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: com.zykj.mistake.feature.notebook.detail.n
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC4875t.m4246b(index, displayType, answers, comments, mistakeDetailNewContract$AnswerVisualState2, interfaceC6471c3, z8, z9, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return C5443s.f8405a;
                }
            });
        }
    }

    /* renamed from: c */
    public static final void m4247c(String str, String str2, InterfaceC6469a onClick, Composer composer, int i) {
        int i8;
        AbstractC5830k.m5330g(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-658376919);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-658376919, i8, -1, "com.zykj.mistake.feature.notebook.detail.AnswerImagePair (MistakeDetailAnswerPanel.kt:836)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM7297heightInVpY3zN4$default = SizeKt.m7297heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2331Dp.m13305constructorimpl(82), 0.0f, 2, null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new C4564j(6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(modifierM7297heightInVpY3zN4$default, (InterfaceC6471c) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierDrawWithContent);
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
            Modifier modifierM7262padding3ABfNKs = PaddingKt.m7262padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2331Dp.m13305constructorimpl(4));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new C4564j(7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            InterfaceC6471c interfaceC6471c = (InterfaceC6471c) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = MistakeDetailAnswerPanelKt$AnswerImagePair$2$2$1.INSTANCE;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            InterfaceC6471c interfaceC6471c2 = (InterfaceC6471c) ((InterfaceC6781e) objRememberedValue3);
            boolean z8 = ((i8 & 14) == 4) | ((i8 & 112) == 32) | ((i8 & 896) == 256);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new C2764i(str, str2, 8, onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            AndroidView_androidKt.AndroidView(interfaceC6471c, modifierM7262padding3ABfNKs, null, interfaceC6471c2, (InterfaceC6471c) objRememberedValue4, composerStartRestartGroup, 3126, 4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2756g(i, 9, str, str2, onClick));
        }
    }

    /* renamed from: d */
    public static final void m4248d(String str, List entries, InterfaceC6471c answersOf, C4852p0 c4852p0, InterfaceC6471c interfaceC6471c, boolean z8, Composer composer, int i) {
        int i8;
        String str2;
        InterfaceC6471c interfaceC6471c2;
        InterfaceC6471c interfaceC6471c3;
        C4852p0 c4852p02 = c4852p0;
        AbstractC5830k.m5330g(entries, "entries");
        AbstractC5830k.m5330g(answersOf, "answersOf");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1471712923);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(entries) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(answersOf) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(c4852p02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i8) != 74898, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1471712923, i8, -1, "com.zykj.mistake.feature.notebook.detail.AnswerSection (MistakeDetailAnswerPanel.kt:600)");
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
            AbstractC1923c.m1055s(8, companion, composerStartRestartGroup, 6);
            int i9 = i8;
            TextKt.m9105Text4IGK_g(str, (Modifier) null, ColorKt.Color(4279572250L), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 200064, 3072, 122834);
            str2 = str;
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            float f = 12;
            SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion, C2331Dp.m13305constructorimpl(f)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(-1271854479);
            Iterator it = entries.iterator();
            while (it.hasNext()) {
                C4846o0 c4846o0 = (C4846o0) it.next();
                m4246b(c4846o0.f7215a, c4846o0.f7216b, (List) answersOf.invoke(c4846o0), str2.equals("原答案") ? c4846o0.f7219e : c4846o0.f7221g, z8 ? c4846o0.f7222h : c4846o0.f7223i, interfaceC6471c, z8, !c4846o0.f7217c, composerStartRestartGroup, (i9 << 3) & 4128768);
                SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(Modifier.INSTANCE, C2331Dp.m13305constructorimpl(f)), composerStartRestartGroup, 6);
            }
            interfaceC6471c2 = answersOf;
            interfaceC6471c3 = interfaceC6471c;
            composerStartRestartGroup.endReplaceGroup();
            c4852p02 = c4852p0;
            if (c4852p02 == null) {
                composerStartRestartGroup.startReplaceGroup(-772254851);
            } else {
                composerStartRestartGroup.startReplaceGroup(-772254850);
                boolean zChanged = composerStartRestartGroup.changed(c4852p02) | ((i9 & 57344) == 16384);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new C2857e(7, interfaceC6471c3, c4852p02);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                m4255k(c4852p02, (InterfaceC6469a) objRememberedValue, composerStartRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(Modifier.INSTANCE, C2331Dp.m13305constructorimpl(f)), composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str2 = str;
            interfaceC6471c2 = answersOf;
            interfaceC6471c3 = interfaceC6471c;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4821k(str2, entries, interfaceC6471c2, c4852p02, interfaceC6471c3, z8, i));
        }
    }

    /* renamed from: e */
    public static final void m4249e(String str, Composer composer, int i) {
        int i8;
        Composer composer2;
        String str2 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(1677238248);
        if ((i & 6) == 0) {
            i8 = i | (composerStartRestartGroup.changed(str2) ? 4 : 2);
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1677238248, i8, -1, "com.zykj.mistake.feature.notebook.detail.DashedEmptyAnswerBox (MistakeDetailAnswerPanel.kt:799)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM7295height3ABfNKs = SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2331Dp.m13305constructorimpl(82));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4564j(9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(modifierM7295height3ABfNKs, (InterfaceC6471c) objRememberedValue);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierDrawBehind);
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
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_no_answer, composerStartRestartGroup, 0), str2, SizeKt.m7309size3ABfNKs(companion, C2331Dp.m13305constructorimpl(40)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i8 << 3) & 112) | 384, MenuKt.InTransitionDuration);
            AbstractC1923c.m1055s(8, companion, composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            str2 = str;
            TextKt.m9105Text4IGK_g(str2, (Modifier) null, ColorKt.Color(4288256409L), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, (i8 & 14) | 3456, 3072, 122866);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4567m(str2, i, 1));
        }
    }

    /* renamed from: f */
    public static final void m4250f(MistakeDetailNewContract$DetailTab selectedTab, InterfaceC6471c onSelectTab, Composer composer, int i) {
        AbstractC5830k.m5330g(selectedTab, "selectedTab");
        AbstractC5830k.m5330g(onSelectTab, "onSelectTab");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1357429122);
        int i8 = (i & 6) == 0 ? (composerStartRestartGroup.changed(selectedTab.ordinal()) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onSelectTab) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1357429122, i8, -1, "com.zykj.mistake.feature.notebook.detail.DetailAnswerTabs (MistakeDetailAnswerPanel.kt:147)");
            }
            List<Pair> listM5287z = AbstractC5806u.m5287z(new Pair(MistakeDetailNewContract$DetailTab.MY_ANSWER, "我的作答"), new Pair(MistakeDetailNewContract$DetailTab.SUPPLEMENT, "补充讲解"), new Pair(MistakeDetailNewContract$DetailTab.NOTE, "笔记"));
            Modifier modifierM7264paddingVpY3zN4$default = PaddingKt.m7264paddingVpY3zN4$default(BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m10717getTransparent0d7_KjU(), null, 2, null), C2331Dp.m13305constructorimpl(16), 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(28)), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7264paddingVpY3zN4$default);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1931196405);
            for (Pair pair : listM5287z) {
                MistakeDetailNewContract$DetailTab mistakeDetailNewContract$DetailTab = (MistakeDetailNewContract$DetailTab) pair.component1();
                String str = (String) pair.component2();
                boolean z8 = mistakeDetailNewContract$DetailTab == selectedTab;
                boolean zChanged = ((i8 & 112) == 32) | composerStartRestartGroup.changed(mistakeDetailNewContract$DetailTab.ordinal());
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new C2857e(10, onSelectTab, mistakeDetailNewContract$DetailTab);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                m4253i(str, z8, (InterfaceC6469a) objRememberedValue, composerStartRestartGroup, 0);
            }
            if (AbstractC0584a.m923x(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2840b(i, 11, selectedTab, onSelectTab));
        }
    }

    /* renamed from: g */
    public static final void m4251g(C4837m3 state, InterfaceC6471c interfaceC6471c, Modifier modifier, Composer composer, int i) {
        int i8;
        AbstractC5830k.m5330g(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-637197892);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(-637197892, i8, -1, "com.zykj.mistake.feature.notebook.detail.DetailRightPanel (MistakeDetailAnswerPanel.kt:69)");
            }
            Modifier modifierM6754backgroundbw27NRU$default = BackgroundKt.m6754backgroundbw27NRU$default(modifier, ColorKt.Color(4294309882L), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (state.f7121A) {
                composerStartRestartGroup.startReplaceGroup(978358434);
                MistakeDetailNewContract$DetailTab mistakeDetailNewContract$DetailTab = state.f7124D;
                boolean z8 = (i8 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new C4577a1(interfaceC6471c, 24);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                m4250f(mistakeDetailNewContract$DetailTab, (InterfaceC6471c) objRememberedValue, composerStartRestartGroup, 0);
                m4252h(state, interfaceC6471c, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), composerStartRestartGroup, i8 & 126);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(978106249);
                boolean z9 = (i8 & 112) == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z9 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new C4680u0(interfaceC6471c, 19);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                m4245a((InterfaceC6469a) objRememberedValue2, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            AbstractC4840n0.m4218b(state.f7179t, state.f7185z, state.f7122B, state.f7153d != MistakeDetailNewContract$EntryMode.REVIEW_RECOMMEND, interfaceC6471c, composerStartRestartGroup, (i8 << 9) & 57344);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4827l(state, interfaceC6471c, modifier, i, 0));
        }
    }

    /* renamed from: h */
    public static final void m4252h(C4837m3 state, InterfaceC6471c interfaceC6471c, Modifier modifier, Composer composer, int i) {
        int i8;
        AbstractC5830k.m5330g(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1487661464);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(1487661464, i8, -1, "com.zykj.mistake.feature.notebook.detail.DetailTabContent (MistakeDetailAnswerPanel.kt:207)");
            }
            int i9 = AbstractC4869s.f7289a[state.f7124D.ordinal()];
            if (i9 == 1) {
                composerStartRestartGroup.startReplaceGroup(-581433420);
                m4256l(state.f7125E, state.f7126F, state.f7127G, interfaceC6471c, modifier, composerStartRestartGroup, (i8 << 6) & 64512);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i9 == 2) {
                composerStartRestartGroup.startReplaceGroup(-581422286);
                m4258n(state.f7128H, interfaceC6471c, modifier, composerStartRestartGroup, i8 & PointerIconCompat.TYPE_TEXT);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i9 != 3) {
                    composerStartRestartGroup.startReplaceGroup(-581436063);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-581417376);
                AbstractC4862q4.m4230d(state.f7129I, interfaceC6471c, modifier, composerStartRestartGroup, i8 & PointerIconCompat.TYPE_TEXT);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4827l(state, interfaceC6471c, modifier, i, 1));
        }
    }

    /* renamed from: i */
    public static final void m4253i(String title, boolean z8, InterfaceC6469a onClick, Composer composer, int i) {
        int i8;
        boolean z9;
        Composer composer2;
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1790921002);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i9 = i8;
        if (composerStartRestartGroup.shouldExecute((i9 & 147) != 146, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1790921002, i9, -1, "com.zykj.mistake.feature.notebook.detail.DetailTabItem (MistakeDetailAnswerPanel.kt:175)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(ClickableKt.m6790clickableXHw0xAI$default(companion, false, null, null, onClick, 7, null), 0.0f, C2331Dp.m13305constructorimpl(12), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7266paddingqDBjuR0$default);
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
            long jColor = ColorKt.Color(z8 ? 4279572250L : 4288256409L);
            long sp = TextUnitKt.getSp(15);
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            TextKt.m9105Text4IGK_g(title, (Modifier) null, jColor, sp, (FontStyle) null, z8 ? companion3.getBold() : companion3.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, (i9 & 14) | 3072, 3072, 122834);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion, C2331Dp.m13305constructorimpl(6)), composer2, 6);
            z9 = z8;
            BoxKt.Box(AbstractC1923c.m1042f((float) 1.5d, SizeKt.m7295height3ABfNKs(SizeKt.m7314width3ABfNKs(companion, C2331Dp.m13305constructorimpl(20)), C2331Dp.m13305constructorimpl(3)), z9 ? AbstractC4880t4.f7309a : Color.INSTANCE.m10717getTransparent0d7_KjU()), composer2, 0);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            z9 = z8;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4580b1(i, title, onClick, z9));
        }
    }

    /* renamed from: j */
    public static final void m4254j(final List answers, final List comments, final InterfaceC6473e onPreview, final String str, Composer composer, final int i) {
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        InterfaceC6473e interfaceC6473e;
        AbstractC5830k.m5330g(answers, "answers");
        AbstractC5830k.m5330g(comments, "comments");
        AbstractC5830k.m5330g(onPreview, "onPreview");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1148865595);
        int i8 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(answers) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(comments) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onPreview) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 1171) != 1170, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1148865595, i8, -1, "com.zykj.mistake.feature.notebook.detail.ImageAnswerContent (MistakeDetailAnswerPanel.kt:774)");
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : answers) {
                if (!AbstractC5855p.m5382P((String) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : comments) {
                String str2 = (String) obj2;
                if (!AbstractC5855p.m5382P(str2) && !AbstractC5855p.m5372F(str2, "corrected", false)) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(739828216);
                m4249e(str, composerStartRestartGroup, (i8 >> 9) & 14);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i9 = 0;
                    interfaceC6473e = new InterfaceC6473e() { // from class: com.zykj.mistake.feature.notebook.detail.o
                        @Override // p152r6.InterfaceC6473e
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i9) {
                                case 0:
                                    ((Integer) obj4).intValue();
                                    AbstractC4875t.m4254j(answers, comments, onPreview, str, (Composer) obj3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ((Integer) obj4).intValue();
                                    AbstractC4875t.m4254j(answers, comments, onPreview, str, (Composer) obj3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return C5443s.f8405a;
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(interfaceC6473e);
                }
                return;
            }
            composerStartRestartGroup.startReplaceGroup(714412029);
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(8)), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int iMax = Math.max(arrayList.size(), arrayList2.size());
            composerStartRestartGroup.startReplaceGroup(-16760882);
            for (int i10 = 0; i10 < iMax; i10++) {
                String str3 = (String) AbstractC5805t.m5230j0(i10, arrayList);
                String str4 = (String) AbstractC5805t.m5230j0(i10, arrayList2);
                if (str4 == null || str4.equals(str3)) {
                    str4 = null;
                }
                boolean zChanged = ((i8 & 896) == 256) | composerStartRestartGroup.changed(str3) | composerStartRestartGroup.changed(str4);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new C2750a(onPreview, str3, 2, str4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                m4247c(str3, str4, (InterfaceC6469a) objRememberedValue, composerStartRestartGroup, 0);
            }
            if (AbstractC0584a.m923x(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i11 = 1;
            interfaceC6473e = new InterfaceC6473e() { // from class: com.zykj.mistake.feature.notebook.detail.o
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj3, Object obj4) {
                    switch (i11) {
                        case 0:
                            ((Integer) obj4).intValue();
                            AbstractC4875t.m4254j(answers, comments, onPreview, str, (Composer) obj3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj4).intValue();
                            AbstractC4875t.m4254j(answers, comments, onPreview, str, (Composer) obj3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return C5443s.f8405a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(interfaceC6473e);
        }
    }

    /* renamed from: k */
    public static final void m4255k(C4852p0 microLesson, InterfaceC6469a onClick, Composer composer, int i) {
        int i8;
        Composer composer2;
        AbstractC5830k.m5330g(microLesson, "microLesson");
        AbstractC5830k.m5330g(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1555694323);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(microLesson) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1555694323, i8, -1, "com.zykj.mistake.feature.notebook.detail.MicroLessonEntry (MistakeDetailAnswerPanel.kt:684)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(PaddingKt.m7266paddingqDBjuR0$default(companion, C2331Dp.m13305constructorimpl(56), C2331Dp.m13305constructorimpl(2), 0.0f, 0.0f, 12, null), false, null, null, onClick, 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.icon_micro_read, composerStartRestartGroup, 0), microLesson.f7239a, SizeKt.m7309size3ABfNKs(companion, C2331Dp.m13305constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 384, MenuKt.InTransitionDuration);
            AbstractC1923c.m1055s(5, companion, composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g(StringResources_androidKt.stringResource(R.string.view_comments, composerStartRestartGroup, 0), (Modifier) null, AbstractC4880t4.f7309a, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3456, 3072, 122866);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C2840b(i, 7, microLesson, onClick));
        }
    }

    /* renamed from: l */
    public static final void m4256l(final List answerEntries, final C4852p0 c4852p0, final C4852p0 c4852p02, final InterfaceC6471c interfaceC6471c, final Modifier modifier, Composer composer, final int i) {
        int i8;
        C4852p0 c4852p03;
        AbstractC5830k.m5330g(answerEntries, "answerEntries");
        Composer composerStartRestartGroup = composer.startRestartGroup(534986577);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(answerEntries) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            c4852p03 = c4852p0;
            i8 |= composerStartRestartGroup.changed(c4852p03) ? 32 : 16;
        } else {
            c4852p03 = c4852p0;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(c4852p02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(534986577, i8, -1, "com.zykj.mistake.feature.notebook.detail.MyAnswerContent (MistakeDetailAnswerPanel.kt:231)");
            }
            Modifier modifierM7262padding3ABfNKs = PaddingKt.m7262padding3ABfNKs(BackgroundKt.m6754backgroundbw27NRU$default(modifier, ColorKt.Color(4294309882L), null, 2, null), C2331Dp.m13305constructorimpl(16));
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            float f = 20;
            Modifier modifierM7263paddingVpY3zN4 = PaddingKt.m7263paddingVpY3zN4(ScrollKt.verticalScroll$default(AbstractC1923c.m1042f(4, SizeKt.fillMaxSize$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, 1, null), Color.INSTANCE.m10719getWhite0d7_KjU()), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), C2331Dp.m13305constructorimpl(24), C2331Dp.m13305constructorimpl(f));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), composerStartRestartGroup, 0);
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
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl2, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new C4564j(4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i9 = i8 << 3;
            int i10 = (i9 & 112) | 196998;
            int i11 = i9 & 57344;
            m4248d("原答案", answerEntries, (InterfaceC6471c) objRememberedValue, c4852p03, interfaceC6471c, true, composerStartRestartGroup, ((i8 << 6) & 7168) | i10 | i11);
            SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion3, C2331Dp.m13305constructorimpl(f)), composerStartRestartGroup, 6);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new C4564j(5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            m4248d("订正答案", answerEntries, (InterfaceC6471c) objRememberedValue2, c4852p02, interfaceC6471c, false, composerStartRestartGroup, (i9 & 7168) | i10 | i11);
            if (AbstractC0584a.m899D(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: com.zykj.mistake.feature.notebook.detail.h
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC4875t.m4256l(answerEntries, c4852p0, c4852p02, interfaceC6471c, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return C5443s.f8405a;
                }
            });
        }
    }

    /* renamed from: m */
    public static final void m4257m(String imageUrl, Modifier modifier, Composer composer, int i) {
        int i8;
        String str;
        AbstractC5830k.m5330g(imageUrl, "imageUrl");
        Composer composerStartRestartGroup = composer.startRestartGroup(77277652);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(imageUrl) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(77277652, i8, -1, "com.zykj.mistake.feature.notebook.detail.SupplementCardImage (MistakeDetailAnswerPanel.kt:515)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4564j(8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM7262padding3ABfNKs = PaddingKt.m7262padding3ABfNKs(DrawModifierKt.drawBehind(modifier, (InterfaceC6471c) objRememberedValue), C2331Dp.m13305constructorimpl(1));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7262padding3ABfNKs);
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
            str = imageUrl;
            AbstractC3245b.m2183b(str, C5100e.f8035a.m4462a((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), PainterResources_androidKt.painterResource(R.mipmap.pic_error, composerStartRestartGroup, 0), ContentScale.INSTANCE.getFit(), composerStartRestartGroup, (i8 & 14) | 3120);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str = imageUrl;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4529j0(str, modifier, i, 2));
        }
    }

    /* renamed from: n */
    public static final void m4258n(final C4843n3 c4843n3, final InterfaceC6471c interfaceC6471c, final Modifier modifier, Composer composer, final int i) throws Resources.NotFoundException {
        int i8;
        InterfaceC6471c interfaceC6471c2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        InterfaceC6473e interfaceC6473e;
        List list = c4843n3.f7203e;
        List list2 = c4843n3.f7202d;
        List list3 = c4843n3.f7201c;
        List list4 = c4843n3.f7200b;
        List list5 = c4843n3.f7199a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1381095366);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c4843n3) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i9 = i8;
        if (composerStartRestartGroup.shouldExecute((i9 & 147) != 146, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1381095366, i9, -1, "com.zykj.mistake.feature.notebook.detail.SupplementContent (MistakeDetailAnswerPanel.kt:271)");
            }
            if (list5.isEmpty() && list4.isEmpty() && list3.isEmpty() && list2.isEmpty() && list.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(1575146462);
                m4259o(modifier, composerStartRestartGroup, (i9 >> 6) & 14);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i10 = 1;
                    interfaceC6473e = new InterfaceC6473e() { // from class: com.zykj.mistake.feature.notebook.detail.g
                        @Override // p152r6.InterfaceC6473e
                        public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                            int i11 = i10;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i11) {
                                case 0:
                                    AbstractC4875t.m4258n(c4843n3, interfaceC6471c, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    AbstractC4875t.m4258n(c4843n3, interfaceC6471c, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return C5443s.f8405a;
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(interfaceC6473e);
                }
                return;
            }
            composerStartRestartGroup.startReplaceGroup(1565597160);
            composerStartRestartGroup.endReplaceGroup();
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
            float f = 22;
            Modifier modifierM7263paddingVpY3zN4 = PaddingKt.m7263paddingVpY3zN4(ScrollKt.verticalScroll$default(AbstractC1923c.m1042f(6, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m10719getWhite0d7_KjU()), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), C2331Dp.m13305constructorimpl(f), C2331Dp.m13305constructorimpl(f));
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
            String strStringResource = StringResources_androidKt.stringResource(R.string.answer_micro_class, composerStartRestartGroup, 0);
            int i11 = i9 & 112;
            boolean z8 = i11 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                interfaceC6471c2 = interfaceC6471c;
                objRememberedValue = new C4577a1(interfaceC6471c2, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                interfaceC6471c2 = interfaceC6471c;
            }
            m4261q(strStringResource, list5, (InterfaceC6471c) objRememberedValue, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(R.string.one_to_one_micro_class, composerStartRestartGroup, 0);
            boolean z9 = i11 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new C4577a1(interfaceC6471c2, 26);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            m4261q(strStringResource2, list4, (InterfaceC6471c) objRememberedValue2, composerStartRestartGroup, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(R.string.revised_micro_class, composerStartRestartGroup, 0);
            boolean z10 = i11 == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new C4577a1(interfaceC6471c2, 21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            m4261q(strStringResource3, list3, (InterfaceC6471c) objRememberedValue3, composerStartRestartGroup, 0);
            String strStringResource4 = StringResources_androidKt.stringResource(R.string.typical_right, composerStartRestartGroup, 0);
            boolean z11 = i11 == 32;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new C4577a1(interfaceC6471c2, 22);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            m4264t(strStringResource4, list2, (InterfaceC6471c) objRememberedValue4, composerStartRestartGroup, 0);
            String strStringResource5 = StringResources_androidKt.stringResource(R.string.typical_wrong, composerStartRestartGroup, 0);
            boolean z12 = i11 == 32;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z12 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new C4577a1(interfaceC6471c2, 23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            m4264t(strStringResource5, list, (InterfaceC6471c) objRememberedValue5, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            interfaceC6471c2 = interfaceC6471c;
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i12 = 0;
            final InterfaceC6471c interfaceC6471c3 = interfaceC6471c2;
            interfaceC6473e = new InterfaceC6473e() { // from class: com.zykj.mistake.feature.notebook.detail.g
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                    int i112 = i12;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i112) {
                        case 0:
                            AbstractC4875t.m4258n(c4843n3, interfaceC6471c3, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            AbstractC4875t.m4258n(c4843n3, interfaceC6471c3, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return C5443s.f8405a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(interfaceC6473e);
        }
    }

    /* renamed from: o */
    public static final void m4259o(Modifier modifier, Composer composer, int i) {
        int i8;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1086155402);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1086155402, i8, -1, "com.zykj.mistake.feature.notebook.detail.SupplementEmptyContent (MistakeDetailAnswerPanel.kt:335)");
            }
            Modifier modifierM6754backgroundbw27NRU$default = BackgroundKt.m6754backgroundbw27NRU$default(modifier, ColorKt.Color(4294309882L), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_supplementary_explanation, composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            i9 = 1;
            ImageKt.Image(painterPainterResource, "该题没有教师讲解", SizeKt.m7309size3ABfNKs(companion2, C2331Dp.m13305constructorimpl(LocationRequestCompat.QUALITY_LOW_POWER)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, MenuKt.InTransitionDuration);
            SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion2, C2331Dp.m13305constructorimpl(16)), composerStartRestartGroup, 6);
            TextKt.m9105Text4IGK_g("该题没有教师讲解", (Modifier) null, ColorKt.Color(4288256409L), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, 3462, 3072, 122866);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i9 = 1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4684w0(modifier, i, i9));
        }
    }

    /* renamed from: p */
    public static final void m4260p(C4819j3 lesson, InterfaceC6469a onClick, Composer composer, int i) {
        int i8;
        Composer composer2;
        AbstractC5830k.m5330g(lesson, "lesson");
        AbstractC5830k.m5330g(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1025526894);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(lesson) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1025526894, i8, -1, "com.zykj.mistake.feature.notebook.detail.SupplementMicroLessonCard (MistakeDetailAnswerPanel.kt:434)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = AbstractC4880t4.f7323o;
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(SizeKt.m7314width3ABfNKs(companion, f), false, null, null, onClick, 7, null);
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion2.getStart(), composerStartRestartGroup, 0);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion3, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
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
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            RoundedCornerShape roundedCornerShapeM7559RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(4));
            m4257m(lesson.f7039b, BackgroundKt.m6753backgroundbw27NRU(ClipKt.clip(SizeKt.m7295height3ABfNKs(SizeKt.m7314width3ABfNKs(companion, f), AbstractC4880t4.f7324p), roundedCornerShapeM7559RoundedCornerShape0680j_4), Color.INSTANCE.m10719getWhite0d7_KjU(), roundedCornerShapeM7559RoundedCornerShape0680j_4), composerStartRestartGroup, 0);
            BoxKt.Box(BackgroundKt.m6754backgroundbw27NRU$default(ClipKt.clip(boxScopeInstance.matchParentSize(companion), roundedCornerShapeM7559RoundedCornerShape0680j_4), ColorKt.Color(1711276032), null, 2, null), composerStartRestartGroup, 0);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_play, composerStartRestartGroup, 0), "播放", SizeKt.m7309size3ABfNKs(boxScopeInstance.align(companion, companion2.getCenter()), C2331Dp.m13305constructorimpl(36)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, MenuKt.InTransitionDuration);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion, C2331Dp.m13305constructorimpl(8)), composerStartRestartGroup, 6);
            String str = lesson.f7038a;
            if (AbstractC5855p.m5382P(str)) {
                str = "未命名";
            }
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g(str, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorKt.Color(4284900966L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m13241getEllipsisgIe3tQ8(), false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3504, 3120, 120816);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C2840b(i, 9, lesson, onClick));
        }
    }

    /* renamed from: q */
    public static final void m4261q(String title, List lessons, InterfaceC6471c onClick, Composer composer, int i) {
        int i8;
        String str;
        List list;
        InterfaceC6471c interfaceC6471c;
        int i9;
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(lessons, "lessons");
        AbstractC5830k.m5330g(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-573104940);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(lessons) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-573104940, i8, -1, "com.zykj.mistake.feature.notebook.detail.SupplementMicroLessonSection (MistakeDetailAnswerPanel.kt:361)");
            }
            if (lessons.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new C4809i(title, lessons, onClick, i, 0));
                    return;
                }
                return;
            }
            str = title;
            list = lessons;
            i9 = i;
            interfaceC6471c = onClick;
            m4262r(str, ComposableLambdaKt.rememberComposableLambda(1661366756, true, new C4815j(0, list, interfaceC6471c), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str = title;
            list = lessons;
            interfaceC6471c = onClick;
            i9 = i;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new C4809i(str, list, interfaceC6471c, i9, 1));
        }
    }

    /* renamed from: r */
    public static final void m4262r(String title, InterfaceC6474f content, Composer composer, int i) {
        int i8;
        InterfaceC6474f interfaceC6474f;
        Composer composer2;
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-651982713);
        if ((i & 6) == 0) {
            i8 = i | (composerStartRestartGroup.changed(title) ? 4 : 2);
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-651982713, i8, -1, "com.zykj.mistake.feature.notebook.detail.SupplementSection (MistakeDetailAnswerPanel.kt:408)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C2331Dp.m13305constructorimpl(22), 7, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7266paddingqDBjuR0$default);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion3, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
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
            AbstractC4798g0.m4196j(null, composerStartRestartGroup, 0);
            AbstractC1923c.m1055s(7, companion, composerStartRestartGroup, 6);
            TextKt.m9105Text4IGK_g(title, (Modifier) null, ColorKt.Color(4279572250L), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 200064, 3072, 122834);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion, C2331Dp.m13305constructorimpl(12)), composer2, 6);
            interfaceC6474f = content;
            interfaceC6474f.invoke(columnScopeInstance, composer2, Integer.valueOf((i8 & 112) | 6));
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            interfaceC6474f = content;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2840b(i, 8, title, interfaceC6474f));
        }
    }

    /* renamed from: s */
    public static final void m4263s(C4849o3 answer, InterfaceC6469a onClick, Composer composer, int i) {
        int i8;
        Composer composer2;
        AbstractC5830k.m5330g(answer, "answer");
        AbstractC5830k.m5330g(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1613160266);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(answer) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1613160266, i8, -1, "com.zykj.mistake.feature.notebook.detail.SupplementTypicalAnswerCard (MistakeDetailAnswerPanel.kt:480)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = AbstractC4880t4.f7323o;
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(SizeKt.m7314width3ABfNKs(companion, f), false, null, null, onClick, 7, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion3, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM6754backgroundbw27NRU$default = BackgroundKt.m6754backgroundbw27NRU$default(ClipKt.clip(SizeKt.m7295height3ABfNKs(SizeKt.m7314width3ABfNKs(companion, f), AbstractC4880t4.f7324p), RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(4))), Color.INSTANCE.m10719getWhite0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM6754backgroundbw27NRU$default);
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
            m4257m(answer.f7231b, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 48);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion, C2331Dp.m13305constructorimpl(8)), composerStartRestartGroup, 6);
            String str = answer.f7230a;
            if (AbstractC5855p.m5382P(str)) {
                str = "未命名";
            }
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g(str, (Modifier) null, ColorKt.Color(4284900966L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m13241getEllipsisgIe3tQ8(), false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3456, 3120, 120818);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C2840b(i, 10, answer, onClick));
        }
    }

    /* renamed from: t */
    public static final void m4264t(String title, List answers, InterfaceC6471c onClick, Composer composer, int i) {
        int i8;
        String str;
        List list;
        InterfaceC6471c interfaceC6471c;
        int i9;
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(answers, "answers");
        AbstractC5830k.m5330g(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1666941960);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(answers) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1666941960, i8, -1, "com.zykj.mistake.feature.notebook.detail.SupplementTypicalSection (MistakeDetailAnswerPanel.kt:385)");
            }
            if (answers.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new C4809i(title, answers, onClick, i, 2));
                    return;
                }
                return;
            }
            str = title;
            list = answers;
            i9 = i;
            interfaceC6471c = onClick;
            m4262r(str, ComposableLambdaKt.rememberComposableLambda(1260380440, true, new C4815j(1, list, interfaceC6471c), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str = title;
            list = answers;
            interfaceC6471c = onClick;
            i9 = i;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new C4809i(str, list, interfaceC6471c, i9, 3));
        }
    }

    /* renamed from: u */
    public static final void m4265u(final String text, final long j7, final long j8, Composer composer, final int i) {
        int i8;
        Composer composer2;
        AbstractC5830k.m5330g(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1855688704);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(j7) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(j8) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1855688704, i8, -1, "com.zykj.mistake.feature.notebook.detail.TextAnswerChip (MistakeDetailAnswerPanel.kt:754)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g(text, PaddingKt.m7263paddingVpY3zN4(AbstractC1923c.m1042f(3, SizeKt.m7316widthInVpY3zN4$default(Modifier.INSTANCE, C2331Dp.m13305constructorimpl(60), 0.0f, 2, null), j8), C2331Dp.m13305constructorimpl(12), C2331Dp.m13305constructorimpl(7)), j7, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13182boximpl(TextAlign.INSTANCE.m13189getCentere0LSkKk()), 0L, 0, false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, (i8 & 14) | 3072 | ((i8 << 3) & 896), 3072, 122352);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: com.zykj.mistake.feature.notebook.detail.r
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    AbstractC4875t.m4265u(text, j7, j8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return C5443s.f8405a;
                }
            });
        }
    }

    /* renamed from: v */
    public static final void m4266v(final List answers, final String str, final MistakeDetailNewContract$AnswerVisualState visualState, Composer composer, final int i) {
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        InterfaceC6473e interfaceC6473e;
        long j7;
        AbstractC5830k.m5330g(answers, "answers");
        AbstractC5830k.m5330g(visualState, "visualState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1542025540);
        int i8 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(answers) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(visualState.ordinal()) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1542025540, i8, -1, "com.zykj.mistake.feature.notebook.detail.TextAnswerContent (MistakeDetailAnswerPanel.kt:711)");
            }
            final ArrayList arrayList = new ArrayList();
            for (Object obj : answers) {
                if (!AbstractC5855p.m5382P((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(-487086355);
                m4265u(str, AbstractC4880t4.f7320l, AbstractC4880t4.f7319k, composerStartRestartGroup, ((i8 >> 3) & 14) | 432);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i9 = 0;
                    interfaceC6473e = new InterfaceC6473e() { // from class: com.zykj.mistake.feature.notebook.detail.p
                        @Override // p152r6.InterfaceC6473e
                        public final Object invoke(Object obj2, Object obj3) {
                            int i10 = i9;
                            Composer composer3 = (Composer) obj2;
                            ((Integer) obj3).intValue();
                            switch (i10) {
                                case 0:
                                    AbstractC4875t.m4266v(answers, str, visualState, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    AbstractC4875t.m4266v(answers, str, visualState, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return C5443s.f8405a;
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(interfaceC6473e);
                }
                return;
            }
            composerStartRestartGroup.startReplaceGroup(-510518914);
            composerStartRestartGroup.endReplaceGroup();
            final long jM10719getWhite0d7_KjU = visualState == MistakeDetailNewContract$AnswerVisualState.EMPTY ? AbstractC4880t4.f7320l : Color.INSTANCE.m10719getWhite0d7_KjU();
            int i10 = AbstractC4869s.f7291c[visualState.ordinal()];
            if (i10 == 1) {
                j7 = AbstractC4880t4.f7319k;
            } else if (i10 == 2) {
                j7 = AbstractC4880t4.f7318j;
            } else if (i10 == 3) {
                j7 = AbstractC4880t4.f7316h;
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                j7 = AbstractC4880t4.f7317i;
            }
            final long j8 = j7;
            Modifier modifierM7264paddingVpY3zN4$default = PaddingKt.m7264paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C2331Dp.m13305constructorimpl(2), 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            float f = 8;
            FlowLayoutKt.FlowRow(modifierM7264paddingVpY3zN4$default, arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f)), arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f)), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-354844801, true, new InterfaceC6474f() { // from class: com.zykj.mistake.feature.notebook.detail.q
                @Override // p152r6.InterfaceC6474f
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    FlowRowScope FlowRow = (FlowRowScope) obj2;
                    Composer composer3 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    AbstractC5830k.m5330g(FlowRow, "$this$FlowRow");
                    if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-354844801, iIntValue, -1, "com.zykj.mistake.feature.notebook.detail.TextAnswerContent.<anonymous> (MistakeDetailAnswerPanel.kt:739)");
                        }
                        ArrayList arrayList2 = arrayList;
                        int size = arrayList2.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            AbstractC4875t.m4265u((String) arrayList2.get(i11), jM10719getWhite0d7_KjU, j8, composer3, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return C5443s.f8405a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573302, 56);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i11 = 1;
            interfaceC6473e = new InterfaceC6473e() { // from class: com.zykj.mistake.feature.notebook.detail.p
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj2, Object obj3) {
                    int i102 = i11;
                    Composer composer3 = (Composer) obj2;
                    ((Integer) obj3).intValue();
                    switch (i102) {
                        case 0:
                            AbstractC4875t.m4266v(answers, str, visualState, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            AbstractC4875t.m4266v(answers, str, visualState, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return C5443s.f8405a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(interfaceC6473e);
        }
    }
}
