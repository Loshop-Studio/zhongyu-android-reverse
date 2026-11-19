package com.xuexiang.xui.widget.banner.recycler.layout;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes5.dex */
public class CenterScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public boolean f15439a = false;

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        super.onScrollStateChanged(recyclerView, i10);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        OverFlyingLayoutManager overFlyingLayoutManager = (OverFlyingLayoutManager) layoutManager;
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                this.f15439a = false;
                return;
            }
            return;
        }
        if (this.f15439a) {
            this.f15439a = false;
            return;
        }
        int iM12355n = overFlyingLayoutManager.m12355n();
        if (iM12355n == 0) {
            this.f15439a = false;
            return;
        }
        if (overFlyingLayoutManager.getOrientation() == 1) {
            recyclerView.smoothScrollBy(0, iM12355n);
        } else {
            recyclerView.smoothScrollBy(iM12355n, 0);
        }
        this.f15439a = true;
    }
}
