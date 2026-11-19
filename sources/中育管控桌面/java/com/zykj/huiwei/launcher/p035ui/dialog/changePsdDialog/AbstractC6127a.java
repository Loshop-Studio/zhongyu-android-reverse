package com.zykj.huiwei.launcher.p035ui.dialog.changePsdDialog;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p009ui.Alignment;
import androidx.compose.p009ui.ComposedModifierKt;
import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.draw.ShadowKt;
import androidx.compose.p009ui.focus.FocusRequester;
import androidx.compose.p009ui.focus.FocusRequesterModifierKt;
import androidx.compose.p009ui.graphics.Brush;
import androidx.compose.p009ui.graphics.Color;
import androidx.compose.p009ui.graphics.ColorKt;
import androidx.compose.p009ui.layout.MeasurePolicy;
import androidx.compose.p009ui.node.ComposeUiNode;
import androidx.compose.p009ui.res.StringResources_androidKt;
import androidx.compose.p009ui.text.TextLayoutResult;
import androidx.compose.p009ui.text.TextStyle;
import androidx.compose.p009ui.text.font.FontFamily;
import androidx.compose.p009ui.text.font.FontStyle;
import androidx.compose.p009ui.text.font.FontWeight;
import androidx.compose.p009ui.text.style.TextAlign;
import androidx.compose.p009ui.text.style.TextDecoration;
import androidx.compose.p009ui.unit.C2452Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import com.zykj.huiwei.launcher.p035ui.dialog.changePsdDialog.AbstractC6127a;
import com.zykj.huiwei.launcher.p035ui.dialog.changePsdDialog.AbstractC6128b;
import com.zykj.huiwei.launcher.viewmodels.PasswordSecurityLevel;
import com.zykj.manage.R;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p043d4.C6237q;
import p043d4.C6239s;
import p121o3.AbstractC7518a;

