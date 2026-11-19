package com.xuexiang.xui.widget.banner.recycler.layout;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.b */
/* loaded from: classes3.dex */
public final class C4161b extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public boolean f4022a = false;

    /* renamed from: b */
    public final /* synthetic */ CenterSnapHelper f4023b;

    public C4161b(CenterSnapHelper centerSnapHelper) {
        this.f4023b = centerSnapHelper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) recyclerView.getLayoutManager();
        if (bannerLayoutManager != null && i == 0 && this.f4022a) {
            this.f4022a = false;
            CenterSnapHelper centerSnapHelper = this.f4023b;
            if (centerSnapHelper.f4008a) {
                centerSnapHelper.f4008a = false;
                return;
            }
            centerSnapHelper.f4008a = true;
            if (((int) (((bannerLayoutManager.m3446b() * (!bannerLayoutManager.f4000g ? bannerLayoutManager.f4003j : -bannerLayoutManager.f4003j)) - bannerLayoutManager.f3997d) * Float.MAX_VALUE)) != 0) {
                throw null;
            }
            centerSnapHelper.f4008a = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i8) {
        if (i == 0 && i8 == 0) {
            return;
        }
        this.f4022a = true;
    }
}
