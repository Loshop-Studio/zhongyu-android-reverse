package com.xuexiang.xui.widget.banner.widget.loopviewpager;

import android.content.Context;
import android.content.res.Resources;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class LoopViewPager extends ViewPager {

    /* renamed from: a */
    public LoopPagerAdapterWrapper f4614a;

    /* renamed from: b */
    public boolean f4615b;

    /* renamed from: c */
    public List f4616c;

    /* renamed from: d */
    public ViewPager.OnPageChangeListener f4617d;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopViewPager$a */
    public class C5872a implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        public float f4618a = -1.0f;

        /* renamed from: b */
        public float f4619b = -1.0f;

        public C5872a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i6) throws Resources.NotFoundException {
            if (LoopViewPager.this.f4614a != null) {
                int currentItem = LoopViewPager.super.getCurrentItem();
                int iM4521g = LoopViewPager.this.f4614a.m4521g(currentItem);
                if (i6 == 0 && (currentItem == 0 || currentItem == LoopViewPager.this.f4614a.getCount() - 1)) {
                    LoopViewPager.this.setCurrentItem(iM4521g, false);
                }
            }
            if (LoopViewPager.this.f4616c != null) {
                for (int i7 = 0; i7 < LoopViewPager.this.f4616c.size(); i7++) {
                    ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f4616c.get(i7);
                    if (onPageChangeListener != null) {
                        onPageChangeListener.onPageScrollStateChanged(i6);
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i6, float f6, int i7) throws Resources.NotFoundException {
            if (LoopViewPager.this.f4614a != null) {
                int iM4521g = LoopViewPager.this.f4614a.m4521g(i6);
                if (f6 == 0.0f && this.f4618a == 0.0f && (i6 == 0 || i6 == LoopViewPager.this.f4614a.getCount() - 1)) {
                    LoopViewPager.this.setCurrentItem(iM4521g, false);
                }
                i6 = iM4521g;
            }
            this.f4618a = f6;
            int iM4516b = LoopViewPager.this.f4614a != null ? LoopViewPager.this.f4614a.m4516b() - 1 : -1;
            if (LoopViewPager.this.f4616c != null) {
                for (int i8 = 0; i8 < LoopViewPager.this.f4616c.size(); i8++) {
                    ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f4616c.get(i8);
                    if (onPageChangeListener != null) {
                        if (i6 != iM4516b) {
                            onPageChangeListener.onPageScrolled(i6, f6, i7);
                        } else if (f6 > 0.5d) {
                            onPageChangeListener.onPageScrolled(0, 0.0f, 0);
                        } else {
                            onPageChangeListener.onPageScrolled(i6, 0.0f, 0);
                        }
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i6) {
            int iM4521g = LoopViewPager.this.f4614a.m4521g(i6);
            float f6 = iM4521g;
            if (this.f4619b != f6) {
                this.f4619b = f6;
                if (LoopViewPager.this.f4616c != null) {
                    for (int i7 = 0; i7 < LoopViewPager.this.f4616c.size(); i7++) {
                        ViewPager.OnPageChangeListener onPageChangeListener = (ViewPager.OnPageChangeListener) LoopViewPager.this.f4616c.get(i7);
                        if (onPageChangeListener != null) {
                            onPageChangeListener.onPageSelected(iM4521g);
                        }
                    }
                }
            }
        }
    }

    public LoopViewPager(Context context) {
        super(context);
        this.f4615b = false;
        this.f4617d = new C5872a();
        m4525d(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (this.f4616c == null) {
            this.f4616c = new ArrayList();
        }
        this.f4616c.add(onPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        List list = this.f4616c;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final void m4525d(Context context) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f4617d;
        if (onPageChangeListener != null) {
            super.removeOnPageChangeListener(onPageChangeListener);
        }
        super.addOnPageChangeListener(this.f4617d);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f4614a;
        return loopPagerAdapterWrapper != null ? loopPagerAdapterWrapper.m4515a() : loopPagerAdapterWrapper;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f4614a;
        if (loopPagerAdapterWrapper != null) {
            return loopPagerAdapterWrapper.m4521g(super.getCurrentItem());
        }
        return 0;
    }

    public PagerAdapter getPageAdapterWrapper() {
        return this.f4614a;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        List list = this.f4616c;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) throws Resources.NotFoundException {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = new LoopPagerAdapterWrapper(pagerAdapter);
        this.f4614a = loopPagerAdapterWrapper;
        loopPagerAdapterWrapper.m4519e(this.f4615b);
        super.setAdapter(this.f4614a);
        setCurrentItem(0, false);
    }

    public void setBoundaryCaching(boolean z6) {
        this.f4615b = z6;
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f4614a;
        if (loopPagerAdapterWrapper != null) {
            loopPagerAdapterWrapper.m4519e(z6);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i6, boolean z6) throws Resources.NotFoundException {
        super.setCurrentItem(this.f4614a.m4520f(i6), z6);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        addOnPageChangeListener(onPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i6) throws Resources.NotFoundException {
        if (getCurrentItem() != i6) {
            setCurrentItem(i6, true);
        }
    }
}
