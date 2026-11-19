package com.xuexiang.xui.widget.banner.recycler.layout;

import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager;

/* loaded from: classes4.dex */
public class CenterSnapHelper extends RecyclerView.OnFlingListener {

    /* renamed from: a */
    public RecyclerView f5850a;

    /* renamed from: b */
    public Scroller f5851b;

    /* renamed from: c */
    public boolean f5852c = false;

    /* renamed from: d */
    public final RecyclerView.OnScrollListener f5853d = new C6488a();

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.CenterSnapHelper$a */
    public class C6488a extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public boolean f5854a = false;

        public C6488a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
            BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) recyclerView.getLayoutManager();
            if (bannerLayoutManager != null && i10 == 0 && this.f5854a) {
                this.f5854a = false;
                if (CenterSnapHelper.this.f5852c) {
                    CenterSnapHelper.this.f5852c = false;
                } else {
                    CenterSnapHelper.this.f5852c = true;
                    CenterSnapHelper.this.m5471c(bannerLayoutManager, null);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f5854a = true;
        }
    }

    /* renamed from: c */
    public void m5471c(BannerLayoutManager bannerLayoutManager, BannerLayoutManager.InterfaceC6487a interfaceC6487a) {
        int iM5460o = bannerLayoutManager.m5460o();
        if (iM5460o == 0) {
            this.f5852c = false;
        } else if (bannerLayoutManager.getOrientation() == 1) {
            this.f5850a.smoothScrollBy(0, iM5460o);
        } else {
            this.f5850a.smoothScrollBy(iM5460o, 0);
        }
        if (interfaceC6487a != null) {
            interfaceC6487a.onPageSelected(bannerLayoutManager.m5454g());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public boolean onFling(int i10, int i11) {
        BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) this.f5850a.getLayoutManager();
        if (bannerLayoutManager == null || this.f5850a.getAdapter() == null) {
            return false;
        }
        if (!bannerLayoutManager.m5456j() && (bannerLayoutManager.f5826g == bannerLayoutManager.m5457k() || bannerLayoutManager.f5826g == bannerLayoutManager.m5458l())) {
            return false;
        }
        int minFlingVelocity = this.f5850a.getMinFlingVelocity();
        this.f5851b.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (bannerLayoutManager.f5823d == 1 && Math.abs(i11) > minFlingVelocity) {
            int iM5454g = bannerLayoutManager.m5454g();
            int finalY = (int) ((this.f5851b.getFinalY() / bannerLayoutManager.f5833n) / bannerLayoutManager.m5455i());
            this.f5850a.smoothScrollToPosition(bannerLayoutManager.getReverseLayout() ? iM5454g - finalY : iM5454g + finalY);
            return true;
        }
        if (bannerLayoutManager.f5823d == 0 && Math.abs(i10) > minFlingVelocity) {
            int iM5454g2 = bannerLayoutManager.m5454g();
            int finalX = (int) ((this.f5851b.getFinalX() / bannerLayoutManager.f5833n) / bannerLayoutManager.m5455i());
            this.f5850a.smoothScrollToPosition(bannerLayoutManager.getReverseLayout() ? iM5454g2 - finalX : iM5454g2 + finalX);
        }
        return true;
    }
}
