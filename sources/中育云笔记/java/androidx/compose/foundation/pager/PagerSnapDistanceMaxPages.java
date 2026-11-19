package androidx.compose.foundation.pager;

import androidx.collection.SieveCacheKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p265nd.AbstractC10410o;

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
        return AbstractC10410o.m21761n(i11, (int) AbstractC10410o.m21753f(j10 - this.pagesLimit, 0L), (int) AbstractC10410o.m21757j(j10 + this.pagesLimit, SieveCacheKt.NodeLinkMask));
    }

    public boolean equals(Object obj) {
        return (obj instanceof PagerSnapDistanceMaxPages) && this.pagesLimit == ((PagerSnapDistanceMaxPages) obj).pagesLimit;
    }

    public int hashCode() {
        return Integer.hashCode(this.pagesLimit);
    }
}
