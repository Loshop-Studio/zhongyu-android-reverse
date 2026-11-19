package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.UiComposable;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class LookaheadScopeKt {
    private static final InterfaceC9544p defaultPlacementApproachInProgress = new InterfaceC9544p() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$defaultPlacementApproachInProgress$1
        @Override // p181hd.InterfaceC9544p
        public final Boolean invoke(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
            return Boolean.FALSE;
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @UiComposable
    public static final void LookaheadScope(final InterfaceC9545q interfaceC9545q, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1078066484);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(interfaceC9545q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = 1;
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1078066484, i11, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:48)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new LookaheadScopeImpl(null, i12, 0 == true ? 1 : 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LookaheadScopeImpl lookaheadScopeImpl = (LookaheadScopeImpl) objRememberedValue;
            C29151 c29151 = new InterfaceC9529a() { // from class: androidx.compose.ui.layout.LookaheadScopeKt.LookaheadScope.1
                @Override // p181hd.InterfaceC9529a
                public final LayoutNode invoke() {
                    return new LayoutNode(true, 0, 2, null);
                }
            };
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(c29151);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30309initimpl(composerM30305constructorimpl, new InterfaceC9540l() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LayoutNode) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(LayoutNode layoutNode) {
                    layoutNode.setVirtualLookaheadRoot$ui_release(true);
                }
            });
            Updater.m30312setimpl(composerM30305constructorimpl, lookaheadScopeImpl, new InterfaceC9544p() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2
                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((LayoutNode) obj, (LookaheadScopeImpl) obj2);
                    return C10786q.f26013a;
                }

                public final void invoke(final LayoutNode layoutNode, LookaheadScopeImpl lookaheadScopeImpl2) {
                    lookaheadScopeImpl2.setScopeCoordinates(new InterfaceC9529a() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2.1
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public final LayoutCoordinates invoke() {
                            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                            AbstractC9979u.m20291d(parent$ui_release);
                            return parent$ui_release.getInnerCoordinator$ui_release().getCoordinates();
                        }
                    });
                }
            });
            interfaceC9545q.invoke(lookaheadScopeImpl, composerStartRestartGroup, Integer.valueOf((i11 << 3) & 112));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.ui.layout.LookaheadScopeKt.LookaheadScope.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i13) {
                    LookaheadScopeKt.LookaheadScope(interfaceC9545q, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    public static final Modifier approachLayout(Modifier modifier, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC9545q interfaceC9545q) {
        return modifier.then(new ApproachLayoutElement(interfaceC9545q, interfaceC9540l, interfaceC9544p));
    }

    public static /* synthetic */ Modifier approachLayout$default(Modifier modifier, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC9545q interfaceC9545q, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9544p = defaultPlacementApproachInProgress;
        }
        return approachLayout(modifier, interfaceC9540l, interfaceC9544p, interfaceC9545q);
    }

    /* renamed from: localLookaheadPositionOf-Fgt4K4Q, reason: not valid java name */
    public static final long m32258localLookaheadPositionOfFgt4K4Q(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j10, boolean z10) {
        LayoutCoordinates lookaheadCoordinates = lookaheadScope.toLookaheadCoordinates(layoutCoordinates);
        LayoutCoordinates lookaheadCoordinates2 = lookaheadScope.toLookaheadCoordinates(layoutCoordinates2);
        return lookaheadCoordinates instanceof LookaheadLayoutCoordinates ? lookaheadCoordinates.mo32239localPositionOfS_NoaFU(lookaheadCoordinates2, j10, z10) : lookaheadCoordinates2 instanceof LookaheadLayoutCoordinates ? Offset.m30629constructorimpl(lookaheadCoordinates2.mo32239localPositionOfS_NoaFU(lookaheadCoordinates, j10, z10) ^ (-9223372034707292160L)) : lookaheadCoordinates.mo32239localPositionOfS_NoaFU(lookaheadCoordinates, j10, z10);
    }
}
