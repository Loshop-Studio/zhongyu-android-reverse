package com.zykj.evaluation.p057ui.sheet.preview;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.res.PainterResources_androidKt;
import androidx.compose.p013ui.res.StringResources_androidKt;
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
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.VibrateUtils;
import com.zykj.base.utils.XToastUtils;
import com.zykj.evaluation.R;
import com.zykj.evaluation.p057ui.sheet.AbstractC6934b;
import com.zykj.evaluation.p057ui.sheet.AbstractC6935c;
import com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel;
import com.zykj.evaluation.p057ui.sheet.C6933a;
import com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel;
import com.zykj.evaluation.p057ui.sheet.preview.PreviewPageKt;
import com.zykj.evaluation.p057ui.sheet.widget.AnswerSheetCorrectViewKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import p026b7.AbstractC5029s0;
import p026b7.C5031t0;
import p079e7.AbstractC7384h;
import p101g7.AbstractC7593i;
import p156l5.C8508c;
import p189o5.AbstractC8709e;
import p267v6.AbstractC9708y;
import p267v6.C9709z;

/* loaded from: classes4.dex */
public abstract class PreviewPageKt {
    /* renamed from: A */
    public static final Unit m10294A(AnswerSheetViewModel answerSheetViewModel, NavController navController) {
        AnswerSheetViewModel.m10171p(answerSheetViewModel, 0, 1, null);
        answerSheetViewModel.m10186N();
        NavController.navigate$default(navController, "ANSWER_SHEET", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final Unit m10295B(AnswerSheetViewModel answerSheetViewModel, Function0 function0, final NavController navController) {
        answerSheetViewModel.mo10200r(function0, new Function0() { // from class: y6.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreviewPageKt.m10296C(navController);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public static final Unit m10296C(NavController navController) {
        XToastUtils.INSTANCE.error(R.string.correct_multi_answer_for_single);
        NavController.navigate$default(navController, "ANSWER_SHEET_CORRECT_DATA", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: D */
    public static final Unit m10297D(AnswerSheetViewModel answerSheetViewModel, NavController navController, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (answerSheetViewModel instanceof NormalViewModel) {
            ((NormalViewModel) answerSheetViewModel).m10278U0(AbstractC9708y.m16217b(it));
            NavController.navigate$default(navController, "ANSWER_SHEET_CORRECT_DATA", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: E */
    public static final Unit m10298E(NavController navController, AnswerSheetViewModel answerSheetViewModel, Function0 function0, int i10, Composer composer, int i11) {
        m10324w(navController, answerSheetViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final DisposableEffectResult m10299F(final NavController navController, final C6933a c6933a, final AnswerSheetViewModel answerSheetViewModel, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        NavBackStackEntry currentBackStackEntry = navController.getCurrentBackStackEntry();
        final SavedStateHandle savedStateHandle = currentBackStackEntry != null ? currentBackStackEntry.getSavedStateHandle() : null;
        final Observer observer = new Observer() { // from class: y6.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                PreviewPageKt.m10300G(c6933a, navController, savedStateHandle, answerSheetViewModel, (String) obj);
            }
        };
        final MutableLiveData liveData = savedStateHandle != null ? savedStateHandle.getLiveData("ANSWER_SHEET_KEY_BACK") : null;
        if (liveData != null) {
            NavBackStackEntry currentBackStackEntry2 = navController.getCurrentBackStackEntry();
            Intrinsics.checkNotNull(currentBackStackEntry2);
            liveData.observe(currentBackStackEntry2, observer);
        }
        return new DisposableEffectResult() { // from class: com.zykj.evaluation.ui.sheet.preview.PreviewPageKt$PreviewPage$lambda$4$lambda$3$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MutableLiveData mutableLiveData = liveData;
                if (mutableLiveData != null) {
                    mutableLiveData.removeObserver(observer);
                }
            }
        };
    }

    /* renamed from: G */
    public static final void m10300G(C6933a c6933a, NavController navController, SavedStateHandle savedStateHandle, AnswerSheetViewModel answerSheetViewModel, String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == 745490958) {
                if (str.equals("ANSWER_SHEET_KEY_BACK_MANUAL_POINT")) {
                    answerSheetViewModel.m10181I();
                    LogUtils.m3239i("定位点击返回触发前往定位页面");
                    NavController.navigate$default(navController, "ANSWER_SHEET_MANUAL_POINT", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                    if (savedStateHandle != null) {
                        savedStateHandle.set("ANSWER_SHEET_KEY_BACK", null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (iHashCode != 1046851499) {
                if (iHashCode == 1780040303 && str.equals("ANSWER_SHEET_KEY_BACK_RE_TAKE_PHOTO")) {
                    LogUtils.m3239i("重拍点击返回触发前往拍照页面");
                    NavController.navigate$default(navController, "ANSWER_SHEET", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                    if (savedStateHandle != null) {
                        savedStateHandle.set("ANSWER_SHEET_KEY_BACK", null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (str.equals("ANSWER_SHEET_KEY_BACK_TAKE_PHOTO_RESULT")) {
                LogUtils.m3239i("拍照结果返回");
                if (c6933a.m10214g() instanceof AbstractC6934b.d) {
                    VibrateUtils.vibrate(200L);
                } else if (c6933a.m10214g() instanceof AbstractC6934b.c) {
                    if (((AbstractC6934b.c) c6933a.m10214g()).m10218c()) {
                        LogUtils.m3239i("触发扫描失败显示弹窗");
                        NavController.navigate$default(navController, "ANSWER_SHEET_SCAN_FAILED", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                    } else if (((AbstractC6934b.c) c6933a.m10214g()).m10219d()) {
                        NavController.navigate$default(navController, "ANSWER_SHEET_SERIAL_NUM_ERROR", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                    } else if (((AbstractC6934b.c) c6933a.m10214g()).m10217b()) {
                        NavController.navigate$default(navController, "ANSWER_SHEET_PAGE_ERROR", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                    }
                }
                if (savedStateHandle != null) {
                    savedStateHandle.set("ANSWER_SHEET_KEY_BACK", null);
                }
            }
        }
    }

    /* renamed from: H */
    public static final Unit m10301H(AnswerSheetViewModel answerSheetViewModel) {
        answerSheetViewModel.m8646c();
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final void m10317p(Modifier modifier, final List list, final Function1 function1, final Function0 function0, final boolean z9, final Function0 function02, final Function0 function03, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1266202025);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changed(z9) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function03) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i12) != 599186, i12 & 1)) {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1266202025, i12, -1, "com.zykj.evaluation.ui.sheet.preview.PreviewButton (PreviewPage.kt:264)");
            }
            Modifier modifierM17190backgroundbw27NRU$default = BackgroundKt.m17190backgroundbw27NRU$default(modifier4, Color.INSTANCE.m21013getWhite0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17190backgroundbw27NRU$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f10 = 5 / 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion2, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f10)), composerStartRestartGroup, 6);
            m10319r(RowScope.weight$default(rowScopeInstance, SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null), list, function1, composerStartRestartGroup, i12 & PointerIconCompat.TYPE_TEXT, 0);
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion2, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f10)), composerStartRestartGroup, 6);
            AbstractC5029s0.m2504e(StringResources_androidKt.stringResource(R.string.re_take_photo, composerStartRestartGroup, 6), function0, composerStartRestartGroup, (i12 >> 6) & 112);
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion2, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f10)), composerStartRestartGroup, 6);
            if (z9) {
                composerStartRestartGroup.startReplaceGroup(1680402511);
                AbstractC5029s0.m2507h(StringResources_androidKt.stringResource(R.string.sheet_preview_commit, composerStartRestartGroup, 6), function03, composerStartRestartGroup, (i12 >> 15) & 112);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1680590805);
                AbstractC5029s0.m2504e(StringResources_androidKt.stringResource(R.string.take_next_photo, composerStartRestartGroup, 6), function02, composerStartRestartGroup, (i12 >> 12) & 112);
                composerStartRestartGroup.endReplaceGroup();
            }
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion2, C3127Dp.m23561constructorimpl(f10 * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: y6.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewPageKt.m10318q(modifier3, list, function1, function0, z9, function02, function03, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: q */
    public static final Unit m10318q(Modifier modifier, List list, Function1 function1, Function0 function0, boolean z9, Function0 function02, Function0 function03, int i10, int i11, Composer composer, int i12) {
        m10317p(modifier, list, function1, function0, z9, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: r */
    public static final void m10319r(Modifier modifier, final List list, final Function1 function1, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        Composer composer2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-791509706);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i14 = 1;
        if (composerStartRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-791509706, i12, -1, "com.zykj.evaluation.ui.sheet.preview.PreviewButtonIndexView (PreviewPage.kt:319)");
            }
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Unit unit = Unit.INSTANCE;
            boolean zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState) | composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new PreviewPageKt$PreviewButtonIndexView$1$1(scrollStateRememberScrollState, list, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i15 = 6;
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(modifier4, scrollStateRememberScrollState, false, null, false, 14, null);
            Modifier modifier5 = modifier4;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHorizontalScroll$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-973334405);
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                final C9709z c9709z = (C9709z) it.next();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                float f10 = 600;
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17728size3ABfNKs = SizeKt.m17728size3ABfNKs(companion2, C3127Dp.m23561constructorimpl((14 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
                long jM10220a = c9709z.m16226d().m10220a();
                int i16 = i15;
                float f11 = 7 / f10;
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17189backgroundbw27NRU = BackgroundKt.m17189backgroundbw27NRU(modifierM17728size3ABfNKs, jM10220a, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11)));
                float fM23561constructorimpl = C3127Dp.m23561constructorimpl(i14);
                long jM10221b = c9709z.m16226d().m10221b();
                DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
                int i17 = i14;
                Modifier modifierM17201borderxT4_qwU = BorderKt.m17201borderxT4_qwU(modifierM17189backgroundbw27NRU, fM23561constructorimpl, jM10221b, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))));
                boolean z9 = c9709z.m16226d() instanceof AbstractC6935c.b;
                int i18 = ((i12 & 896) == 256 ? i17 : 0) | (composerStartRestartGroup.changed(c9709z) ? 1 : 0);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i18 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: y6.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PreviewPageKt.m10320s(function1, c9709z);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierM12478e = AbstractC7593i.m12478e(modifierM17201borderxT4_qwU, z9, (Function0) objRememberedValue2);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM12478e);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                Modifier modifierAlign = BoxScopeInstance.INSTANCE.align(companion2, companion3.getCenter());
                String strValueOf = String.valueOf(c9709z.m16225c() + 1);
                TextStyle textStyle = new TextStyle(c9709z.m16226d().m10222c(), AbstractC8709e.m14344k(i16), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
                int i19 = i12;
                Composer composer3 = composerStartRestartGroup;
                TextKt.m19430Text4IGK_g(strValueOf, modifierAlign, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer3, 0, 0, 65532);
                composer3.endNode();
                DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
                SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion2, C3127Dp.m23561constructorimpl((5 / f10) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer3, i16);
                composerStartRestartGroup = composer3;
                i12 = i19;
                i14 = i17;
                i15 = i16;
            }
            composer2 = composerStartRestartGroup;
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: y6.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewPageKt.m10321t(modifier3, list, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: s */
    public static final Unit m10320s(Function1 function1, C9709z c9709z) {
        function1.invoke(c9709z);
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final Unit m10321t(Modifier modifier, List list, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m10319r(modifier, list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final void m10322u(Modifier modifier, final Bitmap bitmap, final List list, final C5031t0 c5031t0, final AbstractC6934b abstractC6934b, final Function1 function1, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        Bitmap bitmap2;
        List list2;
        final Modifier modifier3;
        Modifier modifier4;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(1690417251);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            bitmap2 = bitmap;
            i12 |= composerStartRestartGroup.changedInstance(bitmap2) ? 32 : 16;
        } else {
            bitmap2 = bitmap;
        }
        if ((i10 & 384) == 0) {
            list2 = list;
            i12 |= composerStartRestartGroup.changedInstance(list2) ? 256 : 128;
        } else {
            list2 = list;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(c5031t0) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changed(abstractC6934b) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i12) != 74898, i12 & 1)) {
            Modifier modifier5 = i15 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1690417251, i12, -1, "com.zykj.evaluation.ui.sheet.preview.PreviewImage (PreviewPage.kt:202)");
            }
            Modifier modifierM17190backgroundbw27NRU$default = BackgroundKt.m17190backgroundbw27NRU$default(modifier5, ColorKt.Color(4292401368L), null, 2, null);
            Modifier modifier6 = modifier5;
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17190backgroundbw27NRU$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (Intrinsics.areEqual(abstractC6934b, AbstractC6934b.d.f9957b) || (abstractC6934b instanceof AbstractC6934b.c)) {
                modifier4 = modifier6;
                i13 = 6;
                composerStartRestartGroup.startReplaceGroup(-253055905);
                int i16 = (i12 & 112) | 6 | (i12 & 896) | (i12 & 7168) | ((i12 >> 3) & 57344);
                i14 = 3;
                AnswerSheetCorrectViewKt.m10332e(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), bitmap2, list2, c5031t0, function1, composerStartRestartGroup, i16, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (Intrinsics.areEqual(abstractC6934b, AbstractC6934b.b.f9953b)) {
                    composerStartRestartGroup.startReplaceGroup(-252719555);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                    Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                    Modifier modifierM17728size3ABfNKs = SizeKt.m17728size3ABfNKs(companion3, C3127Dp.m23561constructorimpl((300 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
                    modifier4 = modifier6;
                    i13 = 6;
                    i14 = 3;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.pic_answer_sheet_content_empty, composerStartRestartGroup, 6), (String) null, modifierM17728size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                } else {
                    modifier4 = modifier6;
                    i13 = 6;
                    i14 = 3;
                    composerStartRestartGroup.startReplaceGroup(-260856187);
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier.Companion companion4 = Modifier.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m17685paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, C3127Dp.m23561constructorimpl((5 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 7, null), companion.getBottomCenter());
            long jColor = ColorKt.Color(1308622848);
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17189backgroundbw27NRU = BackgroundKt.m17189backgroundbw27NRU(modifierAlign, jColor, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((14 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))));
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl((i14 / f10) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            float f11 = i13 / f10;
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17682paddingVpY3zN4 = PaddingKt.m17682paddingVpY3zN4(modifierM17189backgroundbw27NRU, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), fM23561constructorimpl);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17682paddingVpY3zN4);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            Composer composer2 = composerStartRestartGroup;
            TextKt.m19430Text4IGK_g(abstractC6934b.m10216a(), boxScopeInstance.align(companion4, companion.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.INSTANCE.m21013getWhite0d7_KjU(), AbstractC8709e.m14344k(7), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composer2, 0, 1572864, 65532);
            composerStartRestartGroup = composer2;
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: y6.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewPageKt.m10323v(modifier3, bitmap, list, c5031t0, abstractC6934b, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: v */
    public static final Unit m10323v(Modifier modifier, Bitmap bitmap, List list, C5031t0 c5031t0, AbstractC6934b abstractC6934b, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m10322u(modifier, bitmap, list, c5031t0, abstractC6934b, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final void m10324w(final NavController navController, final AnswerSheetViewModel viewModel, final Function0 onBackHandle, Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBackHandle, "onBackHandle");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1257492818);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(navController) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(viewModel) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onBackHandle) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1257492818, i11, -1, "com.zykj.evaluation.ui.sheet.preview.PreviewPage (PreviewPage.kt:63)");
            }
            Unit unit = Unit.INSTANCE;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel) | composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new PreviewPageKt$PreviewPage$1$1(viewModel, navController, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            C8508c c8508cM8645b = viewModel.m8645b();
            final C6933a c6933aM10176D = viewModel.m10176D();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navController) | composerStartRestartGroup.changedInstance(c6933aM10176D) | composerStartRestartGroup.changedInstance(viewModel);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: y6.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PreviewPageKt.m10299F(navController, c6933aM10176D, viewModel, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 6);
            boolean zM13985c = c8508cM8645b.m13985c();
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(viewModel);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: y6.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PreviewPageKt.m10301H(viewModel);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            AbstractC7384h.m11841d(zM13985c, null, (Function0) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(1133047821, true, new Function3() { // from class: y6.h
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return PreviewPageKt.m10325x(c6933aM10176D, viewModel, navController, onBackHandle, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: y6.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewPageKt.m10298E(navController, viewModel, onBackHandle, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: x */
    public static final Unit m10325x(C6933a c6933a, final AnswerSheetViewModel answerSheetViewModel, final NavController navController, final Function0 function0, BoxScope BoxWithLoadState, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(BoxWithLoadState, "$this$BoxWithLoadState");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133047821, i10, -1, "com.zykj.evaluation.ui.sheet.preview.PreviewPage.<anonymous> (PreviewPage.kt:136)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Modifier modifierWeight$default = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            Bitmap bitmapM10213f = c6933a.m10213f();
            List listM10210c = c6933a.m10210c();
            C5031t0 c5031t0M10211d = c6933a.m10211d();
            AbstractC6934b abstractC6934bM10214g = c6933a.m10214g();
            boolean zChangedInstance = composer.changedInstance(answerSheetViewModel) | composer.changedInstance(navController);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: y6.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PreviewPageKt.m10297D(answerSheetViewModel, navController, (List) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            m10322u(modifierWeight$default, bitmapM10213f, listM10210c, c5031t0M10211d, abstractC6934bM10214g, (Function1) objRememberedValue, composer, 0, 0);
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17714height3ABfNKs = SizeKt.m17714height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3127Dp.m23561constructorimpl((30 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            List listM10212e = c6933a.m10212e();
            boolean zM10215h = c6933a.m10215h();
            boolean zChangedInstance2 = composer.changedInstance(answerSheetViewModel);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: y6.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PreviewPageKt.m10326y(answerSheetViewModel, (C9709z) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            boolean zChangedInstance3 = composer.changedInstance(navController);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: y6.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PreviewPageKt.m10327z(navController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function02 = (Function0) objRememberedValue3;
            boolean zChangedInstance4 = composer.changedInstance(answerSheetViewModel) | composer.changedInstance(navController);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: y6.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PreviewPageKt.m10294A(answerSheetViewModel, navController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function0 function03 = (Function0) objRememberedValue4;
            boolean zChangedInstance5 = composer.changedInstance(answerSheetViewModel) | composer.changed(function0) | composer.changedInstance(navController);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: y6.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PreviewPageKt.m10295B(answerSheetViewModel, function0, navController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            m10317p(modifierM17714height3ABfNKs, listM10212e, function1, function02, zM10215h, function03, (Function0) objRememberedValue5, composer, 6, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final Unit m10326y(AnswerSheetViewModel answerSheetViewModel, C9709z it) {
        Intrinsics.checkNotNullParameter(it, "it");
        answerSheetViewModel.m10198o(it.m16225c());
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final Unit m10327z(NavController navController) {
        NavController.navigate$default(navController, "ANSWER_SHEET", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }
}
