package androidx.compose.foundation.layout;

import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

@Stable
/* loaded from: classes.dex */
final class ExcludeInsets implements WindowInsets {
    private final WindowInsets excluded;
    private final WindowInsets included;

    public ExcludeInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.included = windowInsets;
        this.excluded = windowInsets2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExcludeInsets)) {
            return false;
        }
        ExcludeInsets excludeInsets = (ExcludeInsets) obj;
        return AbstractC9979u.m20289b(excludeInsets.included, this.included) && AbstractC9979u.m20289b(excludeInsets.excluded, this.excluded);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return AbstractC10410o.m21752e(this.included.getBottom(density) - this.excluded.getBottom(density), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return AbstractC10410o.m21752e(this.included.getLeft(density, layoutDirection) - this.excluded.getLeft(density, layoutDirection), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return AbstractC10410o.m21752e(this.included.getRight(density, layoutDirection) - this.excluded.getRight(density, layoutDirection), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return AbstractC10410o.m21752e(this.included.getTop(density) - this.excluded.getTop(density), 0);
    }

    public int hashCode() {
        return (this.included.hashCode() * 31) + this.excluded.hashCode();
    }

    public String toString() {
        return '(' + this.included + " - " + this.excluded + ')';
    }
}
