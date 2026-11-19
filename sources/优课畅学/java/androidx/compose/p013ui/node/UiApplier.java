package androidx.compose.p013ui.node;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class UiApplier extends AbstractApplier<LayoutNode> {
    public static final int $stable = 0;

    public UiApplier(LayoutNode layoutNode) {
        super(layoutNode);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i10, LayoutNode layoutNode) {
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i10, int i11, int i12) {
        getCurrent().move$ui_release(i10, i11, i12);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public void onClear() {
        getRoot().removeAll$ui_release();
    }

    @Override // androidx.compose.runtime.Applier
    public void onEndChanges() {
        super.onEndChanges();
        Owner owner$ui_release = getRoot().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onEndApplyChanges();
        }
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i10, int i11) {
        getCurrent().removeAt$ui_release(i10, i11);
    }

    @Override // androidx.compose.runtime.Applier
    public void reuse() {
        getCurrent().onReuse();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i10, LayoutNode layoutNode) {
        getCurrent().insertAt$ui_release(i10, layoutNode);
    }
}
