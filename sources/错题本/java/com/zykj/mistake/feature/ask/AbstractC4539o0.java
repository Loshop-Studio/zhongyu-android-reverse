package com.zykj.mistake.feature.ask;

import android.content.Context;
import android.view.C2764i;
import android.view.compose.C2750a;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.ClipKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.C2826a;
import androidx.navigation.C2856d;
import androidx.navigation.compose.C2840b;
import androidx.navigation.compose.C2842d;
import androidx.navigation.internal.C2866e;
import androidx.navigation.serialization.C2872b;
import coil3.InterfaceC3308n;
import coil3.compose.AbstractC3245b;
import coil3.compose.AbstractC3256m;
import coil3.compose.AsyncImagePainter;
import coil3.compose.C3246c;
import com.zykj.mistake.R;
import com.zykj.mistake.utils.C5100e;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import p045d6.C5443s;
import p110m.C6073a;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p152r6.InterfaceC6475g;
import p205y4.AbstractC6775g;

/* renamed from: com.zykj.mistake.feature.ask.o0 */
/* loaded from: classes3.dex */
public abstract class AbstractC4539o0 {

    /* renamed from: a */
    public static final long f6282a = ColorKt.Color(4279863802L);

    /* renamed from: b */
    public static final long f6283b = ColorKt.Color(4294244346L);

    /* renamed from: c */
    public static final long f6284c = ColorKt.Color(4293588223L);

    /* renamed from: d */
    public static final long f6285d = ColorKt.Color(4292928229L);

    /* renamed from: e */
    public static final long f6286e = ColorKt.Color(4279572250L);

    /* renamed from: f */
    public static final long f6287f = ColorKt.Color(4284900966L);

    /* renamed from: g */
    public static final long f6288g = ColorKt.Color(4294309365L);

    /* renamed from: h */
    public static final long f6289h = ColorKt.Color(4288256409L);

    /* renamed from: i */
    public static final long f6290i = ColorKt.Color(4279596799L);

    /* renamed from: j */
    public static final long f6291j = ColorKt.Color(4294921551L);

