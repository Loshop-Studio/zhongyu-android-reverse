package androidx.compose.material3;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class FabPlacement {
    public static final int $stable = 0;
    private final int height;
    private final int left;
    private final int width;

    public FabPlacement(int i10, int i11, int i12) {
        this.left = i10;
        this.width = i11;
        this.height = i12;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getWidth() {
        return this.width;
    }
}
