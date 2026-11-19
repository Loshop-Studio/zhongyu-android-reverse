package com.xuexiang.xui.widget.banner.recycler.layout;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class CenterScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public boolean f4007a = false;

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        OverFlyingLayoutManager overFlyingLayoutManager = (OverFlyingLayoutManager) layoutManager;
        if (i != 0) {
            if (i == 1 || i == 2) {
                this.f4007a = false;
                return;
            }
            return;
        }
        if (this.f4007a) {
            this.f4007a = false;
            return;
        }
        int iAbs = (int) (((Math.abs(Math.round(overFlyingLayoutManager.f4013e / overFlyingLayoutManager.f4018j)) * (!overFlyingLayoutManager.f4015g ? overFlyingLayoutManager.f4018j : -overFlyingLayoutManager.f4018j)) - overFlyingLayoutManager.f4013e) * 1.0f);
        if (iAbs == 0) {
            this.f4007a = false;
        } else {
            recyclerView.smoothScrollBy(iAbs, 0);
            this.f4007a = true;
        }
    }
}
