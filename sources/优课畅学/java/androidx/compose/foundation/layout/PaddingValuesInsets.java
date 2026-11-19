package androidx.compose.foundation.layout;

import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9133u;

@Stable
/* loaded from: classes.dex */
final class PaddingValuesInsets implements WindowInsets {
    private final PaddingValues paddingValues;

    public PaddingValuesInsets(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaddingValuesInsets) {
            return AbstractC9133u.m16128b(((PaddingValuesInsets) obj).paddingValues, this.paddingValues);
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return density.mo20491roundToPx0680j_4(this.paddingValues.mo20805calculateBottomPaddingD9Ej5fM());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return density.mo20491roundToPx0680j_4(this.paddingValues.mo20806calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return density.mo20491roundToPx0680j_4(this.paddingValues.mo20807calculateRightPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return density.mo20491roundToPx0680j_4(this.paddingValues.mo20808calculateTopPaddingD9Ej5fM());
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    public String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return "PaddingValues(" + ((Object) C3156Dp.m26910toStringimpl(this.paddingValues.mo20806calculateLeftPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) C3156Dp.m26910toStringimpl(this.paddingValues.mo20808calculateTopPaddingD9Ej5fM())) + ", " + ((Object) C3156Dp.m26910toStringimpl(this.paddingValues.mo20807calculateRightPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) C3156Dp.m26910toStringimpl(this.paddingValues.mo20805calculateBottomPaddingD9Ej5fM())) + ')';
    }
}
