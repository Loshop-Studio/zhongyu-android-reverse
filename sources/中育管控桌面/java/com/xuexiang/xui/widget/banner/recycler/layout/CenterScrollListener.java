package com.xuexiang.xui.widget.banner.recycler.layout;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class CenterScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public boolean f4573a = false;

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i6) {
        super.onScrollStateChanged(recyclerView, i6);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        OverFlyingLayoutManager overFlyingLayoutManager = (OverFlyingLayoutManager) layoutManager;
        if (i6 != 0) {
            if (i6 == 1 || i6 == 2) {
                this.f4573a = false;
                return;
            }
            return;
        }
        if (this.f4573a) {
            this.f4573a = false;
            return;
        }
        int iM4497n = overFlyingLayoutManager.m4497n();
        if (iM4497n == 0) {
            this.f4573a = false;
            return;
        }
        if (overFlyingLayoutManager.getOrientation() == 1) {
            recyclerView.smoothScrollBy(0, iM4497n);
        } else {
            recyclerView.smoothScrollBy(iM4497n, 0);
        }
        this.f4573a = true;
    }
}
