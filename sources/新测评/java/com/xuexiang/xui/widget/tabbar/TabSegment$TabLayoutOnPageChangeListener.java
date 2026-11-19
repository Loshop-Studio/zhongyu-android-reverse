package com.xuexiang.xui.widget.tabbar;

import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import p137k.AbstractC7846r;

/* loaded from: classes4.dex */
public class TabSegment$TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

    /* renamed from: a */
    public final WeakReference f6772a;

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i10) {
        AbstractC7846r.m13306a(this.f6772a.get());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i10, float f10, int i11) {
        AbstractC7846r.m13306a(this.f6772a.get());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i10) {
        AbstractC7846r.m13306a(this.f6772a.get());
    }
}
