package androidx.compose.foundation.layout;

import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes.dex */
final class FixedDpInsets implements WindowInsets {
    private final float bottomDp;
    private final float leftDp;
    private final float rightDp;
    private final float topDp;

    public /* synthetic */ FixedDpInsets(float f10, float f11, float f12, float f13, AbstractC9126n abstractC9126n) {
        this(f10, f11, f12, f13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDpInsets)) {
            return false;
        }
        FixedDpInsets fixedDpInsets = (FixedDpInsets) obj;
        return C3156Dp.m26904equalsimpl0(this.leftDp, fixedDpInsets.leftDp) && C3156Dp.m26904equalsimpl0(this.topDp, fixedDpInsets.topDp) && C3156Dp.m26904equalsimpl0(this.rightDp, fixedDpInsets.rightDp) && C3156Dp.m26904equalsimpl0(this.bottomDp, fixedDpInsets.bottomDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return density.mo20491roundToPx0680j_4(this.bottomDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return density.mo20491roundToPx0680j_4(this.leftDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return density.mo20491roundToPx0680j_4(this.rightDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return density.mo20491roundToPx0680j_4(this.topDp);
    }

    public int hashCode() {
        return (((((C3156Dp.m26905hashCodeimpl(this.leftDp) * 31) + C3156Dp.m26905hashCodeimpl(this.topDp)) * 31) + C3156Dp.m26905hashCodeimpl(this.rightDp)) * 31) + C3156Dp.m26905hashCodeimpl(this.bottomDp);
    }

    public String toString() {
        return "Insets(left=" + ((Object) C3156Dp.m26910toStringimpl(this.leftDp)) + ", top=" + ((Object) C3156Dp.m26910toStringimpl(this.topDp)) + ", right=" + ((Object) C3156Dp.m26910toStringimpl(this.rightDp)) + ", bottom=" + ((Object) C3156Dp.m26910toStringimpl(this.bottomDp)) + ')';
    }

    private FixedDpInsets(float f10, float f11, float f12, float f13) {
        this.leftDp = f10;
        this.topDp = f11;
        this.rightDp = f12;
        this.bottomDp = f13;
    }
}
