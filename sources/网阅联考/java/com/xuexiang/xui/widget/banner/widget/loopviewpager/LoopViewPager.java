package com.xuexiang.xui.widget.banner.widget.loopviewpager;

import android.content.Context;
import android.content.res.Resources;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class LoopViewPager extends ViewPager {

    /* renamed from: a */
    public LoopPagerAdapterWrapper f3230a;

    /* renamed from: b */
    public boolean f3231b;

    /* renamed from: c */
    public List f3232c;

    /* renamed from: d */
    public ViewPager.OnPageChangeListener f3233d;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopViewPager$a */
    public class C3543a implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        public float f3234a = -1.0f;

        /* renamed from: b */
        public float f3235b = -1.0f;

        public C3543a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) throws Resources.NotFoundException {
            if (LoopViewPager.this.f3230a != null) {
                int currentItem = LoopViewPager.super.getCurrentItem();
                int iM4197g = LoopViewPager.this.f3230a.m4197g(currentItem);
                if (i4 == 0 && (currentItem == 0 || currentItem == LoopViewPager.this.f3230a.getCount() - 1)) {
                    LoopViewPager.this.setCurrentItem(iM4197g, false);
                }
            }
            if (LoopViewPager.this.f3232c != null) {
                for (int i5 = 0; i5 < LoopViewPager.this.f3232c.size(); i5++) {
                    ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f3232c.get(i5);
                    if (onPageChangeListener != null) {
                        onPageChangeListener.onPageScrollStateChanged(i4);
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f4, int i5) throws Resources.NotFoundException {
            if (LoopViewPager.this.f3230a != null) {
                int iM4197g = LoopViewPager.this.f3230a.m4197g(i4);
                if (f4 == 0.0f && this.f3234a == 0.0f && (i4 == 0 || i4 == LoopViewPager.this.f3230a.getCount() - 1)) {
                    LoopViewPager.this.setCurrentItem(iM4197g, false);
                }
                i4 = iM4197g;
            }
            this.f3234a = f4;
            int iM4192b = LoopViewPager.this.f3230a != null ? LoopViewPager.this.f3230a.m4192b() - 1 : -1;
            if (LoopViewPager.this.f3232c != null) {
                for (int i6 = 0; i6 < LoopViewPager.this.f3232c.size(); i6++) {
                    ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f3232c.get(i6);
                    if (onPageChangeListener != null) {
                        if (i4 != iM4192b) {
                            onPageChangeListener.onPageScrolled(i4, f4, i5);
                        } else if (f4 > 0.5d) {
                            onPageChangeListener.onPageScrolled(0, 0.0f, 0);
                        } else {
                            onPageChangeListener.onPageScrolled(i4, 0.0f, 0);
                        }
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            int iM4197g = LoopViewPager.this.f3230a.m4197g(i4);
            float f4 = iM4197g;
            if (this.f3235b != f4) {
                this.f3235b = f4;
                if (LoopViewPager.this.f3232c != null) {
                    for (int i5 = 0; i5 < LoopViewPager.this.f3232c.size(); i5++) {
                        ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f3232c.get(i5);
                        if (onPageChangeListener != null) {
                            onPageChangeListener.onPageSelected(iM4197g);
                        }
                    }
                }
            }
        }
    }

    public LoopViewPager(Context context) {
        super(context);
        this.f3231b = false;
        this.f3233d = new C3543a();
        m4201d(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (this.f3232c == null) {
            this.f3232c = new ArrayList();
        }
        this.f3232c.add(onPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        List list = this.f3232c;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final void m4201d(Context context) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f3233d;
        if (onPageChangeListener != null) {
            super.removeOnPageChangeListener(onPageChangeListener);
        }
        super.addOnPageChangeListener(this.f3233d);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f3230a;
        return loopPagerAdapterWrapper != null ? loopPagerAdapterWrapper.m4191a() : loopPagerAdapterWrapper;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f3230a;
        if (loopPagerAdapterWrapper != null) {
            return loopPagerAdapterWrapper.m4197g(super.getCurrentItem());
        }
        return 0;
    }

    public PagerAdapter getPageAdapterWrapper() {
        return this.f3230a;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        List list = this.f3232c;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) throws Resources.NotFoundException {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = new LoopPagerAdapterWrapper(pagerAdapter);
        this.f3230a = loopPagerAdapterWrapper;
        loopPagerAdapterWrapper.m4195e(this.f3231b);
        super.setAdapter(this.f3230a);
        setCurrentItem(0, false);
    }

    public void setBoundaryCaching(boolean z3) {
        this.f3231b = z3;
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f3230a;
        if (loopPagerAdapterWrapper != null) {
            loopPagerAdapterWrapper.m4195e(z3);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i4, boolean z3) throws Resources.NotFoundException {
        super.setCurrentItem(this.f3230a.m4196f(i4), z3);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        addOnPageChangeListener(onPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i4) throws Resources.NotFoundException {
        if (getCurrentItem() != i4) {
            setCurrentItem(i4, true);
        }
    }
}
