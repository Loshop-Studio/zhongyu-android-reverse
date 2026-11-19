package com.xuexiang.xui.widget.banner.recycler.layout;

import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager;

/* loaded from: classes5.dex */
public class CenterSnapHelper extends RecyclerView.OnFlingListener {

    /* renamed from: a */
    public RecyclerView f15440a;

    /* renamed from: b */
    public Scroller f15441b;

    /* renamed from: c */
    public boolean f15442c = false;

    /* renamed from: d */
    public final RecyclerView.OnScrollListener f15443d = new C8057a();

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.CenterSnapHelper$a */
    public class C8057a extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public boolean f15444a = false;

        public C8057a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
            BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) recyclerView.getLayoutManager();
            if (bannerLayoutManager != null && i10 == 0 && this.f15444a) {
                this.f15444a = false;
                if (CenterSnapHelper.this.f15442c) {
                    CenterSnapHelper.this.f15442c = false;
                } else {
                    CenterSnapHelper.this.f15442c = true;
                    CenterSnapHelper.this.m12339c(bannerLayoutManager, null);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f15444a = true;
        }
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f15440a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.f15440a = recyclerView;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof BannerLayoutManager) {
                setupCallbacks();
                this.f15441b = new Scroller(this.f15440a.getContext(), new DecelerateInterpolator());
                BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) layoutManager;
                bannerLayoutManager.getClass();
                m12339c(bannerLayoutManager, null);
            }
        }
    }

    /* renamed from: c */
    public void m12339c(BannerLayoutManager bannerLayoutManager, BannerLayoutManager.InterfaceC8056a interfaceC8056a) {
        int iM12328o = bannerLayoutManager.m12328o();
        if (iM12328o == 0) {
            this.f15442c = false;
        } else if (bannerLayoutManager.getOrientation() == 1) {
            this.f15440a.smoothScrollBy(0, iM12328o);
        } else {
            this.f15440a.smoothScrollBy(iM12328o, 0);
        }
        if (interfaceC8056a != null) {
            interfaceC8056a.onPageSelected(bannerLayoutManager.m12322g());
        }
    }

    public void destroyCallbacks() {
        this.f15440a.removeOnScrollListener(this.f15443d);
        this.f15440a.setOnFlingListener(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public boolean onFling(int i10, int i11) {
        BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) this.f15440a.getLayoutManager();
        if (bannerLayoutManager == null || this.f15440a.getAdapter() == null) {
            return false;
        }
        if (!bannerLayoutManager.m12324j() && (bannerLayoutManager.f15416g == bannerLayoutManager.m12325k() || bannerLayoutManager.f15416g == bannerLayoutManager.m12326l())) {
            return false;
        }
        int minFlingVelocity = this.f15440a.getMinFlingVelocity();
        this.f15441b.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (bannerLayoutManager.f15413d == 1 && Math.abs(i11) > minFlingVelocity) {
            int iM12322g = bannerLayoutManager.m12322g();
            int finalY = (int) ((this.f15441b.getFinalY() / bannerLayoutManager.f15423n) / bannerLayoutManager.m12323i());
            this.f15440a.smoothScrollToPosition(bannerLayoutManager.getReverseLayout() ? iM12322g - finalY : iM12322g + finalY);
            return true;
        }
        if (bannerLayoutManager.f15413d == 0 && Math.abs(i10) > minFlingVelocity) {
            int iM12322g2 = bannerLayoutManager.m12322g();
            int finalX = (int) ((this.f15441b.getFinalX() / bannerLayoutManager.f15423n) / bannerLayoutManager.m12323i());
            this.f15440a.smoothScrollToPosition(bannerLayoutManager.getReverseLayout() ? iM12322g2 - finalX : iM12322g2 + finalX);
        }
        return true;
    }

    public void setupCallbacks() {
        if (this.f15440a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f15440a.addOnScrollListener(this.f15443d);
        this.f15440a.setOnFlingListener(this);
    }
}
