package androidx.compose.foundation.pager;

import androidx.collection.SieveCacheKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p077d8.AbstractC8323h;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PagerSnapDistanceMaxPages implements PagerSnapDistance {
    public static final int $stable = 0;
    private final int pagesLimit;

    public PagerSnapDistanceMaxPages(int i10) {
        this.pagesLimit = i10;
    }

    @Override // androidx.compose.foundation.pager.PagerSnapDistance
    public int calculateTargetPage(int i10, int i11, float f10, int i12, int i13) {
        long j10 = i10;
        return AbstractC8323h.m13518m(i11, (int) AbstractC8323h.m13511f(j10 - this.pagesLimit, 0L), (int) AbstractC8323h.m13514i(j10 + this.pagesLimit, SieveCacheKt.NodeLinkMask));
    }

    public boolean equals(Object obj) {
        return (obj instanceof PagerSnapDistanceMaxPages) && this.pagesLimit == ((PagerSnapDistanceMaxPages) obj).pagesLimit;
    }

    public int hashCode() {
        return Integer.hashCode(this.pagesLimit);
    }
}
