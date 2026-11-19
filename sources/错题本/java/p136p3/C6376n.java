package p136p3;

import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.widget.tabbar.VerticalTabLayout;

/* renamed from: p3.n */
/* loaded from: classes3.dex */
public final class C6376n implements ViewPager.OnPageChangeListener {

    /* renamed from: a */
    public int f10422a;

    /* renamed from: b */
    public boolean f10423b;

    /* renamed from: c */
    public final /* synthetic */ VerticalTabLayout f10424c;

    public C6376n(VerticalTabLayout verticalTabLayout) {
        this.f10424c = verticalTabLayout;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
        int i8 = this.f10422a;
        this.f10422a = i;
        this.f10423b = (i == 2 && i8 == 0) ? false : true;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i8) {
        if (this.f10423b) {
            this.f10424c.f4961b.m6028a(f + i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        VerticalTabLayout verticalTabLayout = this.f10424c;
        if (i != verticalTabLayout.getSelectedTabPosition()) {
            verticalTabLayout.post(new RunnableC6374l(verticalTabLayout, i, !this.f10423b));
        }
    }
}
