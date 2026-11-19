package com.xuexiang.xui.widget.tabbar;

import androidx.viewpager.widget.ViewPager;
import com.blankj.utilcode.util.AbstractC5379p;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class TabSegment$TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

    /* renamed from: a */
    public final WeakReference f8232a;

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i10) {
        AbstractC5379p.m2596a(this.f8232a.get());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i10, float f10, int i11) {
        AbstractC5379p.m2596a(this.f8232a.get());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i10) {
        AbstractC5379p.m2596a(this.f8232a.get());
    }
}
