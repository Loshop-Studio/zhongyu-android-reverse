package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LookaheadDelegate;
import androidx.compose.p014ui.node.NodeCoordinator;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LookaheadScopeImpl implements LookaheadScope {
    public static final int $stable = 8;
    private InterfaceC9529a scopeCoordinates;

    /* JADX WARN: Multi-variable type inference failed */
    public LookaheadScopeImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.p014ui.layout.LookaheadScope
    public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope) {
        InterfaceC9529a interfaceC9529a = this.scopeCoordinates;
        AbstractC9979u.m20291d(interfaceC9529a);
        return (LayoutCoordinates) interfaceC9529a.invoke();
    }

    public final InterfaceC9529a getScopeCoordinates() {
        return this.scopeCoordinates;
    }

    public final void setScopeCoordinates(InterfaceC9529a interfaceC9529a) {
        this.scopeCoordinates = interfaceC9529a;
    }

    @Override // androidx.compose.p014ui.layout.LookaheadScope
    public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates2 = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates2 != null) {
            return lookaheadLayoutCoordinates2;
        }
        AbstractC9979u.m20292e(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        NodeCoordinator nodeCoordinator = (NodeCoordinator) layoutCoordinates;
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) ? nodeCoordinator : lookaheadLayoutCoordinates;
    }

    public LookaheadScopeImpl(InterfaceC9529a interfaceC9529a) {
        this.scopeCoordinates = interfaceC9529a;
    }

    public /* synthetic */ LookaheadScopeImpl(InterfaceC9529a interfaceC9529a, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : interfaceC9529a);
    }
}
