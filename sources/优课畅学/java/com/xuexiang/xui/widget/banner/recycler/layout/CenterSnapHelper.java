package com.xuexiang.xui.widget.banner.recycler.layout;

import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager;

/* loaded from: classes4.dex */
public class CenterSnapHelper extends RecyclerView.OnFlingListener {

    /* renamed from: a */
    public RecyclerView f7175a;

    /* renamed from: b */
    public Scroller f7176b;

    /* renamed from: c */
    public boolean f7177c = false;

    /* renamed from: d */
    public final RecyclerView.OnScrollListener f7178d = new C6887a();

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.CenterSnapHelper$a */
    public class C6887a extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public boolean f7179a = false;

        public C6887a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
            BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) recyclerView.getLayoutManager();
            if (bannerLayoutManager != null && i10 == 0 && this.f7179a) {
                this.f7179a = false;
                if (CenterSnapHelper.this.f7177c) {
                    CenterSnapHelper.this.f7177c = false;
                } else {
                    CenterSnapHelper.this.f7177c = true;
                    CenterSnapHelper.this.m6592c(bannerLayoutManager, null);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f7179a = true;
        }
    }

    /* renamed from: c */
    public void m6592c(BannerLayoutManager bannerLayoutManager, BannerLayoutManager.InterfaceC6886a interfaceC6886a) {
        int iM6581o = bannerLayoutManager.m6581o();
        if (iM6581o == 0) {
            this.f7177c = false;
        } else if (bannerLayoutManager.getOrientation() == 1) {
            this.f7175a.smoothScrollBy(0, iM6581o);
        } else {
            this.f7175a.smoothScrollBy(iM6581o, 0);
        }
        if (interfaceC6886a != null) {
            interfaceC6886a.onPageSelected(bannerLayoutManager.m6575g());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public boolean onFling(int i10, int i11) {
        BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) this.f7175a.getLayoutManager();
        if (bannerLayoutManager == null || this.f7175a.getAdapter() == null) {
            return false;
        }
        if (!bannerLayoutManager.m6577j() && (bannerLayoutManager.f7151g == bannerLayoutManager.m6578k() || bannerLayoutManager.f7151g == bannerLayoutManager.m6579l())) {
            return false;
        }
        int minFlingVelocity = this.f7175a.getMinFlingVelocity();
        this.f7176b.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (bannerLayoutManager.f7148d == 1 && Math.abs(i11) > minFlingVelocity) {
            int iM6575g = bannerLayoutManager.m6575g();
            int finalY = (int) ((this.f7176b.getFinalY() / bannerLayoutManager.f7158n) / bannerLayoutManager.m6576i());
            this.f7175a.smoothScrollToPosition(bannerLayoutManager.getReverseLayout() ? iM6575g - finalY : iM6575g + finalY);
            return true;
        }
        if (bannerLayoutManager.f7148d == 0 && Math.abs(i10) > minFlingVelocity) {
            int iM6575g2 = bannerLayoutManager.m6575g();
            int finalX = (int) ((this.f7176b.getFinalX() / bannerLayoutManager.f7158n) / bannerLayoutManager.m6576i());
            this.f7175a.smoothScrollToPosition(bannerLayoutManager.getReverseLayout() ? iM6575g2 - finalX : iM6575g2 + finalX);
        }
        return true;
    }
}
