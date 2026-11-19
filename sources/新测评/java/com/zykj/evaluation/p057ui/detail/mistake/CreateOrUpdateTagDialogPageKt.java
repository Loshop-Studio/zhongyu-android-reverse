package com.zykj.evaluation.p057ui.detail.mistake;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.ClipKt;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.p013ui.text.PlatformTextStyle;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.input.VisualTransformation;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.profileinstaller.ProfileVerifier;
import com.google.gson.Gson;
import com.zykj.base.utils.XToastUtils;
import com.zykj.evaluation.R;
import com.zykj.evaluation.p057ui.detail.mistake.CreateOrUpdateTagDialogPageKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import p068d7.AbstractC7305a;
import p101g7.AbstractC7593i;
import p189o5.AbstractC8709e;

/* loaded from: classes4.dex */
public abstract class CreateOrUpdateTagDialogPageKt {
    /* renamed from: f */
    public static final void m9489f(final NavController navController, final String tagDataString, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        String strStringResource;
        final MutableState mutableState;
        final NavController navController2 = navController;
        Intrinsics.checkNotNullParameter(navController2, "navController");
        Intrinsics.checkNotNullParameter(tagDataString, "tagDataString");
        Composer composerStartRestartGroup = composer.startRestartGroup(2024747694);
        if ((i10 & 6) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(navController2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(tagDataString) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2024747694, i11, -1, "com.zykj.evaluation.ui.detail.mistake.CreateOrUpdateTagDialogPage (CreateOrUpdateTagDialogPage.kt:49)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TagData(0L, null, false, 7, null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            Unit unit = Unit.INSTANCE;
            boolean z9 = (i11 & 112) == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new CreateOrUpdateTagDialogPageKt$CreateOrUpdateTagDialogPage$1$1(tagDataString, mutableState2, mutableState3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl((200 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN4 = SizeKt.m17730sizeVpY3zN4(companion2, fM23561constructorimpl, C3127Dp.m23561constructorimpl((120 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            float f11 = 3 / f10;
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierClip = ClipKt.clip(modifierM17730sizeVpY3zN4, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11)));
            Color.Companion companion3 = Color.INSTANCE;
            Modifier modifierM17190backgroundbw27NRU$default = BackgroundKt.m17190backgroundbw27NRU$default(modifierClip, companion3.m21013getWhite0d7_KjU(), null, 2, null);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17190backgroundbw27NRU$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17685paddingqDBjuR0$default = PaddingKt.m17685paddingqDBjuR0$default(companion2, 0.0f, C3127Dp.m23561constructorimpl((10 / f10) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 13, null);
            if (m9490g(mutableState2).getId() == 0) {
                composerStartRestartGroup.startReplaceGroup(1332860076);
                strStringResource = StringResources_androidKt.stringResource(R.string.add_mistake_tag, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1332862445);
                strStringResource = StringResources_androidKt.stringResource(R.string.edit_mistake_tag, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            TextKt.m19430Text4IGK_g(strStringResource, modifierM17685paddingqDBjuR0$default, ColorKt.Color(4281545523L), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3504, 0, 131056);
            final TextStyle textStyle = new TextStyle(ColorKt.Color(4284111450L), AbstractC8709e.m14344k(7), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
            String strM9497n = m9497n(mutableState3);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            float f12 = 20 / f10;
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17681padding3ABfNKs = PaddingKt.m17681padding3ABfNKs(modifierFillMaxWidth$default, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12));
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17714height3ABfNKs = SizeKt.m17714height3ABfNKs(modifierM17681padding3ABfNKs, C3127Dp.m23561constructorimpl((18 / f10) * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            long jM21013getWhite0d7_KjU = companion3.m21013getWhite0d7_KjU();
            DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17189backgroundbw27NRU = BackgroundKt.m17189backgroundbw27NRU(modifierM17714height3ABfNKs, jM21013getWhite0d7_KjU, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11)));
            float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(1);
            long jColor = ColorKt.Color(4291611852L);
            DisplayMetrics displayMetrics8 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17201borderxT4_qwU = BorderKt.m17201borderxT4_qwU(modifierM17189backgroundbw27NRU, fM23561constructorimpl2, jColor, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics8.widthPixels, displayMetrics8.heightPixels) / Resources.getSystem().getDisplayMetrics().density))));
            DisplayMetrics displayMetrics9 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl3 = C3127Dp.m23561constructorimpl((4 / f10) * (RangesKt.coerceAtLeast(displayMetrics9.widthPixels, displayMetrics9.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics10 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17682paddingVpY3zN4 = PaddingKt.m17682paddingVpY3zN4(modifierM17201borderxT4_qwU, C3127Dp.m23561constructorimpl((6 / f10) * (RangesKt.coerceAtLeast(displayMetrics10.widthPixels, displayMetrics10.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), fM23561constructorimpl3);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                mutableState = mutableState3;
                objRememberedValue4 = new Function1() { // from class: z5.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateOrUpdateTagDialogPageKt.m9494k(mutableState, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                mutableState = mutableState3;
            }
            final MutableState mutableState4 = mutableState;
            BasicTextFieldKt.BasicTextField(strM9497n, (Function1<? super String, Unit>) objRememberedValue4, modifierM17682paddingVpY3zN4, false, false, textStyle, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1353648097, true, new Function3() { // from class: z5.b
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CreateOrUpdateTagDialogPageKt.m9491h(mutableState, textStyle, (Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663344, ProfileVerifier.CompilationStatus.f2100xf2722a21, 32472);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl2 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl3 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
            if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f13 = 60 / f10;
            DisplayMetrics displayMetrics11 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl4 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics11.widthPixels, displayMetrics11.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f13);
            DisplayMetrics displayMetrics12 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN42 = SizeKt.m17730sizeVpY3zN4(companion2, fM23561constructorimpl4, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics12.widthPixels, displayMetrics12.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12));
            long jM11585i = AbstractC7305a.m11585i();
            float f14 = 12 / f10;
            DisplayMetrics displayMetrics13 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17189backgroundbw27NRU2 = BackgroundKt.m17189backgroundbw27NRU(modifierM17730sizeVpY3zN42, jM11585i, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics13.widthPixels, displayMetrics13.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f14)));
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: z5.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateOrUpdateTagDialogPageKt.m9492i(context, navController, mutableState4, mutableState2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierM12480g = AbstractC7593i.m12480g(modifierM17189backgroundbw27NRU2, false, (Function0) objRememberedValue5, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM12480g);
            Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl4 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
            if (composerM20418constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM20418constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM20418constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m20425setimpl(composerM20418constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
            navController2 = navController;
            TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.confirm, composerStartRestartGroup, 6), boxScopeInstance.align(companion2, companion4.getCenter()), companion3.m21013getWhite0d7_KjU(), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3456, 0, 131056);
            composerStartRestartGroup.endNode();
            DisplayMetrics displayMetrics14 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion2, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics14.widthPixels, displayMetrics14.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12)), composerStartRestartGroup, 6);
            DisplayMetrics displayMetrics15 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl5 = C3127Dp.m23561constructorimpl(f13 * (RangesKt.coerceAtLeast(displayMetrics15.widthPixels, displayMetrics15.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics16 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN43 = SizeKt.m17730sizeVpY3zN4(companion2, fM23561constructorimpl5, C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics16.widthPixels, displayMetrics16.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            long jColor2 = ColorKt.Color(4291611852L);
            DisplayMetrics displayMetrics17 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17189backgroundbw27NRU3 = BackgroundKt.m17189backgroundbw27NRU(modifierM17730sizeVpY3zN43, jColor2, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f14 * (RangesKt.coerceAtLeast(displayMetrics17.widthPixels, displayMetrics17.heightPixels) / Resources.getSystem().getDisplayMetrics().density))));
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navController2);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: z5.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateOrUpdateTagDialogPageKt.m9493j(navController2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Modifier modifierM12480g2 = AbstractC7593i.m12480g(modifierM17189backgroundbw27NRU3, false, (Function0) objRememberedValue6, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM12480g2);
            Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl5 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, companion5.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl5, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
            if (composerM20418constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM20418constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM20418constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m20425setimpl(composerM20418constructorimpl5, modifierMaterializeModifier5, companion5.getSetModifier());
            composer2 = composerStartRestartGroup;
            TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.cancel, composerStartRestartGroup, 6), boxScopeInstance.align(companion2, companion4.getCenter()), ColorKt.Color(4294967295L), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3456, 0, 131056);
            composer2.endNode();
            composer2.endNode();
            composer2.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z5.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateOrUpdateTagDialogPageKt.m9496m(navController2, tagDataString, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static final TagData m9490g(MutableState mutableState) {
        return (TagData) mutableState.getValue();
    }

    /* renamed from: h */
    public static final Unit m9491h(MutableState mutableState, TextStyle textStyle, Function2 innerTextField, Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        if ((i10 & 6) == 0) {
            i11 = i10 | (composer.changedInstance(innerTextField) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1353648097, i11, -1, "com.zykj.evaluation.ui.detail.mistake.CreateOrUpdateTagDialogPage.<anonymous>.<anonymous> (CreateOrUpdateTagDialogPage.kt:101)");
            }
            if (m9497n(mutableState).length() == 0) {
                composer.startReplaceGroup(-519266606);
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterStart(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxHeight$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                innerTextField.invoke(composer, Integer.valueOf(i11 & 14));
                TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.tag_name_max_length_tip, composer, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, 0, 0, 65534);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-519251823);
                innerTextField.invoke(composer, Integer.valueOf(i11 & 14));
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Unit m9492i(Context context, NavController navController, MutableState mutableState, MutableState mutableState2) throws Resources.NotFoundException {
        SavedStateHandle savedStateHandle;
        if (StringsKt.isBlank(m9497n(mutableState))) {
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = context.getResources().getString(R.string.empty_tag_name_tip);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            xToastUtils.info(string);
            return Unit.INSTANCE;
        }
        NavBackStackEntry previousBackStackEntry = navController.getPreviousBackStackEntry();
        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
            savedStateHandle.set("CREATE_UPDATE_RESULT_CREATE_UPDATE", new Gson().toJson(TagData.copy$default(m9490g(mutableState2), 0L, m9497n(mutableState), false, 5, null)));
        }
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m9493j(NavController navController) {
        navController.navigateUp();
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m9494k(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() > 6) {
            it = it.substring(0, 6);
            Intrinsics.checkNotNullExpressionValue(it, "substring(...)");
        }
        m9498o(mutableState, it);
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final void m9495l(MutableState mutableState, TagData tagData) {
        mutableState.setValue(tagData);
    }

    /* renamed from: m */
    public static final Unit m9496m(NavController navController, String str, int i10, Composer composer, int i11) {
        m9489f(navController, str, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static final String m9497n(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* renamed from: o */
    public static final void m9498o(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }
}
