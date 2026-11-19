package com.xuexiang.xui.widget.tabbar;

import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.AbstractC2857b;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class TabSegment$TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

    /* renamed from: a */
    public final WeakReference f3958a;

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i4) {
        AbstractC2857b.m1678a(this.f3958a.get());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i4, float f4, int i5) {
        AbstractC2857b.m1678a(this.f3958a.get());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i4) {
        AbstractC2857b.m1678a(this.f3958a.get());
    }
}
