package com.zykj.mistake.feature.review;

import android.content.res.Configuration;
import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.AlphaKt;
import androidx.compose.p011ui.draw.ClipKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.navigation.compose.C2840b;
import androidx.navigation.serialization.C2873c;
import androidx.profileinstaller.ProfileVerifier;
import com.zykj.mistake.R;
import com.zykj.mistake.feature.notebook.detail.C4780d0;
import com.zykj.mistake.feature.notebook.detail.C4855p3;
import com.zykj.mistake.feature.notebook.list.C4947g1;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

/* renamed from: com.zykj.mistake.feature.review.y */
/* loaded from: classes3.dex */
public abstract class AbstractC5017y {

    /* renamed from: a */
    public static final float f7767a = C2331Dp.m13305constructorimpl(52);

    /* renamed from: a */
    public static final void m4332a(String str, String str2, String str3, Modifier modifier, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2075511402);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 1171) != 1170, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2075511402, i8, -1, "com.zykj.mistake.feature.review.RecentMetricCell (ReviewScreen.kt:414)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(BackgroundKt.m6754backgroundbw27NRU$default(ClipKt.clip(modifier, RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(4))), Color.m10681copywmQWz5c$default(Color.INSTANCE.m10719getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Alignment.INSTANCE.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(-716372608, true, new C5016x(0, str, str2, str3), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4780d0(str, str2, str3, modifier, i, 2));
        }
    }

    /* renamed from: b */
    public static final void m4333b(final Integer num, int i, final int i8, final int i9, final int i10, final Modifier modifier, Composer composer, final int i11) {
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-241414666);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(num) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 = i;
            i12 |= composerStartRestartGroup.changed(i13) ? 32 : 16;
        } else {
            i13 = i;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(i8) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(i9) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changed(i10) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i12) != 74898, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-241414666, i12, -1, "com.zykj.mistake.feature.review.RecentSevenDaysCard (ReviewScreen.kt:291)");
            }
            float f = 8;
            Modifier modifierBackground$default = BackgroundKt.background$default(ClipKt.clip(SizeKt.fillMaxHeight$default(modifier, 0.0f, 1, null), RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(f))), Brush.Companion.m10639verticalGradient8A3gB4$default(Brush.INSTANCE, AbstractC5806u.m5287z(Color.m10672boximpl(ColorKt.Color(4293453567L)), Color.m10672boximpl(ColorKt.Color(4294638330L))), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default);
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
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.bg_seven_days_decoration, composerStartRestartGroup, 0);
            ContentScale fillBounds = ContentScale.INSTANCE.getFillBounds();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            ImageKt.Image(painterPainterResource, (String) null, AspectRatioKt.aspectRatio$default(SizeKt.fillMaxHeight(boxScopeInstance.align(companion3, companion.getBottomEnd()), 0.8974359f), Float.intBitsToFloat((int) (painterPainterResource.getIntrinsicSize() >> 32)) / Float.intBitsToFloat((int) (painterPainterResource.getIntrinsicSize() & 4294967295L)), false, 2, null), (Alignment) null, fillBounds, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, LocationRequestCompat.QUALITY_LOW_POWER);
            Modifier modifierM7262padding3ABfNKs = PaddingKt.m7262padding3ABfNKs(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), C2331Dp.m13305constructorimpl(18));
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
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
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl2, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            InterfaceC6469a constructor3 = companion2.getConstructor();
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
            InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl3, measurePolicyRowMeasurePolicy, composerM10109constructorimpl3, currentCompositionLocalMap3);
            if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
            }
            Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_recent_7_days, composerStartRestartGroup, 0), (String) null, SizeKt.m7309size3ABfNKs(companion3, C2331Dp.m13305constructorimpl(32)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, MenuKt.InTransitionDuration);
            long jColor = ColorKt.Color(4279572250L);
            long sp = TextUnitKt.getSp(18);
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            TextKt.m9105Text4IGK_g("近七天数据表现", PaddingKt.m7266paddingqDBjuR0$default(companion3, C2331Dp.m13305constructorimpl(14), 0.0f, 0.0f, 0.0f, 14, null), jColor, sp, (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composerStartRestartGroup, 200118, 0, 131024);
            composerStartRestartGroup.endNode();
            int iIntValue = num != null ? num.intValue() : 0;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append("最近添加错题 ");
            int iPushStyle = builder.pushStyle(new SpanStyle(ColorKt.Color(4279572250L), 0L, companion4.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC5824e) null));
            try {
                builder.append(String.valueOf(iIntValue));
                builder.pop(iPushStyle);
                builder.append(" 道");
                TextKt.m9106TextIbK3jfQ(builder.toAnnotatedString(), AlphaKt.alpha(PaddingKt.m7266paddingqDBjuR0$default(companion3, C2331Dp.m13305constructorimpl(46), 0.0f, 0.0f, 0.0f, 14, null), iIntValue > 0 ? 1.0f : 0.0f), ColorKt.Color(4284900966L), TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 3456, 0, 262128);
                composerStartRestartGroup = composerStartRestartGroup;
                float f7 = 10;
                SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion3, C2331Dp.m13305constructorimpl(f7)), composerStartRestartGroup, 6);
                Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, companion3, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f7)), companion.getStart(), composerStartRestartGroup, 6);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                InterfaceC6469a constructor4 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10109constructorimpl4 = Updater.m10109constructorimpl(composerStartRestartGroup);
                InterfaceC6473e interfaceC6473eM917r4 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM10109constructorimpl4, currentCompositionLocalMap4);
                if (composerM10109constructorimpl4.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash4, composerM10109constructorimpl4, currentCompositeKeyHash4, interfaceC6473eM917r4);
                }
                Updater.m10116setimpl(composerM10109constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                Modifier modifierWeight$default2 = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f)), companion.getTop(), composerStartRestartGroup, 6);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                InterfaceC6469a constructor5 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10109constructorimpl5 = Updater.m10109constructorimpl(composerStartRestartGroup);
                InterfaceC6473e interfaceC6473eM917r5 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl5, measurePolicyRowMeasurePolicy2, composerM10109constructorimpl5, currentCompositionLocalMap5);
                if (composerM10109constructorimpl5.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash5, composerM10109constructorimpl5, currentCompositeKeyHash5, interfaceC6473eM917r5);
                }
                Updater.m10116setimpl(composerM10109constructorimpl5, modifierMaterializeModifier5, companion2.getSetModifier());
                m4332a("练习题数", String.valueOf(i13), "题", SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), 0.0f, 1, null), composerStartRestartGroup, 390);
                m4332a("练习天数", String.valueOf(i8), "天", SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), 0.0f, 1, null), composerStartRestartGroup, 390);
                composerStartRestartGroup.endNode();
                Modifier modifierWeight$default3 = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f)), companion.getTop(), composerStartRestartGroup, 6);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default3);
                InterfaceC6469a constructor6 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor6);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10109constructorimpl6 = Updater.m10109constructorimpl(composerStartRestartGroup);
                InterfaceC6473e interfaceC6473eM917r6 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl6, measurePolicyRowMeasurePolicy3, composerM10109constructorimpl6, currentCompositionLocalMap6);
                if (composerM10109constructorimpl6.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash6, composerM10109constructorimpl6, currentCompositeKeyHash6, interfaceC6473eM917r6);
                }
                Updater.m10116setimpl(composerM10109constructorimpl6, modifierMaterializeModifier6, companion2.getSetModifier());
                m4332a("进入巩固", String.valueOf(i9), "题", SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), 0.0f, 1, null), composerStartRestartGroup, 390);
                m4332a("进入掌握", String.valueOf(i10), "题", SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), 0.0f, 1, null), composerStartRestartGroup, 390);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i14 = i13;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: com.zykj.mistake.feature.review.u
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC5017y.m4333b(num, i14, i8, i9, i10, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                    return C5443s.f8405a;
                }
            });
        }
    }

    /* renamed from: c */
    public static final void m4334c(String str, boolean z8, InterfaceC6469a interfaceC6469a, Modifier modifier, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-657633327);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 1155) != 1154, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-657633327, i8, -1, "com.zykj.mistake.feature.review.RecommendedExercisesCard (ReviewScreen.kt:219)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(BackgroundKt.m6754backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxHeight$default(modifier, 0.0f, 1, null), RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(8))), ColorKt.Color(4292668415L), null, 2, null), null, false, ComposableLambdaKt.rememberComposableLambda(-1395289925, true, new C2873c(3, interfaceC6469a, str), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4855p3(str, z8, interfaceC6469a, modifier, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4335d(final java.lang.String r35, final long r36, final long r38, final androidx.compose.p011ui.Modifier r40, final p152r6.InterfaceC6469a r41, boolean r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.review.AbstractC5017y.m4335d(java.lang.String, long, long, androidx.compose.ui.Modifier, r6.a, boolean, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/review/y.smali:3971
    }

    /* renamed from: e */
    public static final void m4336e(final String str, final String str2, final String str3, final int i, final int i8, final long j7, final long j8, final boolean z8, final String str4, final long j9, final long j10, final Modifier modifier, final float f, boolean z9, final InterfaceC6469a interfaceC6469a, Composer composer, final int i9, final int i10, final int i11) {
        int i12;
        String str5;
        int i13;
        int i14;
        final boolean z10;
        Composer composerStartRestartGroup = composer.startRestartGroup(29277689);
        if ((i9 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i9;
        } else {
            i12 = i9;
        }
        if ((i9 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            str5 = str3;
            i12 |= composerStartRestartGroup.changed(str5) ? 256 : 128;
        } else {
            str5 = str3;
        }
        if ((i9 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i9 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changed(i8) ? 16384 : 8192;
        }
        int i15 = i12;
        if ((i9 & ProfileVerifier.CompilationStatus.f1352xf2722a21) == 0) {
            i15 |= composerStartRestartGroup.changed(j7) ? 131072 : 65536;
        }
        if ((i9 & 1572864) == 0) {
            i15 |= composerStartRestartGroup.changed(j8) ? 1048576 : 524288;
        }
        if ((i9 & 100663296) == 0) {
            i15 |= composerStartRestartGroup.changed(str4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i9 & 805306368) == 0) {
            i15 |= composerStartRestartGroup.changed(j9) ? 536870912 : 268435456;
        }
        int i16 = i15;
        if ((i10 & 6) == 0) {
            i13 = i10 | (composerStartRestartGroup.changed(j10) ? 4 : 2);
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i13 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        int i17 = i13;
        int i18 = i11 & 8192;
        if (i18 != 0) {
            i14 = i17 | 3072;
        } else if ((i10 & 3072) == 0) {
            i14 = i17 | (composerStartRestartGroup.changed(z9) ? 2048 : 1024);
        } else {
            i14 = i17;
        }
        if ((i10 & 24576) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 16384 : 8192;
        }
        int i19 = i14;
        if (composerStartRestartGroup.shouldExecute(((i16 & 302589075) == 302589074 && (i19 & 9363) == 9362) ? false : true, i16 & 1)) {
            z10 = i18 != 0 ? false : z9;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(29277689, i16, i19, "com.zykj.mistake.feature.review.ReviewPracticeCard (ReviewScreen.kt:473)");
            }
            final String str6 = str5;
            BoxWithConstraintsKt.BoxWithConstraints(BackgroundKt.m6754backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxHeight$default(modifier, 0.0f, 1, null), RoundedCornerShapeKt.m7559RoundedCornerShape0680j_4(C2331Dp.m13305constructorimpl(8))), j7, null, 2, null), null, false, ComposableLambdaKt.rememberComposableLambda(1202750799, true, new InterfaceC6474f() { // from class: com.zykj.mistake.feature.review.v
                @Override // p152r6.InterfaceC6474f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    AbstractC5830k.m5330g(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.changed(BoxWithConstraints) ? 4 : 2;
                    }
                    if (composer2.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1202750799, iIntValue, -1, "com.zykj.mistake.feature.review.ReviewPracticeCard.<anonymous> (ReviewScreen.kt:480)");
                        }
                        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(BoxWithConstraints.mo7168getMaxHeightD9Ej5fM() * f);
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(i8, composer2, 0);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (painterPainterResource.getIntrinsicSize() >> 32)) / Float.intBitsToFloat((int) (painterPainterResource.getIntrinsicSize() & 4294967295L));
                        Float fValueOf = Float.valueOf(fIntBitsToFloat);
                        if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE || fIntBitsToFloat <= 0.0f) {
                            fValueOf = null;
                        }
                        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
                        ContentScale fillBounds = ContentScale.INSTANCE.getFillBounds();
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        float f7 = 10;
                        ImageKt.Image(painterPainterResource, (String) null, SizeKt.m7314width3ABfNKs(SizeKt.m7295height3ABfNKs(PaddingKt.m7266paddingqDBjuR0$default(BoxWithConstraints.align(companion, companion2.getBottomEnd()), 0.0f, 0.0f, C2331Dp.m13305constructorimpl(f7), 0.0f, 11, null), fM13305constructorimpl), C2331Dp.m13305constructorimpl(fM13305constructorimpl * fFloatValue)), (Alignment) null, fillBounds, 0.0f, (ColorFilter) null, composer2, 24624, LocationRequestCompat.QUALITY_LOW_POWER);
                        float f8 = 18;
                        Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(BoxWithConstraints.align(companion, companion2.getTopStart()), C2331Dp.m13305constructorimpl(f8), C2331Dp.m13305constructorimpl(f8), C2331Dp.m13305constructorimpl(f8), 0.0f, 8, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM7266paddingqDBjuR0$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        InterfaceC6469a constructor = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer2);
                        InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion3, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                        if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer2, 48);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
                        InterfaceC6469a constructor2 = companion3.getConstructor();
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
                        InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl2, measurePolicyRowMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
                        if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i, composer2, 0), (String) null, SizeKt.m7309size3ABfNKs(companion, C2331Dp.m13305constructorimpl(32)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, MenuKt.InTransitionDuration);
                        long jColor = ColorKt.Color(4279572250L);
                        long sp = TextUnitKt.getSp(18);
                        FontWeight.Companion companion4 = FontWeight.INSTANCE;
                        TextKt.m9105Text4IGK_g(str, PaddingKt.m7266paddingqDBjuR0$default(companion, C2331Dp.m13305constructorimpl(14), 0.0f, 0.0f, 0.0f, 14, null), jColor, sp, (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 200112, 0, 131024);
                        TextKt.m9105Text4IGK_g("|", PaddingKt.m7266paddingqDBjuR0$default(companion, C2331Dp.m13305constructorimpl(f7), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4288256409L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3510, 0, 131056);
                        TextKt.m9105Text4IGK_g(str2, PaddingKt.m7266paddingqDBjuR0$default(companion, C2331Dp.m13305constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), j8, TextUnitKt.getSp(12), (FontStyle) null, companion4.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 199728, 0, 131024);
                        composer2.endNode();
                        TextKt.m9105Text4IGK_g(str6, SizeKt.fillMaxWidth(PaddingKt.m7266paddingqDBjuR0$default(companion, C2331Dp.m13305constructorimpl(46), C2331Dp.m13305constructorimpl(3), 0.0f, 0.0f, 12, null), 0.95f), ColorKt.Color(4284900966L), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(16), 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3504, 6, 130032);
                        composer2.endNode();
                        AbstractC5017y.m4335d(str4, j9, j10, PaddingKt.m7266paddingqDBjuR0$default(BoxWithConstraints.align(companion, companion2.getBottomStart()), C2331Dp.m13305constructorimpl(f8), 0.0f, 0.0f, C2331Dp.m13305constructorimpl(22), 6, null), interfaceC6469a, z10, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return C5443s.f8405a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z10 = z9;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: com.zykj.mistake.feature.review.w
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i9 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i10);
                    AbstractC5017y.m4336e(str, str2, str3, i, i8, j7, j8, z8, str4, j9, j10, modifier, f, z10, interfaceC6469a, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i11);
                    return C5443s.f8405a;
                }
            });
        }
    }

    /* renamed from: f */
    public static final void m4337f(final C5001i c5001i, final InterfaceC6471c interfaceC6471c, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(457869273);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(c5001i) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(457869273, i8, -1, "com.zykj.mistake.feature.review.ReviewScreen (ReviewScreen.kt:90)");
            }
            float fM13305constructorimpl = C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp) - WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, composerStartRestartGroup, 6), composerStartRestartGroup, 0).getTop()) - f7767a);
            final float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(240.0f * fM13305constructorimpl) / 644.0f);
            final float fM13305constructorimpl3 = C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(fM13305constructorimpl * 200.0f) / 644.0f);
            int i9 = i8;
            boolean z8 = c5001i.f7668v;
            boolean z9 = (i9 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4947g1(interfaceC6471c, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PullToRefreshKt.PullToRefreshBox(z8, (InterfaceC6469a) objRememberedValue, BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m10719getWhite0d7_KjU(), null, 2, null), null, null, null, ComposableLambdaKt.rememberComposableLambda(-1309288769, true, new InterfaceC6474f() { // from class: com.zykj.mistake.feature.review.t
                @Override // p152r6.InterfaceC6474f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnnotatedString annotatedString;
                    C5001i c5001i2 = c5001i;
                    String str = c5001i2.f7647a;
                    BoxScope PullToRefreshBox = (BoxScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    AbstractC5830k.m5330g(PullToRefreshBox, "$this$PullToRefreshBox");
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1309288769, iIntValue, -1, "com.zykj.mistake.feature.review.ReviewScreen.<anonymous> (ReviewScreen.kt:104)");
                        }
                        float f = 32;
                        Modifier modifierM7263paddingVpY3zN4 = PaddingKt.m7263paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null), C2331Dp.m13305constructorimpl(f), C2331Dp.m13305constructorimpl(26));
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM7263paddingVpY3zN4);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        InterfaceC6469a constructor = companion.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer2);
                        InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                        if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        int i10 = c5001i2.f7659m;
                        int i11 = c5001i2.f7656j;
                        int i12 = c5001i2.f7653g;
                        TextKt.m9105Text4IGK_g(AbstractC5855p.m5382P(str) ? "早上好，同学！" : AbstractC0037f.m86k("早上好，", str, "同学！"), (Modifier) null, ColorKt.Color(4279572250L), TextUnitKt.getSp(21), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 200064, 0, 131026);
                        String str2 = c5001i2.f7648b;
                        if (AbstractC5855p.m5373G(str2, '*')) {
                            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                            int i13 = 0;
                            while (true) {
                                if (i13 >= str2.length()) {
                                    break;
                                }
                                int iM5379M = AbstractC5855p.m5379M(str2, '*', i13, 4);
                                if (iM5379M == -1) {
                                    String strSubstring = str2.substring(i13);
                                    AbstractC5830k.m5329f(strSubstring, "substring(...)");
                                    builder.append(strSubstring);
                                    break;
                                }
                                int i14 = iM5379M + 1;
                                int iM5379M2 = AbstractC5855p.m5379M(str2, '*', i14, 4);
                                if (iM5379M2 == -1) {
                                    String strSubstring2 = str2.substring(i13);
                                    AbstractC5830k.m5329f(strSubstring2, "substring(...)");
                                    builder.append(strSubstring2);
                                    break;
                                }
                                String strSubstring3 = str2.substring(i13, iM5379M);
                                AbstractC5830k.m5329f(strSubstring3, "substring(...)");
                                builder.append(strSubstring3);
                                int iPushStyle = builder.pushStyle(new SpanStyle(ColorKt.Color(4279596799L), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (AbstractC5824e) null));
                                try {
                                    String strSubstring4 = str2.substring(i14, iM5379M2);
                                    AbstractC5830k.m5329f(strSubstring4, "substring(...)");
                                    builder.append(strSubstring4);
                                    builder.pop(iPushStyle);
                                    i13 = iM5379M2 + 1;
                                } catch (Throwable th) {
                                    builder.pop(iPushStyle);
                                    throw th;
                                }
                            }
                            annotatedString = builder.toAnnotatedString();
                        } else {
                            annotatedString = new AnnotatedString(str2, null, 2, null);
                        }
                        AnnotatedString annotatedString2 = annotatedString;
                        long jColor = ColorKt.Color(4279572250L);
                        long sp = TextUnitKt.getSp(15);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        TextKt.m9106TextIbK3jfQ(annotatedString2, PaddingKt.m7266paddingqDBjuR0$default(companion2, 0.0f, C2331Dp.m13305constructorimpl(8), 0.0f, 0.0f, 13, null), jColor, sp, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 3504, 0, 262128);
                        SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion2, C2331Dp.m13305constructorimpl(f)), composer2, 6);
                        Modifier modifierM7295height3ABfNKs = SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), fM13305constructorimpl2);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        float f7 = 12;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM7143spacedBy0680j_4 = arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f7));
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM7143spacedBy0680j_4, companion3.getTop(), composer2, 6);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM7295height3ABfNKs);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        InterfaceC6469a constructor2 = companion4.getConstructor();
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
                        InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion4, composerM10109constructorimpl2, measurePolicyRowMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
                        if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        String str3 = c5001i2.f7649c;
                        boolean z10 = c5001i2.f7651e && c5001i2.f7650d > 0;
                        InterfaceC6471c interfaceC6471c2 = interfaceC6471c;
                        boolean zChanged = composer2.changed(interfaceC6471c2);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new C4947g1(interfaceC6471c2, 7);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        AbstractC5017y.m4334c(str3, z10, (InterfaceC6469a) objRememberedValue2, RowScope.weight$default(rowScopeInstance, companion2, 1.42f, false, 2, null), composer2, 0);
                        AbstractC5017y.m4333b(c5001i2.f7661o, c5001i2.f7662p, c5001i2.f7663q, c5001i2.f7664r, c5001i2.f7665s, RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null), composer2, 0);
                        composer2.endNode();
                        SpacerKt.Spacer(SizeKt.m7295height3ABfNKs(companion2, C2331Dp.m13305constructorimpl(f7)), composer2, 6);
                        Modifier modifierM7295height3ABfNKs2 = SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), fM13305constructorimpl3);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(f7)), companion3.getTop(), composer2, 6);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM7295height3ABfNKs2);
                        InterfaceC6469a constructor3 = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM10109constructorimpl3 = Updater.m10109constructorimpl(composer2);
                        InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion4, composerM10109constructorimpl3, measurePolicyRowMeasurePolicy2, composerM10109constructorimpl3, currentCompositionLocalMap3);
                        if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                        String str4 = i12 + "道";
                        boolean z11 = false;
                        String str5 = c5001i2.f7652f;
                        int i15 = R.drawable.ic_to_be_strengthened;
                        int i16 = R.drawable.bg_to_be_strengthened;
                        long jColor2 = ColorKt.Color(4294960099L);
                        long jColor3 = ColorKt.Color(4294921551L);
                        boolean z12 = c5001i2.f7654h && i12 > 0;
                        long jColor4 = ColorKt.Color(4294921551L);
                        Color.Companion companion5 = Color.INSTANCE;
                        long jM10719getWhite0d7_KjU = companion5.m10719getWhite0d7_KjU();
                        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion2, 1.18f, false, 2, null);
                        boolean zChanged2 = composer2.changed(interfaceC6471c2);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new C4947g1(interfaceC6471c2, 9);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        AbstractC5017y.m4336e("待加强", str4, str5, i15, i16, jColor2, jColor3, z12, "去练习", jColor4, jM10719getWhite0d7_KjU, modifierWeight$default, 0.6683938f, false, (InterfaceC6469a) objRememberedValue3, composer2, 907739142, 390, 8192);
                        String str6 = i11 + "道";
                        String str7 = c5001i2.f7655i;
                        int i17 = R.drawable.ic_consolidating;
                        int i18 = R.drawable.bg_consolidating;
                        long jColor5 = ColorKt.Color(4294963160L);
                        long jColor6 = ColorKt.Color(4294933018L);
                        boolean z13 = c5001i2.f7657k && i11 > 0;
                        long jColor7 = ColorKt.Color(4294932992L);
                        long jM10719getWhite0d7_KjU2 = companion5.m10719getWhite0d7_KjU();
                        Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, companion2, 1.18f, false, 2, null);
                        boolean zChanged3 = composer2.changed(interfaceC6471c2);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new C4947g1(interfaceC6471c2, 10);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        AbstractC5017y.m4336e("巩固中", str6, str7, i17, i18, jColor5, jColor6, z13, "去练习", jColor7, jM10719getWhite0d7_KjU2, modifierWeight$default2, 0.6683938f, false, (InterfaceC6469a) objRememberedValue4, composer2, 907739142, 390, 8192);
                        String str8 = i10 + "道";
                        String str9 = c5001i2.f7658l;
                        int i19 = R.drawable.ic_mastered;
                        int i20 = R.drawable.bg_mastered;
                        long jColor8 = ColorKt.Color(4293523697L);
                        long jColor9 = ColorKt.Color(4280338839L);
                        if (c5001i2.f7660n && i10 > 0) {
                            z11 = true;
                        }
                        long jColor10 = ColorKt.Color(4293523697L);
                        long jColor11 = ColorKt.Color(4280338839L);
                        Modifier modifierWeight$default3 = RowScope.weight$default(rowScopeInstance, companion2, 0.9f, false, 2, null);
                        boolean zChanged4 = composer2.changed(interfaceC6471c2);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new C4947g1(interfaceC6471c2, 11);
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        AbstractC5017y.m4336e("已掌握", str8, str9, i19, i20, jColor8, jColor9, z11, "去抽查", jColor10, jColor11, modifierWeight$default3, 0.51295334f, true, (InterfaceC6469a) objRememberedValue5, composer2, 907739142, 3462, 0);
                        if (AbstractC0584a.m899D(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return C5443s.f8405a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573248, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2840b(i, 15, c5001i, interfaceC6471c));
        }
    }
}
