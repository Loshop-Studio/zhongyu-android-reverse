package androidx.compose.foundation.layout;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9979u;

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
            return AbstractC9979u.m20289b(((PaddingValuesInsets) obj).paddingValues, this.paddingValues);
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return density.mo27093roundToPx0680j_4(this.paddingValues.mo27407calculateBottomPaddingD9Ej5fM());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return density.mo27093roundToPx0680j_4(this.paddingValues.mo27408calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return density.mo27093roundToPx0680j_4(this.paddingValues.mo27409calculateRightPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return density.mo27093roundToPx0680j_4(this.paddingValues.mo27410calculateTopPaddingD9Ej5fM());
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    public String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return "PaddingValues(" + ((Object) C3186Dp.m33512toStringimpl(this.paddingValues.mo27408calculateLeftPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) C3186Dp.m33512toStringimpl(this.paddingValues.mo27410calculateTopPaddingD9Ej5fM())) + ", " + ((Object) C3186Dp.m33512toStringimpl(this.paddingValues.mo27409calculateRightPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) C3186Dp.m33512toStringimpl(this.paddingValues.mo27407calculateBottomPaddingD9Ej5fM())) + ')';
    }
}
