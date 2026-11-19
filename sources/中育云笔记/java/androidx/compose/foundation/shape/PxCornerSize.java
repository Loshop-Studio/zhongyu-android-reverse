package androidx.compose.foundation.shape;

import androidx.compose.p014ui.platform.InspectableValue;
import androidx.compose.p014ui.unit.Density;

/* loaded from: classes.dex */
final class PxCornerSize implements CornerSize, InspectableValue {
    private final float size;

    public PxCornerSize(float f10) {
        this.size = f10;
    }

    private final float component1() {
        return this.size;
    }

    public static /* synthetic */ PxCornerSize copy$default(PxCornerSize pxCornerSize, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = pxCornerSize.size;
        }
        return pxCornerSize.copy(f10);
    }

    public final PxCornerSize copy(float f10) {
        return new PxCornerSize(f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PxCornerSize) && Float.compare(this.size, ((PxCornerSize) obj).size) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo27746toPxTmRCtEA(long j10, Density density) {
        return this.size;
    }

    public String toString() {
        return "CornerSize(size = " + this.size + ".px)";
    }

    @Override // androidx.compose.p014ui.platform.InspectableValue
    public String getValueOverride() {
        return this.size + "px";
    }
}
