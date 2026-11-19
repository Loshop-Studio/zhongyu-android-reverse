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
    public LoopPagerAdapterWrapper f7145a;

    /* renamed from: b */
    public boolean f7146b;

    /* renamed from: c */
    public List f7147c;

    /* renamed from: d */
    public ViewPager.OnPageChangeListener f7148d;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopViewPager$a */
    public class C6813a implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        public float f7149a = -1.0f;

        /* renamed from: b */
        public float f7150b = -1.0f;

        public C6813a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i9) throws Resources.NotFoundException {
            if (LoopViewPager.this.f7145a != null) {
                int currentItem = LoopViewPager.super.getCurrentItem();
                int iM6607g = LoopViewPager.this.f7145a.m6607g(currentItem);
                if (i9 == 0 && (currentItem == 0 || currentItem == LoopViewPager.this.f7145a.getCount() - 1)) {
                    LoopViewPager.this.setCurrentItem(iM6607g, false);
                }
            }
            if (LoopViewPager.this.f7147c != null) {
                for (int i10 = 0; i10 < LoopViewPager.this.f7147c.size(); i10++) {
                    ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f7147c.get(i10);
                    if (onPageChangeListener != null) {
                        onPageChangeListener.onPageScrollStateChanged(i9);
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i9, float f10, int i10) throws Resources.NotFoundException {
            if (LoopViewPager.this.f7145a != null) {
                int iM6607g = LoopViewPager.this.f7145a.m6607g(i9);
                if (f10 == 0.0f && this.f7149a == 0.0f && (i9 == 0 || i9 == LoopViewPager.this.f7145a.getCount() - 1)) {
                    LoopViewPager.this.setCurrentItem(iM6607g, false);
                }
                i9 = iM6607g;
            }
            this.f7149a = f10;
            int iM6602b = LoopViewPager.this.f7145a != null ? LoopViewPager.this.f7145a.m6602b() - 1 : -1;
            if (LoopViewPager.this.f7147c != null) {
                for (int i11 = 0; i11 < LoopViewPager.this.f7147c.size(); i11++) {
                    ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f7147c.get(i11);
                    if (onPageChangeListener != null) {
                        if (i9 != iM6602b) {
                            onPageChangeListener.onPageScrolled(i9, f10, i10);
                        } else if (f10 > 0.5d) {
                            onPageChangeListener.onPageScrolled(0, 0.0f, 0);
                        } else {
                            onPageChangeListener.onPageScrolled(i9, 0.0f, 0);
                        }
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i9) {
            int iM6607g = LoopViewPager.this.f7145a.m6607g(i9);
            float f10 = iM6607g;
            if (this.f7150b != f10) {
                this.f7150b = f10;
                if (LoopViewPager.this.f7147c != null) {
                    for (int i10 = 0; i10 < LoopViewPager.this.f7147c.size(); i10++) {
                        ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f7147c.get(i10);
                        if (onPageChangeListener != null) {
                            onPageChangeListener.onPageSelected(iM6607g);
                        }
                    }
                }
            }
        }
    }

    public LoopViewPager(Context context) {
        super(context);
        this.f7146b = false;
        this.f7148d = new C6813a();
        m6611d(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (this.f7147c == null) {
            this.f7147c = new ArrayList();
        }
        this.f7147c.add(onPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        List list = this.f7147c;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final void m6611d(Context context) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f7148d;
        if (onPageChangeListener != null) {
            super.removeOnPageChangeListener(onPageChangeListener);
        }
        super.addOnPageChangeListener(this.f7148d);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f7145a;
        return loopPagerAdapterWrapper != null ? loopPagerAdapterWrapper.m6601a() : loopPagerAdapterWrapper;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f7145a;
        if (loopPagerAdapterWrapper != null) {
            return loopPagerAdapterWrapper.m6607g(super.getCurrentItem());
        }
        return 0;
    }

    public PagerAdapter getPageAdapterWrapper() {
        return this.f7145a;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        List list = this.f7147c;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) throws Resources.NotFoundException {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = new LoopPagerAdapterWrapper(pagerAdapter);
        this.f7145a = loopPagerAdapterWrapper;
        loopPagerAdapterWrapper.m6605e(this.f7146b);
        super.setAdapter(this.f7145a);
        setCurrentItem(0, false);
    }

    public void setBoundaryCaching(boolean z9) {
        this.f7146b = z9;
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f7145a;
        if (loopPagerAdapterWrapper != null) {
            loopPagerAdapterWrapper.m6605e(z9);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i9, boolean z9) throws Resources.NotFoundException {
        super.setCurrentItem(this.f7145a.m6606f(i9), z9);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        addOnPageChangeListener(onPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i9) throws Resources.NotFoundException {
        if (getCurrentItem() != i9) {
            setCurrentItem(i9, true);
        }
    }
}
