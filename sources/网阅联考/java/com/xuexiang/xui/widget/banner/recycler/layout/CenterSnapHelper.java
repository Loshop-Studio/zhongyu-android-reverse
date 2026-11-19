package com.xuexiang.xui.widget.banner.recycler.layout;

import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager;

/* loaded from: classes2.dex */
public class CenterSnapHelper extends RecyclerView.OnFlingListener {

    /* renamed from: a */
    public RecyclerView f3190a;

    /* renamed from: b */
    public Scroller f3191b;

    /* renamed from: c */
    public boolean f3192c = false;

    /* renamed from: d */
    public final RecyclerView.OnScrollListener f3193d = new C3537a();

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.CenterSnapHelper$a */
    public class C3537a extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public boolean f3194a = false;

        public C3537a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) recyclerView.getLayoutManager();
            if (bannerLayoutManager != null && i4 == 0 && this.f3194a) {
                this.f3194a = false;
                if (CenterSnapHelper.this.f3192c) {
                    CenterSnapHelper.this.f3192c = false;
                } else {
                    CenterSnapHelper.this.f3192c = true;
                    CenterSnapHelper.this.m4157c(bannerLayoutManager, null);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
            if (i4 == 0 && i5 == 0) {
                return;
            }
            this.f3194a = true;
        }
    }

    /* renamed from: c */
    public void m4157c(BannerLayoutManager bannerLayoutManager, BannerLayoutManager.InterfaceC3536a interfaceC3536a) {
        int iM4141o = bannerLayoutManager.m4141o();
        if (iM4141o == 0) {
            this.f3192c = false;
        } else if (bannerLayoutManager.getOrientation() == 1) {
            this.f3190a.smoothScrollBy(0, iM4141o);
        } else {
            this.f3190a.smoothScrollBy(iM4141o, 0);
        }
        if (interfaceC3536a != null) {
            interfaceC3536a.onPageSelected(bannerLayoutManager.m4133g());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public boolean onFling(int i4, int i5) {
        BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) this.f3190a.getLayoutManager();
        if (bannerLayoutManager == null || this.f3190a.getAdapter() == null) {
            return false;
        }
        if (!bannerLayoutManager.m4136j() && (bannerLayoutManager.f3166g == bannerLayoutManager.m4137k() || bannerLayoutManager.f3166g == bannerLayoutManager.m4138l())) {
            return false;
        }
        int minFlingVelocity = this.f3190a.getMinFlingVelocity();
        this.f3191b.fling(0, 0, i4, i5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (bannerLayoutManager.f3163d == 1 && Math.abs(i5) > minFlingVelocity) {
            int iM4133g = bannerLayoutManager.m4133g();
            int finalY = (int) ((this.f3191b.getFinalY() / bannerLayoutManager.f3173n) / bannerLayoutManager.m4135i());
            this.f3190a.smoothScrollToPosition(bannerLayoutManager.getReverseLayout() ? iM4133g - finalY : iM4133g + finalY);
            return true;
        }
        if (bannerLayoutManager.f3163d == 0 && Math.abs(i4) > minFlingVelocity) {
            int iM4133g2 = bannerLayoutManager.m4133g();
            int finalX = (int) ((this.f3191b.getFinalX() / bannerLayoutManager.f3173n) / bannerLayoutManager.m4135i());
            this.f3190a.smoothScrollToPosition(bannerLayoutManager.getReverseLayout() ? iM4133g2 - finalX : iM4133g2 + finalX);
        }
        return true;
    }
}
