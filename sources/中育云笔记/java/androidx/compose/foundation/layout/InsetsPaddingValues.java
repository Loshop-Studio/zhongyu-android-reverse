package androidx.compose.foundation.layout;

import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9979u;

@Stable
/* loaded from: classes.dex */
final class InsetsPaddingValues implements PaddingValues {
    private final Density density;
    private final WindowInsets insets;

    public InsetsPaddingValues(WindowInsets windowInsets, Density density) {
        this.insets = windowInsets;
        this.density = density;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM, reason: not valid java name */
    public float mo27407calculateBottomPaddingD9Ej5fM() {
        Density density = this.density;
        return density.mo27096toDpu2uoSUM(this.insets.getBottom(density));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM, reason: not valid java name */
    public float mo27408calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Density density = this.density;
        return density.mo27096toDpu2uoSUM(this.insets.getLeft(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM, reason: not valid java name */
    public float mo27409calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Density density = this.density;
        return density.mo27096toDpu2uoSUM(this.insets.getRight(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM, reason: not valid java name */
    public float mo27410calculateTopPaddingD9Ej5fM() {
        Density density = this.density;
        return density.mo27096toDpu2uoSUM(this.insets.getTop(density));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) obj;
        return AbstractC9979u.m20289b(this.insets, insetsPaddingValues.insets) && AbstractC9979u.m20289b(this.density, insetsPaddingValues.density);
    }

    public final WindowInsets getInsets() {
        return this.insets;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.density.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.insets + ", density=" + this.density + ')';
    }
}
