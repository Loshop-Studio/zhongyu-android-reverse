package androidx.compose.foundation.layout;

import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9979u;

@Stable
/* loaded from: classes.dex */
final class AddedInsets implements WindowInsets {
    private final WindowInsets first;
    private final WindowInsets second;

    public AddedInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.first = windowInsets;
        this.second = windowInsets2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddedInsets)) {
            return false;
        }
        AddedInsets addedInsets = (AddedInsets) obj;
        return AbstractC9979u.m20289b(addedInsets.first, this.first) && AbstractC9979u.m20289b(addedInsets.second, this.second);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return this.first.getBottom(density) + this.second.getBottom(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return this.first.getLeft(density, layoutDirection) + this.second.getLeft(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return this.first.getRight(density, layoutDirection) + this.second.getRight(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return this.first.getTop(density) + this.second.getTop(density);
    }

    public int hashCode() {
        return this.first.hashCode() + (this.second.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.first + " + " + this.second + ')';
    }
}
