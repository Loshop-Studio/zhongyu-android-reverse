package com.friday.user.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorFilter;
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
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.friday.common.base.SimpleFragment;
import com.friday.user.R$color;
import com.friday.user.R$dimen;
import com.friday.user.R$mipmap;
import com.friday.user.R$string;
import com.friday.user.view.PersonalInfoFragment;
import com.friday.user.viewmodel.UserViewModel;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class PersonalInfoFragment extends Hilt_PersonalInfoFragment {

    /* renamed from: k */
    public static final int f10651k = SimpleFragment.f5626e;

    /* renamed from: A */
    public static final C10786q m7785A(PersonalInfoFragment personalInfoFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-856547472, i10, -1, "com.friday.user.view.PersonalInfoFragment.onCreateView.<anonymous>.<anonymous> (PersonalInfoFragment.kt:45)");
            }
            personalInfoFragment.m7794u(null, composer, SimpleFragment.f5626e << 3, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: v */
    public static final String m7790v(State state) {
        return (String) state.getValue();
    }

    /* renamed from: w */
    public static final C10786q m7791w(PersonalInfoFragment personalInfoFragment, State state, Composer composer, int i10) throws Resources.NotFoundException {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1271518049, i10, -1, "com.friday.user.view.PersonalInfoFragment.InfoCard.<anonymous> (PersonalInfoFragment.kt:54)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM27462paddingqDBjuR0$default = PaddingKt.m27462paddingqDBjuR0$default(companion, 0.0f, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_19, composer, 0), 0.0f, 0.0f, 13, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM27462paddingqDBjuR0$default);
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
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM26949backgroundbw27NRU = BackgroundKt.m26949backgroundbw27NRU(SizeKt.m27507sizeVpY3zN4(companion, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_324, composer, 0), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_56, composer, 0)), Color.Companion.m30915getWhite0d7_KjU(), RoundedCornerShapeKt.m27755RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R$dimen.view_5, composer, 0)));
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM26949backgroundbw27NRU);
            InterfaceC9529a constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM30305constructorimpl2 = Updater.m30305constructorimpl(composer);
            Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM27491height3ABfNKs = SizeKt.m27491height3ABfNKs(PaddingKt.m27462paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_14, composer, 0), 0.0f, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_14, composer, 0), 0.0f, 10, null), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_28, composer, 0));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM27491height3ABfNKs);
            InterfaceC9529a constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM30305constructorimpl3 = Updater.m30305constructorimpl(composer);
            Updater.m30312setimpl(composerM30305constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM30305constructorimpl3.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM30305constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM30305constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m30312setimpl(composerM30305constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(R$string.head_portrait, composer, 0);
            int i11 = SimpleFragment.f5626e;
            personalInfoFragment.m7795y(strStringResource, composer, i11 << 3);
            ImageKt.Image(PainterResources_androidKt.painterResource(R$mipmap.icon_person_s, composer, 0), (String) null, SizeKt.m27505size3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_18, composer, 0)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, MenuKt.InTransitionDuration);
            composer.endNode();
            DividerKt.m28662Divider9IZ8Weo(null, 0.0f, 0L, composer, 0, 7);
            Modifier modifierM27491height3ABfNKs2 = SizeKt.m27491height3ABfNKs(PaddingKt.m27462paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_14, composer, 0), 0.0f, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_14, composer, 0), 0.0f, 10, null), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_28, composer, 0));
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM27491height3ABfNKs2);
            InterfaceC9529a constructor4 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM30305constructorimpl4 = Updater.m30305constructorimpl(composer);
            Updater.m30312setimpl(composerM30305constructorimpl4, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM30305constructorimpl4.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM30305constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM30305constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m30312setimpl(composerM30305constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            personalInfoFragment.m7795y(StringResources_androidKt.stringResource(R$string.nickname, composer, 0), composer, i11 << 3);
            personalInfoFragment.m7795y(m7790v(state), composer, i11 << 3);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: x */
    public static final C10786q m7792x(PersonalInfoFragment personalInfoFragment, UserViewModel userViewModel, int i10, int i11, Composer composer, int i12) {
        personalInfoFragment.m7794u(userViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* renamed from: z */
    public static final C10786q m7793z(PersonalInfoFragment personalInfoFragment, String str, int i10, Composer composer, int i11) {
        personalInfoFragment.m7795y(str, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
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
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-856547472, true, new InterfaceC9544p() { // from class: h4.m
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return PersonalInfoFragment.m7785A(this.f21902c, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        return composeView;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7794u(final com.friday.user.viewmodel.UserViewModel r12, androidx.compose.runtime.Composer r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.user.view.PersonalInfoFragment.m7794u(com.friday.user.viewmodel.UserViewModel, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/中育云笔记/smali_classes5/com/friday/user/view/PersonalInfoFragment.smali:1948
    }

    /* renamed from: y */
    public final void m7795y(final String text, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        AbstractC9979u.m20294g(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-278378689);
        if ((i10 & 6) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(text) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-278378689, i11, -1, "com.friday.user.view.PersonalInfoFragment.TheText (PersonalInfoFragment.kt:115)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m29301Text4IGK_g(text, (Modifier) null, ColorResources_androidKt.colorResource(R$color.app_l_dark, composerStartRestartGroup, 0), AbstractC11958b.m26592m(PrimitiveResources_androidKt.dimensionResource(R$dimen.view_9, composerStartRestartGroup, 0), composerStartRestartGroup, 0), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composer2, i11 & 14, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: h4.p
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return PersonalInfoFragment.m7793z(this.f21909c, text, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
