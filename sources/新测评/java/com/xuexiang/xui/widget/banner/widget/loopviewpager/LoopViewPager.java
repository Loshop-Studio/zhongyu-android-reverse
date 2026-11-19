package com.xuexiang.xui.widget.banner.widget.loopviewpager;

import android.content.Context;
import android.content.res.Resources;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class LoopViewPager extends ViewPager {

    /* renamed from: a */
    public LoopPagerAdapterWrapper f5890a;

    /* renamed from: b */
    public boolean f5891b;

    /* renamed from: c */
    public List f5892c;

    /* renamed from: d */
    public ViewPager.OnPageChangeListener f5893d;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopViewPager$a */
    public class C6494a implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        public float f5894a = -1.0f;

        /* renamed from: b */
        public float f5895b = -1.0f;

        public C6494a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) throws Resources.NotFoundException {
            if (LoopViewPager.this.f5890a != null) {
                int currentItem = LoopViewPager.super.getCurrentItem();
                int iM5511g = LoopViewPager.this.f5890a.m5511g(currentItem);
                if (i10 == 0 && (currentItem == 0 || currentItem == LoopViewPager.this.f5890a.getCount() - 1)) {
                    LoopViewPager.this.setCurrentItem(iM5511g, false);
                }
            }
            if (LoopViewPager.this.f5892c != null) {
                for (int i11 = 0; i11 < LoopViewPager.this.f5892c.size(); i11++) {
                    ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f5892c.get(i11);
                    if (onPageChangeListener != null) {
                        onPageChangeListener.onPageScrollStateChanged(i10);
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) throws Resources.NotFoundException {
            if (LoopViewPager.this.f5890a != null) {
                int iM5511g = LoopViewPager.this.f5890a.m5511g(i10);
                if (f10 == 0.0f && this.f5894a == 0.0f && (i10 == 0 || i10 == LoopViewPager.this.f5890a.getCount() - 1)) {
                    LoopViewPager.this.setCurrentItem(iM5511g, false);
                }
                i10 = iM5511g;
            }
            this.f5894a = f10;
            int iM5506b = LoopViewPager.this.f5890a != null ? LoopViewPager.this.f5890a.m5506b() - 1 : -1;
            if (LoopViewPager.this.f5892c != null) {
                for (int i12 = 0; i12 < LoopViewPager.this.f5892c.size(); i12++) {
                    ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f5892c.get(i12);
                    if (onPageChangeListener != null) {
                        if (i10 != iM5506b) {
                            onPageChangeListener.onPageScrolled(i10, f10, i11);
                        } else if (f10 > 0.5d) {
                            onPageChangeListener.onPageScrolled(0, 0.0f, 0);
                        } else {
                            onPageChangeListener.onPageScrolled(i10, 0.0f, 0);
                        }
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            int iM5511g = LoopViewPager.this.f5890a.m5511g(i10);
            float f10 = iM5511g;
            if (this.f5895b != f10) {
                this.f5895b = f10;
                if (LoopViewPager.this.f5892c != null) {
                    for (int i11 = 0; i11 < LoopViewPager.this.f5892c.size(); i11++) {
                        ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f5892c.get(i11);
                        if (onPageChangeListener != null) {
                            onPageChangeListener.onPageSelected(iM5511g);
                        }
                    }
                }
            }
        }
    }

    public LoopViewPager(Context context) {
        super(context);
        this.f5891b = false;
        this.f5893d = new C6494a();
        m5515d(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (this.f5892c == null) {
            this.f5892c = new ArrayList();
        }
        this.f5892c.add(onPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        List list = this.f5892c;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final void m5515d(Context context) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f5893d;
        if (onPageChangeListener != null) {
            super.removeOnPageChangeListener(onPageChangeListener);
        }
        super.addOnPageChangeListener(this.f5893d);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f5890a;
        return loopPagerAdapterWrapper != null ? loopPagerAdapterWrapper.m5505a() : loopPagerAdapterWrapper;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f5890a;
        if (loopPagerAdapterWrapper != null) {
            return loopPagerAdapterWrapper.m5511g(super.getCurrentItem());
        }
        return 0;
    }

    public PagerAdapter getPageAdapterWrapper() {
        return this.f5890a;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        List list = this.f5892c;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) throws Resources.NotFoundException {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = new LoopPagerAdapterWrapper(pagerAdapter);
        this.f5890a = loopPagerAdapterWrapper;
        loopPagerAdapterWrapper.m5509e(this.f5891b);
        super.setAdapter(this.f5890a);
        setCurrentItem(0, false);
    }

    public void setBoundaryCaching(boolean z9) {
        this.f5891b = z9;
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f5890a;
        if (loopPagerAdapterWrapper != null) {
            loopPagerAdapterWrapper.m5509e(z9);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i10, boolean z9) throws Resources.NotFoundException {
        super.setCurrentItem(this.f5890a.m5510f(i10), z9);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        addOnPageChangeListener(onPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i10) throws Resources.NotFoundException {
        if (getCurrentItem() != i10) {
            setCurrentItem(i10, true);
        }
    }
}
