package com.xuexiang.xui.widget.tabbar;

import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import p217q.AbstractC9343a;

/* loaded from: classes4.dex */
public class TabSegment$TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

    /* renamed from: a */
    public final WeakReference f8028a;

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i9) {
        AbstractC9343a.m15285a(this.f8028a.get());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i9, float f10, int i10) {
        AbstractC9343a.m15285a(this.f8028a.get());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i9) {
        AbstractC9343a.m15285a(this.f8028a.get());
    }
}
