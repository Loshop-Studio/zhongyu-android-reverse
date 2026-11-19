package com.zykj.mistake.feature.collection.filter;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.collection.filter.t0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4678t0 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6710a = 1;

    /* renamed from: b */
    public final /* synthetic */ int f6711b;

    /* renamed from: c */
    public final /* synthetic */ int f6712c;

    /* renamed from: d */
    public final /* synthetic */ MistakeCollectionFilterResultContract$SourceType f6713d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC6469a f6714e;

    /* renamed from: f */
    public final /* synthetic */ int f6715f;

    public /* synthetic */ C4678t0(int i, int i8, MistakeCollectionFilterResultContract$SourceType mistakeCollectionFilterResultContract$SourceType, InterfaceC6469a interfaceC6469a, int i9) {
        this.f6711b = i;
        this.f6712c = i8;
        this.f6713d = mistakeCollectionFilterResultContract$SourceType;
        this.f6714e = interfaceC6469a;
        this.f6715f = i9;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int iPushStyle;
        int i = this.f6710a;
        C5443s c5443s = C5443s.f8405a;
        int i8 = this.f6715f;
        switch (i) {
            case 0:
                int i9 = this.f6712c;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1243919772, iIntValue, -1, "com.zykj.mistake.feature.collection.filter.FilterResultOverLimitDialog.<anonymous> (MistakeCollectionFilterResultScreen.kt:427)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM7314width3ABfNKs = SizeKt.m7314width3ABfNKs(companion, C2331Dp.m13305constructorimpl(430));
                    Color.Companion companion2 = Color.INSTANCE;
                    float f = 4;
                    Modifier modifierM7263paddingVpY3zN4 = PaddingKt.m7263paddingVpY3zN4(AbstractC1923c.m1042f(f, modifierM7314width3ABfNKs, companion2.m10719getWhite0d7_KjU()), C2331Dp.m13305constructorimpl(44), C2331Dp.m13305constructorimpl(30));
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getCenterHorizontally(), composer, 48);
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
                    long jColor = ColorKt.Color(4279572250L);
                    long sp = TextUnitKt.getSp(18);
                    FontWeight.Companion companion5 = FontWeight.INSTANCE;
                    TextKt.m9105Text4IGK_g("超出提示", (Modifier) null, jColor, sp, (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer, 200070, 0, 131026);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    int i10 = AbstractC4686x0.f6730a[this.f6713d.ordinal()];
                    int i11 = this.f6711b;
                    if (i10 == 1) {
                        builder.append("单错题集最多添加 ");
                        iPushStyle = builder.pushStyle(new SpanStyle(ColorKt.Color(4294916912L), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (AbstractC5824e) null));
                        try {
                            builder.append(String.valueOf(i11));
                            builder.pop(iPushStyle);
                            builder.append(" 道错题，可缩小筛选范围或分批创建");
                        } finally {
                        }
                    } else {
                        if (i10 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        builder.append("单错题集最多包含 ");
                        iPushStyle = builder.pushStyle(new SpanStyle(ColorKt.Color(4294916912L), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (AbstractC5824e) null));
                        try {
                            builder.append(String.valueOf(i11));
                            builder.pop(iPushStyle);
                            builder.append(" 道错题，目前已有 ");
                            iPushStyle = builder.pushStyle(new SpanStyle(ColorKt.Color(4279572250L), 0L, companion5.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC5824e) null));
                            try {
                                builder.append(String.valueOf(i9));
                                builder.pop(iPushStyle);
                                builder.append(" 道错题，最多还可添加 ");
                                iPushStyle = builder.pushStyle(new SpanStyle(ColorKt.Color(4279572250L), 0L, companion5.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC5824e) null));
                                try {
                                    builder.append(String.valueOf(i8));
                                    builder.pop(iPushStyle);
                                    builder.append(" 道错题");
                                } finally {
                                }
                            } finally {
                            }
                        } finally {
                        }
                    }
                    TextKt.m9106TextIbK3jfQ(builder.toAnnotatedString(), PaddingKt.m7266paddingqDBjuR0$default(companion, 0.0f, C2331Dp.m13305constructorimpl(24), 0.0f, 0.0f, 13, null), ColorKt.Color(4284900966L), TextUnitKt.getSp(14), null, null, null, 0L, null, TextAlign.m13182boximpl(TextAlign.INSTANCE.m13189getCentere0LSkKk()), TextUnitKt.getSp(20), 0, false, 0, 0, null, null, null, composer, 3504, 6, 260592);
                    SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion, C2331Dp.m13305constructorimpl(28)), composer, 6);
                    Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(AbstractC1923c.m1042f(f, SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2331Dp.m13305constructorimpl(46)), ColorKt.Color(4279596799L)), false, null, null, this.f6714e, 7, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM6790clickableXHw0xAI$default);
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
                    InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion4, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
                    if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    TextKt.m9105Text4IGK_g("确认", (Modifier) null, companion2.m10719getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer, 3462, 0, 131058);
                    if (AbstractC0584a.m899D(composer)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return c5443s;
            default:
                ((Integer) obj2).intValue();
                AbstractC4688y0.m4086d(this.f6711b, this.f6712c, this.f6713d, this.f6714e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                return c5443s;
        }
    }

    public /* synthetic */ C4678t0(InterfaceC6469a interfaceC6469a, MistakeCollectionFilterResultContract$SourceType mistakeCollectionFilterResultContract$SourceType, int i, int i8, int i9) {
        this.f6714e = interfaceC6469a;
        this.f6713d = mistakeCollectionFilterResultContract$SourceType;
        this.f6711b = i;
        this.f6712c = i8;
        this.f6715f = i9;
    }
}
