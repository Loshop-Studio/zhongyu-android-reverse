package com.zykj.huiwei.launcher.p035ui.dialog.Login;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p009ui.Alignment;
import androidx.compose.p009ui.ComposedModifierKt;
import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.draw.ShadowKt;
import androidx.compose.p009ui.focus.FocusManager;
import androidx.compose.p009ui.focus.FocusRequester;
import androidx.compose.p009ui.focus.FocusRequesterModifierKt;
import androidx.compose.p009ui.graphics.Brush;
import androidx.compose.p009ui.graphics.Color;
import androidx.compose.p009ui.graphics.ColorFilter;
import androidx.compose.p009ui.graphics.ColorKt;
import androidx.compose.p009ui.graphics.painter.Painter;
import androidx.compose.p009ui.layout.ContentScale;
import androidx.compose.p009ui.layout.MeasurePolicy;
import androidx.compose.p009ui.node.ComposeUiNode;
import androidx.compose.p009ui.platform.CompositionLocalsKt;
import androidx.compose.p009ui.platform.SoftwareKeyboardController;
import androidx.compose.p009ui.res.PainterResources_androidKt;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.zykj.huiwei.launcher.p035ui.dialog.Login.ResetPasswordDialogContentKt;
import com.zykj.huiwei.launcher.viewmodels.AbstractC6194a;
import com.zykj.huiwei.launcher.viewmodels.PasswordSecurityLevel;
import com.zykj.huiwei.launcher.viewmodels.ResetPwdViewModel;
import com.zykj.manage.R;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import p027c4.C4488b;
import p101l4.C7315g;
import p121o3.AbstractC7518a;

