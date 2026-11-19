package com.zykj.mistake.feature.notebook.list;

import android.view.compose.C2756g;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.C2857e;
import coil3.compose.AbstractC3258o;
import coil3.compose.AsyncImagePainter;
import coil3.compose.C3249f;
import coil3.compose.InterfaceC3252i;
import com.zykj.mistake.R;
import com.zykj.mistake.feature.ask.C4527i0;
import com.zykj.mistake.feature.collection.component.AbstractC4560f;
import com.zykj.mistake.feature.collection.component.C4567m;
import com.zykj.mistake.feature.collection.list.C4724w;
import com.zykj.mistake.feature.collection.list.C4726y;
import com.zykj.mistake.feature.notebook.detail.C4838m4;
import com.zykj.mistake.feature.notebook.detail.C4873s3;
import com.zykj.mistake.feature.notebook.detail.C4899x;
import com.zykj.mistake.feature.notebook.detail.C4911z;
import com.zykj.mistake.utils.C5100e;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import p137p4.C6383b;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p205y4.AbstractC6775g;

/* renamed from: com.zykj.mistake.feature.notebook.list.i1 */
/* loaded from: classes3.dex */
public abstract class AbstractC4953i1 {

    /* renamed from: a */
    public static final long f7566a = ColorKt.Color(4279596799L);

    /* renamed from: b */
    public static final float f7567b = C2331Dp.m13305constructorimpl(70);

