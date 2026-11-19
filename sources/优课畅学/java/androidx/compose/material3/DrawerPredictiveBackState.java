package androidx.compose.material3;

import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes2.dex */
public final class DrawerPredictiveBackState {
    public static final int $stable = 0;
    private final MutableState swipeEdgeMatchesDrawer$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    private final MutableFloatState scaleXDistance$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    private final MutableFloatState scaleYDistance$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    public final void clear() {
        setSwipeEdgeMatchesDrawer(true);
        setScaleXDistance(0.0f);
        setScaleYDistance(0.0f);
    }

    public final float getScaleXDistance() {
        return this.scaleXDistance$delegate.getFloatValue();
    }

    public final float getScaleYDistance() {
        return this.scaleYDistance$delegate.getFloatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getSwipeEdgeMatchesDrawer() {
        return ((Boolean) this.swipeEdgeMatchesDrawer$delegate.getValue()).booleanValue();
    }

    public final void setScaleXDistance(float f10) {
        this.scaleXDistance$delegate.setFloatValue(f10);
    }

    public final void setScaleYDistance(float f10) {
        this.scaleYDistance$delegate.setFloatValue(f10);
    }

    public final void setSwipeEdgeMatchesDrawer(boolean z10) {
        this.swipeEdgeMatchesDrawer$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void update(float f10, boolean z10, boolean z11, float f11, float f12, float f13) {
        setSwipeEdgeMatchesDrawer(z10 != z11);
        if (!getSwipeEdgeMatchesDrawer()) {
            f11 = f12;
        }
        setScaleXDistance(MathHelpersKt.lerp(0.0f, f11, f10));
        setScaleYDistance(MathHelpersKt.lerp(0.0f, f13, f10));
    }
}
