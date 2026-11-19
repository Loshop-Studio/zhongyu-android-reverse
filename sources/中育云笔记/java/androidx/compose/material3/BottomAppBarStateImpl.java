package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.Stable;
import p265nd.AbstractC10410o;

@Stable
/* loaded from: classes2.dex */
final class BottomAppBarStateImpl implements BottomAppBarState {
    private MutableFloatState _heightOffset;
    private final MutableFloatState contentOffset$delegate;
    private final MutableFloatState heightOffsetLimit$delegate;

    public BottomAppBarStateImpl(float f10, float f11, float f12) {
        this.heightOffsetLimit$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f10);
        this.contentOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f12);
        this._heightOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(f11);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public float getCollapsedFraction() {
        if (getHeightOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return getHeightOffset() / getHeightOffsetLimit();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public float getContentOffset() {
        return this.contentOffset$delegate.getFloatValue();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public float getHeightOffset() {
        return this._heightOffset.getFloatValue();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public float getHeightOffsetLimit() {
        return this.heightOffsetLimit$delegate.getFloatValue();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public void setContentOffset(float f10) {
        this.contentOffset$delegate.setFloatValue(f10);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public void setHeightOffset(float f10) {
        this._heightOffset.setFloatValue(AbstractC10410o.m21760m(f10, getHeightOffsetLimit(), 0.0f));
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public void setHeightOffsetLimit(float f10) {
        this.heightOffsetLimit$delegate.setFloatValue(f10);
    }
}
