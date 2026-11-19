package com.tendcloud.dot;

import androidx.viewpager.widget.ViewPager;
import com.tendcloud.tenddata.C7896ca;

/* loaded from: classes5.dex */
public class DotOnPageChangeListener implements ViewPager.OnPageChangeListener {

    /* renamed from: b */
    private static PageChangeListener f14176b;

    /* renamed from: a */
    private ViewPager.OnPageChangeListener f14177a;

    /* renamed from: c */
    private ViewPager f14178c;

    public interface PageChangeListener {
        void onPageSelect(int i10);
    }

    private DotOnPageChangeListener(ViewPager viewPager, ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f14178c = viewPager;
        this.f14177a = onPageChangeListener;
    }

    /* renamed from: a */
    private ViewPager.OnPageChangeListener m11023a() {
        return this.f14177a;
    }

    public static ViewPager.OnPageChangeListener getDotOnPageChangeListener(ViewPager viewPager, ViewPager.OnPageChangeListener onPageChangeListener) {
        try {
            return onPageChangeListener instanceof DotOnPageChangeListener ? new DotOnPageChangeListener(viewPager, ((DotOnPageChangeListener) onPageChangeListener).m11023a()) : new DotOnPageChangeListener(viewPager, onPageChangeListener);
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
            return onPageChangeListener;
        }
    }

    public static void setCallback(PageChangeListener pageChangeListener) {
        f14176b = pageChangeListener;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i10) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f14177a;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i10);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i10, float f10, int i11) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f14177a;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i10, f10, i11);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i10) {
        try {
            PageChangeListener pageChangeListener = f14176b;
            if (pageChangeListener != null) {
                pageChangeListener.onPageSelect(i10);
            }
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f14177a;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i10);
        }
    }
}
