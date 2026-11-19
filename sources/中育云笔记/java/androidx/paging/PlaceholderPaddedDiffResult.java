package androidx.paging;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class PlaceholderPaddedDiffResult {
    private final DiffUtil.DiffResult diff;
    private final boolean hasOverlap;

    public PlaceholderPaddedDiffResult(DiffUtil.DiffResult diff, boolean z10) {
        AbstractC9979u.m20294g(diff, "diff");
        this.diff = diff;
        this.hasOverlap = z10;
    }

    public final DiffUtil.DiffResult getDiff() {
        return this.diff;
    }

    public final boolean getHasOverlap() {
        return this.hasOverlap;
    }
}
