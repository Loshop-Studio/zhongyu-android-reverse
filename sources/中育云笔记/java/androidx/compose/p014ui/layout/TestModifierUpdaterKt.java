package androidx.compose.p014ui.layout;

import androidx.annotation.RestrictTo;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class TestModifierUpdaterKt {
    @Composable
    @InterfaceC10770a
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void TestModifierUpdaterLayout(final InterfaceC9540l interfaceC9540l, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1673066036);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(interfaceC9540l) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1673066036, i11, -1, "androidx.compose.ui.layout.TestModifierUpdaterLayout (TestModifierUpdater.kt:48)");
            }
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1
                @Override // androidx.compose.p014ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                    return MeasureScope.layout$default(measureScope, Constraints.m33454getMaxWidthimpl(j10), Constraints.m33453getMaxHeightimpl(j10), null, new InterfaceC9540l() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1.1
                        public final void invoke(Placeable.PlacementScope placementScope) {
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return C10786q.f26013a;
                        }
                    }, 4, null);
                }
            };
            InterfaceC9529a constructor$ui_release = LayoutNode.Companion.getConstructor$ui_release();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor$ui_release);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Updater.m30312setimpl(composerM30305constructorimpl, testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1, companion.getSetMeasurePolicy());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30309initimpl(composerM30305constructorimpl, new InterfaceC9540l() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LayoutNode) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(LayoutNode layoutNode) {
                    interfaceC9540l.invoke(new TestModifierUpdater(layoutNode));
                }
            });
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i12) {
                    TestModifierUpdaterKt.TestModifierUpdaterLayout(interfaceC9540l, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }
}
