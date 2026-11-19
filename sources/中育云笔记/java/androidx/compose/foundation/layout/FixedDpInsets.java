package androidx.compose.foundation.layout;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes.dex */
final class FixedDpInsets implements WindowInsets {
    private final float bottomDp;
    private final float leftDp;
    private final float rightDp;
    private final float topDp;

    public /* synthetic */ FixedDpInsets(float f10, float f11, float f12, float f13, AbstractC9972n abstractC9972n) {
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
        return C3186Dp.m33506equalsimpl0(this.leftDp, fixedDpInsets.leftDp) && C3186Dp.m33506equalsimpl0(this.topDp, fixedDpInsets.topDp) && C3186Dp.m33506equalsimpl0(this.rightDp, fixedDpInsets.rightDp) && C3186Dp.m33506equalsimpl0(this.bottomDp, fixedDpInsets.bottomDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return density.mo27093roundToPx0680j_4(this.bottomDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return density.mo27093roundToPx0680j_4(this.leftDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return density.mo27093roundToPx0680j_4(this.rightDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return density.mo27093roundToPx0680j_4(this.topDp);
    }

    public int hashCode() {
        return (((((C3186Dp.m33507hashCodeimpl(this.leftDp) * 31) + C3186Dp.m33507hashCodeimpl(this.topDp)) * 31) + C3186Dp.m33507hashCodeimpl(this.rightDp)) * 31) + C3186Dp.m33507hashCodeimpl(this.bottomDp);
    }

    public String toString() {
        return "Insets(left=" + ((Object) C3186Dp.m33512toStringimpl(this.leftDp)) + ", top=" + ((Object) C3186Dp.m33512toStringimpl(this.topDp)) + ", right=" + ((Object) C3186Dp.m33512toStringimpl(this.rightDp)) + ", bottom=" + ((Object) C3186Dp.m33512toStringimpl(this.bottomDp)) + ')';
    }

    private FixedDpInsets(float f10, float f11, float f12, float f13) {
        this.leftDp = f10;
        this.topDp = f11;
        this.rightDp = f12;
        this.bottomDp = f13;
    }
}