    /* renamed from: a */
    public static final void m4304a(C6383b c6383b, boolean z8, boolean z9, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, Composer composer, int i) {
        int i8;
        InterfaceC6469a interfaceC6469a3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1826314450);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c6383b) ? 4 : 2) | i;
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
            interfaceC6469a3 = interfaceC6469a;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a3) ? 2048 : 1024;
        } else {
            interfaceC6469a3 = interfaceC6469a;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a2) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1826314450, i8, -1, "com.zykj.mistake.feature.notebook.list.MistakeItemCard (MistakeNotebookScreen.kt:278)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Color.Companion companion2 = Color.INSTANCE;
            float f = 4;
            Modifier modifierM7263paddingVpY3zN4 = PaddingKt.m7263paddingVpY3zN4(ClickableKt.m6798combinedClickablef5TDLPQ$default(BorderKt.m6767borderxT4_qwU(AbstractC1923c.m1042f(f, modifierFillMaxWidth$default, companion2.m10719getWhite0d7_KjU()), z9 ? C2331Dp.m13305constructorimpl(1) : C2331Dp.m13305constructorimpl(0), z9 ? f7566a : companion2.m10717getTransparent0d7_KjU(), RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(f))), false, null, null, null, interfaceC6469a2, null, false, interfaceC6469a3, 111, null), C2331Dp.m13305constructorimpl(12), C2331Dp.m13305constructorimpl(10));
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7263paddingVpY3zN4);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion4.getConstructor();
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion4, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            InterfaceC6469a constructor2 = companion4.getConstructor();
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
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion4, composerM10109constructorimpl2, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            m4310g(c6383b.f10454i, composerStartRestartGroup, 0);
            AbstractC4936d.m4300a(c6383b, z8, null, composerStartRestartGroup, i8 & 126);
            composerStartRestartGroup.endNode();
            if (z8) {
                composerStartRestartGroup.startReplaceGroup(-1724727621);
                m4312i(z9, boxScopeInstance.align(companion, companion3.getBottomEnd()), composerStartRestartGroup, (i8 >> 6) & 14);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1736355814);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4724w(c6383b, z8, z9, interfaceC6469a, interfaceC6469a2, i, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4305b(int r15, java.lang.String r16, float r17, boolean r18, p152r6.InterfaceC6469a r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.list.AbstractC4953i1.m4305b(int, java.lang.String, float, boolean, r6.a, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/list/i1.smali:1139
    }

    /* renamed from: c */
    public static final void m4306c(boolean z8, InterfaceC6469a interfaceC6469a, Composer composer, int i) {
        int i8;
        Composer composer2;
        int i9;
        Modifier modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-523640096);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(z8) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-523640096, i8, -1, "com.zykj.mistake.feature.notebook.list.MistakeNotebookEmptyContent (MistakeNotebookScreen.kt:532)");
            }
            Modifier modifierM6790clickableXHw0xAI$default = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierM6790clickableXHw0xAI$default, 0.0f, 1, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            if (z8) {
                modifier = modifierM6790clickableXHw0xAI$default;
                modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(modifier, false, null, null, interfaceC6469a, 7, null);
            } else {
                modifier = modifierM6790clickableXHw0xAI$default;
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM6790clickableXHw0xAI$default);
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
            i9 = 1;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_no_data, composerStartRestartGroup, 0), "暂无错题", SizeKt.m7309size3ABfNKs(modifier, C2331Dp.m13305constructorimpl(100)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, MenuKt.InTransitionDuration);
            if (z8) {
                composerStartRestartGroup.startReplaceGroup(-1474654118);
                TextKt.m9105Text4IGK_g("点击新增", PaddingKt.m7266paddingqDBjuR0$default(modifier, 0.0f, C2331Dp.m13305constructorimpl(18), 0.0f, 0.0f, 13, null), ColorKt.Color(4279596799L), TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, 3510, 0, 131056);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1495072826);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g(z8 ? "当前无任何错题" : "暂无内容", PaddingKt.m7266paddingqDBjuR0$default(modifier, 0.0f, C2331Dp.m13305constructorimpl(18), 0.0f, 0.0f, 13, null), ColorKt.Color(4284900966L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3504, 0, 131056);
            if (AbstractC0584a.m899D(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i9 = 1;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4911z(z8, interfaceC6469a, i, i9));
        }
    }

    /* renamed from: d */
    public static final void m4307d(C4941e1 c4941e1, InterfaceC6471c interfaceC6471c, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(431071396);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c4941e1) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(431071396, i8, -1, "com.zykj.mistake.feature.notebook.list.MistakeNotebookGrid (MistakeNotebookScreen.kt:194)");
            }
            Object objRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
            int i9 = i8 & 112;
            boolean z8 = i9 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4838m4(interfaceC6471c, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            InterfaceC6471c interfaceC6471cM4460d = C5100e.m4460d(composerStartRestartGroup, (InterfaceC6471c) objRememberedValue);
            boolean zChanged = composerStartRestartGroup.changed(c4941e1.f7504d.size()) | composerStartRestartGroup.changed(objRememberLazyGridState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new C2857e(13, objRememberLazyGridState, c4941e1));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            State state = (State) objRememberedValue2;
            Object[] objArr = {state.getValue(), Boolean.valueOf(c4941e1.f7505e), Boolean.valueOf(c4941e1.f7506f), Boolean.valueOf(c4941e1.f7507g), Integer.valueOf(c4941e1.f7504d.size())};
            boolean zChanged2 = composerStartRestartGroup.changed(state) | composerStartRestartGroup.changedInstance(c4941e1) | (i9 == 32);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new MistakeNotebookScreenKt$MistakeNotebookGrid$1$1(state, c4941e1, interfaceC6471c, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(objArr, (InterfaceC6473e) objRememberedValue3, composerStartRestartGroup, 0);
            boolean z9 = c4941e1.f7505e;
            boolean z10 = i9 == 32;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new C4947g1(interfaceC6471c, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            PullToRefreshKt.PullToRefreshBox(z9, (InterfaceC6469a) objRememberedValue4, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, ComposableLambdaKt.rememberComposableLambda(362082046, true, new C4726y(objRememberLazyGridState, c4941e1, interfaceC6471c, interfaceC6471cM4460d, 1), composerStartRestartGroup, 54), composerStartRestartGroup, 1573248, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4950h1(c4941e1, interfaceC6471c, i, 1));
        }
    }

    /* renamed from: e */
    public static final void m4308e(C4941e1 state, InterfaceC6471c onIntent, Composer composer, int i) {
        int i8;
        int i9;
        boolean z8;
        AbstractC5830k.m5330g(state, "state");
        AbstractC5830k.m5330g(onIntent, "onIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(920041610);
        if ((i & 6) == 0) {
            i8 = i | (composerStartRestartGroup.changedInstance(state) ? 4 : 2);
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onIntent) ? 32 : 16;
        }
        int i10 = 0;
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(920041610, i8, -1, "com.zykj.mistake.feature.notebook.list.MistakeNotebookScreen (MistakeNotebookScreen.kt:72)");
            }
            int i11 = i8 & 112;
            boolean z9 = i11 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4873s3(onIntent, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            InterfaceC6469a interfaceC6469aM4459c = C5100e.m4459c((InterfaceC6469a) objRememberedValue, composerStartRestartGroup, 390, 0);
            Modifier modifierM6754backgroundbw27NRU$default = BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(4294441210L), null, 2, null);
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
            int i12 = i8 & 126;
            m4309f(state, onIntent, interfaceC6469aM4459c, composerStartRestartGroup, i12);
            AbstractC6775g.m6461a(null, composerStartRestartGroup, 0);
            if (!state.f7504d.isEmpty() || state.f7505e) {
                composerStartRestartGroup.startReplaceGroup(-593562875);
                m4307d(state, onIntent, composerStartRestartGroup, i12);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-593730306);
                m4306c(!state.f7508h, interfaceC6469aM4459c, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (state.f7515o) {
                composerStartRestartGroup.startReplaceGroup(-1520709136);
                List list = state.f7516p;
                Set set = state.f7518r;
                boolean z10 = state.f7519s;
                boolean z11 = !set.isEmpty();
                JoinCollectionDialogMode joinCollectionDialogMode = JoinCollectionDialogMode.ADD_ONLY;
                boolean z12 = i11 == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z12 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new C4838m4(onIntent, 4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                InterfaceC6471c interfaceC6471c = (InterfaceC6471c) objRememberedValue2;
                boolean z13 = i11 == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z13 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new C4873s3(onIntent, 26);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                InterfaceC6469a interfaceC6469a = (InterfaceC6469a) objRememberedValue3;
                boolean z14 = i11 == 32;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z14 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new C4873s3(onIntent, 27);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                InterfaceC6469a interfaceC6469a2 = (InterfaceC6469a) objRememberedValue4;
                boolean z15 = i11 == 32;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z15 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new C4873s3(onIntent, 28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                AbstractC4954j.m4316d(list, set, z10, z11, joinCollectionDialogMode, interfaceC6471c, interfaceC6469a, interfaceC6469a2, (InterfaceC6469a) objRememberedValue5, composerStartRestartGroup, 24576);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1524977960);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (state.f7520t) {
                composerStartRestartGroup.startReplaceGroup(-1519959804);
                String str = !state.f7516p.isEmpty() ? "创建新错题集" : "还没有创建过任何错题集，先创建一个吧";
                String str2 = state.f7521u;
                String str3 = state.f7522v;
                boolean z16 = state.f7523w;
                boolean z17 = i11 == 32;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z17 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new C4838m4(onIntent, 5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                InterfaceC6471c interfaceC6471c2 = (InterfaceC6471c) objRememberedValue6;
                boolean z18 = i11 == 32;
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (z18 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new C4873s3(onIntent, 29);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                InterfaceC6469a interfaceC6469a3 = (InterfaceC6469a) objRememberedValue7;
                boolean z19 = i11 == 32;
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (z19 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    z8 = false;
                    objRememberedValue8 = new C4947g1(onIntent, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    z8 = false;
                }
                i9 = -1524977960;
                AbstractC4560f.m4019b(str, str2, str3, "创建", "创建中...", z16, 20, null, null, false, interfaceC6471c2, interfaceC6469a3, (InterfaceC6469a) objRememberedValue8, composerStartRestartGroup, 1600512, 0, 896);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                i9 = -1524977960;
                composerStartRestartGroup.startReplaceGroup(-1524977960);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (state.f7525y) {
                composerStartRestartGroup.startReplaceGroup(-1519217602);
                boolean z20 = i11 == 32;
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (z20 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new C4947g1(onIntent, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                i10 = 0;
                AbstractC4954j.m4317e((InterfaceC6469a) objRememberedValue9, composerStartRestartGroup, 0);
            } else {
                i10 = 0;
                composerStartRestartGroup.startReplaceGroup(i9);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4950h1(state, onIntent, i, i10));
        }
    }

    /* renamed from: f */
    public static final void m4309f(C4941e1 c4941e1, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, Composer composer, int i) {
        int i8;
        InterfaceC6471c interfaceC6471c2;
        Set set;
        boolean z8;
        List list;
        AnnotatedString.Builder builder;
        int iPushStyle;
        float f;
        int i9;
        AnnotatedString annotatedString;
        Composer composerStartRestartGroup = composer.startRestartGroup(-912136123);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c4941e1) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-912136123, i8, -1, "com.zykj.mistake.feature.notebook.list.MistakeNotebookTitleBar (MistakeNotebookScreen.kt:387)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2331Dp.m13305constructorimpl(44)), Color.INSTANCE.m10719getWhite0d7_KjU(), null, 2, null), C2331Dp.m13305constructorimpl(18), 0.0f, C2331Dp.m13305constructorimpl(14), 0.0f, 10, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
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
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl2, measurePolicyRowMeasurePolicy2, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            long jColor = ColorKt.Color(4279572250L);
            long sp = TextUnitKt.getSp(18);
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            int i10 = i8;
            TextKt.m9105Text4IGK_g("我的错题", rowScopeInstance.alignByBaseline(companion), jColor, sp, (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131024);
            composerStartRestartGroup = composerStartRestartGroup;
            boolean z9 = c4941e1.f7509i;
            Set set2 = c4941e1.f7510j;
            boolean z10 = c4941e1.f7508h;
            List list2 = c4941e1.f7504d;
            if (z9) {
                composerStartRestartGroup.startReplaceGroup(1917880318);
                AbstractC1923c.m1055s(9, companion, composerStartRestartGroup, 6);
                if (set2.isEmpty()) {
                    AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                    builder2.append("未选择");
                    annotatedString = builder2.toAnnotatedString();
                } else {
                    builder = new AnnotatedString.Builder(0, 1, null);
                    builder.append("已选择 ");
                    iPushStyle = builder.pushStyle(new SpanStyle(ColorKt.Color(4279572250L), 0L, companion4.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC5824e) null));
                    try {
                        builder.append(String.valueOf(set2.size()));
                        builder.pop(iPushStyle);
                        builder.append(" 道");
                        annotatedString = builder.toAnnotatedString();
                    } finally {
                    }
                }
                f = 1.0f;
                z8 = z10;
                set = set2;
                list = list2;
                TextKt.m9106TextIbK3jfQ(annotatedString, rowScopeInstance.alignByBaseline(rowScopeInstance.weight(companion, 1.0f, false)), ColorKt.Color(4284900966L), TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m13241getEllipsisgIe3tQ8(), false, 1, 0, null, null, null, composerStartRestartGroup, 3456, 3120, 251888);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                i9 = 12;
            } else {
                set = set2;
                z8 = z10;
                list = list2;
                if (!list.isEmpty() || z8) {
                    composerStartRestartGroup.startReplaceGroup(1919100292);
                    SpacerKt.Spacer(SizeKt.m7314width3ABfNKs(companion, C2331Dp.m13305constructorimpl(9)), composerStartRestartGroup, 6);
                    builder = new AnnotatedString.Builder(0, 1, null);
                    builder.append("共 ");
                    iPushStyle = builder.pushStyle(new SpanStyle(ColorKt.Color(4279572250L), 0L, companion4.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC5824e) null));
                    try {
                        builder.append(String.valueOf(c4941e1.f7501a));
                        builder.pop(iPushStyle);
                        builder.append(" 道错题，已完全掌握 ");
                        iPushStyle = builder.pushStyle(new SpanStyle(ColorKt.Color(4279572250L), 0L, companion4.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC5824e) null));
                        try {
                            builder.append(String.valueOf(c4941e1.f7502b));
                            builder.pop(iPushStyle);
                            builder.append(" 道");
                            f = 1.0f;
                            i9 = 12;
                            TextKt.m9106TextIbK3jfQ(builder.toAnnotatedString(), rowScopeInstance.alignByBaseline(rowScopeInstance.weight(companion, 1.0f, false)), ColorKt.Color(4284900966L), TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m13241getEllipsisgIe3tQ8(), false, 1, 0, null, null, null, composerStartRestartGroup, 3456, 3120, 251888);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceGroup();
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(1903140469);
                    composerStartRestartGroup.endReplaceGroup();
                    f = 1.0f;
                    i9 = 12;
                }
            }
            composerStartRestartGroup.endNode();
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(i9)), companion2.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl3, measurePolicyRowMeasurePolicy3, composerM10109constructorimpl3, currentCompositionLocalMap3);
            if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
            }
            Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            if (c4941e1.f7509i) {
                composerStartRestartGroup.startReplaceGroup(581236588);
                int i11 = R.drawable.ic_add_mistake_collection;
                boolean z11 = !set.isEmpty();
                int i12 = i10 & 112;
                boolean z12 = i12 == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z12 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    interfaceC6471c2 = interfaceC6471c;
                    objRememberedValue = new C4947g1(interfaceC6471c2, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    interfaceC6471c2 = interfaceC6471c;
                }
                m4305b(i11, "加入错题集", 0.0f, z11, (InterfaceC6469a) objRememberedValue, composerStartRestartGroup, 48, 4);
                int i13 = R.drawable.ic_tag_edit;
                boolean z13 = !set.isEmpty();
                boolean z14 = i12 == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z14 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new C4947g1(interfaceC6471c2, 4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                m4305b(i13, "标签", 0.0f, z13, (InterfaceC6469a) objRememberedValue2, composerStartRestartGroup, 48, 4);
                int i14 = R.drawable.ic_mistake_delete;
                boolean z15 = !set.isEmpty();
                boolean z16 = i12 == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z16 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new C4947g1(interfaceC6471c2, 5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                m4305b(i14, "删除", 0.0f, z15, (InterfaceC6469a) objRememberedValue3, composerStartRestartGroup, 48, 4);
                int i15 = R.drawable.ic_mistake_cancel;
                boolean z17 = i12 == 32;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z17 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new C4947g1(interfaceC6471c2, 6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                m4305b(i15, "取消", 0.0f, false, (InterfaceC6469a) objRememberedValue4, composerStartRestartGroup, 48, 12);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                interfaceC6471c2 = interfaceC6471c;
                composerStartRestartGroup.startReplaceGroup(582372397);
                m4305b(R.drawable.ic_new_mistake, "新增错题", 0.0f, false, interfaceC6469a, composerStartRestartGroup, ((i10 << 6) & 57344) | 48, 12);
                if (!list.isEmpty() || z8) {
                    composerStartRestartGroup.startReplaceGroup(582617018);
                    int i16 = R.drawable.ic_practice_switch;
                    boolean z18 = c4941e1.f7503c;
                    String str = z18 ? "练习: 开" : "练习: 关";
                    float f7 = z18 ? f : 0.5f;
                    int i17 = i10 & 112;
                    boolean z19 = i17 == 32;
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (z19 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new C4873s3(interfaceC6471c2, 22);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    m4305b(i16, str, f7, false, (InterfaceC6469a) objRememberedValue5, composerStartRestartGroup, 0, 8);
                    int i18 = R.drawable.ic_manage_mistake;
                    boolean z20 = i17 == 32;
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (z20 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new C4873s3(interfaceC6471c2, 23);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    m4305b(i18, "管理", 0.0f, false, (InterfaceC6469a) objRememberedValue6, composerStartRestartGroup, 48, 12);
                    int i19 = R.drawable.ic_fliter_mistake;
                    boolean z21 = i17 == 32;
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (z21 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new C4873s3(interfaceC6471c2, 24);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    m4305b(i19, "筛选", 0.0f, false, (InterfaceC6469a) objRememberedValue7, composerStartRestartGroup, 48, 12);
                } else {
                    composerStartRestartGroup.startReplaceGroup(563796670);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (AbstractC0584a.m899D(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            interfaceC6471c2 = interfaceC6471c;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2756g(c4941e1, interfaceC6471c2, interfaceC6469a, i, 15));
        }
    }

    /* renamed from: g */
    public static final void m4310g(String str, Composer composer, int i) {
        int i8;
        int i9;
        int i10;
        Composer composerStartRestartGroup = composer.startRestartGroup(886184532);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(886184532, i8, -1, "com.zykj.mistake.feature.notebook.list.MistakeStemImage (MistakeNotebookScreen.kt:330)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM1042f = AbstractC1923c.m1042f(3, SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f7567b), Color.INSTANCE.m10719getWhite0d7_KjU());
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1042f);
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
            if (AbstractC5855p.m5382P(str)) {
                composerStartRestartGroup.startReplaceGroup(-432023502);
                TextKt.m9105Text4IGK_g("暂无题干", (Modifier) null, ColorKt.Color(4290098613L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                i9 = 3;
            } else {
                i9 = 3;
                composerStartRestartGroup.startReplaceGroup(-431853188);
                AsyncImagePainter asyncImagePainterM2189a = AbstractC3258o.m2189a(str, composerStartRestartGroup, i8 & 14);
                boolean z8 = ((InterfaceC3252i) SnapshotStateKt.collectAsState(asyncImagePainterM2189a.f1834p, null, composerStartRestartGroup, 0, 1).getValue()) instanceof C3249f;
                if (z8) {
                    i10 = -444581912;
                    composerStartRestartGroup.startReplaceGroup(-444581912);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-431622796);
                    Alignment topCenter = companion2.getTopCenter();
                    ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    i10 = -444581912;
                    ImageKt.Image(asyncImagePainterM2189a, (String) null, modifierFillMaxSize$default, topCenter, fillWidth, 0.0f, (ColorFilter) null, composerStartRestartGroup, 28080, 96);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (z8) {
                    composerStartRestartGroup.startReplaceGroup(-431295157);
                    m4311h(composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(i10);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i9 = 3;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4567m(str, i, i9));
        }
    }

    /* renamed from: h */
    public static final void m4311h(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(493870165);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(493870165, i, -1, "com.zykj.mistake.feature.notebook.list.MistakeStemLoadErrorContent (MistakeNotebookScreen.kt:365)");
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
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_answer_load_error, composerStartRestartGroup, 0), "加载失败", SizeKt.m7309size3ABfNKs(companion, C2331Dp.m13305constructorimpl(40)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, MenuKt.InTransitionDuration);
            AbstractC1923c.m1055s(8, companion, composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g("加载失败", (Modifier) null, ColorKt.Color(4288256409L), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3462, 0, 131058);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C4899x(i, 2));
        }
    }

    /* renamed from: i */
    public static final void m4312i(boolean z8, Modifier modifier, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(2064650063);
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
                ComposerKt.traceEventStart(2064650063, i8, -1, "com.zykj.mistake.feature.notebook.list.SelectionIndicator (MistakeNotebookScreen.kt:314)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(z8 ? R.drawable.ic_mistake_selected : R.drawable.ic_mistake_unselected, composerStartRestartGroup, 0), z8 ? "已选择" : "未选择", SizeKt.m7309size3ABfNKs(modifier, C2331Dp.m13305constructorimpl(18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, MenuKt.InTransitionDuration);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4527i0(z8, modifier, i, 2));
        }
    }
}
