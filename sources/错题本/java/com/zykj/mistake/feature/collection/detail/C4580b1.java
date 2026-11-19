package com.zykj.mistake.feature.collection.detail;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.AlphaKt;
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
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.core.location.LocationRequestCompat;
import com.zykj.mistake.R;
import com.zykj.mistake.feature.notebook.detail.AbstractC4875t;
import com.zykj.mistake.feature.notebook.list.AbstractC4936d;
import com.zykj.mistake.feature.notebook.list.AbstractC4954j;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p137p4.C6383b;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.collection.detail.b1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4580b1 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6449a = 1;

    /* renamed from: b */
    public final /* synthetic */ boolean f6450b;

    /* renamed from: c */
    public final /* synthetic */ Object f6451c;

    /* renamed from: d */
    public final /* synthetic */ int f6452d;

    /* renamed from: e */
    public final /* synthetic */ Object f6453e;

    public /* synthetic */ C4580b1(int i, String str, InterfaceC6469a interfaceC6469a, boolean z8) {
        this.f6453e = str;
        this.f6450b = z8;
        this.f6451c = interfaceC6469a;
        this.f6452d = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6449a;
        C5443s c5443s = C5443s.f8405a;
        int i8 = this.f6452d;
        Object obj3 = this.f6453e;
        Object obj4 = this.f6451c;
        boolean z8 = this.f6450b;
        switch (i) {
            case 0:
                InterfaceC6469a interfaceC6469a = (InterfaceC6469a) obj4;
                InterfaceC6469a interfaceC6469a2 = (InterfaceC6469a) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1571779271, iIntValue, -1, "com.zykj.mistake.feature.collection.detail.RemoveMistakeConfirmDialog.<anonymous> (MistakeCollectionDetailScreen.kt:330)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM7314width3ABfNKs = SizeKt.m7314width3ABfNKs(companion, C2331Dp.m13305constructorimpl(430));
                    Color.Companion companion2 = Color.INSTANCE;
                    float f = 4;
                    Modifier modifierM7263paddingVpY3zN4 = PaddingKt.m7263paddingVpY3zN4(AbstractC1923c.m1042f(f, modifierM7314width3ABfNKs, companion2.m10719getWhite0d7_KjU()), C2331Dp.m13305constructorimpl(44), C2331Dp.m13305constructorimpl(30));
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM7263paddingVpY3zN4);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    InterfaceC6469a constructor = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer);
                    InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion4, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                    if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer, 48);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
                    InterfaceC6469a constructor2 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composer);
                    InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion4, composerM10109constructorimpl2, measurePolicyRowMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
                    if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.ic_warning, composer, 0), (String) null, SizeKt.m7309size3ABfNKs(companion, C2331Dp.m13305constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, MenuKt.InTransitionDuration);
                    TextKt.m9105Text4IGK_g("移除错题", PaddingKt.m7266paddingqDBjuR0$default(companion, C2331Dp.m13305constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4279572250L), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer, 200118, 0, 131024);
                    composer.endNode();
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    builder.append("即将删除选中的 ");
                    int iPushStyle = builder.pushStyle(new SpanStyle(ColorKt.Color(4294925918L), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (AbstractC5824e) null));
                    try {
                        builder.append(String.valueOf(i8));
                        builder.pop(iPushStyle);
                        builder.append(" 道错题，删除后仅从本错题集移除，不会删除对应科目内的错题本体");
                        TextKt.m9106TextIbK3jfQ(builder.toAnnotatedString(), PaddingKt.m7266paddingqDBjuR0$default(companion, 0.0f, C2331Dp.m13305constructorimpl(22), 0.0f, 0.0f, 13, null), ColorKt.Color(4284900966L), TextUnitKt.getSp(12), null, null, null, 0L, null, TextAlign.m13182boximpl(TextAlign.INSTANCE.m13189getCentere0LSkKk()), TextUnitKt.getSp(18), 0, false, 0, 0, null, null, null, composer, 3504, 6, 260592);
                        Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(companion, 0.0f, C2331Dp.m13305constructorimpl(34), 0.0f, 0.0f, 13, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion3.getTop(), composer, 6);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM7266paddingqDBjuR0$default);
                        InterfaceC6469a constructor3 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor3);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM10109constructorimpl3 = Updater.m10109constructorimpl(composer);
                        InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion4, composerM10109constructorimpl3, measurePolicyRowMeasurePolicy2, composerM10109constructorimpl3, currentCompositionLocalMap3);
                        if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                        float f7 = LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY;
                        float f8 = 42;
                        Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(AbstractC1923c.m1042f(f, SizeKt.m7295height3ABfNKs(SizeKt.m7314width3ABfNKs(companion, C2331Dp.m13305constructorimpl(f7)), C2331Dp.m13305constructorimpl(f8)), ColorKt.Color(4293456383L)), false, null, null, interfaceC6469a, 7, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM6790clickableXHw0xAI$default);
                        InterfaceC6469a constructor4 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor4);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM10109constructorimpl4 = Updater.m10109constructorimpl(composer);
                        InterfaceC6473e interfaceC6473eM917r4 = AbstractC0584a.m917r(companion4, composerM10109constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl4, currentCompositionLocalMap4);
                        if (composerM10109constructorimpl4.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash4, composerM10109constructorimpl4, currentCompositeKeyHash4, interfaceC6473eM917r4);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        TextKt.m9105Text4IGK_g("取消", (Modifier) null, ColorKt.Color(4279596799L), TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer, 3462, 0, 131058);
                        composer.endNode();
                        SpacerKt.Spacer(SizeKt.m7314width3ABfNKs(companion, C2331Dp.m13305constructorimpl(f8)), composer, 6);
                        Modifier modifierM6790clickableXHw0xAI$default2 = ClickableKt.m6790clickableXHw0xAI$default(AbstractC1923c.m1042f(f, AlphaKt.alpha(SizeKt.m7295height3ABfNKs(SizeKt.m7314width3ABfNKs(companion, C2331Dp.m13305constructorimpl(f7)), C2331Dp.m13305constructorimpl(f8)), z8 ? 0.65f : 1.0f), ColorKt.Color(4279596799L)), !z8, null, null, interfaceC6469a2, 6, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM6790clickableXHw0xAI$default2);
                        InterfaceC6469a constructor5 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor5);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM10109constructorimpl5 = Updater.m10109constructorimpl(composer);
                        InterfaceC6473e interfaceC6473eM917r5 = AbstractC0584a.m917r(companion4, composerM10109constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM10109constructorimpl5, currentCompositionLocalMap5);
                        if (composerM10109constructorimpl5.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash5, composerM10109constructorimpl5, currentCompositeKeyHash5, interfaceC6473eM917r5);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl5, modifierMaterializeModifier5, companion4.getSetModifier());
                        TextKt.m9105Text4IGK_g(z8 ? "删除中..." : "确认", (Modifier) null, companion2.m10719getWhite0d7_KjU(), TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer, 3456, 0, 131058);
                        composer.endNode();
                        composer.endNode();
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } catch (Throwable th) {
                        builder.pop(iPushStyle);
                        throw th;
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return c5443s;
            case 1:
                ((Integer) obj2).intValue();
                AbstractC4875t.m4253i((String) obj3, z8, (InterfaceC6469a) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i8));
                return c5443s;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC4936d.m4300a((C6383b) obj4, z8, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i8));
                return c5443s;
            default:
                ((Integer) obj2).getClass();
                AbstractC4954j.m4313a((Modifier) obj3, (InterfaceC6469a) obj4, z8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i8));
                return c5443s;
        }
    }

    public /* synthetic */ C4580b1(int i, boolean z8, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2) {
        this.f6452d = i;
        this.f6451c = interfaceC6469a;
        this.f6450b = z8;
        this.f6453e = interfaceC6469a2;
    }

    public /* synthetic */ C4580b1(Modifier modifier, InterfaceC6469a interfaceC6469a, boolean z8, int i) {
        this.f6450b = z8;
        this.f6451c = interfaceC6469a;
        this.f6453e = modifier;
        this.f6452d = i;
    }

    public /* synthetic */ C4580b1(C6383b c6383b, boolean z8, Modifier modifier, int i) {
        this.f6451c = c6383b;
        this.f6450b = z8;
        this.f6453e = modifier;
        this.f6452d = i;
    }
}
