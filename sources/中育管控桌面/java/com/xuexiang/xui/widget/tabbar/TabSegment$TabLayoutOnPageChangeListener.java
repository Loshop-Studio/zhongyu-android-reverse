package com.xuexiang.xui.widget.tabbar;

import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import p087k.AbstractC6619r;

/* loaded from: classes3.dex */
public class TabSegment$TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

    /* renamed from: a */
    public final WeakReference f5496a;

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i6) {
        AbstractC6619r.m7572a(this.f5496a.get());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i6, float f6, int i7) {
        AbstractC6619r.m7572a(this.f5496a.get());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i6) {
        AbstractC6619r.m7572a(this.f5496a.get());
    }
}
