package androidx.compose.foundation.shape;

import androidx.compose.p014ui.platform.InspectableValue;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes.dex */
final class DpCornerSize implements CornerSize, InspectableValue {
    private final float size;

    public /* synthetic */ DpCornerSize(float f10, AbstractC9972n abstractC9972n) {
        this(f10);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    private final float m27751component1D9Ej5fM() {
        return this.size;
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ DpCornerSize m27752copy0680j_4$default(DpCornerSize dpCornerSize, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = dpCornerSize.size;
        }
        return dpCornerSize.m27753copy0680j_4(f10);
    }

    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final DpCornerSize m27753copy0680j_4(float f10) {
        return new DpCornerSize(f10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpCornerSize) && C3186Dp.m33506equalsimpl0(this.size, ((DpCornerSize) obj).size);
    }

    @Override // androidx.compose.p014ui.platform.InspectableValue
    public /* bridge */ /* synthetic */ Object getValueOverride() {
        return C3186Dp.m33499boximpl(m27754getValueOverrideD9Ej5fM());
    }

    /* renamed from: getValueOverride-D9Ej5fM, reason: not valid java name */
    public float m27754getValueOverrideD9Ej5fM() {
        return this.size;
    }

    public int hashCode() {
        return C3186Dp.m33507hashCodeimpl(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo27746toPxTmRCtEA(long j10, Density density) {
        return density.mo27099toPx0680j_4(this.size);
    }

    public String toString() {
        return "CornerSize(size = " + this.size + ".dp)";
    }

    private DpCornerSize(float f10) {
        this.size = f10;
    }
}
