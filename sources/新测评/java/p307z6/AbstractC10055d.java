package p307z6;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.ClipKt;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.text.PlatformTextStyle;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p101g7.AbstractC7593i;
import p189o5.AbstractC8709e;

/* renamed from: z6.d */
/* loaded from: classes4.dex */
public abstract class AbstractC10055d {
    /* renamed from: d */
    public static final void m16910d(final String title, final String content, final String leftButtonString, final String rightButtonString, final Function0 onClickLeftButton, final Function0 onClickRightButton, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(leftButtonString, "leftButtonString");
        Intrinsics.checkNotNullParameter(rightButtonString, "rightButtonString");
        Intrinsics.checkNotNullParameter(onClickLeftButton, "onClickLeftButton");
        Intrinsics.checkNotNullParameter(onClickRightButton, "onClickRightButton");
        Composer composerStartRestartGroup = composer.startRestartGroup(112821882);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(leftButtonString) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(rightButtonString) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClickLeftButton) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClickRightButton) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i11) != 74898, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(112821882, i11, -1, "com.zykj.evaluation.ui.sheet.preview.dialog.CommonFailedPage (CommonFailedPage.kt:38)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: z6.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC10055d.m16911e();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(526435395, true, new Function2() { // from class: z6.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10055d.m16912f(title, content, onClickLeftButton, onClickRightButton, leftButtonString, rightButtonString, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z6.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10055d.m16913g(title, content, leftButtonString, rightButtonString, onClickLeftButton, onClickRightButton, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: e */
    public static final Unit m16911e() {
        return Unit.INSTANCE;
    }

    /* renamed from: f */
    public static final Unit m16912f(String str, String str2, Function0 function0, Function0 function02, String str3, String str4, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(526435395, i10, -1, "com.zykj.evaluation.ui.sheet.preview.dialog.CommonFailedPage.<anonymous> (CommonFailedPage.kt:41)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl((200 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN4 = SizeKt.m17730sizeVpY3zN4(companion, fM23561constructorimpl, C3127Dp.m23561constructorimpl((120 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierClip = ClipKt.clip(modifierM17730sizeVpY3zN4, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((3 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))));
            Color.Companion companion2 = Color.INSTANCE;
            Modifier modifierM17190backgroundbw27NRU$default = BackgroundKt.m17190backgroundbw27NRU$default(modifierClip, companion2.m21013getWhite0d7_KjU(), null, 2, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM17190backgroundbw27NRU$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f11 = 20 / f10;
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            TextKt.m19430Text4IGK_g(str, PaddingKt.m17685paddingqDBjuR0$default(companion, 0.0f, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11), 0.0f, 0.0f, 13, null), ColorKt.Color(4281479730L), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3504, 0, 131056);
            float f12 = 50 / f10;
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17714height3ABfNKs = SizeKt.m17714height3ABfNKs(companion, C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17683paddingVpY3zN4$default = PaddingKt.m17683paddingVpY3zN4$default(modifierM17714height3ABfNKs, C3127Dp.m23561constructorimpl((10 / f10) * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM17683paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM20418constructorimpl2 = Updater.m20418constructorimpl(composer);
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m19430Text4IGK_g(str2, boxScopeInstance.align(companion, companion3.getCenter()), ColorKt.Color(4281545523L), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m23438boximpl(TextAlign.INSTANCE.m23445getCentere0LSkKk()), AbstractC8709e.m14344k(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3456, 6, 129520);
            composer.endNode();
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM20418constructorimpl3 = Updater.m20418constructorimpl(composer);
            Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f13 = 45 / f10;
            DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f13);
            DisplayMetrics displayMetrics8 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN42 = SizeKt.m17730sizeVpY3zN4(companion, fM23561constructorimpl2, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics8.widthPixels, displayMetrics8.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11));
            float fM23561constructorimpl3 = C3127Dp.m23561constructorimpl(1);
            long jColor = ColorKt.Color(4282949880L);
            float f14 = 2 / f10;
            DisplayMetrics displayMetrics9 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM12480g = AbstractC7593i.m12480g(BorderKt.m17201borderxT4_qwU(modifierM17730sizeVpY3zN42, fM23561constructorimpl3, jColor, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics9.widthPixels, displayMetrics9.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f14))), false, function0, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM12480g);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM20418constructorimpl4 = Updater.m20418constructorimpl(composer);
            Updater.m20425setimpl(composerM20418constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM20418constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM20418constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m20425setimpl(composerM20418constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
            TextKt.m19430Text4IGK_g(str3, boxScopeInstance.align(companion, companion3.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4282949880L), AbstractC8709e.m14344k(6), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composer, 0, 1572864, 65532);
            composer.endNode();
            DisplayMetrics displayMetrics10 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics10.widthPixels, displayMetrics10.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11)), composer, 6);
            DisplayMetrics displayMetrics11 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl4 = C3127Dp.m23561constructorimpl(f13 * (RangesKt.coerceAtLeast(displayMetrics11.widthPixels, displayMetrics11.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics12 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN43 = SizeKt.m17730sizeVpY3zN4(companion, fM23561constructorimpl4, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics12.widthPixels, displayMetrics12.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            long jColor2 = ColorKt.Color(4282949880L);
            DisplayMetrics displayMetrics13 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM12480g2 = AbstractC7593i.m12480g(BackgroundKt.m17189backgroundbw27NRU(modifierM17730sizeVpY3zN43, jColor2, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f14 * (RangesKt.coerceAtLeast(displayMetrics13.widthPixels, displayMetrics13.heightPixels) / Resources.getSystem().getDisplayMetrics().density)))), false, function02, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM12480g2);
            Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer composerM20418constructorimpl5 = Updater.m20418constructorimpl(composer);
            Updater.m20425setimpl(composerM20418constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
            if (composerM20418constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM20418constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM20418constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m20425setimpl(composerM20418constructorimpl5, modifierMaterializeModifier5, companion4.getSetModifier());
            TextKt.m19430Text4IGK_g(str4, boxScopeInstance.align(companion, companion3.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(companion2.m21013getWhite0d7_KjU(), AbstractC8709e.m14344k(6), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composer, 0, 1572864, 65532);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: g */
    public static final Unit m16913g(String str, String str2, String str3, String str4, Function0 function0, Function0 function02, int i10, Composer composer, int i11) {
        m16910d(str, str2, str3, str4, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }
}
