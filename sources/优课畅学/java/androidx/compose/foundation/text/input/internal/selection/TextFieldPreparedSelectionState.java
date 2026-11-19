package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextFieldPreparedSelectionState {
    public static final int $stable = 8;
    private float cachedX = Float.NaN;

    public final float getCachedX() {
        return this.cachedX;
    }

    public final void resetCachedX() {
        this.cachedX = Float.NaN;
    }

    public final void setCachedX(float f10) {
        this.cachedX = f10;
    }
}
