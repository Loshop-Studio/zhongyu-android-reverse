package androidx.compose.foundation.shape;

import androidx.compose.p013ui.platform.InspectableValue;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Density;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes.dex */
final class DpCornerSize implements CornerSize, InspectableValue {
    private final float size;

    public /* synthetic */ DpCornerSize(float f10, AbstractC9126n abstractC9126n) {
        this(f10);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    private final float m21149component1D9Ej5fM() {
        return this.size;
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ DpCornerSize m21150copy0680j_4$default(DpCornerSize dpCornerSize, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = dpCornerSize.size;
        }
        return dpCornerSize.m21151copy0680j_4(f10);
    }

    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final DpCornerSize m21151copy0680j_4(float f10) {
        return new DpCornerSize(f10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpCornerSize) && C3156Dp.m26904equalsimpl0(this.size, ((DpCornerSize) obj).size);
    }

    @Override // androidx.compose.p013ui.platform.InspectableValue
    public /* bridge */ /* synthetic */ Object getValueOverride() {
        return C3156Dp.m26897boximpl(m21152getValueOverrideD9Ej5fM());
    }

    /* renamed from: getValueOverride-D9Ej5fM, reason: not valid java name */
    public float m21152getValueOverrideD9Ej5fM() {
        return this.size;
    }

    public int hashCode() {
        return C3156Dp.m26905hashCodeimpl(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo21144toPxTmRCtEA(long j10, Density density) {
        return density.mo20497toPx0680j_4(this.size);
    }

    public String toString() {
        return "CornerSize(size = " + this.size + ".dp)";
    }

    private DpCornerSize(float f10) {
        this.size = f10;
    }
}
