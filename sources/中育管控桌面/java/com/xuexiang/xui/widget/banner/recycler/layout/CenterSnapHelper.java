package com.xuexiang.xui.widget.banner.recycler.layout;

import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager;

/* loaded from: classes3.dex */
public class CenterSnapHelper extends RecyclerView.OnFlingListener {

    /* renamed from: a */
    public RecyclerView f4574a;

    /* renamed from: b */
    public Scroller f4575b;

    /* renamed from: c */
    public boolean f4576c = false;

    /* renamed from: d */
    public final RecyclerView.OnScrollListener f4577d = new C5866a();

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.CenterSnapHelper$a */
    public class C5866a extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public boolean f4578a = false;

        public C5866a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i6) {
            super.onScrollStateChanged(recyclerView, i6);
            BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) recyclerView.getLayoutManager();
            if (bannerLayoutManager != null && i6 == 0 && this.f4578a) {
                this.f4578a = false;
                if (CenterSnapHelper.this.f4576c) {
                    CenterSnapHelper.this.f4576c = false;
                } else {
                    CenterSnapHelper.this.f4576c = true;
                    CenterSnapHelper.this.m4481c(bannerLayoutManager, null);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i6, int i7) {
            if (i6 == 0 && i7 == 0) {
                return;
            }
            this.f4578a = true;
        }
    }

    /* renamed from: c */
    public void m4481c(BannerLayoutManager bannerLayoutManager, BannerLayoutManager.InterfaceC5865a interfaceC5865a) {
        int iM4470o = bannerLayoutManager.m4470o();
        if (iM4470o == 0) {
            this.f4576c = false;
        } else if (bannerLayoutManager.getOrientation() == 1) {
            this.f4574a.smoothScrollBy(0, iM4470o);
        } else {
            this.f4574a.smoothScrollBy(iM4470o, 0);
        }
        if (interfaceC5865a != null) {
            interfaceC5865a.onPageSelected(bannerLayoutManager.m4464g());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public boolean onFling(int i6, int i7) {
        BannerLayoutManager bannerLayoutManager = (BannerLayoutManager) this.f4574a.getLayoutManager();
        if (bannerLayoutManager == null || this.f4574a.getAdapter() == null) {
            return false;
        }
        if (!bannerLayoutManager.m4466j() && (bannerLayoutManager.f4550g == bannerLayoutManager.m4467k() || bannerLayoutManager.f4550g == bannerLayoutManager.m4468l())) {
            return false;
        }
        int minFlingVelocity = this.f4574a.getMinFlingVelocity();
        this.f4575b.fling(0, 0, i6, i7, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (bannerLayoutManager.f4547d == 1 && Math.abs(i7) > minFlingVelocity) {
            int iM4464g = bannerLayoutManager.m4464g();
            int finalY = (int) ((this.f4575b.getFinalY() / bannerLayoutManager.f4557n) / bannerLayoutManager.m4465i());
            this.f4574a.smoothScrollToPosition(bannerLayoutManager.getReverseLayout() ? iM4464g - finalY : iM4464g + finalY);
            return true;
        }
        if (bannerLayoutManager.f4547d == 0 && Math.abs(i6) > minFlingVelocity) {
            int iM4464g2 = bannerLayoutManager.m4464g();
            int finalX = (int) ((this.f4575b.getFinalX() / bannerLayoutManager.f4557n) / bannerLayoutManager.m4465i());
            this.f4574a.smoothScrollToPosition(bannerLayoutManager.getReverseLayout() ? iM4464g2 - finalX : iM4464g2 + finalX);
        }
        return true;
    }
}
