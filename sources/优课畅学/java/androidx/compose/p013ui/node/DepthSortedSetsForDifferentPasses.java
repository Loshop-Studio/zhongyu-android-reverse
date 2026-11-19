package androidx.compose.p013ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DepthSortedSetsForDifferentPasses {
    public static final int $stable = 8;
    private final DepthSortedSet lookaheadSet;
    private final DepthSortedSet set;

    public DepthSortedSetsForDifferentPasses(boolean z10) {
        this.lookaheadSet = new DepthSortedSet(z10);
        this.set = new DepthSortedSet(z10);
    }

    public final void add(LayoutNode layoutNode, boolean z10) {
        if (z10) {
            this.lookaheadSet.add(layoutNode);
            this.set.add(layoutNode);
        } else {
            if (this.lookaheadSet.contains(layoutNode)) {
                return;
            }
            this.set.add(layoutNode);
        }
    }

    public final boolean contains(LayoutNode layoutNode, boolean z10) {
        boolean zContains = this.lookaheadSet.contains(layoutNode);
        return z10 ? zContains : zContains || this.set.contains(layoutNode);
    }

    public final boolean isEmpty() {
        return this.set.isEmpty() && this.lookaheadSet.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final LayoutNode pop() {
        return !this.lookaheadSet.isEmpty() ? this.lookaheadSet.pop() : this.set.pop();
    }

    public final void popEach(InterfaceC10574p interfaceC10574p) {
        while (isNotEmpty()) {
            boolean zIsEmpty = this.lookaheadSet.isEmpty();
            interfaceC10574p.invoke((!zIsEmpty ? this.lookaheadSet : this.set).pop(), Boolean.valueOf(!zIsEmpty));
        }
    }

    public final boolean remove(LayoutNode layoutNode, boolean z10) {
        return z10 ? this.lookaheadSet.remove(layoutNode) : this.set.remove(layoutNode);
    }

    public final boolean isEmpty(boolean z10) {
        return (z10 ? this.lookaheadSet : this.set).isEmpty();
    }

    public final boolean contains(LayoutNode layoutNode) {
        return this.lookaheadSet.contains(layoutNode) || this.set.contains(layoutNode);
    }

    public final boolean remove(LayoutNode layoutNode) {
        return this.set.remove(layoutNode) || this.lookaheadSet.remove(layoutNode);
    }
}
