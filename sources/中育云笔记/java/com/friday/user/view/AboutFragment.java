package com.friday.user.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.painter.Painter;
import androidx.compose.p014ui.layout.ContentScale;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.platform.ComposeView;
import androidx.compose.p014ui.platform.ViewCompositionStrategy;
import androidx.compose.p014ui.res.ColorResources_androidKt;
import androidx.compose.p014ui.res.PainterResources_androidKt;
import androidx.compose.p014ui.res.PrimitiveResources_androidKt;
import androidx.compose.p014ui.res.StringResources_androidKt;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.style.TextAlign;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.LogUtils;
import com.friday.user.R$color;
import com.friday.user.R$dimen;
import com.friday.user.R$mipmap;
import com.friday.user.R$string;
import com.friday.user.view.AboutFragment;
import com.friday.user.viewmodel.UserViewModel;
import com.zykj.policy.ext.PolicyHelper;
import com.zykj.policy.p105ui.PolicyCheckView;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$LongRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10819z;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class AboutFragment extends Hilt_AboutFragment {

    /* renamed from: i */
    public final InterfaceC10773d f10625i;

    public AboutFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f10625i = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(UserViewModel.class), new InterfaceC9529a() { // from class: com.friday.user.view.AboutFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.user.view.AboutFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC9529a() { // from class: com.friday.user.view.AboutFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: A */
    public static final C10786q m7756A(AboutFragment aboutFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1565886886, i10, -1, "com.friday.user.view.AboutFragment.onCreateView.<anonymous>.<anonymous> (AboutFragment.kt:54)");
            }
            aboutFragment.m7766u(aboutFragment.m7767z().m7827p(), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: v */
    public static final C10786q m7762v(boolean z10, final AboutFragment aboutFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(647665220, i10, -1, "com.friday.user.view.AboutFragment.InfoCard.<anonymous> (AboutFragment.kt:63)");
            }
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = 0;
                composer.updateRememberedValue(objRememberedValue);
            }
            ref$IntRef.f23400c = ((Number) objRememberedValue).intValue();
            final Ref$LongRef ref$LongRef = new Ref$LongRef();
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = Long.valueOf(System.currentTimeMillis());
                composer.updateRememberedValue(objRememberedValue2);
            }
            ref$LongRef.f23401c = ((Number) objRememberedValue2).longValue();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composer, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxHeight$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer);
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R$mipmap.icon_about_logo, composer, 0);
            Modifier modifierM27458padding3ABfNKs = PaddingKt.m27458padding3ABfNKs(SizeKt.m27505size3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_54, composer, 0)), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_3, composer, 0));
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue3);
            }
            ImageKt.Image(painterPainterResource, (String) null, ClickableKt.m26984clickableO2vRcR0$default(modifierM27458padding3ABfNKs, (MutableInteractionSource) objRememberedValue3, null, false, null, null, new InterfaceC9529a() { // from class: h4.d
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return AboutFragment.m7763w(ref$LongRef, ref$IntRef, aboutFragment);
                }
            }, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, MenuKt.InTransitionDuration);
            float f10 = 0;
            SpacerKt.Spacer(SizeKt.m27507sizeVpY3zN4(companion2, C3186Dp.m33501constructorimpl(f10), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_10, composer, 0)), composer, 0);
            TextKt.m29301Text4IGK_g(AbstractC10819z.m23238K(AbstractC11958b.m26585f(R$string.app_name), "HD", "", false, 4, null) + ExifInterface.GPS_MEASUREMENT_INTERRUPTED + AppUtils.getAppVersionName(), (Modifier) null, Color.Companion.m30904getBlack0d7_KjU(), AbstractC11958b.m26592m(PrimitiveResources_androidKt.dimensionResource(R$dimen.text_9, composer, 0), composer, 0), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composer, 384, 0, 131058);
            SpacerKt.Spacer(SizeKt.m27507sizeVpY3zN4(companion2, C3186Dp.m33501constructorimpl(f10), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_5, composer, 0)), composer, 0);
            TextKt.m29301Text4IGK_g(StringResources_androidKt.stringResource(R$string.studio_name, composer, 0), (Modifier) null, ColorResources_androidKt.colorResource(z10 ? R$color.app_dark : R$color.date_time, composer, 0), AbstractC11958b.m26592m(PrimitiveResources_androidKt.dimensionResource(R$dimen.text_8, composer, 0), composer, 0), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composer, 0, 0, 131058);
            SpacerKt.Spacer(SizeKt.m27507sizeVpY3zN4(companion2, C3186Dp.m33501constructorimpl(f10), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_29, composer, 0)), composer, 0);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new InterfaceC9540l() { // from class: h4.e
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return AboutFragment.m7764x((Context) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            AndroidView_androidKt.AndroidView((InterfaceC9540l) objRememberedValue4, null, null, composer, 6, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: w */
    public static final C10786q m7763w(Ref$LongRef ref$LongRef, Ref$IntRef ref$IntRef, AboutFragment aboutFragment) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - ref$LongRef.f23401c < 500) {
            ref$IntRef.f23400c++;
        } else {
            ref$IntRef.f23400c = 0;
        }
        ref$LongRef.f23401c = jCurrentTimeMillis;
        if (ref$IntRef.f23400c >= 4) {
            ref$IntRef.f23400c = 0;
            LogUtils.m3888i("上传文档");
            aboutFragment.m7767z().m7831t();
        }
        return C10786q.f26013a;
    }

    /* renamed from: x */
    public static final PolicyCheckView m7764x(Context context) {
        AbstractC9979u.m20294g(context, "context");
        PolicyCheckView policyCheckView = new PolicyCheckView(context, null, 0, 6, null);
        policyCheckView.setCompoundDrawablePadding(0);
        policyCheckView.setCompoundDrawables(null, null, null, null);
        new PolicyHelper.Builder(context).m16595g("https://web.alicdn.zykj.org/privacypolicy/cloudnote/userServiceAgreement.html").m16594f("https://web.alicdn.zykj.org/privacypolicy/cloudnote/userPrivacyPolicy.html").m16591c("《用户服务协议》\t\t\t\t\t\t\t《用户隐私政策》").m16596h(policyCheckView);
        return policyCheckView;
    }

    /* renamed from: y */
    public static final C10786q m7765y(AboutFragment aboutFragment, boolean z10, int i10, int i11, Composer composer, int i12) {
        aboutFragment.m7766u(z10, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9979u.m20294g(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(viewLifecycleOwner));
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1565886886, true, new InterfaceC9544p() { // from class: h4.a
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return AboutFragment.m7756A(this.f21882c, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        return composeView;
    }

    /* renamed from: u */
    public final void m7766u(final boolean z10, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(316152728);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                z10 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(316152728, i12, -1, "com.friday.user.view.AboutFragment.InfoCard (AboutFragment.kt:62)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(647665220, true, new InterfaceC9544p() { // from class: h4.b
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return AboutFragment.m7762v(z10, this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: h4.c
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return AboutFragment.m7765y(this.f21885c, z10, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: z */
    public final UserViewModel m7767z() {
        return (UserViewModel) this.f10625i.getValue();
    }
}
