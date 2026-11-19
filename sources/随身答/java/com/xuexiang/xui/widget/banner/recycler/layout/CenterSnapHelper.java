package com.xuexiang.xui.widget.banner.recycler.layout;

import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager;

/* loaded from: classes4.dex */
public class CenterSnapHelper extends RecyclerView.OnFlingListener {

    /* renamed from: a */
    public RecyclerView f7105a;

    /* renamed from: b */
    public Scroller f7106b;

    /* renamed from: c */
    public boolean f7107c = false;

    /* renamed from: d */
    public final RecyclerView.OnScrollListener f7108d = new C6807a();

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.CenterSnapHelper$a */
    public class C6807a extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public boolean f7109a = false;

        public C6807a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i9) {
            super.onScrollStateChanged(recyclerView, i9);
            BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) recyclerView.getLayoutManager();
            if (bannerLayoutManager != null && i9 == 0 && this.f7109a) {
                this.f7109a = false;
                if (CenterSnapHelper.this.f7107c) {
                    CenterSnapHelper.this.f7107c = false;
                } else {
                    CenterSnapHelper.this.f7107c = true;
                    CenterSnapHelper.this.m6567c(bannerLayoutManager, null);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i9, int i10) {
            if (i9 == 0 && i10 == 0) {
                return;
            }
            this.f7109a = true;
        }
    }

    /* renamed from: c */
    public void m6567c(BannerLayoutManager bannerLayoutManager, BannerLayoutManager.InterfaceC6806a interfaceC6806a) {
        int iM6556o = bannerLayoutManager.m6556o();
        if (iM6556o == 0) {
            this.f7107c = false;
        } else if (bannerLayoutManager.getOrientation() == 1) {
            this.f7105a.smoothScrollBy(0, iM6556o);
        } else {
            this.f7105a.smoothScrollBy(iM6556o, 0);
        }
        if (interfaceC6806a != null) {
            interfaceC6806a.onPageSelected(bannerLayoutManager.m6550g());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public boolean onFling(int i9, int i10) {
        BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) this.f7105a.getLayoutManager();
        if (bannerLayoutManager == null || this.f7105a.getAdapter() == null) {
            return false;
        }
        if (!bannerLayoutManager.m6552j() && (bannerLayoutManager.f7081g == bannerLayoutManager.m6553k() || bannerLayoutManager.f7081g == bannerLayoutManager.m6554l())) {
            return false;
        }
        int minFlingVelocity = this.f7105a.getMinFlingVelocity();
        this.f7106b.fling(0, 0, i9, i10, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (bannerLayoutManager.f7078d == 1 && Math.abs(i10) > minFlingVelocity) {
            int iM6550g = bannerLayoutManager.m6550g();
            int finalY = (int) ((this.f7106b.getFinalY() / bannerLayoutManager.f7088n) / bannerLayoutManager.m6551i());
            this.f7105a.smoothScrollToPosition(bannerLayoutManager.getReverseLayout() ? iM6550g - finalY : iM6550g + finalY);
            return true;
        }
        if (bannerLayoutManager.f7078d == 0 && Math.abs(i9) > minFlingVelocity) {
            int iM6550g2 = bannerLayoutManager.m6550g();
            int finalX = (int) ((this.f7106b.getFinalX() / bannerLayoutManager.f7088n) / bannerLayoutManager.m6551i());
            this.f7105a.smoothScrollToPosition(bannerLayoutManager.getReverseLayout() ? iM6550g2 - finalX : iM6550g2 + finalX);
        }
        return true;
    }
}
