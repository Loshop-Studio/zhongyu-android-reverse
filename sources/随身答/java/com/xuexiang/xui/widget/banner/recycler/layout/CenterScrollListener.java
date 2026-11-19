package com.xuexiang.xui.widget.banner.recycler.layout;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class CenterScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public boolean f7104a = false;

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i9) {
        super.onScrollStateChanged(recyclerView, i9);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        OverFlyingLayoutManager overFlyingLayoutManager = (OverFlyingLayoutManager) layoutManager;
        if (i9 != 0) {
            if (i9 == 1 || i9 == 2) {
                this.f7104a = false;
                return;
            }
            return;
        }
        if (this.f7104a) {
            this.f7104a = false;
            return;
        }
        int iM6583n = overFlyingLayoutManager.m6583n();
        if (iM6583n == 0) {
            this.f7104a = false;
            return;
        }
        if (overFlyingLayoutManager.getOrientation() == 1) {
            recyclerView.smoothScrollBy(0, iM6583n);
        } else {
            recyclerView.smoothScrollBy(iM6583n, 0);
        }
        this.f7104a = true;
    }
}
