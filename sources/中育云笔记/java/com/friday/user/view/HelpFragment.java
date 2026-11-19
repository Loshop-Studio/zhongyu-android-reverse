package com.friday.user.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.platform.ComposeView;
import androidx.compose.p014ui.platform.ViewCompositionStrategy;
import androidx.compose.p014ui.res.ColorResources_androidKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.profileinstaller.ProfileVerifier;
import com.friday.common.base.SimpleFragment;
import com.friday.user.R$color;
import com.friday.user.R$dimen;
import com.friday.user.R$string;
import com.friday.user.view.HelpFragment;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class HelpFragment extends Hilt_HelpFragment {

    /* renamed from: k */
    public static final int f10630k = SimpleFragment.f5626e;

    /* renamed from: B */
    public static final C10786q m7768B(HelpFragment helpFragment, String str, int i10, Composer composer, int i11) {
        helpFragment.m7778A(str, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C10786q.f26013a;
    }

    /* renamed from: C */
    public static final C10786q m7769C(HelpFragment helpFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-559729328, i10, -1, "com.friday.user.view.HelpFragment.onCreateView.<anonymous>.<anonymous> (HelpFragment.kt:41)");
            }
            helpFragment.m7780x(composer, SimpleFragment.f5626e);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: w */
    public static final C10786q m7775w(HelpFragment helpFragment, String str, int i10, Composer composer, int i11) {
        helpFragment.m7779v(str, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C10786q.f26013a;
    }

    /* renamed from: y */
    public static final C10786q m7776y(HelpFragment helpFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-140486842, i10, -1, "com.friday.user.view.HelpFragment.InfoCard.<anonymous> (HelpFragment.kt:48)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m27462paddingqDBjuR0$default(Modifier.Companion, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_16, composer, 0), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_16, composer, 0), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_16, composer, 0), 0.0f, 8, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion.getConstructor();
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
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i11 = SimpleFragment.f5626e;
            helpFragment.m7778A("师生如何使用云笔记上课", composer, (i11 << 3) | 6);
            helpFragment.m7779v(StringResources_androidKt.stringResource(R$string.help_class, composer, 0), composer, i11 << 3);
            helpFragment.m7778A("课堂演示功能", composer, (i11 << 3) | 6);
            helpFragment.m7779v(StringResources_androidKt.stringResource(R$string.class_demo, composer, 0), composer, i11 << 3);
            helpFragment.m7778A("课堂互动功能", composer, (i11 << 3) | 6);
            helpFragment.m7779v(StringResources_androidKt.stringResource(R$string.class_usage, composer, 0), composer, i11 << 3);
            helpFragment.m7778A("编辑笔记", composer, (i11 << 3) | 6);
            helpFragment.m7779v(StringResources_androidKt.stringResource(R$string.help_text_compile, composer, 0), composer, i11 << 3);
            helpFragment.m7778A("管理笔记", composer, (i11 << 3) | 6);
            helpFragment.m7779v(StringResources_androidKt.stringResource(R$string.help_text_management, composer, 0), composer, i11 << 3);
            helpFragment.m7778A("离线机制", composer, (i11 << 3) | 6);
            helpFragment.m7779v(StringResources_androidKt.stringResource(R$string.offline_help, composer, 0), composer, i11 << 3);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: z */
    public static final C10786q m7777z(HelpFragment helpFragment, int i10, Composer composer, int i11) {
        helpFragment.m7780x(composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C10786q.f26013a;
    }

    /* renamed from: A */
    public final void m7778A(final String content, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        AbstractC9979u.m20294g(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1676486808);
        if ((i10 & 6) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(content) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1676486808, i11, -1, "com.friday.user.view.HelpFragment.TitleText (HelpFragment.kt:74)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m29301Text4IGK_g(content, (Modifier) null, ColorResources_androidKt.colorResource(R$color.app_l_dark, composerStartRestartGroup, 0), AbstractC11958b.m26592m(PrimitiveResources_androidKt.dimensionResource(R$dimen.view_9, composerStartRestartGroup, 0), composerStartRestartGroup, 0), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composerStartRestartGroup, (i11 & 14) | ProfileVerifier.CompilationStatus.f1974xf2722a21, 0, 131026);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m27491height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_5, composer2, 0)), composer2, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: h4.k
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return HelpFragment.m7768B(this.f21899c, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
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
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-559729328, true, new InterfaceC9544p() { // from class: h4.g
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return HelpFragment.m7769C(this.f21892c, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        return composeView;
    }

    /* renamed from: v */
    public final void m7779v(final String content, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        AbstractC9979u.m20294g(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1702383337);
        if ((i10 & 6) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(content) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1702383337, i11, -1, "com.friday.user.view.HelpFragment.ContentText (HelpFragment.kt:86)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m29301Text4IGK_g(content, (Modifier) null, ColorResources_androidKt.colorResource(R$color.app_l_dark, composerStartRestartGroup, 0), AbstractC11958b.m26592m(PrimitiveResources_androidKt.dimensionResource(R$dimen.view_9, composerStartRestartGroup, 0), composerStartRestartGroup, 0), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, AbstractC11958b.m26592m(PrimitiveResources_androidKt.dimensionResource(R$dimen.view_20, composerStartRestartGroup, 0), composerStartRestartGroup, 0), 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composerStartRestartGroup, i11 & 14, 0, 130034);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m27491height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_5, composer2, 0)), composer2, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: h4.j
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return HelpFragment.m7775w(this.f21896c, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: x */
    public final void m7780x(Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(505135986);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(505135986, i11, -1, "com.friday.user.view.HelpFragment.InfoCard (HelpFragment.kt:47)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(-140486842, true, new InterfaceC9544p() { // from class: h4.h
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return HelpFragment.m7776y(this.f21893c, (Composer) obj, ((Integer) obj2).intValue());
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: h4.i
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return HelpFragment.m7777z(this.f21894c, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
