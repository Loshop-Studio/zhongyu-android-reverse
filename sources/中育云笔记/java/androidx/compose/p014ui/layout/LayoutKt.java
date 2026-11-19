package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.UiComposable;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class LayoutKt {
    public static final int LargeDimension = 32767;

    @Composable
    @UiComposable
    public static final void Layout(InterfaceC9544p interfaceC9544p, Modifier modifier, MeasurePolicy measurePolicy, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        InterfaceC9529a constructor = companion.getConstructor();
        int i12 = ((i10 << 6) & 896) | 6;
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
        Updater.m30312setimpl(composerM30305constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        interfaceC9544p.invoke(composer, Integer.valueOf((i12 >> 6) & 14));
        composer.endNode();
    }

    @Composable
    @InterfaceC10770a
    @UiComposable
    public static final void MultiMeasureLayout(Modifier modifier, final InterfaceC9544p interfaceC9544p, final MeasurePolicy measurePolicy, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1949933075);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(measurePolicy) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949933075, i12, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:237)");
            }
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            InterfaceC9529a constructor$ui_release = LayoutNode.Companion.getConstructor$ui_release();
            int i14 = ((i12 << 3) & 896) | 6;
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor$ui_release);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m30309initimpl(composerM30305constructorimpl, new InterfaceC9540l() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LayoutNode) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(LayoutNode layoutNode) {
                    layoutNode.setCanMultiMeasure$ui_release(true);
                }
            });
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            interfaceC9544p.invoke(composerStartRestartGroup, Integer.valueOf((i14 >> 6) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i15) {
                    LayoutKt.MultiMeasureLayout(modifier2, interfaceC9544p, measurePolicy, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    public static final InterfaceC9544p combineAsVirtualLayouts(final List<? extends InterfaceC9544p> list) {
        return ComposableLambdaKt.composableLambdaInstance(-1953651383, true, new InterfaceC9544p() { // from class: androidx.compose.ui.layout.LayoutKt.combineAsVirtualLayouts.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C10786q.f26013a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer, int i10) {
                if (!composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1953651383, i10, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:176)");
                }
                List<InterfaceC9544p> list2 = list;
                int size = list2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    InterfaceC9544p interfaceC9544p = list2.get(i11);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    InterfaceC9529a virtualConstructor = companion.getVirtualConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(virtualConstructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer);
                    InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    interfaceC9544p.invoke(composer, 0);
                    composer.endNode();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @InterfaceC10770a
    public static final InterfaceC9545q materializerOf(final Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-55743822, true, new InterfaceC9545q() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOfWithCompositionLocalInjection$1
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                m32254invokeDeg8D_g(((SkippableUpdater) obj).m30283unboximpl(), (Composer) obj2, ((Number) obj3).intValue());
                return C10786q.f26013a;
            }

            @Composable
            /* renamed from: invoke-Deg8D_g, reason: not valid java name */
            public final void m32254invokeDeg8D_g(Composer composer, Composer composer2, int i10) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-55743822, i10, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:218)");
                }
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                Modifier modifierMaterializeWithCompositionLocalInjectionInternal = ComposedModifierKt.materializeWithCompositionLocalInjectionInternal(composer2, modifier);
                composer.startReplaceableGroup(509942095);
                Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeWithCompositionLocalInjectionInternal, companion.getSetModifier());
                InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final InterfaceC9545q modifierMaterializerOf(final Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-1586257396, true, new InterfaceC9545q() { // from class: androidx.compose.ui.layout.LayoutKt.materializerOf.1
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                m32253invokeDeg8D_g(((SkippableUpdater) obj).m30283unboximpl(), (Composer) obj2, ((Number) obj3).intValue());
                return C10786q.f26013a;
            }

            @Composable
            /* renamed from: invoke-Deg8D_g, reason: not valid java name */
            public final void m32253invokeDeg8D_g(Composer composer, Composer composer2, int i10) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1586257396, i10, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:196)");
                }
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier);
                composer.startReplaceableGroup(509942095);
                Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @Composable
    @UiComposable
    public static final void Layout(Modifier modifier, MeasurePolicy measurePolicy, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
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
        Updater.m30312setimpl(composerM30305constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        composer.endNode();
    }

    @Composable
    @UiComposable
    public static final void Layout(List<? extends InterfaceC9544p> list, Modifier modifier, MultiContentMeasurePolicy multiContentMeasurePolicy, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        InterfaceC9544p interfaceC9544pCombineAsVirtualLayouts = combineAsVirtualLayouts(list);
        boolean z10 = (((i10 & 896) ^ 384) > 256 && composer.changed(multiContentMeasurePolicy)) || (i10 & 384) == 256;
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
            composer.updateRememberedValue(objRememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
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
        Updater.m30312setimpl(composerM30305constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        interfaceC9544pCombineAsVirtualLayouts.invoke(composer, 0);
        composer.endNode();
    }
}
