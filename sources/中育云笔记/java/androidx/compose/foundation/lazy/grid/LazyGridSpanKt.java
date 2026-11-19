package androidx.compose.foundation.lazy.grid;

import androidx.annotation.IntRange;
import androidx.compose.foundation.internal.InlineClassHelperKt;

/* loaded from: classes.dex */
public final class LazyGridSpanKt {
    public static final long GridItemSpan(@IntRange(from = 1) int i10) {
        if (!(i10 > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("The span value should be higher than 0");
        }
        return GridItemSpan.m27580constructorimpl(i10);
    }
}
