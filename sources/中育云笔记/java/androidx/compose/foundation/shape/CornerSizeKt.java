package androidx.compose.foundation.shape;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Stable;

/* loaded from: classes.dex */
public final class CornerSizeKt {
    private static final CornerSize ZeroCornerSize = new CornerSizeKt$ZeroCornerSize$1();

    @Stable
    public static final CornerSize CornerSize(float f10) {
        return new PxCornerSize(f10);
    }

    @Stable
    /* renamed from: CornerSize-0680j_4, reason: not valid java name */
    public static final CornerSize m27747CornerSize0680j_4(float f10) {
        return new DpCornerSize(f10, null);
    }

    public static final CornerSize getZeroCornerSize() {
        return ZeroCornerSize;
    }

    @Stable
    public static /* synthetic */ void getZeroCornerSize$annotations() {
    }

    @Stable
    public static final CornerSize CornerSize(@IntRange(from = 0, m338to = 100) int i10) {
        return new PercentCornerSize(i10);
    }
}
