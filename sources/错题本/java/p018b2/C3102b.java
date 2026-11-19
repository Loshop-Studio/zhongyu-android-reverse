package p018b2;

import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner;

/* renamed from: b2.b */
/* loaded from: classes3.dex */
public final class C3102b implements ViewPager.OnPageChangeListener {

    /* renamed from: a */
    public final /* synthetic */ BaseBanner f1540a;

    public C3102b(BaseBanner baseBanner) {
        this.f1540a = baseBanner;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
        int i8 = BaseBanner.f4025y;
        this.f1540a.getClass();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i8) {
        int i9 = BaseBanner.f4025y;
        this.f1540a.getClass();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        BaseBanner baseBanner = this.f1540a;
        int size = i % baseBanner.f4030e.size();
        baseBanner.f4031f = size;
        baseBanner.setCurrentIndicator(size);
        baseBanner.mo3451e(baseBanner.f4031f);
        baseBanner.f4041p.setVisibility((baseBanner.f4031f != baseBanner.f4030e.size() + (-1) || baseBanner.f4042q) ? 0 : 8);
        baseBanner.f4032g = baseBanner.f4031f;
    }
}