    /* renamed from: a */
    public static final void m4003a(C4550z c4550z, InterfaceC6471c interfaceC6471c, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1785814474);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c4550z) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1785814474, i8, -1, "com.zykj.mistake.feature.ask.AskMaterialBottomBar (MistakeAskMaterialScreen.kt:438)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM7295height3ABfNKs = SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2331Dp.m13305constructorimpl(58));
            Color.Companion companion2 = Color.INSTANCE;
            Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(BackgroundKt.m6754backgroundbw27NRU$default(modifierM7295height3ABfNKs, companion2.m10719getWhite0d7_KjU(), null, 2, null), 0.0f, 0.0f, C2331Dp.m13305constructorimpl(18), 0.0f, 11, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getEnd(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion3, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            c4550z.getClass();
            long jColor = ColorKt.Color(4293193983L);
            long jColor2 = ColorKt.Color(4284900966L);
            int i9 = i8 & 112;
            boolean z8 = i9 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4525h0(interfaceC6471c, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            m4004b(3462, jColor, jColor2, composerStartRestartGroup, "取消", (InterfaceC6469a) objRememberedValue, true);
            AbstractC1923c.m1055s(12, companion, composerStartRestartGroup, 6);
            long jM10719getWhite0d7_KjU = companion2.m10719getWhite0d7_KjU();
            boolean z9 = i9 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new C4525h0(interfaceC6471c, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            m4004b(3456, f6282a, jM10719getWhite0d7_KjU, composerStartRestartGroup, "确认", (InterfaceC6469a) objRememberedValue2, true);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4517d0(c4550z, interfaceC6471c, i, 4));
        }
    }

    /* renamed from: b */
    public static final void m4004b(int i, long j7, long j8, Composer composer, String str, InterfaceC6469a interfaceC6469a, boolean z8) {
        int i8;
        Composer composer2;
        int i9;
        int i10;
        long jM10681copywmQWz5c$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(308284395);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(j7) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(j8) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(308284395, i8, -1, "com.zykj.mistake.feature.ask.AskMaterialButton (MistakeAskMaterialScreen.kt:473)");
            }
            Modifier modifierClip = ClipKt.clip(SizeKt.m7295height3ABfNKs(SizeKt.m7314width3ABfNKs(Modifier.INSTANCE, C2331Dp.m13305constructorimpl(TypedValues.TYPE_TARGET)), C2331Dp.m13305constructorimpl(36)), RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(4)));
            if (z8) {
                jM10681copywmQWz5c$default = j7;
                i9 = 16384;
                i10 = 1;
            } else {
                i9 = 16384;
                i10 = 1;
                jM10681copywmQWz5c$default = Color.m10681copywmQWz5c$default(j7, 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            Modifier modifierM6754backgroundbw27NRU$default = BackgroundKt.m6754backgroundbw27NRU$default(modifierClip, jM10681copywmQWz5c$default, null, 2, null);
            int i11 = (57344 & i8) == i9 ? i10 : 0;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i11 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C2866e(interfaceC6469a, i10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i12 = i8;
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(modifierM6754backgroundbw27NRU$default, z8, null, null, (InterfaceC6469a) objRememberedValue, 6, null);
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
            TextKt.m9105Text4IGK_g(str, (Modifier) null, j8, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, (i12 & 14) | 3072 | ((i12 >> 3) & 896), 0, 131058);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4519e0(str, z8, j7, j8, interfaceC6469a, i));
        }
    }

    /* renamed from: c */
    public static final void m4005c(C4550z c4550z, final InterfaceC6471c interfaceC6471c, Composer composer, int i) {
        int i8;
        Composer composer2;
        final int i9;
        Object next;
        Composer composerStartRestartGroup = composer.startRestartGroup(1475627161);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c4550z) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1475627161, i8, -1, "com.zykj.mistake.feature.ask.AskMaterialContent (MistakeAskMaterialScreen.kt:170)");
            }
            Iterator it = c4550z.f6315a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((C4536n) next).f6274a == c4550z.f6316b) {
                        break;
                    }
                }
            }
            final C4536n c4536n = (C4536n) next;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM7262padding3ABfNKs = PaddingKt.m7262padding3ABfNKs(BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), f6283b, null, 2, null), C2331Dp.m13305constructorimpl(18));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            composerStartRestartGroup.startReplaceGroup(1664903213);
            if (c4536n == null) {
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                i9 = 1;
            } else {
                int i10 = AbstractC4537n0.f6279a[c4536n.f6274a.ordinal()];
                if (i10 == 1) {
                    int i11 = i8;
                    composer2 = composerStartRestartGroup;
                    i9 = 1;
                    composer2.startReplaceGroup(1664929469);
                    C4549y c4549y = (C4549y) AbstractC5805t.m5229i0(c4536n.f6278e);
                    if (c4549y == null) {
                        composer2.startReplaceGroup(1664972279);
                    } else {
                        composer2.startReplaceGroup(1664972280);
                        MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType = c4536n.f6274a;
                        Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.92f);
                        boolean zChangedInstance = composer2.changedInstance(c4536n) | ((i11 & 112) == 32) | composer2.changedInstance(c4549y);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new C2750a(interfaceC6471c, c4536n, 1, c4549y);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        m4007e(mistakeAskMaterialContract$MaterialType, c4549y, modifierFillMaxHeight, false, (InterfaceC6469a) objRememberedValue, composer2, 3456);
                    }
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                } else if (i10 == 2) {
                    composer2 = composerStartRestartGroup;
                    i9 = 1;
                    composer2.startReplaceGroup(1665579570);
                    final int i12 = 0;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(-1221895274, true, new InterfaceC6474f() { // from class: com.zykj.mistake.feature.ask.l0
                        @Override // p152r6.InterfaceC6474f
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            switch (i12) {
                                case 0:
                                    Object BoxWithConstraints = (BoxWithConstraintsScope) obj;
                                    Composer composer3 = (Composer) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    AbstractC5830k.m5330g(BoxWithConstraints, "$this$BoxWithConstraints");
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= composer3.changed(BoxWithConstraints) ? 4 : 2;
                                    }
                                    if (composer3.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1221895274, iIntValue, -1, "com.zykj.mistake.feature.ask.AskMaterialContent.<anonymous>.<anonymous> (MistakeAskMaterialScreen.kt:197)");
                                        }
                                        int i13 = iIntValue;
                                        GridCells.Fixed fixed = new GridCells.Fixed(2);
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        float f = 12;
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM7143spacedBy0680j_4 = arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f));
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM7143spacedBy0680j_42 = arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f));
                                        Object obj4 = c4536n;
                                        boolean zChangedInstance2 = composer3.changedInstance(obj4);
                                        boolean z8 = (i13 & 14) == 4;
                                        InterfaceC6471c interfaceC6471c2 = interfaceC6471c;
                                        boolean zChanged = zChangedInstance2 | z8 | composer3.changed(interfaceC6471c2);
                                        Object objRememberedValue2 = composer3.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new C2764i(5, obj4, BoxWithConstraints, interfaceC6471c2);
                                            composer3.updateRememberedValue(objRememberedValue2);
                                        }
                                        LazyGridDslKt.LazyVerticalGrid(fixed, null, null, null, false, horizontalOrVerticalM7143spacedBy0680j_42, horizontalOrVerticalM7143spacedBy0680j_4, null, false, null, (InterfaceC6471c) objRememberedValue2, composer3, 1769472, 0, 926);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    BoxWithConstraintsScope BoxWithConstraints2 = (BoxWithConstraintsScope) obj;
                                    Composer composer4 = (Composer) obj2;
                                    int iIntValue2 = ((Integer) obj3).intValue();
                                    AbstractC5830k.m5330g(BoxWithConstraints2, "$this$BoxWithConstraints");
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= composer4.changed(BoxWithConstraints2) ? 4 : 2;
                                    }
                                    if (composer4.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-936759371, iIntValue2, -1, "com.zykj.mistake.feature.ask.AskMaterialContent.<anonymous>.<anonymous> (MistakeAskMaterialScreen.kt:218)");
                                        }
                                        float f7 = 12;
                                        final float fM13305constructorimpl = C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(BoxWithConstraints2.mo7168getMaxHeightD9Ej5fM() - C2331Dp.m13305constructorimpl(f7)) / 2);
                                        GridCells.Fixed fixed2 = new GridCells.Fixed(2);
                                        Arrangement arrangement2 = Arrangement.INSTANCE;
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM7143spacedBy0680j_43 = arrangement2.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f7));
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM7143spacedBy0680j_44 = arrangement2.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f7));
                                        final C4536n c4536n2 = c4536n;
                                        boolean zChangedInstance3 = composer4.changedInstance(c4536n2) | composer4.changed(fM13305constructorimpl);
                                        final InterfaceC6471c interfaceC6471c3 = interfaceC6471c;
                                        boolean zChanged2 = zChangedInstance3 | composer4.changed(interfaceC6471c3);
                                        Object objRememberedValue3 = composer4.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new InterfaceC6471c() { // from class: com.zykj.mistake.feature.ask.f0
                                                @Override // p152r6.InterfaceC6471c
                                                public final Object invoke(Object obj5) {
                                                    LazyGridScope LazyVerticalGrid = (LazyGridScope) obj5;
                                                    AbstractC5830k.m5330g(LazyVerticalGrid, "$this$LazyVerticalGrid");
                                                    final C4536n c4536n3 = c4536n2;
                                                    final List list = c4536n3.f6278e;
                                                    final C2826a c2826a = new C2826a(27);
                                                    final C4502x6ef8fbd3 c4502x6ef8fbd3 = new InterfaceC6471c() { // from class: com.zykj.mistake.feature.ask.MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$29$lambda$28$lambda$27$$inlined$items$default$1
                                                        @Override // p152r6.InterfaceC6471c
                                                        public final Void invoke(C4549y c4549y2) {
                                                            return null;
                                                        }

                                                        @Override // p152r6.InterfaceC6471c
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                                                            return invoke((C4549y) obj6);
                                                        }
                                                    };
                                                    int size = list.size();
                                                    InterfaceC6471c interfaceC6471c4 = new InterfaceC6471c() { // from class: com.zykj.mistake.feature.ask.MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$29$lambda$28$lambda$27$$inlined$items$default$2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // p152r6.InterfaceC6471c
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                                                            return invoke(((Number) obj6).intValue());
                                                        }

                                                        public final Object invoke(int i14) {
                                                            return c2826a.invoke(list.get(i14));
                                                        }
                                                    };
                                                    InterfaceC6471c interfaceC6471c5 = new InterfaceC6471c() { // from class: com.zykj.mistake.feature.ask.MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$29$lambda$28$lambda$27$$inlined$items$default$4
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // p152r6.InterfaceC6471c
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                                                            return invoke(((Number) obj6).intValue());
                                                        }

                                                        public final Object invoke(int i14) {
                                                            return c4502x6ef8fbd3.invoke(list.get(i14));
                                                        }
                                                    };
                                                    final float f8 = fM13305constructorimpl;
                                                    final InterfaceC6471c interfaceC6471c6 = interfaceC6471c3;
                                                    LazyVerticalGrid.items(size, interfaceC6471c4, null, interfaceC6471c5, ComposableLambdaKt.composableLambdaInstance(699646206, true, new InterfaceC6475g() { // from class: com.zykj.mistake.feature.ask.MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$29$lambda$28$lambda$27$$inlined$items$default$5
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(4);
                                                        }

                                                        @Override // p152r6.InterfaceC6475g
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                                                            invoke((LazyGridItemScope) obj6, ((Number) obj7).intValue(), (Composer) obj8, ((Number) obj9).intValue());
                                                            return C5443s.f8405a;
                                                        }

                                                        @Composable
                                                        public final void invoke(LazyGridItemScope lazyGridItemScope, int i14, Composer composer5, int i15) {
                                                            int i16;
                                                            if ((i15 & 6) == 0) {
                                                                i16 = (composer5.changed(lazyGridItemScope) ? 4 : 2) | i15;
                                                            } else {
                                                                i16 = i15;
                                                            }
                                                            if ((i15 & 48) == 0) {
                                                                i16 |= composer5.changed(i14) ? 32 : 16;
                                                            }
                                                            if (!composer5.shouldExecute((i16 & 147) != 146, i16 & 1)) {
                                                                composer5.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(699646206, i16, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                                                            }
                                                            C4549y c4549y2 = (C4549y) list.get(i14);
                                                            composer5.startReplaceGroup(-426874183);
                                                            MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType2 = c4536n3.f6274a;
                                                            Modifier modifierM7295height3ABfNKs = SizeKt.m7295height3ABfNKs(Modifier.INSTANCE, f8);
                                                            boolean zChanged3 = composer5.changed(interfaceC6471c6) | composer5.changedInstance(c4536n3) | composer5.changedInstance(c4549y2);
                                                            Object objRememberedValue4 = composer5.rememberedValue();
                                                            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue4 = new C4535m0(interfaceC6471c6, c4536n3, c4549y2, 1);
                                                                composer5.updateRememberedValue(objRememberedValue4);
                                                            }
                                                            AbstractC4539o0.m4007e(mistakeAskMaterialContract$MaterialType2, c4549y2, modifierM7295height3ABfNKs, true, (InterfaceC6469a) objRememberedValue4, composer5, 3072);
                                                            composer5.endReplaceGroup();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }));
                                                    return C5443s.f8405a;
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue3);
                                        }
                                        LazyGridDslKt.LazyVerticalGrid(fixed2, null, null, null, false, horizontalOrVerticalM7143spacedBy0680j_44, horizontalOrVerticalM7143spacedBy0680j_43, null, false, null, (InterfaceC6471c) objRememberedValue3, composer4, 1769472, 0, 926);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return C5443s.f8405a;
                        }
                    }, composer2, 54), composerStartRestartGroup, 3078, 6);
                    composer2.endReplaceGroup();
                } else if (i10 != 3) {
                    composerStartRestartGroup.startReplaceGroup(1667663855);
                    int i13 = i8;
                    GridCells.Fixed fixed = new GridCells.Fixed(2);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    float f = 12;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM7143spacedBy0680j_4 = arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f));
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM7143spacedBy0680j_42 = arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f));
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(c4536n) | ((i13 & 112) == 32);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new C2856d(4, c4536n, interfaceC6471c);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composer2 = composerStartRestartGroup;
                    LazyGridDslKt.LazyVerticalGrid(fixed, null, null, null, false, horizontalOrVerticalM7143spacedBy0680j_42, horizontalOrVerticalM7143spacedBy0680j_4, null, false, null, (InterfaceC6471c) objRememberedValue2, composer2, 1769472, 0, 926);
                    composer2.endReplaceGroup();
                    i9 = 1;
                } else {
                    composer2 = composerStartRestartGroup;
                    i9 = 1;
                    composer2.startReplaceGroup(1666619124);
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(-936759371, true, new InterfaceC6474f() { // from class: com.zykj.mistake.feature.ask.l0
                        @Override // p152r6.InterfaceC6474f
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            switch (i9) {
                                case 0:
                                    Object BoxWithConstraints = (BoxWithConstraintsScope) obj;
                                    Composer composer3 = (Composer) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    AbstractC5830k.m5330g(BoxWithConstraints, "$this$BoxWithConstraints");
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= composer3.changed(BoxWithConstraints) ? 4 : 2;
                                    }
                                    if (composer3.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1221895274, iIntValue, -1, "com.zykj.mistake.feature.ask.AskMaterialContent.<anonymous>.<anonymous> (MistakeAskMaterialScreen.kt:197)");
                                        }
                                        int i132 = iIntValue;
                                        GridCells.Fixed fixed2 = new GridCells.Fixed(2);
                                        Arrangement arrangement2 = Arrangement.INSTANCE;
                                        float f7 = 12;
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM7143spacedBy0680j_43 = arrangement2.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f7));
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM7143spacedBy0680j_422 = arrangement2.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f7));
                                        Object obj4 = c4536n;
                                        boolean zChangedInstance22 = composer3.changedInstance(obj4);
                                        boolean z8 = (i132 & 14) == 4;
                                        InterfaceC6471c interfaceC6471c2 = interfaceC6471c;
                                        boolean zChanged = zChangedInstance22 | z8 | composer3.changed(interfaceC6471c2);
                                        Object objRememberedValue22 = composer3.rememberedValue();
                                        if (zChanged || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue22 = new C2764i(5, obj4, BoxWithConstraints, interfaceC6471c2);
                                            composer3.updateRememberedValue(objRememberedValue22);
                                        }
                                        LazyGridDslKt.LazyVerticalGrid(fixed2, null, null, null, false, horizontalOrVerticalM7143spacedBy0680j_422, horizontalOrVerticalM7143spacedBy0680j_43, null, false, null, (InterfaceC6471c) objRememberedValue22, composer3, 1769472, 0, 926);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    BoxWithConstraintsScope BoxWithConstraints2 = (BoxWithConstraintsScope) obj;
                                    Composer composer4 = (Composer) obj2;
                                    int iIntValue2 = ((Integer) obj3).intValue();
                                    AbstractC5830k.m5330g(BoxWithConstraints2, "$this$BoxWithConstraints");
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= composer4.changed(BoxWithConstraints2) ? 4 : 2;
                                    }
                                    if (composer4.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-936759371, iIntValue2, -1, "com.zykj.mistake.feature.ask.AskMaterialContent.<anonymous>.<anonymous> (MistakeAskMaterialScreen.kt:218)");
                                        }
                                        float f72 = 12;
                                        final float fM13305constructorimpl = C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(BoxWithConstraints2.mo7168getMaxHeightD9Ej5fM() - C2331Dp.m13305constructorimpl(f72)) / 2);
                                        GridCells.Fixed fixed22 = new GridCells.Fixed(2);
                                        Arrangement arrangement22 = Arrangement.INSTANCE;
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM7143spacedBy0680j_432 = arrangement22.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f72));
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM7143spacedBy0680j_44 = arrangement22.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f72));
                                        final C4536n c4536n2 = c4536n;
                                        boolean zChangedInstance3 = composer4.changedInstance(c4536n2) | composer4.changed(fM13305constructorimpl);
                                        final InterfaceC6471c interfaceC6471c3 = interfaceC6471c;
                                        boolean zChanged2 = zChangedInstance3 | composer4.changed(interfaceC6471c3);
                                        Object objRememberedValue3 = composer4.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new InterfaceC6471c() { // from class: com.zykj.mistake.feature.ask.f0
                                                @Override // p152r6.InterfaceC6471c
                                                public final Object invoke(Object obj5) {
                                                    LazyGridScope LazyVerticalGrid = (LazyGridScope) obj5;
                                                    AbstractC5830k.m5330g(LazyVerticalGrid, "$this$LazyVerticalGrid");
                                                    final C4536n c4536n3 = c4536n2;
                                                    final List list = c4536n3.f6278e;
                                                    final InterfaceC6471c c2826a = new C2826a(27);
                                                    final InterfaceC6471c c4502x6ef8fbd3 = new InterfaceC6471c() { // from class: com.zykj.mistake.feature.ask.MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$29$lambda$28$lambda$27$$inlined$items$default$1
                                                        @Override // p152r6.InterfaceC6471c
                                                        public final Void invoke(C4549y c4549y2) {
                                                            return null;
                                                        }

                                                        @Override // p152r6.InterfaceC6471c
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                                                            return invoke((C4549y) obj6);
                                                        }
                                                    };
                                                    int size = list.size();
                                                    InterfaceC6471c interfaceC6471c4 = new InterfaceC6471c() { // from class: com.zykj.mistake.feature.ask.MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$29$lambda$28$lambda$27$$inlined$items$default$2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // p152r6.InterfaceC6471c
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                                                            return invoke(((Number) obj6).intValue());
                                                        }

                                                        public final Object invoke(int i14) {
                                                            return c2826a.invoke(list.get(i14));
                                                        }
                                                    };
                                                    InterfaceC6471c interfaceC6471c5 = new InterfaceC6471c() { // from class: com.zykj.mistake.feature.ask.MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$29$lambda$28$lambda$27$$inlined$items$default$4
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // p152r6.InterfaceC6471c
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                                                            return invoke(((Number) obj6).intValue());
                                                        }

                                                        public final Object invoke(int i14) {
                                                            return c4502x6ef8fbd3.invoke(list.get(i14));
                                                        }
                                                    };
                                                    final float f8 = fM13305constructorimpl;
                                                    final InterfaceC6471c interfaceC6471c6 = interfaceC6471c3;
                                                    LazyVerticalGrid.items(size, interfaceC6471c4, null, interfaceC6471c5, ComposableLambdaKt.composableLambdaInstance(699646206, true, new InterfaceC6475g() { // from class: com.zykj.mistake.feature.ask.MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$29$lambda$28$lambda$27$$inlined$items$default$5
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(4);
                                                        }

                                                        @Override // p152r6.InterfaceC6475g
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                                                            invoke((LazyGridItemScope) obj6, ((Number) obj7).intValue(), (Composer) obj8, ((Number) obj9).intValue());
                                                            return C5443s.f8405a;
                                                        }

                                                        @Composable
                                                        public final void invoke(LazyGridItemScope lazyGridItemScope, int i14, Composer composer5, int i15) {
                                                            int i16;
                                                            if ((i15 & 6) == 0) {
                                                                i16 = (composer5.changed(lazyGridItemScope) ? 4 : 2) | i15;
                                                            } else {
                                                                i16 = i15;
                                                            }
                                                            if ((i15 & 48) == 0) {
                                                                i16 |= composer5.changed(i14) ? 32 : 16;
                                                            }
                                                            if (!composer5.shouldExecute((i16 & 147) != 146, i16 & 1)) {
                                                                composer5.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(699646206, i16, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                                                            }
                                                            C4549y c4549y2 = (C4549y) list.get(i14);
                                                            composer5.startReplaceGroup(-426874183);
                                                            MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType2 = c4536n3.f6274a;
                                                            Modifier modifierM7295height3ABfNKs = SizeKt.m7295height3ABfNKs(Modifier.INSTANCE, f8);
                                                            boolean zChanged3 = composer5.changed(interfaceC6471c6) | composer5.changedInstance(c4536n3) | composer5.changedInstance(c4549y2);
                                                            Object objRememberedValue4 = composer5.rememberedValue();
                                                            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue4 = new C4535m0(interfaceC6471c6, c4536n3, c4549y2, 1);
                                                                composer5.updateRememberedValue(objRememberedValue4);
                                                            }
                                                            AbstractC4539o0.m4007e(mistakeAskMaterialContract$MaterialType2, c4549y2, modifierM7295height3ABfNKs, true, (InterfaceC6469a) objRememberedValue4, composer5, 3072);
                                                            composer5.endReplaceGroup();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }));
                                                    return C5443s.f8405a;
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue3);
                                        }
                                        LazyGridDslKt.LazyVerticalGrid(fixed22, null, null, null, false, horizontalOrVerticalM7143spacedBy0680j_44, horizontalOrVerticalM7143spacedBy0680j_432, null, false, null, (InterfaceC6471c) objRememberedValue3, composer4, 1769472, 0, 926);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return C5443s.f8405a;
                        }
                    }, composer2, 54), composerStartRestartGroup, 3078, 6);
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4517d0(c4550z, interfaceC6471c, i, i9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0223  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4006d(com.zykj.mistake.feature.ask.C4550z r40, p152r6.InterfaceC6471c r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.ask.AbstractC4539o0.m4006d(com.zykj.mistake.feature.ask.z, r6.c, androidx.compose.runtime.Composer, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/ask/o0.smali:3240
    }

    /* renamed from: e */
    public static final void m4007e(MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType, C4549y c4549y, Modifier modifier, boolean z8, InterfaceC6469a interfaceC6469a, Composer composer, int i) {
        int i8;
        Composer composer2;
        Modifier.Companion companion;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(1252995193);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(mistakeAskMaterialContract$MaterialType.ordinal()) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(c4549y) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1252995193, i8, -1, "com.zykj.mistake.feature.ask.AskMaterialImageCard (MistakeAskMaterialScreen.kt:268)");
            }
            float f = 4;
            Modifier modifierM6767borderxT4_qwU = BorderKt.m6767borderxT4_qwU(BackgroundKt.m6754backgroundbw27NRU$default(ClipKt.clip(modifier, RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(f))), Color.INSTANCE.m10719getWhite0d7_KjU(), null, 2, null), C2331Dp.m13305constructorimpl((float) 0.5d), f6285d, RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(f)));
            boolean z9 = (57344 & i8) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C2866e(interfaceC6469a, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(modifierM6767borderxT4_qwU, false, null, null, (InterfaceC6469a) objRememberedValue, 7, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
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
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl2, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Modifier modifierWeight$default = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, companion4, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
            m4011i(c4549y, SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), composerStartRestartGroup, ((i8 >> 3) & 14) | 48);
            composerStartRestartGroup.endNode();
            if (z8) {
                composerStartRestartGroup.startReplaceGroup(-2021989893);
                String str = c4549y.f6308b;
                int i10 = AbstractC4537n0.f6279a[mistakeAskMaterialContract$MaterialType.ordinal()];
                if (i10 != 3) {
                    if (i10 == 4 && AbstractC5855p.m5382P(str)) {
                        str = "典错";
                    }
                } else if (AbstractC5855p.m5382P(str)) {
                    str = "图片";
                }
                companion = companion4;
                i9 = 0;
                TextKt.m9105Text4IGK_g(str, PaddingKt.m7263paddingVpY3zN4(SizeKt.fillMaxWidth$default(SizeKt.m7295height3ABfNKs(companion4, C2331Dp.m13305constructorimpl(34)), 0.0f, 1, null), C2331Dp.m13305constructorimpl(12), C2331Dp.m13305constructorimpl(8)), f6286e, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m13241getEllipsisgIe3tQ8(), false, 1, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, 3504, 3120, 120816);
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
                companion = companion4;
                i9 = 0;
                composer2.startReplaceGroup(-2032797299);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            m4013k(c4549y.f6314h, PaddingKt.m7262padding3ABfNKs(boxScopeInstance.align(companion, companion2.getBottomEnd()), C2331Dp.m13305constructorimpl(10)), composer2, i9);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4523g0(mistakeAskMaterialContract$MaterialType, c4549y, modifier, z8, interfaceC6469a, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ae  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4008f(com.zykj.mistake.feature.ask.C4550z r31, p152r6.InterfaceC6471c r32, androidx.compose.runtime.Composer r33, int r34) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.ask.AbstractC4539o0.m4008f(com.zykj.mistake.feature.ask.z, r6.c, androidx.compose.runtime.Composer, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/ask/o0.smali:6416
    }

    /* renamed from: g */
    public static final void m4009g(C4536n c4536n, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1272747191);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c4536n) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1272747191, i8, -1, "com.zykj.mistake.feature.ask.GroupStateIcon (MistakeAskMaterialScreen.kt:158)");
            }
            int i9 = c4536n.f6276c;
            ImageKt.Image(PainterResources_androidKt.painterResource(i9 <= 0 ? R.drawable.ic_mistake_unselected : i9 == c4536n.f6277d ? R.drawable.ic_mistake_selected : R.drawable.ic_partial_selected, composerStartRestartGroup, 0), (String) null, SizeKt.m7309size3ABfNKs(Modifier.INSTANCE, C2331Dp.m13305constructorimpl(17)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, MenuKt.InTransitionDuration);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2842d(c4536n, i, 2));
        }
    }

    /* renamed from: h */
    public static final void m4010h(String str, Modifier modifier, Composer composer, int i) {
        int i8;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1968305882);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1968305882, i8, -1, "com.zykj.mistake.feature.ask.MaterialImage (MistakeAskMaterialScreen.kt:310)");
            }
            InterfaceC3308n interfaceC3308nM4462a = C5100e.f8035a.m4462a((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            ContentScale fit = ContentScale.INSTANCE.getFit();
            int i9 = ((i8 << 6) & 7168) | (i8 & 14) | 12582960;
            Alignment center = Alignment.INSTANCE.getCenter();
            int iM11236getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m11236getDefaultFilterQualityfv9h1I();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(40041566, i9, 0, "coil3.compose.AsyncImage (AsyncImage.kt:125)");
            }
            modifier2 = modifier;
            AbstractC3245b.m2182a(new C6073a(str, (C3246c) composerStartRestartGroup.consume(AbstractC3256m.f1879a), interfaceC3308nM4462a), modifier2, AsyncImagePainter.f1818q, null, center, fit, iM11236getDefaultFilterQualityfv9h1I, composerStartRestartGroup, ((i9 >> 3) & 896) | 1572912, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4529j0(str, modifier2, i, 1));
        }
    }

    /* renamed from: i */
    public static final void m4011i(C4549y c4549y, Modifier modifier, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-896904120);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c4549y) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-896904120, i8, -1, "com.zykj.mistake.feature.ask.MaterialPreview (MistakeAskMaterialScreen.kt:325)");
            }
            MistakeAskMaterialContract$SourceType mistakeAskMaterialContract$SourceType = c4549y.f6309c;
            String str = c4549y.f6312f;
            int i9 = AbstractC4537n0.f6280b[mistakeAskMaterialContract$SourceType.ordinal()];
            if (i9 == 1) {
                composerStartRestartGroup.startReplaceGroup(1363574085);
                m4010h(c4549y.f6310d, modifier, composerStartRestartGroup, i8 & 112);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i9 == 2) {
                composerStartRestartGroup.startReplaceGroup(1363578836);
                m4014l(c4549y.f6313g, modifier, composerStartRestartGroup, i8 & 112);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i9 != 3) {
                    composerStartRestartGroup.startReplaceGroup(1363572189);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-678560495);
                if (AbstractC5855p.m5382P(str)) {
                    composerStartRestartGroup.startReplaceGroup(-678364761);
                    m4015m("加载中", modifier, composerStartRestartGroup, (i8 & 112) | 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-678518459);
                    m4010h(str, modifier, composerStartRestartGroup, i8 & 112);
                    composerStartRestartGroup.endReplaceGroup();
                }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C2840b(i, 2, c4549y, modifier));
        }
    }

    /* renamed from: j */
    public static final void m4012j(C4550z state, InterfaceC6471c onIntent, Composer composer, int i) {
        int i8;
        AbstractC5830k.m5330g(state, "state");
        AbstractC5830k.m5330g(onIntent, "onIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1362413956);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onIntent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1362413956, i8, -1, "com.zykj.mistake.feature.ask.MistakeAskMaterialScreen (MistakeAskMaterialScreen.kt:62)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM6754backgroundbw27NRU$default = BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), f6283b, null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM6754backgroundbw27NRU$default);
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
            int i9 = i8 & 126;
            m4008f(state, onIntent, composerStartRestartGroup, i9);
            AbstractC6775g.m6461a(null, composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            m4006d(state, onIntent, composerStartRestartGroup, i9);
            m4005c(state, onIntent, composerStartRestartGroup, i9);
            composerStartRestartGroup.endNode();
            m4003a(state, onIntent, composerStartRestartGroup, i9);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4517d0(state, onIntent, i, 0));
        }
    }

    /* renamed from: k */
    public static final void m4013k(boolean z8, Modifier modifier, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-990628170);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(z8) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-990628170, i8, -1, "com.zykj.mistake.feature.ask.SelectIcon (MistakeAskMaterialScreen.kt:408)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(z8 ? R.drawable.ic_mistake_selected : R.drawable.ic_mistake_unselected, composerStartRestartGroup, 0), (String) null, SizeKt.m7309size3ABfNKs(modifier, C2331Dp.m13305constructorimpl(18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, MenuKt.InTransitionDuration);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4527i0(z8, modifier, i, 0));
        }
    }

    /* renamed from: l */
    public static final void m4014l(final C4515c0 c4515c0, final Modifier modifier, Composer composer, final int i) {
        int i8;
        final int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(2975606);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c4515c0) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        final int i10 = 0;
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2975606, i8, -1, "com.zykj.mistake.feature.ask.TextAnswerMaterialPreview (MistakeAskMaterialScreen.kt:367)");
            }
            if (c4515c0 == null) {
                composerStartRestartGroup.startReplaceGroup(-1547822859);
                m4015m("答案", modifier, composerStartRestartGroup, (i8 & 112) | 6);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: com.zykj.mistake.feature.ask.k0
                        @Override // p152r6.InterfaceC6473e
                        public final Object invoke(Object obj, Object obj2) {
                            int i11 = i10;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i11) {
                                case 0:
                                    AbstractC4539o0.m4014l(c4515c0, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    AbstractC4539o0.m4014l(c4515c0, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return C5443s.f8405a;
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.startReplaceGroup(-1561026100);
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM7262padding3ABfNKs = PaddingKt.m7262padding3ABfNKs(BackgroundKt.m6754backgroundbw27NRU$default(modifier, Color.INSTANCE.m10719getWhite0d7_KjU(), null, 2, null), C2331Dp.m13305constructorimpl(12));
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f = 8;
            i9 = 1;
            FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), arrangement.m7144spacedByD5KLDUw(C2331Dp.m13305constructorimpl(f), companion.getCenterHorizontally()), arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f)), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-230376897, true, new C2872b(c4515c0, 1), composerStartRestartGroup, 54), composerStartRestartGroup, 1573302, 56);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i9 = 1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new InterfaceC6473e() { // from class: com.zykj.mistake.feature.ask.k0
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) {
                    int i11 = i9;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i11) {
                        case 0:
                            AbstractC4539o0.m4014l(c4515c0, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            AbstractC4539o0.m4014l(c4515c0, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return C5443s.f8405a;
                }
            });
        }
    }

    /* renamed from: m */
    public static final void m4015m(String str, Modifier modifier, Composer composer, int i) {
        int i8;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1614687322);
        if ((i & 6) == 0) {
            i8 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i9 = i8;
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1614687322, i9, -1, "com.zykj.mistake.feature.ask.WebMaterialPlaceholder (MistakeAskMaterialScreen.kt:352)");
            }
            Modifier modifierM6754backgroundbw27NRU$default = BackgroundKt.m6754backgroundbw27NRU$default(modifier, ColorKt.Color(4294309882L), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
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
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g(str, (Modifier) null, f6287f, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, (14 & i9) | 3456, 0, 131058);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4529j0(str, modifier, i, 0));
        }
    }
}
