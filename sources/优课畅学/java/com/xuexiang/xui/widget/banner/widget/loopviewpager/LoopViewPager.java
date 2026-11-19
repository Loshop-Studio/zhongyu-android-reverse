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
    public LoopPagerAdapterWrapper f7215a;

    /* renamed from: b */
    public boolean f7216b;

    /* renamed from: c */
    public List f7217c;

    /* renamed from: d */
    public ViewPager.OnPageChangeListener f7218d;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopViewPager$a */
    public class C6893a implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        public float f7219a = -1.0f;

        /* renamed from: b */
        public float f7220b = -1.0f;

        public C6893a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) throws Resources.NotFoundException {
            if (LoopViewPager.this.f7215a != null) {
                int currentItem = LoopViewPager.super.getCurrentItem();
                int iM6632g = LoopViewPager.this.f7215a.m6632g(currentItem);
                if (i10 == 0 && (currentItem == 0 || currentItem == LoopViewPager.this.f7215a.getCount() - 1)) {
                    LoopViewPager.this.setCurrentItem(iM6632g, false);
                }
            }
            if (LoopViewPager.this.f7217c != null) {
                for (int i11 = 0; i11 < LoopViewPager.this.f7217c.size(); i11++) {
                    ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f7217c.get(i11);
                    if (onPageChangeListener != null) {
                        onPageChangeListener.onPageScrollStateChanged(i10);
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) throws Resources.NotFoundException {
            if (LoopViewPager.this.f7215a != null) {
                int iM6632g = LoopViewPager.this.f7215a.m6632g(i10);
                if (f10 == 0.0f && this.f7219a == 0.0f && (i10 == 0 || i10 == LoopViewPager.this.f7215a.getCount() - 1)) {
                    LoopViewPager.this.setCurrentItem(iM6632g, false);
                }
                i10 = iM6632g;
            }
            this.f7219a = f10;
            int iM6627b = LoopViewPager.this.f7215a != null ? LoopViewPager.this.f7215a.m6627b() - 1 : -1;
            if (LoopViewPager.this.f7217c != null) {
                for (int i12 = 0; i12 < LoopViewPager.this.f7217c.size(); i12++) {
                    ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f7217c.get(i12);
                    if (onPageChangeListener != null) {
                        if (i10 != iM6627b) {
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
            int iM6632g = LoopViewPager.this.f7215a.m6632g(i10);
            float f10 = iM6632g;
            if (this.f7220b != f10) {
                this.f7220b = f10;
                if (LoopViewPager.this.f7217c != null) {
                    for (int i11 = 0; i11 < LoopViewPager.this.f7217c.size(); i11++) {
                        ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f7217c.get(i11);
                        if (onPageChangeListener != null) {
                            onPageChangeListener.onPageSelected(iM6632g);
                        }
                    }
                }
            }
        }
    }

    public LoopViewPager(Context context) {
        super(context);
        this.f7216b = false;
        this.f7218d = new C6893a();
        m6636d(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (this.f7217c == null) {
            this.f7217c = new ArrayList();
        }
        this.f7217c.add(onPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        List list = this.f7217c;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final void m6636d(Context context) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f7218d;
        if (onPageChangeListener != null) {
            super.removeOnPageChangeListener(onPageChangeListener);
        }
        super.addOnPageChangeListener(this.f7218d);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f7215a;
        return loopPagerAdapterWrapper != null ? loopPagerAdapterWrapper.m6626a() : loopPagerAdapterWrapper;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f7215a;
        if (loopPagerAdapterWrapper != null) {
            return loopPagerAdapterWrapper.m6632g(super.getCurrentItem());
        }
        return 0;
    }

    public PagerAdapter getPageAdapterWrapper() {
        return this.f7215a;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        List list = this.f7217c;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) throws Resources.NotFoundException {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = new LoopPagerAdapterWrapper(pagerAdapter);
        this.f7215a = loopPagerAdapterWrapper;
        loopPagerAdapterWrapper.m6630e(this.f7216b);
        super.setAdapter(this.f7215a);
        setCurrentItem(0, false);
    }

    public void setBoundaryCaching(boolean z10) {
        this.f7216b = z10;
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f7215a;
        if (loopPagerAdapterWrapper != null) {
            loopPagerAdapterWrapper.m6630e(z10);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i10, boolean z10) throws Resources.NotFoundException {
        super.setCurrentItem(this.f7215a.m6631f(i10), z10);
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
