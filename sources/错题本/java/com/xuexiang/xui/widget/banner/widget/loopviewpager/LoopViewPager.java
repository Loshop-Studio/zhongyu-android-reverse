package com.xuexiang.xui.widget.banner.widget.loopviewpager;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import p026c2.C3219c;

/* loaded from: classes3.dex */
public class LoopViewPager extends ViewPager {

    /* renamed from: a */
    public LoopPagerAdapterWrapper f4065a;

    /* renamed from: b */
    public boolean f4066b;

    /* renamed from: c */
    public ArrayList f4067c;

    public LoopViewPager(Context context) {
        super(context);
        this.f4066b = false;
        C3219c c3219c = new C3219c(this);
        super.removeOnPageChangeListener(c3219c);
        super.addOnPageChangeListener(c3219c);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void addOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (this.f4067c == null) {
            this.f4067c = new ArrayList();
        }
        this.f4067c.add(onPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void clearOnPageChangeListeners() {
        ArrayList arrayList = this.f4067c;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f4065a;
        return loopPagerAdapterWrapper != null ? loopPagerAdapterWrapper.f4062a : loopPagerAdapterWrapper;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f4065a;
        if (loopPagerAdapterWrapper != null) {
            return loopPagerAdapterWrapper.m3459a(super.getCurrentItem());
        }
        return 0;
    }

    public PagerAdapter getPageAdapterWrapper() {
        return this.f4065a;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void removeOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        ArrayList arrayList = this.f4067c;
        if (arrayList != null) {
            arrayList.remove(onPageChangeListener);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) throws Resources.NotFoundException {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = new LoopPagerAdapterWrapper();
        loopPagerAdapterWrapper.f4063b = new SparseArray();
        loopPagerAdapterWrapper.f4062a = pagerAdapter;
        this.f4065a = loopPagerAdapterWrapper;
        loopPagerAdapterWrapper.f4064c = this.f4066b;
        super.setAdapter(loopPagerAdapterWrapper);
        setCurrentItem(0, false);
    }

    public void setBoundaryCaching(boolean z8) {
        this.f4066b = z8;
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f4065a;
        if (loopPagerAdapterWrapper != null) {
            loopPagerAdapterWrapper.f4064c = z8;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void setCurrentItem(int i, boolean z8) {
        this.f4065a.getClass();
        super.setCurrentItem(i + 1, z8);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        addOnPageChangeListener(onPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        if (getCurrentItem() != i) {
            setCurrentItem(i, true);
        }
    }

    public LoopViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4066b = false;
        C3219c c3219c = new C3219c(this);
        super.removeOnPageChangeListener(c3219c);
        super.addOnPageChangeListener(c3219c);
    }
}