/* loaded from: classes4.dex */
public abstract class ResetPasswordDialogContentKt {
    /* renamed from: A */
    public static final Unit m5687A(Function0 function0, ResetPwdViewModel resetPwdViewModel, AnimatedContentScope AnimatedContent, boolean z6, Composer composer, int i6) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-429341142, i6, -1, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetPasswordDialogContent.<anonymous>.<anonymous> (ResetPasswordDialogContent.kt:94)");
        }
        if (z6) {
            composer.startReplaceGroup(-89310246);
            m5696J(function0, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-89242945);
            m5716q(resetPwdViewModel, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final Unit m5688B(ResetPwdViewModel resetPwdViewModel, Function0 function0, int i6, Composer composer, int i7) {
        m5724y(resetPwdViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5689C(androidx.compose.p009ui.Modifier r113, final java.lang.String r114, final java.lang.String r115, final kotlin.jvm.functions.Function1 r116, final com.zykj.huiwei.launcher.viewmodels.PasswordSecurityLevel r117, boolean r118, java.lang.String r119, int r120, androidx.compose.runtime.Composer r121, final int r122, final int r123) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.p035ui.dialog.Login.ResetPasswordDialogContentKt.m5689C(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, com.zykj.huiwei.launcher.viewmodels.PasswordSecurityLevel, boolean, java.lang.String, int, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt.smali:144
    }

    /* renamed from: D */
    public static final Unit m5690D(int i6, Function1 function1, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        if (newValue.length() <= i6) {
            function1.invoke(newValue);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: E */
    public static final Unit m5691E(PasswordSecurityLevel passwordSecurityLevel, Composer composer, int i6) {
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(795724203, i6, -1, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetPwdTextField.<anonymous> (ResetPasswordDialogContent.kt:286)");
            }
            TextKt.m12353Text4IGK_g(StringResources_androidKt.stringResource(passwordSecurityLevel.getPlaceholderResId(), composer, 0), (Modifier) null, Color.m13898copywmQWz5c$default(Color.INSTANCE.m13936getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), AbstractC7518a.m8673a(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3456, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final Unit m5692F(String str, Composer composer, int i6) {
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-943107589, i6, -1, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetPwdTextField.<anonymous> (ResetPasswordDialogContent.kt:294)");
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

    /* renamed from: G */
    public static final Unit m5693G(boolean z6, final String str, Composer composer, int i6) {
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2079052035, i6, -1, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetPwdTextField.<anonymous> (ResetPasswordDialogContent.kt:304)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z6, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1186691291, true, new Function3() { // from class: c4.i
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ResetPasswordDialogContentKt.m5694H(str, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
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

    /* renamed from: H */
    public static final Unit m5694H(String str, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i6) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1186691291, i6, -1, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetPwdTextField.<anonymous>.<anonymous> (ResetPasswordDialogContent.kt:309)");
        }
        TextKt.m12353Text4IGK_g(str, (Modifier) null, 0L, AbstractC7518a.m8673a(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131062);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: I */
    public static final Unit m5695I(Modifier modifier, String str, String str2, Function1 function1, PasswordSecurityLevel passwordSecurityLevel, boolean z6, String str3, int i6, int i7, int i8, Composer composer, int i9) {
        m5689C(modifier, str, str2, function1, passwordSecurityLevel, z6, str3, i6, composer, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), i8);
        return Unit.INSTANCE;
    }

    /* renamed from: J */
    public static final void m5696J(final Function0 onLoginClick, Composer composer, final int i6) {
        int i7;
        Intrinsics.checkNotNullParameter(onLoginClick, "onLoginClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-48360263);
        if ((i6 & 6) == 0) {
            i7 = (composerStartRestartGroup.changedInstance(onLoginClick) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if (composerStartRestartGroup.shouldExecute((i7 & 3) != 2, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-48360263, i7, -1, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetSuccessView (ResetPasswordDialogContent.kt:106)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f6 = 1280;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10656width3ABfNKs = SizeKt.m10656width3ABfNKs(companion, C2452Dp.m16484constructorimpl((600 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10639heightInVpY3zN4$default = SizeKt.m10639heightInVpY3zN4$default(modifierM10656width3ABfNKs, C2452Dp.m16484constructorimpl((400 / f6) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null);
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            float fM16484constructorimpl = C2452Dp.m16484constructorimpl((10 / f6) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            float f7 = 12 / f6;
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM13534shadows4CzXII$default = ShadowKt.m13534shadows4CzXII$default(modifierM10639heightInVpY3zN4$default, fM16484constructorimpl, RoundedCornerShapeKt.m10897RoundedCornerShape0680j_4(C2452Dp.m16484constructorimpl((RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f7)), false, 0L, 0L, 28, null);
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            SurfaceKt.m12203SurfaceT9BRK9s(modifierM13534shadows4CzXII$default, RoundedCornerShapeKt.m10897RoundedCornerShape0680j_4(C2452Dp.m16484constructorimpl(f7 * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), Color.INSTANCE.m13934getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(724132372, true, new Function2() { // from class: c4.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResetPasswordDialogContentKt.m5697K(onLoginClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12583296, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: c4.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResetPasswordDialogContentKt.m5698L(onLoginClick, i6, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: K */
    public static final Unit m5697K(Function0 function0, Composer composer, int i6) {
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(724132372, i6, -1, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetSuccessView.<anonymous> (ResetPasswordDialogContent.kt:115)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(BackgroundKt.background$default(companion, Brush.Companion.m13856verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m13889boximpl(ColorKt.Color(4280626502L)), Color.m13889boximpl(ColorKt.Color(4280297535L))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), 0.0f, 1, null);
            float f6 = 1280;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10604padding3ABfNKs = PaddingKt.m10604padding3ABfNKs(modifierFillMaxHeight$default, C2452Dp.m16484constructorimpl((40 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composer, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM10604padding3ABfNKs);
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
            Composer composerM13341constructorimpl = Updater.m13341constructorimpl(composer);
            Updater.m13348setimpl(composerM13341constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM13341constructorimpl.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM13341constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM13341constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m13348setimpl(composerM13341constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.change_psd_finish, composer, 6);
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            ImageKt.Image(painterPainterResource, "成功修改密码", SizeKt.m10651size3ABfNKs(companion, C2452Dp.m16484constructorimpl((64 / f6) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m10637height3ABfNKs(companion, C2452Dp.m16484constructorimpl((15 / f6) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
            Color.Companion companion3 = Color.INSTANCE;
            TextKt.m12353Text4IGK_g("密码重置成功，请使用新密码登录", (Modifier) null, companion3.m13936getWhite0d7_KjU(), AbstractC7518a.m8673a(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m16361boximpl(TextAlign.INSTANCE.m16368getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200070, 0, 130514);
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m10637height3ABfNKs(companion, C2452Dp.m16484constructorimpl((60 / f6) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10656width3ABfNKs = SizeKt.m10656width3ABfNKs(companion, C2452Dp.m16484constructorimpl((130 / f6) * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10637height3ABfNKs = SizeKt.m10637height3ABfNKs(modifierM10656width3ABfNKs, C2452Dp.m16484constructorimpl((45 / f6) * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            RoundedCornerShape roundedCornerShapeM10897RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m10897RoundedCornerShape0680j_4(C2452Dp.m16484constructorimpl(5));
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            long jColor = ColorKt.Color(4278221823L);
            long jM13936getWhite0d7_KjU = companion3.m13936getWhite0d7_KjU();
            int i7 = ButtonDefaults.$stable;
            ButtonColors buttonColorsM11468buttonColorsro_MJ88 = buttonDefaults.m11468buttonColorsro_MJ88(jColor, jM13936getWhite0d7_KjU, 0L, 0L, composer, (i7 << 12) | 54, 12);
            DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
            ButtonKt.Button(function0, modifierM10637height3ABfNKs, false, roundedCornerShapeM10897RoundedCornerShape0680j_4, buttonColorsM11468buttonColorsro_MJ88, buttonDefaults.m11469buttonElevationR_JCAzs(C2452Dp.m16484constructorimpl((2 / f6) * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 0.0f, 0.0f, composer, (i7 << 15) | 6, 30), null, null, null, C4488b.f1351a.m1599b(), composer, 805306416, 452);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: L */
    public static final Unit m5698L(Function0 function0, int i6, Composer composer, int i7) {
        m5696J(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final void m5716q(final ResetPwdViewModel viewModel, Composer composer, final int i6) {
        int i7;
        Composer composer2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2091686860);
        if ((i6 & 6) == 0) {
            i7 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if (composerStartRestartGroup.shouldExecute((i7 & 3) != 2, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2091686860, i7, -1, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetInputView (ResetPasswordDialogContent.kt:172)");
            }
            final State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(viewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            final FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Modifier.Companion companion = Modifier.INSTANCE;
            float f6 = 1280;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m10656width3ABfNKs(companion, C2452Dp.m16484constructorimpl((600 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), null, false, 3, null);
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            float fM16484constructorimpl = C2452Dp.m16484constructorimpl((10 / f6) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            float f7 = 12 / f6;
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM13534shadows4CzXII$default = ShadowKt.m13534shadows4CzXII$default(modifierWrapContentHeight$default, fM16484constructorimpl, RoundedCornerShapeKt.m10897RoundedCornerShape0680j_4(C2452Dp.m16484constructorimpl((RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f7)), false, 0L, 0L, 28, null);
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            composer2 = composerStartRestartGroup;
            SurfaceKt.m12203SurfaceT9BRK9s(modifierM13534shadows4CzXII$default, RoundedCornerShapeKt.m10897RoundedCornerShape0680j_4(C2452Dp.m16484constructorimpl(f7 * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), Color.INSTANCE.m13934getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-892862129, true, new Function2() { // from class: c4.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResetPasswordDialogContentKt.m5717r(focusRequester, viewModel, softwareKeyboardController, focusManager, stateCollectAsStateWithLifecycle, (Composer) obj, ((Integer) obj2).intValue());
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: c4.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResetPasswordDialogContentKt.m5722w(viewModel, i6, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: r */
    public static final Unit m5717r(FocusRequester focusRequester, final ResetPwdViewModel resetPwdViewModel, final SoftwareKeyboardController softwareKeyboardController, final FocusManager focusManager, final State state, Composer composer, int i6) {
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-892862129, i6, -1, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetInputView.<anonymous> (ResetPasswordDialogContent.kt:188)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierBackground$default = BackgroundKt.background$default(companion, Brush.Companion.m13856verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m13889boximpl(ColorKt.Color(4280626502L)), Color.m13889boximpl(ColorKt.Color(4280297535L))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
            float f6 = 1280;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierImePadding = WindowInsetsPadding_androidKt.imePadding(PaddingKt.m10604padding3ABfNKs(modifierBackground$default, C2452Dp.m16484constructorimpl((40 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierImePadding);
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
            Composer composerM13341constructorimpl = Updater.m13341constructorimpl(composer);
            Updater.m13348setimpl(composerM13341constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM13341constructorimpl.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM13341constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM13341constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m13348setimpl(composerM13341constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            boolean z6 = false;
            TextKt.m12353Text4IGK_g("重置密码", (Modifier) null, Color.INSTANCE.m13936getWhite0d7_KjU(), AbstractC7518a.m8673a(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200070, 0, 131026);
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m10637height3ABfNKs(companion, C2452Dp.m16484constructorimpl((20 / f6) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion, focusRequester);
            String strStringResource = StringResources_androidKt.stringResource(R.string.new_pwd, composer, 6);
            String strM8303g = m5723x(state).m8303g();
            PasswordSecurityLevel passwordSecurityLevelM8301e = m5723x(state).m8301e();
            boolean zM8305i = m5723x(state).m8305i();
            boolean zChangedInstance = composer.changedInstance(resetPwdViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: c4.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ResetPasswordDialogContentKt.m5718s(resetPwdViewModel, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            m5689C(modifierFocusRequester, strStringResource, strM8303g, (Function1) objRememberedValue, passwordSecurityLevelM8301e, zM8305i, null, 0, composer, 0, 192);
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m10637height3ABfNKs(companion, C2452Dp.m16484constructorimpl((30 / f6) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            String strStringResource2 = StringResources_androidKt.stringResource(R.string.sure_pwd, composer, 6);
            String strM8300d = m5723x(state).m8300d();
            PasswordSecurityLevel passwordSecurityLevelM8301e2 = m5723x(state).m8301e();
            boolean zM8304h = m5723x(state).m8304h();
            String strM8299c = m5723x(state).m8299c();
            boolean zChangedInstance2 = composer.changedInstance(resetPwdViewModel);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: c4.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ResetPasswordDialogContentKt.m5719t(resetPwdViewModel, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            m5689C(modifierFillMaxWidth$default, strStringResource2, strM8300d, (Function1) objRememberedValue2, passwordSecurityLevelM8301e2, zM8304h, strM8299c, 0, composer, 6, 128);
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m10637height3ABfNKs(companion, C2452Dp.m16484constructorimpl((35 / f6) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
            boolean zChanged = composer.changed(softwareKeyboardController) | composer.changedInstance(focusManager) | composer.changedInstance(resetPwdViewModel);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: c4.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ResetPasswordDialogContentKt.m5720u(softwareKeyboardController, focusManager, resetPwdViewModel);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10656width3ABfNKs = SizeKt.m10656width3ABfNKs(companion, C2452Dp.m16484constructorimpl((130 / f6) * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10637height3ABfNKs = SizeKt.m10637height3ABfNKs(modifierM10656width3ABfNKs, C2452Dp.m16484constructorimpl((45 / f6) * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            if (m5723x(state).m8307k() && !m5723x(state).m8306j()) {
                z6 = true;
            }
            DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
            ButtonKt.Button(function0, modifierM10637height3ABfNKs, z6, RoundedCornerShapeKt.m10897RoundedCornerShape0680j_4(C2452Dp.m16484constructorimpl((5 / f6) * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), ButtonDefaults.INSTANCE.m11468buttonColorsro_MJ88(ColorKt.Color(4278221823L), 0L, ColorKt.Color(4289769648L), 0L, composer, (ButtonDefaults.$stable << 12) | 390, 10), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-159356247, true, new Function3() { // from class: c4.r
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ResetPasswordDialogContentKt.m5721v(state, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 805306416, 480);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public static final Unit m5718s(ResetPwdViewModel resetPwdViewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        resetPwdViewModel.m6194d(new AbstractC6194a.b(it));
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final Unit m5719t(ResetPwdViewModel resetPwdViewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        resetPwdViewModel.m6194d(new AbstractC6194a.a(it));
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final Unit m5720u(SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, ResetPwdViewModel resetPwdViewModel) {
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        FocusManager.clearFocus$default(focusManager, false, 1, null);
        resetPwdViewModel.m6194d(AbstractC6194a.c.f7328a);
        return Unit.INSTANCE;
    }

    /* renamed from: v */
    public static final Unit m5721v(State state, RowScope Button, Composer composer, int i6) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        if (composer.shouldExecute((i6 & 17) != 16, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-159356247, i6, -1, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetInputView.<anonymous>.<anonymous>.<anonymous> (ResetPasswordDialogContent.kt:250)");
            }
            if (m5723x(state).m8306j()) {
                composer.startReplaceGroup(-1443044400);
                ProgressIndicatorKt.m12027CircularProgressIndicatorLxG7B9w(SizeKt.m10651size3ABfNKs(Modifier.INSTANCE, C2452Dp.m16484constructorimpl(20)), Color.INSTANCE.m13936getWhite0d7_KjU(), C2452Dp.m16484constructorimpl(2), 0L, 0, composer, 438, 24);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1442811745);
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

    /* renamed from: w */
    public static final Unit m5722w(ResetPwdViewModel resetPwdViewModel, int i6, Composer composer, int i7) {
        m5716q(resetPwdViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final C7315g m5723x(State state) {
        return (C7315g) state.getValue();
    }

    /* renamed from: y */
    public static final void m5724y(final ResetPwdViewModel viewModel, final Function0 onLoginClick, Composer composer, final int i6) {
        int i7;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onLoginClick, "onLoginClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(614639073);
        if ((i6 & 6) == 0) {
            i7 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onLoginClick) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(614639073, i7, -1, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetPasswordDialogContent (ResetPasswordDialogContent.kt:75)");
            }
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(viewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            String strM8302f = m5725z(stateCollectAsStateWithLifecycle).m8302f();
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ResetPasswordDialogContentKt$ResetPasswordDialogContent$1$1(stateCollectAsStateWithLifecycle, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(strM8302f, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f6 = 1280;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10656width3ABfNKs = SizeKt.m10656width3ABfNKs(companion, C2452Dp.m16484constructorimpl((600 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            float f7 = 550 / f6;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10637height3ABfNKs = SizeKt.m10637height3ABfNKs(modifierM10656width3ABfNKs, C2452Dp.m16484constructorimpl(f7 * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM10637height3ABfNKs);
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
            Composer composerM13341constructorimpl = Updater.m13341constructorimpl(composerStartRestartGroup);
            Updater.m13348setimpl(composerM13341constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM13341constructorimpl.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM13341constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM13341constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m13348setimpl(composerM13341constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            AnimatedContentKt.AnimatedContent(Boolean.valueOf(m5725z(stateCollectAsStateWithLifecycle).m8308l()), null, null, null, "DialogContentAnimation", null, ComposableLambdaKt.rememberComposableLambda(-429341142, true, new Function4() { // from class: c4.c
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return ResetPasswordDialogContentKt.m5687A(onLoginClick, viewModel, (AnimatedContentScope) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1597440, 46);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: c4.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResetPasswordDialogContentKt.m5688B(viewModel, onLoginClick, i6, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: z */
    public static final C7315g m5725z(State state) {
        return (C7315g) state.getValue();
    }
}
