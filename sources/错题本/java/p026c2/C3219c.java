package p026c2;

import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopPagerAdapterWrapper;
import com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopViewPager;

/* renamed from: c2.c */
/* loaded from: classes3.dex */
public final class C3219c implements ViewPager.OnPageChangeListener {

    /* renamed from: a */
    public float f1780a = -1.0f;

    /* renamed from: b */
    public float f1781b = -1.0f;

    /* renamed from: c */
    public final /* synthetic */ LoopViewPager f1782c;

    public C3219c(LoopViewPager loopViewPager) {
        this.f1782c = loopViewPager;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
        LoopViewPager loopViewPager = this.f1782c;
        if (loopViewPager.f4065a != null) {
            int currentItem = super/*androidx.viewpager.widget.ViewPager*/.getCurrentItem();
            int iM3459a = loopViewPager.f4065a.m3459a(currentItem);
            if (i == 0 && (currentItem == 0 || currentItem == loopViewPager.f4065a.getCount() - 1)) {
                loopViewPager.setCurrentItem(iM3459a, false);
            }
        }
        if (loopViewPager.f4067c != null) {
            for (int i8 = 0; i8 < loopViewPager.f4067c.size(); i8++) {
                ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) loopViewPager.f4067c.get(i8);
                if (onPageChangeListener != null) {
                    onPageChangeListener.onPageScrollStateChanged(i);
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i8) {
        LoopViewPager loopViewPager = this.f1782c;
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = loopViewPager.f4065a;
        if (loopPagerAdapterWrapper != null) {
            int iM3459a = loopPagerAdapterWrapper.m3459a(i);
            if (f == 0.0f && this.f1780a == 0.0f && (i == 0 || i == loopViewPager.f4065a.getCount() - 1)) {
                loopViewPager.setCurrentItem(iM3459a, false);
            }
            i = iM3459a;
        }
        this.f1780a = f;
        int count = loopViewPager.f4065a != null ? r1.f4062a.getCount() - 1 : -1;
        if (loopViewPager.f4067c != null) {
            for (int i9 = 0; i9 < loopViewPager.f4067c.size(); i9++) {
                ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) loopViewPager.f4067c.get(i9);
                if (onPageChangeListener != null) {
                    if (i != count) {
                        onPageChangeListener.onPageScrolled(i, f, i8);
                    } else if (f > 0.5d) {
                        onPageChangeListener.onPageScrolled(0, 0.0f, 0);
                    } else {
                        onPageChangeListener.onPageScrolled(i, 0.0f, 0);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        LoopViewPager loopViewPager = this.f1782c;
        int iM3459a = loopViewPager.f4065a.m3459a(i);
        float f = iM3459a;
        if (this.f1781b != f) {
            this.f1781b = f;
            if (loopViewPager.f4067c != null) {
                for (int i8 = 0; i8 < loopViewPager.f4067c.size(); i8++) {
                    ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) loopViewPager.f4067c.get(i8);
                    if (onPageChangeListener != null) {
                        onPageChangeListener.onPageSelected(iM3459a);
                    }
                }
            }
        }
    }
}
