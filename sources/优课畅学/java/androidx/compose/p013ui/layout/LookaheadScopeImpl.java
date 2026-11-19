package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LookaheadDelegate;
import androidx.compose.p013ui.node.NodeCoordinator;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LookaheadScopeImpl implements LookaheadScope {
    public static final int $stable = 8;
    private InterfaceC10559a scopeCoordinates;

    /* JADX WARN: Multi-variable type inference failed */
    public LookaheadScopeImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.p013ui.layout.LookaheadScope
    public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope) {
        InterfaceC10559a interfaceC10559a = this.scopeCoordinates;
        AbstractC9133u.m16130d(interfaceC10559a);
        return (LayoutCoordinates) interfaceC10559a.invoke();
    }

    public final InterfaceC10559a getScopeCoordinates() {
        return this.scopeCoordinates;
    }

    public final void setScopeCoordinates(InterfaceC10559a interfaceC10559a) {
        this.scopeCoordinates = interfaceC10559a;
    }

    @Override // androidx.compose.p013ui.layout.LookaheadScope
    public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates2 = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates2 != null) {
            return lookaheadLayoutCoordinates2;
        }
        AbstractC9133u.m16131e(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        NodeCoordinator nodeCoordinator = (NodeCoordinator) layoutCoordinates;
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) ? nodeCoordinator : lookaheadLayoutCoordinates;
    }

    public LookaheadScopeImpl(InterfaceC10559a interfaceC10559a) {
        this.scopeCoordinates = interfaceC10559a;
    }

    public /* synthetic */ LookaheadScopeImpl(InterfaceC10559a interfaceC10559a, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : interfaceC10559a);
    }
}
