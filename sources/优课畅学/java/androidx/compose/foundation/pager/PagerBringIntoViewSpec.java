package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import p077d8.AbstractC8323h;

/* loaded from: classes.dex */
final class PagerBringIntoViewSpec implements BringIntoViewSpec {
    private final BringIntoViewSpec defaultBringIntoViewSpec;
    private final PagerState pagerState;

    public PagerBringIntoViewSpec(PagerState pagerState, BringIntoViewSpec bringIntoViewSpec) {
        this.pagerState = pagerState;
        this.defaultBringIntoViewSpec = bringIntoViewSpec;
    }

    private final float overrideProposedOffsetMove(float f10) {
        float firstVisiblePageOffset$foundation_release = this.pagerState.getFirstVisiblePageOffset$foundation_release() * (-1);
        while (f10 > 0.0f && firstVisiblePageOffset$foundation_release < f10) {
            firstVisiblePageOffset$foundation_release += this.pagerState.getPageSizeWithSpacing$foundation_release();
        }
        while (f10 < 0.0f && firstVisiblePageOffset$foundation_release > f10) {
            firstVisiblePageOffset$foundation_release -= this.pagerState.getPageSizeWithSpacing$foundation_release();
        }
        return firstVisiblePageOffset$foundation_release;
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public float calculateScrollDistance(float f10, float f11, float f12) {
        float fCalculateScrollDistance = this.defaultBringIntoViewSpec.calculateScrollDistance(f10, f11, f12);
        boolean z10 = false;
        if (f10 <= 0.0f ? f10 + f11 <= 0.0f : f10 + f11 > f12) {
            z10 = true;
        }
        if (Math.abs(fCalculateScrollDistance) != 0.0f && z10) {
            return overrideProposedOffsetMove(fCalculateScrollDistance);
        }
        if (Math.abs(this.pagerState.getFirstVisiblePageOffset$foundation_release()) < 1.0E-6d) {
            return 0.0f;
        }
        float firstVisiblePageOffset$foundation_release = this.pagerState.getFirstVisiblePageOffset$foundation_release() * (-1.0f);
        if (this.pagerState.getLastScrolledForward()) {
            firstVisiblePageOffset$foundation_release += this.pagerState.getPageSizeWithSpacing$foundation_release();
        }
        return AbstractC8323h.m13517l(firstVisiblePageOffset$foundation_release, -f12, f12);
    }

    public final BringIntoViewSpec getDefaultBringIntoViewSpec() {
        return this.defaultBringIntoViewSpec;
    }

    public final PagerState getPagerState() {
        return this.pagerState;
    }
}
