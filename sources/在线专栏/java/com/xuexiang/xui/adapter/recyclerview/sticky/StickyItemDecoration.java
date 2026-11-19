package com.xuexiang.xui.adapter.recyclerview.sticky;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes.dex */
public class StickyItemDecoration extends RecyclerView.AbstractC0569n {
    private RecyclerView.AbstractC0562g mAdapter;
    private int mFirstVisiblePosition;
    private int[] mInto;
    private OnStickyChangedListener mOnStickyChangedListener;
    private StickyHeadContainer mStickyHeadContainer;
    private int mStickyHeadPosition;
    private int mStickyHeadType;
    private boolean mEnableStickyHead = true;
    private RecyclerView.AbstractC0564i mAdapterDataObserver = new RecyclerView.AbstractC0564i() { // from class: com.xuexiang.xui.adapter.recyclerview.sticky.StickyItemDecoration.1
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public void onChanged() {
            StickyItemDecoration.this.reset();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public void onItemRangeChanged(int i4, int i5) {
            StickyItemDecoration.this.reset();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public void onItemRangeInserted(int i4, int i5) {
            StickyItemDecoration.this.reset();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public void onItemRangeMoved(int i4, int i5, int i6) {
            StickyItemDecoration.this.reset();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public void onItemRangeRemoved(int i4, int i5) {
            StickyItemDecoration.this.reset();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public void onItemRangeChanged(int i4, int i5, Object obj) {
            StickyItemDecoration.this.reset();
        }
    };

    public StickyItemDecoration(StickyHeadContainer stickyHeadContainer, int i4) {
        this.mStickyHeadContainer = stickyHeadContainer;
        this.mStickyHeadType = i4;
    }

    private void calculateStickyHeadPosition(RecyclerView recyclerView) {
        int iFindFirstVisiblePosition = findFirstVisiblePosition(recyclerView.getLayoutManager());
        this.mFirstVisiblePosition = iFindFirstVisiblePosition;
        int iFindStickyHeadPosition = findStickyHeadPosition(iFindFirstVisiblePosition);
        if (iFindStickyHeadPosition < 0 || this.mStickyHeadPosition == iFindStickyHeadPosition) {
            return;
        }
        this.mStickyHeadPosition = iFindStickyHeadPosition;
    }

    private void checkCache(RecyclerView recyclerView) {
        RecyclerView.AbstractC0562g adapter = recyclerView.getAdapter();
        if (this.mAdapter != adapter) {
            this.mAdapter = adapter;
            this.mStickyHeadPosition = -1;
            if (adapter != null) {
                try {
                    adapter.registerAdapterDataObserver(this.mAdapterDataObserver);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    private int findFirstCompletelyVisiblePosition(RecyclerView.AbstractC0570o abstractC0570o) {
        if (abstractC0570o instanceof GridLayoutManager) {
            return ((GridLayoutManager) abstractC0570o).findFirstCompletelyVisibleItemPosition();
        }
        if (abstractC0570o instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) abstractC0570o).findFirstCompletelyVisibleItemPosition();
        }
        if (!(abstractC0570o instanceof StaggeredGridLayoutManager)) {
            return 0;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) abstractC0570o;
        int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
        this.mInto = iArr;
        staggeredGridLayoutManager.m3209m(iArr);
        int iMin = Integer.MAX_VALUE;
        for (int i4 : this.mInto) {
            iMin = Math.min(i4, iMin);
        }
        return iMin;
    }

    private int findFirstVisiblePosition(RecyclerView.AbstractC0570o abstractC0570o) {
        if (abstractC0570o instanceof GridLayoutManager) {
            return ((GridLayoutManager) abstractC0570o).findFirstVisibleItemPosition();
        }
        if (abstractC0570o instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) abstractC0570o).findFirstVisibleItemPosition();
        }
        if (!(abstractC0570o instanceof StaggeredGridLayoutManager)) {
            return 0;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) abstractC0570o;
        int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
        this.mInto = iArr;
        staggeredGridLayoutManager.m3213r(iArr);
        int iMin = Integer.MAX_VALUE;
        for (int i4 : this.mInto) {
            iMin = Math.min(i4, iMin);
        }
        return iMin;
    }

    private int findStickyHeadPosition(int i4) {
        while (i4 >= 0) {
            if (isStickyHeadType(this.mAdapter.getItemViewType(i4))) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    private boolean isStickyHead(RecyclerView recyclerView, View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return false;
        }
        return isStickyHeadType(this.mAdapter.getItemViewType(childAdapterPosition));
    }

    private boolean isStickyHeadType(int i4) {
        return this.mStickyHeadType == i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reset() {
        StickyHeadContainer stickyHeadContainer = this.mStickyHeadContainer;
        if (stickyHeadContainer != null) {
            stickyHeadContainer.reset();
        }
    }

    public void enableStickyHead(boolean z3) {
        this.mEnableStickyHead = z3;
        if (z3) {
            return;
        }
        this.mStickyHeadContainer.setVisibility(4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0569n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0580y c0580y) {
        super.onDraw(canvas, recyclerView, c0580y);
        checkCache(recyclerView);
        if (this.mAdapter == null || this.mStickyHeadContainer == null) {
            return;
        }
        calculateStickyHeadPosition(recyclerView);
        if (this.mEnableStickyHead) {
            int i4 = this.mFirstVisiblePosition;
            int i5 = this.mStickyHeadPosition;
            if (i4 >= i5 && i5 != -1) {
                View viewFindChildViewUnder = recyclerView.findChildViewUnder(canvas.getWidth() / 2.0f, this.mStickyHeadContainer.getChildHeight() + 0.01f);
                this.mStickyHeadContainer.onPositionChanged(this.mStickyHeadPosition);
                int childHeight = 0;
                int top = viewFindChildViewUnder != null ? viewFindChildViewUnder.getTop() : 0;
                if (isStickyHead(recyclerView, viewFindChildViewUnder) && top >= 0) {
                    childHeight = top - this.mStickyHeadContainer.getChildHeight();
                }
                OnStickyChangedListener onStickyChangedListener = this.mOnStickyChangedListener;
                if (onStickyChangedListener == null) {
                    this.mStickyHeadContainer.onScrolling(childHeight);
                } else {
                    onStickyChangedListener.onScrolling(childHeight);
                }
                if (recyclerView.canScrollVertically(1) || childHeight == 0) {
                    return;
                }
                OnStickyChangedListener onStickyChangedListener2 = this.mOnStickyChangedListener;
                if (onStickyChangedListener2 == null) {
                    this.mStickyHeadContainer.onNotEnoughHighScroll();
                    return;
                } else {
                    onStickyChangedListener2.onNotEnoughHighScroll();
                    return;
                }
            }
        }
        OnStickyChangedListener onStickyChangedListener3 = this.mOnStickyChangedListener;
        if (onStickyChangedListener3 == null) {
            this.mStickyHeadContainer.onInVisible();
        } else {
            onStickyChangedListener3.onInVisible();
        }
    }

    public void recycle() {
        StickyHeadContainer stickyHeadContainer = this.mStickyHeadContainer;
        if (stickyHeadContainer != null) {
            stickyHeadContainer.recycle();
        }
        try {
            RecyclerView.AbstractC0562g abstractC0562g = this.mAdapter;
            if (abstractC0562g != null) {
                abstractC0562g.unregisterAdapterDataObserver(this.mAdapterDataObserver);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        this.mOnStickyChangedListener = null;
    }

    public StickyItemDecoration setOnStickyChangedListener(OnStickyChangedListener onStickyChangedListener) {
        this.mOnStickyChangedListener = onStickyChangedListener;
        return this;
    }
}
