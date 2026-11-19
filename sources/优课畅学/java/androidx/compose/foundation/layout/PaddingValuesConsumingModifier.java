package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9133u;

@Stable
/* loaded from: classes.dex */
final class PaddingValuesConsumingModifier extends InsetsConsumingModifier {
    private final PaddingValues paddingValues;

    public PaddingValuesConsumingModifier(PaddingValues paddingValues) {
        super(null);
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifier
    public WindowInsets calculateInsets(WindowInsets windowInsets) {
        return WindowInsetsKt.add(WindowInsetsKt.asInsets(this.paddingValues), windowInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaddingValuesConsumingModifier) {
            return AbstractC9133u.m16128b(((PaddingValuesConsumingModifier) obj).paddingValues, this.paddingValues);
        }
        return false;
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }
}
