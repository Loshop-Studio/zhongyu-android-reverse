package androidx.compose.foundation.shape;

import androidx.compose.p013ui.platform.InspectableValue;
import androidx.compose.p013ui.unit.Density;

/* loaded from: classes.dex */
public final class CornerSizeKt$ZeroCornerSize$1 implements CornerSize, InspectableValue {
    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo21144toPxTmRCtEA(long j10, Density density) {
        return 0.0f;
    }

    public String toString() {
        return "ZeroCornerSize";
    }

    @Override // androidx.compose.p013ui.platform.InspectableValue
    public String getValueOverride() {
        return "ZeroCornerSize";
    }
}
