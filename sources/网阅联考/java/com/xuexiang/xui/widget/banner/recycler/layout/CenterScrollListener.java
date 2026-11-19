package com.xuexiang.xui.widget.banner.recycler.layout;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class CenterScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public boolean f3189a = false;

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
        super.onScrollStateChanged(recyclerView, i4);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        OverFlyingLayoutManager overFlyingLayoutManager = (OverFlyingLayoutManager) layoutManager;
        if (i4 != 0) {
            if (i4 == 1 || i4 == 2) {
                this.f3189a = false;
                return;
            }
            return;
        }
        if (this.f3189a) {
            this.f3189a = false;
            return;
        }
        int iM4173n = overFlyingLayoutManager.m4173n();
        if (iM4173n == 0) {
            this.f3189a = false;
            return;
        }
        if (overFlyingLayoutManager.getOrientation() == 1) {
            recyclerView.smoothScrollBy(0, iM4173n);
        } else {
            recyclerView.smoothScrollBy(iM4173n, 0);
        }
        this.f3189a = true;
    }
}
