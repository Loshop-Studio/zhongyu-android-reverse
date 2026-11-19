package androidx.compose.foundation.pager;

import p181hd.InterfaceC9529a;
import p211jd.AbstractC9719c;

/* loaded from: classes.dex */
public final class PagerScrollPositionKt {
    public static final int NearestItemsExtraItemCount = 100;
    public static final int NearestItemsSlidingWindowSize = 30;

    public static final long currentAbsoluteScrollOffset(PagerState pagerState) {
        return (pagerState.getCurrentPage() * pagerState.getPageSizeWithSpacing$foundation_release()) + AbstractC9719c.m19284f(pagerState.getCurrentPageOffsetFraction() * pagerState.getPageSizeWithSpacing$foundation_release());
    }

    private static final void debugLog(InterfaceC9529a interfaceC9529a) {
    }
}
