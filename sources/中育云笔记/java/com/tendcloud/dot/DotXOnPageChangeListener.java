package com.tendcloud.dot;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes5.dex */
public class DotXOnPageChangeListener implements ViewPager.OnPageChangeListener {

    /* renamed from: a */
    private ViewPager.OnPageChangeListener f14181a;

    /* renamed from: b */
    private PageChangeListener f14182b;

    /* renamed from: c */
    private ViewPager f14183c;

    public interface PageChangeListener {
        void onPageSelect(int i10);
    }

    private DotXOnPageChangeListener(ViewPager viewPager, ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f14183c = viewPager;
        this.f14181a = onPageChangeListener;
    }

    /* renamed from: a */
    private ViewPager.OnPageChangeListener m11025a() {
        return this.f14181a;
    }

    public static DotXOnPageChangeListener getDotOnPageChangeListener(ViewPager viewPager, ViewPager.OnPageChangeListener onPageChangeListener) {
        return onPageChangeListener instanceof DotXOnPageChangeListener ? new DotXOnPageChangeListener(viewPager, ((DotXOnPageChangeListener) onPageChangeListener).m11025a()) : new DotXOnPageChangeListener(viewPager, onPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i10) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f14181a;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i10);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i10, float f10, int i11) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f14181a;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i10, f10, i11);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i10) {
        PageChangeListener pageChangeListener = this.f14182b;
        if (pageChangeListener != null) {
            pageChangeListener.onPageSelect(i10);
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f14181a;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i10);
        }
    }

    /* renamed from: a */
    private String m11026a(View view) {
        return view.getId() != -1 ? view.getContext().getResources().getResourceEntryName(view.getId()) : "-1";
    }
}
