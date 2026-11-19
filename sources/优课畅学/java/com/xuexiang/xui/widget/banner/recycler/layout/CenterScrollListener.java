package com.xuexiang.xui.widget.banner.recycler.layout;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class CenterScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public boolean f7174a = false;

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
                this.f7174a = false;
                return;
            }
            return;
        }
        if (this.f7174a) {
            this.f7174a = false;
            return;
        }
        int iM6608n = overFlyingLayoutManager.m6608n();
        if (iM6608n == 0) {
            this.f7174a = false;
            return;
        }
        if (overFlyingLayoutManager.getOrientation() == 1) {
            recyclerView.smoothScrollBy(0, iM6608n);
        } else {
            recyclerView.smoothScrollBy(iM6608n, 0);
        }
        this.f7174a = true;
    }
}
