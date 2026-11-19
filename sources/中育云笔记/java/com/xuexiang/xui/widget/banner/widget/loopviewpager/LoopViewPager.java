package com.xuexiang.xui.widget.banner.widget.loopviewpager;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class LoopViewPager extends ViewPager {

    /* renamed from: c */
    public LoopPagerAdapterWrapper f15526c;

    /* renamed from: d */
    public boolean f15527d;

    /* renamed from: e */
    public List f15528e;

    /* renamed from: f */
    public ViewPager.OnPageChangeListener f15529f;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopViewPager$a */
    public class C8068a implements ViewPager.OnPageChangeListener {

        /* renamed from: c */
        public float f15530c = -1.0f;

        /* renamed from: d */
        public float f15531d = -1.0f;

        public C8068a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) throws Resources.NotFoundException {
            if (LoopViewPager.this.f15526c != null) {
                int currentItem = LoopViewPager.super.getCurrentItem();
                int iM12417g = LoopViewPager.this.f15526c.m12417g(currentItem);
                if (i10 == 0 && (currentItem == 0 || currentItem == LoopViewPager.this.f15526c.getCount() - 1)) {
                    LoopViewPager.this.setCurrentItem(iM12417g, false);
                }
            }
            if (LoopViewPager.this.f15528e != null) {
                for (int i11 = 0; i11 < LoopViewPager.this.f15528e.size(); i11++) {
                    ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f15528e.get(i11);
                    if (onPageChangeListener != null) {
                        onPageChangeListener.onPageScrollStateChanged(i10);
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) throws Resources.NotFoundException {
            if (LoopViewPager.this.f15526c != null) {
                int iM12417g = LoopViewPager.this.f15526c.m12417g(i10);
                if (f10 == 0.0f && this.f15530c == 0.0f && (i10 == 0 || i10 == LoopViewPager.this.f15526c.getCount() - 1)) {
                    LoopViewPager.this.setCurrentItem(iM12417g, false);
                }
                i10 = iM12417g;
            }
            this.f15530c = f10;
            int iM12412b = LoopViewPager.this.f15526c != null ? LoopViewPager.this.f15526c.m12412b() - 1 : -1;
            if (LoopViewPager.this.f15528e != null) {
                for (int i12 = 0; i12 < LoopViewPager.this.f15528e.size(); i12++) {
                    ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f15528e.get(i12);
                    if (onPageChangeListener != null) {
                        if (i10 != iM12412b) {
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
            int iM12417g = LoopViewPager.this.f15526c.m12417g(i10);
            float f10 = iM12417g;
            if (this.f15531d != f10) {
                this.f15531d = f10;
                if (LoopViewPager.this.f15528e != null) {
                    for (int i11 = 0; i11 < LoopViewPager.this.f15528e.size(); i11++) {
                        ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f15528e.get(i11);
                        if (onPageChangeListener != null) {
                            onPageChangeListener.onPageSelected(iM12417g);
                        }
                    }
                }
            }
        }
    }

    public LoopViewPager(Context context) {
        super(context);
        this.f15527d = false;
        this.f15529f = new C8068a();
        m12421d(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (this.f15528e == null) {
            this.f15528e = new ArrayList();
        }
        this.f15528e.add(onPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        List list = this.f15528e;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final void m12421d(Context context) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f15529f;
        if (onPageChangeListener != null) {
            super.removeOnPageChangeListener(onPageChangeListener);
        }
        super.addOnPageChangeListener(this.f15529f);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f15526c;
        return loopPagerAdapterWrapper != null ? loopPagerAdapterWrapper.m12411a() : loopPagerAdapterWrapper;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f15526c;
        if (loopPagerAdapterWrapper != null) {
            return loopPagerAdapterWrapper.m12417g(super.getCurrentItem());
        }
        return 0;
    }

    public PagerAdapter getPageAdapterWrapper() {
        return this.f15526c;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        List list = this.f15528e;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) throws Resources.NotFoundException {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = new LoopPagerAdapterWrapper(pagerAdapter);
        this.f15526c = loopPagerAdapterWrapper;
        loopPagerAdapterWrapper.m12415e(this.f15527d);
        super.setAdapter(this.f15526c);
        setCurrentItem(0, false);
    }

    public void setBoundaryCaching(boolean z10) {
        this.f15527d = z10;
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f15526c;
        if (loopPagerAdapterWrapper != null) {
            loopPagerAdapterWrapper.m12415e(z10);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i10, boolean z10) throws Resources.NotFoundException {
        super.setCurrentItem(this.f15526c.m12416f(i10), z10);
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

    public LoopViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15527d = false;
        this.f15529f = new C8068a();
        m12421d(context);
    }
}
