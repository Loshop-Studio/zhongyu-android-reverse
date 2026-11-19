package com.xuexiang.xui.widget.banner.recycler.layout;

import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager;

/* loaded from: classes.dex */
public class CenterSnapHelper extends RecyclerView.AbstractC0572q {
    Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private boolean snapToCenter = false;
    private final RecyclerView.AbstractC0574s mScrollListener = new RecyclerView.AbstractC0574s() { // from class: com.xuexiang.xui.widget.banner.recycler.layout.CenterSnapHelper.1
        boolean mScrolled = false;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574s
        public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) recyclerView.getLayoutManager();
            if (bannerLayoutManager == null) {
                return;
            }
            BannerLayoutManager.OnPageChangeListener onPageChangeListener = bannerLayoutManager.onPageChangeListener;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrollStateChanged(i4);
            }
            if (i4 == 0 && this.mScrolled) {
                this.mScrolled = false;
                if (CenterSnapHelper.this.snapToCenter) {
                    CenterSnapHelper.this.snapToCenter = false;
                } else {
                    CenterSnapHelper.this.snapToCenter = true;
                    CenterSnapHelper.this.snapToCenterView(bannerLayoutManager, onPageChangeListener);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574s
        public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
            if (i4 == 0 && i5 == 0) {
                return;
            }
            this.mScrolled = true;
        }
    };

    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            RecyclerView.AbstractC0570o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof BannerLayoutManager) {
                setupCallbacks();
                this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
                BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) layoutManager;
                snapToCenterView(bannerLayoutManager, bannerLayoutManager.onPageChangeListener);
            }
        }
    }

    void destroyCallbacks() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0572q
    public boolean onFling(int i4, int i5) {
        BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) this.mRecyclerView.getLayoutManager();
        if (bannerLayoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        if (!bannerLayoutManager.getInfinite() && (bannerLayoutManager.mOffset == bannerLayoutManager.getMaxOffset() || bannerLayoutManager.mOffset == bannerLayoutManager.getMinOffset())) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        this.mGravityScroller.fling(0, 0, i4, i5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (bannerLayoutManager.mOrientation == 1 && Math.abs(i5) > minFlingVelocity) {
            int currentPosition = bannerLayoutManager.getCurrentPosition();
            int finalY = (int) ((this.mGravityScroller.getFinalY() / bannerLayoutManager.mInterval) / bannerLayoutManager.getDistanceRatio());
            this.mRecyclerView.smoothScrollToPosition(bannerLayoutManager.getReverseLayout() ? currentPosition - finalY : currentPosition + finalY);
            return true;
        }
        if (bannerLayoutManager.mOrientation == 0 && Math.abs(i4) > minFlingVelocity) {
            int currentPosition2 = bannerLayoutManager.getCurrentPosition();
            int finalX = (int) ((this.mGravityScroller.getFinalX() / bannerLayoutManager.mInterval) / bannerLayoutManager.getDistanceRatio());
            this.mRecyclerView.smoothScrollToPosition(bannerLayoutManager.getReverseLayout() ? currentPosition2 - finalX : currentPosition2 + finalX);
        }
        return true;
    }

    void setupCallbacks() throws IllegalStateException {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    void snapToCenterView(BannerLayoutManager bannerLayoutManager, BannerLayoutManager.OnPageChangeListener onPageChangeListener) {
        int offsetToCenter = bannerLayoutManager.getOffsetToCenter();
        if (offsetToCenter == 0) {
            this.snapToCenter = false;
        } else if (bannerLayoutManager.getOrientation() == 1) {
            this.mRecyclerView.smoothScrollBy(0, offsetToCenter);
        } else {
            this.mRecyclerView.smoothScrollBy(offsetToCenter, 0);
        }
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(bannerLayoutManager.getCurrentPosition());
        }
    }
}
