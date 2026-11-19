package androidx.compose.foundation.pager;

import p300x7.InterfaceC10559a;
import p322z7.AbstractC10729c;

/* loaded from: classes.dex */
public final class PagerScrollPositionKt {
    public static final int NearestItemsExtraItemCount = 100;
    public static final int NearestItemsSlidingWindowSize = 30;

    public static final long currentAbsoluteScrollOffset(PagerState pagerState) {
        return (pagerState.getCurrentPage() * pagerState.getPageSizeWithSpacing$foundation_release()) + AbstractC10729c.m20037f(pagerState.getCurrentPageOffsetFraction() * pagerState.getPageSizeWithSpacing$foundation_release());
    }

    private static final void debugLog(InterfaceC10559a interfaceC10559a) {
    }
}
