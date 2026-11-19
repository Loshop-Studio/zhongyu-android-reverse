package p136p3;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.widget.tabbar.TabSegment;

/* renamed from: p3.e */
/* loaded from: classes3.dex */
public final class C6367e implements ViewPager.OnAdapterChangeListener {

    /* renamed from: a */
    public boolean f10408a;

    /* renamed from: b */
    public final /* synthetic */ TabSegment f10409b;

    public C6367e(TabSegment tabSegment) {
        this.f10409b = tabSegment;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
    public final void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        TabSegment tabSegment = this.f10409b;
        if (tabSegment.f4949u == viewPager) {
            tabSegment.m3596j(pagerAdapter2, true, this.f10408a);
        }
    }
}
