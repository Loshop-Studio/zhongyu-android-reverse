package androidx.compose.p013ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class VectorApplier extends AbstractApplier<VNode> {
    public static final int $stable = 0;

    public VectorApplier(VNode vNode) {
        super(vNode);
    }

    private final GroupComponent asGroup(VNode vNode) {
        if (vNode instanceof GroupComponent) {
            return (GroupComponent) vNode;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i10, VNode vNode) {
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i10, int i11, int i12) {
        asGroup(getCurrent()).move(i10, i11, i12);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public void onClear() {
        GroupComponent groupComponentAsGroup = asGroup(getRoot());
        groupComponentAsGroup.remove(0, groupComponentAsGroup.getNumChildren());
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i10, int i11) {
        asGroup(getCurrent()).remove(i10, i11);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i10, VNode vNode) {
        asGroup(getCurrent()).insertAt(i10, vNode);
    }
}