/* renamed from: com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6127a {
    /* renamed from: A */
    public static final Unit m5780A(boolean z6, final String str, Composer composer, int i6) {
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-543125149, i6, -1, "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePsdTextField.<anonymous> (ChangePasswordDialogContent.kt:216)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z6, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(689653131, true, new Function3() { // from class: d4.d
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC6127a.m5781B(str, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final Unit m5781B(String str, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i6) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(689653131, i6, -1, "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePsdTextField.<anonymous>.<anonymous> (ChangePasswordDialogContent.kt:221)");
        }
        TextKt.m12353Text4IGK_g(str, (Modifier) null, 0L, AbstractC7518a.m8673a(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131062);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public static final Unit m5782C(Modifier modifier, String str, String str2, Function1 function1, PasswordSecurityLevel passwordSecurityLevel, boolean z6, boolean z7, String str3, int i6, int i7, int i8, Composer composer, int i9) {
        m5805w(modifier, str, str2, function1, passwordSecurityLevel, z6, z7, str3, i6, composer, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), i8);
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final void m5796n(final ChangePsdViewModel viewModel, final Function0 onClose, Composer composer, final int i6) {
        int i7;
        Composer composer2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Composer composerStartRestartGroup = composer.startRestartGroup(635622256);
        if ((i6 & 6) == 0) {
            i7 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onClose) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(635622256, i7, -1, "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePasswordDialogContent (ChangePasswordDialogContent.kt:61)");
            }
            final State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(viewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            float f6 = 12;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m12203SurfaceT9BRK9s(WindowInsetsPadding_androidKt.imePadding(ShadowKt.m13534shadows4CzXII$default(SizeKt.wrapContentHeight$default(SizeKt.m10656width3ABfNKs(Modifier.INSTANCE, C2452Dp.m16484constructorimpl((600 / 1280) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), null, false, 3, null), C2452Dp.m16484constructorimpl(10), RoundedCornerShapeKt.m10897RoundedCornerShape0680j_4(C2452Dp.m16484constructorimpl(f6)), false, 0L, 0L, 28, null)), RoundedCornerShapeKt.m10897RoundedCornerShape0680j_4(C2452Dp.m16484constructorimpl(f6)), Color.INSTANCE.m13934getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(304875637, true, new Function2() { // from class: d4.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6127a.m5798p(onClose, scrollStateRememberScrollState, viewModel, focusRequester, stateCollectAsStateWithLifecycle, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, 12583296, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: d4.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6127a.m5804v(viewModel, onClose, i6, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: o */
    public static final C6237q m5797o(State state) {
        return (C6237q) state.getValue();
    }

    /* renamed from: p */
    public static final Unit m5798p(Function0 function0, ScrollState scrollState, final ChangePsdViewModel changePsdViewModel, FocusRequester focusRequester, final State state, Composer composer, int i6) {
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(304875637, i6, -1, "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePasswordDialogContent.<anonymous> (ChangePasswordDialogContent.kt:75)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierBackground$default = BackgroundKt.background$default(companion, Brush.Companion.m13856verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m13889boximpl(ColorKt.Color(4280626502L)), Color.m13889boximpl(ColorKt.Color(4280297535L))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierBackground$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM13341constructorimpl = Updater.m13341constructorimpl(composer);
            Updater.m13348setimpl(composerM13341constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM13341constructorimpl.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM13341constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM13341constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m13348setimpl(composerM13341constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierAlign = BoxScopeInstance.INSTANCE.align(companion, companion2.getTopEnd());
            float f6 = 1280;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10604padding3ABfNKs = PaddingKt.m10604padding3ABfNKs(modifierAlign, C2452Dp.m16484constructorimpl((10 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            float f7 = 24 / f6;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            IconButtonKt.IconButton(function0, SizeKt.m10651size3ABfNKs(modifierM10604padding3ABfNKs, C2452Dp.m16484constructorimpl(f7 * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), false, null, null, C6239s.f7553a.m6339b(), composer, ProfileVerifier.CompilationStatus.f994xf2722a21, 28);
            Modifier modifierImePadding = WindowInsetsPadding_androidKt.imePadding(ScrollKt.verticalScroll$default(PaddingKt.m10604padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2452Dp.m16484constructorimpl(40)), scrollState, false, null, false, 14, null));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierImePadding);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM13341constructorimpl2 = Updater.m13341constructorimpl(composer);
            Updater.m13348setimpl(composerM13341constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM13341constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM13341constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM13341constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m13348setimpl(composerM13341constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            boolean z6 = false;
            TextKt.m12353Text4IGK_g(StringResources_androidKt.stringResource(R.string.hw_modify_password, composer, 6), (Modifier) null, Color.INSTANCE.m13936getWhite0d7_KjU(), AbstractC7518a.m8673a(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200064, 0, 131026);
            SpacerKt.Spacer(SizeKt.m10637height3ABfNKs(companion, C2452Dp.m16484constructorimpl(20)), composer, 6);
            String strStringResource = StringResources_androidKt.stringResource(R.string.hw_old_pass_title, composer, 6);
            String strM6332g = m5797o(state).m6332g();
            PasswordSecurityLevel passwordSecurityLevel = PasswordSecurityLevel.f7292f;
            boolean zChangedInstance = composer.changedInstance(changePsdViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: d4.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC6127a.m5800r(changePsdViewModel, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            m5805w(null, strStringResource, strM6332g, (Function1) objRememberedValue, passwordSecurityLevel, false, false, null, 0, composer, 221184, 449);
            float f8 = 15;
            SpacerKt.Spacer(SizeKt.m10637height3ABfNKs(companion, C2452Dp.m16484constructorimpl(f8)), composer, 6);
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion, focusRequester);
            String strStringResource2 = StringResources_androidKt.stringResource(R.string.new_pwd, composer, 6);
            String strM6331f = m5797o(state).m6331f();
            PasswordSecurityLevel passwordSecurityLevelM6330e = m5797o(state).m6330e();
            boolean zM6334i = m5797o(state).m6334i();
            boolean zChangedInstance2 = composer.changedInstance(changePsdViewModel);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: d4.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC6127a.m5801s(changePsdViewModel, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            m5805w(modifierFocusRequester, strStringResource2, strM6331f, (Function1) objRememberedValue2, passwordSecurityLevelM6330e, false, zM6334i, null, 0, composer, 0, TypedValues.CycleType.TYPE_PATH_ROTATE);
            SpacerKt.Spacer(SizeKt.m10637height3ABfNKs(companion, C2452Dp.m16484constructorimpl(f8)), composer, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            String strStringResource3 = StringResources_androidKt.stringResource(R.string.sure_pwd, composer, 6);
            String strM6329d = m5797o(state).m6329d();
            PasswordSecurityLevel passwordSecurityLevelM6330e2 = m5797o(state).m6330e();
            boolean zM6333h = m5797o(state).m6333h();
            String strM6328c = m5797o(state).m6328c();
            boolean zChangedInstance3 = composer.changedInstance(changePsdViewModel);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: d4.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC6127a.m5802t(changePsdViewModel, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            m5805w(modifierFillMaxWidth$default, strStringResource3, strM6329d, (Function1) objRememberedValue3, passwordSecurityLevelM6330e2, false, zM6333h, strM6328c, 0, composer, 6, 288);
            SpacerKt.Spacer(SizeKt.m10637height3ABfNKs(companion, C2452Dp.m16484constructorimpl(35)), composer, 6);
            boolean zChangedInstance4 = composer.changedInstance(changePsdViewModel);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: d4.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6127a.m5803u(changePsdViewModel);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function0 function02 = (Function0) objRememberedValue4;
            Modifier modifierM10637height3ABfNKs = SizeKt.m10637height3ABfNKs(SizeKt.m10656width3ABfNKs(companion, C2452Dp.m16484constructorimpl(130)), C2452Dp.m16484constructorimpl(45));
            if (m5797o(state).m6336k() && !m5797o(state).m6335j()) {
                z6 = true;
            }
            ButtonKt.Button(function02, modifierM10637height3ABfNKs, z6, RoundedCornerShapeKt.m10897RoundedCornerShape0680j_4(C2452Dp.m16484constructorimpl(5)), ButtonDefaults.INSTANCE.m11468buttonColorsro_MJ88(ColorKt.Color(4278221823L), 0L, ColorKt.Color(4289769648L), 0L, composer, (ButtonDefaults.$stable << 12) | 390, 10), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1217555041, true, new Function3() { // from class: d4.j
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC6127a.m5799q(state, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 805306416, 480);
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

    /* renamed from: q */
    public static final Unit m5799q(State state, RowScope Button, Composer composer, int i6) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        if (composer.shouldExecute((i6 & 17) != 16, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1217555041, i6, -1, "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePasswordDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChangePasswordDialogContent.kt:158)");
            }
            if (m5797o(state).m6335j()) {
                composer.startReplaceGroup(1183464320);
                ProgressIndicatorKt.m12027CircularProgressIndicatorLxG7B9w(SizeKt.m10651size3ABfNKs(Modifier.INSTANCE, C2452Dp.m16484constructorimpl(20)), Color.INSTANCE.m13936getWhite0d7_KjU(), C2452Dp.m16484constructorimpl(2), 0L, 0, composer, 438, 24);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1183720287);
                TextKt.m12353Text4IGK_g("下一步", (Modifier) null, Color.INSTANCE.m13936getWhite0d7_KjU(), AbstractC7518a.m8673a(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3462, 0, 131058);
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

    /* renamed from: r */
    public static final Unit m5800r(ChangePsdViewModel changePsdViewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        changePsdViewModel.m5761g(new AbstractC6128b.c(it));
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public static final Unit m5801s(ChangePsdViewModel changePsdViewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        changePsdViewModel.m5761g(new AbstractC6128b.b(it));
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final Unit m5802t(ChangePsdViewModel changePsdViewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        changePsdViewModel.m5761g(new AbstractC6128b.a(it));
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final Unit m5803u(ChangePsdViewModel changePsdViewModel) {
        changePsdViewModel.m5761g(AbstractC6128b.d.f6574a);
        return Unit.INSTANCE;
    }

    /* renamed from: v */
    public static final Unit m5804v(ChangePsdViewModel changePsdViewModel, Function0 function0, int i6, Composer composer, int i7) {
        m5796n(changePsdViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5805w(androidx.compose.p009ui.Modifier r111, final java.lang.String r112, final java.lang.String r113, final kotlin.jvm.functions.Function1 r114, final com.zykj.huiwei.launcher.viewmodels.PasswordSecurityLevel r115, boolean r116, boolean r117, java.lang.String r118, int r119, androidx.compose.runtime.Composer r120, final int r121, final int r122) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.p035ui.dialog.changePsdDialog.AbstractC6127a.m5805w(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, com.zykj.huiwei.launcher.viewmodels.PasswordSecurityLevel, boolean, boolean, java.lang.String, int, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a.smali:3869
    }

    /* renamed from: x */
    public static final Unit m5806x(int i6, Function1 function1, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        if (newValue.length() <= i6) {
            function1.invoke(newValue);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final Unit m5807y(boolean z6, PasswordSecurityLevel passwordSecurityLevel, Composer composer, int i6) {
        String strStringResource;
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-132118255, i6, -1, "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePsdTextField.<anonymous> (ChangePasswordDialogContent.kt:198)");
            }
            if (z6) {
                composer.startReplaceGroup(1883379108);
                strStringResource = StringResources_androidKt.stringResource(passwordSecurityLevel.getPlaceholderResId(), composer, 0);
            } else {
                composer.startReplaceGroup(1883377749);
                strStringResource = StringResources_androidKt.stringResource(R.string.pwd_hint_l0, composer, 6);
            }
            composer.endReplaceGroup();
            TextKt.m12353Text4IGK_g(strStringResource, (Modifier) null, Color.m13898copywmQWz5c$default(Color.INSTANCE.m13936getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), AbstractC7518a.m8673a(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3456, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final Unit m5808z(String str, Composer composer, int i6) {
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(120867169, i6, -1, "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePsdTextField.<anonymous> (ChangePasswordDialogContent.kt:206)");
            }
            TextKt.m12353Text4IGK_g(str, SizeKt.m10656width3ABfNKs(Modifier.INSTANCE, C2452Dp.m16484constructorimpl(85)), Color.INSTANCE.m13936getWhite0d7_KjU(), AbstractC7518a.m8673a(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3504, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
