package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextPreparedSelectionState {
    public static final int $stable = 8;
    private Float cachedX;

    public final Float getCachedX() {
        return this.cachedX;
    }

    public final void resetCachedX() {
        this.cachedX = null;
    }

    public final void setCachedX(Float f10) {
        this.cachedX = f10;
    }
}
