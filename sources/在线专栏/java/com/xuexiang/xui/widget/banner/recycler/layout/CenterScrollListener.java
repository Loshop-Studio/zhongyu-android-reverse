package com.xuexiang.xui.widget.banner.recycler.layout;

import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.banner.recycler.layout.OverFlyingLayoutManager;

/* loaded from: classes.dex */
public class CenterScrollListener extends RecyclerView.AbstractC0574s {
    private boolean mAutoSet = false;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574s
    public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
        super.onScrollStateChanged(recyclerView, i4);
        RecyclerView.AbstractC0570o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        OverFlyingLayoutManager overFlyingLayoutManager = (OverFlyingLayoutManager) layoutManager;
        OverFlyingLayoutManager.OnPageChangeListener onPageChangeListener = overFlyingLayoutManager.onPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i4);
        }
        if (i4 != 0) {
            if (i4 == 1 || i4 == 2) {
                this.mAutoSet = false;
                return;
            }
            return;
        }
        if (this.mAutoSet) {
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageSelected(overFlyingLayoutManager.getCurrentPosition());
            }
            this.mAutoSet = false;
            return;
        }
        int offsetToCenter = overFlyingLayoutManager.getOffsetToCenter();
        if (offsetToCenter == 0) {
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageSelected(overFlyingLayoutManager.getCurrentPosition());
            }
            this.mAutoSet = false;
        } else {
            if (overFlyingLayoutManager.getOrientation() == 1) {
                recyclerView.smoothScrollBy(0, offsetToCenter);
            } else {
                recyclerView.smoothScrollBy(offsetToCenter, 0);
            }
            this.mAutoSet = true;
        }
    }
}
