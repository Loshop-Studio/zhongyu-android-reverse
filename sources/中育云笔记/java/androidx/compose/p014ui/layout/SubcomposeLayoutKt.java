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
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class SubcomposeLayoutKt {
    private static final SubcomposeLayoutKt$ReusedSlotId$1 ReusedSlotId = new Object() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$ReusedSlotId$1
        public String toString() {
            return "ReusedSlotId";
        }
    };

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SubcomposeLayout(final Modifier modifier, InterfaceC9544p interfaceC9544p, Composer composer, final int i10, final int i11) {
        int i12;
        final InterfaceC9544p interfaceC9544p2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1298353104);
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
        if (composerStartRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1298353104, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:82)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new SubcomposeLayoutState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            interfaceC9544p2 = interfaceC9544p;
            SubcomposeLayout((SubcomposeLayoutState) objRememberedValue, modifier2, interfaceC9544p2, composerStartRestartGroup, (i12 << 3) & 1008, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            interfaceC9544p2 = interfaceC9544p;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i14) {
                    SubcomposeLayoutKt.SubcomposeLayout(modifier, interfaceC9544p2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    public static final SubcomposeSlotReusePolicy SubcomposeSlotReusePolicy(int i10) {
        return new FixedCountSubcomposeSlotReusePolicy(i10);
    }

    @Composable
    @UiComposable
    public static final void SubcomposeLayout(final SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-511989831);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(subcomposeLayoutState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-511989831, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:115)");
            }
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionContext compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            InterfaceC9529a constructor$ui_release = LayoutNode.Companion.getConstructor$ui_release();
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
            Updater.m30312setimpl(composerM30305constructorimpl, subcomposeLayoutState, subcomposeLayoutState.getSetRoot$ui_release());
            Updater.m30312setimpl(composerM30305constructorimpl, compositionContextRememberCompositionContext, subcomposeLayoutState.getSetCompositionContext$ui_release());
            Updater.m30312setimpl(composerM30305constructorimpl, interfaceC9544p, subcomposeLayoutState.getSetMeasurePolicy$ui_release());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            composerStartRestartGroup.endNode();
            if (!composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startReplaceGroup(-26326018);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomposeLayoutState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InterfaceC9529a() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m32335invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m32335invoke() {
                            subcomposeLayoutState.forceRecomposeChildren$ui_release();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                EffectsKt.SideEffect((InterfaceC9529a) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-26267397);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i14) {
                    SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier2, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }
}
