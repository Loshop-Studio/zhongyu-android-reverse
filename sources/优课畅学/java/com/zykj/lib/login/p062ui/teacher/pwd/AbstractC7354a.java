package com.zykj.lib.login.p062ui.teacher.pwd;

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
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.AlphaKt;
import androidx.compose.p013ui.draw.ClipKt;
import androidx.compose.p013ui.draw.ShadowKt;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.p013ui.text.PlatformTextStyle;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.input.KeyboardType;
import androidx.compose.p013ui.text.input.PasswordVisualTransformation;
import androidx.compose.p013ui.text.input.PlatformImeOptions;
import androidx.compose.p013ui.text.input.VisualTransformation;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.lib.login.R$string;
import com.zykj.lib.login.p062ui.teacher.pwd.AbstractC7354a;
import com.zykj.lib.login.p062ui.teacher.pwd.AbstractC7356c;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p219q3.C9794n;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* renamed from: com.zykj.lib.login.ui.teacher.pwd.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7354a {
    /* renamed from: j */
    public static final void m9376j(final ChangePsdViewModel viewModel, Composer composer, final int i10) {
        int i11;
        AbstractC9133u.m16133g(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-70545579);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.changed(viewModel) : composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-70545579, i11, -1, "com.zykj.lib.login.ui.teacher.pwd.ChangePasswordDialogContent (ChangePasswordDialogContent.kt:62)");
            }
            final State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(viewModel.m9337f(), (LifecycleOwner) null, (Lifecycle.State) null, (InterfaceC9100d) null, composerStartRestartGroup, 0, 7);
            if (m9377k(stateCollectAsStateWithLifecycle).m18345d().length() > 0) {
                AbstractC9133u.m16128b(m9377k(stateCollectAsStateWithLifecycle).m18347f(), m9377k(stateCollectAsStateWithLifecycle).m18345d());
            }
            float f10 = 12;
            SurfaceKt.m22549SurfaceT9BRK9s(WindowInsetsPadding_androidKt.imePadding(ShadowKt.m23904shadows4CzXII$default(SizeKt.wrapContentHeight$default(SizeKt.m20908width3ABfNKs(Modifier.Companion, C3156Dp.m26899constructorimpl(600)), null, false, 3, null), C3156Dp.m26899constructorimpl(10), RoundedCornerShapeKt.m21153RoundedCornerShape0680j_4(C3156Dp.m26899constructorimpl(f10)), false, 0L, 0L, 28, null)), RoundedCornerShapeKt.m21153RoundedCornerShape0680j_4(C3156Dp.m26899constructorimpl(f10)), Color.Companion.m24311getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(713744752, true, new InterfaceC10574p() { // from class: q3.a
                @Override // p300x7.InterfaceC10574p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7354a.m9378l(viewModel, stateCollectAsStateWithLifecycle, (Composer) obj, ((Integer) obj2).intValue());
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: q3.b
                @Override // p300x7.InterfaceC10574p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7354a.m9383q(viewModel, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: k */
    public static final C9794n m9377k(State state) {
        return (C9794n) state.getValue();
    }

    /* renamed from: l */
    public static final C8736p m9378l(final ChangePsdViewModel changePsdViewModel, final State state, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(713744752, i10, -1, "com.zykj.lib.login.ui.teacher.pwd.ChangePasswordDialogContent.<anonymous> (ChangePasswordDialogContent.kt:77)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Color.Companion companion2 = Color.Companion;
            Modifier modifierM20348backgroundbw27NRU$default = BackgroundKt.m20348backgroundbw27NRU$default(companion, companion2.m24313getWhite0d7_KjU(), null, 2, null);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM20348backgroundbw27NRU$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            InterfaceC10559a constructor = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composer);
            Updater.m23710setimpl(composerM23703constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f10 = 10;
            Modifier modifierM20858paddingVpY3zN4$default = PaddingKt.m20858paddingVpY3zN4$default(BackgroundKt.m20348backgroundbw27NRU$default(ClipKt.clip(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null), RoundedCornerShapeKt.m21153RoundedCornerShape0680j_4(C3156Dp.m26899constructorimpl(12))), companion2.m24313getWhite0d7_KjU(), null, 2, null), 0.0f, C3156Dp.m26899constructorimpl(f10), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM20858paddingVpY3zN4$default);
            InterfaceC10559a constructor2 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM23703constructorimpl2 = Updater.m23703constructorimpl(composer);
            Updater.m23710setimpl(composerM23703constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM23703constructorimpl2.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM23703constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM23703constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m23710setimpl(composerM23703constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m22699Text4IGK_g(StringResources_androidKt.stringResource(R$string.change_password, composer, 0), PaddingKt.m20860paddingqDBjuR0$default(companion, 0.0f, C3156Dp.m26899constructorimpl(20), 0.0f, 0.0f, 13, null), ColorKt.Color(4283058762L), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC10570l) null, (TextStyle) null, composer, 200112, 0, 131024);
            TextKt.m22699Text4IGK_g(StringResources_androidKt.stringResource(R$string.hint_change_pwd, composer, 0), PaddingKt.m20858paddingVpY3zN4$default(PaddingKt.m20860paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, C3156Dp.m26899constructorimpl(f10), 0.0f, 0.0f, 13, null), C3156Dp.m26899constructorimpl(16), 0.0f, 2, null), ColorKt.Color(4288256409L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m26776boximpl(TextAlign.Companion.m26783getCentere0LSkKk()), 0L, 0, false, 0, 0, (InterfaceC10570l) null, (TextStyle) null, composer, 3504, 0, 130544);
            SpacerKt.Spacer(SizeKt.m20889height3ABfNKs(companion, C3156Dp.m26899constructorimpl(f10)), composer, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            String strStringResource = StringResources_androidKt.stringResource(R$string.new_pwd, composer, 0);
            String strM18347f = m9377k(state).m18347f();
            PasswordSecurityLevel passwordSecurityLevelM18346e = m9377k(state).m18346e();
            boolean zM18349h = m9377k(state).m18349h();
            boolean zChangedInstance = composer.changedInstance(changePsdViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC10570l() { // from class: q3.c
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj) {
                        return AbstractC7354a.m9379m(changePsdViewModel, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            m9384r(modifierFillMaxWidth$default, strStringResource, strM18347f, (InterfaceC10570l) objRememberedValue, passwordSecurityLevelM18346e, zM18349h, null, 0, composer, 6, 192);
            SpacerKt.Spacer(SizeKt.m20889height3ABfNKs(companion, C3156Dp.m26899constructorimpl(f10)), composer, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            String strStringResource2 = StringResources_androidKt.stringResource(R$string.sure_pwd, composer, 0);
            String strM18345d = m9377k(state).m18345d();
            PasswordSecurityLevel passwordSecurityLevelM18346e2 = m9377k(state).m18346e();
            boolean zM18348g = m9377k(state).m18348g();
            String strM18344c = m9377k(state).m18344c();
            boolean zChangedInstance2 = composer.changedInstance(changePsdViewModel);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC10570l() { // from class: q3.d
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj) {
                        return AbstractC7354a.m9380n(changePsdViewModel, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            m9384r(modifierFillMaxWidth$default2, strStringResource2, strM18345d, (InterfaceC10570l) objRememberedValue2, passwordSecurityLevelM18346e2, zM18348g, strM18344c, 0, composer, 6, 128);
            boolean zChangedInstance3 = composer.changedInstance(changePsdViewModel);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC10559a() { // from class: q3.e
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return AbstractC7354a.m9381o(changePsdViewModel);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            ButtonKt.Button((InterfaceC10559a) objRememberedValue3, PaddingKt.m20860paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(PaddingKt.m20858paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3156Dp.m26899constructorimpl(24), 0.0f, 2, null), null, false, 3, null), 0.0f, C3156Dp.m26899constructorimpl(f10), 0.0f, C3156Dp.m26899constructorimpl(f10), 5, null), m9377k(state).m18351j() && !m9377k(state).m18350i(), RoundedCornerShapeKt.m21153RoundedCornerShape0680j_4(C3156Dp.m26899constructorimpl(15)), ButtonDefaults.INSTANCE.m21787buttonColorsro_MJ88(m9377k(state).m18351j() ? ColorKt.Color(4278221823L) : ColorKt.Color(4289769648L), companion2.m24313getWhite0d7_KjU(), ColorKt.Color(4289769648L), companion2.m24313getWhite0d7_KjU(), composer, (ButtonDefaults.$stable << 12) | 3504, 0), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1724112124, true, new InterfaceC10575q() { // from class: q3.f
                @Override // p300x7.InterfaceC10575q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC7354a.m9382p(state, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
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
        return C8736p.f16368a;
    }

    /* renamed from: m */
    public static final C8736p m9379m(ChangePsdViewModel changePsdViewModel, String it) {
        AbstractC9133u.m16133g(it, "it");
        changePsdViewModel.m9338g(new AbstractC7356c.b(it));
        return C8736p.f16368a;
    }

    /* renamed from: n */
    public static final C8736p m9380n(ChangePsdViewModel changePsdViewModel, String it) {
        AbstractC9133u.m16133g(it, "it");
        changePsdViewModel.m9338g(new AbstractC7356c.a(it));
        return C8736p.f16368a;
    }

    /* renamed from: o */
    public static final C8736p m9381o(ChangePsdViewModel changePsdViewModel) {
        changePsdViewModel.m9338g(AbstractC7356c.c.f10098a);
        return C8736p.f16368a;
    }

    /* renamed from: p */
    public static final C8736p m9382p(State state, RowScope Button, Composer composer, int i10) {
        AbstractC9133u.m16133g(Button, "$this$Button");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1724112124, i10, -1, "com.zykj.lib.login.ui.teacher.pwd.ChangePasswordDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChangePasswordDialogContent.kt:159)");
            }
            if (m9377k(state).m18350i()) {
                composer.startReplaceGroup(489659389);
                ProgressIndicatorKt.m22367CircularProgressIndicatorLxG7B9w(SizeKt.m20903size3ABfNKs(Modifier.Companion, C3156Dp.m26899constructorimpl(20)), Color.Companion.m24313getWhite0d7_KjU(), C3156Dp.m26899constructorimpl(2), 0L, 0, composer, 438, 24);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(489920223);
                TextKt.m22699Text4IGK_g(StringResources_androidKt.stringResource(R$string.change_password, composer, 0), (Modifier) null, Color.Companion.m24313getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC10570l) null, (TextStyle) null, composer, 3456, 0, 131058);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C8736p.f16368a;
    }

    /* renamed from: q */
    public static final C8736p m9383q(ChangePsdViewModel changePsdViewModel, int i10, Composer composer, int i11) {
        m9376j(changePsdViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C8736p.f16368a;
    }

    /* renamed from: r */
    public static final void m9384r(Modifier modifier, final String label, final String value, final InterfaceC10570l onValueChange, final PasswordSecurityLevel securityLevel, boolean z10, String str, int i10, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        boolean z11;
        String str2;
        Composer composer2;
        final int i14;
        final String str3;
        final Modifier modifier3;
        final boolean z12;
        final int i15;
        String str4;
        AbstractC9133u.m16133g(label, "label");
        AbstractC9133u.m16133g(value, "value");
        AbstractC9133u.m16133g(onValueChange, "onValueChange");
        AbstractC9133u.m16133g(securityLevel, "securityLevel");
        Composer composerStartRestartGroup = composer.startRestartGroup(847823588);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= composerStartRestartGroup.changed(label) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= composerStartRestartGroup.changed(value) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onValueChange) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= composerStartRestartGroup.changed(securityLevel.ordinal()) ? 16384 : 8192;
        }
        int i17 = i12 & 32;
        if (i17 != 0) {
            i13 |= ProfileVerifier.CompilationStatus.f1860xf2722a21;
            z11 = z10;
        } else {
            z11 = z10;
            if ((i11 & ProfileVerifier.CompilationStatus.f1860xf2722a21) == 0) {
                i13 |= composerStartRestartGroup.changed(z11) ? 131072 : 65536;
            }
        }
        int i18 = i12 & 64;
        if (i18 != 0) {
            i13 |= 1572864;
            str2 = str;
        } else {
            str2 = str;
            if ((i11 & 1572864) == 0) {
                i13 |= composerStartRestartGroup.changed(str2) ? 1048576 : 524288;
            }
        }
        int i19 = i12 & 128;
        if (i19 != 0) {
            i13 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            i13 |= composerStartRestartGroup.changed(i10) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((i13 & 4793491) != 4793490, i13 & 1)) {
            Modifier modifier4 = i16 != 0 ? Modifier.Companion : modifier2;
            boolean z13 = i17 != 0 ? false : z11;
            String str5 = i18 != 0 ? null : str2;
            int i20 = i19 != 0 ? 16 : i10;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(847823588, i13, -1, "com.zykj.lib.login.ui.teacher.pwd.PasswordInputField (ChangePasswordDialogContent.kt:200)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            InterfaceC10559a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composerStartRestartGroup);
            Updater.m23710setimpl(composerM23703constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            float f10 = 16;
            float f11 = 4;
            Modifier modifierM20348backgroundbw27NRU$default = BackgroundKt.m20348backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m20858paddingVpY3zN4$default(SizeKt.m20889height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), C3156Dp.m26899constructorimpl(50)), C3156Dp.m26899constructorimpl(f10), 0.0f, 2, null), RoundedCornerShapeKt.m21153RoundedCornerShape0680j_4(C3156Dp.m26899constructorimpl(f11))), ColorKt.Color(4294440951L), null, 2, null);
            float fM26899constructorimpl = C3156Dp.m26899constructorimpl(1);
            Color.Companion companion4 = Color.Companion;
            Modifier modifierM20361borderxT4_qwU = BorderKt.m20361borderxT4_qwU(modifierM20348backgroundbw27NRU$default, fM26899constructorimpl, z13 ? Color.m24275copywmQWz5c$default(companion4.m24310getRed0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null) : companion4.m24311getTransparent0d7_KjU(), RoundedCornerShapeKt.m21153RoundedCornerShape0680j_4(C3156Dp.m26899constructorimpl(f11)));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM20361borderxT4_qwU);
            InterfaceC10559a constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM23703constructorimpl2 = Updater.m23703constructorimpl(composerStartRestartGroup);
            Updater.m23710setimpl(composerM23703constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM23703constructorimpl2.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM23703constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM23703constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m23710setimpl(composerM23703constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifier5 = modifier4;
            int i21 = i20;
            int i22 = i13;
            TextKt.m22699Text4IGK_g(label, PaddingKt.m20860paddingqDBjuR0$default(SizeKt.wrapContentWidth$default(companion3, null, false, 3, null), C3156Dp.m26899constructorimpl(10), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4281545523L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC10570l) null, (TextStyle) null, composerStartRestartGroup, ((i13 >> 3) & 14) | 3504, 0, 131056);
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), 0.0f, 1, null);
            Color.Companion companion5 = Color.Companion;
            TextStyle textStyle = new TextStyle(companion5.m24302getBlack0d7_KjU(), TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (AbstractC9126n) null);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m26602getPasswordPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED, (AbstractC9126n) null);
            PasswordVisualTransformation passwordVisualTransformation = new PasswordVisualTransformation((char) 0, 1, null);
            TextFieldColors textFieldColorsM22680colors0hiis_0 = TextFieldDefaults.INSTANCE.m22680colors0hiis_0(companion5.m24302getBlack0d7_KjU(), companion5.m24302getBlack0d7_KjU(), 0L, 0L, companion5.m24311getTransparent0d7_KjU(), companion5.m24311getTransparent0d7_KjU(), companion5.m24311getTransparent0d7_KjU(), companion5.m24311getTransparent0d7_KjU(), companion5.m24302getBlack0d7_KjU(), 0L, null, companion5.m24311getTransparent0d7_KjU(), companion5.m24311getTransparent0d7_KjU(), companion5.m24311getTransparent0d7_KjU(), companion5.m24311getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 115040310, 28080, 0, 0, 3072, 2147452428, 4095);
            boolean z14 = ((i22 & 7168) == 2048) | ((29360128 & i22) == 8388608);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z14 || objRememberedValue == Composer.Companion.getEmpty()) {
                i15 = i21;
                objRememberedValue = new InterfaceC10570l() { // from class: q3.g
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj) {
                        return AbstractC7354a.m9385s(i15, onValueChange, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i15 = i21;
            }
            int i23 = i15;
            TextFieldKt.TextField(value, (InterfaceC10570l) objRememberedValue, modifierFillMaxHeight$default, false, false, textStyle, (InterfaceC10574p) null, (InterfaceC10574p) ComposableLambdaKt.rememberComposableLambda(774047545, true, new InterfaceC10574p() { // from class: q3.h
                @Override // p300x7.InterfaceC10574p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7354a.m9386t(securityLevel, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), (InterfaceC10574p) null, (InterfaceC10574p) null, (InterfaceC10574p) null, (InterfaceC10574p) null, (InterfaceC10574p) null, false, (VisualTransformation) passwordVisualTransformation, keyboardOptions, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColorsM22680colors0hiis_0, composerStartRestartGroup, ((i22 >> 6) & 14) | 12779520, 12779520, 0, 4013912);
            composerStartRestartGroup.endNode();
            if (str5 == null) {
                composerStartRestartGroup.startReplaceGroup(-313250649);
                String strStringResource = StringResources_androidKt.stringResource(securityLevel.m9365d(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                str4 = strStringResource;
            } else {
                composerStartRestartGroup.startReplaceGroup(-313251052);
                composerStartRestartGroup.endReplaceGroup();
                str4 = str5;
            }
            composer2 = composerStartRestartGroup;
            TextKt.m22699Text4IGK_g(str4, AlphaKt.alpha(PaddingKt.m20860paddingqDBjuR0$default(companion3, C3156Dp.m26899constructorimpl(f10), C3156Dp.m26899constructorimpl(f11), 0.0f, 0.0f, 12, null), z13 ? 1.0f : 0.0f), ColorKt.Color(4294916912L), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC10570l) null, (TextStyle) null, composer2, 3456, 0, 131056);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z12 = z13;
            str3 = str5;
            modifier3 = modifier5;
            i14 = i23;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            i14 = i10;
            str3 = str2;
            modifier3 = modifier2;
            z12 = z11;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: q3.i
                @Override // p300x7.InterfaceC10574p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7354a.m9387u(modifier3, label, value, onValueChange, securityLevel, z12, str3, i14, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: s */
    public static final C8736p m9385s(int i10, InterfaceC10570l interfaceC10570l, String newValue) {
        AbstractC9133u.m16133g(newValue, "newValue");
        if (newValue.length() <= i10) {
            interfaceC10570l.invoke(newValue);
        }
        return C8736p.f16368a;
    }

    /* renamed from: t */
    public static final C8736p m9386t(PasswordSecurityLevel passwordSecurityLevel, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(774047545, i10, -1, "com.zykj.lib.login.ui.teacher.pwd.PasswordInputField.<anonymous>.<anonymous>.<anonymous> (ChangePasswordDialogContent.kt:239)");
            }
            TextKt.m22699Text4IGK_g(StringResources_androidKt.stringResource(passwordSecurityLevel.m9363b(), composer, 0), (Modifier) null, ColorKt.Color(4288256409L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC10570l) null, (TextStyle) null, composer, 3456, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C8736p.f16368a;
    }

    /* renamed from: u */
    public static final C8736p m9387u(Modifier modifier, String str, String str2, InterfaceC10570l interfaceC10570l, PasswordSecurityLevel passwordSecurityLevel, boolean z10, String str3, int i10, int i11, int i12, Composer composer, int i13) {
        m9384r(modifier, str, str2, interfaceC10570l, passwordSecurityLevel, z10, str3, i10, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return C8736p.f16368a;
    }
}
