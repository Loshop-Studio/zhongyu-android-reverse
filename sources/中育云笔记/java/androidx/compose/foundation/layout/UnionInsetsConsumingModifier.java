package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9979u;

@Stable
/* loaded from: classes.dex */
final class UnionInsetsConsumingModifier extends InsetsConsumingModifier {
    private final WindowInsets insets;

    public UnionInsetsConsumingModifier(WindowInsets windowInsets) {
        super(null);
        this.insets = windowInsets;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifier
    public WindowInsets calculateInsets(WindowInsets windowInsets) {
        return WindowInsetsKt.union(this.insets, windowInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnionInsetsConsumingModifier) {
            return AbstractC9979u.m20289b(((UnionInsetsConsumingModifier) obj).insets, this.insets);
        }
        return false;
    }

    public int hashCode() {
        return this.insets.hashCode();
    }
}
